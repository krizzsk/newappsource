package com.moovit.map;

import c00.C13717b;
import com.moovit.map.MapFragment;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import o20.C18696b;
import o20.C18713s;
import p115i0.C5227c;

/* renamed from: com.moovit.map.f */
public final class C16276f extends MapFragment.C16227i {

    /* renamed from: e */
    public final /* synthetic */ C18696b f42531e;

    /* renamed from: f */
    public final /* synthetic */ MapFragment.C16229j f42532f;

    /* renamed from: g */
    public final /* synthetic */ MapFragment f42533g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16276f(MapFragment mapFragment, C18713s sVar, boolean z, C18696b bVar, MapFragment.C16229j jVar) {
        super(Collections.singletonList(sVar), z);
        this.f42533g = mapFragment;
        this.f42531e = bVar;
        this.f42532f = jVar;
    }

    /* renamed from: a */
    public final void mo48678a(List<C18713s> list, List<C18713s> list2) {
        MapFragment mapFragment = this.f42533g;
        C18696b bVar = this.f42531e;
        C5227c cVar = MapFragment.f42333I0;
        Set set = (Set) mapFragment.f42392z.get(bVar);
        if (set != null) {
            set.remove(this);
        }
        C18713s sVar = (C18713s) C13717b.m34256c(list);
        if (sVar != null) {
            MapFragment mapFragment2 = this.f42533g;
            MapFragment.C16229j jVar = this.f42532f;
            C18696b bVar2 = this.f42531e;
            mapFragment2.getClass();
            Object d = bVar2.mo51066d(sVar);
            jVar.f42419a = d;
            jVar.f42420b = null;
            if (!jVar.f42421c) {
                bVar2.mo51064c(d);
            }
        }
    }
}
