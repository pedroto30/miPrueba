package com.example.miprueba;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton google, youtube, whatsapp,facebook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        facebook=findViewById(R.id.bnfacebook);
        whatsapp=findViewById(R.id.bnwhatsapp);
        youtube=findViewById(R.id.bnyoutube);
        google=findViewById(R.id.bngoogle);

        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent facebook=getPackageManager().getLaunchIntentForPackage("com.facebook.lite");
                startActivity(facebook);
            }
        });

        google.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri google= Uri.parse("http://www.google.com");
                Intent intent =new Intent(Intent.ACTION_VIEW,google);
                startActivity(intent);
            }
        });

    }
}