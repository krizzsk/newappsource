package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls;

import android.net.Uri;
import com.amazonaws.internal.keyvaluestore.KeyProvider18;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3353g;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3356i;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C3357j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.a */
public final class C3089a implements C3353g {

    /* renamed from: a */
    public final C3353g f10614a;

    /* renamed from: b */
    public final byte[] f10615b;

    /* renamed from: c */
    public final byte[] f10616c;

    /* renamed from: d */
    public CipherInputStream f10617d;

    public C3089a(C3353g gVar, byte[] bArr, byte[] bArr2) {
        this.f10614a = gVar;
        this.f10615b = bArr;
        this.f10616c = bArr2;
    }

    /* renamed from: a */
    public long mo13780a(C3357j jVar) throws IOException {
        try {
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                instance.init(2, new SecretKeySpec(this.f10615b, KeyProvider18.KEY_ALGORITHM_AES), new IvParameterSpec(this.f10616c));
                this.f10617d = new CipherInputStream(new C3356i(this.f10614a, jVar), instance);
                return -1;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e) {
                throw new RuntimeException(e);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void close() throws IOException {
        this.f10617d = null;
        this.f10614a.close();
    }

    /* renamed from: a */
    public int mo13779a(byte[] bArr, int i, int i2) throws IOException {
        C3380a.m8507b(this.f10617d != null);
        int read = this.f10617d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }

    /* renamed from: a */
    public Uri mo13781a() {
        return this.f10614a.mo13781a();
    }
}
