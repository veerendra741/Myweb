::initialize error flag to undefined
set mvnErr=0

::run your Maven command and define the error flag if there was an error
call mvn clean test -Dsurefire.suiteXmlFiles=testng.xml || set mvnErr=1


(echo %mvnErr%)> settings.cdb


::You can now take action if there was an error
::if defined mvnErr echo there was a Maven error
::if not defined mvnErr call mvn clean test -Dsurefire.suiteXmlFiles=testng2.xml


