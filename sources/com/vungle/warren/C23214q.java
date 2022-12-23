package com.vungle.warren;

import android.os.Bundle;
import android.os.SystemClock;
import ce0.C21087a;
import ud0.C25018b;
import ud0.C25023g;
import ud0.C25024h;

/* renamed from: com.vungle.warren.q */
public final class C23214q extends C21087a.C21093f {

    /* renamed from: a */
    public final /* synthetic */ C23217r f58918a;

    public C23214q(C23217r rVar) {
        this.f58918a = rVar;
    }

    /* renamed from: c */
    public final void mo53289c() {
        C23217r rVar = this.f58918a;
        if (rVar.f58925e == 0 && rVar.f58922b != 0) {
            rVar.f58925e = 1;
            Bundle bundle = new Bundle();
            bundle.putLong("cache_bust_interval", rVar.f58922b);
            bundle.putLong("next_cache_bust", SystemClock.elapsedRealtime() + rVar.f58922b);
            C25024h hVar = rVar.f58921a;
            String[] strArr = C25018b.f63186d;
            C25023g gVar = new C25023g("ud0.b");
            gVar.f63204i = 0;
            gVar.f63198c = true;
            long j = rVar.f58922b;
            gVar.f63199d = j - rVar.f58924d;
            gVar.f63200e = j;
            gVar.f63203h = 0;
            gVar.f63202g = bundle;
            hVar.mo58356b(gVar);
            rVar.f58924d = 0;
            rVar.f58923c = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: d */
    public final void mo53288d() {
        C23217r rVar = this.f58918a;
        if (rVar.f58922b != 0) {
            rVar.f58924d = (SystemClock.elapsedRealtime() - rVar.f58923c) % rVar.f58922b;
        }
        C25024h hVar = rVar.f58921a;
        String[] strArr = C25018b.f63186d;
        hVar.mo58355a();
        rVar.f58925e = 0;
    }
}
