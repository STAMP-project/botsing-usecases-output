### Evocrash version 1.0.0-SNAPSHOT

### Results

Tests are generated for frame level 1,2 and 3.  
Generated tests are empty for frame level 4 and 5.  
For frame level from 6 to 9, no tests are generated.  

### Tested log

```
org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException: Requested data space is not registered in spaces directory.
    at org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl.ensureVirtualSpaceIsMounted(VFSSpacesMountManagerImpl.java:247)
    at org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl.resolveFile(VFSSpacesMountManagerImpl.java:159)
    at org.objectweb.proactive.extensions.dataspaces.vfs.VFSSpacesMountManagerImpl.resolveFile(VFSSpacesMountManagerImpl.java:129)
    at org.objectweb.proactive.extensions.dataspaces.core.DataSpacesImpl.resolveInputOutput(DataSpacesImpl.java:201)
    at org.objectweb.proactive.extensions.dataspaces.api.PADataSpaces.resolveOutput(PADataSpaces.java:472)
    at org.ow2.proactive.scheduler.task.data.TaskProActiveDataspaces$1.call(TaskProActiveDataspaces.java:231)
    at org.ow2.proactive.scheduler.task.data.TaskProActiveDataspaces$1.call(TaskProActiveDataspaces.java:228)
    at org.ow2.proactive.scheduler.task.data.TaskProActiveDataspaces.initDataSpace(TaskProActiveDataspaces.java:273)
    at org.ow2.proactive.scheduler.task.data.TaskProActiveDataspaces.initDataSpaces(TaskProActiveDataspaces.java:228)
    at org.ow2.proactive.scheduler.task.data.TaskProActiveDataspaces.<init>(TaskProActiveDataspaces.java:118)
    at org.ow2.proactive.scheduler.task.ProActiveForkedTaskLauncherFactory.createTaskDataspaces(ProActiveForkedTaskLauncherFactory.java:43)
    at org.ow2.proactive.scheduler.task.TaskLauncher.doTask(TaskLauncher.java:184)
    at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
    at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
    at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
    at java.lang.reflect.Method.invoke(Method.java:498)
    at org.objectweb.proactive.core.mop.MethodCall.execute(MethodCall.java:243)
    at org.objectweb.proactive.core.body.request.RequestImpl.serveInternal(RequestImpl.java:207)
    at org.objectweb.proactive.core.body.request.RequestImpl.serve(RequestImpl.java:153)
    at org.objectweb.proactive.core.body.BodyImpl$ActiveLocalBodyStrategy.serveInternal(BodyImpl.java:561)
    at org.objectweb.proactive.core.body.BodyImpl$ActiveLocalBodyStrategy.serve(BodyImpl.java:486)
    at org.objectweb.proactive.core.body.AbstractBody.serve(AbstractBody.java:417)
    at org.objectweb.proactive.Service.serve(Service.java:119)
    at org.objectweb.proactive.Service.blockingServeOldest(Service.java:203)
    at org.objectweb.proactive.Service.blockingServeOldest(Service.java:178)
    at org.objectweb.proactive.Service.fifoServing(Service.java:141)
    at org.objectweb.proactive.core.body.ActiveBody$FIFORunActive.runActivity(A
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
exception.type=org.objectweb.proactive.extensions.dataspaces.exceptions.SpaceNotFoundException
```

The frame.level configuration was tested with several values.
