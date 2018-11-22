### Exception: ScriptException

### Configuration: frame.level=5

### Exception

```
[...]
* Finished analyzing classpath
* Generating tests for class org.ow2.proactive.scripting.Script
* Test criterion:
  - Crash Coverage
* Setting up search algorithm for individual test generation
* Target exception was set to: org.ow2.proactive.scripting.ScriptException
* EvoCrash: The target call is either public or protected!
  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> The retrived call(s) to inject in the tests are:
  >>>>>> setScript
* Total number of test goals:
    - Crash 1
* Total number of test goals: 1
* Budget: 600
MASTER] 15:28:48.872 [logback-2] ERROR TestCluster - Failed to check cache for java.util.AbstractMap<K, V>.SimpleEntry<K, V> : Type points to itself
[MASTER] 15:28:48.872 [logback-2] ERROR TestCluster - Failed to check cache for java.util.AbstractMap<K, V>.SimpleImmutableEntry<K, V> : Type points to itself
Guided initialization failed. Please revise the target class and method!
* Computation finished
```