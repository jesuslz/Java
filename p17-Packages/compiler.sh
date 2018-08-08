#!/bin/sh
rm *.class
javac -d . Time1.java
javac Time1PackageTest.java
java Time1PackageTest