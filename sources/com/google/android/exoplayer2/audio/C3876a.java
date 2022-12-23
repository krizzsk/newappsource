package com.google.android.exoplayer2.audio;

import android.os.Handler;
import com.google.android.exoplayer2.Format;
import p099ga.C4865c1;
import p137ja.C5413d;
import p137ja.C5414e;
import p304x.C7097r;

/* renamed from: com.google.android.exoplayer2.audio.a */
public interface C3876a {

    /* renamed from: com.google.android.exoplayer2.audio.a$a */
    public static final class C3877a {

        /* renamed from: a */
        public final Handler f13479a;

        /* renamed from: b */
        public final C3876a f13480b;

        public C3877a(Handler handler, C4865c1.C4867b bVar) {
            this.f13479a = handler;
            this.f13480b = bVar;
        }

        /* renamed from: a */
        public final void mo15880a(C5413d dVar) {
            synchronized (dVar) {
            }
            Handler handler = this.f13479a;
            if (handler != null) {
                handler.post(new C7097r(12, this, dVar));
            }
        }
    }

    /* renamed from: A */
    void mo15869A(Exception exc);

    /* renamed from: D */
    void mo15870D(long j);

    /* renamed from: O */
    void mo15871O(C5413d dVar);

    /* renamed from: W */
    void mo15872W(Format format, C5414e eVar);

    /* renamed from: a0 */
    void mo15873a0(Exception exc);

    /* renamed from: d */
    void mo15874d(boolean z);

    @Deprecated
    /* renamed from: e */
    void mo15875e();

    /* renamed from: f0 */
    void mo15876f0(int i, long j, long j2);

    void onAudioDecoderInitialized(String str, long j, long j2);

    /* renamed from: t */
    void mo15878t(C5413d dVar);

    /* renamed from: v */
    void mo15879v(String str);
}
