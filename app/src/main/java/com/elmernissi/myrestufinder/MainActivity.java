package com.elmernissi.myrestufinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.elmernissi.myrestufinder.MyAdapter.MyAdapter;
import com.elmernissi.myrestufinder.model.Magasin;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Magasin> magasins; 
    private Spinner citySpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Exemple de données pour le RecyclerView
        magasins = new ArrayList<>();

        //Declarer le Adapter et passer les données magasins

        adapter = new MyAdapter(magasins);

        //setAdapter(adapter) a le recyclerView
        recyclerView.setAdapter(adapter);

        // Initialiser le Spinner
        citySpinner = findViewById(R.id.citySpinner);
        ArrayAdapter<CharSequence> Spinadapter = ArrayAdapter.createFromResource(this,
                R.array.cities, android.R.layout.simple_spinner_item);
        Spinadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        citySpinner.setAdapter(Spinadapter);

        // Ajouter un écouteur de sélection au Spinner


        //Ajouter le menu a l'application
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menuContact) {
            Toast.makeText(this, "Option Contactez-nous sélectionnée", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menuAide) {
            Toast.makeText(this, "Option Aide sélectionnée", Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
}