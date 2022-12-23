package p768rh;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p746qh.C19120a;
import p768rh.C19273a;
import p792sh.C19461a;
import p864vh.C20134b;

/* renamed from: rh.b */
public final class C19275b implements C19273a {

    /* renamed from: a */
    public final C19273a f48990a;

    public C19275b(C19276c cVar) {
        this.f48990a = cVar;
    }

    /* renamed from: a */
    public final JSONObject mo51688a(View view) {
        return C19461a.m46859a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo51689a(View view, JSONObject jSONObject, C19273a.C19274a aVar, boolean z, boolean z2) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C19120a aVar2 = C19120a.f48607c;
        if (aVar2 != null) {
            Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(aVar2.f48609b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (T t : unmodifiableCollection) {
                View view2 = (View) t.f47713d.get();
                if (view2 != null) {
                    boolean z3 = false;
                    if (view2.isAttachedToWindow() && view2.isShown()) {
                        View view3 = view2;
                        while (true) {
                            if (view3 == null) {
                                z3 = true;
                                break;
                            } else if (view3.getAlpha() == BitmapDescriptorFactory.HUE_RED) {
                                break;
                            } else {
                                ViewParent parent = view3.getParent();
                                view3 = parent instanceof View ? (View) parent : null;
                            }
                        }
                    }
                    if (z3 && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float z4 = rootView.getZ();
                        int size = arrayList.size();
                        while (size > 0) {
                            int i = size - 1;
                            if (((View) arrayList.get(i)).getZ() <= z4) {
                                break;
                            }
                            size = i;
                        }
                        arrayList.add(size, rootView);
                    }
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C20134b) aVar).mo52379b((View) it.next(), this.f48990a, jSONObject, z2);
        }
    }
}
