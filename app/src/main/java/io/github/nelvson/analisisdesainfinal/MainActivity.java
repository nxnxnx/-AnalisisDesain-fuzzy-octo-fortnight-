package io.github.nelvson.analisisdesainfinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b;
    EditText usernameText, passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b = (Button) findViewById(R.id.loginButton);
        usernameText = (EditText) findViewById(R.id.inputUsername);
        passwordText = (EditText) findViewById(R.id.inputPassword);
        final Context context = this;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (usernameText.getText().toString().equals("nelvson")&&
                        passwordText.getText().toString().equals("123")){
                    Intent intent = new Intent(context, WelcomePage.class);
                    startActivity(intent);
                }
                else {
                    Context toastContext = getApplicationContext();
                    CharSequence toastOut = "Wrong username/password combination";
                    int duration = Toast.LENGTH_SHORT;
                    Toast toast = Toast.makeText(toastContext, toastOut, duration);
                    toast.show();
                }
            }
        });
    }
}
/*
android:id="@+id/inputUsername"
android:id="@+id/inputPassword"
android:id="@+id/loginButton"
 */