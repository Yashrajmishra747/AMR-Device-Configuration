package com.amitelectric.yashraj.amrdeviceconfiguration;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    EditText DeviceNumber, PeriodicTime, MF, ID, Server1, Server2, Server3, Alert1, Alert2, SensorLowPoint, SensorHighPoint;
    FloatingActionButton SendButton;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DeviceNumber  = (EditText) findViewById(R.id.DeviceNumber);
        PeriodicTime  = (EditText) findViewById(R.id.PeriodicTime);
        MF  = (EditText) findViewById(R.id.MF);
        ID  = (EditText) findViewById(R.id.ID);
        Server1  = (EditText) findViewById(R.id.Server1);
        Server2  = (EditText) findViewById(R.id.Server2);
        Server3  = (EditText) findViewById(R.id.Server3);
        Alert1  = (EditText) findViewById(R.id.Alert1);
        Alert2  = (EditText) findViewById(R.id.Alert2);
        SensorLowPoint  = (EditText) findViewById(R.id.SensorLowPoint);
        SensorHighPoint  = (EditText) findViewById(R.id.SensorHighPoint);

        SendButton = (FloatingActionButton) findViewById(R.id.MessageSendButton);


        SendButton.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {



              String PeriodicTimes = PeriodicTime.getText().toString();
              String MFs = MF.getText().toString();
              String IDs = ID.getText().toString();
              String Server1s = Server1.getText().toString();
              String Server2s = Server2.getText().toString();
              String Server3s = Server3.getText().toString();
              String Alert1s = Alert1.getText().toString();
              String Alert2s = Alert2.getText().toString();
              String SensorLowPoints = SensorLowPoint.getText().toString();
              String SensorHighPoints = SensorHighPoint.getText().toString();

              String Message = "849111103:" + PeriodicTimes + "," + MFs + "," + IDs + "," + Server1s + "," + Server2s + "," + Server3s + "," +Alert1s + "," + Alert2s + "," + SensorLowPoints + "," +SensorHighPoints + ",";
              String Number = DeviceNumber.getText().toString();




              Uri uri = Uri.parse("smsto:" + Number);
              Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
              intent.putExtra("sms_body", Message);
              startActivity(intent);



         }
        });




    }
}
