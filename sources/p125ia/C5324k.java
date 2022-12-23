package p125ia;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import p277ub.C6774a0;

/* renamed from: ia.k */
public final class C5324k {

    /* renamed from: a */
    public final C5325a f17535a;

    /* renamed from: b */
    public int f17536b;

    /* renamed from: c */
    public long f17537c;

    /* renamed from: d */
    public long f17538d;

    /* renamed from: e */
    public long f17539e;

    /* renamed from: f */
    public long f17540f;

    /* renamed from: ia.k$a */
    public static final class C5325a {

        /* renamed from: a */
        public final AudioTrack f17541a;

        /* renamed from: b */
        public final AudioTimestamp f17542b = new AudioTimestamp();

        /* renamed from: c */
        public long f17543c;

        /* renamed from: d */
        public long f17544d;

        /* renamed from: e */
        public long f17545e;

        public C5325a(AudioTrack audioTrack) {
            this.f17541a = audioTrack;
        }
    }

    public C5324k(AudioTrack audioTrack) {
        if (C6774a0.f20959a >= 19) {
            this.f17535a = new C5325a(audioTrack);
            mo21105a();
            return;
        }
        this.f17535a = null;
        mo21106b(3);
    }

    /* renamed from: a */
    public final void mo21105a() {
        if (this.f17535a != null) {
            mo21106b(0);
        }
    }

    /* renamed from: b */
    public final void mo21106b(int i) {
        this.f17536b = i;
        if (i == 0) {
            this.f17539e = 0;
            this.f17540f = -1;
            this.f17537c = System.nanoTime() / 1000;
            this.f17538d = 10000;
        } else if (i == 1) {
            this.f17538d = 10000;
        } else if (i == 2 || i == 3) {
            this.f17538d = 10000000;
        } else if (i == 4) {
            this.f17538d = 500000;
        } else {
            throw new IllegalStateException();
        }
    }
}
