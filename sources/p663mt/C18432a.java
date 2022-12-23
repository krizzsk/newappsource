package p663mt;

import android.os.Bundle;
import ce0.C21100e;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.C15676b;
import com.moovit.C15682c;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.ads.mapitem.MapItemAdBottomSheetDialog;
import com.moovit.app.map.DocklessVehicleBottomSheetDialog;
import com.moovit.app.stopdetail.StopDetailActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.map.MapFragment;
import com.moovit.map.collections.category.types.BicycleStationMetadata;
import com.moovit.map.collections.category.types.CarSharingMetadata;
import com.moovit.map.collections.category.types.CommercialMetadata;
import com.moovit.map.collections.category.types.DirectAdMetadata;
import com.moovit.map.collections.category.types.DocklessBicycleMetadata;
import com.moovit.map.collections.category.types.DocklessCarMetadata;
import com.moovit.map.collections.category.types.DocklessMopedMetadata;
import com.moovit.map.collections.category.types.DocklessScooterMetadata;
import com.moovit.map.items.MapItem;
import com.moovit.micromobility.MicroMobilityMetaData;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import java.util.List;
import mf0.C24362h;
import p20.C18880g;
import p504fz.C17131c;
import p543hq.C17474b;
import p552hz.C17520c;
import p598jz.C17983c;
import q20.C19075a;
import s30.C6452b;

/* renamed from: mt.a */
public class C18432a implements MapFragment.C16233n, MapFragment.C16239t {

    /* renamed from: b */
    public final C15682c<?> f46992b;

    public C18432a(C15682c<?> cVar, MapFragment mapFragment) {
        C21100e.m49373x(cVar, "fragment");
        this.f46992b = cVar;
        C21100e.m49373x(mapFragment, "mapFragment");
    }

