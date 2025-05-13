package com.example.revison.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.revison.R;
import com.example.revison.models.Etudiant;

public class EtudiantViewHolder extends RecyclerView.ViewHolder {
    TextView nom,prenom;
    public EtudiantViewHolder(View prototype){
        super(prototype);
        nom = prototype.findViewById(R.id.nom);
        prenom = prototype.findViewById(R.id.prenom);
    }

    void onBind(Etudiant e){
        nom.setText(e.nom);
        prenom.setText(e.prenom);
    }

}
