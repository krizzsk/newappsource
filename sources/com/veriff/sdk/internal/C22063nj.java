package com.veriff.sdk.internal;

import com.appboy.support.AppboyFileUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import kotlin.Metadata;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u001a"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/UploadKey;", "", "verificationId", "", "file", "context", "metadata", "Lmobi/lab/veriff/data/api/request/payload/UploadData;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lmobi/lab/veriff/data/api/request/payload/UploadData;)V", "getContext", "()Ljava/lang/String;", "getFile", "getMetadata", "()Lmobi/lab/veriff/data/api/request/payload/UploadData;", "getVerificationId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.nj */
public final class C22063nj {

    /* renamed from: a */
    private final String f55655a;

    /* renamed from: b */
    private final String f55656b;

    /* renamed from: c */
    private final String f55657c;

    /* renamed from: d */
    private final C22547te f55658d;

    public C22063nj(String str, String str2, String str3, C22547te teVar) {
        C13437d.m33711q(str, "verificationId", str2, AppboyFileUtils.FILE_SCHEME, str3, AppActionRequest.KEY_CONTEXT);
        this.f55655a = str;
        this.f55656b = str2;
        this.f55657c = str3;
        this.f55658d = teVar;
    }

    /* renamed from: a */
    public final String mo55942a() {
        return this.f55657c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22063nj)) {
            return false;
        }
        C22063nj njVar = (C22063nj) obj;
        return C24362h.m61206a(this.f55655a, njVar.f55655a) && C24362h.m61206a(this.f55656b, njVar.f55656b) && C24362h.m61206a(this.f55657c, njVar.f55657c) && C24362h.m61206a(this.f55658d, njVar.f55658d);
    }

    public int hashCode() {
        String str = this.f55655a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f55656b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f55657c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C22547te teVar = this.f55658d;
        if (teVar != null) {
            i = teVar.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("UploadKey(verificationId=");
        k.append(this.f55655a);
        k.append(", file=");
        k.append(this.f55656b);
        k.append(", context=");
        k.append(this.f55657c);
        k.append(", metadata=");
        k.append(this.f55658d);
        k.append(")");
        return k.toString();
    }
}
