package com.veriff.sdk.views.camera;

import com.usebutton.sdk.internal.api.AppActionRequest;
import com.veriff.sdk.internal.C21886js;
import com.veriff.sdk.internal.C22549tg;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\rHÆ\u0003JG\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, mo59060d2 = {"Lcom/veriff/sdk/views/camera/VideoConfiguration;", "", "context", "Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "fileName", "", "targetResolution", "Lcom/veriff/sdk/internal/data/Resolution;", "maxFileSize", "", "video", "Lcom/veriff/sdk/views/camera/VideoParameters;", "audio", "Lcom/veriff/sdk/views/camera/AudioParameters;", "(Lmobi/lab/veriff/data/api/request/payload/VideoContext;Ljava/lang/String;Lcom/veriff/sdk/internal/data/Resolution;JLcom/veriff/sdk/views/camera/VideoParameters;Lcom/veriff/sdk/views/camera/AudioParameters;)V", "getAudio", "()Lcom/veriff/sdk/views/camera/AudioParameters;", "getContext", "()Lmobi/lab/veriff/data/api/request/payload/VideoContext;", "getFileName", "()Ljava/lang/String;", "getMaxFileSize", "()J", "getTargetResolution", "()Lcom/veriff/sdk/internal/data/Resolution;", "getVideo", "()Lcom/veriff/sdk/views/camera/VideoParameters;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.views.camera.ah */
public final class C22833ah {

    /* renamed from: a */
    private final C22549tg f57940a;

    /* renamed from: b */
    private final String f57941b;

    /* renamed from: c */
    private final C21886js f57942c;

    /* renamed from: d */
    private final long f57943d;

    /* renamed from: e */
    private final C22836ak f57944e;

    /* renamed from: f */
    private final C22825a f57945f;

    public C22833ah(C22549tg tgVar, String str, C21886js jsVar, long j, C22836ak akVar, C22825a aVar) {
        C24362h.m61211f(tgVar, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(str, "fileName");
        C24362h.m61211f(jsVar, "targetResolution");
        C24362h.m61211f(akVar, "video");
        this.f57940a = tgVar;
        this.f57941b = str;
        this.f57942c = jsVar;
        this.f57943d = j;
        this.f57944e = akVar;
        this.f57945f = aVar;
    }

    /* renamed from: a */
    public final C22549tg mo57639a() {
        return this.f57940a;
    }

    /* renamed from: b */
    public final String mo57640b() {
        return this.f57941b;
    }

    /* renamed from: c */
    public final C21886js mo57641c() {
        return this.f57942c;
    }

    /* renamed from: d */
    public final long mo57642d() {
        return this.f57943d;
    }

    /* renamed from: e */
    public final C22836ak mo57643e() {
        return this.f57944e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22833ah)) {
            return false;
        }
        C22833ah ahVar = (C22833ah) obj;
        return C24362h.m61206a(this.f57940a, ahVar.f57940a) && C24362h.m61206a(this.f57941b, ahVar.f57941b) && C24362h.m61206a(this.f57942c, ahVar.f57942c) && this.f57943d == ahVar.f57943d && C24362h.m61206a(this.f57944e, ahVar.f57944e) && C24362h.m61206a(this.f57945f, ahVar.f57945f);
    }

    /* renamed from: f */
    public final C22825a mo57645f() {
        return this.f57945f;
    }

    public int hashCode() {
        C22549tg tgVar = this.f57940a;
        int i = 0;
        int hashCode = (tgVar != null ? tgVar.hashCode() : 0) * 31;
        String str = this.f57941b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C21886js jsVar = this.f57942c;
        int hashCode3 = jsVar != null ? jsVar.hashCode() : 0;
        long j = this.f57943d;
        int i2 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        C22836ak akVar = this.f57944e;
        int hashCode4 = (i2 + (akVar != null ? akVar.hashCode() : 0)) * 31;
        C22825a aVar = this.f57945f;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("VideoConfiguration(context=");
        k.append(this.f57940a);
        k.append(", fileName=");
        k.append(this.f57941b);
        k.append(", targetResolution=");
        k.append(this.f57942c);
        k.append(", maxFileSize=");
        k.append(this.f57943d);
        k.append(", video=");
        k.append(this.f57944e);
        k.append(", audio=");
        k.append(this.f57945f);
        k.append(")");
        return k.toString();
    }
}
