@echo off
setlocal enabledelayedexpansion

set "rootFolder=%1"
echo ִ��·��: %1
set TAaccount=hsta/hsta@orcl

REM ����ִ����־�ļ�·��
set ERROR_LOG=error.log
REM �����յ�ִ����־�ļ�����������ڣ�
type nul > %ERROR_LOG%

for /r "%rootFolder%" %%f in (*.sql) do (
    echo ִ�нű�: %%f
    (
        sqlplus !TAaccount! @%%f
    ) >> %ERROR_LOG% 2>&1
)

endlocal
