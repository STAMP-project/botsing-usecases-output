### Evocrash version 1.0.0-SNAPSHOT

### Results

Evocrash was unable to generate a test from the following log.

### Tested log
```
java.lang.NullPointerException
    at org.ow2.proactive.scheduler.core.LiveJobs.createAndFillTerminationData(LiveJobs.java:678)
    at org.ow2.proactive.scheduler.core.LiveJobs.taskTerminatedWithResult(LiveJobs.java:577)
    at org.ow2.proactive.scheduler.core.SchedulingService$16.run(SchedulingService.java:806)
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511)
    at java.util.concurrent.FutureTask.run(FutureTask.java:266)
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
    at java.lang.Thread.run(Thread.java:748)
```



### First try exception

```
[MASTER] 18:26:27.145 [logback-2] ERROR FunctionalMockStatement - Failed to use Mockito on class org.hibernate.boot.model.relational.Namespace: null
[MASTER] 18:26:27.147 [logback-2] ERROR TestCaseExecutor - ExecutionException (this is likely a serious error in the framework)
java.util.concurrent.ExecutionException: org.evosuite.testcase.execution.EvosuiteError: java.lang.ExceptionInInitializerError
    at java.util.concurrent.FutureTask.report(FutureTask.java:122) [na:1.8.0_191]
    at java.util.concurrent.FutureTask.get(FutureTask.java:206) [na:1.8.0_191]
    at org.evosuite.testcase.execution.TimeoutHandler.executeWithTimeout(TimeoutHandler.java:107) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TimeoutHandler.execute(TimeoutHandler.java:96) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:334) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:277) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.execute(TestCaseExecutor.java:264) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestCaseExecutor.runTest(TestCaseExecutor.java:140) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.TestFitnessFunction.runTest(TestFitnessFunction.java:91) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.TestFitnessFunction.getFitness(TestFitnessFunction.java:60) [evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.TestFitnessFunction.getFitness(TestFitnessFunction.java:34) [evocrash-1.0.0.jar:na]
    at org.crash.client.ga.metaheuristics.GuidedGA.evolve(GuidedGA.java:235) [evocrash-1.0.0.jar:na]
    at org.crash.client.ga.metaheuristics.GuidedGA.generateSolution(GuidedGA.java:88) [evocrash-1.0.0.jar:na]
    at org.crash.client.strategy.IndividualTestStrategy.generateTests(IndividualTestStrategy.java:175) [evocrash-1.0.0.jar:na]
    at org.crash.client.TestSuiteGenerator.generateTests(TestSuiteGenerator.java:659) [evocrash-1.0.0.jar:na]
    at org.crash.client.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:242) [evocrash-1.0.0.jar:na]
    at org.crash.client.rmi.service.ClientNodeImpl$1.run(ClientNodeImpl.java:152) [evocrash-1.0.0.jar:na]
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_191]
    at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_191]
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_191]
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_191]
    at java.lang.Thread.run(Thread.java:748) [na:1.8.0_191]
Caused by: org.evosuite.testcase.execution.EvosuiteError: java.lang.ExceptionInInitializerError
    at org.evosuite.testcase.statements.FunctionalMockStatement$1.execute(FunctionalMockStatement.java:732) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:169) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.statements.FunctionalMockStatement.execute(FunctionalMockStatement.java:591) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:307) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:213) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:55) ~[evocrash-1.0.0.jar:na]
    ... 4 common frames omitted
Caused by: java.lang.ExceptionInInitializerError: null
    at sun.reflect.GeneratedSerializationConstructorAccessor5585.newInstance(Unknown Source) ~[na:na]
    at java.lang.reflect.Constructor.newInstance(Constructor.java:423) ~[na:1.8.0_191]
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
[MASTER] 18:26:27.149 [logback-1] WARN  TimeController - Phase INITIALIZATION lasted too long, 104 seconds more than allowed.
    at org.apache.log4j.Logger.getLogger(Logger.java:104) ~[log4j-1.2.17.jar:na]
    at org.jboss.logging.Log4jLogger.<init>(Log4jLogger.java:31) ~[evocrash-1.0.0.jar:na]
    at org.jboss.logging.Log4jLoggerProvider.getLogger(Log4jLoggerProvider.java:30) ~[evocrash-1.0.0.jar:na]
    at org.jboss.logging.Logger.getLogger(Logger.java:2465) ~[evocrash-1.0.0.jar:na]
    at org.jboss.logging.Logger$1.run(Logger.java:2565) ~[evocrash-1.0.0.jar:na]
    at java.security.AccessController.doPrivileged(Native Method) ~[na:1.8.0_191]
    at org.jboss.logging.Logger.getMessageLogger(Logger.java:2529) ~[evocrash-1.0.0.jar:na]
    at org.jboss.logging.Logger.getMessageLogger(Logger.java:2516) ~[evocrash-1.0.0.jar:na]
    at org.hibernate.internal.CoreLogging.messageLogger(CoreLogging.java:28) ~[evocrash-1.0.0.jar:na]
    at org.hibernate.internal.CoreLogging.messageLogger(CoreLogging.java:24) ~[evocrash-1.0.0.jar:na]
    at org.hibernate.boot.model.relational.Namespace.<clinit>(Namespace.java:27) ~[evocrash-1.0.0.jar:na]
    ... 22 common frames omitted
* Computation finished

BUILD SUCCESSFUL

Total time: 4 mins 5.299 secs
```

