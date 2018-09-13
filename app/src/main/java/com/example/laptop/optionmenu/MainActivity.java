package com.example.laptop.optionmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate( R.menu.menu_layout,menu );
        return super.onCreateOptionsMenu( menu );
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.settingMenuId){

            Toast.makeText( MainActivity.this,"Setting is selected",Toast.LENGTH_SHORT ).show();
        }

        else if (item.getItemId()==R.id.shearMenuId){

            Toast.makeText( MainActivity.this,"Shear is selected",Toast.LENGTH_SHORT ).show();
        }

        else if (item.getItemId()==R.id.feetbackMenuId){

            Toast.makeText( MainActivity.this,"Feedback is seclected",Toast.LENGTH_SHORT ).show();
        }
        else {
            Toast.makeText( MainActivity.this,"About us is seclected",Toast.LENGTH_SHORT ).show();
        }

        return super.onOptionsItemSelected( item );
    }
}
