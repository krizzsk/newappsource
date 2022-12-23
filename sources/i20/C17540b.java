package i20;

import android.content.Intent;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.location.ChooseFixedLocationActivity;
import p543hq.C17474b;

/* renamed from: i20.b */
public final class C17540b implements View.OnClickListener {

    /* renamed from: b */
    public final /* synthetic */ ChooseFixedLocationActivity f45131b;

    public C17540b(ChooseFixedLocationActivity chooseFixedLocationActivity) {
        this.f45131b = chooseFixedLocationActivity;
    }

    public final void onClick(View view) {
        ChooseFixedLocationActivity chooseFixedLocationActivity = this.f45131b;
        int i = ChooseFixedLocationActivity.f42193A0;
        chooseFixedLocationActivity.getClass();
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "set_location_clicked");
        chooseFixedLocationActivity.mo44545v2(aVar.mo49933a());
        Intent intent = new Intent();
        intent.putExtra("extra_entity_location_on_map", LatLonE6.m40177j(chooseFixedLocationActivity.f42195X));
        chooseFixedLocationActivity.setResult(-1, intent);
        chooseFixedLocationActivity.finish();
    }
}
