package v20;

import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import com.moovit.commons.geo.LatLonE6;
import com.nutiteq.components.MapPos;
import na0.C12925d;
import o20.C18706l;
import o20.C18711q;
import o20.C18713s;
import oa0.C12964d;
import oa0.C12974i;
import p072e6.C4565c;
import pa0.C12998a;
import qa0.C13043a;
import ua0.C13144b;
import v20.C20082a;
import xa0.C13250f;
import za0.C13356c;
import za0.C13361f;

/* renamed from: v20.d */
public final class C20098d extends C20091b<C12964d, C13356c, C18713s> implements C18711q {
    public C20098d(C13043a aVar, C20082a aVar2) {
        super(C12964d.class, aVar, aVar2);
    }

    /* renamed from: e */
    public final LatLonE6 mo51076e(Object obj) {
        return (LatLonE6) this.f50957b.f50947c.convert(((C12964d) mo52339j(obj)).f32096g);
    }

    /* renamed from: g */
    public final void mo51077g(Object obj, LatLonE6 latLonE6) {
        C12964d dVar = (C12964d) mo52339j(obj);
        MapPos mapPos = (MapPos) this.f50957b.f50946b.convert(latLonE6);
        if (!mapPos.equals(dVar.f32096g)) {
            dVar.f32096g = mapPos;
            C13361f<?> fVar = dVar.f32123c;
            if (fVar != null) {
                fVar.mo40238e(dVar);
            }
        }
    }

    /* renamed from: h */
    public final C12974i mo52337h(C20082a aVar, C18706l lVar) {
        C13250f fVar;
        View d;
        C18713s sVar = (C18713s) lVar;
        MapPos mapPos = (MapPos) aVar.f50946b.convert((LatLonE6) sVar.f47613b);
        Object obj = sVar.f47612a;
        C4565c cVar = aVar.f50945a.f50962D;
        if (cVar == null || (d = cVar.mo20080d(obj)) == null) {
            fVar = null;
        } else {
            Rect R2 = aVar.f50945a.f50967d.mo48621R2();
            d.measure(View.MeasureSpec.makeMeasureSpec(R2.width(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(R2.height(), Integer.MIN_VALUE));
            d.layout(0, 0, d.getMeasuredWidth(), d.getMeasuredHeight());
            C20092c cVar2 = aVar.f50945a;
            C13250f fVar2 = new C13250f(d, cVar2.f50961C, C13144b.f32650l, cVar2.f50963E);
            fVar2.f32891o = cVar.mo20081e();
            fVar = fVar2;
        }
        SparseArray c = C20082a.m47597c(sVar.f47614c);
        C12964d dVar = new C12964d(mapPos, aVar.mo52332a(c, false), fVar, new C20082a.C20088f(sVar.f47612a, c));
        int i = -((LatLonE6) sVar.f47613b).f40980b;
        if (i != dVar.f32110i) {
            dVar.f32110i = i;
            C13361f<?> fVar3 = dVar.f32123c;
            if (fVar3 != null) {
                fVar3.mo40238e(dVar);
            }
        }
        float f = -sVar.f47625d;
        if (f != dVar.f32097h) {
            dVar.f32097h = f;
            C13361f<?> fVar4 = dVar.f32123c;
            if (fVar4 != null) {
                fVar4.mo40238e(dVar);
            }
        }
        return dVar;
    }

    /* renamed from: i */
    public final C12998a mo52338i(C13043a aVar) {
        C13356c cVar = new C13356c(aVar);
        cVar.f33139g = false;
        C12925d dVar = cVar.f32172c;
        if (dVar != null) {
            dVar.f32012j.mo39976m();
        }
        return cVar;
    }
}
