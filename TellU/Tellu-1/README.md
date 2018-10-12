A first test of the new Botsing on TelluCloud. To start simple, a null-pointer has been introduced on purpose, and we want to check if Botsing can recreate the stack trace.

System under test: FilterStore micro-service - filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar
Log: filterstore_test_01.txt
Frame level: 3

Result: Stops with exception after a short time.

15:22:41.041 [main] ERROR o.e.t.execution.TestCaseExecutor - ExecutionException (this is likely a serious error in the framework)
java.util.concurrent.ExecutionException: org.evosuite.testcase.execution.EvosuiteError: java.lang.ExceptionInInitializerError
	at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_172]
	at java.util.concurrent.FutureTask.get(FutureTask.java:206) ~[na:1.8.0_172]
	at org.evosuite.testcase.execution.TimeoutHandler.executeWithTimeout(TimeoutHandler.java:107) ~[evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TimeoutHandler.execute(TimeoutHandler.java:96) ~[evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:334) [evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:277) [evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:264) [evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TestCaseExecutor.runTest(TestCaseExecutor.java:140) [evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.TestFitnessFunction.runTest(TestFitnessFunction.java:91) [evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.TestFitnessFunction.getFitness(TestFitnessFunction.java:60) [evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.TestFitnessFunction.getFitness(TestFitnessFunction.java:34) [evosuite-client-1.0.6.jar:na]
	at eu.stamp.botsing.ga.strategy.SingleObjectiveGGA.calculateFitnessOfPopulation(SingleObjectiveGGA.java:257) [classes/:na]
	at eu.stamp.botsing.ga.strategy.SingleObjectiveGGA.initializePopulation(SingleObjectiveGGA.java:229) [classes/:na]
	at eu.stamp.botsing.ga.strategy.SingleObjectiveGGA.generateSolution(SingleObjectiveGGA.java:61) [classes/:na]
	at eu.stamp.botsing.testgeneration.strategy.BotsingIndividualStrategy.generateTests(BotsingIndividualStrategy.java:74) [classes/:na]
	at eu.stamp.botsing.reproduction.CrashReproduction.generateCrashReproductionTests(CrashReproduction.java:124) [classes/:na]
	at eu.stamp.botsing.reproduction.CrashReproduction.execute(CrashReproduction.java:78) [classes/:na]
	at eu.stamp.botsing.Botsing.parseCommandLine(Botsing.java:96) [classes/:na]
	at eu.stamp.botsing.SimpleCrashReproductionTest.runtest(SimpleCrashReproductionTest.java:59) [bin/:na]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.8.0_172]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62) ~[na:1.8.0_172]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.8.0_172]
	at java.lang.reflect.Method.invoke(Method.java:498) ~[na:1.8.0_172]
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50) [junit-4.12.jar:4.12]
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12) [junit-4.12.jar:4.12]
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47) [junit-4.12.jar:4.12]
	at org.junit.internal.runners.statements.InvokeMethod.evaluate(InvokeMethod.java:17) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner.runLeaf(ParentRunner.java:325) [junit-4.12.jar:4.12]
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:78) [junit-4.12.jar:4.12]
	at org.junit.runners.BlockJUnit4ClassRunner.runChild(BlockJUnit4ClassRunner.java:57) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner$3.run(ParentRunner.java:290) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:71) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner.runChildren(ParentRunner.java:288) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner.access$000(ParentRunner.java:58) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:268) [junit-4.12.jar:4.12]
	at org.junit.runners.ParentRunner.run(ParentRunner.java:363) [junit-4.12.jar:4.12]
	at org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86) [.cp/:na]
	at org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38) [.cp/:na]
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:538) [.cp/:na]
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:760) [.cp/:na]
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:460) [.cp/:na]
	at org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:206) [.cp/:na]
Caused by: org.evosuite.testcase.execution.EvosuiteError: java.lang.ExceptionInInitializerError
	at org.evosuite.testcase.statements.FunctionalMockStatement$1.execute(FunctionalMockStatement.java:744) ~[evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169) ~[evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.statements.FunctionalMockStatement.execute(FunctionalMockStatement.java:596) ~[evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307) ~[evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213) ~[evosuite-client-1.0.6.jar:na]
	at org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55) ~[evosuite-client-1.0.6.jar:na]
	at java.util.concurrent.FutureTask.run(FutureTask.java:266) ~[na:1.8.0_172]
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) ~[na:1.8.0_172]
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) ~[na:1.8.0_172]
	at java.lang.Thread.run(Thread.java:748) ~[na:1.8.0_172]
