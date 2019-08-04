package net.dusktech.com.ueesonbudget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class RestauranteActivity extends AppCompatActivity {
    private AppCompatButton backButton;
    private TextView menu1;
    private TextView menu2;
    private TextView menu3;
    private TextView menu4;
    private TextView menu5;
    private TextView menu6;
    private TextView menu7;

    private TextView valor1;
    private TextView valor2;
    private TextView valor3;
    private TextView valor4;
    private TextView valor5;
    private TextView valor6;
    private TextView valor7;

    private ImageView image;


    List<String> restaurantes = new ArrayList<>();
    Object[] menus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurante);
        backButton = findViewById(R.id.buttonBack);
        menu1 = findViewById(R.id.menu1);
        valor1 = findViewById(R.id.valor1);
        menu2 = findViewById(R.id.menu2);
        valor2 = findViewById(R.id.valor2);
        menu3 = findViewById(R.id.menu3);
        valor3 = findViewById(R.id.valor3);
        menu4 = findViewById(R.id.menu4);
        valor4 = findViewById(R.id.valor4);
        menu5 = findViewById(R.id.menu5);
        valor5 = findViewById(R.id.valor5);
        menu6 = findViewById(R.id.menu6);
        valor6 = findViewById(R.id.valor6);
        menu7 = findViewById(R.id.menu7);
        valor7 = findViewById(R.id.valor7);

        image = findViewById(R.id.logo);

        Intent intent = getIntent();
        String valor = intent.getExtras().getString("valor");

        switch (valor) {
            case "1":
                image.setImageResource(R.mipmap.kawka);
                break;
            case "2":
                image.setImageResource(R.mipmap.sambolon);
                break;
        }

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(backIntent);
            }
        });

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(getApplicationContext(), QrActivity.class);
                startActivity(backIntent);
            }
        });

        String path = "restaurantes/" + valor;
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference(path);

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                List<String> keys = new ArrayList<>();
                for (DataSnapshot keyNode : dataSnapshot.getChildren()) {
                    keys.add(keyNode.getKey());
                    restaurantes.add(keyNode.getValue().toString());
                }
                //menus = restaurantes.toArray();
                //menu1.setText(menus[0].toString());
                menu1.setText(restaurantes.get(0));
                menu2.setText(restaurantes.get(1));
                menu3.setText(restaurantes.get(2));
                menu4.setText(restaurantes.get(3));
                menu5.setText(restaurantes.get(4));
                menu6.setText(restaurantes.get(5));
                menu7.setText(restaurantes.get(6));
                valor1.setText(restaurantes.get(7));
                valor2.setText(restaurantes.get(8));
                valor3.setText(restaurantes.get(9));
                valor4.setText(restaurantes.get(10));
                valor5.setText(restaurantes.get(11));
                valor6.setText(restaurantes.get(12));
                valor6.setText(restaurantes.get(13));

            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
    }
}

