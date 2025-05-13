package com.example.revison.adapter;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

import com.example.revison.R;

//public class MyCursorAdapter extends CursorAdapter {
//    public MyCursorAdapter(Context context, Cursor cursor) {
//        super(context, cursor, 0);
//    }
//
//    @Override
//    public View newView(Context context, Cursor cursor, ViewGroup parent) {
//        return LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
//    }
//
//    @Override
//    public void bindView(View view, Context context, Cursor cursor) {
//        // Find fields to populate
//        TextView tvName = view.findViewById(R.id.text_name);
//        TextView tvDescription = view.findViewById(R.id.text_description);
//
//        // Extract properties from cursor
//        String name = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COLUMN_NAME));
//        String description = cursor.getString(cursor.getColumnIndexOrThrow(MyDatabaseHelper.COLUMN_DESCRIPTION));
//
//        // Populate fields with extracted properties
//        tvName.setText(name);
//        tvDescription.setText(description);
//    }
//}
