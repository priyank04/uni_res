package com.example.prapti.uni_res;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class choose_Department extends AppCompatActivity {
    ImageView home , cspit , depstar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose__department);

        home = findViewById(R.id.home);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_Department.this,HomeActivity.class);
                startActivity(intent);
            }
        });

        cspit = findViewById(R.id.cspit);
        depstar = findViewById(R.id.depstar);

        cspit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_Department.this,HomeActivity.class);
                startActivity(intent);
            }
        });
        depstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(choose_Department.this,HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}
