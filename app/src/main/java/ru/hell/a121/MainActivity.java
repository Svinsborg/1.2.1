package ru.hell.a121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button butOk =  findViewById(R.id.butOk);
        Button butClr = findViewById(R.id.butClr);

        final EditText userName = findViewById(R.id.inUser);
        final EditText userEmail = findViewById(R.id.inEmail);

        final TextView result = findViewById(R.id.result);

        butOk.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                result.setText("Подписка на рассылку успешно оформлена для пользователя " + userName.getText() + " электронный адрес " + userEmail.getText());
/*                getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);*/
                InputMethodManager imm = (InputMethodManager) getSystemService(Activity.INPUT_METHOD_SERVICE);
                imm.toggleSoftInput(InputMethodManager.HIDE_IMPLICIT_ONLY, 0);
            }
        });

        butClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userName.setText("");
                userEmail.setText("");
                result.setText("");
            }
        });



    }
}
