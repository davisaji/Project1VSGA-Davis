package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.project1.Model.DMModel;

public class DaftarMenuAdd extends AppCompatActivity {

    private EditText menu,harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu_add);
        menu = findViewById(R.id.edtMenu);
        harga = findViewById(R.id.edtHarga);
    }

    public void SimpanMenuBaru(View view) {
        String menu = this.menu.getText().toString();
        String harga = this.harga.getText().toString();
        if(isAngka(harga)){
            DaftarMenu.listDM.add(new DMModel(menu,harga));
            Intent i = new Intent(DaftarMenuAdd.this, DaftarMenu.class);
            startActivity(i);
            finish();
        }else {
            Toast.makeText(this, "Harap masukkan nominal harga", Toast.LENGTH_LONG).show();
        }

    }
    private boolean isAngka(String nominal){
        try {
            Double.parseDouble(nominal);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}