package net.dusktech.com.ueesonbudget;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private AppCompatImageView kawkaImage;
    ArrayList<String> restList = new ArrayList<String>();
    private AppCompatImageView sambolonImage;
    private AppCompatImageView persaImage;
    private AppCompatImageView redCrabImage;
    private AppCompatImageView ilbuccoImage;
    private static final String TAG = "Main2Activity";
    private SearchView searchView;
    private ArrayPriceRange priceRange = new ArrayPriceRange();
    private AppCompatImageView caramelImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        searchView = findViewById(R.id.search);
        kawkaImage = findViewById(R.id.kawkaImage);
        sambolonImage = findViewById(R.id.sambolonImage);
        persaImage = findViewById(R.id.persaImage);
        redCrabImage = findViewById(R.id.redcrabImage);
        ilbuccoImage = findViewById(R.id.ilbuccoImage);
        caramelImage = findViewById(R.id.caramelImage);
        Log.d(TAG, "onCreate: " + priceRange);

        Toast.makeText(Main2Activity.this,
                "Bienvenido!",
                Toast.LENGTH_SHORT).show();


        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // collapse the view ?
                //menu.findItem(R.id.menu_search).collapseActionView();

                Log.e("queryText", query);

                restList = priceRange.getList(query);

                kawkaImage.setVisibility(View.GONE);
                sambolonImage.setVisibility(View.GONE);
                persaImage.setVisibility(View.GONE);
                redCrabImage.setVisibility(View.GONE);
                ilbuccoImage.setVisibility(View.GONE);
                caramelImage.setVisibility(View.GONE);
                Log.d(TAG, "onQueryTextSubmit: ");
                if (!restList.isEmpty()) {
                    for (int i = 0; i < restList.size(); i++) {
                        if (restList.get(i).equals("kawka")) {
                            kawkaImage.setVisibility(View.VISIBLE);
                        }
                        if (restList.get(i).contains("sambolon")) {
                            sambolonImage.setVisibility(View.VISIBLE);
                        }
                        if (restList.get(i).contains("persa")) {
                            persaImage.setVisibility(View.VISIBLE);
                        }
                        if (restList.get(i).contains("redcrab")) {
                            redCrabImage.setVisibility(View.VISIBLE);
                        }
                        if (restList.get(i).contains("ilbucco")) {
                            ilbuccoImage.setVisibility(View.VISIBLE);
                        }
                        if (restList.get(i).contains("caramel")) {
                            caramelImage.setVisibility(View.VISIBLE);
                        }
                    }
                } /*else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getApplicationContext());
                    builder.setCancelable(true);
                    builder.setTitle("Error");
                    builder.setMessage("No hay resultadoe en la busqueda");
                    builder.setPositiveButton("Confirm",
                            new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    kawkaImage.setVisibility(View.VISIBLE);
                                    sambolonImage.setVisibility(View.VISIBLE);
                                    persaImage.setVisibility(View.VISIBLE);
                                    redCrabImage.setVisibility(View.VISIBLE);
                                    ilbuccoImage.setVisibility(View.VISIBLE);
                                    caramelImage.setVisibility(View.VISIBLE);
                                }
                            });

                    AlertDialog dialog = builder.create();
                    dialog.show();
                }*/
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // search goes here !!
                // listAdapter.getFilter().filter(query)
                Log.e("queryText", newText);

                return false;
            }
        });

        searchView.setOnCloseListener(new SearchView.OnCloseListener() {
            @Override
            public boolean onClose() {
                kawkaImage.setVisibility(View.VISIBLE);
                sambolonImage.setVisibility(View.VISIBLE);
                persaImage.setVisibility(View.VISIBLE);
                redCrabImage.setVisibility(View.VISIBLE);
                ilbuccoImage.setVisibility(View.VISIBLE);
                caramelImage.setVisibility(View.VISIBLE);
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
        sambolonImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kawkaIntent = new Intent(getApplicationContext(), RestauranteActivity.class);
                startActivity(kawkaIntent);
            }
        });
        persaImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kawkaIntent = new Intent(getApplicationContext(), RestauranteActivity.class);
                startActivity(kawkaIntent);
            }
        });
        redCrabImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kawkaIntent = new Intent(getApplicationContext(), RestauranteActivity.class);
                startActivity(kawkaIntent);
            }
        });
        ilbuccoImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kawkaIntent = new Intent(getApplicationContext(), RestauranteActivity.class);
                startActivity(kawkaIntent);
            }
        });
        caramelImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kawkaIntent = new Intent(getApplicationContext(), RestauranteActivity.class);
                startActivity(kawkaIntent);
            }
        });

    }
}