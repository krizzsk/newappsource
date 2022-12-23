package s20;

import ce0.C21100e;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.moovit.map.C16273d;
import java.util.ArrayList;
import java.util.Iterator;
import o20.C18706l;
import s20.C19406f;
import s20.C19417l;
import s20.C19418m;

/* renamed from: s20.m */
public abstract class C19418m<GO extends C19418m<GO, O, MEZS, T, ?, GT>, O, MEZS extends C16273d, T extends C18706l<?, MEZS>, GIL extends C19406f<GO, O, MEZS, T, GT>, GT extends C19417l<T, O, MEZS>> {

    /* renamed from: a */
    public final ArrayList<OnMapReadyCallback> f49425a = new ArrayList<>();

    /* renamed from: b */
    public final ArrayList<C19406f<GO, O, MEZS, T, GT>> f49426b = new ArrayList<>();

    /* renamed from: c */
    public GoogleMap f49427c = null;

    /* renamed from: a */
    public abstract O mo51808a(GoogleMap googleMap, GT gt, MEZS mezs, int i);

    /* renamed from: b */
    public abstract GIL mo51809b(int i);

    /* renamed from: c */
    public final GIL mo51838c(int i) {
        GIL b = mo51809b(i);
        this.f49426b.add(b);
        return b;
    }

    /* renamed from: d */
    public final void mo51839d() {
        for (int i = 0; i < this.f49426b.size(); i++) {
            C19406f fVar = this.f49426b.get(i);
            GO go = fVar.f49360a;
            C19404d dVar = new C19404d(fVar);
            go.getClass();
            C21100e.m49369v(1);
            GoogleMap googleMap = go.f49427c;
            if (googleMap != null) {
                dVar.onMapReady(googleMap);
            } else {
                go.f49425a.add(dVar);
            }
        }
    }

    /* renamed from: e */
    public abstract void mo51810e(O o);

    /* renamed from: f */
    public final void mo51840f(GoogleMap googleMap) {
        C21100e.m49369v(1);
        C21100e.m49373x(googleMap, "map");
        this.f49427c = googleMap;
        Iterator<OnMapReadyCallback> it = this.f49425a.iterator();
        while (it.hasNext()) {
            it.next().onMapReady(googleMap);
        }
        this.f49425a.clear();
        this.f49425a.trimToSize();
    }

    /* renamed from: g */
    public abstract void mo51811g(O o, GT gt);
}
