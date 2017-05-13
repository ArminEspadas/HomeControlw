package com.example.pch61m.homecontrol.home.db;

/**
 * Created by PCH61M on 12/05/2017.
 */

public final class InventoryDbSchema {


    // SECCION CREADA PARA CONOCER TODOS LOS PARAMETROS DE LA TABLA PARA HACER MAS FACIL LA PROGRMACION DE SUS VARIABLES
    //______________________________________________________________________________________

    public static final class Users_Table{
        public static final String NAME = "users";

        public static final class Columns
        {
            public static final String ID = "id";
            public static final String NAME = "name";
            public static final String LASTNAME = "lastname";
            public static final String EMAIL = "email";
            public static final String PASSWORD = "pass";

        }

    }

    //______________________________________________________________________________________


    public static final class Profile_Table{
        public static final String NAME = "profiles";

        public static final class Columns
        {
            public static final String ID = "id";
            public static final String DESCRIPTION = "description";
            public static final String ACTUATORS = "actuators";


        }

    }

    public static final class UserProfile_Table{
        public static final String NAME = "users_profile";

        public static final class Columns
        {
            public static final String ID_USER = "id_user";
            public static final String ID_PROFILE = "id_profile";

        }

    }



}
