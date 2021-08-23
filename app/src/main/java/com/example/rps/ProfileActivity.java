package com.example.rps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfileActivity extends AppCompatActivity {
    Button openWhatsApp, openTelegram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        openWhatsApp = findViewById(R.id.btn_whats_app);
        openTelegram=findViewById(R.id.btn_telegram);

        openWhatsApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://api.whatsapp.com/send?phone=+996553777150"));
                intent.setPackage("com.whatsapp");
                startActivity(intent);
            }
        });
        openTelegram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent();
                Intent.setAction(Intent.ACTION_SEND);
                Intent.putExtra(Intent.EXTRA_TEXT,"Muhlis");
                Intent.setType("text/plain")  ;
                startActivity(Intent.createChooser(Intent,"Поделиться"));
            }
        });
    }

}