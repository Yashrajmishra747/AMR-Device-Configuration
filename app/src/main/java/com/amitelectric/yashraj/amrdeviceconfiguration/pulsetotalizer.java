package com.amitelectric.yashraj.amrdeviceconfiguration;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pulsetotalizer extends AppCompatActivity {
Button button1, button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsetotalizer);

        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(pulsetotalizer.this,MainActivity.class);
                startActivity(one);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent two = new Intent(pulsetotalizer.this,ResetTotalizer.class);
                startActivity(two);

            }
        });


    }
}
