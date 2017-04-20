package com.almenoscompila.handleexception;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        HandlerSetup();

    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_generate_exception:
                throw new RuntimeException("Button generated exception");
            case R.id.btn_switch_activity:
                Intent i = new  Intent(this,ExceptionActivity.class);
                startActivity(i);
                break;
        }
    }

    private void HandlerSetup()
    {
        Button b = (Button)findViewById(R.id.btn_generate_exception);
        b.setOnClickListener(this);

        b = (Button)findViewById(R.id.btn_switch_activity);
        b.setOnClickListener(this);
    }
}
