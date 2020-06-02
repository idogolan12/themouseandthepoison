package com.example.test;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    EditText etLine, etRaw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etLine = findViewById(R.id.edLine);
        etRaw = findViewById(R.id.edRaw);

    }

    public void goToGame(View view) {
        Intent intent = new Intent(this ,Game.class);
        intent.putExtra("line", etLine.getText().toString());
        intent.putExtra("raw", etRaw.getText().toString());
        startActivity(intent);
    }
}

