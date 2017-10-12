package com.andrean.lazzlax.gudangresepmama;

import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * Created by LazzLax on 10/12/2017.
 */

public class DetailResep extends AppCompatActivity {

    ImageView tampilGambarDetail;
    TextView tampilJudulDetail, tampilDescDetail;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_resep);

        tampilGambarDetail = (ImageView) findViewById(R.id.gambar_detail);
        tampilJudulDetail = (TextView) findViewById(R.id.txt_judul_detail);
        tampilDescDetail = (TextView) findViewById(R.id.txt_desc_detail);

        getData();
    }

    private void getData(){
        tampilJudulDetail.setText(getIntent().getStringExtra("id_judul"));
        tampilDescDetail.setText(getIntent().getStringExtra("id_desc"));

        Glide.with(this)
                .load(getIntent().getIntExtra("id_gambar", 0))
                .into(tampilGambarDetail);
    }
}
