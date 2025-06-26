package com.example.lr19ca;

import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Spinner spinnerPosition;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinnerPosition = findViewById(R.id.spinner_position);
        textViewResult = findViewById(R.id.textview_result);
    }

    public void getStudent(View view) {
        String selectedPosition = spinnerPosition.getSelectedItem().toString();
        String studentName = StudentLogic.getStudentName(selectedPosition);
        textViewResult.setText(studentName);
    }
}