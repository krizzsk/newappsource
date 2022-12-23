package com.moovit.app.mot.purchase;

import a00.C13382a;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import b00.C13556a;
import c00.C13717b;
import c70.C13751d;
import com.google.android.gms.analytics.ecommerce.ProductAction;
import com.moovit.app.mot.activation.MotActivationConfirmationActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotNearestStationInfo;
import com.moovit.app.mot.p417qr.MotQrCodeViewerActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.design.view.NumericStepperView;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitType;
import com.moovit.util.CurrencyAmount;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.ArrayList;
import p304x.C7038d0;
import p583jk.C17884p;
import p736pu.C18996e;
import p736pu.C18997f;
import p736pu.C19004l;
import p736pu.C19005m;
import p757qu.C19184g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import z20.C20806a;

public class MotStationEntranceOnlyActivationActivity extends MotStationActivationAbstractActivity<C18996e, C18997f> {

    /* renamed from: q0 */
    public static final /* synthetic */ int f39043q0 = 0;

    /* renamed from: Z */
    public final C15160a f39044Z = new C15160a();

    /* renamed from: l0 */
    public View f39045l0;

    /* renamed from: m0 */
    public NumericStepperView f39046m0;

    /* renamed from: n0 */
    public MotActivationPrice f39047n0;

    /* renamed from: o0 */
    public C13556a f39048o0 = null;

    /* renamed from: p0 */
    public TransitType.VehicleType f39049p0;

    /* renamed from: com.moovit.app.mot.purchase.MotStationEntranceOnlyActivationActivity$a */
    public class C15160a extends C20438i<C19004l, C19005m> {
        public C15160a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19004l lVar = (C19004l) cVar;
            MotStationEntranceOnlyActivationActivity.this.mo44506I1();
            MotStationEntranceOnlyActivationActivity.this.f39048o0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            Intent intent;
            CurrencyAmount currencyAmount;
            CurrencyAmount currencyAmount2;
            CurrencyAmount currencyAmount3;
            C19004l lVar = (C19004l) cVar;
            MotStationEntranceOnlyActivationActivity motStationEntranceOnlyActivationActivity = MotStationEntranceOnlyActivationActivity.this;
            ArrayList arrayList = ((C19005m) gVar).f48359m;
            int i = MotStationEntranceOnlyActivationActivity.f39043q0;
            motStationEntranceOnlyActivationActivity.getClass();
            if (!C13717b.m34258e(arrayList)) {
                MotActivation motActivation = (MotActivation) arrayList.get(0);
                MotActivationPrice motActivationPrice = motActivation.f38995l;
                C20806a.C20807a aVar = new C20806a.C20807a(ProductAction.ACTION_PURCHASE);
                aVar.mo52934b("mot", "feature");
                aVar.mo52934b("IsraelMot", "payment_context");
                aVar.mo52936d("item_id", motActivation.f38985b);
                aVar.mo52934b(motActivation.f38986c, "item_name");
                aVar.mo52934b(Integer.valueOf(arrayList.size()), "number_of_items");
                aVar.mo52934b(C25541a.m63895z(C7843b.m17877d(motActivation.mo45524b())), "transit_type");
                aVar.mo52934b(motActivation.mo45529f(), "agency_name");
                if (motActivationPrice != null) {
                    currencyAmount = motActivationPrice.f39005b;
                } else {
                    currencyAmount = null;
                }
                aVar.mo52938f(currencyAmount);
                if (motActivationPrice != null) {
                    currencyAmount2 = motActivationPrice.f39005b;
                } else {
                    currencyAmount2 = null;
                }
                aVar.mo52937e(InAppPurchaseMetaData.KEY_PRICE, currencyAmount2);
                if (motActivationPrice != null) {
                    currencyAmount3 = motActivationPrice.mo45548b(arrayList.size());
                } else {
                    currencyAmount3 = null;
                }
                aVar.mo52937e("revenue", currencyAmount3);
                aVar.mo52935c();
            }
            if (TransitType.VehicleType.TRAM.equals(motStationEntranceOnlyActivationActivity.f39049p0)) {
                int i2 = MotActivationConfirmationActivity.f38971Y;
                intent = new Intent(motStationEntranceOnlyActivationActivity, MotActivationConfirmationActivity.class);
                intent.putParcelableArrayListExtra("activations", C13717b.m34264k(arrayList));
            } else {
                intent = MotQrCodeViewerActivity.m38705y2(motStationEntranceOnlyActivationActivity, (ServerId) null, ((MotActivation) arrayList.get(0)).f38989f);
            }
            motStationEntranceOnlyActivationActivity.startActivity(intent);
            motStationEntranceOnlyActivationActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C19004l lVar = (C19004l) cVar;
            MotStationEntranceOnlyActivationActivity motStationEntranceOnlyActivationActivity = MotStationEntranceOnlyActivationActivity.this;
            motStationEntranceOnlyActivationActivity.mo44530n2(C13751d.m34341b(motStationEntranceOnlyActivationActivity, (String) null, exc));
            return true;
        }
    }

    /* renamed from: D2 */
    public final void mo45598D2() {
        ListItemView listItemView = (ListItemView) findViewById(R.id.estimated_price);
        if (this.f39047n0 != null) {
            ((PriceView) listItemView.getAccessoryView()).setPrice(this.f39047n0.mo45548b(this.f39046m0.getCounter()));
            listItemView.setVisibility(0);
            return;
        }
        listItemView.setVisibility(8);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        this.f39049p0 = (TransitType.VehicleType) getIntent().getParcelableExtra("vehicle_type");
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C13556a aVar = this.f39048o0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39048o0 = null;
        }
    }

    /* renamed from: y2 */
    public final C18996e mo45593y2(LatLonE6 latLonE6) {
        return new C18996e(mo44548x1(), latLonE6, this.f39049p0);
    }

    /* renamed from: z2 */
    public final void mo45594z2(C20431c cVar, C20436g gVar) {
        C18997f fVar = (C18997f) gVar;
        LatLonE6 latLonE6 = ((C18996e) cVar).f48342w;
        MotNearestStationInfo motNearestStationInfo = fVar.f48343m;
        MotActivationPrice motActivationPrice = fVar.f48344n;
        setContentView((int) R.layout.mot_station_entrance_only_activation_activity);
        this.f39047n0 = motActivationPrice;
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
        this.f39045l0 = findViewById(R.id.passenger_count_warning);
        NumericStepperView numericStepperView = (NumericStepperView) findViewById(R.id.numeric_stepper_view);
        this.f39046m0 = numericStepperView;
        numericStepperView.setListener(new C7038d0(this, 7));
        mo45598D2();
        findViewById(R.id.activate_ride_view).setOnClickListener(new C19184g(0, this, latLonE6, motNearestStationInfo));
        mo45590A2("mot_station_location_regular", motNearestStationInfo);
    }
}
