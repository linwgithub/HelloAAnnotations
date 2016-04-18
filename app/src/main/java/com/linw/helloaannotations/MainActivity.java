package com.linw.helloaannotations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.tv_main)
    TextView tv_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
