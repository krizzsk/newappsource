package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.C3920f;
import com.google.android.exoplayer2.drm.DefaultDrmSessionManager;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p161la.C5653b;
import p161la.C5656e;

/* renamed from: com.google.android.exoplayer2.drm.d */
public final class C3918d implements C3920f {
    /* renamed from: a */
    public final Class<C5656e> mo16007a() {
        return C5656e.class;
    }

    /* renamed from: b */
    public final Map<String, String> mo16008b(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: c */
    public final C5653b mo16009c(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: d */
    public final C3920f.C3924d mo16010d() {
        throw new IllegalStateException();
    }

    /* renamed from: e */
    public final byte[] mo16011e() throws MediaDrmException {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    /* renamed from: f */
    public final void mo16012f(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    /* renamed from: g */
    public final void mo16013g(byte[] bArr) {
        throw new IllegalStateException();
    }

    /* renamed from: h */
    public final void mo16014h(DefaultDrmSessionManager.C3904a aVar) {
    }

    /* renamed from: i */
    public final void mo16015i(byte[] bArr) {
    }

    /* renamed from: j */
    public final byte[] mo16016j(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    /* renamed from: k */
    public final C3920f.C3921a mo16017k(byte[] bArr, List<DrmInitData.SchemeData> list, int i, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    public final void release() {
    }
}
