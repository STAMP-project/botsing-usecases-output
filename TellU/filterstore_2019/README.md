# Testing of Botsing crash reproduction on inserted exceptions

Testing on use case project FilterStore, which includes the code of the other two use case projects Core and TelluLib.
To test crash reproduction, we insert exceptions in the code of these three Maven projects, such that running of FilterStore with test input will cause a crash with unhandled Exception.

* Botsing: botsing-reproduction-1.0.7.jar, from releases on GitHub
* System: Windows 10

Maven projects:
* no.tellu.cloud.filterstore 4.3-SNAPSHOT from 21.08.2019
* Using no.tellu.cloud.core 3.12-SNAPSHOT
* Using no.tellu.lib.tellulib 3.0

We introduce one Exception, and collect the stack trace. We build FilterStore with the faulty code (mvn clean install -DskipTests=true), which creates a jar with all dependencies, and put it in folder cp. We run Botsing from the command line:

```
java -jar botsing-reproduction-1.0.7.jar -crash_log stacktrace01.log -project_cp ./cp -target_frame 2
```

We log the running time and whether a crash replication is found. Any crash replication code is saved as a test. We start with the lowest frame which seems meaningful, typically frame 2 or 3, and try higher frames if successful and time is reasonable. Once done with a stack trace, we revert the change in the code, and create a new Exception. We repeat this for a number of Exceptions, numbered from 01 and up, making sure to introduce expetions in different part of the code.

Results stored here:
* traces: The exception traces we try to reproduce.
* output: Log from Botsing execution (trunkated to last part if very long).
* tests: Code reproducing the stack traces, with one test class per trace we got code for.

## Test generation error
Botsing tries to compile the test it generates, but always fails this step. It is unable to find the JDK, even though JAVA_HOME and PATH are correctly specified. The test code is printed out shortly before this, so we copy it manually. However, this is only a set of statements, with no framing class or method, and no import statements. We use the code completion help in Eclipse to find import statements which makes the code run. Botsing error output below.

```
13:56:12.886 [main] INFO  e.s.b.reproduction.CrashReproduction - * Minimizing test suite
13:56:12.942 [main] INFO  e.s.b.reproduction.CrashReproduction - * Compiling and checking tests
13:56:12.954 [main] ERROR e.s.b.reproduction.CrashReproduction - No Java compiler is available. Make sure to run EvoSuite with the JDK and not the JRE.You can try to setup the JAVA_HOME system variable to point to it, as well as to make sure that the PATH variable points to the JDK before any JRE.
Exception in thread "main" java.lang.RuntimeException: No Java compiler is available. Make sure to run EvoSuite with the JDK and not the JRE.You can try to setup the JAVA_HOME system variable to point to it, as well as to make sure that the PATH variable points to the JDK before any JRE.
        at eu.stamp.botsing.reproduction.CrashReproduction.compileAndCheckTests(CrashReproduction.java:223)
        at eu.stamp.botsing.reproduction.CrashReproduction.postProcessTests(CrashReproduction.java:181)
        at eu.stamp.botsing.reproduction.CrashReproduction.generateCrashReproductionTests(CrashReproduction.java:125)
        at eu.stamp.botsing.reproduction.CrashReproduction.execute(CrashReproduction.java:72)
        at eu.stamp.botsing.Botsing.parseCommandLine(Botsing.java:91)
        at eu.stamp.botsing.Botsing.main(Botsing.java:213)
```

## Exception 01
no.tellu.lib.DataValueNode line 317. DataNotFoundException normally thrown by get-method on missing data, now always thrown.
* Frame 2: Recreated, 80 seconds. This one is easy, as any call to the second frame will cause a call to the first frame and throw the exception.
* Frame 3: Not recreated, 30 minutes. Depends on reading a valid configuration string to instatiate a class.

## Exception 02
no.tellu.lib.model.DataModel line 543. Removed a null-check.
* Frame 3: Recreated, 84 seconds.
* Frame 4: Botsing completed immediately, with code to reproduce the crash. However, the test code contains two errors preventing it from running (see Exception02Test.java, test02_f4). It calls Object.registerNatives(), which is private, and it instantiates the abstract class no.tellu.cloud.mediator.ServiceComponent. Running Botsing again produced another test with the same errors.

## Exception 03
no.tellu.lib.serialize.JsonSerializer line 400. Throw ParserEscape when creating value node from JSON, breaking our model parsing. This Exception should always be caught, but it will create other errors.
* Frame 2: Not recreated, 30 minutes. Depends on reading a valid configuration file.

## Exception 04
no.tellu.lib.util.ResourceFinder line 119: Dropped check for file.exists, always returning file.
Application still runs, but logs the exception.
* Frame 2: Not recreated. Logged timeout exceptions. Stopped after no new output for 15 minutes.
* Frame 3: Not recreated, 25 minutes. Ran slow and produced timeout exceptions. Eventually giving another exception and appeared inactive.

## Exception 05
no.tellu.lib.util.StateMachine line 86: Removed a null-check.
* Frame 3: Not recreated, 30 minutes.

## Exception 06
no.tellu.findit.cmd.hibernate.CommandHandlerImpl line 29: Return null for DAOFactory. Application runs, but logs a number of Exceptions. We select the first trace.
* Frame 2: Not recreated, 30 minutes.
* Frame 3: Not recreated, 30 minutes.

## Exception 07
java -jar botsing-reproduction-1.0.7.jar -crash_log stacktrace07.log -project_cp ./cp -target_frame 3

no.tellu.findit.domain.AssetImpl line 245: Return null


no.tellu.findit.services.AddressLookupService line 176: Throw NullPointerException

no.tellu.findit.util.ListToStringUtil line 62: Throw NullPointerException

no.tellu.cloud.filterstore.ObservationEncoder line 49: Remove null-check

no.tellu.cloud.filterstore.CircularPositionBuffer line 50: Error in Hibernate query string

no.tellu.cloud.filterstore.cmd.UpdateSensorPositionCmd line 475: Error in Hibernate query string
