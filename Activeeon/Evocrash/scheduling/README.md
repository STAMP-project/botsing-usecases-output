## Results of Evocrash generation with Scheduling project logs

### Generated tests

 - SpaceNotFoundException: [VFSSpacesMountManagerImpl_ESTest.java](SpaceNotFoundException/VFSSpacesMountManagerImpl_ESTest.java) and [VFSSpacesMountManagerImpl_ESTest_scaffolding.java](SpaceNotFoundException/VFSSpacesMountManagerImpl_ESTest_scaffolding.java)

### Logs that generate tests

 - [SpaceNotFoundException](SpaceNotFoundException/SpaceNotFound.log)

### Logs that generate empty tests

 - [BodyTerminatedRequestException](BodyTerminatedRequestException/BodyTerminatedRequestException.log)
 - [BodyTerminateReplyException](BodyTerminateReplyException/BodyTerminateReplyException.log)
 - [IOException6](IOException6/IOException6.log)
 - [ScriptException](ScriptException/ScriptException.log)

### Logs that don't generate any tests

 - [NullPointerException](NullPointerException/NullPointerException.log)
 - [JsonParseException](JsonParseException/JsonParseException.log)

### Conclusion

Evocrash has better results when logs contain custom exceptions. By using custom exceptions, we managed to generate relevant tests and empty tests. Using logs that throw existing exceptions don't seem to be relevant with Evocrash as it crashes during the generation process.
