package com.example.pch61m.homecontrol.home.db;

import android.content.Context;
import android.database.Cursor;
import android.database.CursorWrapper;
import android.database.sqlite.SQLiteDatabase;
import android.provider.ContactsContract;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PCH61M on 12/05/2017.
 */
//********************************************************
//********************************************************
//********************************************************

//__________________________________________________________________________________________________________________
//__________________________________________________________________________________________________________________
                                        // USER CURSOR
class UsersCursor extends CursorWrapper {

    public UsersCursor(Cursor cursor) {super(cursor);}


    public Users getUser(){
        Cursor cursor = getWrappedCursor();
        return  new Users (cursor.getInt(cursor.getColumnIndex(InventoryDbSchema.Users_Table.Columns.ID)),
                cursor.getString(cursor.getColumnIndex(InventoryDbSchema.Users_Table.Columns.NAME)),
                cursor.getString(cursor.getColumnIndex(InventoryDbSchema.Users_Table.Columns.LASTNAME)),
                cursor.getString(cursor.getColumnIndex(InventoryDbSchema.Users_Table.Columns.EMAIL)),
                cursor.getString(cursor.getColumnIndex(InventoryDbSchema.Users_Table.Columns.PASSWORD)));
    }

}

//__________________________________________________________________________________________________________________
//__________________________________________________________________________________________________________________
// PROFILE CURSOR
class ProfileCursor extends CursorWrapper {

    public ProfileCursor(Cursor cursor) {super(cursor);}


  public Profiles getProfile(){
      Cursor cursor = getWrappedCursor();
      return  new Profiles (cursor.getInt(cursor.getColumnIndex(InventoryDbSchema.Profile_Table.Columns.ID)),
              cursor.getString(cursor.getColumnIndex(InventoryDbSchema.Profile_Table.Columns.DESCRIPTION)),
              cursor.getString(cursor.getColumnIndex(InventoryDbSchema.Profile_Table.Columns.ACTUATORS)));
  }

}



//__________________________________________________________________________________________________________________
//__________________________________________________________________________________________________________________
// ProfileUser CURSOR
class UserProfileCursor extends CursorWrapper {

    public UserProfileCursor(Cursor cursor) {super(cursor);}


    public UsersProfile getUserProfile(){
        Cursor cursor = getWrappedCursor();
        return  new UsersProfile (cursor.getInt(cursor.getColumnIndex(InventoryDbSchema.UserProfile_Table.Columns.ID_USER)),
                cursor.getInt(cursor.getColumnIndex(InventoryDbSchema.UserProfile_Table.Columns.ID_PROFILE)) );
    }

}


//********************************************************
//********************************************************
//********************************************************

//INICIO DE FUNCIONES INVENTORY
public final class Inventory {

    private InventoryHelper inventoryHelper;
    private SQLiteDatabase db;

    public  Inventory(Context context) {
        inventoryHelper = new InventoryHelper(context);
        db = inventoryHelper.getWritableDatabase();
    }


//********************************************************
//********************************************************
//********************************************************

//__________________ FUNCIONES_________________________________________



// PARA OBTENER TODOS LOS USUARIOS
    public List<Users> getAllUsers() {
        List<Users> list = new ArrayList<Users>();

        UsersCursor cursor = new UsersCursor((db.rawQuery("SELECT * FROM users ORDER BY id", null)));

        while (cursor.moveToNext()) {

            list.add((cursor.getUser()));  // metodo wrappcursor
        }
        cursor.close();
        return list;

    }

    //OBTENER ID USER

    public Users getUserID(String email, String pass ) {
        Users list ;


        UsersCursor cursor = new UsersCursor((db.rawQuery( "SELECT * FROM users WHERE  ( UPPER(name) LIKE '%"+email+"%' OR email LIKE '%"+email+"%') and pass LIKE '%"+pass+"%'" , null)));


        cursor.moveToNext();
            list=cursor.getUser();  // metodo wrappcursor


        cursor.close();
        return list;
    }


    //OBTENER USER FROM ID

    public Users getUserFromID(int id) {
        Users list ;


        UsersCursor cursor = new UsersCursor((db.rawQuery("SELECT * FROM users WHERE id="+String.valueOf(id) , null)));
        cursor.moveToNext();
        list=cursor.getUser();  // metodo wrappcursor


        cursor.close();
        return list;
    }






} //END INVENTORY
