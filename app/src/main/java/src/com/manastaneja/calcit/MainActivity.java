package src.com.manastaneja.calcit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button0, button1, button2, button3, button4, button5, button6, button7,
            button8, button9, buttonDot, buttonC, buttonPlus, buttonMinus, buttonMultiply,
            buttonDivide, buttonEquals;
    private EditText edit1;
    private float valueOne, valueTwo;
    private boolean add, subtract, multiply, divide;
    private String conc0, conc1, conc2, conc3, conc4, conc5, conc6, conc7, conc8, conc9, concDot,
            concC, concPlus, concMinus, concMul, concDiv, concEq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttondot);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonPlus = (Button) findViewById(R.id.buttonplus);
        buttonMinus = (Button) findViewById(R.id.buttonminus);
        buttonMultiply = (Button) findViewById(R.id.buttonmultiply);
        buttonDivide = (Button) findViewById(R.id.buttondivide);
        buttonEquals = (Button) findViewById(R.id.buttonequals);
        edit1 = (EditText) findViewById(R.id.edit1);

        conc0 = edit1.getText() + "0";
        conc1 = edit1.getText() + "1";
        conc2 = edit1.getText() + "2";
        conc3 = edit1.getText() + "3";
        conc4 = edit1.getText() + "4";
        conc5 = edit1.getText() + "5";
        conc6 = edit1.getText() + "6";
        conc7 = edit1.getText() + "7";
        conc8 = edit1.getText() + "8";
        conc9 = edit1.getText() + "9";
        concDot = edit1.getText() + ".";
        concC = "";

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc0);
            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc1);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc2);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc3);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc4);
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc5);
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc6);
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc7);
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc8);
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(conc9);
            }
        });
        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1 == null) {
                    edit1.setText(concC);
                } else {
                    valueOne = Float.parseFloat(edit1.getText() + "");
                    add = true;
                    edit1.setText(null);
                }
            }
        });
        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(edit1.getText() + "");
                subtract = true;
                edit1.setText(null);
            }
        });
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(edit1.getText() + "");
                multiply = true;
                edit1.setText(null);
            }
        });
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valueOne = Float.parseFloat(edit1.getText() + "");
                divide = true;
                edit1.setText(null);
            }
        });
        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //if (edit1.getText() != null) {
                valueTwo = Float.parseFloat(edit1.getText() + "");

                if (add) {
                    edit1.setText(valueOne + valueTwo + "");
                    add = false;
                }
                if (subtract) {
                    edit1.setText(valueOne - valueTwo + "");
                    subtract = false;
                }
                if (multiply) {
                    edit1.setText(valueOne * valueTwo + "");
                    multiply = false;
                }
                if (divide) {
                    edit1.setText(valueOne / valueTwo + "");
                    divide = false;
                }
                //} else {
                    //edit1.setText(concC);
                //}
            }
        });
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(concC);
            }
        });
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit1.setText(concDot);
            }
        });
    }
}
