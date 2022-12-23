package sa0;

import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.nutiteq.components.MapPos;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: sa0.a */
public final class C13089a {

    /* renamed from: c */
    public static final AccelerateDecelerateInterpolator f32375c = new AccelerateDecelerateInterpolator();

    /* renamed from: a */
    public final LinkedList f32376a = new LinkedList();

    /* renamed from: b */
    public final C13097f f32377b;

    public C13089a(C13097f fVar) {
        this.f32377b = fVar;
    }

    /* renamed from: a */
    public final synchronized void mo39951a(int i, int i2, float f, Interpolator interpolator) {
        if (interpolator == null) {
            interpolator = f32375c;
        }
        C13090a aVar = new C13090a(i, i2, f, interpolator);
        ListIterator listIterator = this.f32376a.listIterator();
        while (listIterator.hasNext()) {
            if (i == ((C13090a) listIterator.next()).f32378a) {
                aVar = new C13090a(i, i2, f, interpolator);
                listIterator.remove();
            }
        }
        this.f32376a.add(aVar);
        ((C13096e) this.f32377b).mo39976m();
    }

    /* renamed from: b */
    public final synchronized boolean mo39952b(int i) {
        for (C13090a aVar : this.f32376a) {
            if (aVar.f32378a == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final synchronized void mo39953c(int i) {
        ListIterator listIterator = this.f32376a.listIterator();
        while (listIterator.hasNext()) {
            if (i == ((C13090a) listIterator.next()).f32378a) {
                listIterator.remove();
            }
        }
    }

    /* renamed from: sa0.a$a */
    public class C13090a {

        /* renamed from: a */
        public final int f32378a;

        /* renamed from: b */
        public final long f32379b;

        /* renamed from: c */
        public final long f32380c;

        /* renamed from: d */
        public final float f32381d;

        /* renamed from: e */
        public final float f32382e;

        /* renamed from: f */
        public final MapPos f32383f;

        /* renamed from: g */
        public final MapPos f32384g;

        /* renamed from: h */
        public final Interpolator f32385h;

        public C13090a(int i, int i2, float f, Interpolator interpolator) {
            float f2;
            if (i != 1) {
                f2 = i != 2 ? i != 3 ? BitmapDescriptorFactory.HUE_RED : 90.0f - ((C13096e) C13089a.this.f32377b).f32471x : ((C13096e) C13089a.this.f32377b).f32473y;
            } else {
                f2 = ((((C13096e) C13089a.this.f32377b).f32469w % 360.0f) + 360.0f) % 360.0f;
                f = ((f % 360.0f) + 360.0f) % 360.0f;
                if (Math.abs(f - f2) > 180.0f) {
                    f2 = f > f2 ? f2 + 360.0f : f2 - 360.0f;
                }
            }
            this.f32378a = i;
            long currentTimeMillis = System.currentTimeMillis();
            this.f32379b = currentTimeMillis;
            this.f32380c = currentTimeMillis + ((long) i2);
            this.f32381d = f2;
            this.f32382e = f;
            this.f32383f = null;
            this.f32384g = null;
            this.f32385h = interpolator;
        }

        /* renamed from: a */
        public final void mo39954a(float f) {
            int i = this.f32378a;
            if (i == 0) {
                MapPos mapPos = this.f32383f;
                double d = mapPos.f24175b;
                MapPos mapPos2 = this.f32384g;
                double d2 = (double) f;
                double d3 = mapPos.f24176c;
                double c = C16530d.m42010c(mapPos2.f24176c, d3, d2, d3);
                ((C13096e) C13089a.this.f32377b).mo39990z(((mapPos2.f24175b - d) * d2) + d, c);
            } else if (i == 1) {
                C13097f fVar = C13089a.this.f32377b;
                float f2 = this.f32381d;
                ((C13096e) fVar).mo39960B(C16759e.m42347c(this.f32382e, f2, f, f2));
            } else if (i == 2) {
                C13097f fVar2 = C13089a.this.f32377b;
                float f3 = this.f32381d;
                ((C13096e) fVar2).mo39962D(C16759e.m42347c(this.f32382e, f3, f, f3));
            } else if (i == 3) {
                C13097f fVar3 = C13089a.this.f32377b;
                float f4 = this.f32381d;
                ((C13096e) fVar3).mo39961C(C16759e.m42347c(this.f32382e, f4, f, f4));
            }
        }

        public C13090a(int i, MapPos mapPos, Interpolator interpolator) {
            MapPos g = ((C13096e) C13089a.this.f32377b).mo39970g();
            this.f32378a = 0;
            long currentTimeMillis = System.currentTimeMillis();
            this.f32379b = currentTimeMillis;
            this.f32380c = currentTimeMillis + ((long) i);
            this.f32381d = BitmapDescriptorFactory.HUE_RED;
            this.f32382e = BitmapDescriptorFactory.HUE_RED;
            this.f32383f = g;
            this.f32384g = mapPos;
            this.f32385h = interpolator;
        }
    }
}
