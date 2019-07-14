package net.dusktech.com.ueesonbudget;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;

public class Main2Activity extends AppCompatActivity {
    private AppCompatImageView kawkaImage;
    private static final String TAG = "Main2Activity";
    private SearchView searchView;
    //private ArrayPriceRange priceRange = new ArrayPriceRange();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        searchView = findViewById(R.id.search);
        kawkaImage = findViewById(R.id.kawkaImage);
        //Log.d(TAG, "onCreate: " + priceRange);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // collapse the view ?
                //menu.findItem(R.id.menu_search).collapseActionView();
                Log.e("queryText", query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // search goes here !!
                // listAdapter.getFilter().filter(query);
                Log.e("queryText", newText);

                return false;
            }
        });


        kawkaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kawkaIntent = new Intent(getApplicationContext(), RestauranteActivity.class);
                startActivity(kawkaIntent);
            }
        });


    }
}
