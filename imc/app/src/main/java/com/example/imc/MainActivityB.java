package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        Button b = findViewById(R.id.bntSair);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        Bundle bundle = getIntent().getExtras();
        String msg = bundle.getString("msg");
        String msg1 = bundle.getString("msg1");

        TextView textView = findViewById(R.id.textView);
        textView.setText(msg);

        TextView textView1 = findViewById(R.id.textView1);
        textView1.setText(msg1);


    }
}