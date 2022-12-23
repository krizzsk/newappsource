package com.appboy.models;

import androidx.annotation.Keep;

@Keep
public interface IInAppMessageHtml extends IInAppMessage {
    String getLocalAssetsDirectoryUrl();

    boolean logButtonClick(String str);

    void setLocalAssetsDirectoryUrl(String str);
}
