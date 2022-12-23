package oa0;

import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import na0.C12925d;
import ua0.C13153g;
import ua0.C13155h;
import v20.C20082a;
import xa0.C13243a;
import xa0.C13250f;
import za0.C13361f;

/* renamed from: oa0.i */
public abstract class C12974i {

    /* renamed from: a */
    public C13243a f32121a;

    /* renamed from: b */
    public boolean f32122b = true;

    /* renamed from: c */
    public C13361f<?> f32123c;

    /* renamed from: d */
    public C13155h<?> f32124d;

    /* renamed from: e */
    public volatile C12975a f32125e;

    /* renamed from: f */
    public Object f32126f;

    /* renamed from: oa0.i$a */
    public static class C12975a {

        /* renamed from: a */
        public int f32127a;

        /* renamed from: b */
        public C13153g f32128b;

        /* renamed from: c */
        public final Envelope f32129c;

        public C12975a(Envelope envelope) {
            this.f32129c = envelope;
        }
    }

    public C12974i(C13250f fVar, C13155h hVar, C20082a.C20088f fVar2) {
        this.f32121a = fVar;
        this.f32124d = hVar;
        this.f32126f = fVar2;
    }

    /* renamed from: a */
    public abstract MapPos mo39839a(MapPos mapPos);

    /* renamed from: b */
    public abstract void mo39846b();

    /* renamed from: c */
    public C12975a mo39840c() {
        return this.f32125e;
    }

    /* renamed from: d */
    public synchronized void mo39848d(int i) {
        C13153g gVar;
        if (this.f32125e != null) {
            this.f32125e.f32127a = i;
            C12975a aVar = this.f32125e;
            if (this.f32122b) {
                gVar = this.f32124d.mo40047a(i);
            } else {
                gVar = null;
            }
            aVar.f32128b = gVar;
        }
    }

    /* renamed from: e */
    public final void mo39855e(C12975a aVar) {
        if (this.f32125e != null) {
            aVar.f32127a = this.f32125e.f32127a;
            aVar.f32128b = this.f32125e.f32128b;
        }
        this.f32125e = aVar;
    }

    /* renamed from: f */
    public final synchronized void mo39856f() {
        if (this.f32123c != null) {
            mo39848d(this.f32125e.f32127a);
            C12925d dVar = this.f32123c.f32172c;
            if (dVar != null) {
                dVar.f32012j.mo39976m();
            }
        }
    }
}
