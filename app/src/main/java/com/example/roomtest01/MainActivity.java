package com.example.roomtest01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText editText;
    public TextView textView;
    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindUI();
        RepositoryTest repositoryTest = new RepositoryTest(getApplicationContext());
        repositoryTest.insert("danielTest");
    }

    public void bindUI() {
        editText = findViewById(R.id.mainEditText);
        textView = findViewById(R.id.mainTextView);
        button = findViewById(R.id.mainButtonAdd);
    }
}
