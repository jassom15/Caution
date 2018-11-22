package com.example.fathanauzan.caution;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class Caution extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caution);
    }

    public void btn_error(View view) {
        Intent main = new Intent(Caution.this, Kaget.class);
        startActivity(main);
    }
}
