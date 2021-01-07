package com.example.edittext;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_id;
    Button btn_test; //alt+enter누르면 자동으로 필요한 거 import됨

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        et_id=findViewById(R.id.et_id); //et_id와 activity_main에 있는 et_id랑 연결이 된것
        btn_test=findViewById(R.id.btn_test);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et_id.setText("한다현"); //버튼 클릭시 EditText에 동적으로 한다현이라는 텍스트가 들어감
            }
        });
    }
}