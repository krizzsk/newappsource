package com.veriff.sdk.internal;

import cf0.C21132f;
import com.appboy.support.ValidationUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.usebutton.sdk.internal.GroupedInventoryCardActivity;
import com.veriff.sdk.internal.C21947la;
import com.veriff.sdk.internal.C21982lx;
import com.veriff.sdk.internal.C21985lz;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p584jl.C17885a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010\"\u001a\u00020\u0001\u0012\u0006\u0010*\u001a\u00020\b\u0012\u0006\u00101\u001a\u00020\b\u0012\u0006\u0010,\u001a\u00020\b¢\u0006\u0004\b2\u00103J\u000f\u0010\u0005\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0012\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\"\u001a\u00020\u00018\u0002X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\b8\u0002X\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020\b8B@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u00100\u001a\u00020-8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00064"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/SecureMessaging3Des;", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "Lbf0/d;", "bumpSsc$veriff_library_dist", "()V", "bumpSsc", "Lcom/veriff/sdk/internal/nfc/Apdu;", "apdu", "", "body", "Lcom/veriff/sdk/internal/nfc/DataObject;", "constructChecksumTlv$veriff_library_dist", "(Lcom/veriff/sdk/internal/nfc/Apdu;[B)Lcom/veriff/sdk/internal/nfc/DataObject;", "constructChecksumTlv", "Lcom/veriff/sdk/internal/nfc/crypto/Cipher;", "cipher", "constructDataTlv$veriff_library_dist", "(Lcom/veriff/sdk/internal/nfc/Apdu;Lcom/veriff/sdk/internal/nfc/crypto/Cipher;)Lcom/veriff/sdk/internal/nfc/DataObject;", "constructDataTlv", "constructLeTlv$veriff_library_dist", "(Lcom/veriff/sdk/internal/nfc/Apdu;)Lcom/veriff/sdk/internal/nfc/DataObject;", "constructLeTlv", "Lcom/veriff/sdk/internal/nfc/ResponseApdu;", "rapdu", "decrypt$veriff_library_dist", "(Lcom/veriff/sdk/internal/nfc/ResponseApdu;)Lcom/veriff/sdk/internal/nfc/ResponseApdu;", "decrypt", "encrypt$veriff_library_dist", "(Lcom/veriff/sdk/internal/nfc/Apdu;)Lcom/veriff/sdk/internal/nfc/Apdu;", "encrypt", "generateChecksum$veriff_library_dist", "(Lcom/veriff/sdk/internal/nfc/ResponseApdu;)[B", "generateChecksum", "send", "chip", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;", "crypto", "Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;", "Lcom/veriff/sdk/internal/nfc/crypto/RetailMac;", "mac", "Lcom/veriff/sdk/internal/nfc/crypto/RetailMac;", "sessionEncryptKey", "[B", "ssc", "", "getSupportsExtendedLength", "()Z", "supportsExtendedLength", "sessionMacKey", "<init>", "(Lcom/veriff/sdk/internal/nfc/crypto/NfcCrypto;Lcom/veriff/sdk/internal/nfc/ChipInterface;[B[B[B)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.lq */
public final class C21975lq implements C21945kz {

    /* renamed from: a */
    private byte[] f55484a;

    /* renamed from: b */
    private final C21988ma f55485b;

    /* renamed from: c */
    private final C21985lz f55486c;

    /* renamed from: d */
    private final C21945kz f55487d;

    /* renamed from: e */
    private final byte[] f55488e;

    public C21975lq(C21985lz lzVar, C21945kz kzVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        C24362h.m61211f(lzVar, "crypto");
        C24362h.m61211f(kzVar, "chip");
        C24362h.m61211f(bArr, "sessionEncryptKey");
        C24362h.m61211f(bArr2, "sessionMacKey");
        C24362h.m61211f(bArr3, "ssc");
        this.f55486c = lzVar;
        this.f55487d = kzVar;
        this.f55488e = bArr;
        byte[] copyOf = Arrays.copyOf(bArr3, bArr3.length);
        C24362h.m61210e(copyOf, "java.util.Arrays.copyOf(this, size)");
        this.f55484a = copyOf;
        this.f55485b = new C21988ma(lzVar, bArr2);
    }

    /* renamed from: a */
    public boolean mo55752a() {
        return this.f55487d.mo55752a();
    }

    /* renamed from: b */
    public final C21930kp mo55802b(C21930kp kpVar) {
        byte[] bArr;
        byte[] bArr2;
        C24362h.m61211f(kpVar, "apdu");
        mo55803b();
        C21947la a = mo55799a(kpVar, this.f55486c.mo55810b(C21985lz.C21986a.ENCRYPT, this.f55488e, new byte[8]));
        if (a == null || (bArr = a.mo55753a()) == null) {
            bArr = new byte[0];
        }
        C21947la c = mo55805c(kpVar);
        if (c == null || (bArr2 = c.mo55753a()) == null) {
            bArr2 = new byte[0];
        }
        byte[] Q0 = C21132f.m49434Q0(bArr, bArr2);
        return new C21930kp((byte) 12, kpVar.mo55726b(), kpVar.mo55727c(), kpVar.mo55728d(), C21132f.m49434Q0(Q0, mo55800a(kpVar, Q0).mo55753a()), kpVar.mo55731f() > 256 ? SQLiteDatabase.OPEN_FULLMUTEX : 256);
    }

    /* renamed from: c */
    public final C21947la mo55805c(C21930kp kpVar) {
        C21947la laVar;
        C24362h.m61211f(kpVar, "apdu");
        if (kpVar.mo55731f() == 0) {
            return null;
        }
        if (kpVar.mo55731f() > 256) {
            laVar = new C21947la(151, new byte[]{(byte) ((kpVar.mo55731f() >>> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH), (byte) (kpVar.mo55731f() & ValidationUtils.APPBOY_STRING_MAX_LENGTH)});
        } else {
            laVar = new C21947la(151, new byte[]{(byte) (kpVar.mo55731f() & ValidationUtils.APPBOY_STRING_MAX_LENGTH)});
        }
        return laVar;
    }

    /* renamed from: a */
    public C21973lp mo55751a(C21930kp kpVar) throws C21966li {
        C24362h.m61211f(kpVar, "apdu");
        return mo55801a(this.f55487d.mo55751a(mo55802b(kpVar)));
    }

    /* renamed from: a */
    public final C21947la mo55799a(C21930kp kpVar, C21982lx lxVar) {
        C24362h.m61211f(kpVar, "apdu");
        C24362h.m61211f(lxVar, "cipher");
        if (kpVar.mo55729e().length == 0) {
            return null;
        }
        if ((kpVar.mo55726b() & 1) == 0) {
            return new C21947la(135, C21132f.m49434Q0(new byte[]{1}, C21982lx.C21983a.m53620a(lxVar, C21941kx.m53550a(kpVar.mo55729e()), 0, 0, 6, (Object) null)));
        }
        throw new IllegalStateException("Odd ins not supported yet");
    }

    /* renamed from: a */
    public final C21947la mo55800a(C21930kp kpVar, byte[] bArr) {
        C24362h.m61211f(kpVar, "apdu");
        C24362h.m61211f(bArr, GroupedInventoryCardActivity.EXTRA_BODY);
        return new C21947la(142, this.f55485b.mo55811a(C21132f.m49434Q0(C21132f.m49434Q0(this.f55484a, C21941kx.m53550a(new byte[]{12, kpVar.mo55726b(), kpVar.mo55727c(), kpVar.mo55728d()})), C21941kx.m53550a(bArr))));
    }

    /* renamed from: b */
    public final byte[] mo55804b(C21973lp lpVar) {
        C24362h.m61211f(lpVar, "rapdu");
        int i = 0;
        while (i < lpVar.mo55794d().length) {
            C21949lb a = C21949lb.f55453a.mo55767a(lpVar.mo55794d(), i);
            if (a.mo55762c() == 142) {
                break;
            }
            i = a.mo55763d() + a.mo55760a() + i;
        }
        return this.f55485b.mo55811a(C21941kx.m53550a(C21132f.m49434Q0(this.f55484a, C23816b.m58448d1(lpVar.mo55794d(), C17885a.m44393C0(0, i)))));
    }

    /* renamed from: a */
    public final C21973lp mo55801a(C21973lp lpVar) throws C21966li {
        C24362h.m61211f(lpVar, "rapdu");
        mo55803b();
        List<C21947la> a = C21947la.C21948a.m53567a(C21947la.f55450a, lpVar.mo55794d(), 0, 0, 6, (Object) null);
        C21973lp a2 = C21973lp.m53594a(lpVar, (byte) 0, (byte) 0, new byte[0], 3, (Object) null);
        while (true) {
            C21973lp lpVar2 = a2;
            for (C21947la laVar : a) {
                boolean z = true;
                if (laVar.mo55754b().mo55762c() == 153) {
                    byte[] c = laVar.mo55755c();
                    C24362h.m61211f(c, "<this>");
                    if (!(c.length == 0)) {
                        byte b = c[0];
                        byte[] c2 = laVar.mo55755c();
                        C24362h.m61211f(c2, "<this>");
                        if (c2.length != 0) {
                            z = false;
                        }
                        if (!z) {
                            a2 = C21973lp.m53594a(lpVar2, b, c2[c2.length - 1], (byte[]) null, 4, (Object) null);
                        } else {
                            throw new NoSuchElementException("Array is empty.");
                        }
                    } else {
                        throw new NoSuchElementException("Array is empty.");
                    }
                } else if (laVar.mo55754b().mo55762c() == 142) {
                    if (!Arrays.equals(mo55804b(lpVar), laVar.mo55755c())) {
                        throw new C21966li("Checksum mismatch when decrypting response APDU");
                    }
                } else if (laVar.mo55754b().mo55762c() == 135) {
                    byte b2 = laVar.mo55755c()[0];
                    byte[] a3 = this.f55486c.mo55810b(C21985lz.C21986a.DECRYPT, this.f55488e, new byte[8]).mo55806a(laVar.mo55755c(), 1, laVar.mo55755c().length - 1);
                    if (b2 == 1) {
                        a2 = C21973lp.m53594a(lpVar2, (byte) 0, (byte) 0, C21941kx.m53553b(a3), 3, (Object) null);
                    } else {
                        a2 = C21973lp.m53594a(lpVar2, (byte) 0, (byte) 0, a3, 3, (Object) null);
                    }
                }
            }
            return lpVar2;
        }
    }

    /* renamed from: b */
    public final synchronized void mo55803b() {
        this.f55484a = C21941kx.m53555d(this.f55484a);
    }
}
