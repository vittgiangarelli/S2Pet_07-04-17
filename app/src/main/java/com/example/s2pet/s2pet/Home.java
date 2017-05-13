package com.example.s2pet.s2pet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Home extends AppCompatActivity {


    private FirebaseDatabase database; //TODO 6 - linha que cria uma instâcia de um obejto do tipo FirebaseDatabase
    private DatabaseReference reference; //TODO 7 - linha que cria uma instâcia de um obejto do tipo DatabaseReference

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        database =  FirebaseDatabase.getInstance();  //TODO 8 - esta linha atribui a variável a instâcia da base de dados do Firebase
        reference = database.getReference("Donos");  //TODO 9 - esta linha atribui a variável uma referência("tabela") da base de dados
    }
}
