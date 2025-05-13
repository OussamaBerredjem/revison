package com.example.revison;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.revison.adapter.ListViewAdapter;
import com.example.revison.adapter.MyAdapter;
import com.example.revison.models.Etudiant;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);


    }

    @Override
    protected void onStart() {
        super.onStart();
        ArrayList<String> data = new ArrayList<>();
        data.add("a");
        data.add("b");
        data.add("c");
        data.add("d");
        data.add("e");
        data.add("f");
        data.add("g");

        int res = android.R.layout.simple_list_item_1;

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(MainActivity.this,res ,data);


        ArrayList<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant("a","b"));
        etudiants.add(new Etudiant("c","c"));
        etudiants.add(new Etudiant("d","d"));

        ListViewAdapter listViewAdapter = new ListViewAdapter(MainActivity.this,R.layout.test_item,etudiants);


        listView.setAdapter(listViewAdapter);
    }


}