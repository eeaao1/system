create  table USER_BASE
(
    USER_ID            VARCHAR2(64),
    USER_NAME          VARCHAR2(128),
    USER_PASSWORD      VARCHAR2(64),
    LAST_TOKEN         VARCHAR2(64),
    LAST_ACCESS_TIEM   TIMESTAMP,
    PROVIDE_TOKEN_TIEM TIMESTAMP,
    UPDATE_TIME        TIMESTAMP,
    CREATE_TIME        TIMESTAMP
)