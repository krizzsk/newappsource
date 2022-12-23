package p766rf;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.perf.p414v1.C14526h;
import com.google.firebase.perf.p414v1.SessionVerbosity;
import com.google.firebase.perf.util.Timer;
import com.google.protobuf.C14610k;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import p258t4.C6587a;
import p578jf.C17823a;
import p578jf.C17827e;
import p578jf.C17828f;
import p578jf.C17839q;
import p578jf.C17840r;
import p626lf.C18200a;
import p790sf.C19454b;
import p790sf.C19455c;
import p790sf.C19458e;

/* renamed from: rf.c */
public final class C19258c {

    /* renamed from: a */
    public final C17823a f48915a;

    /* renamed from: b */
    public final float f48916b;

    /* renamed from: c */
    public final float f48917c;

    /* renamed from: d */
    public C19259a f48918d = null;

    /* renamed from: e */
    public C19259a f48919e = null;

    /* renamed from: f */
    public boolean f48920f;

    /* renamed from: rf.c$a */
    public static class C19259a {

        /* renamed from: k */
        public static final C18200a f48921k = C18200a.m44901d();

        /* renamed from: l */
        public static final long f48922l = TimeUnit.SECONDS.toMicros(1);

        /* renamed from: a */
        public final C6587a f48923a;

        /* renamed from: b */
        public final boolean f48924b;

        /* renamed from: c */
        public Timer f48925c;

        /* renamed from: d */
        public C19455c f48926d;

        /* renamed from: e */
        public long f48927e = 500;

        /* renamed from: f */
        public long f48928f;

        /* renamed from: g */
        public C19455c f48929g;

        /* renamed from: h */
        public C19455c f48930h;

        /* renamed from: i */
        public long f48931i;

        /* renamed from: j */
        public long f48932j;

