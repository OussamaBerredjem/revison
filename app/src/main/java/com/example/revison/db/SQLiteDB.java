package com.example.revison.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.revison.models.Etudiant;

import java.util.ArrayList;

public class SQLiteDB extends SQLiteOpenHelper {

   public static final int VERSION = 1;
   public static final String DB_NAME = "data",
           TABLE_NAME = "user",
           COLUMN_ID="id",
           COLUMN_PRENOM="prenom",
           COLUMN_NOM="nom";

   SQLiteDB(Context context){
       super(context,DB_NAME,null,VERSION);
   }

   @Override
   public void onCreate(SQLiteDatabase db){
       String query = "CREATE TABLE "+TABLE_NAME+"("+COLUMN_ID+" INTEGER PRIMARY KEY AUTOINCREMENT,"+COLUMN_NOM+" TEXT,"+COLUMN_PRENOM+" TEXT"+")";
       db.execSQL(query);
   }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS user");
        onCreate(db);
    }

    public void addEtudiant(Etudiant etudiant){

       SQLiteDatabase db = getWritableDatabase();
       ContentValues contentValues = new ContentValues();

       contentValues.put("nom",etudiant.nom);
       contentValues.put("prenom",etudiant.prenom);

       db.insert(TABLE_NAME,null,contentValues);


    }

    public void deleteUser(Etudiant etudiant){
       SQLiteDatabase db = getWritableDatabase();
       db.delete(TABLE_NAME,"id = ?",new String[]{""+etudiant.id});
    }

    public void updateUser(Etudiant etudiant){
       SQLiteDatabase db = getWritableDatabase();
       ContentValues contentValues = new ContentValues();
       contentValues.put("nom",etudiant.nom);
       contentValues.put("prenom",etudiant.nom);
       db.close();
    }

    ArrayList<Etudiant> getAllEtudiant(){
       ArrayList<Etudiant> etudiants = new ArrayList<>();



       SQLiteDatabase db = getReadableDatabase();
       
       Cursor cursor = db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
       cursor.moveToFirst();

       while (cursor.moveToNext()){
           int id = cursor.getInt(0);
           String nom = cursor.getString(1);
           String prenom = cursor.getString(2);

           Etudiant etudiant = new Etudiant(nom,prenom,id);
           etudiants.add(etudiant);
       }

       return etudiants;
    }




    public void removeEtudiant(Etudiant e){
       SQLiteDatabase db = getWritableDatabase();
       db.delete(TABLE_NAME,"id = ?",new String[]{""+e.id});
    }

    public void updateEtudiant(Etudiant e){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("nom",e.nom);
        contentValues.put("prenom",e.nom);
        db.update(TABLE_NAME,contentValues,"id = ?",new String[]{""+e.id});

    }

    public ArrayList<Etudiant> getEtudiants(){
       SQLiteDatabase db = getReadableDatabase();
        Cursor c =  db.rawQuery("SELECT * FROM "+TABLE_NAME,null);
       ArrayList<Etudiant> etudiants = new ArrayList<>();
       c.moveToFirst();
       while (c.moveToNext()){

       }

       return new ArrayList<>();
    }
}
