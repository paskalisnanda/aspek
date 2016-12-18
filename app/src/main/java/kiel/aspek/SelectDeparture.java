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


public class SelectDeparture extends AppCompatActivity implements OnItemSelectedListener{
    //@Override
    String shelter;
    Intent LoginStudent;
    Bundle loginInfo;
    String userName;
    String password;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_departure);

        LoginStudent = getIntent();
        loginInfo = LoginStudent.getExtras();
        userName = loginInfo.getString("userName");
        password = loginInfo.getString("password");
        // Spinner element
        Spinner spinner = (Spinner) findViewById(R.id.spinnerDeparture);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> shelter = new ArrayList<String>();
        shelter.add("Pilih Halte");
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
        shelter = parent.getItemAtPosition(position).toString();

        // Showing selected spinner item
        if (!shelter.equals("Pilih Halte")){
            Toast.makeText(parent.getContext(), "Selected: " + shelter, Toast.LENGTH_LONG).show();
        }

    }
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub
    }

    public void PilihHalte(View view) {
        Intent intentPilihTujuan=new Intent(getApplicationContext(),SelectDestination.class);
        Bundle informasi = new Bundle();
        informasi.putString("userName",userName);
        informasi.putString("password",password);
        informasi.putString("asal",shelter);
        intentPilihTujuan.putExtras(informasi);
        startActivity(intentPilihTujuan);

    }
}
