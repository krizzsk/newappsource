package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import com.bumptech.glide.load.engine.C2169c;
import com.bumptech.glide.load.engine.C2172e;
import java.io.File;
import java.util.List;
import p025b6.C1487b;
import p060d6.C4382c;
import p108h6.C5104n;

/* renamed from: com.bumptech.glide.load.engine.b */
public final class C2168b implements C2169c, C2142d.C2143a<Object> {

    /* renamed from: b */
    public final List<C1487b> f7033b;

    /* renamed from: c */
    public final C2171d<?> f7034c;

    /* renamed from: d */
    public final C2169c.C2170a f7035d;

    /* renamed from: e */
    public int f7036e = -1;

    /* renamed from: f */
    public C1487b f7037f;

    /* renamed from: g */
    public List<C5104n<File, ?>> f7038g;

    /* renamed from: h */
    public int f7039h;

    /* renamed from: i */
    public volatile C5104n.C5105a<?> f7040i;

    /* renamed from: j */
    public File f7041j;

    public C2168b(List<C1487b> list, C2171d<?> dVar, C2169c.C2170a aVar) {
        this.f7033b = list;
        this.f7034c = dVar;
        this.f7035d = aVar;
    }

    /* renamed from: c */
    public final void mo10913c(Exception exc) {
        this.f7035d.mo10923b(this.f7037f, exc, this.f7040i.f17106c, DataSource.DATA_DISK_CACHE);
    }

    public final void cancel() {
        C5104n.C5105a<?> aVar = this.f7040i;
        if (aVar != null) {
            aVar.f17106c.cancel();
        }
    }

    /* renamed from: d */
    public final boolean mo10954d() {
        boolean z;
        boolean z2;
        boolean z3;
        while (true) {
            List<C5104n<File, ?>> list = this.f7038g;
            if (list != null) {
                if (this.f7039h < list.size()) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    this.f7040i = null;
                    boolean z4 = false;
                    while (!z4) {
                        if (this.f7039h < this.f7038g.size()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            break;
                        }
                        List<C5104n<File, ?>> list2 = this.f7038g;
                        int i = this.f7039h;
                        this.f7039h = i + 1;
                        File file = this.f7041j;
                        C2171d<?> dVar = this.f7034c;
                        this.f7040i = list2.get(i).mo20816b(file, dVar.f7046e, dVar.f7047f, dVar.f7050i);
                        if (this.f7040i != null) {
                            if (this.f7034c.mo10957c(this.f7040i.f17106c.mo6607a()) != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z3) {
                                this.f7040i.f17106c.mo6611e(this.f7034c.f7056o, this);
                                z4 = true;
                            }
                        }
                    }
                    return z4;
                }
            }
            int i2 = this.f7036e + 1;
            this.f7036e = i2;
            if (i2 >= this.f7033b.size()) {
                return false;
            }
            C1487b bVar = this.f7033b.get(this.f7036e);
            C2171d<?> dVar2 = this.f7034c;
            File c = ((C2172e.C2177c) dVar2.f7049h).mo10966a().mo20207c(new C4382c(bVar, dVar2.f7055n));
            this.f7041j = c;
            if (c != null) {
                this.f7037f = bVar;
                this.f7038g = this.f7034c.f7044c.f6909b.mo10831e(c);
                this.f7039h = 0;
            }
        }
    }

    /* renamed from: f */
    public final void mo10914f(Object obj) {
        this.f7035d.mo10922a(this.f7037f, obj, this.f7040i.f17106c, DataSource.DATA_DISK_CACHE, this.f7037f);
    }
}
