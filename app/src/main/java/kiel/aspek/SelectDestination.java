package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.List;
import android.widget.ArrayAdapter;

public class SelectDestination extends AppCompatActivity implements OnItemSelectedListener {

    Button btnPilih;

    // @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_destination);

        additemspinner1();
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinnerDestination);

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
        //String[] shelter = getResources().getStringArray(R.array.Shelter);


        Spinner spinner2 = (Spinner) findViewById(R.id.spinnerBike);

        // Spinner click listener
        spinner2.setOnItemSelectedListener(this);
        List<String> NomorSepeda = new ArrayList<String>();
        NomorSepeda.add("1");
        NomorSepeda.add("2");
        NomorSepeda.add("3");
        NomorSepeda.add("4");
        NomorSepeda.add("5");
        NomorSepeda.add("6");
        NomorSepeda.add("7");
        NomorSepeda.add("8");
        NomorSepeda.add("9");
        NomorSepeda.add("10");
        NomorSepeda.add("11");
        NomorSepeda.add("12");
        NomorSepeda.add("13");
        NomorSepeda.add("14");
        NomorSepeda.add("15");
        NomorSepeda.add("16");

        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, shelter);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, NomorSepeda);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner2.setAdapter(dataAdapter2);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        // On selecting a spinner item
        String shelter = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        Toast.makeText(parent.getContext(), "Selected: " + shelter, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public void SelesaiPilih(View view) {
        Intent intentSelesaiPilih=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intentSelesaiPilih);
    }
    public void additemspinner1(){

    }
}



