package com.amitelectric.yashraj.amrdeviceconfiguration;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ResetTotalizer extends AppCompatActivity {

    Button button1;
    EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_totalizer);

        button1 = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String TotalizeerValue = editText.getText().toString();
                String DeviceNumber1 = editText2.getText().toString();
                String Message = "84911103:RESET TOTAL=" + TotalizeerValue + "=";

/* Uri uri = Uri.parse("smsto:" + DeviceNumber1);
                Intent intent = new Intent(Intent.ACTION_SENDTO, uri);
                intent.putExtra("sms_body", Message);
                startActivity(intent);*/


                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(DeviceNumber1, null, Message, null, null);

                AlertDialog.Builder alertDialogBuilder  = new AlertDialog.Builder(ResetTotalizer.this);
                alertDialogBuilder.setMessage("Command Sent");
                alertDialogBuilder.show();


            }
        });

    }
}
