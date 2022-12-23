package com.moovit.app.mot.purchase;

import a00.C13382a;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import b00.C13556a;
import c70.C13751d;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.app.mot.purchase.C15161a;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.NumericStepperView;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.transit.TransitType;
import com.tranzmate.R;
import java.util.ArrayList;
import p102h0.C5021e;
import p543hq.C17474b;
import p583jk.C17884p;
import p736pu.C18996e;
import p736pu.C18997f;
import p736pu.C19004l;
import p736pu.C19005m;
import p757qu.C19182e;
import p824tp.C19728f;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;

public class MotStationEntranceActivationActivity extends MotStationActivationAbstractActivity<C18996e, C18997f> implements C15161a.C15162a {

    /* renamed from: p0 */
    public static final /* synthetic */ int f39036p0 = 0;

    /* renamed from: Z */
    public final C15159a f39037Z = new C15159a();

    /* renamed from: l0 */
    public C13556a f39038l0 = null;

    /* renamed from: m0 */
    public NumericStepperView f39039m0;

    /* renamed from: n0 */
    public TextView f39040n0;

    /* renamed from: o0 */
    public TransitType.VehicleType f39041o0;

    /* renamed from: com.moovit.app.mot.purchase.MotStationEntranceActivationActivity$a */
    public class C15159a extends C20438i<C19004l, C19005m> {
        public C15159a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19004l lVar = (C19004l) cVar;
            MotStationEntranceActivationActivity.this.mo44506I1();
            MotStationEntranceActivationActivity.this.f39038l0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19004l lVar = (C19004l) cVar;
            MotStationEntranceActivationActivity motStationEntranceActivationActivity = MotStationEntranceActivationActivity.this;
            ArrayList arrayList = ((C19005m) gVar).f48359m;
            int i = MotStationEntranceActivationActivity.f39036p0;
            motStationEntranceActivationActivity.getClass();
            motStationEntranceActivationActivity.startActivity(MotQrCodeViewerActivity.m38705y2(motStationEntranceActivationActivity, (ServerId) null, ((MotActivation) arrayList.get(0)).f38989f));
            motStationEntranceActivationActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19004l lVar = (C19004l) cVar;
            MotStationEntranceActivationActivity motStationEntranceActivationActivity = MotStationEntranceActivationActivity.this;
            motStationEntranceActivationActivity.mo44530n2(C13751d.m34341b(motStationEntranceActivationActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: D2 */
    public final void mo45595D2(LatLonE6 latLonE6) {
        if (this.f39038l0 == null) {
            mo44543u2((CharSequence) null);
            C19004l lVar = new C19004l(mo44548x1(), (C19728f) mo44537r1("METRO_CONTEXT"), latLonE6, this.f39041o0, this.f39039m0.getCounter());
            String O = lVar.mo51491O();
            RequestOptions requestOptions = new RequestOptions();
            requestOptions.f42909f = true;
            this.f39038l0 = mo44527k2(O, lVar, requestOptions, this.f39037Z);
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        this.f39041o0 = (TransitType.VehicleType) getIntent().getParcelableExtra("vehicle_type");
    }

    /* renamed from: j */
    public final void mo45596j(LatLonE6 latLonE6) {
        mo45595D2(latLonE6);
    }

    /* renamed from: j0 */
    public final void mo45597j0() {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "cancel_clicked");
        mo44545v2(aVar.mo49933a());
        finish();
    }

    /* renamed from: y2 */
    public final C18996e mo45593y2(LatLonE6 latLonE6) {
        return new C18996e(mo44548x1(), latLonE6, this.f39041o0);
    }

    /* renamed from: z2 */
    public final void mo45594z2(C20431c cVar, C20436g gVar) {
        LatLonE6 latLonE6 = ((C18996e) cVar).f48342w;
        MotNearestStationInfo motNearestStationInfo = ((C18997f) gVar).f48343m;
        setContentView((int) R.layout.mot_station_entrance_activation_activity);
        Image image = motNearestStationInfo.f39024c;
        if (image != null) {
            ImageView imageView = (ImageView) findViewById(R.id.agency_image);
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
        }
        String str = motNearestStationInfo.f39023b.f23731c;
        TextView x2 = mo44549x2(R.id.title);
        TextView x22 = mo44549x2(R.id.station_name);
        x22.setText(str);
        C13382a.m33674j(x22, x2.getText(), str);
        this.f39040n0 = (TextView) findViewById(R.id.passenger_count_warning);
        NumericStepperView numericStepperView = (NumericStepperView) findViewById(R.id.numeric_stepper_view);
        this.f39039m0 = numericStepperView;
        numericStepperView.setListener(new C5021e(this, 11));
        findViewById(R.id.activate_ride_view).setOnClickListener(new C19182e(0, this, latLonE6, motNearestStationInfo));
        findViewById(R.id.cancel_view).setOnClickListener(new C4052r(this, 13));
        mo45590A2("mot_station_location_regular", motNearestStationInfo);
    }
}
