package com.example.revison.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.revison.R;
import com.example.revison.models.Etudiant;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<Etudiant> {

    ArrayList<Etudiant> etudiants;
    Context context;

   int ressource;

   public MyAdapter(Context context,int ressource,ArrayList<Etudiant> etudiants){
       super(context,ressource,etudiants);
       this.context = context;
       this.etudiants = etudiants;
   }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
       convertView = LayoutInflater.from(context).inflate(R.layout.test_item,parent,false);

        TextView nom = convertView.findViewById(R.id.nom);
        TextView prenom = convertView.findViewById(R.id.prenom);

        Etudiant etudiant = etudiants.get(position);

        nom.setText(etudiant.nom);
        prenom.setText(etudiant.prenom);


        return convertView;
    }
}
