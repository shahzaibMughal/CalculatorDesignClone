package com.example.shahzaib.calculatordesignclone;

import android.graphics.Color;
import android.os.Build;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;
    DrawerLayout drawerLayout;
    View drawerHandle;


    Button digit_1, digit_2, digit_3,digit_4,digit_5,digit_6,digit_7,digit_8,digit_9,digit_0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.transparentToolbar);
        drawerLayout = findViewById(R.id.drawerLayout);
        drawerHandle = findViewById(R.id.drawerHandle);





        if(drawerLayout!=null)
        {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                drawerLayout.setDrawerElevation(0f);
                drawerHandle.setElevation(4f);
            }
        }

        //initial Setup
        setupToolbar();
        setupClickListenersOnCalculatorButtons();
    }

    private void setupClickListenersOnCalculatorButtons() {

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.calculator_toolbar_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }















    /** Helper Methods*/
    private void setupToolbar() {
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("DEG");
    }


    @Override
    public void onClick(View v) {

    }
}