        public C19259a(C19455c cVar, C6587a aVar, C17823a aVar2, String str, boolean z) {
            long j;
            long j2;
            long j3;
            long j4;
            C17827e eVar;
            C17839q qVar;
            C17828f fVar;
            C17840r rVar;
            C17823a aVar3 = aVar2;
            String str2 = str;
            boolean z2 = z;
            this.f48923a = aVar;
            this.f48926d = cVar;
            this.f48928f = 500;
            this.f48925c = new Timer();
            if (str2 == "Trace") {
                j = aVar2.mo50413k();
            } else {
                j = aVar2.mo50413k();
            }
            long j5 = j;
            if (str2 == "Trace") {
                synchronized (C17840r.class) {
                    if (C17840r.f45809b == null) {
                        C17840r.f45809b = new C17840r();
                    }
                    rVar = C17840r.f45809b;
                }
                C19454b<Long> l = aVar3.mo50414l(rVar);
                if (!l.mo51862b() || !C17823a.m44162m(l.mo51861a().longValue())) {
                    C19454b<Long> c = aVar3.mo50406c(rVar);
                    if (!c.mo51862b() || !C17823a.m44162m(c.mo51861a().longValue())) {
                        Long l2 = 300L;
                        j2 = l2.longValue();
                    } else {
                        j2 = c.mo51861a().longValue();
                    }
                } else {
                    aVar3.f45792c.mo50419d(l.mo51861a().longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                    j2 = l.mo51861a().longValue();
                }
            } else {
                synchronized (C17828f.class) {
                    if (C17828f.f45797b == null) {
                        C17828f.f45797b = new C17828f();
                    }
                    fVar = C17828f.f45797b;
                }
                C19454b<Long> l3 = aVar3.mo50414l(fVar);
                if (!l3.mo51862b() || !C17823a.m44162m(l3.mo51861a().longValue())) {
                    C19454b<Long> c2 = aVar3.mo50406c(fVar);
                    if (!c2.mo51862b() || !C17823a.m44162m(c2.mo51861a().longValue())) {
                        Long l4 = 700L;
                        j2 = l4.longValue();
                    } else {
                        j2 = c2.mo51861a().longValue();
                    }
                } else {
                    aVar3.f45792c.mo50419d(l3.mo51861a().longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                    j2 = l3.mo51861a().longValue();
                }
            }
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C19455c cVar2 = new C19455c(timeUnit, j2, j5);
            this.f48929g = cVar2;
            this.f48931i = j2;
            if (z2) {
                f48921k.mo50611b("Foreground %s logging rate:%f, burst capacity:%d", str2, cVar2, Long.valueOf(j2));
            }
            if (str2 == "Trace") {
                j3 = aVar2.mo50413k();
            } else {
                j3 = aVar2.mo50413k();
            }
            long j6 = j3;
            if (str2 == "Trace") {
                synchronized (C17839q.class) {
                    if (C17839q.f45808b == null) {
                        C17839q.f45808b = new C17839q();
                    }
                    qVar = C17839q.f45808b;
                }
                C19454b<Long> l5 = aVar3.mo50414l(qVar);
                if (!l5.mo51862b() || !C17823a.m44162m(l5.mo51861a().longValue())) {
                    C19454b<Long> c3 = aVar3.mo50406c(qVar);
                    if (!c3.mo51862b() || !C17823a.m44162m(c3.mo51861a().longValue())) {
                        Long l6 = 30L;
                        j4 = l6.longValue();
                    } else {
                        j4 = c3.mo51861a().longValue();
                    }
                } else {
                    aVar3.f45792c.mo50419d(l5.mo51861a().longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                    j4 = l5.mo51861a().longValue();
                }
            } else {
                synchronized (C17827e.class) {
                    if (C17827e.f45796b == null) {
                        C17827e.f45796b = new C17827e();
                    }
                    eVar = C17827e.f45796b;
                }
                C19454b<Long> l7 = aVar3.mo50414l(eVar);
                if (!l7.mo51862b() || !C17823a.m44162m(l7.mo51861a().longValue())) {
                    C19454b<Long> c4 = aVar3.mo50406c(eVar);
                    if (!c4.mo51862b() || !C17823a.m44162m(c4.mo51861a().longValue())) {
                        Long l8 = 70L;
                        j4 = l8.longValue();
                    } else {
                        j4 = c4.mo51861a().longValue();
                    }
                } else {
                    aVar3.f45792c.mo50419d(l7.mo51861a().longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                    j4 = l7.mo51861a().longValue();
                }
            }
            C19455c cVar3 = new C19455c(timeUnit, j4, j6);
            this.f48930h = cVar3;
            this.f48932j = j4;
            if (z2) {
                f48921k.mo50611b("Background %s logging rate:%f, capacity:%d", str2, cVar3, Long.valueOf(j4));
            }
            this.f48924b = z2;
        }

        /* renamed from: a */
        public final synchronized boolean mo51679a() {
            this.f48923a.getClass();
            double c = ((double) this.f48925c.mo43520c(new Timer())) * this.f48926d.mo51863a();
            long j = f48922l;
            long max = Math.max(0, (long) (c / ((double) j)));
            this.f48928f = Math.min(this.f48928f + max, this.f48927e);
            if (max > 0) {
                this.f48925c = new Timer(this.f48925c.f36654b + ((long) (((double) (max * j)) / this.f48926d.mo51863a())));
            }
            long j2 = this.f48928f;
            if (j2 > 0) {
                this.f48928f = j2 - 1;
                return true;
            }
            if (this.f48924b) {
                f48921k.mo50614f();
            }
            return false;
        }
    }

    public C19258c(Context context, C19455c cVar) {
        boolean z;
        C6587a aVar = new C6587a();
        float nextFloat = new Random().nextFloat();
        float nextFloat2 = new Random().nextFloat();
        C17823a e = C17823a.m44161e();
        boolean z2 = false;
        this.f48920f = false;
        if (BitmapDescriptorFactory.HUE_RED > nextFloat || nextFloat >= 1.0f) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (BitmapDescriptorFactory.HUE_RED <= nextFloat2 && nextFloat2 < 1.0f) {
                z2 = true;
            }
            if (z2) {
                this.f48916b = nextFloat;
                this.f48917c = nextFloat2;
                this.f48915a = e;
                C19455c cVar2 = cVar;
                C6587a aVar2 = aVar;
                C17823a aVar3 = e;
                this.f48918d = new C19259a(cVar2, aVar2, aVar3, "Trace", this.f48920f);
                this.f48919e = new C19259a(cVar2, aVar2, aVar3, "Network", this.f48920f);
                this.f48920f = C19458e.m46855a(context);
                return;
            }
            throw new IllegalArgumentException("Fragment sampling bucket ID should be in range [0.0f, 1.0f).");
        }
        throw new IllegalArgumentException("Sampling bucket ID should be in range [0.0f, 1.0f).");
    }

    /* renamed from: a */
    public static boolean m46510a(C14610k.C14615e eVar) {
        if (eVar.size() <= 0 || ((C14526h) eVar.get(0)).mo43569w() <= 0 || ((C14526h) eVar.get(0)).mo43568v() != SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }
}
