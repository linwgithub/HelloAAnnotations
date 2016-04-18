package com.linw.helloaannotations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
@EActivity
public class MainActivity extends AppCompatActivity {

    @ViewById(R.id.tv_main)
    TextView tv_main;

    @ViewById(R.id.btn_main)
    Button btn_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Click(R.id.btn_main)
    public void settext() {
        tv_main.setText("hello Annotition");
    }

}
