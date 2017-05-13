
CREATE TABLE [users](
       [id] INTEGER PRIMARY KEY,
       [name] TEXT NOT NULL,
       [lastname] TEXT NOT NULL,
       [email] TEXT NOT NULL,
       [pass] TEXT NOT NULL);

 CREATE TABLE [profiles](
        [id] INTEGER PRIMARY KEY,
        [description]  TEXT NOT NULL,
        [actuators] TEXT NOT NULL);


  CREATE TABLE [users_profile](
       [id_user] INTEGER NOT NULL REFERENCES users([id]),
       [id_profile] INTEGER NOT NULL REFERENCES profiles([id]),
      UNIQUE([id_user], [id_profile]));