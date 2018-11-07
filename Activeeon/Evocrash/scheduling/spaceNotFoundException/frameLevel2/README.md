### Exception: SpaceNotFoundException

### Configuration: frame.level=2

### Exception

```
lineFitness: 0.0
currentFitness: 0.0

* Going to analyze the coverage criteria
* Coverage analysis for criterion CRASH
* Target exception was set to: org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException
* EvoCrash: The target call is either public or protected!
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> resolveFile
* Coverage of criterion CRASH: 100 %
* Total number of goals: 1
* Number of covered goals: 1
* Generated 1 tests with total length 5
* Resulting test suite's coverage: 100 %
* Generating assertions
* Resulting test suite's mutation score: 0 %
* Compiling and checking tests
[MASTER] 16:36:21.245 [logback-1] WARN  AgentLoader - Failed to find EvoSuite jar in current classloader. URLs of classloader:
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunjce_provider.jar
file:/tmp/EvoSuite_pathingJar3629355921072499298.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunec.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/localedata.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/nashorn.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunpkcs11.jar
file:/usr/lib/jvm/java-8-oracle/jre/../lib/tools.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/cldrdata.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jfxrt.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/zipfs.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jaccess.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/dnsns.jar
[MASTER] 16:36:21.258 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: Cannot find either the compilation target folder nor the EvoSuite jar in classpath: /tmp/EvoSuite_pathingJar3629355921072499298.jar
[MASTER] 16:36:21.547 [logback-1] WARN  AgentLoader - Failed to find EvoSuite jar in current classloader. URLs of classloader:
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunjce_provider.jar
file:/tmp/EvoSuite_pathingJar3629355921072499298.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunec.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/localedata.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/nashorn.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/sunpkcs11.jar
file:/usr/lib/jvm/java-8-oracle/jre/../lib/tools.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/cldrdata.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jfxrt.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/zipfs.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/jaccess.jar
file:/usr/lib/jvm/java-8-oracle/jre/lib/ext/dnsns.jar
[MASTER] 16:36:21.548 [logback-1] WARN  JUnitAnalyzer - Found unstable test named initializationError -> class java.lang.RuntimeException: Cannot find either the compilation target folder nor the EvoSuite jar in classpath: /tmp/EvoSuite_pathingJar3629355921072499298.jar
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
import org.objectweb.proactive.extensions.dataspaces.core.SpaceType;
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
	SpaceType spaceType0 = SpaceType.OUTPUT;
	DataSpacesURI dataSpacesURI0 = DataSpacesURI.createInOutSpaceURI((String) null, spaceType0, "d`T+:");
	try {
	    vFSSpacesMountManagerImpl0.resolveFile(dataSpacesURI0, (String) null, (String) null);
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
### Second generated test

```java
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true)
public class VFSSpacesMountManagerImpl_ESTest extends VFSSpacesMountManagerImpl_ESTest_scaffolding {

       @Test(timeout = 4000)
       public void test0()  throws Throwable  {
              SpacesDirectory spacesDirectory0 = mock(SpacesDirectory.class, new ViolatedAssumptionAnswer());
	      doReturn((SpaceInstanceInfo) null).when(spacesDirectory0).lookupOne(any(org.objectweb.proactive.extensions.dataspaces.core.DataSpacesURI.class));
	      VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl0 = new VFSSpacesMountManagerImpl(spacesDirectory0);
	      SpaceType spaceType0 = SpaceType.INPUT;
	      DataSpacesURI dataSpacesURI0 = DataSpacesURI.createInOutSpaceURI("body, table {font-family: arial,sans-serif; font-size: x-small;}", spaceType0, "body, table {font-family: arial,sans-serif; font-size: x-small;}");
	      try {
	      	      vFSSpacesMountManagerImpl0.resolveFile(dataSpacesURI0, "child", "~iOp,`k_r");
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
