package io.github.sambhav2612.diwalilights;

import java.util.Random;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

import static android.graphics.Color.RED;
import static android.os.SystemClock.sleep;

public class MainActivity extends AppCompatActivity {

    Button b1 = null, b2 = null, b3 = null, b4 = null, b5 = null, btn = null;
    RelativeLayout rel = null;
    int ct = 0;

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

        rel = (RelativeLayout)findViewById(R.id.layout);

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rel.setBackgroundColor(Color.BLUE);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rel.setBackgroundColor(Color.GREEN);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rel.setBackgroundColor(Color.WHITE);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rel.setBackgroundColor(RED);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                rel.setBackgroundColor(Color.BLACK);
            }
        });

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                ct = 0;
                while (ct++<10) {
                    int clr[] = {Color.BLUE, Color.RED, Color.GREEN, Color.WHITE, Color.BLACK};
                    Random random = new Random();
                    int i = random.nextInt(clr.length - 1);
                    rel.setBackgroundColor(clr[i]);
                    sleep(10);
                }
            }
        });

    }
}
