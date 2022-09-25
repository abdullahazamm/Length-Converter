package com.example.lengthconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConverterMeter();
        ConverterCent();
        ConverterInch();
        ConverterFeet();
        Reset();
    }
    public void ConverterMeter(){
        Button btn1=findViewById(R.id.button4);
        Button btn2=findViewById(R.id.button3);
        Button btn3=findViewById(R.id.button1);
        Button btn4=findViewById(R.id.button2);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float MeterToCM=Float.parseFloat(editText.getText().toString());
                float MToCM=MeterToCM*100;

                editText1.setText(String.valueOf(MToCM));

                float MeterToInch=Float.parseFloat(editText.getText().toString());
                float MToIN= (float) (MeterToInch*39.37);

                editText2.setText(String.valueOf(MToIN));


                float MeterToFeet=Float.parseFloat(editText.getText().toString());
                float MToFT= (float) (MeterToFeet*3.281);


                editText3.setText(String.valueOf(MToFT));
            }
        });


    }
    public void ConverterCent() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float CentToMeter=Float.parseFloat(editText1.getText().toString());
                float CMToM=CentToMeter/100;
                editText.setText(String.valueOf(CMToM));


                float CentToInch=Float.parseFloat(editText1.getText().toString());
                float CMToIn= (float) (CentToInch/2.54);
                editText2.setText(String.valueOf(CMToIn));


                float CentToFeet=Float.parseFloat(editText1.getText().toString());
                float CMToFt= (float) (CentToFeet/30.48);
                editText3.setText(String.valueOf(CMToFt));

            }


        });




    }


    public void ConverterInch() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float InchToMeter=Float.parseFloat(editText2.getText().toString());
                float InToM= (float) (InchToMeter/39.37);
                editText.setText(String.valueOf(InToM));


                float InchToCM=Float.parseFloat(editText2.getText().toString());
                float InToCM= (float) (InchToCM*2.54);
                editText1.setText(String.valueOf(InToCM));


                float InchToFeet=Float.parseFloat(editText2.getText().toString());
                float InToFT=InchToFeet/12;
                editText3.setText(String.valueOf(InToFT));

            }

        });

    }





    public void ConverterFeet() {
        Button btn1 = findViewById(R.id.button4);
        Button btn2 = findViewById(R.id.button3);
        Button btn3 = findViewById(R.id.button1);
        Button btn4 = findViewById(R.id.button2);



        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                float FeetToMeter=Float.parseFloat(editText3.getText().toString());
                float FTToM= (float) (FeetToMeter/3.281);
                editText.setText(String.valueOf(FTToM));


                float FeetToCM=Float.parseFloat(editText3.getText().toString());
                float FTToCM= (float) (FeetToCM*30.48);
                editText1.setText(String.valueOf(FTToCM));


                float FeetToInch=Float.parseFloat(editText3.getText().toString());
                float FTToIN=FeetToInch*12;
                editText2.setText(String.valueOf(FTToIN));

            }

        });

    }

    public void Reset(){
        Button resetbtn=findViewById(R.id.resetbtn);
        resetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText editText=findViewById(R.id.editText);
                EditText editText1=findViewById(R.id.editText1);
                EditText editText2=findViewById(R.id.editText2);
                EditText editText3=findViewById(R.id.editText3);


                editText.setText(null);
                editText1.setText(null);
                editText2.setText(null);
                editText3.setText(null);

            }
        });


    }

}