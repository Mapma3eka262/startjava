--create datebase

CREATE TABLE Jaegers (
    id          SERIAL PRIMARY KEY,
    modelName   TEXT,
    mark        CHAR(6),
    height      FLOAT8,
    weight      INTEGER,
    status      TEXT,
    origin      TEXT,
    launch      INTEGER,
    kaijuKill   INTEGER
);