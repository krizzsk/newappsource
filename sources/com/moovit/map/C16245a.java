package com.moovit.map;

import android.graphics.Rect;
import android.view.animation.Interpolator;
import com.moovit.commons.geo.BoxE6;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import java.util.ArrayList;
import java.util.Iterator;
import p358af.C13437d;

/* renamed from: com.moovit.map.a */
public interface C16245a {

    /* renamed from: com.moovit.map.a$a */
    public static abstract class C16246a implements C16245a {

        /* renamed from: a */
        public final int f42454a;

        /* renamed from: b */
        public final Interpolator f42455b;

        public C16246a(int i, Interpolator interpolator) {
            this.f42454a = i;
            this.f42455b = interpolator;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("CameraUpdate[");
            k.append(mo48711a());
            k.append(" duration=");
            return C13437d.m33707l(k, this.f42454a, "ms.]");
        }
    }

    /* renamed from: com.moovit.map.a$b */
    public static class C16247b extends C16246a {

        /* renamed from: c */
        public final LatLonE6 f42456c;

        public C16247b(LatLonE6 latLonE6) {
            this(latLonE6, 0);
        }

        /* renamed from: a */
        public final String mo48711a() {
            StringBuilder k = C13555b.m33972k("center=");
            k.append(this.f42456c);
            return k.toString();
        }

        /* renamed from: b */
        public final <T> T mo48712b(C16252g<T> gVar) {
            return gVar.mo48717b(this);
        }

        public C16247b(LatLonE6 latLonE6, int i) {
            super(i, (Interpolator) null);
            this.f42456c = latLonE6;
        }
    }

    /* renamed from: com.moovit.map.a$c */
    public static class C16248c implements C16245a {

        /* renamed from: a */
        public int f42457a = -2;

        /* renamed from: b */
        public C16247b f42458b = null;

        /* renamed from: c */
        public C16253h f42459c = null;

        /* renamed from: a */
        public final String mo48711a() {
            StringBuilder sb = new StringBuilder();
            Iterator it = mo48714c().iterator();
            while (it.hasNext()) {
                sb.append(((C16245a) it.next()).mo48711a());
                sb.append(' ');
            }
            sb.setLength(sb.length() - 1);
            return sb.toString();
        }

        /* renamed from: b */
        public final <T> T mo48712b(C16252g<T> gVar) {
            return gVar.mo48719d(this);
        }

        /* renamed from: c */
        public final ArrayList mo48714c() {
            ArrayList arrayList = new ArrayList();
            C16247b bVar = this.f42458b;
            if (bVar != null) {
                arrayList.add(bVar);
            }
            C16253h hVar = this.f42459c;
            if (hVar != null) {
                arrayList.add(hVar);
            }
            return arrayList;
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("CameraUpdate[");
            k.append(mo48711a());
            k.append(" duration=");
            return C13437d.m33707l(k, this.f42457a, "ms.]");
        }
    }

    /* renamed from: com.moovit.map.a$d */
    public static class C16249d implements MapFragment.C16223e {

        /* renamed from: a */
        public final int f42460a;

        public C16249d(int i) {
            this.f42460a = i;
        }

        /* renamed from: a */
        public final int mo48672a() {
            return this.f42460a;
        }

        /* renamed from: b */
        public final int mo48673b(LatLonE6 latLonE6, LatLonE6 latLonE62, float f, float f2) {
            return this.f42460a;
        }
    }

    /* renamed from: com.moovit.map.a$e */
    public static class C16250e extends C16246a {

        /* renamed from: c */
        public final float f42461c;

        public C16250e(float f, int i, Interpolator interpolator) {
            super(i, interpolator);
            this.f42461c = f;
        }

        /* renamed from: a */
        public final String mo48711a() {
            StringBuilder k = C13555b.m33972k("rotation=");
            k.append(this.f42461c);
            return k.toString();
        }

        /* renamed from: b */
        public final <T> T mo48712b(C16252g<T> gVar) {
            return gVar.mo48720e(this);
        }
    }

    /* renamed from: com.moovit.map.a$f */
    public static class C16251f implements C16245a {

        /* renamed from: a */
        public final BoxE6 f42462a;

        /* renamed from: b */
        public final Rect f42463b;

        /* renamed from: c */
        public final MapFragment.C16223e f42464c;

        public C16251f(MapFragment mapFragment, BoxE6 boxE6, Rect rect, MapFragment.C16223e eVar) {
            Rect rect2 = new Rect();
            rect2.set(mapFragment.f42369n0);
            rect2.left += rect.left;
            rect2.top += rect.top;
            rect2.bottom += rect.bottom;
            rect2.right += rect.right;
            this.f42462a = boxE6;
            this.f42463b = rect2;
            this.f42464c = eVar;
        }

        /* renamed from: a */
        public final String mo48711a() {
            StringBuilder k = C13555b.m33972k("bounds=");
            k.append(this.f42462a);
            k.append(" padding=");
            k.append(this.f42463b);
            return k.toString();
        }

        /* renamed from: b */
        public final <T> T mo48712b(C16252g<T> gVar) {
            return gVar.mo48718c(this);
        }
    }

    /* renamed from: com.moovit.map.a$g */
    public interface C16252g<T> {
        /* renamed from: a */
        T mo48716a(C16253h hVar);

        /* renamed from: b */
        T mo48717b(C16247b bVar);

        /* renamed from: c */
        T mo48718c(C16251f fVar);

        /* renamed from: d */
        T mo48719d(C16248c cVar);

        /* renamed from: e */
        T mo48720e(C16250e eVar);
    }

    /* renamed from: com.moovit.map.a$h */
    public static class C16253h extends C16246a {

        /* renamed from: c */
        public final float f42465c;

        public C16253h(float f) {
            super(0, (Interpolator) null);
            this.f42465c = f;
        }

        /* renamed from: a */
        public final String mo48711a() {
            StringBuilder k = C13555b.m33972k("zoom=");
            k.append(this.f42465c);
            return k.toString();
        }

        /* renamed from: b */
        public final <T> T mo48712b(C16252g<T> gVar) {
            return gVar.mo48716a(this);
        }
    }

    /* renamed from: a */
    String mo48711a();

    /* renamed from: b */
    <T> T mo48712b(C16252g<T> gVar);
}
