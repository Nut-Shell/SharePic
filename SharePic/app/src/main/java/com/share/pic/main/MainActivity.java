package com.share.pic.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.share.pic.base.BaseFragmentActivity;
import com.share.pic.R;
import com.share.pic.gallery.PhotoSelectActivity;

public class MainActivity extends BaseFragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.to_photo_select).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PhotoSelectActivity.class);
                startActivity(intent);
            }
        });
    }
}
