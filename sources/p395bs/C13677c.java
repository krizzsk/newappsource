package p395bs;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.editing.entity.AbstractEditEntityActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.ChooseFixedLocationActivity;
import com.moovit.location.ChooseLocationActivity;
import com.moovit.map.MarkerZoomStyle;
import p543hq.C17474b;

/* renamed from: bs.c */
public final class C13677c implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ AbstractEditEntityActivity f33710b;

    public C13677c(AbstractEditEntityActivity abstractEditEntityActivity) {
        this.f33710b = abstractEditEntityActivity;
    }

    public final void onClick(View view) {
        Intent intent;
        AbstractEditEntityActivity abstractEditEntityActivity = this.f33710b;
        int i = AbstractEditEntityActivity.f37951E0;
        abstractEditEntityActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "location_clicked");
        abstractEditEntityActivity.mo44545v2(aVar.mo49933a());
        if (!(!abstractEditEntityActivity.f37971w0)) {
            LatLonE6 latLonE6 = abstractEditEntityActivity.f37957X.f37990d;
            SparseArray<MarkerZoomStyle> sparseArray = abstractEditEntityActivity.f37959Z;
            MarkerZoomStyle markerZoomStyle = abstractEditEntityActivity.f37958Y;
            intent = new Intent(abstractEditEntityActivity, ChooseLocationActivity.class);
            intent.putExtra("extra_entity_location_on_map", latLonE6);
            Bundle extras = intent.getExtras();
            extras.putSparseParcelableArray("extra_entity_markers_zoom_style", sparseArray);
            intent.putExtras(extras);
            intent.putExtra("extra_entity_marker_zoom_style", markerZoomStyle);
        } else {
            LatLonE6 latLonE62 = abstractEditEntityActivity.f37957X.f37990d;
            SparseArray<MarkerZoomStyle> sparseArray2 = abstractEditEntityActivity.f37959Z;
            MarkerZoomStyle markerZoomStyle2 = abstractEditEntityActivity.f37958Y;
            intent = new Intent(abstractEditEntityActivity, ChooseFixedLocationActivity.class);
            intent.putExtra("extra_entity_location_on_map", latLonE62);
            Bundle extras2 = intent.getExtras();
            extras2.putSparseParcelableArray("extra_entity_current_markers_zoom_style", sparseArray2);
            intent.putExtras(extras2);
            intent.putExtra("extra_entity_current_marker_zoom_style", markerZoomStyle2);
        }
        abstractEditEntityActivity.startActivityForResult(intent, 1001);
    }
}
