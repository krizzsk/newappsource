package com.veriff.sdk.detector;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, mo59060d2 = {"Lcom/veriff/sdk/detector/Face;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/veriff/sdk/detector/Rectangle;", "boundingBox", "Lcom/veriff/sdk/detector/Rectangle;", "getBoundingBox", "()Lcom/veriff/sdk/detector/Rectangle;", "Lcom/veriff/sdk/detector/EulerAngle;", "orientation", "Lcom/veriff/sdk/detector/EulerAngle;", "getOrientation", "()Lcom/veriff/sdk/detector/EulerAngle;", "<init>", "(Lcom/veriff/sdk/detector/Rectangle;Lcom/veriff/sdk/detector/EulerAngle;)V", "detector-common_release"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class Face {
    private final Rectangle boundingBox;
    private final EulerAngle orientation;

    public Face(Rectangle rectangle, EulerAngle eulerAngle) {
        C24362h.m61211f(rectangle, "boundingBox");
        C24362h.m61211f(eulerAngle, "orientation");
        this.boundingBox = rectangle;
        this.orientation = eulerAngle;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Face)) {
            return false;
        }
        Face face = (Face) obj;
        return C24362h.m61206a(this.boundingBox, face.boundingBox) && C24362h.m61206a(this.orientation, face.orientation);
    }

    public final Rectangle getBoundingBox() {
        return this.boundingBox;
    }

    public final EulerAngle getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        Rectangle rectangle = this.boundingBox;
        int i = 0;
        int hashCode = (rectangle != null ? rectangle.hashCode() : 0) * 31;
        EulerAngle eulerAngle = this.orientation;
        if (eulerAngle != null) {
            i = eulerAngle.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Face(boundingBox=");
        k.append(this.boundingBox);
        k.append(", orientation=");
        k.append(this.orientation);
        k.append(")");
        return k.toString();
    }
}
