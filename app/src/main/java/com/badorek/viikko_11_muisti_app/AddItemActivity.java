package com.badorek.viikko_11_muisti_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_item);
    }

    public void addItem(View view){
        EditText item = findViewById(R.id.editTextInformation);
        Storage.getInstance().addItem(new Item(item.getText().toString()));
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}