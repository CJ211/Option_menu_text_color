package com.example.jay.option_menu_text_color;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mcolortxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mcolortxt=(TextView) findViewById(R.id.txt);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.optionsmenu, menu);
        setTitle("Text Color");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId())
        {

            case R.id.rd:

                //changing text for fun
                mcolortxt.setText("From Null");
                //changing textsize for fun
                mcolortxt.setTextSize(50);
                //changing color as mentioned in assignment
                mcolortxt.setTextColor(Color.RED);
                return true;

            case R.id.yel:
                //changing text for fun
                mcolortxt.setText("From Null");
                //changing textsize for fun
                mcolortxt.setTextSize(50);
                //changing color as mentioned in assignment
                mcolortxt.setTextColor(Color.YELLOW);
                return true;

            case R.id.gre:
                //changing text for fun
                mcolortxt.setText("From Null");
                //changing textsize for fun
                mcolortxt.setTextSize(50);
                //changing color as mentioned in assignment
                mcolortxt.setTextColor(Color.GREEN);

                return true;

            default:
                return super.onOptionsItemSelected(item);

        }

    }

}
