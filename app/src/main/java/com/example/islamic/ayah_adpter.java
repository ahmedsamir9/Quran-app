package com.example.islamic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class ayah_adpter extends RecyclerView.Adapter<ayah_adpter.view_holder> {
    List<String>ayat;

    public ayah_adpter(List<String> ayat) {
        this.ayat = ayat;
    }



    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ayah_item,viewGroup,false);
        return new view_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder view_holder, int i) {
String aya = ayat.get(i).toString();
    view_holder.name.setText(aya);
    }

    @Override
    public int getItemCount() {
        return ayat.size();
    }

    class view_holder extends RecyclerView.ViewHolder{
        TextView name ;
        View view;

        public view_holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.ayah);
            view = itemView.findViewById(R.id.view_offset_helper);
        }
    }
}
