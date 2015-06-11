package com.example.android.portfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import java.io.*;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void doit2(View view) {
        Button button = (Button)view;
        Toast.makeText(this, "This button will launch " + button.getText(), Toast.LENGTH_SHORT).show();
    }

    int toastDuration = Toast.LENGTH_SHORT;
    public void doit (View view) {
        Button button = (Button) view;
        String buttonText = (String) button.getText();
        Context context = getApplicationContext();

        CharSequence text = "This button will launch my " + buttonText + " app!";
        Toast toast = Toast.makeText(context, text, toastDuration);
        toast.show();
    }
}
