package com.example.elanalogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Login extends AppCompatActivity {
     EditText t1,t2;
     Button b1;
    TextView l1;
    final String usuario1 ="Camilo";
    final String contra1 ="12345";
    final String usuario2 = "Mario";
    final String contra2 = "54321";
    final String usuario3 = "Valentina";
    final String contra3 = "67890";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
         t1 = findViewById(R.id.Tusuario);
         t2 = findViewById(R.id.Tcontra);
         b1 = findViewById(R.id.Bvalidar);
         l1 = findViewById(R.id.Lregistrar);

         b1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 if (t1.getText().toString().isEmpty() ||  t2.getText().toString().isEmpty() ) {
                     Toast.makeText(Login.this, "Faltan datos campos vacios", Toast.LENGTH_SHORT).show();


                 }else{
                    if (t1.getText().toString().equals(usuario1.toString()) && t2.getText().toString().equals(contra1.toString()) ){
                        Toast.makeText(Login.this, "Bienvenido admin", Toast.LENGTH_SHORT).show();
                        Intent irRoladmin = new Intent(Login.this, Roladmin.class);
                         startActivity(irRoladmin);
                         finish();
                    }else{
                        if (t1.getText().toString().equals(usuario2.toString()) && t2.getText().toString().equals(contra2.toString()) ){
                            Toast.makeText(Login.this, "Bienvenido usuario", Toast.LENGTH_SHORT).show();
                            Intent irRolusuario = new Intent(Login.this, Rolusuario.class);
                            startActivity(irRolusuario);
                            finish();
                        }else {
                            if (t1.getText().toString().equals(usuario3.toString()) && t2.getText().toString().equals(contra3.toString()) ) {
                                Toast.makeText(Login.this, "Bienvenido vendedor", Toast.LENGTH_SHORT).show();
                                Intent irRolvendedor = new Intent(Login.this, Rolvendedor.class);
                                startActivity(irRolvendedor);
                                finish();


                            }else {
                                Toast.makeText(Login.this, "Usuario o contraseña invalidos", Toast.LENGTH_SHORT).show();
                            }
                            }
                        }


                         //Toast.makeText(Login.this, "Bienvenido", Toast.LENGTH_SHORT).show();

                 }//fin if
             }//cerrar onclic
         });//cerrar oncliclistener

         l1.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent irregistrar = new Intent(Login.this,Registrese.class);
                 startActivity(irregistrar);
             }

         });
    }
}