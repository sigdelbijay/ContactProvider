package com.example.contactprovider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = (EditText) findViewById(R.id.nameEditText);
    }

    public void addName(View view) {
        String name = nameEditText.getText().toString();
        ContentValues values = new ContentValues();
        values.put(ContactProvider.name, name);
        Uri uri = getContentResolver().insert(ContactProvider.CONTENT_URL, values);
        Toast.makeText(getBaseContext(), "New Contact Added", Toast.LENGTH_SHORT).show();
    }
}
