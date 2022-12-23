package k20;

import android.util.SparseArray;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.map.C16277g;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import o20.C18699e;
import p028ba.C1513g;

/* renamed from: k20.a */
public final /* synthetic */ class C17997a implements MapFragment.C16237r {

    /* renamed from: a */
    public final /* synthetic */ MapLocationPickerActivity f46080a;

    /* renamed from: b */
    public final /* synthetic */ Collection f46081b;

    /* renamed from: c */
    public final /* synthetic */ MapFragment f46082c;

    public /* synthetic */ C17997a(MapLocationPickerActivity mapLocationPickerActivity, Collection collection, MapFragment mapFragment) {
        this.f46080a = mapLocationPickerActivity;
        this.f46081b = collection;
        this.f46082c = mapFragment;
    }

    /* renamed from: a */
    public final void mo21406a() {
        ServerId serverId;
        MapLocationPickerActivity mapLocationPickerActivity = this.f46080a;
        Collection collection = this.f46081b;
        MapFragment mapFragment = this.f46082c;
        int i = MapLocationPickerActivity.f42272q0;
        mapLocationPickerActivity.getClass();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        Iterator it = collection.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            MarkerProvider.C16214a aVar = (MarkerProvider.C16214a) it.next();
            LatLonE6 d = aVar.f42305a.mo24310d();
            if (!hashSet2.contains(d)) {
                hashSet2.add(d);
                z = false;
            }
            if (!z) {
                LocationDescriptor locationDescriptor = aVar.f42305a;
                SparseArray<MarkerZoomStyle> sparseArray = aVar.f42306b;
                mapFragment.getClass();
                mapLocationPickerActivity.f42273U.put(aVar, mapFragment.mo48648p2(locationDescriptor, aVar, C18699e.m45697a(sparseArray)));
                C16277g gVar = mapLocationPickerActivity.f42276Z;
                if (gVar != null) {
                    gVar.f42540g.add(aVar.f42305a);
                }
                LocationDescriptor locationDescriptor2 = aVar.f42305a;
                if (locationDescriptor2.f23647b == LocationDescriptor.LocationType.STOP && (serverId = locationDescriptor2.f23649d) != null) {
                    hashSet.add(serverId);
                }
            }
        }
        if (!hashSet.isEmpty()) {
            MapFragment B2 = mapLocationPickerActivity.mo48574B2();
            C1513g gVar2 = new C1513g(hashSet, 11);
            if (gVar2 != B2.f42334A) {
                B2.f42334A = gVar2;
                B2.mo48633d3();
            }
        }
    }
}
