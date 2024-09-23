package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("ciclo de vida", "onCreate");
        Button button = findViewById(R.id.button);
        EditText ed = findViewById(R.id.editText);
        EditText ed1 = findViewById(R.id.editText1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivityB.class);
                i.putExtra("msg", ed.getText().toString());
                i.putExtra("msg1", ed1.getText().toString());
                startActivity(i);
            }
        });



    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("ciclo de vida", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ciclo de vida", "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("ciclo de vida", "onStart");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("ciclo de vida", "onStart");
    }


}