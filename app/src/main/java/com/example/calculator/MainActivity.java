package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView firstInput;
    private TextView signOutput;

    private String sign, value1, value2, t;
    private Double num1, num2, result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstInput = findViewById(R.id.edit_text_first_input);
        signOutput = findViewById(R.id.action);

        final Button one = findViewById(R.id.one_btn);
        final Button two = findViewById(R.id.two_btn);
        final Button three = findViewById(R.id.three_btn);
        final Button four = findViewById(R.id.four_btn);
        final Button five = findViewById(R.id.five_btn);
        final Button six = findViewById(R.id.six_btn);
        final Button seven = findViewById(R.id.seven_btn);
        final Button eight = findViewById(R.id.eight_btn);
        final Button nine = findViewById(R.id.nine_btn);
        final Button zero = findViewById(R.id.zero_btn_btn);
        final Button plus = findViewById(R.id.plus_btn);
        final Button minus = findViewById(R.id.minus_btn);
        final Button division = findViewById(R.id.division_btn);
        final Button multiplication = findViewById(R.id.multiplication_btn);
        final Button equals = findViewById(R.id.equals_btn);
        final Button point = findViewById(R.id.point_btn);
        final Button clear = findViewById(R.id.clear_btn);
        final Button percent = findViewById(R.id.percent);
        final Button delete = findViewById(R.id.backspace_btn);
        final Button push = findViewById(R.id.push_btn);
/*
........................ЦИФРЫ........................
 */

        one.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstInput.setText((firstInput.getText() + "3"));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + "0");
            }
        });
        push.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                signOutput.setText(null);
                signOutput.setText((signOutput.getText() + "ЦИФРЫ ЖМИ БЛЯТ!"));
            }
        });
        /*
          .........................ДЕЙСВТИЯ........................

         */


        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "-";
                value1 = firstInput.getText().toString();
                firstInput.setText(null);
                signOutput.setText("-");
            }
        });

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "+";
                value1 = firstInput.getText().toString();
                firstInput.setText(null);
                signOutput.setText("+");
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "x";
                value1 = firstInput.getText().toString();
                firstInput.setText(null);
                signOutput.setText("x");
            }
        });
        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "/";
                value1 = firstInput.getText().toString();
                firstInput.setText(null);
                signOutput.setText("/");
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sign = "%";
                value1 = firstInput.getText().toString();
                firstInput.setText(null);
                signOutput.setText("%");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                firstInput.setText(firstInput.getText() + ".");
            }
        });

        equals.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (firstInput.getText().toString().equals("")) {
                    firstInput.setText("");
                } else if (sign != null) {
                    value2 = firstInput.getText().toString();
                    num1 = Double.parseDouble(value1);
                    num2 = Double.parseDouble(value2);
                    firstInput.setText(null);
                    switch (getSign()) {
                        default:
                            break;
                        case "+":
                            firstInput.setText(null);
                            result = num1 + num2;
                            firstInput.setText(result + "");
                            sign = null;
                            break;
                        case "-":
                            firstInput.setText(null);
                            result = num1 - num2;
                            firstInput.setText(result + "");
                            sign = null;
                            break;
                        case "/":

                            firstInput.setText(null);
                            result = num1 / num2;
                            firstInput.setText(result + "");
                            sign = null;

                            break;
                        case "x":
                            firstInput.setText(null);
                            result = num1 * num2;
                            firstInput.setText(result + "");
                            sign = null;

                            break;
                        case "%":
                            firstInput.setText(null);
                            result = (num1 * num2) / 100;
                            firstInput.setText(result + "");
                            sign = null;
                            break;
                    }
                }else firstInput.setText(firstInput.getText()+"Ошибка");
            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstInput.setText("");
                signOutput.setText("");
            }
        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t = String.valueOf(firstInput.getText());
                if (t.isEmpty()) {
                    firstInput.setText("");
                } else {
                    firstInput.setText(t.substring(0, t.length() - 1));
                }
            }
        });

    }

    private String getSign() {
        return sign;

    }
}