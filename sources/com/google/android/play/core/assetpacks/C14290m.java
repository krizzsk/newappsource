package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p554id.C17573l;
import p584jl.C17885a;

/* renamed from: com.google.android.play.core.assetpacks.m */
public final class C14290m extends C14278j {

    /* renamed from: d */
    public final /* synthetic */ C14310r f35948d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14290m(C14310r rVar, C17573l lVar) {
        super(rVar, lVar);
        this.f35948d = rVar;
    }

    /* renamed from: A */
    public final void mo42843A(ArrayList arrayList) {
        super.mo42843A(arrayList);
        C14310r rVar = this.f35948d;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle = (Bundle) it.next();
            C14335x0 x0Var = rVar.f36010b;
            C14245a2 a2Var = rVar.f36011c;
            ArrayList arrayList3 = new ArrayList();
            C17885a aVar = C17885a.f45883e;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
            HashMap hashMap = new HashMap();
            int size = stringArrayList.size();
            boolean z = false;
            for (int i = 0; i < size; i++) {
                String str = stringArrayList.get(i);
                hashMap.put(str, AssetPackState.m35444i(bundle, str, x0Var, a2Var, aVar));
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                hashMap.put(str2, AssetPackState.m35443h(str2, 4, 0, 0, 0, 0.0d, 1, "", ""));
            }
            AssetPackState assetPackState = (AssetPackState) new C14267g0(bundle.getLong("total_bytes_to_download"), hashMap).f35872b.values().iterator().next();
            if (assetPackState == null) {
                C14310r.f36007g.mo975b("onGetSessionStates: Bundle contained no pack.", new Object[0]);
            }
            int d = assetPackState.mo42777d();
            if (d == 1 || d == 7 || d == 2 || d == 3) {
                z = true;
            }
            if (z) {
                arrayList2.add(assetPackState.mo42776c());
            }
        }
        this.f35916b.mo50025b(arrayList2);
    }
}
