package p768rh;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p768rh.C19273a;
import p792sh.C19461a;
import p864vh.C20134b;

/* renamed from: rh.c */
public final class C19276c implements C19273a {

    /* renamed from: a */
    public final int[] f48991a = new int[2];

    /* renamed from: a */
    public final JSONObject mo51688a(View view) {
        if (view == null) {
            return C19461a.m46859a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f48991a);
        int[] iArr = this.f48991a;
        return C19461a.m46859a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public final void mo51689a(View view, JSONObject jSONObject, C19273a.C19274a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int i = 0;
            if (z) {
                HashMap hashMap = new HashMap();
                while (i < viewGroup.getChildCount()) {
                    View childAt = viewGroup.getChildAt(i);
                    ArrayList arrayList = (ArrayList) hashMap.get(Float.valueOf(childAt.getZ()));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        hashMap.put(Float.valueOf(childAt.getZ()), arrayList);
                    }
                    arrayList.add(childAt);
                    i++;
                }
                ArrayList arrayList2 = new ArrayList(hashMap.keySet());
                Collections.sort(arrayList2);
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Iterator it2 = ((ArrayList) hashMap.get((Float) it.next())).iterator();
                    while (it2.hasNext()) {
                        ((C20134b) aVar).mo52379b((View) it2.next(), this, jSONObject, z2);
                    }
                }
                return;
            }
            while (i < viewGroup.getChildCount()) {
                ((C20134b) aVar).mo52379b(viewGroup.getChildAt(i), this, jSONObject, z2);
                i++;
            }
        }
    }
}
