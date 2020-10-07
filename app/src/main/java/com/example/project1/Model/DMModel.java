package com.example.project1.Model;

public class DMModel {
    private String menu,harga;

    public DMModel(String menu, String harga) {
        this.menu = menu;
        this.harga = harga;
    }
    public String getMenu() { return menu; }
    public void setMenu(String menu) { this.menu = menu; }
    public String getHarga() { return harga; }
    public void setHarga(String harga) { this.harga = harga; }
}
