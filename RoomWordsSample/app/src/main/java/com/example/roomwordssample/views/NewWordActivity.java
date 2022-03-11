package com.example.roomwordssample.views;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.roomwordssample.R;

public class NewWordActivity extends AppCompatActivity {
    private  Button button;
    private  EditText editWordView;
    public static final String EXTRA_REPLY = "com.example.roomwordssample.controller.REPLY";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_word);

        editWordView = findViewById(R.id.edit_word);
        button = findViewById(R.id.button_save);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent replyIntent = new Intent();
                if (TextUtils.isEmpty(editWordView.getText())) {
                    setResult(RESULT_CANCELED, replyIntent);
                } else {
                    String word = editWordView.getText().toString();
                    replyIntent.putExtra(EXTRA_REPLY, word);
                    setResult(RESULT_OK, replyIntent);
                }
                finish();
            }
        });



    }
}