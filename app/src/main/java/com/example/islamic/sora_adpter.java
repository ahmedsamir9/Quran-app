package com.example.islamic;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class sora_adpter extends RecyclerView.Adapter<sora_adpter.view_holder> {
    String[]sura;
    public static String sora_name;

    public sora_adpter(String[] sura) {
        this.sura = sura;
    }

    @NonNull
    @Override
    public view_holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.soraitem,viewGroup,false);
        return new view_holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull view_holder view_holder, final int i) {

    view_holder.name.setText(sura[i]);
        if(onclickitem!=null)
    view_holder.name.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            sora_name = (1+i)+".txt";
           onclickitem.onclick();
        }
    });

    }
    onclickitem onclickitem;

    public void setOnclickitem(sora_adpter.onclickitem onclickitem) {
        this.onclickitem = onclickitem;
    }

    @Override
    public int getItemCount() {
        return sura.length;
    }
public interface onclickitem {
        public void onclick();
}
    class view_holder extends RecyclerView.ViewHolder{
        TextView name ;

        public view_holder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.sora);
        }
    }
}
