package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import p060d6.C4385f;
import p090g1.C4732a;
import p195o6.C5998c;
import p221q6.C6182c;
import p221q6.C6184d;
import p221q6.C6185e;
import p221q6.C6186f;
import p221q6.C6189i;
import p221q6.C6190j;
import p221q6.C6191k;
import p221q6.C6197n;
import p221q6.C6198o;
import p221q6.C6210s;
import p260t6.C6598d;
import p260t6.C6601f;
import p260t6.C6602g;
import p273u6.C6711d;
import p273u6.C6720j;
import p285v6.C6869d;
import p311x6.C7176l;

/* renamed from: com.bumptech.glide.j */
public class C2131j implements ComponentCallbacks2, C6190j {

    /* renamed from: l */
    public static final C6602g f6936l = ((C6602g) ((C6602g) new C6602g().mo22724h(Bitmap.class)).mo22731p());

    /* renamed from: m */
    public static final C6602g f6937m = ((C6602g) ((C6602g) ((C6602g) new C6602g().mo22726i(C4385f.f15422c)).mo22740y(Priority.LOW)).mo22715F(true));

    /* renamed from: b */
    public final C2116c f6938b;

    /* renamed from: c */
    public final Context f6939c;

    /* renamed from: d */
    public final C6189i f6940d;

    /* renamed from: e */
    public final C6198o f6941e;

    /* renamed from: f */
    public final C6197n f6942f;

    /* renamed from: g */
    public final C6210s f6943g = new C6210s();

    /* renamed from: h */
    public final C2132a f6944h;

    /* renamed from: i */
    public final C6182c f6945i;

    /* renamed from: j */
    public final CopyOnWriteArrayList<C6601f<Object>> f6946j;

    /* renamed from: k */
    public C6602g f6947k;

    /* renamed from: com.bumptech.glide.j$a */
    public class C2132a implements Runnable {
        public C2132a() {
        }

        public final void run() {
            C2131j jVar = C2131j.this;
            jVar.f6940d.mo22165c(jVar);
        }
    }

    /* renamed from: com.bumptech.glide.j$b */
    public static class C2133b extends C6711d<View, Object> {
        public C2133b(View view) {
            super(view);
        }

        /* renamed from: f */
        public final void mo10886f(Drawable drawable) {
        }

        /* renamed from: h */
        public final void mo10887h(Object obj, C6869d<? super Object> dVar) {
        }

        /* renamed from: i */
        public final void mo10888i(Drawable drawable) {
        }
    }

    /* renamed from: com.bumptech.glide.j$c */
    public class C2134c implements C6182c.C6183a {

        /* renamed from: a */
        public final C6198o f6949a;

        public C2134c(C6198o oVar) {
            this.f6949a = oVar;
        }

        /* renamed from: a */
        public final void mo10889a(boolean z) {
            if (z) {
                synchronized (C2131j.this) {
                    this.f6949a.mo22201b();
                }
            }
        }
    }

    static {
        C6602g gVar = (C6602g) ((C6602g) new C6602g().mo22724h(C5998c.class)).mo22731p();
    }

