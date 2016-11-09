package kiel.aspek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;

public class SelectDeparture extends AppCompatActivity implements OnItemSelectedListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_departure);

        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinnerDeparture);

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

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, shelter);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String shelter = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + shelter, Toast.LENGTH_LONG).show();
    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }
}