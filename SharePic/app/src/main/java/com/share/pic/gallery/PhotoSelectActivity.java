package com.share.pic.gallery;

import android.os.Bundle;

import com.share.pic.R;
import com.share.pic.base.BaseFragmentActivity;
import com.share.pic.utils.ActivityUtils;

/**
 * jinmeng on 17-1-5.
 */
public class PhotoSelectActivity extends BaseFragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo_select);

        PhotoSelectFragment photoSelectFragment = (PhotoSelectFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (photoSelectFragment == null) {
            photoSelectFragment = PhotoSelectFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), photoSelectFragment, R.id.contentFrame);
        }

        new PhotoSelectPresenter(photoSelectFragment);
    }
}
