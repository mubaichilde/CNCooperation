package com.cainiao.common.widget.imageloader;

import android.graphics.Bitmap;

/**
 * Created by wuyinlei on 2017/7/22.
 */

public interface BitmapLoadingListener {

    void onSuccess(Bitmap b);

    void onError();
}
