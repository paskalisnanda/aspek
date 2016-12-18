package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Receive_bike extends AppCompatActivity implements View.OnClickListener {
    private Button scanBtn;
    private TextView formatTxt, contentTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_bike);

        scanBtn = (Button)findViewById(R.id.scan_button);
        formatTxt = (TextView)findViewById(R.id.scan_format);
        contentTxt = (TextView)findViewById(R.id.scan_content);
        scanBtn.setOnClickListener(this);
    }

    public void onClick(View v){
        //respond to clicks
        if(v.getId()==R.id.scan_button){
            //scan
            IntentIntegrator scanIntegrator = new IntentIntegrator(this);
            scanIntegrator.initiateScan();
        }
    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent) {
        //retrieve scan result
        IntentResult scanningResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, intent);
        if (scanningResult != null) {
            //we have a result
            String scanContent = scanningResult.getContents();
            Toast toast = Toast.makeText(this, "Content:" + scanContent, Toast.LENGTH_LONG);
            toast.show();
            contentTxt.setText("NPM Pengguna: " + scanContent);
            if(scanContent.equals("1406565884")||scanContent.equals("1406564042")||scanContent.equals("1406605370"))
            {
                formatTxt.setText("Berhasil Meminjam");
            }

            //String storedNPM=loginDataBaseAdapter.getSinlgeEntry(userName); -> BUAT NGAMBIL DATA DARI DATABASE
                /*if(scanContent.equals(storedNPM))
                {
                    Toast.makeText(MainActivity.this, "Congrats: Borrowing succesfull", Toast.LENGTH_LONG).show();
                    toast.show();
                    Intent Officermenu=new Intent(getApplicationContext(),Officermenu.class);
                    startActivity(Officermenu);
                }*/
        } else {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "No scan data received!", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
