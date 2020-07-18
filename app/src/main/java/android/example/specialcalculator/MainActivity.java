package android.example.specialcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button simpleCalc;
    Button advancedCalc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleCalc = (Button) findViewById(R.id.SimpleCal);

        simpleCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openFirstActivity();
            }
        });

        advancedCalc = (Button) findViewById(R.id.AdvancedCal);

        advancedCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OpenSecondActivity();
            }
        });

    }

    public void openFirstActivity(){
        Intent intent = new Intent(this, SimpleCal.class);
        startActivity(intent);

    }

    public void OpenSecondActivity(){
        Intent intent = new Intent(this, AdvancedCalc.class);
        startActivity(intent);
    }
}