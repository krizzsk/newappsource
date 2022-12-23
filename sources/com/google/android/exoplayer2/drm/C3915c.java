package com.google.android.exoplayer2.drm;

import android.os.Looper;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.C3912b;
import com.google.android.exoplayer2.drm.DrmSession;
import p009a8.C0111k;
import p161la.C5653b;
import p161la.C5656e;

/* renamed from: com.google.android.exoplayer2.drm.c */
public interface C3915c {

    /* renamed from: a */
    public static final C3916a f13730a = new C3916a();

    /* renamed from: com.google.android.exoplayer2.drm.c$a */
    public class C3916a implements C3915c {
        /* renamed from: c */
        public final /* synthetic */ void mo15968c() {
        }

        /* renamed from: d */
        public final DrmSession mo15969d(Looper looper, C3912b.C3913a aVar, Format format) {
            if (format.f13421p == null) {
                return null;
            }
            return new C3919e(new DrmSession.DrmSessionException(new UnsupportedDrmException()));
        }

        /* renamed from: e */
        public final /* synthetic */ C3917b mo15970e(Looper looper, C3912b.C3913a aVar, Format format) {
            return C3917b.f13731a0;
        }

        /* renamed from: f */
        public final Class<C5656e> mo15971f(Format format) {
            if (format.f13421p != null) {
                return C5656e.class;
            }
            return null;
        }

        public final /* synthetic */ void release() {
        }
    }

    /* renamed from: com.google.android.exoplayer2.drm.c$b */
    public interface C3917b {

        /* renamed from: a0 */
        public static final C0111k f13731a0 = new C0111k(1);

        void release();
    }

    /* renamed from: c */
    void mo15968c();

    /* renamed from: d */
    DrmSession mo15969d(Looper looper, C3912b.C3913a aVar, Format format);

    /* renamed from: e */
    C3917b mo15970e(Looper looper, C3912b.C3913a aVar, Format format);

    /* renamed from: f */
    Class<? extends C5653b> mo15971f(Format format);

    void release();
}
