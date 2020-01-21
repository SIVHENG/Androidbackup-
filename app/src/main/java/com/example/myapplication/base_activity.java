package com.example.myapplication;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class base_activity extends AppCompatActivity {
    ActionBar actionBar;

    @Nullable
    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);

        actionBar = getSupportActionBar(true);
        actionBar = setDisplayHomeAsUpEnable(true);
    }
    @Override
    public void setTitle(int titleId){
        actionBar.SetTitle(titleId);
    }

    @Nullable
    @Override
    public ActionBar getActionBar() {
        return actionBar;.
    }
}
