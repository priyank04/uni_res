package com.example.prapti.uni_res;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutUs extends AppCompatActivity {

    TextView call , mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        call = findViewById(R.id.callus);
        mail = findViewById(R.id.mail);




    }
}