    public C2131j(C2116c cVar, C6189i iVar, C6197n nVar, Context context) {
        boolean z;
        C6182c cVar2;
        C6602g gVar;
        C6198o oVar = new C6198o();
        C6184d dVar = cVar.f6888i;
        C2132a aVar = new C2132a();
        this.f6944h = aVar;
        this.f6938b = cVar;
        this.f6940d = iVar;
        this.f6942f = nVar;
        this.f6941e = oVar;
        this.f6939c = context;
        Context applicationContext = context.getApplicationContext();
        C2134c cVar3 = new C2134c(oVar);
        ((C6186f) dVar).getClass();
        if (C4732a.checkSelfPermission(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            cVar2 = new C6185e(applicationContext, cVar3);
        } else {
            cVar2 = new C6191k();
        }
        this.f6945i = cVar2;
        if (C7176l.m16788h()) {
            C7176l.m16786f().post(aVar);
        } else {
            iVar.mo22165c(this);
        }
        iVar.mo22165c(cVar2);
        this.f6946j = new CopyOnWriteArrayList<>(cVar.f6884e.f6912e);
        C2125f fVar = cVar.f6884e;
        synchronized (fVar) {
            if (fVar.f6917j == null) {
                fVar.f6917j = (C6602g) fVar.f6911d.build().mo22731p();
            }
            gVar = fVar.f6917j;
        }
        mo10882r(gVar);
        synchronized (cVar.f6889j) {
            if (!cVar.f6889j.contains(this)) {
                cVar.f6889j.add(this);
            } else {
                throw new IllegalStateException("Cannot register already registered manager");
            }
        }
    }

    /* renamed from: f */
    public C2131j mo10867f(C6601f<Object> fVar) {
        this.f6946j.add(fVar);
        return this;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: g */
    public synchronized com.bumptech.glide.C2131j mo10868g(p260t6.C6602g r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0012 }
            t6.g r0 = r1.f6947k     // Catch:{ all -> 0x000f }
            t6.a r2 = r0.mo10857a(r2)     // Catch:{ all -> 0x000f }
            t6.g r2 = (p260t6.C6602g) r2     // Catch:{ all -> 0x000f }
            r1.f6947k = r2     // Catch:{ all -> 0x000f }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return r1
        L_0x000f:
            r2 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r2     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2131j.mo10868g(t6.g):com.bumptech.glide.j");
    }

    /* renamed from: k */
    public <ResourceType> C2129i<ResourceType> mo10869k(Class<ResourceType> cls) {
        return new C2129i<>(this.f6938b, this, cls, this.f6939c);
    }

    /* renamed from: l */
    public C2129i<Bitmap> mo10870l() {
        return mo10869k(Bitmap.class).mo10857a(f6936l);
    }

    /* renamed from: m */
    public C2129i<Drawable> mo10871m() {
        return mo10869k(Drawable.class);
    }

    /* renamed from: n */
    public final void mo10872n(View view) {
        mo10873o(new C2133b(view));
    }

    /* renamed from: o */
    public final void mo10873o(C6720j<?> jVar) {
        boolean z;
        if (jVar != null) {
            boolean s = mo10883s(jVar);
            C6598d c = jVar.mo22744c();
            if (!s) {
                C2116c cVar = this.f6938b;
                synchronized (cVar.f6889j) {
                    Iterator it = cVar.f6889j.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C2131j) it.next()).mo10883s(jVar)) {
                                z = true;
                                break;
                            }
                        } else {
                            z = false;
                            break;
                        }
                    }
                }
                if (!z && c != null) {
                    jVar.mo22746e((C6598d) null);
                    c.clear();
                }
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final synchronized void onDestroy() {
        this.f6943g.onDestroy();
        Iterator it = C7176l.m16785e(this.f6943g.f19625b).iterator();
        while (it.hasNext()) {
            mo10873o((C6720j) it.next());
        }
        this.f6943g.f19625b.clear();
        C6198o oVar = this.f6941e;
        Iterator it2 = C7176l.m16785e((Set) oVar.f19597c).iterator();
        while (it2.hasNext()) {
            oVar.mo22200a((C6598d) it2.next());
        }
        ((Set) oVar.f19598d).clear();
        this.f6940d.mo22166d(this);
        this.f6940d.mo22166d(this.f6945i);
        C7176l.m16786f().removeCallbacks(this.f6944h);
        this.f6938b.mo10838d(this);
    }

    public final void onLowMemory() {
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public final synchronized void onStart() {
        /*
            r1 = this;
            monitor-enter(r1)
            monitor-enter(r1)     // Catch:{ all -> 0x0012 }
            q6.o r0 = r1.f6941e     // Catch:{ all -> 0x000f }
            r0.mo22202c()     // Catch:{ all -> 0x000f }
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            q6.s r0 = r1.f6943g     // Catch:{ all -> 0x0012 }
            r0.onStart()     // Catch:{ all -> 0x0012 }
            monitor-exit(r1)
            return
        L_0x000f:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0012 }
            throw r0     // Catch:{ all -> 0x0012 }
        L_0x0012:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.C2131j.onStart():void");
    }

    public final synchronized void onStop() {
        mo10881q();
        this.f6943g.onStop();
    }

    public final void onTrimMemory(int i) {
    }

    /* renamed from: p */
    public C2129i<Drawable> mo10880p(String str) {
        return mo10871m().mo10856Z(str);
    }

    /* renamed from: q */
    public final synchronized void mo10881q() {
        C6198o oVar = this.f6941e;
        oVar.f19596b = true;
        Iterator it = C7176l.m16785e((Set) oVar.f19597c).iterator();
        while (it.hasNext()) {
            C6598d dVar = (C6598d) it.next();
            if (dVar.isRunning()) {
                dVar.pause();
                ((Set) oVar.f19598d).add(dVar);
            }
        }
    }

    /* renamed from: r */
    public synchronized void mo10882r(C6602g gVar) {
        this.f6947k = (C6602g) ((C6602g) gVar.clone()).mo22723f();
    }

    /* renamed from: s */
    public final synchronized boolean mo10883s(C6720j<?> jVar) {
        C6598d c = jVar.mo22744c();
        if (c == null) {
            return true;
        }
        if (!this.f6941e.mo22200a(c)) {
            return false;
        }
        this.f6943g.f19625b.remove(jVar);
        jVar.mo22746e((C6598d) null);
        return true;
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6941e + ", treeNode=" + this.f6942f + "}";
    }
}
