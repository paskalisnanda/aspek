package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import android.widget.Toast;




public class OfficerMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_officer_menu);
    }

    public void InputBike(View view) {
        Intent intentInputBike = new Intent(getApplicationContext(), SelectShelter                                                                                                         .class);
        startActivity(intentInputBike);
    }

    public void ReceiveBike(View view) {
        //start the scanning activity from the com.google.zxing.client.android.SCAN intent
        //IntentIntegrator scanIntegrator = new IntentIntegrator(this);
        //scanIntegrator.initiateScan();
        Intent scan = new Intent(getApplicationContext(), Receive_bike.class);
        startActivity(scan);
    }

    /*public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        //retrieve scan result
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
            //we have a result
            String scanContent = scanningResult.getContents();
            Toast toast = Toast.makeText(this, "Content:" + scanContent, Toast.LENGTH_LONG);
            toast.show();
            //String storedNPM=loginDataBaseAdapter.getSinlgeEntry(userName); -> BUAT NGAMBIL DATA DARI DATABASE
                /*if(scanContent.equals(storedNPM))
                {
                    Toast.makeText(MainActivity.this, "Congrats: Borrowing succesfull", Toast.LENGTH_LONG).show();
                    toast.show();
                    Intent Officermenu=new Intent(getApplicationContext(),Officermenu.class);
                    startActivity(Officermenu);
                }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "No scan data received!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }*/

}

