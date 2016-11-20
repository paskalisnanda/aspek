package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OfficerMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer_menu);
    }
    public void InputBike(View view) {
        Intent intentInputBike=new Intent(getApplicationContext(),InputBike.class);
        startActivity(intentInputBike);
    }
    public void ReceiveBike(View view) {
        Intent intentReceiveBike=new Intent(getApplicationContext(),ReceiveBike.class);
        startActivity(intentReceiveBike);
    }
    public void AcceptBike(View view) {
        Intent intentAcceptBike=new Intent(getApplicationContext(),AcceptBike.class);
        startActivity(intentAcceptBike);
    }
}
