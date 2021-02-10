package com.example.wagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Double payRegular = 100.0;
        Double payOvertime = 130.0;
        Double payTotal = 0.0;
        Double hoursTotal = 0.0;
        Double hoursOvertime =0.0;

        Button btnCal;
        EditText inputHoursNum;
        TextView resultTotalWage, resultTotalHours, resultTotalOvertimeHours, resultTotalWageOvertime;


        btnCal = findViewById(R.id.btnCalculate);

        inputHoursNum = findViewById(R.id.inputHours);

        resultTotalHours = findViewById(R.id.resultTotalHours);

        resultTotalOvertimeHours = findViewById(R.id.resultTotalOvertimeHours);

        resultTotalWage = findViewById(R.id.resultTotalWage);

        resultTotalWageOvertime = findViewById(R.id.resultTotalWageOvertime);




        btnCal.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        EditText inputHoursNum;
        TextView resultTotalWage, resultTotalHours, resultTotalOvertimeHours, resultTotalWageOvertime;

        inputHoursNum = findViewById(R.id.inputHours);

        resultTotalWage = findViewById(R.id.resultTotalWage);
        resultTotalHours = findViewById(R.id.resultTotalHours);
        resultTotalOvertimeHours = findViewById(R.id.resultTotalOvertimeHours);
        resultTotalWageOvertime = findViewById(R.id.resultTotalWageOvertime);




        Double payRegular = 100.0;
        Double payOvertime = 130.0;
        Double inputHours = 0.0;
        Double totalWage = 0.0;
        Double totalHours = 0.0;
        Double totalWageOvertime = 0.0;
        Double totalOvertimeHours = 0.0;



        inputHours = Double.parseDouble(inputHoursNum.getText().toString());

        switch (v.getId()) {
            case R.id.btnCalculate:

                if(inputHours>8){

                    totalWageOvertime = payOvertime * (inputHours -8.0);
                    totalWage = totalWageOvertime + (inputHours*payRegular);
                    totalHours = inputHours;
                    totalOvertimeHours = inputHours-(8.0);

                    resultTotalWage.setText(Double.toString(totalWage) + " Pesos ");
                    resultTotalHours.setText(Double.toString(totalHours) + " Hours ");
                    resultTotalOvertimeHours.setText(Double.toString(totalOvertimeHours) + " Hours ");
                    resultTotalWageOvertime.setText(Double.toString(totalWageOvertime) + " Pesos ");


                }

                else {
                    totalWage = inputHours * payRegular;
                    totalHours = inputHours;


                    resultTotalWage.setText(Double.toString(totalWage) + " Pesos ");
                    resultTotalHours.setText(Double.toString(totalHours) + " Hours ");
                    resultTotalOvertimeHours.setText(Double.toString(totalOvertimeHours) + " Hours ");
                    resultTotalWageOvertime.setText(Double.toString(totalWageOvertime) + " Pesos ");


                }
                if (inputHours<=0){


                resultTotalWage.setText("ERROR");
                resultTotalHours.setText( " ERROR ");
                resultTotalOvertimeHours.setText( " ERROR ");
                resultTotalWageOvertime.setText(" ERROR ");


            }


                break;

        }
    }
}