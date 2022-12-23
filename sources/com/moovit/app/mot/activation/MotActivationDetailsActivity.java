package com.moovit.app.mot.activation;

import a00.C13382a;
import a00.C13385b;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import c00.C13717b;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.mot.model.MotActivation;
import com.moovit.app.mot.model.MotActivationFareInfo;
import com.moovit.app.mot.model.MotActivationPrice;
import com.moovit.app.mot.model.MotActivationStationInfo;
import com.moovit.app.mot.view.MotActivationView;
import com.moovit.commons.utils.UiUtils;
import com.moovit.transit.TransitStop;
import com.moovit.util.DistanceUtils;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p073e7.C4585c;
import p543hq.C17474b;
import p977zz.C20964s0;

public class MotActivationDetailsActivity extends MoovitAppActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f38974X = 0;

    /* renamed from: U */
    public MotActivation f38975U;

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        String str;
        String str2;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.mot_activation_details_activity);
        Intent intent = getIntent();
        if (intent != null) {
            this.f38975U = (MotActivation) intent.getParcelableExtra("activation");
        }
        ((MotActivationView) findViewById(R.id.activation_view)).setActivation(this.f38975U);
        View findViewById = findViewById(R.id.regional_fare);
        MotActivation motActivation = this.f38975U;
        MotActivationFareInfo motActivationFareInfo = motActivation.f38996m;
        int i = 8;
        if (motActivationFareInfo == null) {
            findViewById.setVisibility(8);
        } else {
            long j = motActivation.f38998o;
            String j2 = C7925b.m18022j(this, j);
            TextView x2 = mo44549x2(R.id.date_value);
            x2.setText(j2);
            x2.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_ride_permit_date), j2));
            String l = C7925b.m18024l(this, j);
            TextView x22 = mo44549x2(R.id.time_value);
            x22.setText(l);
            x22.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_ride_permit_time), l));
            String string = getString(R.string.payment_mot_ride_permit_distance_km, new Object[]{DistanceUtils.m17934a((int) DistanceUtils.m17936c(this, (float) motActivationFareInfo.f39003c), this)});
            TextView x23 = mo44549x2(R.id.drive_distance_value);
            x23.setText(string);
            x23.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_ride_permit_distance), string));
            findViewById.setVisibility(0);
        }
        View findViewById2 = findViewById(R.id.origin_station_fare);
        View findViewById3 = findViewById(R.id.destination_station_fare);
        MotActivation motActivation2 = this.f38975U;
        MotActivationStationInfo motActivationStationInfo = motActivation2.f38997n;
        List<String> list = null;
        if (motActivationStationInfo == null) {
            UiUtils.m40238F(8, findViewById2, findViewById3);
        } else {
            String j3 = C7925b.m18022j(this, motActivation2.f38998o);
            TextView x24 = mo44549x2(R.id.date_value);
            x24.setText(j3);
            x24.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_ride_permit_date), j3));
            TransitStop transitStop = motActivationStationInfo.f39021b.get();
            if (transitStop != null) {
                TextView x25 = mo44549x2(R.id.origin_station_value);
                x25.setText(transitStop.f23731c);
                x25.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_train_permit_entrance), transitStop.f23731c));
                String l2 = C7925b.m18024l(this, this.f38975U.f38998o);
                TextView x26 = mo44549x2(R.id.origin_time_value);
                x26.setText(l2);
                x26.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_ride_permit_time), l2));
                findViewById2.setVisibility(0);
            }
            TransitStop b = motActivationStationInfo.mo45574b();
            if (b != null) {
                TextView x27 = mo44549x2(R.id.destination_station_value);
                x27.setText(b.f23731c);
                x27.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_train_permit_exit), b.f23731c));
                long j4 = this.f38975U.f38999p;
                TextView x28 = mo44549x2(R.id.destination_time_value);
                int i2 = (j4 > -1 ? 1 : (j4 == -1 ? 0 : -1));
                if (i2 != 0) {
                    str = C7925b.m18024l(this, j4);
                } else {
                    str = "-";
                }
                x28.setText(str);
                CharSequence[] charSequenceArr = new CharSequence[2];
                charSequenceArr[0] = getString(R.string.payment_mot_ride_permit_time);
                if (i2 != 0) {
                    str2 = C7925b.m18024l(this, j4);
                } else {
                    str2 = null;
                }
                charSequenceArr[1] = str2;
                x28.setContentDescription(C13382a.m33667c(charSequenceArr));
                findViewById3.setVisibility(0);
            }
        }
        PriceView priceView = (PriceView) findViewById(R.id.price_view);
        MotActivationPrice motActivationPrice = this.f38975U.f38995l;
        if (motActivationPrice != null) {
            priceView.mo24682a(motActivationPrice.f39005b, motActivationPrice.f39006c, (String) null);
            priceView.setVisibility(0);
        } else {
            priceView.setVisibility(8);
        }
        UiUtils.m40265x(priceView, findViewById(R.id.no_price_view));
        TextView x29 = mo44549x2(R.id.reasons_text);
        MotActivationPrice motActivationPrice2 = this.f38975U.f38995l;
        if (motActivationPrice2 != null) {
            list = motActivationPrice2.f39007d;
        }
        if (C13717b.m34258e(list)) {
            x29.setVisibility(8);
        } else {
            x29.setText(C20964s0.m49100r(getString(R.string.string_list_delimiter_pipe), list));
            x29.setVisibility(0);
        }
        TextView x210 = mo44549x2(R.id.price_reference_value);
        x210.setText(this.f38975U.f38989f);
        x210.setContentDescription(C13382a.m33667c(getString(R.string.payment_mot_ride_reference_number), this.f38975U.f38989f));
        TextView x211 = mo44549x2(R.id.support_action);
        x211.setOnClickListener(new C4585c(this, 16));
        x211.setAccessibilityDelegate(new C13385b());
        View findViewById4 = findViewById(R.id.divider);
        Button button = (Button) findViewById(R.id.show_qr_action);
        button.setOnClickListener(new C4051q(this, 19));
        if (!C20964s0.m49090h(this.f38975U.f38992i)) {
            i = 0;
        }
        UiUtils.m40238F(i, button, findViewById4);
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        String str;
        Intent intent = getIntent();
        if (intent != null) {
            this.f38975U = (MotActivation) intent.getParcelableExtra("activation");
        }
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49937e(AnalyticsAttributeKey.ID, this.f38975U.f38985b);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.TYPE;
        if (this.f38975U.f38997n != null) {
            str = "rail";
        } else {
            str = "bus";
        }
        m1.mo49939g(analyticsAttributeKey, str);
        m1.mo49943k(AnalyticsAttributeKey.AGENCY_ID, this.f38975U.mo45526d());
        m1.mo49945m(AnalyticsAttributeKey.AGENCY_NAME, this.f38975U.mo45529f());
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("MOT_SUPPORT_VALIDATOR");
        return s1;
    }
}
