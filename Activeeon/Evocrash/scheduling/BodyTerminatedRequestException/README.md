
### Evocrash version 1.0.0-SNAPSHOT

### Results

For this log, we manage to generate the empty tests AbstractBody_ESTest.java 	and AbstractBody_ESTest_scaffolding.java.

### Configuration

```
criterion=CRASH
sandbox=TRUE
test.random=0
functional.mocking.p=0.8
functional.mocking.percent=0.5
minimize=TRUE
headless.chicken.test=FALSE
population=80
search.budget=600
condition.stopping=
timeout.global=3600
virtual.fs=TRUE
class.loader.separate=FALSE
calls.replace=FALSE
recursion.max=50
jar.tools.location=
fields.static.reset=FALSE
net.virtual=FALSE
exception.type=org.objectweb.proactive.core.body.exceptions.BodyTerminatedRequestException
```

The frame.level configuration was tested with several values.

### Tested log

```
org.objectweb.proactive.core.body.exceptions.BodyTerminatedRequestException: pamr://4096/Node1528612582/ActiveObject_org.ow2.proactive.resourcemanager.common.util.RMProxyUserInterface_-4f6731e0-163e393f94d--695c--b6fc7c8805968554--4f6731e0-163de6823a6--8000 : The body has been Terminated  while receiving request notify
	at org.objectweb.proactive.core.body.AbstractBody.receiveRequest(AbstractBody.java:218)
	at org.objectweb.proactive.core.body.request.RequestImpl.sendRequest(RequestImpl.java:229)
	at org.objectweb.proactive.core.body.request.RequestImpl.send(RequestImpl.java:140)
	at org.objectweb.proactive.core.body.HalfBody$HalfLocalBodyStrategy.sendRequest(HalfBody.java:230)
	at org.objectweb.proactive.core.body.AbstractBody.sendRequest(AbstractBody.java:436)
	at org.objectweb.proactive.core.body.proxy.UniversalBodyProxy.sendRequestInternal(UniversalBodyProxy.java:436)
	at org.objectweb.proactive.core.body.proxy.UniversalBodyProxy.sendRequest(UniversalBodyProxy.java:410)
	at org.objectweb.proactive.core.body.proxy.UniversalBodyProxy.sendRequest(UniversalBodyProxy.java:339)
	at org.objectweb.proactive.core.body.proxy.AbstractBodyProxy.reifyAsOneWay(AbstractBodyProxy.java:227)
	at org.objectweb.proactive.core.body.proxy.AbstractBodyProxy.invokeOnBody(AbstractBodyProxy.java:139)
	at org.objectweb.proactive.core.body.proxy.AbstractBodyProxy.reify(AbstractBodyProxy.java:113)
	at pa.stub.org.ow2.proactive.resourcemanager.common.util._StubRMProxyUserInterface.notify(_StubRMProxyUserInterface.java)
	at org.ow2.proactive.resourcemanager.frontend.RMMonitoringImpl$GroupEventDispatcher.deliverEvents(RMMonitoringImpl.java:314)
	at org.ow2.proactive.resourcemanager.frontend.RMMonitoringImpl$GroupEventDispatcher.run(RMMonitoringImpl.java:289)
	at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:748)
```
