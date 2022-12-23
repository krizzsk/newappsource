package com.vungle.warren;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import ce0.C21110n;
import ce0.C21120u;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import p389bl.C13641g;
import ud0.C25022f;
import ud0.C25023g;
import ud0.C25024h;
import vd0.C25087a;
import wd0.C25127a;

/* renamed from: com.vungle.warren.v1 */
public final class C23240v1 implements C25024h {

    /* renamed from: i */
    public static Handler f58977i = new Handler(Looper.getMainLooper());

    /* renamed from: j */
    public static final String f58978j = C23240v1.class.getSimpleName();

    /* renamed from: a */
    public final C25127a f58979a;

    /* renamed from: b */
    public final C21110n f58980b;

    /* renamed from: c */
    public C25022f f58981c;

    /* renamed from: d */
    public Executor f58982d;

    /* renamed from: e */
    public CopyOnWriteArrayList f58983e;

    /* renamed from: f */
    public C23243c f58984f;

    /* renamed from: g */
    public long f58985g = Long.MAX_VALUE;

    /* renamed from: h */
    public final C23241a f58986h = new C23241a();

    /* renamed from: com.vungle.warren.v1$a */
    public class C23241a implements C21110n.C21112b {
        public C23241a() {
        }

        /* renamed from: a */
        public final void mo53313a() {
            C23240v1.this.mo58357c();
        }
    }

    /* renamed from: com.vungle.warren.v1$b */
    public static class C23242b {

        /* renamed from: a */
        public final long f58988a;

        /* renamed from: b */
        public C25023g f58989b;

        public C23242b(long j, C25023g gVar) {
            this.f58988a = j;
            this.f58989b = gVar;
        }
    }

    /* renamed from: com.vungle.warren.v1$c */
    public static class C23243c implements Runnable {

        /* renamed from: b */
        public WeakReference<C23240v1> f58990b;

        public C23243c(WeakReference<C23240v1> weakReference) {
            this.f58990b = weakReference;
        }

        public final void run() {
            C23240v1 v1Var = this.f58990b.get();
            if (v1Var != null) {
                v1Var.mo58357c();
            }
        }
    }

    public C23240v1(C25022f fVar, C21120u uVar, C13641g gVar, C21110n nVar) {
        this.f58981c = fVar;
        this.f58982d = uVar;
        this.f58979a = gVar;
        this.f58983e = new CopyOnWriteArrayList();
        this.f58980b = nVar;
        this.f58984f = new C23243c(new WeakReference(this));
    }

    /* renamed from: a */
    public final synchronized void mo58355a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f58983e.iterator();
        while (it.hasNext()) {
            C23242b bVar = (C23242b) it.next();
            if (bVar.f58989b.f63197b.equals("ud0.b")) {
                arrayList.add(bVar);
            }
        }
        this.f58983e.removeAll(arrayList);
    }

    /* renamed from: b */
    public final synchronized void mo58356b(C25023g gVar) {
        C25023g f = gVar.mo61560f();
        String str = f.f63197b;
        long j = f.f63199d;
        f.f63199d = 0;
        if (f.f63198c) {
            Iterator it = this.f58983e.iterator();
            while (it.hasNext()) {
                C23242b bVar = (C23242b) it.next();
                if (bVar.f58989b.f63197b.equals(str)) {
                    this.f58983e.remove(bVar);
                }
            }
        }
        this.f58983e.add(new C23242b(SystemClock.uptimeMillis() + j, f));
        mo58357c();
    }

    /* renamed from: c */
    public final synchronized void mo58357c() {
        synchronized (this) {
            long uptimeMillis = SystemClock.uptimeMillis();
            Iterator it = this.f58983e.iterator();
            long j = Long.MAX_VALUE;
            long j2 = 0;
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                C23242b bVar = (C23242b) it.next();
                long j3 = bVar.f58988a;
                if (uptimeMillis >= j3) {
                    if (bVar.f58989b.f63205j == 1 && this.f58980b.mo53310a() == -1) {
                        z = false;
                        j2++;
                    }
                    if (z) {
                        this.f58983e.remove(bVar);
                        this.f58982d.execute(new C25087a(bVar.f58989b, this.f58981c, this, this.f58979a));
                    }
                } else {
                    j = Math.min(j, j3);
                }
            }
            if (!(j == Long.MAX_VALUE || j == this.f58985g)) {
                f58977i.removeCallbacks(this.f58984f);
                f58977i.postAtTime(this.f58984f, f58978j, j);
            }
            this.f58985g = j;
            if (j2 > 0) {
                C21110n nVar = this.f58980b;
                nVar.f52961e.add(this.f58986h);
                nVar.mo53311c(true);
            } else {
                C21110n nVar2 = this.f58980b;
                nVar2.f52961e.remove(this.f58986h);
                nVar2.mo53311c(!nVar2.f52961e.isEmpty());
            }
        }
    }
}
