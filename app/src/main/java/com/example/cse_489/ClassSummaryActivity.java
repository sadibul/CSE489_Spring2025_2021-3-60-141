package com.example.cse_489;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ClassSummaryActivity extends AppCompatActivity {

    private EditText nameEditText, idEditText, dateEditText, lectureEditText, topicTitleEditText, summaryEditText;
    private RadioButton cse477RadioButton, cse479RadioButton, cse489RadioButton, cse495RadioButton, theoryRadioButton, labRadioButton;
    private Button saveButton, cancelButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_class_summary);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        initialization();

        click();
    }

    private void initialization() {

        // editText
        nameEditText = findViewById(R.id.name);
        idEditText = findViewById(R.id.id);
        dateEditText = findViewById(R.id.date);
        lectureEditText = findViewById(R.id.lecture_number);
        topicTitleEditText = findViewById(R.id.topic_title);
        summaryEditText = findViewById(R.id.summary);

        // radiobutton
        cse477RadioButton = findViewById(R.id.cse_477);
        cse479RadioButton = findViewById(R.id.cse_479);
        cse489RadioButton = findViewById(R.id.cse_489);
        cse495RadioButton = findViewById(R.id.cse_495);
        theoryRadioButton = findViewById(R.id.theory);
        labRadioButton = findViewById(R.id.lab);

        // button
        saveButton = findViewById(R.id.save);
        cancelButton = findViewById(R.id.cancel);

    }

    private void click() {

        cancelButton.setOnClickListener(v -> {
            clear();
        });

        saveButton.setOnClickListener(v -> {
            valid();
        });

    }

    private void valid() {

        String name = nameEditText.getText().toString().trim();
        String id = idEditText.getText().toString().trim();
        String date = dateEditText.getText().toString().trim();
        String lecture = lectureEditText.getText().toString().trim();
        String topic = topicTitleEditText.getText().toString().trim();
        String summary = summaryEditText.getText().toString().trim();
        String course = selectedCourse();
        String type = selectedType();


        if (name.isEmpty() || id.isEmpty() || date.isEmpty() || lecture.isEmpty() || topic.isEmpty() || summary.isEmpty() || course.isEmpty() || type.isEmpty()) {

            Toast.makeText(ClassSummaryActivity.this, "You must fill in all fields correctly", Toast.LENGTH_LONG).show();

        } else {
            // show a toast
            Toast.makeText(ClassSummaryActivity.this, "Data Saved Successfully!", Toast.LENGTH_SHORT).show();
        }


    }

    private void clear() {
        nameEditText.setText("");
        idEditText.setText("");
        dateEditText.setText("");
        lectureEditText.setText("");
        topicTitleEditText.setText("");
        summaryEditText.setText("");
        cse477RadioButton.setChecked(false);
        cse479RadioButton.setChecked(false);
        cse489RadioButton.setChecked(false);
        cse495RadioButton.setChecked(false);
        theoryRadioButton.setChecked(false);
        labRadioButton.setChecked(false);
    }

    private String selectedCourse() {
        if (cse477RadioButton.isChecked()) return "CSE 477";
        else if (cse479RadioButton.isChecked()) return "CSE 479";
        else if (cse489RadioButton.isChecked()) return "CSE 489";
        else if (cse495RadioButton.isChecked()) return "CSE 495";
        else return "";
    }

    private String selectedType() {
        if (theoryRadioButton.isChecked()) return "Theory";
        else if (labRadioButton.isChecked()) return "Lab";
        return "";
    }

    // testing purpose

}