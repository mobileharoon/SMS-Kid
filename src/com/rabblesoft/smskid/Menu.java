package com.rabblesoft.smskid;

import android.app.LocalActivityManager;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import android.widget.Toast;

public class Menu extends TabActivity {
	
	public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.menu);

    Resources res = getResources(); // Resource object to get Drawables
    final TabHost tabHost = getTabHost();  // The activity TabHost
    TabHost.TabSpec spec;  // Resusable TabSpec for each tab
    Intent intent;  // Reusable Intent for each tab

    // Create an Intent to launch an Activity for the tab (to be reused)
    intent = new Intent().setClass(this, Testing.class);

    // Initialize a TabSpec for each tab and add it to the TabHost
    spec = tabHost.newTabSpec("testing").setIndicator("Testing",
                      res.getDrawable(R.drawable.testing))
                  .setContent(intent);
    tabHost.addTab(spec);

    // Do the same for the other tabs
    intent = new Intent().setClass(this, Log.class);
    spec = tabHost.newTabSpec("log").setIndicator("Log",
                      res.getDrawable(R.drawable.log))
                  .setContent(intent);
    tabHost.addTab(spec);

    intent = new Intent().setClass(this, Settings.class);
    spec = tabHost.newTabSpec("settings").setIndicator("Settings",
                      res.getDrawable(R.drawable.settings))
                  .setContent(intent);
    tabHost.addTab(spec);

    tabHost.setCurrentTab(2);

	



	//Tab Listener to extract the prefs2
tabHost.setOnTabChangedListener(new OnTabChangeListener() {
public void onTabChanged(String tabId) {

//	       LocalActivityManager manager = getLocalActivityManager();
  //      manager.destroyActivity("testing", true);
    //    manager.startActivity("testing", new Intent(Menu.this, Testing.class));

}

});

	
}

}