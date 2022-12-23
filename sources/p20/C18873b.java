package p20;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseArray;
import b00.C13557b;
import com.moovit.image.model.ImageRef;
import com.moovit.map.MapFragment;
import java.util.Collection;
import java.util.HashSet;
import p20.C18874c;

/* renamed from: p20.b */
public final class C18873b extends C13557b<Void, Void, SparseArray<? extends Collection<? extends C18880g>>> {

    /* renamed from: b */
    public final /* synthetic */ Collection f48042b;

    /* renamed from: c */
    public final /* synthetic */ Context f48043c;

    /* renamed from: d */
    public final /* synthetic */ C18874c.C18876b f48044d;

    /* renamed from: e */
    public final /* synthetic */ int f48045e;

    /* renamed from: f */
    public final /* synthetic */ int f48046f;

    /* renamed from: g */
    public final /* synthetic */ ImageRef f48047g;

    /* renamed from: h */
    public final /* synthetic */ C18874c.C18875a f48048h;

    public C18873b(int i, int i2, Context context, ImageRef imageRef, C18874c.C18875a aVar, C18874c.C18876b bVar, Collection collection) {
        this.f48042b = collection;
        this.f48043c = context;
        this.f48044d = bVar;
        this.f48045e = i;
        this.f48046f = i2;
        this.f48047g = imageRef;
        this.f48048h = aVar;
    }

    public final Object doInBackground(Object[] objArr) {
        Void[] voidArr = (Void[]) objArr;
        this.f48042b.size();
        SystemClock.elapsedRealtime();
        try {
            return C18874c.m45902a(this.f48043c, this.f48042b, this.f48044d, this.f48045e, this.f48046f, this.f48047g);
        } finally {
            SystemClock.elapsedRealtime();
        }
    }

    public final void onPostExecute(Object obj) {
        SparseArray sparseArray = (SparseArray) obj;
        MapFragment.C16224f fVar = (MapFragment.C16224f) this.f48048h;
        fVar.f42403g.f33501b.remove(this);
        Context context = MapFragment.this.getContext();
        if (context != null) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < sparseArray.size(); i++) {
                hashSet.addAll((Collection) sparseArray.valueAt(i));
            }
            MapFragment.C16225g gVar = new MapFragment.C16225g(context, fVar, hashSet, sparseArray);
            gVar.mo48196g();
            fVar.f42404h.f33501b.add(gVar);
        }
    }
}
