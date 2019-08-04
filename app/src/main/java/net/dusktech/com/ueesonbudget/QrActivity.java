package net.dusktech.com.ueesonbudget;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Random;

public class QrActivity extends AppCompatActivity {

    TextView text;
    private AppCompatButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qr);

        text = findViewById(R.id.text);
        backButton = findViewById(R.id.buttonBack);

        text.setText("GHS" + gen());

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(backIntent);
            }
        });


    }

    public int gen() {
        Random r = new Random( System.currentTimeMillis() );
        return 10000 + r.nextInt(20000);
    }
}