Caused by: java.lang.ExceptionInInitializerError: null
	at sun.reflect.GeneratedSerializationConstructorAccessor2.newInstance(Unknown Source) ~[na:na]
	at java.lang.reflect.Constructor.newInstance(Constructor.java:423) ~[na:1.8.0_172]
	at org.objenesis.instantiator.sun.SunReflectionFactoryInstantiator.newInstance(SunReflectionFactoryInstantiator.java:48) ~[objenesis-2.6.jar:2.6]
	at org.objenesis.ObjenesisBase.newInstance(ObjenesisBase.java:73) ~[objenesis-2.6.jar:2.6]
	at org.mockito.internal.creation.instance.ObjenesisInstantiator.newInstance(ObjenesisInstantiator.java:19) ~[mockito-core-2.16.0.jar:na]
	at org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker.createMock(SubclassByteBuddyMockMaker.java:47) ~[mockito-core-2.16.0.jar:na]
	at org.mockito.internal.creation.bytebuddy.ByteBuddyMockMaker.createMock(ByteBuddyMockMaker.java:25) ~[mockito-core-2.16.0.jar:na]
	at org.mockito.internal.util.MockUtil.createMock(MockUtil.java:35) ~[mockito-core-2.16.0.jar:na]
	at org.mockito.internal.MockitoCore.mock(MockitoCore.java:65) ~[mockito-core-2.16.0.jar:na]
	at org.mockito.Mockito.mock(Mockito.java:1864) ~[mockito-core-2.16.0.jar:na]
	at org.evosuite.testcase.statements.FunctionalMockStatement$1.execute(FunctionalMockStatement.java:611) ~[evosuite-client-1.0.6.jar:na]
	... 9 common frames omitted
Caused by: java.lang.RuntimeException: java.util.concurrent.ExecutionException: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
	at io.github.lukehutch.fastclasspathscanner.FastClasspathScanner.scan(FastClasspathScanner.java:1482) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at io.github.lukehutch.fastclasspathscanner.FastClasspathScanner.scan(FastClasspathScanner.java:1513) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at io.github.lukehutch.fastclasspathscanner.FastClasspathScanner.scan(FastClasspathScanner.java:1536) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at no.tellu.cloud.protocol.ProtocolMessage.<clinit>(ProtocolMessage.java) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	... 20 common frames omitted
Caused by: java.util.concurrent.ExecutionException: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
	at java.util.concurrent.FutureTask.report(FutureTask.java:122) ~[na:1.8.0_172]
	at java.util.concurrent.FutureTask.get(FutureTask.java:192) ~[na:1.8.0_172]
	at io.github.lukehutch.fastclasspathscanner.utils.WorkQueue.close(WorkQueue.java:236) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at io.github.lukehutch.fastclasspathscanner.utils.WorkQueue.runWorkQueue(WorkQueue.java:109) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at io.github.lukehutch.fastclasspathscanner.scanner.Scanner.call(Scanner.java:224) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at io.github.lukehutch.fastclasspathscanner.scanner.Scanner.call(Scanner.java:57) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	... 4 common frames omitted
Caused by: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
	at org.evosuite.runtime.LoopCounter.checkLoop(LoopCounter.java:116) ~[evosuite-runtime-1.0.6.jar:na]
	at io.github.lukehutch.fastclasspathscanner.utils.WorkQueue.runWorkLoop(WorkQueue.java:169) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at io.github.lukehutch.fastclasspathscanner.utils.WorkQueue$1.call(WorkQueue.java:147) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	at io.github.lukehutch.fastclasspathscanner.utils.WorkQueue$1.call(WorkQueue.java:144) ~[filterstore-3.2-SNAPSHOT-jar-with-dependencies.jar:na]
	... 4 common frames omitted
15:22:41.044 [main] DEBUG o.e.t.execution.ExecutionTrace - At the end, we have 1 calls left on stack