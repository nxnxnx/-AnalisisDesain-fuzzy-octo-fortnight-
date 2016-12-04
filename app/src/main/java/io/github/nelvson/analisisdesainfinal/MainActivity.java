package io.github.nelvson.analisisdesainfinal;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
            }
        });
    }
}
/*
android:id="@+id/inputUsername"
android:id="@+id/inputPassword"
android:id="@+id/loginButton"
 */