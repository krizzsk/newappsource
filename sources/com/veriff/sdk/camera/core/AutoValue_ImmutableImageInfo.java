package com.veriff.sdk.camera.core;

import com.veriff.sdk.camera.core.impl.TagBundle;
import p358af.C13437d;

final class AutoValue_ImmutableImageInfo extends ImmutableImageInfo {
    private final int rotationDegrees;
    private final TagBundle tagBundle;
    private final long timestamp;

    public AutoValue_ImmutableImageInfo(TagBundle tagBundle2, long j, int i) {
        if (tagBundle2 != null) {
            this.tagBundle = tagBundle2;
            this.timestamp = j;
            this.rotationDegrees = i;
            return;
        }
        throw new NullPointerException("Null tagBundle");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableImageInfo)) {
            return false;
        }
        ImmutableImageInfo immutableImageInfo = (ImmutableImageInfo) obj;
        if (this.tagBundle.equals(immutableImageInfo.getTagBundle()) && this.timestamp == immutableImageInfo.getTimestamp() && this.rotationDegrees == immutableImageInfo.getRotationDegrees()) {
            return true;
        }
        return false;
    }

    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public TagBundle getTagBundle() {
        return this.tagBundle;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        long j = this.timestamp;
        return ((((this.tagBundle.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.rotationDegrees;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ImmutableImageInfo{tagBundle=");
        k.append(this.tagBundle);
        k.append(", timestamp=");
        k.append(this.timestamp);
        k.append(", rotationDegrees=");
        return C13437d.m33707l(k, this.rotationDegrees, "}");
    }
}
