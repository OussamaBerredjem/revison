package com.example.revison.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.revison.R;
import com.example.revison.models.TestModels;

import java.util.ArrayList;

public class TestArrayAdapter extends ArrayAdapter<TestModels> {
    ArrayList<TestModels> list;
    Context context;

    TestArrayAdapter( ArrayList<TestModels> list,Context context,int ressource){
        super(context,ressource,list);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView ==null){
            convertView = LayoutInflater.from(context).inflate(R.layout.test_item,parent,false);
        }





        return super.getView(position, convertView, parent);
    }


}
