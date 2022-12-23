package com.veriff.sdk.views.camera;

import android.util.Size;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\b\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JY\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\r2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014¨\u0006("}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/VideoParameters;", "", "container", "", "codecName", "", "mime", "bitRate", "frameRate", "iFrameInterval", "maxResolution", "Landroid/util/Size;", "avoidImageApis", "", "(ILjava/lang/String;Ljava/lang/String;IIILandroid/util/Size;Z)V", "getAvoidImageApis", "()Z", "getBitRate", "()I", "getCodecName", "()Ljava/lang/String;", "getContainer", "getFrameRate", "getIFrameInterval", "getMaxResolution", "()Landroid/util/Size;", "getMime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ak */
public final class C22836ak {

    /* renamed from: a */
    private final int f57950a;

    /* renamed from: b */
    private final String f57951b;

    /* renamed from: c */
    private final String f57952c;

    /* renamed from: d */
    private final int f57953d;

    /* renamed from: e */
    private final int f57954e;

    /* renamed from: f */
    private final int f57955f;

    /* renamed from: g */
    private final Size f57956g;

    /* renamed from: h */
    private final boolean f57957h;

    public C22836ak(int i, String str, String str2, int i2, int i3, int i4, Size size, boolean z) {
        C24362h.m61211f(str, "codecName");
        C24362h.m61211f(str2, "mime");
        C24362h.m61211f(size, "maxResolution");
        this.f57950a = i;
        this.f57951b = str;
        this.f57952c = str2;
        this.f57953d = i2;
        this.f57954e = i3;
        this.f57955f = i4;
        this.f57956g = size;
        this.f57957h = z;
    }

    /* renamed from: a */
    public final int mo57650a() {
        return this.f57950a;
    }

    /* renamed from: b */
    public final String mo57651b() {
        return this.f57951b;
    }

    /* renamed from: c */
    public final String mo57652c() {
        return this.f57952c;
    }

    /* renamed from: d */
    public final int mo57653d() {
        return this.f57953d;
    }

    /* renamed from: e */
    public final int mo57654e() {
        return this.f57954e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22836ak)) {
            return false;
        }
        C22836ak akVar = (C22836ak) obj;
        return this.f57950a == akVar.f57950a && C24362h.m61206a(this.f57951b, akVar.f57951b) && C24362h.m61206a(this.f57952c, akVar.f57952c) && this.f57953d == akVar.f57953d && this.f57954e == akVar.f57954e && this.f57955f == akVar.f57955f && C24362h.m61206a(this.f57956g, akVar.f57956g) && this.f57957h == akVar.f57957h;
    }

    /* renamed from: f */
    public final int mo57656f() {
        return this.f57955f;
    }

    /* renamed from: g */
    public final Size mo57657g() {
        return this.f57956g;
    }

    /* renamed from: h */
    public final boolean mo57658h() {
        return this.f57957h;
    }

    public int hashCode() {
        int i = this.f57950a * 31;
        String str = this.f57951b;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f57952c;
        int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f57953d) * 31) + this.f57954e) * 31) + this.f57955f) * 31;
        Size size = this.f57956g;
        if (size != null) {
            i2 = size.hashCode();
        }
        int i3 = (hashCode2 + i2) * 31;
        boolean z = this.f57957h;
        if (z) {
            z = true;
        }
        return i3 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VideoParameters(container=");
        k.append(this.f57950a);
        k.append(", codecName=");
        k.append(this.f57951b);
        k.append(", mime=");
        k.append(this.f57952c);
        k.append(", bitRate=");
        k.append(this.f57953d);
        k.append(", frameRate=");
        k.append(this.f57954e);
        k.append(", iFrameInterval=");
        k.append(this.f57955f);
        k.append(", maxResolution=");
        k.append(this.f57956g);
        k.append(", avoidImageApis=");
        return C25541a.m63885p(k, this.f57957h, ")");
    }
}
