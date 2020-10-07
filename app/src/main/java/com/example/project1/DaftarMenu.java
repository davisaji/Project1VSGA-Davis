package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.project1.Adapter.DMAdapter;
import com.example.project1.Model.DMModel;

import java.util.ArrayList;
import java.util.List;

public class DaftarMenu extends AppCompatActivity implements DMAdapter.OnContactClickListener {

    public RecyclerView rv;
    public DMAdapter dmadapter;
    public RecyclerView.LayoutManager layoutManager;
    public static List<DMModel> listDM = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);
        rv = findViewById(R.id.rvdm);
        listDM.add(new DMModel("Bakso Solo", "15000"));
        listDM.add(new DMModel("Gado-gado", "10000"));
        listDM.add(new DMModel("Soto Ayam", "17000"));
        dmadapter = new DMAdapter(listDM);
        dmadapter.setListener(this);
        layoutManager = new LinearLayoutManager(getApplicationContext());
        rv.setAdapter(dmadapter);
        rv.setLayoutManager(layoutManager);
    }
    public void onClick(View view, int position) {
        DMModel contact = listDM.get(position);
        Toast.makeText(this, contact.getMenu(), Toast.LENGTH_LONG).show();
    }

    public void tambahMenuBaru(View view) {
        Intent i = new Intent(DaftarMenu.this, DaftarMenuAdd.class);
        startActivity(i);
    }
}