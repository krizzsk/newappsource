package p386bi;

import android.view.View;
import android.view.ViewParent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p361ai.C13465a;
import p386bi.C13627a;
import p407ci.C13836a;
import p487fi.C17019b;

/* renamed from: bi.b */
public final class C13629b implements C13627a {

    /* renamed from: a */
    public final C13627a f33595a;

    public C13629b(C13630c cVar) {
        this.f33595a = cVar;
    }

    /* renamed from: a */
    public final JSONObject mo40519a(View view) {
        return C13836a.m34518a(0, 0, 0, 0);
    }

    /* renamed from: a */
    public final void mo40520a(View view, JSONObject jSONObject, C13627a.C13628a aVar, boolean z) {
        View rootView;
        ArrayList arrayList = new ArrayList();
        C13465a aVar2 = C13465a.f33332c;
        if (aVar2 != null) {
            Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(aVar2.f33334b);
            IdentityHashMap identityHashMap = new IdentityHashMap((unmodifiableCollection.size() * 2) + 3);
            for (T t : unmodifiableCollection) {
                View view2 = (View) t.f52593d.get();
                if (view2 != null) {
                    boolean z2 = false;
                    if (view2.isAttachedToWindow() && view2.isShown()) {
                        View view3 = view2;
                        while (true) {
                            if (view3 == null) {
                                z2 = true;
                                break;
                            } else if (view3.getAlpha() == BitmapDescriptorFactory.HUE_RED) {
                                break;
                            } else {
                                ViewParent parent = view3.getParent();
                                view3 = parent instanceof View ? (View) parent : null;
                            }
                        }
                    }
                    if (z2 && (rootView = view2.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                        identityHashMap.put(rootView, rootView);
                        float z3 = rootView.getZ();
                        int size = arrayList.size();
                        while (size > 0) {
                            int i = size - 1;
                            if (((View) arrayList.get(i)).getZ() <= z3) {
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
            ((C17019b) aVar).mo49639b((View) it.next(), this.f33595a, jSONObject);
        }
    }
}
