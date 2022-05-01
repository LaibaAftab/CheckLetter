package com.example.checkletters;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String sky[]={"b","d","f" ,"h" ,"k" ,"l" ,"t" };
    String grass[]={"a","c","i","e" ,"m","n","o","r" ,"s" ,"u" ,"v" ,"w" ,"x"  };
    String root[]={"g","y","p" ,"j" ,"q","z" };
    TextView txt;
    TextView result;
    String randomizedCharacter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView3);
        result = findViewById(R.id.textView4);

        Random random = new Random();

        char randomm= (char) (random.nextInt(26) + 'a');
        randomizedCharacter=Character.toString(randomm);
        txt.setText(randomizedCharacter);

    }

    public void checksky(View view) {
        for(int i=0;i<sky.length;i++)
        {
            if(sky[i].equals(randomizedCharacter))
            {
                result.setText("Correct");
                break;
            }
            else
            {
                result.setText("Incorrect");
            }
        }
    }

    public void checkroot(View view) {
        for(int i=0;i< root.length;i++)
        {
            if(root[i].equals(randomizedCharacter))
            {
                result.setText("Correct");
                break;
            }
            else
            {
                result.setText("Incorrect");
            }
        }
    }

    public void checkgrass(View view) {
        for(int i=0;i<grass.length;i++)
        {
            if(grass[i].equals(randomizedCharacter))
            {
                result.setText("Correct");
                break;
            }
            else
            {
                result.setText("Incorrect");
            }
        }
    }
}