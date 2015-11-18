package com.splashincsolutions.myloyalty;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.splashincsolutions.myloyalty.DTO.Establishment;
import com.splashincsolutions.myloyalty.DTO.EstablishmentAdapter;
import com.splashincsolutions.myloyalty.Database.DatabaseHandler;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Defining android ListView
    ListView lvLoyaltyCards;

    //Test elements
    String[] testElements = new String[]{"Hello", "World", "Review"};
    private ArrayList<Establishment> testElements2 = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DatabaseHandler dbh = new DatabaseHandler(this);
        testElements2.add(new Establishment(0, "test"));
        testElements2.add(new Establishment(2, "Cool"));
        /*
        Don't need to reset stuff yet
        dbh.dbReset();
        for(int i =0; i < testElements.length; i++){
            dbh.addEstablishment(testElements[i]);
        }*/

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        lvLoyaltyCards = (ListView) findViewById(R.id.loyaltyCardsList);

        EstablishmentAdapter esd = new EstablishmentAdapter(this, R.layout.list_item, testElements2);
        //Declare Array adapter
        ArrayAdapter<Establishment> loyaltyCardAdapter = new ArrayAdapter<Establishment>(this, android.R.layout.simple_list_item_1, dbh.getUserEstablishments());

        //Setting the android ListView's adapter to the newly created adapted
        //lvLoyaltyCards.setAdapter(loyaltyCardAdapter);
        lvLoyaltyCards.setAdapter(esd);
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
}
