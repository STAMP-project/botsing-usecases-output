### Exception: SpaceNotFoundException

### Configuration: frame.level=1

### Exception


```
Best individual has fitness: 0.0
Worst individual has fitness: 5.9743589743589745


* EvoCrash: the generated stack trace:

org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl.ensureVirtualSpaceIsMounted(VFSSpacesMountManagerImpl.java:247)
org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl.resolveFile(VFSSpacesMountManagerImpl.java:159)
sun.reflect.GeneratedMethodAccessor9.invoke(Unknown Source)
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
SpacesDirectory spacesDirectory0 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl0 = new VFSSpacesMountManagerImpl(spacesDirectory0);
SpacesDirectory spacesDirectory1 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
doReturn((Set) null).when(spacesDirectory1).lookupMany(any(org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI.class));
doReturn((SpaceInstanceInfo) null).when(spacesDirectory1).lookupOne(any(org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI.class));
VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl1 = new VFSSpacesMountManagerImpl(spacesDirectory1);
vFSSpacesMountManagerImpl0.close();
DataSpacesURI dataSpacesURI0 = null;
String string0 = "don't know how to ";
vFSSpacesMountManagerImpl1.resolveSpaces(dataSpacesURI0, string0);
SpacesDirectory spacesDirectory2 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
doReturn((Set) null).when(spacesDirectory2).lookupMany(any(org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI.class));
VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl2 = new VFSSpacesMountManagerImpl(spacesDirectory2);
vFSSpacesMountManagerImpl2.resolveSpaces(dataSpacesURI0, string0);
SpacesDirectory spacesDirectory3 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
String string1 = "";
String string2 = "U";
String string3 = "k";
DataSpacesURI dataSpacesURI1 = DataSpacesURI.createScratchSpaceURI(string0, string2, string3, string0);
String string4 = "c@h?'R_9-(_R`";
String string5 = "6|lMh>r6ELcZ*";
vFSSpacesMountManagerImpl1.resolveFile(dataSpacesURI1, string4, string5);
String string6 = "}A4GPW?wFt";
String string7 = null;
vFSSpacesMountManagerImpl2.resolveFile(dataSpacesURI0, string7);

>>>>>>>>>>>>>>>>>>>>>>>>>>>GGA was done in 6!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
CrashCoverageSuiteFitness: Suite Fitness is:  >>>> 0.0
lineFitness: 0.0
currentFitness: 0.0


* Remaining budget: 591
* Search finished after 10s, 9 statements, best individual has fitness 0.0
* Covered 1/1 goals
* Target exception was set to: org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException
* EvoCrash: The target call 'ensureVirtualSpaceIsMounted(Lorg/objectweb/proactive/extensions/dataspaces/core/DataSpacesURI;Lorg/objectweb/proactive/extensions/dataspaces/core/SpaceInstanceInfo;)V' is private!
* EvoCrash: Looking for public callers
* EvoCrash: The target call is made to a protected method!
               [...]
* EvoCrash: The target call is made to a protected method!
CrashCoverageTestFitness: public calls size after search: 2
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> resolveSpaces
>>>>>> resolveFile
* Target exception was set to: org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException
* EvoCrash: The target call 'ensureVirtualSpaceIsMounted(Lorg/objectweb/proactive/extensions/dataspaces/core/DataSpacesURI;Lorg/objectweb/proactive/extensions/dataspaces/core/SpaceInstanceInfo;)V' is private!
* EvoCrash: Looking for public callers
* EvoCrash: The target call is made to a protected method!
  	    	[...]
* EvoCrash: The target call is made to a protected method!
CrashCoverageTestFitness: public calls size after search: 2
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> resolveSpaces
>>>>>> resolveFile
* Minimizing test suite
lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.9914529914529915
currentFitness: 5.9743589743589745

lineFitness: 0.0
currentFitness: 0.0

* Going to analyze the coverage criteria
* Coverage analysis for criterion CRASH
* Target exception was set to: org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException
* EvoCrash: The target call 'ensureVirtualSpaceIsMounted(Lorg/objectweb/proactive/extensions/dataspaces/core/DataSpacesURI;Lorg/objectweb/proactive/extensions/dataspaces/core/SpaceInstanceInfo;)V' is private!
* EvoCrash: Looking for public callers
* EvoCrash: The target call is made to a protected method!
  	    	[...]