    /* renamed from: a */
    public final void mo48684a(C18880g gVar) {
        if (gVar instanceof C19075a) {
            C19075a aVar = (C19075a) gVar;
            if (aVar.mo51510a(CommercialMetadata.class)) {
                LatLonE6 latLonE6 = aVar.f48054b;
                CommercialMetadata commercialMetadata = (CommercialMetadata) CommercialMetadata.class.cast(aVar.f48497g);
                C15682c<?> cVar = this.f46992b;
                C17474b.C17475a aVar2 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar2.mo49939g(AnalyticsAttributeKey.TYPE, "campaign_icon_clicked");
                aVar2.mo49937e(AnalyticsAttributeKey.ID, commercialMetadata.f42488b);
                cVar.mo46797j2(aVar2.mo49933a());
                ServerId serverId = commercialMetadata.f42488b;
                C17983c cVar2 = new C17983c();
                Bundle bundle = new Bundle();
                bundle.putParcelable("commercialIdExtra", serverId);
                bundle.putParcelable("commercialLocationExtra", latLonE6);
                cVar2.setArguments(bundle);
                cVar2.show(this.f46992b.getChildFragmentManager(), "commercial_dialog_tag");
            } else if (aVar.mo51510a(BicycleStationMetadata.class)) {
                LatLonE6 latLonE62 = aVar.f48054b;
                C15682c<?> cVar3 = this.f46992b;
                C17474b.C17475a aVar3 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar3.mo49939g(AnalyticsAttributeKey.TYPE, "bikes_icon_clicked");
                cVar3.mo46797j2(aVar3.mo49933a());
                int i = C17131c.f44358w;
                Bundle bundle2 = new Bundle();
                bundle2.putParcelable(FacebookUser.LOCATION_OUTER_OBJECT_KEY, latLonE62);
                bundle2.putParcelable("metadata", (BicycleStationMetadata) BicycleStationMetadata.class.cast(aVar.f48497g));
                C17131c cVar4 = new C17131c();
                cVar4.setArguments(bundle2);
                mo50883b(latLonE62, cVar4, "bicycle_station_dialog");
            } else if (aVar.mo51510a(DocklessBicycleMetadata.class)) {
                C15682c<?> cVar5 = this.f46992b;
                C17474b.C17475a aVar4 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar4.mo49939g(AnalyticsAttributeKey.TYPE, "map_item_dockless_bicycle_clicked");
                cVar5.mo46797j2(aVar4.mo49933a());
                mo50883b(aVar.f48054b, DocklessVehicleBottomSheetDialog.m38544f2(aVar, (DocklessBicycleMetadata) DocklessBicycleMetadata.class.cast(aVar.f48497g)), "dockless_vehicle_dialog");
            } else if (aVar.mo51510a(DocklessScooterMetadata.class)) {
                C15682c<?> cVar6 = this.f46992b;
                C17474b.C17475a aVar5 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar5.mo49939g(AnalyticsAttributeKey.TYPE, "map_item_dockless_scooter_clicked");
                cVar6.mo46797j2(aVar5.mo49933a());
                mo50883b(aVar.f48054b, DocklessVehicleBottomSheetDialog.m38547i2(aVar, (DocklessScooterMetadata) DocklessScooterMetadata.class.cast(aVar.f48497g)), "dockless_vehicle_dialog");
            } else if (aVar.mo51510a(DocklessMopedMetadata.class)) {
                C15682c<?> cVar7 = this.f46992b;
                C17474b.C17475a aVar6 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar6.mo49939g(AnalyticsAttributeKey.TYPE, "map_item_dockless_moped_clicked");
                cVar7.mo46797j2(aVar6.mo49933a());
                mo50883b(aVar.f48054b, DocklessVehicleBottomSheetDialog.m38546h2(aVar, (DocklessMopedMetadata) DocklessMopedMetadata.class.cast(aVar.f48497g)), "dockless_vehicle_dialog");
            } else if (aVar.mo51510a(DocklessCarMetadata.class)) {
                C15682c<?> cVar8 = this.f46992b;
                C17474b.C17475a aVar7 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar7.mo49939g(AnalyticsAttributeKey.TYPE, "map_item_dockless_car_clicked");
                cVar8.mo46797j2(aVar7.mo49933a());
                mo50883b(aVar.f48054b, DocklessVehicleBottomSheetDialog.m38545g2(aVar, (DocklessCarMetadata) DocklessCarMetadata.class.cast(aVar.f48497g)), "dockless_vehicle_dialog");
            } else if (aVar.mo51510a(CarSharingMetadata.class)) {
                LatLonE6 latLonE63 = aVar.f48054b;
                C15682c<?> cVar9 = this.f46992b;
                C17474b.C17475a aVar8 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar8.mo49939g(AnalyticsAttributeKey.TYPE, "drive_now_icon_clicked");
                cVar9.mo46797j2(aVar8.mo49933a());
                int i2 = C17520c.f45103w;
                Bundle bundle3 = new Bundle();
                bundle3.putParcelable("extra_car_station_metadata", (CarSharingMetadata) CarSharingMetadata.class.cast(aVar.f48497g));
                C17520c cVar10 = new C17520c();
                cVar10.setArguments(bundle3);
                mo50883b(latLonE63, cVar10, "car_station_dialog_tag");
            } else if (aVar.mo51510a(MicroMobilityMetaData.class)) {
                MicroMobilityMetaData microMobilityMetaData = (MicroMobilityMetaData) MicroMobilityMetaData.class.cast(aVar.f48497g);
                C15682c<?> cVar11 = this.f46992b;
                C17474b.C17475a aVar9 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar9.mo49939g(AnalyticsAttributeKey.TYPE, "map_item_micro_mobility_clicked");
                cVar11.mo46797j2(aVar9.mo49933a());
                String str = microMobilityMetaData.f14817b;
                String str2 = microMobilityMetaData.f14818c;
                LatLonE6 latLonE64 = aVar.f48054b;
                int i3 = C6452b.f20158y;
                Bundle bundle4 = new Bundle();
                bundle4.putString("serviceId", str);
                bundle4.putString("itemId", str2);
                bundle4.putParcelable(FacebookUser.LOCATION_OUTER_OBJECT_KEY, latLonE64);
                C6452b bVar = new C6452b();
                bVar.setArguments(bundle4);
                mo50883b(aVar.f48054b, bVar, "micro_mobility_dialog_tag");
            } else if (aVar.mo51510a(DirectAdMetadata.class)) {
                DirectAdMetadata directAdMetadata = (DirectAdMetadata) DirectAdMetadata.class.cast(aVar.f48497g);
                C15682c<?> cVar12 = this.f46992b;
                C17474b.C17475a aVar10 = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
                aVar10.mo49939g(AnalyticsAttributeKey.TYPE, "map_item_direct_ad_clicked");
                aVar10.mo49939g(AnalyticsAttributeKey.PROVIDER, directAdMetadata.f42490c);
                aVar10.mo49939g(AnalyticsAttributeKey.AD_ID, directAdMetadata.f42489b);
                cVar12.mo46797j2(aVar10.mo49933a());
                LatLonE6 latLonE65 = aVar.f48054b;
                int i4 = MapItemAdBottomSheetDialog.f37544p;
                C24362h.m61211f(latLonE65, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
                Bundle bundle5 = new Bundle();
                bundle5.putParcelable("itemLocation", latLonE65);
                bundle5.putParcelable("metadata", directAdMetadata);
                MapItemAdBottomSheetDialog mapItemAdBottomSheetDialog = new MapItemAdBottomSheetDialog();
                mapItemAdBottomSheetDialog.setArguments(bundle5);
                mo50883b(aVar.f48054b, mapItemAdBottomSheetDialog, "ad_dialog_tag");
            }
        }
    }

    /* renamed from: b */
    public void mo50883b(LatLonE6 latLonE6, C15676b bVar, String str) {
        bVar.show(this.f46992b.getChildFragmentManager(), str);
    }

    /* renamed from: d */
    public final void mo48579d(MapItem mapItem) {
        if (C18433b.f46993a[mapItem.f42549b.ordinal()] == 1) {
            ServerId serverId = mapItem.f42550c;
            C15682c<?> cVar = this.f46992b;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "station_on_map_clicked");
            aVar.mo49941i(AnalyticsAttributeKey.IS_FAVORITE, false);
            cVar.mo46797j2(aVar.mo49933a());
            C15682c<?> cVar2 = this.f46992b;
            cVar2.startActivity(StopDetailActivity.m39207B2(cVar2.getContext(), serverId, (ServerId) null, (TransitStop) null, (List) null));
        }
    }
}
