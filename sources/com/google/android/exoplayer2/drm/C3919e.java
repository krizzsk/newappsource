package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.UUID;
import p099ga.C4883f;
import p161la.C5653b;

/* renamed from: com.google.android.exoplayer2.drm.e */
public final class C3919e implements DrmSession {

    /* renamed from: a */
    public final DrmSession.DrmSessionException f13732a;

    public C3919e(DrmSession.DrmSessionException drmSessionException) {
        this.f13732a = drmSessionException;
    }

    /* renamed from: a */
    public final DrmSession.DrmSessionException mo15952a() {
        return this.f13732a;
    }

    /* renamed from: b */
    public final void mo15953b(C3912b.C3913a aVar) {
    }

    /* renamed from: c */
    public final void mo15954c(C3912b.C3913a aVar) {
    }

    /* renamed from: d */
    public final UUID mo15955d() {
        return C4883f.f16441a;
    }

    /* renamed from: e */
    public final boolean mo15956e() {
        return false;
    }

    /* renamed from: f */
    public final C5653b mo15957f() {
        return null;
    }

    public final int getState() {
        return 1;
    }
}
