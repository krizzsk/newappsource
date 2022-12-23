package oa0;

import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import oa0.C12974i;
import ua0.C13155h;
import v20.C20082a;
import xa0.C13250f;

/* renamed from: oa0.a */
public abstract class C12958a extends C12974i {

    /* renamed from: g */
    public MapPos f32096g;

    /* renamed from: h */
    public float f32097h;

    /* renamed from: oa0.a$a */
    public static abstract class C12959a extends C12974i.C12975a {

        /* renamed from: d */
        public final MapPos f32098d;

        /* renamed from: e */
        public final float f32099e;

        /* renamed from: f */
        public volatile boolean f32100f;

        public C12959a(MapPos mapPos, float f, Envelope envelope) {
            super(envelope);
            this.f32098d = mapPos;
            this.f32099e = f;
        }

        /* renamed from: a */
        public abstract float mo39844a();

        /* renamed from: b */
        public abstract float mo39845b();
    }

    public C12958a(MapPos mapPos, C13155h hVar, C13250f fVar, C20082a.C20088f fVar2) {
        super(fVar, hVar, fVar2);
        this.f32096g = mapPos;
    }

    /* renamed from: a */
    public MapPos mo39839a(MapPos mapPos) {
        C12959a g = mo39840c();
        if (g != null) {
            return g.f32098d;
        }
        return null;
    }

    /* renamed from: g */
    public C12959a mo39840c() {
        return (C12959a) this.f32125e;
    }

    /* renamed from: h */
    public final void mo39842h(C12959a aVar) {
        boolean z;
        C12959a g = mo39840c();
        System.currentTimeMillis();
        if (g != null) {
            z = g.f32100f;
        } else {
            z = false;
        }
        aVar.f32100f = z;
        mo39855e(aVar);
    }

    /* renamed from: i */
    public abstract void mo39843i(MapPos mapPos, float f);
}
