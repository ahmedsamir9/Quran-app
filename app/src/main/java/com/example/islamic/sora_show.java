package com.example.islamic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class sora_show extends AppCompatActivity {
List<String>ayat;
    RecyclerView rec;
    ayah_adpter adpterr;
    RecyclerView.LayoutManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sora_show);

       setRec();
    }

        public void readFile(String fileName){
            ayat=new ArrayList<>();
            BufferedReader reader;

            try{
                final InputStream file = getAssets().open(fileName);
                reader = new BufferedReader(new InputStreamReader(file));
                String line =null;
                int c =1;
                while((line=reader.readLine())!= null){

                    ayat.add(line+"("+c+")");
                    c++;
                }
            } catch(IOException ioe){
                ioe.printStackTrace();
            }
    }
    public void setRec(){
        rec = findViewById(R.id.ayah_rec);
        readFile(sora_adpter.sora_name);
        adpterr = new ayah_adpter(ayat);
        manager = new GridLayoutManager(this,1,1,false);

        rec.setAdapter(adpterr);
        rec.setLayoutManager(manager);
    }
}
