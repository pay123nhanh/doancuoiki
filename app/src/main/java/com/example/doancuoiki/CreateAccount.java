package com.example.doancuoiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateAccount extends AppCompatActivity {

    Button btncreate,reg_acc;
    TextInputLayout regname,regusername,regemail,regphoneNo,regpassword;
    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        btncreate =findViewById(R.id.btncreate);
        reg_acc =findViewById(R.id.reg_account);
        regname =findViewById(R.id.regname);
        regusername =findViewById(R.id.regusername);
        regemail =findViewById(R.id.regemail);
        regphoneNo =findViewById(R.id.regphoneNo);
        regpassword =findViewById(R.id.regpassword);


        reg_acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CreateAccount.this, dangnhap.class);
                startActivity(intent);
            }
        });

        btncreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("users");

                String name = regname.getEditText().getText().toString();
                String username = regusername.getEditText().getText().toString();
                String email = regemail.getEditText().getText().toString();
                String phoneNo = regphoneNo.getEditText().getText().toString();
                String password = regpassword.getEditText().getText().toString();

                usersHelper helper = new usersHelper(name,username,email,phoneNo,password);
                reference.child(phoneNo).setValue(helper);
            }
        });



    }
}