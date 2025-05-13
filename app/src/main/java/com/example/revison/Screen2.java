package com.example.revison;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Screen2 extends AppCompatActivity {

    Button btna;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);


        btna = findViewById(R.id.back_btn);

        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onDestroy();
            }
        });

        String name = getIntent().getStringExtra("name");

        System.out.println("2 onCreate()");

    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("2 on start()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(" 2 on restart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("2 on stop()");
    }

    @Override
    public void finish() {
        super.finish();
        System.out.println("2 finish()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("2 on resume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("2 on pause()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("2 onDestroy()");
    }
}