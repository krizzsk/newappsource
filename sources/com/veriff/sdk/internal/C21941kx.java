package com.veriff.sdk.internal;

import androidx.recyclerview.widget.RecyclerView;
import cf0.C21132f;
import com.appboy.support.ValidationUtils;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C24179b;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import p584jl.C17885a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\u001a!\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0003\"\u00020\u0004H\u0000¢\u0006\u0002\u0010\u0005\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\b\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0004*\u00020\u0007H\u0000\u001a\f\u0010\u000b\u001a\u00020\u0004*\u00020\fH\u0000\u001a\n\u0010\r\u001a\u00020\u0004*\u00020\u0001\u001a\u0012\u0010\r\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0000\u001a\f\u0010\u000f\u001a\u00020\u0001*\u00020\u0001H\u0000\u001a\u0015\u0010\u0010\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0001H\u0004¨\u0006\u0012"}, mo59060d2 = {"hexToBytes", "", "hexStrings", "", "", "([Ljava/lang/String;)[B", "adjustParity", "", "inc", "pad", "to3DesKey", "toHex", "", "toHexString", "", "unpad", "xor", "that", "veriff-library_dist"}, mo59061k = 2, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kx */
public final class C21941kx {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "", "invoke", "(B)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kx$a */
    public static final class C21942a extends Lambda implements C24236l<Byte, CharSequence> {

        /* renamed from: a */
        public static final C21942a f55448a = new C21942a();

        public C21942a() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo55750a(byte b) {
            return C21941kx.m53552b(b);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return mo55750a(((Number) obj).byteValue());
        }
    }

    /* renamed from: a */
    public static final byte[] m53550a(byte[] bArr) {
        C24362h.m61211f(bArr, "$this$pad");
        int length = 8 - (bArr.length % 8);
        byte[] bArr2 = new byte[length];
        int i = 0;
        while (i < length) {
            bArr2[i] = i == 0 ? (byte) RecyclerView.C1119a0.FLAG_IGNORE : 0;
            i++;
        }
        return C21132f.m49434Q0(bArr, bArr2);
    }

    /* renamed from: b */
    public static final byte[] m53553b(byte[] bArr) {
        byte b;
        C24362h.m61211f(bArr, "$this$unpad");
        int length = bArr.length;
        while (true) {
            length--;
            if (length > 0 && (b = bArr[length]) != ((byte) RecyclerView.C1119a0.FLAG_IGNORE)) {
                if (b != ((byte) 0)) {
                    throw new IllegalStateException("Unexpected non-zero padding byte");
                }
            }
        }
        return C23816b.m58448d1(bArr, C17885a.m44393C0(0, length));
    }

    /* renamed from: c */
    public static final byte[] m53554c(byte[] bArr) {
        C24362h.m61211f(bArr, "$this$to3DesKey");
        int length = bArr.length;
        if (length == 16) {
            return C21132f.m49434Q0(bArr, C23816b.m58448d1(bArr, C17885a.m44393C0(0, 8)));
        }
        if (length == 24) {
            return bArr;
        }
        throw new IllegalArgumentException("Expected key size of 16 or 24 bytes");
    }

    /* renamed from: d */
    public static final byte[] m53555d(byte[] bArr) {
        C24362h.m61211f(bArr, "$this$inc");
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C24362h.m61210e(copyOf, "java.util.Arrays.copyOf(this, size)");
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b = (byte) ((bArr[length] + 1) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
            copyOf[length] = b;
            if (b != ((byte) 0)) {
                break;
            }
        }
        return copyOf;
    }

    /* renamed from: e */
    public static final byte[] m53556e(byte[] bArr) {
        C24362h.m61211f(bArr, "$this$adjustParity");
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = m53547a(bArr[i]);
        }
        return bArr2;
    }

    /* renamed from: f */
    public static final String m53557f(byte[] bArr) {
        C24362h.m61211f(bArr, "$this$toHexString");
        return m53549a((Collection<Byte>) C23816b.m58451g1(bArr));
    }

    /* renamed from: a */
    public static final byte m53547a(byte b) {
        boolean z = false;
        boolean z2 = (b & 128) != 0;
        if (Integer.bitCount(b & Byte.MAX_VALUE) % 2 == 0) {
            z = true;
        }
        if (z == z2) {
            return b;
        }
        return (byte) (((~b) & 1) | (b & 254));
    }

    /* renamed from: a */
    public static final byte[] m53551a(byte[] bArr, byte[] bArr2) {
        C24362h.m61211f(bArr, "$this$xor");
        C24362h.m61211f(bArr2, "that");
        if (bArr.length == bArr2.length) {
            int length = bArr.length;
            byte[] bArr3 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr3[i] = (byte) ((bArr[i] ^ bArr2[i]) & 255);
            }
            return bArr3;
        }
        StringBuilder k = C13555b.m33972k("Cannot xor array, size mismatch (this=");
        k.append(bArr.length);
        k.append(" that=");
        k.append(bArr2.length);
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: b */
    public static final String m53552b(byte b) {
        C24361g.m61189u(16);
        String num = Integer.toString(b & 255, 16);
        C24362h.m61210e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        return C24179b.m60570R(num, 2);
    }

    /* renamed from: a */
    public static final String m53549a(Collection<Byte> collection) {
        C24362h.m61211f(collection, "$this$toHexString");
        return C23825c.m58520q0(collection, " ", (String) null, (String) null, C21942a.f55448a, 30);
    }

    /* renamed from: a */
    public static final String m53548a(int i) {
        C24361g.m61189u(16);
        String l = Long.toString(((long) i) & 4294967295L, 16);
        C24362h.m61210e(l, "java.lang.Long.toString(this, checkRadix(radix))");
        return C24179b.m60570R(l, 8);
    }
}
