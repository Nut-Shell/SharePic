package com.share.pic.gallery;

/**
 * jinmeng on 17-1-5.
 */
public class PhotoSelectPresenter implements PhotoSelectContract.Presenter {

    final PhotoSelectContract.View mView;

    public PhotoSelectPresenter(PhotoSelectContract.View view) {
        this.mView = view;
        this.mView.setPresenter(this);
    }

    @Override
    public void start() {

    }
}
