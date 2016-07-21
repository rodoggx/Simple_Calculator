package com.example.simplecalculator.simplecalulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";
    private EditText mEditText;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButtonAdd;
    private Button mButtonSub;
    private Button mButtonEqual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText = (EditText) findViewById(R.id.a_main_et);

        mButton1 = (Button) findViewById(R.id.a_main_n1);
        mButton2 = (Button) findViewById(R.id.a_main_n2);
        mButton3 = (Button) findViewById(R.id.a_main_n3);

        mButtonAdd = (Button) findViewById(R.id.a_main_add);
        mButtonSub = (Button) findViewById(R.id.a_main_sub);
        mButtonEqual = (Button) findViewById(R.id.a_main_equal);

    }

    public void type1(View view) {
        Log.d(TAG, "type1: ");
    }
    public void type2(View view) {
        Log.d(TAG, "type2: ");
    }
    public void type3(View view) {
        Log.d(TAG, "type3: ");
    }
    public void add(View view) {
        Log.d(TAG, "+: ");
    }
    public void sub(View view) {
        Log.d(TAG, "-: ");
    }
    public void equal(View view) {
        Log.d(TAG, "=: ");
    }

}
