package com.splashincsolutions.myloyalty.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.splashincsolutions.myloyalty.DTO.Establishment;

import java.util.List;

/**
 * Created by bob_l on 19-Oct-15.
 */
public class DatabaseHandler extends SQLiteOpenHelper{
    // ALL Static variables
    // Database version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "spashincMyLoyalty";

    // Establishment table name
    private static final String TABLE_ESTABLISHMENT = "establishment";

    // Establishment Table Columns names
    private static final String ESTABLISHMENT_KEY = "ref";
    private static final String ESTABLISHMENT_NAME = "name";



    public DatabaseHandler(Context context){
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    //Create the tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_ESTABLISHMENT_TABLE = "CREATE TABLE " + TABLE_ESTABLISHMENT + "("
                + ESTABLISHMENT_KEY + " INTEGER PRIMARY KEY," + ESTABLISHMENT_NAME + " TEXT)";
        db.execSQL(CREATE_ESTABLISHMENT_TABLE);
    }

    public void addEstablishment(String establishmentName){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(ESTABLISHMENT_NAME, establishmentName);
        db.insert(TABLE_ESTABLISHMENT, null, values);
        db.close();
    }

    public Establishment getEstablishment(int ref){
        return null;
    }

    public List<Establishment> getAllEstablishments(){
        return null;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop older table if exists
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_ESTABLISHMENT);

        // Create Tables again
        onCreate(db);
    }
}
