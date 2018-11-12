### Exception: SpaceNotFoundException

### Configuration: frame.level=3

### Generated test

```java
@RunWith(EvoRunner.class) @EvoRunnerParameters(useVFS = true, useJEE = true)
public class VFSSpacesMountManagerImpl_ESTest extends VFSSpacesMountManagerImpl_ESTest_scaffolding {

       @Test(timeout = 4000)
       public void test0()  throws Throwable  {
       	      SpacesDirectoryImpl spacesDirectoryImpl0 = new SpacesDirectoryImpl();
	      VFSSpacesMountManagerImpl vFSSpacesMountManagerImpl0 = new VFSSpacesMountManagerImpl(spacesDirectoryImpl0);
	      DataSpacesURI dataSpacesURI0 = DataSpacesURI.createScratchSpaceURI("Ofb?O!?u!5k4hbsJ", "proactive.net.secondaryNames", "proactive.net.secondaryNames", "(");
	      try {
	            vFSSpacesMountManagerImpl0.resolveFile(dataSpacesURI0, "(");
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