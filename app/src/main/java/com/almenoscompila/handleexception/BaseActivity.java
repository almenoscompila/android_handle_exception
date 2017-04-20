package com.almenoscompila.handleexception;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread.setDefaultUncaughtExceptionHandler (new Thread.UncaughtExceptionHandler()
        {
            @Override
            public void uncaughtException (Thread thread, Throwable e)
            {
                handleException (thread, e);
            }
        });

    }

    public void handleException (Thread thread, Throwable e)
    {
        Intent i = new Intent();
        i.setAction("com.almenoscompila.handleexception.ViewException");
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        i.putExtra("EXCEPTION_MESSAGE", e.getMessage()+" \n");
        startActivity(i);
        System.exit(1);
    }

}
