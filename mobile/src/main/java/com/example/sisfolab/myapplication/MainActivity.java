package com.example.sisfolab.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity{

    Button tombol;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tombol = (Button)findViewById(R.id.ke_layout_2);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode untuk pindah ke actifity lain
                pindah = new Intent(MainActivity.this, Layout_2.class);
                startActivity(pindah);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });

    }
}