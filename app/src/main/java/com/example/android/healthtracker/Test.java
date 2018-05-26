package com.example.android.healthtracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test extends AppCompatActivity {
    int count=0;
    Button yes, no, score;
    TextView z1,z2,z3,z4,z5,z6,z7,z8,z9,z10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        yes=(Button)findViewById(R.id.yes);
        no=(Button)findViewById(R.id.no);
        score=(Button)findViewById(R.id.score);
        z10= (TextView)findViewById(R.id.z10);

        score.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                z10.setText("Score= " + count);
            }
        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count--;
            }
        });
    }
}
