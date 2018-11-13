### Evocrash version 1.0.0-SNAPSHOT

### Results

Evocrash was unable to generate a test from the following log.

### Tested log

```
com.fasterxml.jackson.core.JsonParseException
        at org.ow2.proactive.scheduler.task.executors.InProcessTaskExecutor.execute(InProcessTaskExecutor.java:225)
        at org.ow2.proactive.scheduler.task.executors.InProcessTaskExecutor.execute(InProcessTaskExecutor.java:158)
        at org.ow2.proactive.scheduler.task.executors.forked.env.ExecuteForkedTaskInsideNewJvm.fromForkedJVM(ExecuteForkedTaskInsideNewJvm.java:115)
        at org.ow2.proactive.scheduler.task.executors.forked.env.ExecuteForkedTaskInsideNewJvm.main(ExecuteForkedTaskInsideNewJvm.java:105)

```

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
exception.type=com.fasterxml.jackson.core.JsonParseException
```

The frame.level configuration was tested with several values.
