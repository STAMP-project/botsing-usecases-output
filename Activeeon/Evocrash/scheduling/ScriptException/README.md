### Evocrash version 1.0.0-SNAPSHOT

### Results

For this log file, we manage to generate empty tests PyScriptEngine_ESTest.java 	and PyScriptEngine_ESTest_scaffolding.java.

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
exception.type=org.ow2.proactive.scripting.ScriptException
```

The frame.level configuration was tested with several values.

### Tested log

```
org.ow2.proactive.scripting.ScriptException: urllib2.HTTPError: HTTP Error 413: Request Entity Too Large in PostScript at line number 78
    at org.python.jsr223.PyScriptEngine.scriptException(PyScriptEngine.java:202)
    at org.python.jsr223.PyScriptEngine.eval(PyScriptEngine.java:42)
    at org.python.jsr223.PyScriptEngine.eval(PyScriptEngine.java:47)
    at javax.script.AbstractScriptEngine.eval(AbstractScriptEngine.java:249)
    at org.ow2.proactive.scripting.Script.execute(Script.java:312)
    at org.ow2.proactive.scripting.ScriptHandler.handle(ScriptHandler.java:65)
    at org.ow2.proactive.scheduler.task.executors.InProcessTaskExecutor.execute(InProcessTaskExecutor.java:232)

```
