package com.vungle.warren;

import android.os.Bundle;
import android.os.SystemClock;
import ce0.C21087a;
import ud0.C25018b;
import ud0.C25023g;
import ud0.C25024h;

/* renamed from: com.vungle.warren.r */
public final class C23217r {

    /* renamed from: a */
    public C25024h f58921a;

    /* renamed from: b */
    public long f58922b = 0;

    /* renamed from: c */
    public long f58923c;

    /* renamed from: d */
    public long f58924d;

    /* renamed from: e */
    public int f58925e;

    public C23217r(C25024h hVar) {
        this.f58921a = hVar;
        C21087a aVar = C21087a.f52911k;
        if (aVar.f52912b) {
            aVar.mo53275a(new C23214q(this));
        } else {
            VungleLogger.m57029b(C23217r.class.getSimpleName() + "#deliverError", "No lifecycle listener set");
        }
        this.f58925e = 0;
    }

    /* renamed from: a */
    public final synchronized void mo58312a() {
        if (this.f58925e != 1) {
            this.f58925e = 1;
            if (this.f58922b == 0) {
                C25024h hVar = this.f58921a;
                String[] strArr = C25018b.f63186d;
                C25023g gVar = new C25023g("ud0.b");
                gVar.f63204i = 0;
                gVar.f63198c = true;
                hVar.mo58356b(gVar);
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("cache_bust_interval", this.f58922b);
                bundle.putLong("next_cache_bust", SystemClock.elapsedRealtime() + this.f58922b);
                C25024h hVar2 = this.f58921a;
                String[] strArr2 = C25018b.f63186d;
                C25023g gVar2 = new C25023g("ud0.b");
                gVar2.f63204i = 0;
                gVar2.f63198c = true;
                gVar2.f63200e = this.f58922b;
                gVar2.f63203h = 0;
                gVar2.f63202g = bundle;
                hVar2.mo58356b(gVar2);
            }
            this.f58923c = SystemClock.elapsedRealtime();
        }
    }
}
