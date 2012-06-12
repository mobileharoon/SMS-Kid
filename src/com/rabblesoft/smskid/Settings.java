package com.rabblesoft.smskid;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Settings extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        
        
        final SharedPreferences smsSettings = Settings.this.getSharedPreferences("message_settings", Settings.this.MODE_PRIVATE);
        String value = smsSettings.getString("started", null);      
        
        if (value == null) {
            SharedPreferences.Editor prefEditor = smsSettings.edit();
            prefEditor.putString("message", "-not set-");
            
            prefEditor.commit();
        }
          
        final Button settingsButton = (Button) findViewById(R.id.saveSettings);
        settingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
               
            	SharedPreferences.Editor prefEditor = smsSettings.edit();
            	
		        EditText form_phonenumber = (EditText) findViewById(R.id.editTextPhoneNo);    
		        EditText form_textSMS = (EditText) findViewById(R.id.editTextSMS);    
		        EditText form_intervalSet = (EditText) findViewById(R.id.intervalset);            
		        EditText form_timeoutSet = (EditText) findViewById(R.id.timeoutset);    
		        EditText form_userID = (EditText) findViewById(R.id.userid);            
		        EditText form_password = (EditText) findViewById(R.id.password);            
		        EditText form_from = (EditText) findViewById(R.id.from);            
		        EditText form_to = (EditText) findViewById(R.id.to);            
		        EditText form_subject = (EditText) findViewById(R.id.subject);            
		        EditText form_body = (EditText) findViewById(R.id.body);                  	
            	 	
                String f_phonenumber = form_phonenumber.getText().toString();
                String f_textSMS = form_textSMS.getText().toString();
                String f_intervalSet = form_intervalSet.getText().toString();                
                String f_timeoutSet = form_timeoutSet.getText().toString();
                String f_userID = form_userID.getText().toString();                
                String f_password = form_password.getText().toString();
                String f_from = form_from.getText().toString();                
                String f_to = form_to.getText().toString();                
                String f_subject = form_subject.getText().toString();                
                String f_body = form_body.getText().toString();                
          
                
                ////////////////////////////////
                // redo this to make it shorter
                ///////////////////////////////
                if (f_phonenumber.length() > 1)
                {
                	prefEditor.putString("phonenumber", f_phonenumber);
                }
                if (f_textSMS.length() > 1)
                {
                	prefEditor.putString("textSMS", f_textSMS);
                }                
                if (f_intervalSet.length() > 1)
                {
                	prefEditor.putString("intervalSet", f_intervalSet);
                }                
                 if (f_timeoutSet.length() > 1)
                {
                	prefEditor.putString("timeoutSet", f_timeoutSet);
                }               
                if (f_userID.length() > 1)
                {
                	prefEditor.putString("userID", f_userID);
                }                
                if (f_password.length() > 1)
                {
                	prefEditor.putString("password", f_password);
                }                
                if (f_from.length() > 1)
                {
                	prefEditor.putString("from", f_from);
                }                
                if (f_to.length() > 1)
                {
                	prefEditor.putString("to", f_to);
                }
                if (f_subject.length() > 1)
                {
                	prefEditor.putString("subject", f_subject);
                }
                if (f_body.length() > 1)
                {
                	prefEditor.putString("body", f_body);
                }

                
                prefEditor.commit();
            
            }
        });


    }
}