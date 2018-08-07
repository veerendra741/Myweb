

:read
(
set /p mvnErr=
)<settings.cdb


if %mvnErr%==1 echo there was a Maven error
if %mvnErr%==0 call mvn clean test -Dsurefire.suiteXmlFiles=testng2.xml
