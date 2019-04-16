# Yildiz-Engine module-vfs.

This is the official repository of the VFS Module, part of the Yildiz-Engine project.
The vfs module provide the engine with the ability to manipulate virtual file system.

## Features

* Multiple format supported.
* File read.
* File write.
* ...

## Requirements

To build this module, you will need the latest java JDK, and Maven 3.

## Coding Style and other information

Project website:
https://engine.yildiz-games.be

Issue tracker:
https://yildiz.atlassian.net

Wiki:
https://yildiz.atlassian.net/wiki

Quality report:
https://sonarqube.com/overview?id=be.yildiz-games:module-vfs

## License

All source code files are licensed under the permissive MIT license
(http://opensource.org/licenses/MIT) unless marked differently in a particular folder/file.

## Build instructions

Go to your root directory, where you POM file is located.

	mvn clean install

This will compile the source code, then run the unit tests, and finally build a jar file.

## Usage

In your maven project, add the dependency

```xml
<dependency>
    <groupId>be.yildiz-games</groupId>
    <artifactId>module-vfs</artifactId>
    <version>${currentVersion}</version>
</dependency>
```

## Contact
Owner of this repository: Grégory Van den Borre