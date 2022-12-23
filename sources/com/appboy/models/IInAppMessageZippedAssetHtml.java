package com.appboy.models;

import androidx.annotation.Keep;

@Keep
public interface IInAppMessageZippedAssetHtml extends IInAppMessageHtml {
    String getAssetsZipRemoteUrl();

    void setAssetsZipRemoteUrl(String str);
}
