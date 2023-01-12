package com.example.eldelbartoolbar;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.List;

public class Buscar extends AppCompatActivity {
    List<String> jugadores = new ArrayList<>();
    @Override
    protected void onCreate(Bundle onSavedInstanceState){
        jugadores.add("Messi");
        jugadores.add("Maguire");
        jugadores.add("Vallejo");
        jugadores.add("Jones");
        jugadores.add("Umtiti");
        super.onCreate(onSavedInstanceState);
        setContentView(R.layout.buscar_layout);
        Button buscar = (Button) findViewById(R.id.search);
        EditText nombre = (EditText) findViewById(R.id.busqueda);
        ImageView imagen = (ImageView) findViewById(R.id.trobat);
        buscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean trobat = false;
                for (int i = 0; i < jugadores.size(); i++){
                    if (nombre.getText().toString().equals(jugadores.get(i))){
                        trobat = true;
                    }
                }
                if (trobat) imagen.setImageResource(R.drawable.trobat);
                else imagen.setImageResource(R.drawable.no_trobat);
            }
        });
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
                startActivity(new Intent(Buscar.this, Messi.class));
                return true;
            case R.id.izquierda:
                startActivity(new Intent(Buscar.this, Phil_Jones.class));
                return true;
            case R.id.buscar:
                startActivity(new Intent(Buscar.this, Buscar.class));
                return true;
            case R.id.perfil:
                startActivity(new Intent(Buscar.this, Perfil.class));
                return true;
        }
        return true;
    }
}
