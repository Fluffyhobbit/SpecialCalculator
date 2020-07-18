package android.example.specialcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class AdvancedCalc extends AppCompatActivity {



    Button b1,b2,b3,b4,b5,b6,b7,b8,b9, b0,
           buttonComma, bC , buttonMode;

    EditText resultAdvanced;

    TextView  Result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advanced_calc);

        b1 = (Button) findViewById(R.id.Button1);
        b2 = (Button) findViewById(R.id.Button2);
        b3 = (Button) findViewById(R.id.Button3);
        b4=  (Button) findViewById(R.id.Button4);
        b5=  (Button) findViewById(R.id.Button5);
        b6 = (Button) findViewById(R.id.Button6);
        b7 = (Button) findViewById(R.id.Button7);
        b8 = (Button) findViewById(R.id.Button8);
        b9 = (Button) findViewById(R.id.Button9);
        b0 = (Button) findViewById(R.id.Button0);
        buttonMode = (Button) findViewById(R.id.ModeButton);
        buttonComma = (Button) findViewById(R.id.CommaButton);
        bC = (Button) findViewById(R.id.ClearButton);
        resultAdvanced =  findViewById(R.id.resultAdvanced);
        Result = (TextView) findViewById(R.id.RetrieveResult);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "3");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "4");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "6");
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "7");
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "8");
            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "9");
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + "0");
            }
        });

        buttonComma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText(resultAdvanced.getText() + ",");
            }
        });

       buttonMode.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

             String inputs = resultAdvanced.getText().toString();

             String[] input = inputs.split(",");

             Result.setText(input[0]);

           }
       });

        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultAdvanced.setText("");
            }
        });



    }
}
