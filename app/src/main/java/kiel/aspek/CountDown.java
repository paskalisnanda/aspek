package kiel.aspek;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CountDown extends AppCompatActivity {

    CountDownTimer countdowntimer;
    Button buttonCancel;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count_down);
        buttonCancel = (Button)findViewById(R.id.CancelButton);
        textview = (TextView)findViewById(R.id.textView4);

        countdowntimer = new CountDownTimerClass(1800000, 60000);
        countdowntimer.start();
        buttonCancel.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                countdowntimer.cancel();
                Toast toast = Toast.makeText (getApplicationContext(), "Pesanan Dibatalkan:", Toast.LENGTH_LONG);
                toast.show();
                Intent intentCancel=new Intent(getApplicationContext(),SelectDeparture.class);
                startActivity(intentCancel);

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
            int progress = (int) (millisUntilFinished/1000);
            textview.setText(Integer.toString(progress));

        }

        @Override
        public void onFinish() {

            textview.setText(" Waktu habis, harap pesan kembali");
            //tinggal masukin fungsi delete di sini

        }
    }
}
