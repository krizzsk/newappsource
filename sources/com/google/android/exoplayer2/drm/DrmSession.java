package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.C3912b;
import java.io.IOException;
import java.util.UUID;
import p161la.C5653b;

public interface DrmSession {

    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th) {
            super(th);
        }
    }

    /* renamed from: a */
    DrmSessionException mo15952a();

    /* renamed from: b */
    void mo15953b(C3912b.C3913a aVar);

    /* renamed from: c */
    void mo15954c(C3912b.C3913a aVar);

    /* renamed from: d */
    UUID mo15955d();

    /* renamed from: e */
    boolean mo15956e();

    /* renamed from: f */
    C5653b mo15957f();

    int getState();
}
