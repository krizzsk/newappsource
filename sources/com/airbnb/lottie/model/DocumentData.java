package com.airbnb.lottie.model;

public final class DocumentData {

    /* renamed from: a */
    public final String f6528a;

    /* renamed from: b */
    public final String f6529b;

    /* renamed from: c */
    public final float f6530c;

    /* renamed from: d */
    public final Justification f6531d;

    /* renamed from: e */
    public final int f6532e;

    /* renamed from: f */
    public final float f6533f;

    /* renamed from: g */
    public final float f6534g;

    /* renamed from: h */
    public final int f6535h;

    /* renamed from: i */
    public final int f6536i;

    /* renamed from: j */
    public final float f6537j;

    /* renamed from: k */
    public final boolean f6538k;

    public enum Justification {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public DocumentData(String str, String str2, float f, Justification justification, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f6528a = str;
        this.f6529b = str2;
        this.f6530c = f;
        this.f6531d = justification;
        this.f6532e = i;
        this.f6533f = f2;
        this.f6534g = f3;
        this.f6535h = i2;
        this.f6536i = i3;
        this.f6537j = f4;
        this.f6538k = z;
    }

    public final int hashCode() {
        String str = this.f6529b;
        int ordinal = ((this.f6531d.ordinal() + (((int) (((float) C13715c.m34238d(str, this.f6528a.hashCode() * 31, 31)) + this.f6530c)) * 31)) * 31) + this.f6532e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f6533f);
        return (((ordinal * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f6535h;
    }
}
