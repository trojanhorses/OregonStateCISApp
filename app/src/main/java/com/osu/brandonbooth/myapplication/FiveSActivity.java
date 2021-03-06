package com.osu.brandonbooth.myapplication;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class FiveSActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five_s);


        final CheckBox ch1 = (CheckBox) findViewById(R.id.checkBox);
        final CheckBox ch2 = (CheckBox) findViewById(R.id.checkBox2);

        Button displayBtn = (Button) findViewById(R.id.button3);
        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String newLine = System.getProperty("line.separator");

                int oldValue = 0;

                if(ch1.isChecked()) {


                    oldValue = oldValue +1;


                    Toast.makeText(
                            FiveSActivity.this,
                            "Checkbox1 checked? " + ch1.isChecked() + newLine
                                    + "Checkbox2 checked?" + ch2.isChecked(),
                            Toast.LENGTH_SHORT).show();


                    final TextView mTextView = (TextView) findViewById(R.id.numchecked);
                    mTextView.setText("oldValue");

                    final TextView txtValue = (TextView) findViewById(R.id.numchecked);
                    txtValue.setText(Integer.toString(oldValue));
                }

                if(ch2.isChecked()) {

                    oldValue = oldValue +1;


                    Toast.makeText(
                            FiveSActivity.this,
                            "Checkbox1 checked? " + ch1.isChecked() + newLine
                                    + "Checkbox2 checked?" + ch2.isChecked(),
                            Toast.LENGTH_SHORT).show();


                    final TextView mTextView = (TextView) findViewById(R.id.numchecked);
                    mTextView.setText("oldValue");

                    final TextView txtValue = (TextView) findViewById(R.id.numchecked);
                    txtValue.setText(Integer.toString(oldValue));
                }




            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_five, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if (id == R.id.back) {
            startActivity(new Intent(this, MainActivity.class));
            return true;
        }
        if (id == R.id.search) {
            Toast.makeText(getBaseContext(), "Click on the search icon", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.help) {
            Toast.makeText(getBaseContext(), "Please contact Brandon Booth at boothbr@onid.oregonstate.edu for help with this application.", Toast.LENGTH_LONG).show();
            return true;
        }

        if (id == R.id.settings) {
            Toast.makeText(getBaseContext(), "There are no settings yet.", Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
