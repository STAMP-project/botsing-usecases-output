### Evocrash version 1.0.0-SNAPSHOT

### Results

Evocrash generated the empty tests BodyImpl_ESTest.java and BodyImpl_ESTest_scaffolding.java.

### Tested log

```
org.objectweb.proactive.core.body.exceptions.BodyTerminatedReplyException: org.ow2.proactive.resourcemanager.nodesource.NodeSource : The body has been Terminated  while receiving reply to request nodeSourceUnregister
    at org.objectweb.proactive.core.body.AbstractBody.receiveReply(AbstractBody.java:233)
    at org.objectweb.proactive.core.body.reply.ReplyImpl.send(ReplyImpl.java:93)
    at org.objectweb.proactive.core.body.BodyImpl$ActiveLocalBodyStrategy.serveInternal(BodyImpl.java:638)
    at org.objectweb.proactive.core.body.BodyImpl$ActiveLocalBodyStrategy.serve(BodyImpl.java:486)
    at org.objectweb.proactive.core.body.AbstractBody.serve(AbstractBody.java:417)
    at org.objectweb.proactive.Service.serve(Service.java:119)
    at org.ow2.proactive.resourcemanager.core.RMCore.runActivity(RMCore.java:511)
    at org.objectweb.proactive.core.body.ActiveBody.run(ActiveBody.java:167)
    at java.lang.Thread.run(Thread.java:748)
```

### Exception

```
CrashCoverageTestFitness: public calls size after search: 2
>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
>>>>>> serveWithException
>>>>>> serve
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
	            writeFileDescriptor: 4
		    * Writing JUnit test case 'BodyImpl_ESTest' to src/GGA-tests/java
		    * Done!

* Computation finished
Exception in thread "main" java.lang.AssertionError: expected:<0.0> but was:<5.98804780876494>
        at org.junit.Assert.fail(Assert.java:88)
	at org.junit.Assert.failNotEquals(Assert.java:834)
	at org.junit.Assert.assertEquals(Assert.java:553)
	at org.junit.Assert.assertEquals(Assert.java:683)
	at eu.stamp_project.evocrash.demo.TestCreation.create(TestCreation.java:97)
	at eu.stamp_project.evocrash.demo.Application.main(Application.java:6)
```	
