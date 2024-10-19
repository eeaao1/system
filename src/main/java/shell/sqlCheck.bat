@echo off
setlocal enabledelayedexpansion

set "rootFolder=%1"
echo 执行路径: %1
set TAaccount=hsta/hsta@orcl

REM 设置执行日志文件路径
set ERROR_LOG=error.log
REM 创建空的执行日志文件（如果不存在）
type nul > %ERROR_LOG%

for /r "%rootFolder%" %%f in (*.sql) do (
    echo 执行脚本: %%f
    (
        sqlplus !TAaccount! @%%f
    ) >> %ERROR_LOG% 2>&1
)

endlocal
