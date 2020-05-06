package com.example.img_checkbox_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ans1, ans2, ans3, ans4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        ans1 = (ImageView) findViewById(R.id.ans1);
        ans2 = (ImageView) findViewById(R.id.ans2);
        ans3 = (ImageView) findViewById(R.id.ans3);
        ans4 = (ImageView) findViewById(R.id.ans4);

    }
    public void btnOK(View view){

        ans1.setVisibility(View.GONE);
        ans2.setVisibility(View.GONE);
        ans3.setVisibility(View.GONE);
        ans4.setVisibility(View.GONE);

        CheckBox checkBox;

        int[] id = {R.id.ckb1, R.id.ckb2, R.id.ckb3, R.id.ckb4};

        for (int i : id){
            checkBox = findViewById(i);

            if(checkBox.isChecked()){
                if (checkBox.getId() == R.id.ckb1)
                    ans1.setVisibility(View.VISIBLE);
                if (checkBox.getId() == R.id.ckb2)
                    ans2.setVisibility(View.VISIBLE);
                if (checkBox.getId() == R.id.ckb3)
                    ans3.setVisibility(View.VISIBLE);
                if (checkBox.getId() == R.id.ckb4)
                    ans4.setVisibility(View.VISIBLE);
            }
        }
    }
}
