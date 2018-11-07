### Exception: JsonParseException

### Configuration: frame.level=1

### Exception

```
[MASTER] 12:02:39.051 [logback-2] ERROR FunctionalMockStatement - Failed to use Mockito on class org.ow2.proactive.scripting.Script: null
[MASTER] 12:02:39.068 [logback-2] ERROR TestCaseExecutor - ExecutionException (this is likely a serious error in the framework)
java.util.concurrent.ExecutionException: org.evosuite.testcase.execution.EvosuiteError: java.lang.ExceptionInInitializerError
    at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_171]
    at java.util.concurrent.FutureTask.get(FutureTask.java:206) [na:1.8.0_171]
    at org.evosuite.testcase.execution.TimeoutHandler.executeWithTimeout(TimeoutHandler.java:107) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TimeoutHandler.execute(TimeoutHandler.java:96) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:334) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:277) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:264) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.runTest(TestCaseExecutor.java:140) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.TestFitnessFunction.runTest(TestFitnessFunction.java:91) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.TestFitnessFunction.getFitness(TestFitnessFunction.java:60) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.TestFitnessFunction.getFitness(TestFitnessFunction.java:34) [evocrash-1.0.0.jar:na]
    at org.crash.client.ga.metaheuristics.GuidedGA.evolve(GuidedGA.java:233) [evocrash-1.0.0.jar:na]
    at org.crash.client.ga.metaheuristics.GuidedGA.generateSolution(GuidedGA.java:88) [evocrash-1.0.0.jar:na]
    at org.crash.client.strategy.IndividualTestStrategy.generateTests(IndividualTestStrategy.java:175) [evocrash-1.0.0.jar:na]
    at org.crash.client.TestSuiteGenerator.generateTests(TestSuiteGenerator.java:659) [evocrash-1.0.0.jar:na]
    at org.crash.client.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:242) [evocrash-1.0.0.jar:na]
    at org.crash.client.rmi.service.ClientNodeImpl$1.run(ClientNodeImpl.java:152) [evocrash-1.0.0.jar:na]
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_171]
    at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_171]
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_171]
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_171]
    at java.lang.Thread.run(Thread.java:748) [na:1.8.0_171]
Caused by: org.evosuite.testcase.execution.EvosuiteError: java.lang.ExceptionInInitializerError
    at org.evosuite.testcase.statements.FunctionalMockStatement$1.execute(FunctionalMockStatement.java:732) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.statements.FunctionalMockStatement.execute(FunctionalMockStatement.java:591) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55) ~[evocrash-1.0.0.jar:na]
    ... 4 common frames omitted
Caused by: java.lang.ExceptionInInitializerError: null
    at sun.reflect.GeneratedSerializationConstructorAccessor857.newInstance(Unknown Source) ~[na:na]
    at java.lang.reflect.Constructor.newInstance(Constructor.java:423) ~[na:1.8.0_171]
    at org.evosuite.shaded.org.objenesis.instantiator.sun.SunReflectionFactoryInstantiator.newInstance(SunReflectionFactoryInstantiator.java:45) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objenesis.ObjenesisBase.newInstance(ObjenesisBase.java:73) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.internal.creation.instance.ObjenesisInstantiator.newInstance(ObjenesisInstantiator.java:14) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.internal.creation.cglib.ClassImposterizer.createProxy(ClassImposterizer.java:143) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.internal.creation.cglib.ClassImposterizer.imposterise(ClassImposterizer.java:58) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.internal.creation.cglib.ClassImposterizer.imposterise(ClassImposterizer.java:49) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.internal.creation.cglib.CglibMockMaker.createMock(CglibMockMaker.java:24) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.internal.util.MockUtil.createMock(MockUtil.java:33) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.internal.MockitoCore.mock(MockitoCore.java:59) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.mockito.Mockito.mock(Mockito.java:1284) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.statements.FunctionalMockStatement$1.execute(FunctionalMockStatement.java:606) ~[evocrash-1.0.0.jar:na]
    ... 9 common frames omitted
Caused by: java.lang.NullPointerException: null
    at org.apache.log4j.LogManager.getLogger(LogManager.java:228) ~[log4j-1.2.17.jar:na]
    at org.apache.log4j.Logger.getLogger(Logger.java:117) ~[log4j-1.2.17.jar:na]
    at org.ow2.proactive.scripting.Script.<clinit>(Script.java:78) ~[common-api-8.1.0.jar:8.1.0]
    ... 22 common frames omitted
* Computation finished
```