### Second try exception 

```
[MASTER] 18:28:48.965 [logback-1] WARN  MethodCallReplacementClassAdapter - Failed to add serialId to class org/dom4j/DocumentFactory: org/jaxen/VariableContext
[MASTER] 18:28:48.989 [logback-1] WARN  MethodCallReplacementClassAdapter - Failed to add serialId to class org/dom4j/dom/DOMDocumentFactory: org/jaxen/VariableContext
[MASTER] 18:28:49.434 [logback-2] ERROR ConcreteClassAnalyzer - Problem for org.ow2.proactive.scheduler.core.SchedulingService. Class not found: com.zaxxer.hikari.HikariDataSource
java.lang.ClassNotFoundException: com/zaxxer/hikari/HikariConfig
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:201) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.instrumentation.InstrumentingClassLoader.loadClass(InstrumentingClassLoader.java:168) ~[evocrash-1.0.0.jar:na]
    at java.lang.Class.forName0(Native Method) ~[na:1.8.0_191]
    at java.lang.Class.forName(Class.java:348) ~[na:1.8.0_191]
    at org.evosuite.setup.ConcreteClassAnalyzer.getConcreteClassesImpl(ConcreteClassAnalyzer.java:126) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.ConcreteClassAnalyzer.getConcreteClasses(ConcreteClassAnalyzer.java:61) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.addDependency(TestClusterGenerator.java:876) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.addDependencies(TestClusterGenerator.java:787) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.addDependencyClass(TestClusterGenerator.java:983) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.resolveDependencies(TestClusterGenerator.java:358) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.generateCluster(TestClusterGenerator.java:137) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.DependencyAnalysis.analyze(DependencyAnalysis.java:117) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.DependencyAnalysis.analyzeClass(DependencyAnalysis.java:131) [evocrash-1.0.0.jar:na]
    at org.crash.client.TestSuiteGenerator.initializeTargetClass(TestSuiteGenerator.java:116) [evocrash-1.0.0.jar:na]
    at org.crash.client.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:136) [evocrash-1.0.0.jar:na]
    at org.crash.client.rmi.service.ClientNodeImpl$1.run(ClientNodeImpl.java:152) [evocrash-1.0.0.jar:na]
    at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_191]
    at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_191]
    at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_191]
    at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_191]
    at java.lang.Thread.run(Thread.java:748) [na:1.8.0_191]
Caused by: java.lang.NoClassDefFoundError: com/zaxxer/hikari/HikariConfig
    at java.lang.ClassLoader.defineClass1(Native Method) ~[na:1.8.0_191]
    at java.lang.ClassLoader.defineClass(ClassLoader.java:763) ~[na:1.8.0_191]
    at java.lang.ClassLoader.defineClass(ClassLoader.java:642) ~[na:1.8.0_191]
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:194) ~[evocrash-1.0.0.jar:na]
    ... 20 common frames omitted
Caused by: java.lang.ClassNotFoundException: com/zaxxer/hikari/AbstractHikariConfig
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:201) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.instrumentation.InstrumentingClassLoader.loadClass(InstrumentingClassLoader.java:168) ~[evocrash-1.0.0.jar:na]
    ... 24 common frames omitted
Caused by: java.lang.NoClassDefFoundError: com/zaxxer/hikari/AbstractHikariConfig
    at java.lang.ClassLoader.defineClass1(Native Method) ~[na:1.8.0_191]
    at java.lang.ClassLoader.defineClass(ClassLoader.java:763) ~[na:1.8.0_191]
    at java.lang.ClassLoader.defineClass(ClassLoader.java:642) ~[na:1.8.0_191]
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:194) ~[evocrash-1.0.0.jar:na]
    ... 25 common frames omitted
Caused by: java.lang.ClassNotFoundException: Class not found: com/codahale/metrics/MetricRegistry: java.lang.NullPointerException: Class not found com/codahale/metrics/MetricRegistry
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:201) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.instrumentation.InstrumentingClassLoader.loadClass(InstrumentingClassLoader.java:168) ~[evocrash-1.0.0.jar:na]
    ... 29 common frames omitted
Caused by: java.lang.RuntimeException: Class not found: com/codahale/metrics/MetricRegistry: java.lang.NullPointerException: Class not found com/codahale/metrics/MetricRegistry
    at org.evosuite.runtime.util.ComputeClassWriter.getCommonSuperClass(ComputeClassWriter.java:52) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.ClassWriter.a(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.Frame.a(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.Frame.a(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.MethodWriter.visitMaxs(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.MethodVisitor.visitMaxs(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.MethodVisitor.visitMaxs(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.runtime.instrumentation.LoopCounterMethodAdapter.visitMaxs(LoopCounterMethodAdapter.java:48) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.tree.MethodNode.accept(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.commons.JSRInlinerAdapter.visitEnd(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.MethodVisitor.visitEnd(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.MethodVisitor.visitEnd(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.MethodVisitor.visitEnd(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.ClassReader.b(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.ClassReader.accept(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.shaded.org.objectweb.asm.ClassReader.accept(Unknown Source) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.instrumentation.BytecodeInstrumentation.transformBytes(BytecodeInstrumentation.java:282) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.instrumentation.InstrumentingClassLoader.getTransformedBytes(InstrumentingClassLoader.java:175) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:192) ~[evocrash-1.0.0.jar:na]
    ... 30 common frames omitted
Caused by: java.lang.NullPointerException: Class not found com/codahale/metrics/MetricRegistry
    at org.evosuite.runtime.util.ComputeClassWriter.typeInfo(ComputeClassWriter.java:186) ~[evocrash-1.0.0.jar:na]
    at org.evosuite.runtime.util.ComputeClassWriter.getCommonSuperClass(ComputeClassWriter.java:49) ~[evocrash-1.0.0.jar:na]
    ... 48 common frames omitted
[MASTER] 18:28:49.434 [logback-2] ERROR ConcreteClassAnalyzer - Removing class from inheritance tree
* Finished analyzing classpath
* Generating tests for class org.ow2.proactive.scheduler.core.SchedulingService
* Test criterion:
- Crash Coverage
* Setting up search algorithm for individual test generation
* Target exception was set to: java.lang.NullPointerException
* Computation finished
```
