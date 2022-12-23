package oa0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.components.Envelope;
import com.nutiteq.components.MapPos;
import java.util.ArrayList;
import java.util.Iterator;
import na0.C12929g;
import oa0.C12974i;
import qa0.C13044b;
import ua0.C13155h;
import v20.C20082a;

/* renamed from: oa0.c */
public final class C12961c extends C12960b {

    /* renamed from: g */
    public ArrayList f32101g;

    /* renamed from: oa0.c$a */
    public static class C12962a {

        /* renamed from: a */
        public final double f32102a;

        /* renamed from: b */
        public final double f32103b;

        /* renamed from: c */
        public final double f32104c;

        /* renamed from: d */
        public final double f32105d;

        /* renamed from: e */
        public final float f32106e;

        public C12962a(MapPos mapPos, MapPos mapPos2) {
            this.f32102a = mapPos.f24175b;
            this.f32103b = mapPos.f24176c;
            this.f32104c = mapPos2.f24175b;
            this.f32105d = mapPos2.f24176c;
            if (!mapPos.equals(mapPos2)) {
                this.f32106e = (((float) Math.atan2(mapPos2.f24176c - mapPos.f24176c, mapPos2.f24175b - mapPos.f24175b)) * 57.29578f) - 90.0f;
            } else {
                this.f32106e = BitmapDescriptorFactory.HUE_RED;
            }
        }
    }

    /* renamed from: oa0.c$b */
    public static class C12963b extends C12974i.C12975a {

        /* renamed from: d */
        public final double f32107d;

        /* renamed from: e */
        public final double f32108e;

        /* renamed from: f */
        public final ArrayList<C12962a> f32109f;

        public C12963b(MapPos mapPos, ArrayList<C12962a> arrayList, Envelope envelope) {
            super(envelope);
            this.f32107d = mapPos.f24175b;
            this.f32108e = mapPos.f24176c;
            this.f32109f = arrayList;
        }
    }

    public C12961c(ArrayList arrayList, C13155h hVar, C20082a.C20088f fVar) {
        super(hVar, fVar);
        if (arrayList.size() >= 2) {
            this.f32101g = new ArrayList(arrayList);
            return;
        }
        throw new RuntimeException("Line requires at least 2 vertices!");
    }

    /* renamed from: a */
    public final MapPos mo39839a(MapPos mapPos) {
        MapPos mapPos2 = mapPos;
        C12963b bVar = (C12963b) this.f32125e;
        if (bVar == null) {
            return null;
        }
        if (mapPos2 == null) {
            return new MapPos(bVar.f32107d, bVar.f32108e);
        }
        float f = Float.MAX_VALUE;
        Iterator<C12962a> it = bVar.f32109f.iterator();
        C12962a aVar = null;
        while (it.hasNext()) {
            C12962a next = it.next();
            double d = next.f32102a;
            double d2 = next.f32103b;
            double d3 = next.f32104c;
            double d4 = next.f32105d;
            float f2 = f;
            double d5 = mapPos2.f24175b;
            Iterator<C12962a> it2 = it;
            double d6 = mapPos2.f24176c;
            double d7 = d3 - d;
            double d8 = d4 - d2;
            double d9 = (((d6 - d2) * d8) + ((d5 - d) * d7)) / ((d8 * d8) + (d7 * d7));
            double d11 = d5 - ((double) ((float) ((d7 * d9) + d)));
            double d12 = d6 - ((double) ((float) ((d8 * d9) + d2)));
            float f3 = (float) ((d12 * d12) + (d11 * d11));
            if (f3 < f2) {
                f = f3;
                aVar = next;
            } else {
                f = f2;
            }
            it = it2;
        }
        if (aVar == null) {
            return null;
        }
        double d13 = aVar.f32102a;
        double d14 = aVar.f32103b;
        double d15 = aVar.f32104c;
        double d16 = aVar.f32105d;
        double d17 = d15 - d13;
        double d18 = d16 - d14;
        double d19 = (((mapPos2.f24176c - d14) * d18) + ((mapPos2.f24175b - d13) * d17)) / ((d18 * d18) + (d17 * d17));
        return new MapPos((d17 * d19) + d13, (d18 * d19) + d14);
    }

    /* renamed from: b */
    public final void mo39846b() {
        double d;
        double d2;
        double d3;
        C13044b bVar = this.f32123c.f32170a;
        Iterator it = this.f32101g.iterator();
        MapPos mapPos = null;
        double d4 = 0.0d;
        while (it.hasNext()) {
            MapPos mapPos2 = (MapPos) it.next();
            if (mapPos != null) {
                d4 += Math.hypot(mapPos2.f24175b - mapPos.f24175b, mapPos2.f24176c - mapPos.f24176c);
            }
            mapPos = mapPos2;
        }
        Iterator it2 = this.f32101g.iterator();
        MapPos mapPos3 = null;
        double d5 = 0.0d;
        while (true) {
            if (!it2.hasNext()) {
                d = 0.0d;
                d2 = 0.0d;
                break;
            }
            MapPos mapPos4 = (MapPos) it2.next();
            if (mapPos3 != null) {
                double d6 = mapPos4.f24175b - mapPos3.f24175b;
                double d7 = mapPos4.f24176c - mapPos3.f24176c;
                double hypot = Math.hypot(d6, d7);
                double d8 = d5 + hypot;
                double d9 = 0.5d * d4;
                if (d8 >= d9) {
                    if (hypot > 0.0d) {
                        d3 = (d9 - d5) / hypot;
                    } else {
                        d3 = 0.0d;
                    }
                    double d11 = mapPos3.f24175b + (d6 * d3);
                    d = (d7 * d3) + mapPos3.f24176c;
                    d2 = d11;
                } else {
                    d5 = d8;
                }
            }
            mapPos3 = mapPos4;
        }
        MapPos c = bVar.mo39930c(d2, d);
        ArrayList arrayList = new ArrayList(this.f32101g.size());
        C12929g gVar = new C12929g();
        Iterator it3 = this.f32101g.iterator();
        MapPos mapPos5 = null;
        while (it3.hasNext()) {
            MapPos mapPos6 = (MapPos) it3.next();
            MapPos c2 = bVar.mo39930c(mapPos6.f24175b, mapPos6.f24176c);
            gVar.mo39794a(c2.f24175b, c2.f24176c);
            if (mapPos5 != null) {
                arrayList.add(new C12962a(mapPos5, c2));
            }
            mapPos5 = c2;
        }
        mo39855e(new C12963b(c, arrayList, new Envelope(gVar)));
    }

    /* renamed from: c */
    public final C12974i.C12975a mo39840c() {
        return (C12963b) this.f32125e;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Line [mapPoses=");
        k.append(this.f32101g);
        k.append("]");
        return k.toString();
    }
}
