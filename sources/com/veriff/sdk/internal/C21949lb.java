package com.veriff.sdk.internal;

import cf0.C21132f;
import com.appboy.support.ValidationUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import p358af.C13437d;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0012\u001a\u00020\u0013J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/DataObjectHeader;", "", "tag", "", "len", "(II)V", "headerSize", "getHeaderSize", "()I", "getLen", "getTag", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toByteArray", "", "toString", "", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lb */
public final class C21949lb {

    /* renamed from: a */
    public static final C21950a f55453a = new C21950a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final int f55454b;

    /* renamed from: c */
    private final int f55455c;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/DataObjectHeader$Companion;", "", "()V", "fromBytes", "Lcom/veriff/sdk/internal/nfc/DataObjectHeader;", "input", "", "offset", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.lb$a */
    public static final class C21950a {
        private C21950a() {
        }

        public /* synthetic */ C21950a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public static /* synthetic */ C21949lb m53573a(C21950a aVar, byte[] bArr, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return aVar.mo55767a(bArr, i);
        }

        /* renamed from: a */
        public final C21949lb mo55767a(byte[] bArr, int i) {
            byte b;
            C24362h.m61211f(bArr, "input");
            byte b2 = bArr[i] & 255;
            int i2 = i + 1;
            if ((b2 & 31) == 31) {
                do {
                    b2 = (b2 << 8) | (bArr[i2] & 255);
                    i2++;
                } while ((b2 & 128) == 128);
            }
            byte b3 = bArr[i2];
            byte b4 = b3 & 255;
            if (b4 == 129) {
                b = bArr[i2 + 1] & 255;
            } else if (b4 != 130) {
                b = b3 & Byte.MAX_VALUE;
            } else {
                b = (bArr[i2 + 2] & 255) | ((bArr[i2 + 1] & 255) << 8);
            }
            return new C21949lb(b2, b);
        }
    }

    public C21949lb(int i, int i2) {
        this.f55454b = i;
        this.f55455c = i2;
    }

    /* renamed from: a */
    public final int mo55760a() {
        int i;
        int i2 = this.f55454b;
        int i3 = 2;
        if (i2 > 16777215 || i2 < 0) {
            i = 4;
        } else if (i2 > 65535) {
            i = 3;
        } else if (i2 > 255) {
            i = 2;
        } else {
            i = 1;
        }
        int i4 = this.f55455c;
        if (i4 > 255) {
            i3 = 3;
        } else if (i4 <= 127) {
            i3 = 1;
        }
        return i + i3;
    }

    /* renamed from: b */
    public final byte[] mo55761b() {
        int i = this.f55454b;
        byte[] bArr = (i > 16777215 || i < 0) ? new byte[]{(byte) ((i >>> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) ((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH)} : i > 65535 ? new byte[]{(byte) ((i >>> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH)} : i > 255 ? new byte[]{(byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH)} : new byte[]{(byte) i};
        int i2 = this.f55455c;
        return C21132f.m49434Q0(bArr, i2 > 255 ? new byte[]{(byte) 130, (byte) ((i2 >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH)} : i2 > 127 ? new byte[]{(byte) 129, (byte) (i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH)} : new byte[]{(byte) (i2 & 127)});
    }

    /* renamed from: c */
    public final int mo55762c() {
        return this.f55454b;
    }

    /* renamed from: d */
    public final int mo55763d() {
        return this.f55455c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21949lb)) {
            return false;
        }
        C21949lb lbVar = (C21949lb) obj;
        return this.f55454b == lbVar.f55454b && this.f55455c == lbVar.f55455c;
    }

    public int hashCode() {
        return (this.f55454b * 31) + this.f55455c;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("DataObjectHeader(tag=");
        k.append(this.f55454b);
        k.append(", len=");
        return C13437d.m33707l(k, this.f55455c, ")");
    }
}
