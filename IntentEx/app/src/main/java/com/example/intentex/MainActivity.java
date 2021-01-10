package com.example.intentex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btn_move;
    private EditText et_test;
    private String str;
    ImageView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //java파일의 컨텐트 뷰를 activity_main에 연결

        et_test=findViewById(R.id.et_test);


        btn_move=findViewById(R.id.btn_move);
        btn_move.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=et_test.getText().toString();
                Intent intent = new Intent(MainActivity.this,SubActivity.class);
                //괄호 안에 현재 액티비티, 이동하고싶은 액티비티를 순서대로 적음
                intent.putExtra( "str",str); //다음액티비티에서 ""안의 별명을 이용해서 받아옴
                startActivity(intent); //실제적으로 액티비티를 이동시킴
            }
        });

        test=(ImageView)findViewById(R.id.test);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"dh",Toast.LENGTH_SHORT).show();
                //()안에 원하는 글자를 적어서 팝업으로 짧게(Toast.LENGTH_SHORT) 송출
            }
        });
    }
}