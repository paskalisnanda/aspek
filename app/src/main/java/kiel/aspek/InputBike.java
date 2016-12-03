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
        terimainput();
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
        String Bike1=editTextBike1.getText().toString();

        //loginDataBaseAdapter.insertEntry(Bike1, Bike2, Bike3, Bike4, Bike5, Bike6, Bike7, Bike8, Bike9, Bike10);
    }
}
