package com.example.shwetatripathi.apknew;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class NewUser extends AppCompatActivity {

    EditText name;
    EditText pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        name=findViewById(R.id.name);
        pass=findViewById(R.id.pass);
        findViewById(R.id.btnSave).setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {
                final String pass1 = pass.getText().toString();
                if(!isValidPassword(pass1))
                {
                    pass.setError("Invalid Password");
}
            }
        });
}
    private boolean isValidPassword(String pass1) {
        if (pass1 != null ) {
            return true;
        }
        return false;
    }
}