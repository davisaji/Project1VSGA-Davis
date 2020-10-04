package com.example.project1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Context;
import android.os.Bundle;

import com.example.project1.DF.dft1;
import com.example.project1.DF.dft2;
import com.example.project1.DF.dft3;
import com.google.android.material.tabs.TabLayout;

public class DaftarFitur extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    DFPage adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_fitur);
        tabLayout = findViewById(R.id.tab);
        viewPager = findViewById(R.id.viewpager);

        adapter = new DFPage(getApplicationContext(),getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
class DFPage extends FragmentStatePagerAdapter{
    Context context;
    int jumlahTab;
    DFPage(Context context, FragmentManager fm, int jumlahTab){
        super(fm);
        this.context=context;
        this.jumlahTab = jumlahTab;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new dft1();
            case 1: return new dft2();
            case 2: return new dft3();
        }
        return null;
    }

    @Override
    public int getCount() {
        return jumlahTab;
    }
}