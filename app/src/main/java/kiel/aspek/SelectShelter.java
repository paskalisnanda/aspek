package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SelectShelter extends AppCompatActivity implements OnItemSelectedListener {
    String shelter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_shelter);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinner);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> shelter = new ArrayList<String>();
        shelter.add("PAU");
        shelter.add("Perpustakaan");
        shelter.add("FIB");
        shelter.add("Masjid UI");
        shelter.add("FISIP");
        shelter.add("FEB");
        shelter.add("FT");
        shelter.add("Pusgiwa");
        shelter.add("FMIPA");
        shelter.add("FKM");
        shelter.add("Pondok Cina");
        shelter.add("Stasiun UI");
        shelter.add("Asrama");
        shelter.add("Wiramakara");
        shelter.add("Pau Danau");
        shelter.add("Balai Sidang");

        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, shelter);


        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    public void SelesaiPilihHalte(View view) {
        //loginDataBaseAdapter.insertEntry(asal,shelter,bike,npm);
        Intent intentSelesaiPilihHalte=new Intent(getApplicationContext(),InputBike.class);
        startActivity(intentSelesaiPilihHalte);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Spinner spinner = (Spinner) parent;
        if(spinner.getId() == R.id.spinnerDestination)
        {
            // On selecting a spinner item
            shelter = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item
            //Toast.makeText(parent.getContext(), "Selected: " + shelter, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
