package com.example.masa1217.sc;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by masa1217 on 2015/09/10.
 */
public class Top extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        //Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
