package io.github.nelvson.analisisdesainfinal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

/**
 * Created by nelvson on 04/12/16.
 */

public class WelcomePage extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run(){
                Intent intent = new Intent(WelcomePage.this, FrontPage.class);
                WelcomePage.this.startActivity(intent);
                WelcomePage.this.finish();
            }
        },1500);
    }
}
