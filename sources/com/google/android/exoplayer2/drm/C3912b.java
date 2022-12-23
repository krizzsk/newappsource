package com.google.android.exoplayer2.drm;

import android.os.Handler;
import androidx.camera.camera2.internal.C0509c;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p066e0.C4419c0;
import p100gb.C4987o;
import p161la.C5652a;
import p277ub.C6774a0;
import p304x.C7087p;
import p304x.C7097r;
import p316y.C7229u;

/* renamed from: com.google.android.exoplayer2.drm.b */
public interface C3912b {

    /* renamed from: com.google.android.exoplayer2.drm.b$a */
    public static class C3913a {

        /* renamed from: a */
        public final int f13725a;

        /* renamed from: b */
        public final C4987o.C4988a f13726b;

        /* renamed from: c */
        public final CopyOnWriteArrayList<C3914a> f13727c;

        /* renamed from: com.google.android.exoplayer2.drm.b$a$a */
        public static final class C3914a {

            /* renamed from: a */
            public Handler f13728a;

            /* renamed from: b */
            public C3912b f13729b;

            public C3914a(Handler handler, C3912b bVar) {
                this.f13728a = handler;
                this.f13729b = bVar;
            }
        }

        public C3913a() {
            this(new CopyOnWriteArrayList(), 0, (C4987o.C4988a) null);
        }

        /* renamed from: a */
        public final void mo16001a() {
            Iterator<C3914a> it = this.f13727c.iterator();
            while (it.hasNext()) {
                C3914a next = it.next();
                C6774a0.m15966z(next.f13728a, new C7087p(9, this, next.f13729b));
            }
        }

        /* renamed from: b */
        public final void mo16002b() {
            Iterator<C3914a> it = this.f13727c.iterator();
            while (it.hasNext()) {
                C3914a next = it.next();
                C6774a0.m15966z(next.f13728a, new C7229u(11, this, next.f13729b));
            }
        }

        /* renamed from: c */
        public final void mo16003c() {
            Iterator<C3914a> it = this.f13727c.iterator();
            while (it.hasNext()) {
                C3914a next = it.next();
                C6774a0.m15966z(next.f13728a, new C7097r(13, this, next.f13729b));
            }
        }

        /* renamed from: d */
        public final void mo16004d(int i) {
            Iterator<C3914a> it = this.f13727c.iterator();
            while (it.hasNext()) {
                C3914a next = it.next();
                C6774a0.m15966z(next.f13728a, new C5652a(this, next.f13729b, i));
            }
        }

        /* renamed from: e */
        public final void mo16005e(Exception exc) {
            Iterator<C3914a> it = this.f13727c.iterator();
            while (it.hasNext()) {
                C3914a next = it.next();
                C6774a0.m15966z(next.f13728a, new C4419c0(2, this, next.f13729b, exc));
            }
        }

        /* renamed from: f */
        public final void mo16006f() {
            Iterator<C3914a> it = this.f13727c.iterator();
            while (it.hasNext()) {
                C3914a next = it.next();
                C6774a0.m15966z(next.f13728a, new C0509c(7, this, next.f13729b));
            }
        }

        public C3913a(CopyOnWriteArrayList<C3914a> copyOnWriteArrayList, int i, C4987o.C4988a aVar) {
            this.f13727c = copyOnWriteArrayList;
            this.f13725a = i;
            this.f13726b = aVar;
        }
    }

    /* renamed from: E */
    void mo15994E(int i, C4987o.C4988a aVar);

    /* renamed from: R */
    void mo15995R(int i, C4987o.C4988a aVar);

    /* renamed from: e0 */
    void mo15996e0(int i, C4987o.C4988a aVar);

    @Deprecated
    /* renamed from: f */
    void mo15997f();

    /* renamed from: g0 */
    void mo15998g0(int i, C4987o.C4988a aVar, int i2);

    /* renamed from: n */
    void mo15999n(int i, C4987o.C4988a aVar, Exception exc);

    /* renamed from: z */
    void mo16000z(int i, C4987o.C4988a aVar);
}
