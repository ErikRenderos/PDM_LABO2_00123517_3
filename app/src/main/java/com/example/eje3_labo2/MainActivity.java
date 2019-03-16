package com.example.eje3_labo2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout btn1;
    LinearLayout btn2;
    LinearLayout btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int[] btn_red = {R.color.btn_rojo, R.color.btn_rojo2, R.color.btn_rojo3, R.color.btn_rojo4, R.color.btn_rojo5, R.color.btn_rojo6};
        int[] btn_green = {R.color.btn_verde,R.color.btn_verde2,R.color.btn_verde3,R.color.btn_verde4,R.color.btn_verde5,R.color.btn_verde6};
        int[] btn_blue = {R.color.btn_azul,R.color.btn_azul2,R.color.btn_azul3,R.color.btn_azul4,R.color.btn_azul5,R.color.btn_azul6};
        int viewId = v.getId();
        Log.i("id ",viewId+"");

        switch (viewId){
            case R.id.btn1:
                btn1.setBackgroundResource(btn_red[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.btn2:
                btn2.setBackgroundResource(btn_green[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.btn3:
                btn3.setBackgroundResource(btn_blue[(int) Math.floor(Math.random()*6)]);
                break;
        }
    }
}