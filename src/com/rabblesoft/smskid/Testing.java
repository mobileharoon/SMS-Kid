package com.rabblesoft.smskid;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class Testing extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.testing);
        SharedPreferences smsSettings = Testing.this.getSharedPreferences("message_settings", Testing.this.MODE_PRIVATE); 
        
        TextView form_phonenumber = (TextView) findViewById(R.id.phonenumberSettings);    
        TextView form_textSMS = (TextView) findViewById(R.id.editTextSMS);    
        TextView form_intervalSet = (TextView) findViewById(R.id.intervalset);            
        TextView form_timeoutSet = (TextView) findViewById(R.id.timeoutset);    
        TextView form_userID = (TextView) findViewById(R.id.userid);            
        TextView form_password = (TextView) findViewById(R.id.password);            
        TextView form_from = (TextView) findViewById(R.id.from);            
        TextView form_to = (TextView) findViewById(R.id.to);            
        TextView form_subject = (TextView) findViewById(R.id.subject);            
        TextView form_body = (TextView) findViewById(R.id.body);                    
    
        String value_smsSettings = smsSettings.getString("phonenumber", "-not set-");
        String value_textSMS = smsSettings.getString("textSMS", "-not set-");
        String value_intervalSet = smsSettings.getString("intervalSet", "-not set-");        
        String value_timeoutSet = smsSettings.getString("timeoutSet", "-not set-");        
        String value_userID = smsSettings.getString("userID", "-not set-");        
        String value_password = smsSettings.getString("password", "-not set-");        
        String value_from = smsSettings.getString("from", "-not set-");        
        String value_to = smsSettings.getString("to", "-not set-");        
        String value_subject = smsSettings.getString("subject", "-not set-");        
        String value_body = smsSettings.getString("body", "-not set-");        
        
        form_phonenumber.setText(value_smsSettings);   
        form_textSMS.setText(value_textSMS);          
        form_intervalSet.setText(value_intervalSet);            
        form_timeoutSet.setText(value_timeoutSet);            
        form_userID.setText(value_userID);            
        form_password.setText(value_password);            
        form_from.setText(value_from);            
        form_to.setText(value_to);            
        form_subject.setText(value_subject);            
        form_body.setText(value_body);            
        
} 

@Override
public void onResume()
{

    super.onResume();
        SharedPreferences smsSettings = Testing.this.getSharedPreferences("away_message_settings", Testing.this.MODE_PRIVATE); 
        
        TextView form_phonenumber = (TextView) findViewById(R.id.phonenumberSettings);    
        TextView form_textSMS = (TextView) findViewById(R.id.editTextSMS);    
        TextView form_intervalSet = (TextView) findViewById(R.id.intervalset);            
        TextView form_timeoutSet = (TextView) findViewById(R.id.timeoutset);    
        TextView form_userID = (TextView) findViewById(R.id.userid);            
        TextView form_password = (TextView) findViewById(R.id.password);            
        TextView form_from = (TextView) findViewById(R.id.from);            
        TextView form_to = (TextView) findViewById(R.id.to);            
        TextView form_subject = (TextView) findViewById(R.id.subject);            
        TextView form_body = (TextView) findViewById(R.id.body);                    
    
        String value_smsSettings = smsSettings.getString("phonenumber", "-not set-");
        String value_textSMS = smsSettings.getString("textSMS", "-not set-");
        String value_intervalSet = smsSettings.getString("intervalSet", "-not set-");        
        String value_timeoutSet = smsSettings.getString("timeoutSet", "-not set-");        
        String value_userID = smsSettings.getString("userID", "-not set-");        
        String value_password = smsSettings.getString("password", "-not set-");        
        String value_from = smsSettings.getString("from", "-not set-");        
        String value_to = smsSettings.getString("to", "-not set-");        
        String value_subject = smsSettings.getString("subject", "-not set-");        
        String value_body = smsSettings.getString("body", "-not set-");        
        
        form_phonenumber.setText(value_smsSettings);   
        form_textSMS.setText(value_textSMS);          
        form_intervalSet.setText(value_intervalSet);            
        form_timeoutSet.setText(value_timeoutSet);            
        form_userID.setText(value_userID);            
        form_password.setText(value_password);            
        form_from.setText(value_from);            
        form_to.setText(value_to);            
        form_subject.setText(value_subject);            
        form_body.setText(value_body);    

}	

}