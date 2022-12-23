package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.TagBundle;
import com.veriff.sdk.camera.core.impl.utils.ExifData;

public interface ImageInfo {
    TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(ExifData.Builder builder);
}
