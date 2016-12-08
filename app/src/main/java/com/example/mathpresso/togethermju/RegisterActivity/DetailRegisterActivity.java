package com.example.mathpresso.togethermju.RegisterActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.mathpresso.togethermju.R;

import static com.example.mathpresso.togethermju.core.AppController.user;

public class DetailRegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_register);

        getIntent();


        Spinner majorSpinner = (Spinner) findViewById(R.id.major_spinner);
        Spinner yearSpinner = (Spinner) findViewById(R.id.year_spinner);
        Spinner monthSpinner = (Spinner) findViewById(R.id.month_spinner);
        Spinner daySpinner = (Spinner) findViewById(R.id.day_spinner);

        ArrayAdapter majorAdapter = ArrayAdapter.createFromResource(this, R.array.major,
                android.R.layout.simple_spinner_item);
        majorAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        majorSpinner.setAdapter(majorAdapter);

        ArrayAdapter yearAdapter = ArrayAdapter.createFromResource(this, R.array.year,
                android.R.layout.simple_spinner_item);
        yearAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        yearSpinner.setAdapter(yearAdapter);

        ArrayAdapter monthAdapter = ArrayAdapter.createFromResource(this, R.array.month,
                android.R.layout.simple_spinner_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthSpinner.setAdapter(monthAdapter);

        ArrayAdapter dayAdapter = ArrayAdapter.createFromResource(this, R.array.day,
                android.R.layout.simple_spinner_item);
        dayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        daySpinner.setAdapter(dayAdapter);
    }

    public void clickBackButton(View view) {
        startActivity(new Intent(this, EmailRegisterActivity.class));
    }

    public void clickNextButton(View view) {
        Spinner majorSpinner = (Spinner) findViewById(R.id.major_spinner);
        Spinner yearSpinner = (Spinner) findViewById(R.id.year_spinner);
        Spinner monthSpinner = (Spinner) findViewById(R.id.month_spinner);
        Spinner daySpinner = (Spinner) findViewById(R.id.day_spinner);

        RadioButton maleButton = (RadioButton) findViewById(R.id.male_radio_button);
        RadioButton femaleButton = (RadioButton) findViewById(R.id.female_radio_button);

        String gender;
        String major = majorSpinner.getSelectedItem().toString();
        String birth = yearSpinner.getSelectedItem().toString() + "." +
                monthSpinner.getSelectedItem().toString() + "." +
                daySpinner.getSelectedItem().toString();

        if ((maleButton.isChecked() == true && femaleButton.isChecked() == false)) {
            gender = "남자";

            user.setMajor(major);
            user.setBirth(birth);
            user.setGender(gender);

            startActivity(new Intent(this, FavoriteRegisterActivity.class));
        } else if (femaleButton.isChecked() == true && maleButton.isChecked() == false) {
            gender = "여자";

            user.setMajor(major);
            user.setBirth(birth);
            user.setGender(gender);

            startActivity(new Intent(this, FavoriteRegisterActivity.class));
        } else {
            Toast.makeText(this, "성별을 선택하세요.", Toast.LENGTH_SHORT).show();
        }
    }

}