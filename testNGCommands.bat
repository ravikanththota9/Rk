
set CLASSPATH=lib\*;

javac suite1\TestNGSimpleOverridesTest.java

java -cp ".;lib\*;" org.testng.TestNG  suite1\testng.xml

@echo off
Rem javac suite1\TestNGSimpleOverridesTest.java

Rem java -cp ".;D:\Tech\TESTNG\lib\reportng-1.1.4.jar;D:\Tech\TESTNG\lib\testng-6.8.jar;D:\Tech\TESTNG\lib\velocity-dep-1.4.jar;D:\Tech\TESTNG\lib\guice-3.0.jar" org.testng.TestNG  suite1\testng.xml

