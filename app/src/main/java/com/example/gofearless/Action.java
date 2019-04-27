package com.example.gofearless;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class Action extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action);

        final Button customButtons=findViewById(R.id.custom_button1);
        final Button custonButtons=findViewById(R.id.custom_button2);



        Switch switchEnableButton=findViewById(R.id.switch1);

        customButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        switchEnableButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    customButtons.setEnabled(true);
                }
                else{
                    customButtons.setEnabled(false);
                }
            }
        });
    }
}
