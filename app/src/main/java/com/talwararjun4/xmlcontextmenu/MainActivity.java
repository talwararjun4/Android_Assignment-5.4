package com.talwararjun4.xmlcontextmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView)findViewById(R.id.tds);
        registerForContextMenu(textView);
    }
    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        menu.setHeaderTitle("Context Menu");

        getMenuInflater().inflate(R.menu.context_menu_list,menu);
    }
    @Override
    public boolean onContextItemSelected(MenuItem item){
        Toast.makeText(getApplicationContext(),"Selected "+item.getTitle(),Toast.LENGTH_LONG).show();
     return true;
    }
}
