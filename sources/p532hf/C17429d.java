package p532hf;

import com.google.firebase.perf.config.RemoteConfigManager;
import com.google.firebase.perf.session.SessionManager;
import ie0.C23588c;
import p237r9.C6273f;
import p358af.C13436c;
import p578jf.C17823a;
import p602kf.C18031b;
import p602kf.C18032c;
import p602kf.C18033d;
import p602kf.C18034e;
import p602kf.C18035f;
import p602kf.C18036g;
import p602kf.C18037h;
import p743qd.C19107d;
import p862vf.C20122f;
import p956ze.C20839b;
import ye0.C25292a;

/* renamed from: hf.d */
public final class C17429d implements C23588c<C17427b> {

    /* renamed from: a */
    public final C25292a<C19107d> f44892a;

    /* renamed from: b */
    public final C25292a<C20839b<C20122f>> f44893b;

    /* renamed from: c */
    public final C25292a<C13436c> f44894c;

    /* renamed from: d */
    public final C25292a<C20839b<C6273f>> f44895d;

    /* renamed from: e */
    public final C25292a<RemoteConfigManager> f44896e;

    /* renamed from: f */
    public final C25292a<C17823a> f44897f;

    /* renamed from: g */
    public final C25292a<SessionManager> f44898g;

    public C17429d(C18032c cVar, C18034e eVar, C18033d dVar, C18037h hVar, C18035f fVar, C18031b bVar, C18036g gVar) {
        this.f44892a = cVar;
        this.f44893b = eVar;
        this.f44894c = dVar;
        this.f44895d = hVar;
        this.f44896e = fVar;
        this.f44897f = bVar;
        this.f44898g = gVar;
    }

    public final Object get() {
        return new C17427b(this.f44892a.get(), this.f44893b.get(), this.f44894c.get(), this.f44895d.get(), this.f44896e.get(), this.f44897f.get(), this.f44898g.get());
    }
}
