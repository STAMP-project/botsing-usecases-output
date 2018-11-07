### Exception: BodyTerminateRequestException
						
### Configuration: frame.level=14

### Exception

```
[MASTER] 14:44:46.191 [logback-1] WARN  MethodCallReplacementClassAdapter - Failed to add serialId to class org/dom4j/DocumentFactory: org/jaxen/VariableContext
[MASTER] 14:44:46.210 [logback-1] WARN  MethodCallReplacementClassAdapter - Failed to add serialId to class org/dom4j/dom/DOMDocumentFactory: org/jaxen/VariableContext
[MASTER] 14:44:46.630 [logback-2] ERROR ConcreteClassAnalyzer - Problem for org.ow2.proactive.resourcemanager.frontend.RMMonitoringImpl. Class not found: com.zaxxer.hikari.HikariDataSource
java.lang.ClassNotFoundException: com/zaxxer/hikari/HikariConfig
     at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:201) ~[evocrash-1.0.0.jar:na]
     at org.evosuite.instrumentation.InstrumentingClassLoader.loadClass(InstrumentingClassLoader.java:168) ~[evocrash-1.0.0.jar:na]
     at java.lang.Class.forName0(Native Method) ~[na:1.8.0_171]
     at java.lang.Class.forName(Class.java:348) ~[na:1.8.0_171]
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
     at java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511) [na:1.8.0_171]
     at java.util.concurrent.FutureTask.run(FutureTask.java:266) [na:1.8.0_171]
     at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149) [na:1.8.0_171]
     at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624) [na:1.8.0_171]
     at java.lang.Thread.run(Thread.java:748) [na:1.8.0_171]
Caused by: java.lang.NoClassDefFoundError: com/zaxxer/hikari/HikariConfig
     at java.lang.ClassLoader.defineClass1(Native Method) ~[na:1.8.0_171]
     at java.lang.ClassLoader.defineClass(ClassLoader.java:763) ~[na:1.8.0_171]
     at java.lang.ClassLoader.defineClass(ClassLoader.java:642) ~[na:1.8.0_171]
     at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:194) ~[evocrash-1.0.0.jar:na]
     ... 20 common frames omitted
     Caused by: java.lang.ClassNotFoundException: com/zaxxer/hikari/AbstractHikariConfig
     at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:201) ~[evocrash-1.0.0.jar:na]
     at org.evosuite.instrumentation.InstrumentingClassLoader.loadClass(InstrumentingClassLoader.java:168) ~[evocrash-1.0.0.jar:na]
     ... 24 common frames omitted
Caused by: java.lang.NoClassDefFoundError: com/zaxxer/hikari/AbstractHikariConfig
     at java.lang.ClassLoader.defineClass1(Native Method) ~[na:1.8.0_171]
     at java.lang.ClassLoader.defineClass(ClassLoader.java:763) ~[na:1.8.0_171]
     at java.lang.ClassLoader.defineClass(ClassLoader.java:642) ~[na:1.8.0_171]
     at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:194) ~[evocrash-1.0.0.jar:na]
     ... 25 common frames omitted
Caused by: java.lang.ClassNotFoundException: Class not found: com/codahale/metrics/MetricRegistry: java.lang.NullPointerException: Class not found com/codahale/metrics/MetricRegistry
     at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:201) ~[evocrash-1.0.0.jar:na]
     at org.evosuite.instrumentation.InstrumentingClassLoader.loadClass(InstrumentingClassLoader.java:168) ~[evocrash-1.0.0.jar:na]
     ... 29 common frames omitted
Caused by: java.lang.RuntimeException: Class not found: com/codahale/metrics/MetricRegistry: java.lang.NullPointerException: Class not found com/codahale/metrics/MetricRegistry
     at org.evosuite.runtime.util.ComputeClassWriter.getCommonSuperClass(ComputeClassWriter.java:52) ~ [evocrash-1.0.0.jar:na]
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
[MASTER] 14:44:46.630 [logback-2] ERROR ConcreteClassAnalyzer - Removing class from inheritance tree
* Finished analyzing classpath
* Generating tests for class org.ow2.proactive.resourcemanager.frontend.RMMonitoringImpl
* Test criterion:
- Crash Coverage
* Setting up search algorithm for individual test generation
* Target exception was set to: org.objectweb.proactive.core.body.exceptions.BodyTerminatedRequestException
* LogParser: Failed to parse the log file!
* Computation finished
```																																																												  
