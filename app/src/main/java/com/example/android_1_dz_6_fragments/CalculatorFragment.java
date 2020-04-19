package com.example.android_1_dz_6_fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalculatorFragment<onCreate> extends Fragment {
    TextView result;
    Double firstValues, secondValues, result_op;
    String opiration;


    public CalculatorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calculator, container, false);
    }

    @Override
   public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(savedInstanceState != null){
            firstValues = savedInstanceState.getDouble("calkuly");
            secondValues = savedInstanceState.getDouble("secondValues");
            opiration = savedInstanceState.getString("opiration");
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
    public void onNumberClick(View view){
            switch (view.getId()) {
                case R.id.seven:
                    result.append("7");
                    break;
                case R.id.eight:
                    result.append("8");
                    break;
                case R.id.nine:
                    result.append("9");
                    break;
                case R.id.four:
                    result.append("4");
                    break;
                case R.id.five:
                    result.append("5");
                    break;
                case R.id.six:
                    result.append("6");
                    break;
                case R.id.one:
                    result.append("1");
                    break;
                case R.id.two:
                    result.append("2");
                    break;
                case R.id.three:
                    result.append("3");
                    break;
                case R.id.zero:
                    result.append("0");
                    break;
                case R.id.point:
                    firstValues = Double.valueOf(result.getText().toString());
                    result.setText(firstValues + ".");
                    opiration = ".";
                    break;
                case R.id.clear:
                    result.setText(null);
                    break;
                case R.id.back:
                    String str;
                    str = result.getText().toString();
                    result.setText(null);
                    str = str.substring(0, str.length() - 1);
                    result.setText(result.getText() + str);
                    break;
            }
        }
    public void onOperationClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "+");
                opiration = "+";
                break;
            case R.id.minus:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "-");
                opiration = "-";
                break;
            case R.id.multiplication:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "*");
                opiration = "*";
                break;
            case R.id.division:
                firstValues = Double.valueOf(result.getText().toString());
                result.setText(firstValues + "/");
                opiration = "/";
                break;
            case R.id.equally:
                if (opiration != null) {
                    String two = result.getText().toString().replace(firstValues.toString() + opiration, " ");
                    secondValues = Double.valueOf(two);
                    switch (opiration) {
                        case "+":
                            plus();
                            break;

                        case "-":
                            minus();
                            break;

                        case "*":
                            multiplication();
                            break;

                        case "/":
                            division();
                            break;
                    }
                }
                break;
        }
    }
    public void plus() {
        result_op = firstValues + secondValues;
        result.setText(firstValues + "+" + secondValues + "=" + result_op);
    }

    public void minus() {
        result_op = firstValues - secondValues;
        result.setText(firstValues + "-" + secondValues + "=" + result_op);
    }

    public void multiplication() {
        result_op = firstValues * secondValues;
        result.setText(firstValues + "*" + secondValues + "=" + result_op);
    }

    public void division() {
        result_op = firstValues / secondValues;
        result.setText(firstValues + "/" + secondValues + "=" + result_op);
    }
}
