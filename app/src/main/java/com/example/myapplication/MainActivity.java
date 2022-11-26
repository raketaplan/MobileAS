package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.myapplication.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            CheckClick();
        });
    }

    //Метод проверки текста
    public void CheckClick(){
        try {
            Spinner question1_answers1 = findViewById(R.id.spinner3);
            Spinner question2_answers2 = findViewById(R.id.spinner4);
            Spinner question3_answers3 = findViewById(R.id.spinner5);
            Spinner question4_answers4 = findViewById(R.id.spinner6);
            Spinner question5_answers5 = findViewById(R.id.spinner7);
            Spinner question6_answers6 = findViewById(R.id.spinner8);
            Spinner question7_answers7 = findViewById(R.id.spinner9);
            Spinner question8_answers8 = findViewById(R.id.spinner10);
            Spinner question9_answers9 = findViewById(R.id.spinner11);
            Spinner question10_answers10 = findViewById(R.id.spinner12);

            ArrayList list_user_answer = new ArrayList();
            list_user_answer.add(question1_answers1.getSelectedItem().toString());
            list_user_answer.add(question2_answers2.getSelectedItem().toString());
            list_user_answer.add(question3_answers3.getSelectedItem().toString());
            list_user_answer.add(question4_answers4.getSelectedItem().toString());
            list_user_answer.add(question5_answers5.getSelectedItem().toString());
            list_user_answer.add(question6_answers6.getSelectedItem().toString());
            list_user_answer.add(question7_answers7.getSelectedItem().toString());
            list_user_answer.add(question8_answers8.getSelectedItem().toString());
            list_user_answer.add(question9_answers9.getSelectedItem().toString());
            list_user_answer.add(question10_answers10.getSelectedItem().toString());

            ArrayList list_answer = new ArrayList();
            list_answer.addAll(Arrays.asList("1861", "988", "Елизавета I", "6 августа 1945",
                    "1949", "1991", "Причина не известна", "Бенджамин Франклин",
                    "Кровавое воскресенье", "Хотел больше свободного времени, и помочь детям"));

            int result = 0;
            for (int i = 0; i < 10; i++) {
                Object answer = list_answer.get(i);
                if (list_user_answer.get(i).equals(list_answer.get(i))) {
                    result++;
                }
            }
            Intent intent = new Intent(this, com.example.myapplication.ResultActivity.class);
            intent.putExtra("user_result", ("Вы набрали: " + result + " их 10"));
            startActivity(intent);
        } catch (Exception ex) {
            Toast t = Toast.makeText(this, ex.getMessage(), Toast.LENGTH_LONG);
        }


    }
}
