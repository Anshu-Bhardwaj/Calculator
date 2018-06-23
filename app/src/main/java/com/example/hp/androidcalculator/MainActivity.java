package com.example.hp.androidcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0,button1,button2,button3,button4,button5,button6,button7,button8,button9,
    buttonAdd,buttonSubtract,buttonDivide,buttonMul,button10,buttonC,buttonEqual;

    EditText editText;

    float value1,value2;

    boolean Addition,Subtraction,Multiplication,Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        button10=(Button)findViewById(R.id.button10);
        buttonAdd=(Button)findViewById(R.id.buttonAdd);
        buttonSubtract=(Button)findViewById(R.id.buttonSub);
        buttonMul=(Button)findViewById(R.id.buttonMul);
        buttonDivide=(Button)findViewById(R.id.buttonDivide);
        buttonC=(Button)findViewById(R.id.buttonC);
        buttonEqual=(Button) findViewById(R.id.buttonEqual);
        editText=(EditText) findViewById(R.id.editText);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "1");
            }
        });


        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "2");
            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "3");
            }
        });


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "4");
            }
        });


        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "5");
            }
        });


        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "6");
            }
        });


        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "7");
            }
        });


        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "8");
            }
        });


        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ "9");
            }
        });


        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+ "");
                Addition=true;
                editText.setText(null);
            }
        });


        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+ "");
                Subtraction=true;
                editText.setText(null);
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+ "");
                Division=true;
                editText.setText(null);
            }
        });



        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value1=Float.parseFloat(editText.getText()+ "");
                Multiplication=true;
                editText.setText(null);
            }
        });


        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(editText.getText()+ ".");
            }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2=Float.parseFloat(editText.getText()+"");

                  if(Addition==true){
                    editText.setText(value1+value2+"");
                    Addition=false;
                }
                else if(Subtraction==true){
                    editText.setText(value1-value2+"");
                    Subtraction=false;
                }
                else if(Division==true){
                    editText.setText(value1/value2+"");
                    Division=false;
                }
                else if(Multiplication==true){
                    editText.setText(value1*value2+"");
                    Multiplication=false;
                }
            }
        });

    }
}
