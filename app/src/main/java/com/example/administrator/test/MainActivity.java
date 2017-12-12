package com.example.administrator.test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;


/**
 * AutoCompleteTextView
 * MultiAutoCompleteTextView
 */

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView actv = (AutoCompleteTextView) findViewById(R.id.actv);
        MultiAutoCompleteTextView mactv = (MultiAutoCompleteTextView) findViewById(R.id.mactv);

        String[] res = {"laowang", "laoli", "laoliu", "laozhu", "laohu", "laoma", "laoxiao", "laoxi",
                "110@qq.com", "120@qq.com", "119@qq.com", "139@qq.com"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, res);
        actv.setAdapter(adapter);
        // 设置mactv以逗号为分隔符(这个不用记，文档有得抄，非常简单)
        mactv.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
        mactv.setAdapter(adapter);

    }

}