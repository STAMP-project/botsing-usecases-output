### Exception: ScriptException

### Configuration: frame.level=1

### Exception

```
* EvoCrash: the generated stack trace:

org.python.jsr223.PyScriptEngine.scriptException(PyScriptEngine.java:202)
org.python.jsr223.PyScriptEngine.eval(PyScriptEngine.java:42)
org.python.jsr223.PyScriptEngine.eval(PyScriptEngine.java:31)
javax.script.AbstractScriptEngine.eval(AbstractScriptEngine.java:264)
sun.reflect.GeneratedMethodAccessor33.invoke(Unknown Source)
sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
java.lang.reflect.Method.invoke(Method.java:498)
org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:257)
org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169)
org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:220)
org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307)
org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213)
org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55)
java.util.concurrent.FutureTask.run(FutureTask.java:266)
java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
java.lang.Thread.run(Thread.java:748)

* EvoCrash: the generated test case:
Class<BufferedInputStream> class0 = BufferedInputStream.class;
PipedReader pipedReader0 = new PipedReader();
PowerShellScriptEngineFactory powerShellScriptEngineFactory0 = new PowerShellScriptEngineFactory();
PyScriptEngine pyScriptEngine0 = new PyScriptEngine(powerShellScriptEngineFactory0);
String string0 = "<script>";
Object[] objectArray0 = new Object[7];
objectArray0[0] = (Object) pipedReader0;
objectArray0[1] = (Object) powerShellScriptEngineFactory0;
objectArray0[2] = (Object) class0;
SimpleScriptContext simpleScriptContext0 = new SimpleScriptContext();
String string1 = "mPq ";
Object object0 = new Object();
String string2 = "`J<Ouw1>ozgk$WG_";
String string3 = "msg";
pyScriptEngine0.eval(string3);
String string4 = " in sys.classLoader";
PyScriptEngine pyScriptEngine1 = new PyScriptEngine(powerShellScriptEngineFactory0);
String string5 = "@(:<Ae-PtHt\"b:=H";
String string6 = "";
pyScriptEngine0.invokeFunction(string6, objectArray0);
String string7 = "Q-f%.cf";
String string8 = "";
String string9 = "82#H';Ar\"AL/6sR&I";
StringReader stringReader0 = new StringReader(string7);
ScriptContext scriptContext0 = null;
pyScriptEngine0.eval((Reader) stringReader0, (ScriptContext) simpleScriptContext0);

>>>>>>>>>>>>>>>>>>>>>>>>>>>GGA was done in 607!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

! Budget exceeded
! Unable to cover goal 0 org.crash.client.crashcoverage.CrashCoverageTestFitness@2589e416
* Search finished after 610s, 610 statements, best individual has fitness 0.0
* Covered 0/1 goals
* Target exception was set to: org.ow2.proactive.scripting.ScriptException
* EvoCrash: The target call 'scriptException(Lorg/python/core/PyException;)Ljavax/script/ScriptException;' is private!
* EvoCrash: Looking for public callers
* EvoCrash: The target call is made to a protected method!
                  [line repeated a lot]
* EvoCrash: The target call is made to a protected method!
CrashCoverageTestFitness: public calls size after search: 4
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> eval
>>>>>> compile
>>>>>> invokeFunction
>>>>>> invokeMethod
[MASTER] 15:28:40.938 [logback-1] WARN  TimeController - Phase INITIALIZATION lasted too long, 515 seconds more than allowed.
* Target exception was set to: org.ow2.proactive.scripting.ScriptException
* EvoCrash: The target call 'scriptException(Lorg/python/core/PyException;)Ljavax/script/ScriptException;' is private!
* EvoCrash: Looking for public callers
* EvoCrash: The target call is made to a protected method!
                  [line repeated a lot]
* EvoCrash: The target call is made to a protected method!
CrashCoverageTestFitness: public calls size after search: 4
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> eval
>>>>>> compile
>>>>>> invokeFunction
>>>>>> invokeMethod
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion CRASH
* Target exception was set to: org.ow2.proactive.scripting.ScriptException
* EvoCrash: The target call 'scriptException(Lorg/python/core/PyException;)Ljavax/script/ScriptException;' is private!
* EvoCrash: Looking for public callers
* EvoCrash: The target call is made to a protected method!
                  [line repeated a lot]
* EvoCrash: The target call is made to a protected method!
CrashCoverageTestFitness: public calls size after search: 4
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> eval
>>>>>> compile
>>>>>> invokeFunction
>>>>>> invokeMethod
* Coverage of criterion CRASH: 0 %
* Total number of goals: 1
* Number of covered goals: 0
* Generated 0 tests with total length 0
* Resulting test suite's coverage: 0 %
* Generating assertions
* Resulting test suite's mutation score: 0 %
* Compiling and checking tests
* Permissions denied during test execution:
    - java.io.FilePermission:
         execute <<ALL FILES>>: 2
    - java.lang.RuntimePermission:
	 shutdownHooks: 2
writeFileDescriptor: 5
* Writing JUnit test case 'PyScriptEngine_ESTest' to src/GGA-tests/java
* Done!

* Computation finished
Exception in thread "main" java.lang.AssertionError: expected:<0.0> but was:<3.0>
    at org.junit.Assert.fail(Assert.java:88)
    at org.junit.Assert.failNotEquals(Assert.java:834)
    at org.junit.Assert.assertEquals(Assert.java:553)
    at org.junit.Assert.assertEquals(Assert.java:683)
    at eu.stamp_project.evocrash.demo.TestCreation.create(TestCreation.java:97)
    at eu.stamp_project.evocrash.demo.Application.main(Application.java:6)
```