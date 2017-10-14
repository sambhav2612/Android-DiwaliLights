package io.github.sambhav2612.diwalilights;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    Button b1 = null, b2 = null, b3 = null, b4 = null, b5 = null, btn = null;
    RelativeLayout rel = null;
    Random random = new Random();
    int clr[] = {Color.BLUE, Color.RED, Color.GREEN, Color.YELLOW};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.up);
        b2 = (Button) findViewById(R.id.left);
        b3 = (Button) findViewById(R.id.reset);
        b4 = (Button) findViewById(R.id.right);
        b5 = (Button) findViewById(R.id.down);
        btn = (Button) findViewById(R.id.random);

        rel = (RelativeLayout) findViewById(R.id.layout);
    }

    public void up(View view) {
        rel.setBackgroundColor(Color.BLUE);
    }

    public void left(View view) {
        rel.setBackgroundColor(Color.GREEN);
    }

    public void reset(View view) {
        rel.setBackgroundColor(Color.WHITE);
    }

    public void right(View view) {
        rel.setBackgroundColor(Color.RED);
    }

    public void down(View view) {
        rel.setBackgroundColor(Color.YELLOW);
    }

    public void random(View view){
        int ct = 0, i;

        while (ct++<10) {
            i = random.nextInt(clr.length);
            rel.setBackgroundColor(clr[i]);
        }
    }

}
