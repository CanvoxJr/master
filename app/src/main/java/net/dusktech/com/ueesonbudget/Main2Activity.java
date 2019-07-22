package net.dusktech.com.ueesonbudget;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.SearchView;

import com.google.android.material.textfield.TextInputEditText;

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
    private TextInputEditText minVal;
    private TextInputEditText maxVal;
    //RangeSeekBar rangeSeekBar;

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
        minVal = findViewById(R.id.minVal);
        maxVal = findViewById(R.id.maxVal);

        minVal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!minVal.getText().toString().isEmpty()) {
                    restList = priceRange.getListMin(minVal.getText().toString());

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
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
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
                        builder.setNegativeButton("Exit",
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
                    }
                } else {
                    kawkaImage.setVisibility(View.VISIBLE);
                    sambolonImage.setVisibility(View.VISIBLE);
                    persaImage.setVisibility(View.VISIBLE);
                    redCrabImage.setVisibility(View.VISIBLE);
                    ilbuccoImage.setVisibility(View.VISIBLE);
                    caramelImage.setVisibility(View.VISIBLE);
                }
            }
        });

        maxVal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (!maxVal.getText().toString().isEmpty()) {
                    restList = priceRange.getListMax(maxVal.getText().toString());

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
                    } else {
                        AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
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
                        builder.setNegativeButton("Exit",
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
                    }
                } else {
                    kawkaImage.setVisibility(View.VISIBLE);
                    sambolonImage.setVisibility(View.VISIBLE);
                    persaImage.setVisibility(View.VISIBLE);
                    redCrabImage.setVisibility(View.VISIBLE);
                    ilbuccoImage.setVisibility(View.VISIBLE);
                    caramelImage.setVisibility(View.VISIBLE);
                }
            }
        });
        /*rangeSeekBar = findViewById(R.id.rangeseekbar);
        final CrystalRangeSeekbar rangeSeekbar = findViewById(R.id.rangeSeekbar1);
        //final TextView tvMin = (TextView) rootView.findViewById(R.id.textMin1);
        //final TextView tvMax = (TextView) rootView.findViewById(R.id.textMax1);

        Log.d(TAG, "onCreate: " + priceRange);

        rangeSeekBar.setSelectedMaxValue(100);
        rangeSeekBar.setSelectedMinValue(0);
        rangeSeekBar.setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Number minValue, Number maxValue) {
                Number minVal = bar.getSelectedMinValue();
                Number maxVal = bar.getSelectedMaxValue();
                float min = (float) minVal;
                float max = (float) maxVal;
                Log.d(TAG, "onRangeSeekBarValuesChanged: Min" + min);
                Log.d(TAG, "onRangeSeekBarValuesChanged: Max" + max);
            }
        });


        // set listener
        rangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {

            }
        });

// set final value listener
        rangeSeekbar.setOnRangeSeekbarFinalValueListener(new OnRangeSeekbarFinalValueListener() {
            @Override
            public void finalValue(Number minValue, Number maxValue) {
                Log.d(TAG, "onRangeSeekBarValuesChanged: Min" + minValue);
                Log.d(TAG, "onRangeSeekBarValuesChanged: Max" + maxValue);
            }
        });*/

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
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(Main2Activity.this);
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
                    builder.setNegativeButton("Exit",
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
                }
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