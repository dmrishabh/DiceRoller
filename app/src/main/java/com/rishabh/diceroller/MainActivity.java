package com.rishabh.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioAttributes;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.sql.Time;
import java.util.Random;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {
// 2. variables part
    public static final Random RANDOM = new Random();

    private Button rolldices;
    private ImageView imageView1, imageView2;

   



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




// 3. find everything by id
        rolldices = findViewById(R.id.letRoll);
        imageView1 = findViewById(R.id.dice1);
        imageView2 = findViewById(R.id.dice2);
// 4. make button clickable
        rolldices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // setting value for both dices
                int value1 = randomdiceValue();
                int value2 = randomdiceValue();

                // make a variable which store resource

                int res1 = getResources().getIdentifier("dice"+ value1, "drawable","com.rishabh.diceroller");
                int res2 = getResources().getIdentifier("dice"+ value2, "drawable","com.rishabh.diceroller");

                // set that resources in image view

                imageView1.setImageResource(res1);
                imageView2.setImageResource(res2);

            }
        });

    }
    // 1  . to get random values we made a method
    public  static  int randomdiceValue(){

        return RANDOM.nextInt(6)+1;
    }


}

