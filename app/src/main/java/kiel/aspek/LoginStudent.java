package kiel.aspek;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.app.Activity;
        import android.app.Dialog;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;
        import android.database.sqlite.SQLiteDatabase;

public class LoginStudent extends AppCompatActivity{
    Button btnSignIn,btnSignUp;
    LoginDataBaseAdapter loginDataBaseAdapter;
    String userName;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_student);

// create a instance of SQLite Database
        loginDataBaseAdapter=new LoginDataBaseAdapter(this);
        loginDataBaseAdapter=loginDataBaseAdapter.open();

// Get The Refference Of Buttons
        btnSignIn=(Button)findViewById(R.id.buttonSignIN);
        btnSignUp=(Button)findViewById(R.id.buttonSignUP);

// Set OnClick Listener on SignUp button
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
// TODO Auto-generated method stub

/// Create Intent for SignUpActivity abd Start The Activity
                Intent intentSignUP=new Intent(getApplicationContext(),SignUPActivity.class);
                startActivity(intentSignUP);
            }
        });
    }
    // Methos to handleClick Event of Sign In Button
    public void signIn(View V)
    {
        final Dialog dialog = new Dialog(LoginStudent.this);
        dialog.setContentView(R.layout.login);
        dialog.setTitle("Login");

// get the Refferences of views
        final EditText editTextUserName=(EditText)dialog.findViewById(R.id.editTextUserNameToLogin);
        final EditText editTextPassword=(EditText)dialog.findViewById(R.id.editTextPasswordToLogin);

        Button btnSignIn=(Button)dialog.findViewById(R.id.buttonSignIn);

// Set On ClickListener
        btnSignIn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
// get The User name and Password
                userName=editTextUserName.getText().toString().trim();
                password=editTextPassword.getText().toString().trim();

// fetch the Password form database for respective user name
                String storedPassword=loginDataBaseAdapter.getSinlgeEntry(userName);

// check if the Stored password matches with Password entered by user
                // if(password.equals(storedPassword))
                if(userName.equals("Nanda") && password.equals("1234"))
                {
                    Toast.makeText(LoginStudent.this, "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    Intent selectdeparture=new Intent(LoginStudent.this,SelectDeparture.class);
                    Bundle loginInfo = new Bundle();
                    loginInfo.putString("userName",userName);
                    loginInfo.putString("password",password);
                    selectdeparture.putExtras(loginInfo);
                    startActivity(selectdeparture);
                }
                else if(userName.equals("Kristofer") && password.equals("1234"))
                {
                    Toast.makeText(LoginStudent.this, "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    Intent selectdeparture=new Intent(LoginStudent.this,SelectDeparture.class);
                    Bundle loginInfo = new Bundle();
                    loginInfo.putString("userName",userName);
                    loginInfo.putString("password",password);
                    selectdeparture.putExtras(loginInfo);
                    startActivity(selectdeparture);
                }
                else if(userName.equals("Aqsha") && password.equals("1234"))
                {
                    Toast.makeText(LoginStudent.this, "Congrats: Login Successfull", Toast.LENGTH_LONG).show();
                    dialog.dismiss();
                    Intent selectdeparture=new Intent(LoginStudent.this,SelectDeparture.class);
                    Bundle loginInfo = new Bundle();
                    loginInfo.putString("userName",userName);
                    loginInfo.putString("password",password);
                    selectdeparture.putExtras(loginInfo);
                    startActivity(selectdeparture);
                }
                else
                {
                    Toast.makeText(LoginStudent.this, "User Name or Password does not match", Toast.LENGTH_LONG).show();
                }
            }
        });

        dialog.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
// Close The Database
        loginDataBaseAdapter.close();
    }
}
