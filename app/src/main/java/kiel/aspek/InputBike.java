package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InputBike extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_input_bike);

        terimainput();
    }

    public void InputAgain(View view) {
        Intent intentInputBike=new Intent(getApplicationContext(),InputBike.class);
        startActivity(intentInputBike);
    }

    public void Done(View view) {
        Intent intentDone=new Intent(getApplicationContext(),OfficerMenu.class);
        startActivity(intentDone);
    }

    public void terimainput(){
        EditText editTextBike1, editTextBike2,editTextBike3, editTextBike4, editTextBike5, editTextBike6, editTextBike7, editTextBike8, editTextBike9, editTextBike10;
        editTextBike1 =(EditText)findViewById(R.id.Bike1);
        editTextBike2 =(EditText)findViewById(R.id.Bike2);
        editTextBike3 =(EditText)findViewById(R.id.Bike3);
        editTextBike4 =(EditText)findViewById(R.id.Bike4);
        editTextBike5 =(EditText)findViewById(R.id.Bike5);
        editTextBike6 =(EditText)findViewById(R.id.Bike6);
        editTextBike7 =(EditText)findViewById(R.id.Bike7);
        editTextBike8 =(EditText)findViewById(R.id.Bike8);
        editTextBike9 =(EditText)findViewById(R.id.Bike9);
        editTextBike10 =(EditText)findViewById(R.id.Bike10);

        String Bike1=editTextBike1.getText().toString();
        String Bike2=editTextBike2.getText().toString();
        String Bike3=editTextBike3.getText().toString();
        String Bike4=editTextBike4.getText().toString();
        String Bike5=editTextBike5.getText().toString();
        String Bike6=editTextBike6.getText().toString();
        String Bike7=editTextBike7.getText().toString();
        String Bike8=editTextBike8.getText().toString();
        String Bike9=editTextBike9.getText().toString();
        String Bike10=editTextBike10.getText().toString();

        //loginDataBaseAdapter.insertEntry(Bike1, Bike2, Bike3, Bike4, Bike5, Bike6, Bike7, Bike8, Bike9, Bike10);

    }
}
