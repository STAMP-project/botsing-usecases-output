### Exception: ScriptException

### Configuration: frame.level=2

### Exception

```
[MASTER] 15:19:37.364 [logback-2] ERROR ConcreteClassAnalyzer - Removing class from inheritance tree
[MASTER] 15:19:37.364 [logback-2] ERROR ConcreteClassAnalyzer - Problem for org.python.jsr223.PyScriptEngine. Class not found: xml.sax.handler$py
java.lang.ClassNotFoundException: Class 'xml/sax/handler$py.class' should be in target project, but could not be found!
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:201) ~[evocrash-1.0.0.jar:na]	
    at org.evosuite.instrumentation.InstrumentingClassLoader.loadClass(InstrumentingClassLoader.java:168) ~[evocrash-1.0.0.jar:na]	
    at java.lang.Class.forName0(Native Method) ~[na:1.8.0_171]
    at java.lang.Class.forName(Class.java:348) ~[na:1.8.0_171]
    at org.evosuite.setup.ConcreteClassAnalyzer.getConcreteClassesImpl(ConcreteClassAnalyzer.java:126) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.ConcreteClassAnalyzer.getConcreteClasses(ConcreteClassAnalyzer.java:61) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.addDependency(TestClusterGenerator.java:876) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.addDependencies(TestClusterGenerator.java:762) [evocrash-1.0.0.jar:na]
    at org.evosuite.setup.TestClusterGenerator.addDependencyClass(TestClusterGenerator.java:945) [evocrash-1.0.0.jar:na]
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
    Caused by: java.lang.ClassNotFoundException: Class 'xml/sax/handler$py.class' should be in target project, but could not be found!
    at org.evosuite.instrumentation.InstrumentingClassLoader.instrumentClass(InstrumentingClassLoader.java:188) ~[evocrash-1.0.0.jar:na]
    ... 20 common frames omitted

_______________
oolExecutor.runWorker(ThreadPoolExecutor.java:1149), java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624), java.lang.Thread.run(Thread.java:748)]
[MASTER] 15:19:38.080 [logback-2] ERROR TestClusterGenerator - Problem for org.python.jsr223.PyScriptEngine. Failed to add dependencies for class scala.tools.nsc.settings.MutableSettings: java.lang.StringIndexOutOfBoundsException: String index out of range: 47
[java.lang.String.charAt(String.java:658), org.evosuite.setup.TestClusterUtils.isAnonymousClass(TestClusterUtils.java:97), org.evosuite.setup.TestUsageChecker.canUse(TestUsageChecker.java:190), org.evosuite.setup.TestUsageChecker.canUse(TestUsageChecker.java:325), org.evosuite.setup.TestClusterGenerator.addDependencyClass(TestClusterGenerator.java:973), org.evosuite.setup.TestClusterGenerator.resolveDependencies(TestClusterGenerator.java:358), org.evosuite.setup.TestClusterGenerator.generateCluster(TestClusterGenerator.java:137), org.evosuite.setup.DependencyAnalysis.analyze(DependencyAnalysis.java:117), org.evosuite.setup.DependencyAnalysis.analyzeClass(DependencyAnalysis.java:131), org.crash.client.TestSuiteGenerator.initializeTargetClass(TestSuiteGenerator.java:116), org.crash.client.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:136), org.crash.client.rmi.service.ClientNodeImpl$1.run(ClientNodeImpl.java:152), java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511), java.util.concurrent.FutureTask.run(FutureTask.java:266), java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149), java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624), java.lang.Thread.run(Thread.java:748)]
[MASTER] 15:19:38.082 [logback-2] ERROR TestClusterGenerator - Problem for org.python.jsr223.PyScriptEngine. Failed to add dependencies for class scala.tools.nsc.interpreter.ILoop$ILoopInterpreter: java.lang.StringIndexOutOfBoundsException: String index out of range: 52
[java.lang.String.charAt(String.java:658), org.evosuite.setup.TestClusterUtils.isAnonymousClass(TestClusterUtils.java:97), org.evosuite.setup.TestUsageChecker.canUse(TestUsageChecker.java:190), org.evosuite.setup.TestUsageChecker.canUse(TestUsageChecker.java:325), org.evosuite.setup.TestClusterGenerator.addDependencyClass(TestClusterGenerator.java:973), org.evosuite.setup.TestClusterGenerator.resolveDependencies(TestClusterGenerator.java:358), org.evosuite.setup.TestClusterGenerator.generateCluster(TestClusterGenerator.java:137), org.evosuite.setup.DependencyAnalysis.analyze(DependencyAnalysis.java:117), org.evosuite.setup.DependencyAnalysis.analyzeClass(DependencyAnalysis.java:131), org.crash.client.TestSuiteGenerator.initializeTargetClass(TestSuiteGenerator.java:116), org.crash.client.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:136), org.crash.client.rmi.service.ClientNodeImpl$1.run(ClientNodeImpl.java:152), java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511), java.util.concurrent.FutureTask.run(FutureTask.java:266), java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149), java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624), java.lang.Thread.run(Thread.java:748)]
[MASTER] 15:19:38.970 [logback-2] ERROR TestClusterGenerator - Problem for org.python.jsr223.PyScriptEngine. Failed to add dependencies for class scala.tools.nsc.interpreter.ILoop: java.lang.StringIndexOutOfBoundsException: String index out of range: 46
[java.lang.String.charAt(String.java:658), org.evosuite.setup.TestClusterUtils.isAnonymousClass(TestClusterUtils.java:97), org.evosuite.setup.TestUsageChecker.canUse(TestUsageChecker.java:190), org.evosuite.setup.TestUsageChecker.canUse(TestUsageChecker.java:325), org.evosuite.setup.TestClusterGenerator.addDependencyClass(TestClusterGenerator.java:973), org.evosuite.setup.TestClusterGenerator.resolveDependencies(TestClusterGenerator.java:358), org.evosuite.setup.TestClusterGenerator.generateCluster(TestClusterGenerator.java:137), org.evosuite.setup.DependencyAnalysis.analyze(DependencyAnalysis.java:117), org.evosuite.setup.DependencyAnalysis.analyzeClass(DependencyAnalysis.java:131), org.crash.client.TestSuiteGenerator.initializeTargetClass(TestSuiteGenerator.java:116), org.crash.client.TestSuiteGenerator.generateTestSuite(TestSuiteGenerator.java:136), org.crash.client.rmi.service.ClientNodeImpl$1.run(ClientNodeImpl.java:152), java.util.concurrent.Executors$RunnableAdapter.call(Executors.java:511), java.util.concurrent.FutureTask.run(FutureTask.java:266), java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149), java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624), java.lang.Thread.run(Thread.java:748)]
* Finished analyzing classpath
* Generating tests for class org.python.jsr223.PyScriptEngine
* Test criterion:
  - Crash Coverage
  * Setting up search algorithm for individual test generation
  * Target exception was set to: org.ow2.proactive.scripting.ScriptException
  * EvoCrash: The target call 'eval(Lorg/python/core/PyCode;Ljavax/script/ScriptContext;)Ljava/lang/Object;' is private!
  * EvoCrash: Looking for public callers
  * EvoCrash: The target call is made to a protected method!
                      [...]
  * EvoCrash: The target call is made to a protected method!
  CrashCoverageTestFitness: public calls size after search: 1
  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
  >>>>>> eval
  * Total number of test goals:
    - Crash 1
    * Total number of test goals: 1
    * Budget: 600
    lineFitness: 0.5
    


end brutally without generating test: lineFitness: 0.5

currentFitness: 4.5

* Computation finished

BUILD SUCCESSFUL
```