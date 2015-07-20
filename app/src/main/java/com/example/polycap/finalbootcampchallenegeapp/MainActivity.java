package com.example.polycap.finalbootcampchallenegeapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    private RecyclerView mRecyclerView;
    private MainAdapter mainAdapter;
    private android.support.v7.widget.Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);


        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        ArrayList<list> lists = new ArrayList<>();
        {
            lists.add(new list(
                    "Automated Farming System",
                    "an autonomous machine that can plant, fertilize, irrigate and harvest"
            ));


            lists.add(new list(
                    "Project Sahara",
                    "To revert any desert to a fertile equatorial climate"
            ));

            lists.add(new list(
                    "PolyOcracy",
                    "A new government system that encompasses the technology and social knowledge that we have acquired in past 100's of years "
            ));


            lists.add(new list(
                    "Flying Exoskeleton Suit",
                    "A suit that is safe,can efficiently fly and repair the human body"
            ));

            lists.add(new list(
                    "NanoHealth",
                    "Using advancements in nanotechnology to build a computer that tracks and measure the level of homeostasis each vital cell is at"
            ));

            lists.add(new list(
                    "Civic Engagement App",
                    "An app designed to facilitates the governing process of PolyOcracy by allowing people to vote on national policies right from their phone"
            ));

            lists.add(new list(
                    "Poly.Inc",
                    "A company that creates a culture that transcends borders and unites people to a common goal"
            ));

            lists.add(new list(
                    "Create Paradise",
                    "Rebuild Africa to being the capital city of Earth"
            ));

            mainAdapter = new MainAdapter(this, lists);
            mRecyclerView.setAdapter(mainAdapter);

            mToolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(mToolbar);
            getSupportActionBar().setDisplayShowHomeEnabled(true);

        }

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