* EvoCrash: The target call is made to a protected method!
CrashCoverageTestFitness: public calls size after search: 2
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> resolveSpaces
>>>>>> resolveFile
* Coverage of criterion CRASH: 100 %
* Total number of goals: 1
* Number of covered goals: 1
* Generated 1 tests with total length 4
* Resulting test suite's coverage: 100 %
* Generating assertions
* Resulting test suite's mutation score: 0 %
* Compiling and checking tests
[MASTER] 16:23:10.778 [logback-1] WARN  AgentLoader - Failed to find EvoSuite jar in current classloader. URLs of classloader:
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunjce_provider.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunec.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/localedata.jar
file:/tmp/EvoSuite_pathingJar7620835303548907209.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/nashorn.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunpkcs11.jar
file:/usr/lib/jvm/java-8-oracle/jre/../lib/tools.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/cldrdata.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jfxrt.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/zipfs.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jaccess.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/dnsns.jar
[MASTER] 16:23:10.791 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: Cannot find either the compilation target folder nor the EvoSuite jar in classpath: /tmp/EvoSuite_pathingJar7620835303548907209.jar
[MASTER] 16:23:11.093 [logback-1] WARN  AgentLoader - Failed to find EvoSuite jar in current classloader. URLs of classloader:
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunjce_provider.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunec.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/localedata.jar
file:/tmp/EvoSuite_pathingJar7620835303548907209.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/nashorn.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunpkcs11.jar
file:/usr/lib/jvm/java-8-oracle/jre/../lib/tools.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/cldrdata.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jfxrt.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/zipfs.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jaccess.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/dnsns.jar
[MASTER] 16:23:11.093 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: Cannot find either the compilation target folder nor the EvoSuite jar in classpath: /tmp/EvoSuite_pathingJar7620835303548907209.jar
* Permissions denied during test execution:
  - java.net.SocketPermission:
           listen,resolve localhost:0: 1
	   * Writing JUnit test case 'VFSSpacesMountManagerImpl_ESTest' to src/GGA-tests/java
	   * Done!

* Computation finished
```

### First generated test

```java
package org.objectweb.proactive.extensions.dataspaces.vfs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.MockitoExtension.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI;
import org.objectweb.proactive.extensions.dataspaces.core.SpaceInstanceInfo;
import org.objectweb.proactive.extensions.dataspaces.core.naming.SpacesDirectory;
import org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException;
import org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true)
public class VFSSpacesMountManagerImpl_ESTest extends VFSSpacesMountManagerImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
          SpacesDirectory spacesDirectory0 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
	  doReturn((SpaceInstanceInfo) null).when(spacesDirectory0).lookupOne(any(org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI.class));
	  VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl0 = new VFSSpacesMountManagerImpl(spacesDirectory0);
	  DataSpacesURI dataSpacesURI0 = DataSpacesURI.createScratchSpaceURI("don't know how to ", "U", "k", "don't know how to ");
	  try {
         	  vFSSpacesMountManagerImpl0.resolveFile(dataSpacesURI0, "c@h?'R_9-(_R`", "6|lMh>r6ELcZ*");
		  fail("Expecting exception: SpaceNotFoundException");

 	  } catch(SpaceNotFoundException e) {
	  // Requested data space is not registered in spaces directory.
          verifyException("org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl", e);
          }
   }
}
```

### Second generated test

```java
level=1

@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true)
public class VFSSpacesMountManagerImpl_ESTest extends VFSSpacesMountManagerImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpacesDirectory spacesDirectory0 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
      doReturn((SpaceInstanceInfo) null).when(spacesDirectory0).lookupOne(any(org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI.class));
      VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl0 = new VFSSpacesMountManagerImpl(spacesDirectory0);
      SpaceType spaceType0 = SpaceType.INPUT;
      DataSpacesURI dataSpacesURI0 = DataSpacesURI.createInOutSpaceURI("{", spaceType0, ",7,Q{N7Mp'jfJ^@DY", "z,?MNfXe");
      try {
      	  vFSSpacesMountManagerImpl0.resolveFile(dataSpacesURI0, "AR]gqHaf)>RVT<A8", "i5D7f");
	  fail("Expecting exception: SpaceNotFoundException");

      } catch(SpaceNotFoundException e) {
            //
	    // Requested data space is not registered in spaces directory.
	    //
	    verifyException("org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl", e);
      }
  }
}
```