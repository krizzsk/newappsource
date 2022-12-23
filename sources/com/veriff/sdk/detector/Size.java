package com.veriff.sdk.detector;

import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/detector/Size;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "width", "F", "getWidth", "()F", "height", "getHeight", "<init>", "(FF)V", "detector-common_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class Size {
    private final float height;
    private final float width;

    public Size(float f, float f2) {
        this.width = f;
        this.height = f2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Size)) {
            return false;
        }
        Size size = (Size) obj;
        return Float.compare(this.width, size.width) == 0 && Float.compare(this.height, size.height) == 0;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.height) + (Float.floatToIntBits(this.width) * 31);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Size(width=");
        k.append(this.width);
        k.append(", height=");
        k.append(this.height);
        k.append(")");
        return k.toString();
    }
}
