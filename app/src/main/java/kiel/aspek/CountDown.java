package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.util.concurrent.TimeUnit;

public class CountDown extends AppCompatActivity {

    CountDownTimer countdowntimer;
    Button buttonCancel;
    TextView textview;
    Intent intentSelesaiPilih;
    Bundle informasi ;
    String userName ;
    String password;
    String asal;

    private static final String FORMAT = "%02d:%02d:%02d";
    int seconds , minutes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down);

        intentSelesaiPilih = getIntent();
        informasi = intentSelesaiPilih.getExtras();
        userName = informasi.getString("userName");
        password = informasi.getString("password");
        asal = informasi.getString("asal");

        buttonCancel = (Button)findViewById(R.id.CancelButton);
        textview = (TextView)findViewById(R.id.textView4);

        countdowntimer = new CountDownTimerClass(1800000, 1000);
        countdowntimer.start();
        buttonCancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                countdowntimer.cancel();
                Toast toast = Toast.makeText (getApplicationContext(), "Pesanan Dibatalkan", Toast.LENGTH_LONG);
                toast.show();
                finish();
                //tinggal masukin fungsi delete di sini
            }
        });
    }

    public class CountDownTimerClass extends CountDownTimer {

        public CountDownTimerClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {
            /*int progress = (int) (millisUntilFinished/1000);
            textview.setText(Integer.toString(progress));*/
            textview.setText(""+String.format(FORMAT,
                    TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                    TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                            TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                    TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                            TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));

        }

        @Override
        public void onFinish() {

            textview.setText(" Waktu habis, harap pesan kembali");
            //tinggal masukin fungsi delete di sini

        }
    }

    @Override
    public void onBackPressed()
    {

    }
}
