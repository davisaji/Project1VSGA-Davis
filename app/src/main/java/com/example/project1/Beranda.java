package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.project1.Model.DMModel;

import java.util.List;

public class Beranda extends AppCompatActivity {
    public static List<DMModel> listDM;;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
    }

    public void linkDM(View view) {
        Intent i = new Intent(Beranda.this, DaftarMenu.class);
        startActivity(i);
        finish();
    }
}