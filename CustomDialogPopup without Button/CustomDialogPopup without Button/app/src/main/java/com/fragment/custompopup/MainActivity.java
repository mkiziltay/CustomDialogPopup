package com.fragment.custompopup;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button popup;
    Dialog mDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        popup = findViewById(R.id.showPopup);
        mDialog = new Dialog(this);

        popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDialog.setContentView(R.layout.popup_layout); // Set popup resource file
                mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT)); // Set background transparent
                mDialog.show(); // show popup
            }
        });
    }
}
