package com.masabi.justride.sdk.crypto;

import android.os.Build;
import bf0.C21049c;
import ce0.C21100e;
import cf0.C21132f;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.masabi.justride.sdk.platform.storage.FileStorageException;
import java.security.Key;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.C23812a;
import mf0.C24362h;
import p413co.C13859g;
import p677nj.C18558c;
import p677nj.C18566i;
import p677nj.C18567j;
import p916xl.C20536b;
import p918xn.C20545d;

public final class KeyStorageAES {

    /* renamed from: a */
    public final C21049c f37076a = C23812a.m58432b(new KeyStorageAES$secretKeyGenerator$2(this));

    /* renamed from: b */
    public final C21049c f37077b = C23812a.m58432b(new KeyStorageAES$initVectorGenerator$2(this));

    /* renamed from: c */
    public final C21049c f37078c = C23812a.m58432b(new KeyStorageAES$keyStore$2(this));

    /* renamed from: d */
    public final C18558c.C18559a f37079d;

    /* renamed from: e */
    public final C13859g f37080e;

    /* renamed from: f */
    public final C18566i f37081f;

    /* renamed from: g */
    public final C20545d f37082g;

    /* renamed from: h */
    public final C20536b f37083h;

    public KeyStorageAES(C18558c.C18559a aVar, C13859g gVar, C18566i iVar, C20545d dVar, C20536b bVar) {
        C24362h.m61211f(aVar, "aesKeyGeneratorFactory");
        C24362h.m61211f(gVar, "fileStorage");
        C24362h.m61211f(iVar, "keyStoreProvider");
        C24362h.m61211f(dVar, "androidOSVersionSupplier");
        C24362h.m61211f(bVar, "errorLogger");
        this.f37079d = aVar;
        this.f37080e = gVar;
        this.f37081f = iVar;
        this.f37082g = dVar;
        this.f37083h = bVar;
    }

    /* renamed from: a */
    public final SecretKey mo44328a(String str) throws CryptoException {
        this.f37082g.getClass();
        if (Build.VERSION.SDK_INT < 23) {
            return mo44329b(str);
        }
        try {
            return mo44330c(str);
        } catch (CryptoException e) {
            this.f37083h.mo52738b(e);
            return mo44329b(str);
        }
    }

    /* renamed from: b */
    public final SecretKeySpec mo44329b(String str) throws CryptoException {
        try {
            byte[] c = this.f37080e.mo40804c(C21100e.m49337e0(), str);
            if (c != null) {
                return new SecretKeySpec(C21132f.m49432O0(((C18558c) this.f37077b.getValue()).f47242b / 8, c.length, c), KeyProvider18.KEY_ALGORITHM_AES);
            }
            return null;
        } catch (FileStorageException e) {
            throw new CryptoException(C13555b.m33971j(new Object[]{str}, 1, "Failed getting key for alias %s", "java.lang.String.format(format, *args)"), e);
        }
    }

    /* renamed from: c */
    public final SecretKey mo44330c(String str) throws CryptoException {
        try {
            C18567j jVar = (C18567j) this.f37078c.getValue();
            Key key = jVar.f47253a.getKey(jVar.f47254b.mo52405a(str), (char[]) null);
            if (key == null || (key instanceof SecretKey)) {
                return (SecretKey) key;
            }
            throw new CryptoException(C13555b.m33971j(new Object[]{str}, 1, "Wrong type key for alias %s", "java.lang.String.format(format, *args)"));
        } catch (Exception e) {
            throw new CryptoException(C13555b.m33971j(new Object[]{str}, 1, "Failed getting key for alias %s", "java.lang.String.format(format, *args)"), e);
        }
    }

    /* renamed from: d */
    public final void mo44331d(SecretKey secretKey, String str) throws CryptoException {
        boolean z;
        this.f37082g.getClass();
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                ((C18567j) this.f37078c.getValue()).mo50962a(secretKey, str);
                z = true;
            } catch (KeyStoreException e) {
                String format = String.format("Failed writing key for alias %s", Arrays.copyOf(new Object[]{str}, 1));
                C24362h.m61210e(format, "java.lang.String.format(format, *args)");
                throw new CryptoException(format, e);
            } catch (CryptoException e2) {
                this.f37083h.mo52738b(e2);
                z = false;
            }
            try {
                mo44332e(secretKey, str);
            } catch (CryptoException e3) {
                if (!z) {
                    throw new CryptoException(C13555b.m33971j(new Object[]{str}, 1, "Failed save secret key for alias %s", "java.lang.String.format(format, *args)"), e3);
                }
            }
        } else {
            mo44332e(secretKey, str);
        }
    }

    /* renamed from: e */
    public final void mo44332e(SecretKey secretKey, String str) throws CryptoException {
        SecretKey a = ((C18558c) this.f37077b.getValue()).mo50961a();
        C24362h.m61210e(a, "initVectorGenerator.generateSecretKey()");
        try {
            this.f37080e.mo40806e(C21100e.m49337e0(), str, C21100e.m49302D(a.getEncoded(), secretKey.getEncoded()));
        } catch (FileStorageException e) {
            throw new CryptoException(C13555b.m33971j(new Object[]{str}, 1, "Failed writing key for alias %s", "java.lang.String.format(format, *args)"), e);
        }
    }
}
