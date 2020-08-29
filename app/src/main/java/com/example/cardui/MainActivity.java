package com.example.cardui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CardView cough,fever,headache;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Removing Status Bar----->
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Reference to Views----->
        initViews();


        //Click Listeners on Card View----->
        cardClickListener();
    }




    //Method cardClickListener------>
    private void cardClickListener() {
        cough.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cough.setCardElevation(12);
                fever.setCardElevation(0);
                headache.setCardElevation(0);
                cough.setCardBackgroundColor(getResources().getColor(R.color.yellow));
                fever.setCardBackgroundColor(getResources().getColor(R.color.white));
                headache.setCardBackgroundColor(getResources().getColor(R.color.white));
               Toast.makeText(MainActivity.this, "Congratulations you have COUGH", Toast.LENGTH_SHORT).show();
            }
        });
        fever.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cough.setCardElevation(0);
                fever.setCardElevation(12);
                headache.setCardElevation(0);
                fever.setCardBackgroundColor(getResources().getColor(R.color.yellow));
                cough.setCardBackgroundColor(getResources().getColor(R.color.white));
                headache.setCardBackgroundColor(getResources().getColor(R.color.white));
               Toast.makeText(MainActivity.this, "Congratulations you have FEVER", Toast.LENGTH_SHORT).show();
            }
        });
        headache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cough.setCardElevation(0);
                fever.setCardElevation(0);
                headache.setCardElevation(12);
                headache.setCardBackgroundColor(getResources().getColor(R.color.yellow));
                cough.setCardBackgroundColor(getResources().getColor(R.color.white));
                fever.setCardBackgroundColor(getResources().getColor(R.color.white));
                Toast.makeText(MainActivity.this, "Congratulations you have HEADACHE", Toast.LENGTH_SHORT).show();
            }
        });
    }


    //Method initViews();------>
    private void initViews() {
        cough=findViewById(R.id.cough_view);
        fever=findViewById(R.id.fever_view);
        headache=findViewById(R.id.headache_view);
    }
}