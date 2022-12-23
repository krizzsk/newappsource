package com.veriff.sdk.internal;

import com.appsflyer.internal.referrer.Payload;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;
import p584jl.C17885a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/ResponseApdu;", "", "sw1", "", "sw2", "response", "", "(BB[B)V", "isSuccess", "", "()Z", "getResponse", "()[B", "getSw1", "()B", "getSw2", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lp */
public final class C21973lp {

    /* renamed from: a */
    public static final C21974a f55480a = new C21974a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final byte f55481b;

    /* renamed from: c */
    private final byte f55482c;

    /* renamed from: d */
    private final byte[] f55483d;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/ResponseApdu$Companion;", "", "()V", "fromByteArray", "Lcom/veriff/sdk/internal/nfc/ResponseApdu;", "bytes", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.lp$a */
    public static final class C21974a {
        private C21974a() {
        }

        public /* synthetic */ C21974a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C21973lp mo55798a(byte[] bArr) {
            C24362h.m61211f(bArr, "bytes");
            if (bArr.length >= 2) {
                return new C21973lp(bArr[bArr.length - 2], bArr[bArr.length - 1], C23816b.m58448d1(bArr, C17885a.m44393C0(0, bArr.length - 2)));
            }
            throw new IllegalArgumentException(C13437d.m33707l(C13555b.m33972k("Invalid ResponseApdu size "), bArr.length, " bytes"));
        }
    }

    public C21973lp(byte b, byte b2, byte[] bArr) {
        C24362h.m61211f(bArr, Payload.RESPONSE);
        this.f55481b = b;
        this.f55482c = b2;
        this.f55483d = bArr;
    }

    /* renamed from: a */
    public static /* synthetic */ C21973lp m53594a(C21973lp lpVar, byte b, byte b2, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            b = lpVar.f55481b;
        }
        if ((i & 2) != 0) {
            b2 = lpVar.f55482c;
        }
        if ((i & 4) != 0) {
            bArr = lpVar.f55483d;
        }
        return lpVar.mo55790a(b, b2, bArr);
    }

    /* renamed from: a */
    public final C21973lp mo55790a(byte b, byte b2, byte[] bArr) {
        C24362h.m61211f(bArr, Payload.RESPONSE);
        return new C21973lp(b, b2, bArr);
    }

    /* renamed from: a */
    public final boolean mo55791a() {
        byte b = this.f55481b;
        if ((b == ((byte) 144) && this.f55482c == ((byte) 0)) || (b == ((byte) 98) && this.f55482c == ((byte) 130))) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final byte mo55792b() {
        return this.f55481b;
    }

    /* renamed from: c */
    public final byte mo55793c() {
        return this.f55482c;
    }

    /* renamed from: d */
    public final byte[] mo55794d() {
        return this.f55483d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21973lp)) {
            return false;
        }
        C21973lp lpVar = (C21973lp) obj;
        return this.f55481b == lpVar.f55481b && this.f55482c == lpVar.f55482c && C24362h.m61206a(this.f55483d, lpVar.f55483d);
    }

    public int hashCode() {
        int i = ((this.f55481b * 31) + this.f55482c) * 31;
        byte[] bArr = this.f55483d;
        return i + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("ResponseApdu(sw=");
        k.append(C21941kx.m53552b(this.f55481b));
        k.append(C21941kx.m53552b(this.f55482c));
        k.append(", response=");
        k.append(C21941kx.m53557f(this.f55483d));
        k.append(", isSuccess=");
        k.append(mo55791a());
        k.append(')');
        return k.toString();
    }
}
