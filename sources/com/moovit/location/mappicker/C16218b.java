package com.moovit.location.mappicker;

import b00.C13557b;
import c70.C13752e;
import ce0.C21100e;
import com.moovit.MoovitApplication;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.map.MapFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import k20.C17997a;
import p646lz.C18299a;

/* renamed from: com.moovit.location.mappicker.b */
public abstract class C16218b extends C13557b<Void, Void, Collection<MarkerProvider.C16214a>> {

    /* renamed from: b */
    public final C13752e f42313b;

    /* renamed from: c */
    public final List<MarkerProvider> f42314c;

    public C16218b(C13752e eVar, ArrayList arrayList) {
        C21100e.m49373x(eVar, "requestContext");
        this.f42313b = eVar;
        this.f42314c = arrayList;
    }

    public final Object doInBackground(Object[] objArr) {
        Collection collection;
        Void[] voidArr = (Void[]) objArr;
        C18299a aVar = MoovitApplication.f37317k.f37321e;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MarkerProvider next : this.f42314c) {
            if (isCancelled()) {
                return null;
            }
            try {
                collection = next.mo23914x1(aVar, this.f42313b);
            } catch (Exception unused) {
                next.getClass();
                collection = Collections.emptySet();
            }
            linkedHashSet.addAll(collection);
        }
        return linkedHashSet;
    }

    public final void onPostExecute(Object obj) {
        Collection collection = (Collection) obj;
        if (!isCancelled() && collection != null) {
            MapLocationPickerActivity mapLocationPickerActivity = ((C16217a) this).f42312d;
            int i = MapLocationPickerActivity.f42272q0;
            MapFragment B2 = mapLocationPickerActivity.mo48574B2();
            B2.mo48656t2(new C17997a(mapLocationPickerActivity, collection, B2));
        }
    }
}
