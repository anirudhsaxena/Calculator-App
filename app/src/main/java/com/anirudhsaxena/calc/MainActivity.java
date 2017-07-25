package com.anirudhsaxena.calc;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private int calc_factor;
    private TextView secondaryView;
    private TextView mainView;
    private TextView symbol;
    double input1;
    double input2;
    double output1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calc_factor=0;
        secondaryView=(TextView)findViewById(R.id.textView2);
        mainView=(TextView)findViewById(R.id.textView);
        symbol=(TextView)findViewById(R.id.textView3);

    }

    public void onClickListener(View v) {
        int intID = v.getId();
        Button button = (Button) findViewById(intID);
        String msg = button.getText().toString();
        switch (intID){
            case R.id.button1:
                secondaryView.append(msg);
                break;
            case R.id.button2:
                secondaryView.append(msg);
                break;
            case R.id.button3:
                secondaryView.append(msg);
                break;
            case R.id.button4:
                secondaryView.append(msg);
                break;
            case R.id.button5:
                secondaryView.append(msg);
                break;
            case R.id.button6:
                secondaryView.append(msg);
                break;
            case R.id.button7:
                secondaryView.append(msg);
                break;
            case R.id.button8:
                secondaryView.append(msg);
                break;
            case R.id.button9:
                secondaryView.append(msg);
                break;
            case R.id.button0:
                secondaryView.append(msg);
                break;
            case R.id.buttonDecimal:
                secondaryView.append(msg);
        }
    }
    public void onClickSym(View v) {
        int intID=v.getId();
        TextView clearsecond = (TextView) findViewById(R.id.textView2);
        switch (intID) {
            case R.id.buttonAdd:
                //textView.append(msg);
                mainView.setText(secondaryView.getText().toString());
                symbol.setText("+");
                input1 = Double.parseDouble(secondaryView.getText().toString());
                clearsecond.setText("");
                //mainView.append("+"+secondaryView.getText().toString());
                calc_factor=1;
                break;
            case R.id.buttonSub:
                //textView.append(msg);
                mainView.setText(secondaryView.getText().toString());
                symbol.setText("-");
                input1 = Double.parseDouble(secondaryView.getText().toString());
                clearsecond.setText("");
                calc_factor=2;
                //compute(v);
                break;
            case R.id.buttonMul:
                //textView.append(msg);
                mainView.setText(secondaryView.getText().toString());
                symbol.setText("*");
                input1 = Double.parseDouble(secondaryView.getText().toString());
                clearsecond.setText("");
                calc_factor=3;
                //compute(v);
                break;
            case R.id.buttonDiv:
                //textView.append(msg);
                mainView.setText(secondaryView.getText().toString());
                symbol.setText("/");
                input1 = Double.parseDouble(secondaryView.getText().toString());
                clearsecond.setText("");
                calc_factor=4;
                // compute(v);
                break;
            case R.id.buttonClear:
                //textView.append(msg);
                mainView.setText("");
                symbol.setText("");
                clearsecond.setText("");
                //calc_factor=4;
                // compute(v);
                break;
            default:
                mainView.setText("");
                symbol.setText("");
                clearsecond.setText("");

        }
    }
    public void onEqual(View v){

        switch (calc_factor) {
            case 1:
                input2 = Double.parseDouble(secondaryView.getText().toString());
                mainView.append("+" + secondaryView.getText().toString());
                TextView clear = (TextView) findViewById(R.id.textView2);
                clear.setText("");
                symbol.setText("=");
                output1 = input1 + input2;
                TextView outputAdd = (TextView) findViewById(R.id.textView2);
                outputAdd.setText(String.valueOf(output1).trim());

                break;
            case 2:
                input2 = Double.parseDouble(secondaryView.getText().toString());
                mainView.append("-" + secondaryView.getText().toString());
                TextView clear1 = (TextView) findViewById(R.id.textView2);
                clear1.setText("");
                symbol.setText("=");
                output1 = input1 - input2;
                TextView outputSub = (TextView) findViewById(R.id.textView2);
                outputSub.setText(String.valueOf(output1));
                break;
            case 3:
                input2= Double.parseDouble(secondaryView.getText().toString());
                mainView.append("*"+secondaryView.getText().toString());
                TextView clear2 =(TextView)findViewById(R.id.textView2);
                clear2.setText("");
                symbol.setText("=");
                output1 = input1 * input2;
                TextView outputMul=(TextView)findViewById(R.id.textView2);
                outputMul.setText(String.valueOf(output1));
                break;
            case 4:
                input2= Double.parseDouble(secondaryView.getText().toString());
                mainView.append("/"+secondaryView.getText().toString());
                TextView clear4 =(TextView)findViewById(R.id.textView2);
                clear4.setText("");
                symbol.setText("=");
                output1 = input1 / input2;
                TextView outputDiv=(TextView)findViewById(R.id.textView2);
                outputDiv.setText(String.valueOf(output1));
                break;
        }




        /*
        input2= Integer.parseInt(secondaryView.getText().toString());
        mainView.append("+"+secondaryView.getText().toString());
        TextView clear =(TextView)findViewById(R.id.textView2);
        clear.setText("");
        symbol.setText("=");
        output1 = input1+input2;
        TextView output=(TextView)findViewById(R.id.textView2);
        output.setText(String.valueOf(output1));*/


        /*int output;
        compute(v);
        switch (calc_factor){
        case 1:
            output=input1+input2;
            secondaryView.setText(output);
        */
      /*  else if(calc_factor==2)
        {
            output=input1-input2;
        }

        else if(calc_factor==3)
        {
            output=input1*input2;
        }

        else if(calc_factor==2)
        {
            output=input1/input2;
        }*/
    }

}

