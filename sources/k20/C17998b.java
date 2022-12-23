package k20;

import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.location.mappicker.MapLocationPickerActivity;
import com.moovit.location.mappicker.MarkerProvider;
import com.moovit.map.items.MapItem;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.transit.TransitStop;
import i30.C5267c;
import i30.C5271f;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

/* renamed from: k20.b */
public final class C17998b extends C20438i<C5267c, C5271f> {

    /* renamed from: b */
    public final /* synthetic */ LocationDescriptor f46083b;

    /* renamed from: c */
    public final /* synthetic */ MapItem f46084c;

    /* renamed from: d */
    public final /* synthetic */ MapLocationPickerActivity f46085d;

    public C17998b(MapLocationPickerActivity mapLocationPickerActivity, MapItem mapItem, LocationDescriptor locationDescriptor) {
        this.f46085d = mapLocationPickerActivity;
        this.f46083b = locationDescriptor;
        this.f46084c = mapItem;
    }

    /* renamed from: a */
    public final void mo313a(C20431c cVar, boolean z) {
        C5267c cVar2 = (C5267c) cVar;
        this.f46085d.f42278m0 = null;
    }

    /* renamed from: k */
    public final void mo21408k(C20431c cVar, C20436g gVar) {
        C5267c cVar2 = (C5267c) cVar;
        C5271f fVar = (C5271f) gVar;
        if (((LocationDescriptor) this.f46085d.f42275Y.getTag()) == this.f46083b) {
            MapLocationPickerActivity mapLocationPickerActivity = this.f46085d;
            MapItem mapItem = this.f46084c;
            LocationDescriptor c = LocationDescriptor.m17769c((TransitStop) fVar.f17402n);
            mapLocationPickerActivity.getClass();
            ServerId serverId = mapItem.f42550c;
            mapLocationPickerActivity.f42281p0.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, "stop_map_icon_clicked");
            mapLocationPickerActivity.mo48578F2((MarkerProvider.C16214a) null);
            mapLocationPickerActivity.mo48575C2(c);
        }
    }

    /* renamed from: w */
    public final boolean mo21415w(C20431c cVar, Exception exc) {
        C5267c cVar2 = (C5267c) cVar;
        LocationDescriptor locationDescriptor = (LocationDescriptor) this.f46085d.f42275Y.getTag();
        LocationDescriptor locationDescriptor2 = this.f46083b;
        if (locationDescriptor != locationDescriptor2) {
            return true;
        }
        MapLocationPickerActivity mapLocationPickerActivity = this.f46085d;
        MapItem mapItem = this.f46084c;
        mapLocationPickerActivity.getClass();
        ServerId serverId = mapItem.f42550c;
        mapLocationPickerActivity.f42281p0.mo49939g(AnalyticsAttributeKey.ADDRESS_TYPE, "stop_map_icon_clicked");
        mapLocationPickerActivity.mo48578F2((MarkerProvider.C16214a) null);
        mapLocationPickerActivity.mo48575C2(locationDescriptor2);
        return true;
    }
}
