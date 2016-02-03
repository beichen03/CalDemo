package com.kedacom.wml.democal;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //print aera
    private EditText print = null;
    //number button
    private Button btn0 = null;
    private Button btn1 = null;
    private Button btn2 = null;
    private Button btn3 = null;
    private Button btn4 = null;
    private Button btn5 = null;
    private Button btn6 = null;
    private Button btn7 = null;
    private Button btn8 = null;
    private Button btn9 = null;
    //operator flag
    private Button btnAdd = null;
    private Button btnSub = null;
    private Button btnMul = null;
    private Button btnDiv = null;
    private Button btnEqu = null;
    //
    private Button btnClear = null;
    private Button btnBack = null;

    //first input number
    private static double fistNumber = 0;
    //second inout number
    private static double secondNumber = 0;
    //calculate result
    private static double calResult = 0;// 显示的结果

    private static int op = 0;//判断操作数，
    //click “=” button or no?
    private boolean isClickEqu = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Get Control from layout
        print = (EditText) findViewById(R.id.msg);
        btn0 = (Button) findViewById(R.id.btn0);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "0";
                print.setText(myString);
            }
        });
        btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "1";
                print.setText(myString);
            }
        });
        btn2 = (Button) findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "2";
                print.setText(myString);
            }
        });
        btn3 = (Button) findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "3";
                print.setText(myString);
            }
        });
        btn4 = (Button) findViewById(R.id.btn4);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "4";
                print.setText(myString);
            }
        });
        btn5 = (Button) findViewById(R.id.btn5);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "5";
                print.setText(myString);
            }
        });
        btn6 = (Button) findViewById(R.id.btn6);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "6";
                print.setText(myString);
            }
        });
        btn7 = (Button) findViewById(R.id.btn7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "7";
                print.setText(myString);
            }
        });
        btn8 = (Button) findViewById(R.id.btn8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "8";
                print.setText(myString);
            }
        });
        btn9 = (Button) findViewById(R.id.btn9);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(isClickEqu)
                {
                    print.setText(null);
                    isClickEqu = false;
                }
                String myString = print.getText().toString();
                myString += "9";
                print.setText(myString);
            }
        });
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myStringAdd = print.getText().toString();
                if(myStringAdd.equals(null))
                {
                    return;
                }
                fistNumber = Double.valueOf(myStringAdd);
                print.setText(null);
                op = 1;
                isClickEqu = false;
            }
        });
        btnSub = (Button) findViewById(R.id.btnSub);
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myStringSub = print.getText().toString();
                if(myStringSub.equals(null))
                {
                    return;
                }
                fistNumber = Double.valueOf(myStringSub);
                print.setText(null);
                op = 2;
                isClickEqu = false;
            }
        });
        btnMul = (Button) findViewById(R.id.btnMul);
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myStringMul = print.getText().toString();
                if(myStringMul.equals(null))
                {
                    return;
                }
                fistNumber = Double.valueOf(myStringMul);
                print.setText(null);
                op = 3;
                isClickEqu = false;
            }
        });
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myStringDiv = print.getText().toString();
                if(myStringDiv.equals(null))
                {
                    return;
                }
                fistNumber = Double.valueOf(myStringDiv);
                print.setText(null);
                op = 4;
                isClickEqu = false;
            }
        });
        btnEqu = (Button) findViewById(R.id.btnEqu);
        btnEqu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myStringEqu = print.getText().toString();
                if(myStringEqu.equals(null))
                {
                    return;
                }
                secondNumber = Double.valueOf(myStringEqu);
                print.setText(null);
                switch (op) {
                    case 0:
                        calResult = secondNumber;
                        break;
                    case 1:
                        calResult = fistNumber + secondNumber;
                        break;
                    case 2:
                        calResult = fistNumber - secondNumber;
                        break;
                    case 3:
                        calResult = fistNumber * secondNumber;
                        break;
                    case 4:
                        calResult = fistNumber / secondNumber;
                        break;
                    default:
                        calResult = 0;
                        break;
                }
                print.setText(String.valueOf(calResult));
                isClickEqu = true;
            }
        });


        btnClear = (Button) findViewById(R.id.btnClear);
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                print.setText(null);
            }
        });

        btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myStr = print.getText().toString();
                try {
                    print.setText(myStr.substring(0, myStr.length() - 1));
                } catch (Exception e) {
                    print.setText("");
                }

            }
        });
    }

}
