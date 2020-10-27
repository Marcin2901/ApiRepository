call runcrud.bat
if "%ERRORLEVEL%" == "0" goto startnet
echo error with open runcrud
goto fail

:startnet
start chrome.exe
if "%ERRORLEVEL%" == "0" goto getTasks
echo error with open chrome
goto fail

:getTasks
start chrome http://localhost:8080/crud/v1/task/getTasks
if "%ERRORLEVEL%" == "0" goto end
echo error with load page

:fail
echo.
echo There were errors

:end
echo.
echo Work is finished aa.