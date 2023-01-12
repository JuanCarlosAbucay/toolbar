package com.example.eldelbartoolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Messi extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle onSavedInstanceState){
        super.onCreate(onSavedInstanceState);
        setContentView(R.layout.messi_layout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_menu, menu);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.derecha:
                startActivity(new Intent(Messi.this, Harry_Maguire.class));
                return true;
            case R.id.izquierda:
                startActivity(new Intent(Messi.this, Phil_Jones.class));
                return true;
            case R.id.buscar:
                startActivity(new Intent(Messi.this, Buscar.class));
                return true;
            case R.id.perfil:
                startActivity(new Intent(Messi.this, Perfil.class));
                return true;
        }
        return true;
    }
}

