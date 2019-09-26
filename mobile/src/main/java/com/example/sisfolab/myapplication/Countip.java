package com.example.sisfolab.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Layout_2 extends AppCompatActivity {

    Button tombol;
    Intent pindah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mengarah ke layout_2.xml
        setContentView(R.layout.layout_2);

        tombol = (Button)findViewById(R.id.ke_layout_1);

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //kode untuk pindah ke actifity lain
                pindah = new Intent(Layout_2.this, MainActivity.class);
                startActivity(pindah);
                //saat pindah, activity yg sekarang langsung ditutup
                //agar saat menekan tombol kembali tidak bolak-balik
                finish();
            }
        });
    }
}
