package com.veriff.sdk.internal;

import com.appboy.support.ValidationUtils;
import com.veriff.sdk.internal.C21949lb;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24361g;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;
import p583jk.C17875h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0017\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0002\u0010\u0007J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0002J \u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0002J2\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tH\u0016¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/BasicFileReader;", "Lcom/veriff/sdk/internal/nfc/ChipFileReader;", "()V", "getTotalFileSize", "", "chip", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "(Lcom/veriff/sdk/internal/nfc/ChipInterface;)Ljava/lang/Integer;", "isReplyValid", "", "chunkApdu", "Lcom/veriff/sdk/internal/nfc/ResponseApdu;", "probeTlvLen", "remainingBytes", "readChunk", "off", "count", "readFile", "", "fileIdMsb", "", "fileIdLsb", "chunkSize", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kv */
public final class C21939kv implements C21943ky {
    /* renamed from: a */
    public byte[] mo55749a(C21945kz kzVar, byte b, byte b2, int i, boolean z) {
        C24362h.m61211f(kzVar, "chip");
        C24465j a = C21940kw.f55447a;
        StringBuilder sb = new StringBuilder();
        sb.append("Reading ");
        C24361g.m61189u(16);
        C24361g.m61189u(16);
        String num = Integer.toString(b, 16);
        C24362h.m61210e(num, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        sb.append(num);
        sb.append(' ');
        C24361g.m61189u(16);
        C24361g.m61189u(16);
        String num2 = Integer.toString(b2, 16);
        C24362h.m61210e(num2, "java.lang.Integer.toStri…(this, checkRadix(radix))");
        sb.append(num2);
        a.mo60705d(sb.toString());
        int i2 = 0;
        C21973lp a2 = kzVar.mo55751a(new C21930kp((byte) 0, (byte) 164, (byte) 2, (byte) 12, new byte[]{b, b2}, 0));
        Integer num3 = null;
        if (!a2.mo55791a()) {
            return null;
        }
        C24465j a3 = C21940kw.f55447a;
        StringBuilder k = C13555b.m33972k("file select reply: ");
        k.append(C21941kx.m53557f(a2.mo55794d()));
        a3.mo60705d(k.toString());
        if (z) {
            num3 = m53543a(kzVar);
        }
        int intValue = num3 != null ? num3.intValue() : Integer.MAX_VALUE;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        while (i2 <= 32767) {
            int i3 = intValue - i2;
            if (i3 > i) {
                i3 = i;
            }
            if (i3 != 0) {
                C21973lp a4 = m53542a(kzVar, i2, i3);
                if (m53544a(a4, z, i3)) {
                    byteArrayOutputStream.write(a4.mo55794d());
                    i2 += a4.mo55794d().length;
                }
            }
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("BasicFileReader can't read at offsets higher than 32kb");
    }

    /* renamed from: a */
    private final boolean m53544a(C21973lp lpVar, boolean z, int i) {
        if (lpVar.mo55791a()) {
            if (!(lpVar.mo55794d().length == 0)) {
                return true;
            }
        }
        if (!z || i <= 0) {
            return false;
        }
        StringBuilder k = C13555b.m33972k("Unexpected sw=");
        k.append(C21941kx.m53549a((Collection<Byte>) C17875h.m44281E(Byte.valueOf(lpVar.mo55792b()), Byte.valueOf(lpVar.mo55793c()))));
        k.append(" respsize=");
        k.append(lpVar.mo55794d().length);
        throw new IOException(k.toString());
    }

    /* renamed from: a */
    private final C21973lp m53542a(C21945kz kzVar, int i, int i2) {
        byte b = (byte) ((i >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        byte b2 = (byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH);
        byte b3 = (byte) 176;
        C21973lp a = kzVar.mo55751a(new C21930kp((byte) 0, b3, b, b2, (byte[]) null, i2, 16, (DefaultConstructorMarker) null));
        if (a.mo55792b() != ((byte) 108) || a.mo55793c() == 0) {
            return a;
        }
        return kzVar.mo55751a(new C21930kp((byte) 0, b3, b, b2, (byte[]) null, a.mo55793c() & 255, 16, (DefaultConstructorMarker) null));
    }

    /* renamed from: a */
    private final Integer m53543a(C21945kz kzVar) {
        C21973lp a = kzVar.mo55751a(new C21930kp((byte) 0, (byte) 176, (byte) 0, (byte) 0, (byte[]) null, 8, 16, (DefaultConstructorMarker) null));
        if (!(a.mo55794d().length == 0)) {
            try {
                C21949lb a2 = C21949lb.C21950a.m53573a(C21949lb.f55453a, a.mo55794d(), 0, 2, (Object) null);
                return Integer.valueOf(a2.mo55760a() + a2.mo55763d());
            } catch (Throwable th) {
                C21940kw.f55447a.mo60706d("Failed to get total file size", th);
            }
        }
        return null;
    }
}
