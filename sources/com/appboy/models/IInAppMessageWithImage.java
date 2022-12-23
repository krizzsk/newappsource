package com.appboy.models;

import android.graphics.Bitmap;
import androidx.annotation.Keep;

@Keep
public interface IInAppMessageWithImage {
    Bitmap getBitmap();

    boolean getImageDownloadSuccessful();

    String getImageUrl();

    String getLocalImageUrl();

    String getRemoteImageUrl();

    void setBitmap(Bitmap bitmap);

    void setImageDownloadSuccessful(boolean z);

    @Deprecated
    void setImageUrl(String str);

    void setLocalImageUrl(String str);

    void setRemoteImageUrl(String str);
}
