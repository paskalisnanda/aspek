package kiel.aspek;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.database.sqlite.SQLiteDatabase;


public class SignUPActivity extends AppCompatActivity
{
    EditText editTextUserName,editTextNPM,editTextPassword,editTextConfirmPassword,editTextEmail;
    Button btnCreateAccount;

    LoginDataBaseAdapter loginDataBaseAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

// get Instance of Database Adapter
        //loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        //loginDataBaseAdapter=loginDataBaseAdapter.open();

// Get Refferences of Views
        editTextUserName=(EditText)findViewById(R.id.editTextUserName);
        editTextNPM=(EditText)findViewById(R.id.editTextNPM);
        editTextPassword=(EditText)findViewById(R.id.editTextPassword);
        editTextConfirmPassword=(EditText)findViewById(R.id.editTextConfirmPassword);
        editTextEmail=(EditText)findViewById(R.id.editTextEmail);

        btnCreateAccount=(Button)findViewById(R.id.buttonCreateAccount);
        btnCreateAccount.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// TODO Auto-generated method stub

                String userName=editTextUserName.getText().toString();
                String NPMnum=editTextNPM.getText().toString();
                //int NPMnum= Integer.parseInt(NPM);
                String password=editTextPassword.getText().toString();
                String confirmPassword=editTextConfirmPassword.getText().toString();
                String email=editTextEmail.getText().toString();

// check if any of the fields are vaccant
                if(userName.equals("")||password.equals("")||confirmPassword.equals(""))
                {
                    Toast.makeText(getApplicationContext(), "Field Vaccant", Toast.LENGTH_LONG).show();
                    return;
                }
// check if both password matches
                if(!password.equals(confirmPassword))
                {
                    Toast.makeText(getApplicationContext(), "Password does not match", Toast.LENGTH_LONG).show();
                    return;
                }
                else
                {
// Save the Data in Database
                    //loginDataBaseAdapter.insertEntry(userName, NPMnum, password, email);
                    // TODO Auto-generated method stub
                    /*SQLiteDatabase db = DataHelper.getWritableDatabase();
                    db.execSQL ("insert into login (username, npm, password, email) values ('"+
                            editTextUserName.getText().toString()+"','"+
                            editTextNPM.getText().toString()+"','"+
                            editTextPassword.getText().toString()+"','"+
                            editTextConfirmPassword.getText().toString()+"','"+
                            editTextEmail.getText().toString()+"')");*/
                    Toast.makeText(getApplicationContext(), "Account Successfully Created ", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    @Override
    protected void onDestroy() {
// TODO Auto-generated method stub
        super.onDestroy();

        loginDataBaseAdapter.close();
    }
}


