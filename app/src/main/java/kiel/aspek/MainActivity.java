package kiel.aspek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button  btnOfficer, btnStudent, btnHelp;
    //ImageButton btnOfficer, btnStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// Get The Refference Of Buttons
        btnOfficer = (Button) findViewById(R.id.buttonOfficer);
        btnStudent = (Button) findViewById(R.id.buttonStudent);
        btnHelp = (Button) findViewById(R.id.buttonHelp);

// Set OnClick Listener on SignUp button
        btnOfficer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub

/// Create Intent for SignUpActivity abd Start The Activity
                Intent LoginOfficer = new Intent(getApplicationContext(), LoginOfficer.class);
                startActivity(LoginOfficer);
            }
        });
        btnStudent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub

/// Create Intent for SignUpActivity abd Start The Activity
                Intent LoginStudent = new Intent(getApplicationContext(), LoginStudent.class);
                startActivity(LoginStudent);
            }
        });
        btnHelp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent user_manual = new Intent(getApplicationContext(), UserManual2.class);
                startActivity(user_manual);
            }
        });

    }
}

