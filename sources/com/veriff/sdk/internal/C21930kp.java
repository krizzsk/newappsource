package com.veriff.sdk.internal;

import cf0.C21132f;
import com.appboy.support.ValidationUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\nHÆ\u0003JE\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\nHÖ\u0001J\u0006\u0010 \u001a\u00020\bJ\b\u0010!\u001a\u00020\"H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/Apdu;", "", "cla", "", "ins", "p1", "p2", "data", "", "le", "", "(BBBB[BI)V", "getCla", "()B", "getData", "()[B", "getIns", "getLe", "()I", "getP1", "getP2", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toByteArray", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kp */
public final class C21930kp {

    /* renamed from: a */
    private final byte f55429a;

    /* renamed from: b */
    private final byte f55430b;

    /* renamed from: c */
    private final byte f55431c;

    /* renamed from: d */
    private final byte f55432d;

    /* renamed from: e */
    private final byte[] f55433e;

    /* renamed from: f */
    private final int f55434f;

    public C21930kp(byte b, byte b2, byte b3, byte b4, byte[] bArr, int i) {
        C24362h.m61211f(bArr, "data");
        this.f55429a = b;
        this.f55430b = b2;
        this.f55431c = b3;
        this.f55432d = b4;
        this.f55433e = bArr;
        this.f55434f = i;
    }

    /* renamed from: a */
    public final byte[] mo55725a() {
        boolean z;
        boolean z2;
        byte[] bArr;
        byte[] bArr2;
        boolean z3;
        byte[] bArr3 = this.f55433e;
        if (bArr3.length <= 65535) {
            int i = this.f55434f;
            if (i <= 65536) {
                if (bArr3.length > 255 || i > 256) {
                    z = true;
                } else {
                    z = false;
                }
                if (bArr3.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    bArr = new byte[0];
                } else {
                    bArr = !z ? new byte[]{(byte) bArr3.length} : new byte[]{0, (byte) ((bArr3.length >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (bArr3.length & ValidationUtils.APPBOY_STRING_MAX_LENGTH)};
                }
                if (i == 0) {
                    bArr2 = new byte[0];
                } else if (!z) {
                    bArr2 = new byte[]{(byte) i};
                } else {
                    if (bArr3.length == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    bArr2 = z3 ^ true ? new byte[]{(byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH)} : new byte[]{0, (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH)};
                }
                return C21132f.m49434Q0(C21132f.m49434Q0(C21132f.m49434Q0(new byte[]{this.f55429a, this.f55430b, this.f55431c, this.f55432d}, bArr), this.f55433e), bArr2);
            }
            throw new IllegalStateException("Expected reply too large");
        }
        throw new IllegalStateException("Data too large");
    }

    /* renamed from: b */
    public final byte mo55726b() {
        return this.f55430b;
    }

    /* renamed from: c */
    public final byte mo55727c() {
        return this.f55431c;
    }

    /* renamed from: d */
    public final byte mo55728d() {
        return this.f55432d;
    }

    /* renamed from: e */
    public final byte[] mo55729e() {
        return this.f55433e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21930kp)) {
            return false;
        }
        C21930kp kpVar = (C21930kp) obj;
        return this.f55429a == kpVar.f55429a && this.f55430b == kpVar.f55430b && this.f55431c == kpVar.f55431c && this.f55432d == kpVar.f55432d && C24362h.m61206a(this.f55433e, kpVar.f55433e) && this.f55434f == kpVar.f55434f;
    }

    /* renamed from: f */
    public final int mo55731f() {
        return this.f55434f;
    }

    public int hashCode() {
        int i = ((((((this.f55429a * 31) + this.f55430b) * 31) + this.f55431c) * 31) + this.f55432d) * 31;
        byte[] bArr = this.f55433e;
        return ((i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31) + this.f55434f;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("Apdu(cla=");
        k.append(C21941kx.m53552b(this.f55429a));
        k.append(", ins=");
        k.append(C21941kx.m53552b(this.f55430b));
        k.append(", p1=");
        k.append(C21941kx.m53552b(this.f55431c));
        k.append(", p2=");
        k.append(C21941kx.m53552b(this.f55432d));
        k.append(", ");
        k.append("data=");
        k.append(C21941kx.m53557f(this.f55433e));
        k.append(", le=");
        k.append(C21941kx.m53548a(this.f55434f));
        k.append(')');
        return k.toString();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21930kp(byte b, byte b2, byte b3, byte b4, byte[] bArr, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(b, b2, b3, b4, (i2 & 16) != 0 ? new byte[0] : bArr, (i2 & 32) != 0 ? 0 : i);
    }
}
