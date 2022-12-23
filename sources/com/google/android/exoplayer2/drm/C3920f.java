package com.google.android.exoplayer2.drm;

import android.media.DeniedByServerException;
import android.media.MediaCryptoException;
import android.media.MediaDrmException;
import android.media.NotProvisionedException;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p161la.C5653b;

/* renamed from: com.google.android.exoplayer2.drm.f */
public interface C3920f {

    /* renamed from: com.google.android.exoplayer2.drm.f$a */
    public static final class C3921a {

        /* renamed from: a */
        public final byte[] f13733a;

        /* renamed from: b */
        public final String f13734b;

        public C3921a(String str, byte[] bArr) {
            this.f13733a = bArr;
            this.f13734b = str;
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$b */
    public interface C3922b {
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$c */
    public interface C3923c {
        /* renamed from: a */
        C3920f mo16019a(UUID uuid);
    }

    /* renamed from: com.google.android.exoplayer2.drm.f$d */
    public static final class C3924d {

        /* renamed from: a */
        public final byte[] f13735a;

        /* renamed from: b */
        public final String f13736b;

        public C3924d(byte[] bArr, String str) {
            this.f13735a = bArr;
            this.f13736b = str;
        }
    }

    /* renamed from: a */
    Class<? extends C5653b> mo16007a();

    /* renamed from: b */
    Map<String, String> mo16008b(byte[] bArr);

    /* renamed from: c */
    C5653b mo16009c(byte[] bArr) throws MediaCryptoException;

    /* renamed from: d */
    C3924d mo16010d();

    /* renamed from: e */
    byte[] mo16011e() throws MediaDrmException;

    /* renamed from: f */
    void mo16012f(byte[] bArr, byte[] bArr2);

    /* renamed from: g */
    void mo16013g(byte[] bArr) throws DeniedByServerException;

    /* renamed from: h */
    void mo16014h(DefaultDrmSessionManager.C3904a aVar);

    /* renamed from: i */
    void mo16015i(byte[] bArr);

    /* renamed from: j */
    byte[] mo16016j(byte[] bArr, byte[] bArr2) throws NotProvisionedException, DeniedByServerException;

    /* renamed from: k */
    C3921a mo16017k(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) throws NotProvisionedException;

    void release();
}
