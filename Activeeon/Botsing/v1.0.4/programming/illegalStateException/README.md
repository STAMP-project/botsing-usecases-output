# Illegal State Exception test with Botsing

The log come from the following issue: https://github.com/ow2-proactive/programming/issues/1308.

## Log treatment before execution

The following lines were removed from the log file because the sixth line doesn't have the reference and it break Botsing execution.
```
at sun.reflect.GeneratedMethodAccessor14.invoke(Unknown Source)
at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
at java.lang.reflect.Method.invoke(Method.java:497)
at org.objectweb.proactive.core.mop.MethodCall.execute(MethodCall.java:353)
at org.objectweb.proactive.core.remoteobject.RemoteObjectImpl.receiveMessage(RemoteObjectImpl.java:92)
at org.objectweb.proactive.core.remoteobject.InternalRemoteRemoteObjectImpl.receiveMessage(InternalRemoteRemoteObjectImpl.java:134)
at org.objectweb.proactive.extensions.pnp.PNPROMessageRequest.processMessage(PNPROMessageRequest.java:102)
at org.objectweb.proactive.extensions.pnp.PNPServerHandler$RequestExecutor.run(PNPServerHandler.java:280)
at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
at java.lang.Thread.run(Thread.java:745)
```
Otherwise the following exception may appear and block the programm:
```
Exception in thread "main" java.lang.NullPointerException
	at eu.stamp.botsing.ga.strategy.operators.GuidedSearchUtility.getTargetInstruction(GuidedSearchUtility.java:195)
	at eu.stamp.botsing.ga.strategy.operators.GuidedSearchUtility.getPublicCalls(GuidedSearchUtility.java:77)
	at eu.stamp.botsing.ga.strategy.operators.GuidedSearchUtility.getPublicCalls(GuidedSearchUtility.java:116)
	at eu.stamp.botsing.fitnessfunction.testcase.factories.RootMethodTestChromosomeFactory.fillPublicCalls(RootMethodTestChromosomeFactory.java:197)
	at eu.stamp.botsing.fitnessfunction.testcase.factories.RootMethodTestChromosomeFactory.reset(RootMethodTestChromosomeFactory.java:191)
	at eu.stamp.botsing.fitnessfunction.testcase.factories.RootMethodTestChromosomeFactory.<init>(RootMethodTestChromosomeFactory.java:60)
	at eu.stamp.botsing.testgeneration.strategy.BotsingIndividualStrategy.getChromosomeFactory(BotsingIndividualStrategy.java:124)
	at eu.stamp.botsing.testgeneration.strategy.BotsingIndividualStrategy.getGA(BotsingIndividualStrategy.java:117)
	at eu.stamp.botsing.testgeneration.strategy.BotsingIndividualStrategy.generateTests(BotsingIndividualStrategy.java:69)
	at eu.stamp.botsing.reproduction.CrashReproduction.generateCrashReproductionTests(CrashReproduction.java:131)
	at eu.stamp.botsing.reproduction.CrashReproduction.execute(CrashReproduction.java:80)
	at eu.stamp.botsing.Botsing.parseCommandLine(Botsing.java:78)
	at eu.stamp.botsing.Botsing.main(Botsing.java:163)
```

## Execution result

The emtpy test [HalfBody_ESTest.java](generatedTest/org/objectweb/proactive/core/body/HalfBody_ESTest.java) was generated with frame level=4 and the emtpy test [FuturePool_ESTest.java](generatedTest/org/objectweb/proactive/core/body/future/FuturePool_ESTest.java) was generated with frame level=2
