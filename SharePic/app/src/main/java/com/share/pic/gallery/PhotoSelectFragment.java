package com.share.pic.gallery;

import com.share.pic.base.BaseFragment;

/**
 * jinmeng on 17-1-5.
 */
public class PhotoSelectFragment extends BaseFragment implements PhotoSelectContract.View {

    public static PhotoSelectFragment newInstance() {
        return new PhotoSelectFragment();
    }

    @Override
    public void setPresenter(PhotoSelectContract.Presenter presenter) {

    }
}
