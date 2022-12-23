package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.engine.C2169c;
import com.bumptech.glide.load.engine.C2172e;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p025b6.C1487b;
import p025b6.C1495h;
import p060d6.C4398m;
import p108h6.C5104n;

/* renamed from: com.bumptech.glide.load.engine.h */
public final class C2187h implements C2169c, C2142d.C2143a<Object> {

    /* renamed from: b */
    public final C2169c.C2170a f7126b;

    /* renamed from: c */
    public final C2171d<?> f7127c;

    /* renamed from: d */
    public int f7128d;

    /* renamed from: e */
    public int f7129e = -1;

    /* renamed from: f */
    public C1487b f7130f;

    /* renamed from: g */
    public List<C5104n<File, ?>> f7131g;

    /* renamed from: h */
    public int f7132h;

    /* renamed from: i */
    public volatile C5104n.C5105a<?> f7133i;

    /* renamed from: j */
    public File f7134j;

    /* renamed from: k */
    public C4398m f7135k;

    public C2187h(C2171d<?> dVar, C2169c.C2170a aVar) {
        this.f7127c = dVar;
        this.f7126b = aVar;
    }

    /* renamed from: c */
    public final void mo10913c(Exception exc) {
        this.f7126b.mo10923b(this.f7135k, exc, this.f7133i.f17106c, DataSource.RESOURCE_DISK_CACHE);
    }

    public final void cancel() {
        C5104n.C5105a<?> aVar = this.f7133i;
        if (aVar != null) {
            aVar.f17106c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean mo10954d() {
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList a = this.f7127c.mo10955a();
        if (a.isEmpty()) {
            return false;
        }
        List<Class<?>> d = this.f7127c.mo10958d();
        if (!d.isEmpty()) {
            while (true) {
                List<C5104n<File, ?>> list = this.f7131g;
                if (list != null) {
                    if (this.f7132h < list.size()) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        this.f7133i = null;
                        boolean z4 = false;
                        while (!z4) {
                            if (this.f7132h < this.f7131g.size()) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z2) {
                                break;
                            }
                            List<C5104n<File, ?>> list2 = this.f7131g;
                            int i = this.f7132h;
                            this.f7132h = i + 1;
                            File file = this.f7134j;
                            C2171d<?> dVar = this.f7127c;
                            this.f7133i = list2.get(i).mo20816b(file, dVar.f7046e, dVar.f7047f, dVar.f7050i);
                            if (this.f7133i != null) {
                                if (this.f7127c.mo10957c(this.f7133i.f17106c.mo6607a()) != null) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    this.f7133i.f17106c.mo6611e(this.f7127c.f7056o, this);
                                    z4 = true;
                                }
                            }
                        }
                        return z4;
                    }
                }
                int i2 = this.f7129e + 1;
                this.f7129e = i2;
                if (i2 >= d.size()) {
                    int i3 = this.f7128d + 1;
                    this.f7128d = i3;
                    if (i3 >= a.size()) {
                        return false;
                    }
                    this.f7129e = 0;
                }
                C1487b bVar = (C1487b) a.get(this.f7128d);
                Class cls = d.get(this.f7129e);
                C1495h<Z> f = this.f7127c.mo10960f(cls);
                C2171d<?> dVar2 = this.f7127c;
                this.f7135k = new C4398m(dVar2.f7044c.f6908a, bVar, dVar2.f7055n, dVar2.f7046e, dVar2.f7047f, f, cls, dVar2.f7050i);
                File c = ((C2172e.C2177c) dVar2.f7049h).mo10966a().mo20207c(this.f7135k);
                this.f7134j = c;
                if (c != null) {
                    this.f7130f = bVar;
                    this.f7131g = this.f7127c.f7044c.f6909b.mo10831e(c);
                    this.f7132h = 0;
                }
            }
        } else if (File.class.equals(this.f7127c.f7052k)) {
            return false;
        } else {
            throw new IllegalStateException("Failed to find any load path from " + this.f7127c.f7045d.getClass() + " to " + this.f7127c.f7052k);
        }
    }

    /* renamed from: f */
    public final void mo10914f(Object obj) {
        this.f7126b.mo10922a(this.f7130f, obj, this.f7133i.f17106c, DataSource.RESOURCE_DISK_CACHE, this.f7135k);
    }
}
