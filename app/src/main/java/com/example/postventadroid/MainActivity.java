package com.example.postventadroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;

import com.example.postventadroid.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //boton para cambiar de actvidad , contiene metodo secondActivity
        binding.ButtonIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secondActivityIntent();

            }
        });

    }

    //crear metodo para cambiar de actividad
    private void secondActivityIntent(){
        Intent mIntent = new Intent(this, Activity2.class);
        startActivity(mIntent);
    }
}