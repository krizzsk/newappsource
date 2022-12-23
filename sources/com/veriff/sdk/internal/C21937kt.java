package com.veriff.sdk.internal;

import cf0.C21132f;
import com.veriff.sdk.internal.C21982lx;
import com.veriff.sdk.internal.C21985lz;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p358af.C13437d;
import p584jl.C17885a;
import uh0.C25072a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0002J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0002J\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0002H\u0002J \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/BacAuthenticator;", "Lcom/veriff/sdk/internal/nfc/Authenticator;", "", "ourRandom", "chipRandom", "ourKey", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "mrz", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "chip", "authenticate", "authPayload", "authMac", "Lcom/veriff/sdk/internal/nfc/Apdu;", "createAuthenticateApdu", "seed", "tail", "deriveKey", "startSecureMessaging", "Lcom/veriff/sdk/internal/nfc/ResponseApdu;", "authResp", "macKey", "Lbf0/d;", "validateAuthResponse", "authRespData", "validateNonces", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;", "crypto", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;", "<init>", "(Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kt */
public final class C21937kt implements C21936ks {

    /* renamed from: a */
    private final C21985lz f55444a;

    public C21937kt(C21985lz lzVar) {
        C24362h.m61211f(lzVar, "crypto");
        this.f55444a = lzVar;
    }

    /* renamed from: b */
    private final byte[] m53538b(byte[] bArr, byte[] bArr2) {
        return C21941kx.m53554c(C21941kx.m53556e(C23816b.m58448d1(this.f55444a.mo55808a().mo55811a(C21132f.m49434Q0(bArr, bArr2)), C17885a.m44393C0(0, 16))));
    }

    /* renamed from: a */
    public C21945kz mo55748a(C21945kz kzVar, C21960lf lfVar) throws C21967lj {
        C24362h.m61211f(kzVar, "chip");
        C24362h.m61211f(lfVar, "mrz");
        if (kzVar.mo55751a(C21938ku.f55445a).mo55791a()) {
            C21973lp a = kzVar.mo55751a(C21938ku.f55446b);
            if (!a.mo55791a()) {
                throw new C21968lk("Get challenge command failed");
            } else if (a.mo55794d().length >= 8) {
                byte[] d1 = C23816b.m58448d1(a.mo55794d(), C17885a.m44393C0(0, 8));
                byte[] a2 = this.f55444a.mo55809a(8);
                byte[] a3 = this.f55444a.mo55809a(16);
                byte[] a4 = C21941kx.m53551a(m53537a(a2, d1, a3, lfVar, kzVar), a3);
                return new C21975lq(this.f55444a, kzVar, m53538b(a4, new byte[]{0, 0, 0, 1}), m53538b(a4, new byte[]{0, 0, 0, 2}), C21132f.m49434Q0(C23816b.m58448d1(d1, C17885a.m44393C0(4, 8)), C23816b.m58448d1(a2, C17885a.m44393C0(4, 8))));
            } else {
                throw new C21968lk(C13437d.m33707l(C13555b.m33972k("Get challenge reply too short ("), a.mo55794d().length, " bytes)"));
            }
        } else {
            throw new C21970lm("Unable to select MRTD app");
        }
    }

    /* renamed from: a */
    private final byte[] m53537a(byte[] bArr, byte[] bArr2, byte[] bArr3, C21960lf lfVar, C21945kz kzVar) throws C21967lj {
        String a = lfVar.mo55783a();
        C21984ly a2 = this.f55444a.mo55808a();
        Charset charset = C25072a.f63272a;
        if (a != null) {
            byte[] bytes = a.getBytes(charset);
            C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] d1 = C23816b.m58448d1(a2.mo55811a(bytes), C17885a.m44393C0(0, 16));
            byte[] b = m53538b(d1, new byte[]{0, 0, 0, 1});
            byte[] b2 = m53538b(d1, new byte[]{0, 0, 0, 2});
            byte[] a3 = C21982lx.C21983a.m53620a(this.f55444a.mo55810b(C21985lz.C21986a.ENCRYPT, b, new byte[8]), C21132f.m49434Q0(C21132f.m49434Q0(bArr, bArr2), bArr3), 0, 0, 6, (Object) null);
            try {
                C21973lp a4 = kzVar.mo55751a(m53534a(a3, new C21988ma(this.f55444a, b2).mo55811a(C21941kx.m53550a(a3))));
                m53535a(a4, b2);
                byte[] a5 = C21982lx.C21983a.m53620a(this.f55444a.mo55810b(C21985lz.C21986a.DECRYPT, b, new byte[8]), C23816b.m58448d1(a4.mo55794d(), C17885a.m44393C0(0, a4.mo55794d().length - 8)), 0, 0, 6, (Object) null);
                m53536a(a5, bArr2, bArr);
                return C23816b.m58448d1(a5, C17885a.m44393C0(16, 32));
            } catch (Exception e) {
                throw new C21969ll("Tag was lost while authenticating", e);
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
    }

    /* renamed from: a */
    private final void m53536a(byte[] bArr, byte[] bArr2, byte[] bArr3) throws C21967lj {
        if (!Arrays.equals(bArr2, C23816b.m58448d1(bArr, C17885a.m44393C0(0, 8)))) {
            throw new C21965lh("Chip random mismatch during BAC authentication");
        } else if (!Arrays.equals(bArr3, C23816b.m58448d1(bArr, C17885a.m44393C0(8, 16)))) {
            throw new C21965lh("Our random mismatch during BAC authentication");
        }
    }

    /* renamed from: a */
    private final void m53535a(C21973lp lpVar, byte[] bArr) throws C21967lj {
        if (!lpVar.mo55791a()) {
            throw new C21965lh("NFC authenticate failed");
        } else if (lpVar.mo55794d().length >= 40) {
            if (!Arrays.equals(new C21988ma(this.f55444a, bArr).mo55811a(C21941kx.m53550a(C23816b.m58448d1(lpVar.mo55794d(), C17885a.m44393C0(0, lpVar.mo55794d().length - 8)))), C23816b.m58448d1(lpVar.mo55794d(), C17885a.m44393C0(lpVar.mo55794d().length - 8, lpVar.mo55794d().length)))) {
                throw new C21966li("Checksum mismatch during BAC authentication");
            }
        } else {
            StringBuilder k = C13555b.m33972k("Expected at least 40 bytes for auth response, got ");
            k.append(lpVar.mo55794d().length);
            throw new C21968lk(k.toString());
        }
    }

    /* renamed from: a */
    private final C21930kp m53534a(byte[] bArr, byte[] bArr2) {
        return new C21930kp((byte) 0, (byte) 130, (byte) 0, (byte) 0, C21132f.m49434Q0(bArr, bArr2), 40);
    }
}
