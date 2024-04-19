package com.example.elanalogo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Roladmin extends AppCompatActivity {
   Button ba1;
   LinearLayout lna1, lna2, lna3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_roladmin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ba1 = findViewById(R.id.Badmsalir);
        lna1 = findViewById(R.id.Lnadmin);
        lna2 = findViewById(R.id.Lnusuario);
        lna3 = findViewById(R.id.Lnvendedor);

        lna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irregadmin = new Intent(Roladmin. this, Regadmin.class);
                startActivity(irregadmin);
            }
        });

        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}