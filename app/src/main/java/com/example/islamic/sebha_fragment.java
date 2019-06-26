package com.example.islamic;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;



/**
 * A simple {@link Fragment} subclass.
 */
public class sebha_fragment extends Fragment {


    public sebha_fragment() {
        // Required empty public constructor
    }
View view ;
    Button btnt1 ,btnall;
    Spinner spinner;
    ImageView sebha_img , re_img;
    int allcount =0,onecount=0;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_sebha_fragment, container, false);
        inti_comp();

   return view;
    }
    public void inti_comp(){
     spinner= (Spinner) view.findViewById(R.id.spinner);
       spinner.setOnTouchListener(new View.OnTouchListener() {
                                      @Override
                                      public boolean onTouch(View v, MotionEvent event) {
                                          btnall.setText("" + 0);
                                          onecount =0;
                                          return false;
                                      }
                                  });

               sebha_img = (ImageView) view.findViewById(R.id.img_sebha);
        re_img = (ImageView) view.findViewById(R.id.again);
        sebha_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onecount++;
                allcount++;
                btnt1.setText(""+allcount);
                btnall.setText(""+onecount);
            }
        });
        re_img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                allcount =0;
                onecount =0;
                btnt1.setText(""+allcount);
                btnall.setText(""+onecount);
            }
        });
        btnt1 = (Button) view.findViewById(R.id.one);
        btnt1.setText(" "+0);
        btnall=(Button) view.findViewById(R.id.total);
        btnall.setText(" "+0);
    }

}
