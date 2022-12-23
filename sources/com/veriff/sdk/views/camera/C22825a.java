package com.veriff.sdk.views.camera;

import kotlin.Metadata;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J;\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001c"}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/AudioParameters;", "", "codecName", "", "mime", "sampleRate", "", "channelCount", "bitrate", "(Ljava/lang/String;Ljava/lang/String;III)V", "getBitrate", "()I", "getChannelCount", "getCodecName", "()Ljava/lang/String;", "getMime", "getSampleRate", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.a */
public final class C22825a {

    /* renamed from: a */
    private final String f57920a;

    /* renamed from: b */
    private final String f57921b;

    /* renamed from: c */
    private final int f57922c;

    /* renamed from: d */
    private final int f57923d;

    /* renamed from: e */
    private final int f57924e;

    public C22825a(String str, String str2, int i, int i2, int i3) {
        C24362h.m61211f(str, "codecName");
        C24362h.m61211f(str2, "mime");
        this.f57920a = str;
        this.f57921b = str2;
        this.f57922c = i;
        this.f57923d = i2;
        this.f57924e = i3;
    }

    /* renamed from: a */
    public final String mo57621a() {
        return this.f57920a;
    }

    /* renamed from: b */
    public final String mo57622b() {
        return this.f57921b;
    }

    /* renamed from: c */
    public final int mo57623c() {
        return this.f57922c;
    }

    /* renamed from: d */
    public final int mo57624d() {
        return this.f57923d;
    }

    /* renamed from: e */
    public final int mo57625e() {
        return this.f57924e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22825a)) {
            return false;
        }
        C22825a aVar = (C22825a) obj;
        return C24362h.m61206a(this.f57920a, aVar.f57920a) && C24362h.m61206a(this.f57921b, aVar.f57921b) && this.f57922c == aVar.f57922c && this.f57923d == aVar.f57923d && this.f57924e == aVar.f57924e;
    }

    public int hashCode() {
        String str = this.f57920a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f57921b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode + i) * 31) + this.f57922c) * 31) + this.f57923d) * 31) + this.f57924e;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("AudioParameters(codecName=");
        k.append(this.f57920a);
        k.append(", mime=");
        k.append(this.f57921b);
        k.append(", sampleRate=");
        k.append(this.f57922c);
        k.append(", channelCount=");
        k.append(this.f57923d);
        k.append(", bitrate=");
        return C13437d.m33707l(k, this.f57924e, ")");
    }
}
