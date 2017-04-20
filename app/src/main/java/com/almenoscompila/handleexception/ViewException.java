package com.almenoscompila.handleexception;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ViewException extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_exception);

        String s = getIntent().getStringExtra("EXCEPTION_MESSAGE");

        TextView tv = (TextView)findViewById(R.id.txt_log_error);
        tv.setText(s);
    }
}
