package p386bi;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
import p386bi.C13627a;
import p407ci.C13836a;
import p487fi.C17019b;

/* renamed from: bi.c */
public final class C13630c implements C13627a {

    /* renamed from: a */
    public final int[] f33596a = new int[2];

    /* renamed from: a */
    public final JSONObject mo40519a(View view) {
        if (view == null) {
            return C13836a.m34518a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f33596a);
        int[] iArr = this.f33596a;
        return C13836a.m34518a(iArr[0], iArr[1], width, height);
    }

    /* renamed from: a */
    public final void mo40520a(View view, JSONObject jSONObject, C13627a.C13628a aVar, boolean z) {
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
                        ((C17019b) aVar).mo49639b((View) it2.next(), this, jSONObject);
                    }
                }
                return;
            }
            while (i < viewGroup.getChildCount()) {
                ((C17019b) aVar).mo49639b(viewGroup.getChildAt(i), this, jSONObject);
                i++;
            }
        }
    }
}
