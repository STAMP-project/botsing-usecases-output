
# Botsing v1.0.3 test on Scheduling

## Reproducing steps

1/ Clone and build the botsing-gradle-plugin repository
```
$ git clone https://github.com/stamp-project/botsing-gradle-plugin
$ ./gradlew shadowJar
```


2/ Clone the scheduling repository

```
$ git clone https://github.com/ow2-proactive/scheduling
```

3/ Modify `build.gradle` file

Add the following lines in the `build.gradle` file

In the buildscript: ```classpath files('PATH_TO_PLUGIN/botsing-gradle-plugin-1.0.0-SNAPSHOT-all.jar')```
where PATH_TO_PLUGIN is the path to the bosing-gradle-plugin generated jar.

and

```
apply plugin: eu.stamp_project.botsing.BotsingGradlePlugin

botsing {
    libsPath="dist/lib/"
    targetFrame="TARGET_FRAME"
    logPath="LOG_FILE_PATH"
    output="DIRECTORY_OUTPUT"
}
```
where TARGET_FRAME, LOG_FILE_PATH and DIRECTORY_OUTPUT should be replace by their correct values.

4/ Run the following commands :
```
$ ./gradlew compileJava
$ ./gradlew botsing
```
