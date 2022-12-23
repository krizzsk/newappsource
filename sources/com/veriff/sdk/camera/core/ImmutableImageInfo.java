package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.TagBundle;
import com.veriff.sdk.camera.core.impl.utils.ExifData;

abstract class ImmutableImageInfo implements ImageInfo {
    public static ImageInfo create(TagBundle tagBundle, long j, int i) {
        return new AutoValue_ImmutableImageInfo(tagBundle, j, i);
    }

    public abstract int getRotationDegrees();

    public abstract TagBundle getTagBundle();

    public abstract long getTimestamp();

    public void populateExifData(ExifData.Builder builder) {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}
