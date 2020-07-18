package android.example.specialcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SimpleCal extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMultiply, buttonDecimal, buttonC, buttonEqual;

    EditText ResultText;

    float mValueOne, mValueTwo;

    boolean Addition,Subtraction,Division,Multiply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_cal);

        button0 =(Button) findViewById(R.id.ButtonZero);
        button1 =(Button) findViewById(R.id.ButtonOne);
        button2 =(Button) findViewById(R.id.ButtonTwo);
        button3 =(Button) findViewById(R.id.ButtonThree);
        button4 =(Button) findViewById(R.id.ButtonFour);
        button5 =(Button) findViewById(R.id.ButtonFive);
        button6 =(Button) findViewById(R.id.ButtonSix);
        button7 =(Button) findViewById(R.id.ButtonSeven);
        button8 =(Button) findViewById(R.id.ButtonEight);
        button9 =(Button) findViewById(R.id.ButtonNine);
        buttonAdd =(Button) findViewById(R.id.AdditionButton);
        buttonSub =(Button) findViewById(R.id.SubtractButton);
        buttonDivision =(Button) findViewById(R.id.DivisionButton);
        buttonMultiply =(Button) findViewById(R.id.MultiplyButton);
        buttonDecimal =(Button) findViewById(R.id.ButtonDecimal);
        buttonC =(Button) findViewById(R.id.ButtonClear);
        buttonEqual =(Button) findViewById(R.id.ButtonEqual);
        ResultText=(EditText) findViewById(R.id.result);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() +  "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText(ResultText.getText() + "0");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ResultText == null) {
                    ResultText.setText("");
                } else {
                    mValueOne = Integer.parseInt(ResultText.getText() + "");
                    Addition = true;
                    ResultText.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ResultText == null){
                    ResultText.setText("");
                } else {
                    mValueOne = Integer.parseInt(ResultText.getText() + "");
                    Subtraction = true;
                    ResultText.setText(null);
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ResultText == null){
                    ResultText.setText("");
                } else {
                    mValueOne = Integer.parseInt(ResultText.getText() + "");
                    Division = true;
                    ResultText.setText(null);
                }
            }
        });

        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(ResultText == null){
                    ResultText.setText("");
                } else {
                    mValueOne = Integer.parseInt(ResultText.getText() + "");
                    Multiply = true;
                    ResultText.setText(null);
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Integer.parseInt(ResultText.getText() + "");


                if(Addition == true){
                    ResultText.setText(mValueOne + mValueTwo + "");

                    Addition = false;
                }

                if (Subtraction == true)
                    ResultText.setText(mValueOne - mValueTwo + "");
                    Subtraction = false;

                if (Multiply == true)
                    ResultText.setText(mValueOne * mValueTwo + "");
                    Multiply = false;

                if (Division == true)
                    ResultText.setText(mValueOne / mValueTwo + "");
                    Division = false;
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ResultText.setText("");
            }
        });
    }
}