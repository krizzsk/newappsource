package com.moovit.map;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.image.C16019d;
import com.moovit.image.model.ResourceImage;
import com.moovit.map.MapFragment;
import com.moovit.map.items.MapItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k00.C17988b;
import o20.C18696b;
import o20.C18699e;
import o20.C18713s;
import p824tp.C19739q;
import v10.C20065a;

/* renamed from: com.moovit.map.e */
public final class C16275e extends MapFragment.C16227i {

    /* renamed from: e */
    public final /* synthetic */ MapItem.Type f42528e;

    /* renamed from: f */
    public final /* synthetic */ Point f42529f;

    /* renamed from: g */
    public final /* synthetic */ MapFragment f42530g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16275e(MapFragment mapFragment, ArrayList arrayList, boolean z, MapItem.Type type, Point point) {
        super(arrayList, z);
        this.f42530g = mapFragment;
        this.f42528e = type;
        this.f42529f = point;
    }

    /* renamed from: a */
    public final void mo48678a(List<C18713s> list, List<C18713s> list2) {
        if (this.f42530g.mo48624U2()) {
            C18696b<C18713s> p = this.f42530g.f42368n.mo48808p();
            p.mo51067f(list);
            Context context = this.f42530g.getContext();
            MapItem.Type type = this.f42528e;
            if (type == MapItem.Type.STOP) {
                int i = C19739q.img_map_station_blank;
                C20065a aVar = new C20065a(C17988b.m44610a(i, context), C16019d.m40803a().f41716b.get(i));
                MarkerZoomStyle markerZoomStyle = new MarkerZoomStyle(new ResourceImage(i, new String[0]));
                markerZoomStyle.f42450d = aVar;
                SparseArray sparseArray = new SparseArray(1);
                sparseArray.append(1700, markerZoomStyle);
                C18699e a = C18699e.m45697a(sparseArray);
                for (C18713s sVar : list2) {
                    MapItem mapItem = (MapItem) sVar.f47612a;
                    p.mo51066d(new C18713s(mapItem, mapItem.f42551d, a, BitmapDescriptorFactory.HUE_RED));
                }
                Set set = (Set) this.f42530g.f42384v.get(this.f42528e);
                set.remove(this.f42529f);
                if (set.isEmpty()) {
                    Iterator it = this.f42530g.f42348H.iterator();
                    while (it.hasNext()) {
                        ((MapFragment.C16235p) it.next()).mo48683a();
                    }
                    return;
                }
                return;
            }
            throw new IllegalStateException("Unknown map item type: " + type);
        }
    }
}
