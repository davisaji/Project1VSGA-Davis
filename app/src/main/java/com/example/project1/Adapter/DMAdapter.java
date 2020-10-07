package com.example.project1.Adapter;

import android.drm.DrmStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.project1.DaftarMenu;
import com.example.project1.Model.DMModel;
import com.example.project1.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DMAdapter extends RecyclerView.Adapter<DMAdapter.DMViewHolder> {
    private List<DMModel> listDM = new ArrayList<>();
    public DMAdapter(List<DMModel> listDM){this.listDM=listDM;}


    //---------------
    private OnContactClickListener listener;
    public interface OnContactClickListener {
        public void onClick(View view, int position);
    }
    public void setListener(OnContactClickListener listener) {
        this.listener = listener;
    }
    //----------------------
    @NonNull
    @Override
    public DMViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View viewholder = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_dm,parent, false);

        return new DMViewHolder(viewholder);
    }

    @Override
    public void onBindViewHolder(@NonNull DMViewHolder holder, int position) {
        DMModel item = listDM.get(position);
        holder.menu.setText(item.getMenu());
        holder.harga.setText(item.getHarga());
    }

    @Override
    public int getItemCount() {
        return listDM.size();
    }

    public class DMViewHolder extends RecyclerView.ViewHolder {
        public TextView menu,harga;
        public DMViewHolder(@NonNull View itemView) {
            super(itemView);
            menu = itemView.findViewById(R.id.menu_name);
            harga = itemView.findViewById(R.id.menu_price);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    listener.onClick(view, getAdapterPosition());
                }
            });
        }
    }
}
