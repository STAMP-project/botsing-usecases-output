### Exception: BodyTerminateRequestException

### Configuration: frame.level=1

### Exception

```
Best individual has fitness: 4.8
Worst individual has fitness: 5.961538461538462


* EvoCrash: the generated stack trace:


* EvoCrash: the generated test case:
ActiveBody activeBody0 = new ActiveBody();
ActiveBody activeBody1 = new ActiveBody();
ActiveBody activeBody2 = new ActiveBody();
ActiveBody activeBody3 = new ActiveBody();
EvoSuiteFile evoSuiteFile0 = null;
FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
FileSystemHandling fileSystemHandling1 = new FileSystemHandling();
ProActiveMetaObjectFactory.ThreadStoreFactoryImpl proActiveMetaObjectFactory_ThreadStoreFactoryImpl0 = new ProActiveMetaObjectFactory.ThreadStoreFactoryImpl();
BodyWrapper bodyWrapper0 = new BodyWrapper();
ThreadStoreImpl threadStoreImpl0 = (ThreadStoreImpl)proActiveMetaObjectFactory_ThreadStoreFactoryImpl0.newThreadStore();
String string0 = "Q|r@k' 4sIyZ}@sn:K";
activeBody2.nodeURL = string0;
activeBody2.threadStore = (ThreadStore) threadStoreImpl0;
FileSystemHandling.shouldThrowIOException(evoSuiteFile0);
UniqueID uniqueID0 = mock(UniqueID.class, new ViolatedAssumptionAnswer());
BlockingRequestQueueImpl blockingRequestQueueImpl0 = new BlockingRequestQueueImpl(uniqueID0);
blockingRequestQueueImpl0.removeOldest();
EvoSuiteFile evoSuiteFile1 = null;
NonFunctionalRequestsProcessor nonFunctionalRequestsProcessor0 = new NonFunctionalRequestsProcessor();
UniqueID uniqueID1 = null;
UniqueID uniqueID2 = bodyWrapper0.getID();
BlockingRequestQueueImpl blockingRequestQueueImpl1 = new BlockingRequestQueueImpl(uniqueID2);
long long0 = 1000L;
blockingRequestQueueImpl1.blockingRemoveYoungest(long0);
Request request0 = blockingRequestQueueImpl1.removeOldest();
activeBody2.receiveRequest(request0);
activeBody1.receiveRequest(request0);

>>>>>>>>>>>>>>>>>>>>>>>>>>>GGA was done in 601!<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

! Budget exceeded
! Unable to cover goal 0 org.crash.client.crashcoverage.CrashCoverageTestFitness@3072b33c
* Search finished after 604s, 604 statements, best individual has fitness 0.0
* Covered 0/1 goals
* Target exception was set to: org.objectweb.proactive.core.body.exceptions.BodyTerminatedRequestException
* EvoCrash: The target call is either public or protected!
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> receiveRequest
[MASTER] 14:48:42.896 [logback-1] WARN  TimeController - Phase INITIALIZATION lasted too long, 496 seconds more than allowed.
* Target exception was set to: org.objectweb.proactive.core.body.exceptions.BodyTerminatedRequestException
* EvoCrash: The target call is either public or protected!
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> receiveRequest
* Minimizing test suite
* Going to analyze the coverage criteria
* Coverage analysis for criterion CRASH
* Target exception was set to: org.objectweb.proactive.core.body.exceptions.BodyTerminatedRequestException
* EvoCrash: The target call is either public or protected!
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> receiveRequest
* Coverage of criterion CRASH: 0 %
* Total number of goals: 1
* Number of covered goals: 0
* Generated 0 tests with total length 0
* Resulting test suite's coverage: 0 %
* Generating assertions
* Resulting test suite's mutation score: 0 %
* Compiling and checking tests
* Permissions denied during test execution:
  - java.lang.RuntimePermission:
           loadLibrary.libsigar-amd64-linux.so: 1
	            writeFileDescriptor: 5
		    * Writing JUnit test case 'AbstractBody_ESTest' to src/GGA-tests/java
		    * Done!

* Computation finished
Exception in thread "main" java.lang.AssertionError: expected:<0.0> but was:<4.8>
        at org.junit.Assert.fail(Assert.java:88)
        at org.junit.Assert.failNotEquals(Assert.java:834)
        at org.junit.Assert.assertEquals(Assert.java:553)
        at org.junit.Assert.assertEquals(Assert.java:683)
        at eu.stamp_project.evocrash.demo.TestCreation.create(TestCreation.java:97)
        at eu.stamp_project.evocrash.demo.Application.main(Application.java:6)

```
