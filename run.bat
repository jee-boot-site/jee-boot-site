@echo off
rem /**
rem  * Author lm QQ:631663525
rem  */
echo.
echo run spring boot
echo.
rem pause
rem echo.


set MAVEN_OPTS=%MAVEN_OPTS% -Xms256m -Xmx512m -XX:PermSize=128m -XX:MaxPermSize=256m


call mvn clean install -DskipTests

cd boot-sys
call mvn spring-boot:run

pause