package com.moovit.app.tod;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import c70.C13751d;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.tod.model.TodRideUpdateOffer;
import com.moovit.design.view.list.ListItemView;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import p373au.C13535g;
import p543hq.C17474b;
import p596jx.C17966n;
import p596jx.C17967o;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p927xw.C20652s;
import p977zz.C20964s0;

public class TodRideChangeDestinationConfirmationActivity extends MoovitActivity {

    /* renamed from: X */
    public static final /* synthetic */ int f40015X = 0;

    /* renamed from: U */
    public final C15452a f40016U = new C15452a();

    /* renamed from: com.moovit.app.tod.TodRideChangeDestinationConfirmationActivity$a */
    public class C15452a extends C20438i<C17966n, C17967o> {
        public C15452a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17966n nVar = (C17966n) cVar;
            TodRideChangeDestinationConfirmationActivity.this.mo44506I1();
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17966n nVar = (C17966n) cVar;
            TodRideChangeDestinationConfirmationActivity todRideChangeDestinationConfirmationActivity = TodRideChangeDestinationConfirmationActivity.this;
            int i = TodRideChangeDestinationConfirmationActivity.f40015X;
            todRideChangeDestinationConfirmationActivity.getClass();
            Toast.makeText(todRideChangeDestinationConfirmationActivity, R.string.tod_passenger_ride_change_destination_success, 1).show();
            Intent z2 = TodRideActivity.m39513z2(todRideChangeDestinationConfirmationActivity, ((C17967o) gVar).f46048m);
            z2.addFlags(603979776);
            todRideChangeDestinationConfirmationActivity.startActivity(z2);
            todRideChangeDestinationConfirmationActivity.finish();
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            TodRideChangeDestinationConfirmationActivity todRideChangeDestinationConfirmationActivity = TodRideChangeDestinationConfirmationActivity.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_ride_change_destination_error");
            aVar.mo49935c(AnalyticsAttributeKey.ERROR_CODE, C13751d.m34343d(exc));
            todRideChangeDestinationConfirmationActivity.mo44545v2(aVar.mo49933a());
            TodRideChangeDestinationConfirmationActivity.this.mo44530n2(C20652s.m48547b(exc, ((C17966n) cVar).f51759b));
            return true;
        }
    }

    /* renamed from: y2 */
    public static SpannableStringBuilder m39546y2(Context context, String str, String str2, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(str);
        spannableStringBuilder.append(C20964s0.f52718a);
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append("(");
        if (z) {
            spannableStringBuilder.append("+");
        }
        spannableStringBuilder.append(str2);
        spannableStringBuilder.append(")");
        spannableStringBuilder.setSpan(C20964s0.m49084b(context, R.attr.textAppearanceFootnote, R.attr.colorOnSurfaceEmphasisMedium), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo46191z2(intent);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_ride_change_destination_activity);
        mo46191z2(getIntent());
    }

    /* renamed from: z2 */
    public final void mo46191z2(Intent intent) {
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z;
        TodRideUpdateOffer todRideUpdateOffer = (TodRideUpdateOffer) intent.getParcelableExtra("offer");
        if (todRideUpdateOffer == null) {
            finish();
            return;
        }
        LocationDescriptor locationDescriptor = todRideUpdateOffer.f40296d;
        MapFragment mapFragment = (MapFragment) mo44529n1(R.id.map_fragment);
        mapFragment.mo48646o2(locationDescriptor, locationDescriptor, C16281i.m41506b(R.drawable.wdg_tod_img_destination_36));
        mapFragment.mo48663x2(locationDescriptor.mo24310d());
        ((ListItemView) findViewById(R.id.destination_view)).setSubtitle((CharSequence) todRideUpdateOffer.f40296d.mo24313f());
        ((ListItemView) findViewById(R.id.drop_off_view)).setSubtitle((CharSequence) todRideUpdateOffer.f40295c.mo24313f());
        long j = todRideUpdateOffer.f40297e;
        long j2 = j - todRideUpdateOffer.f40298f;
        ListItemView listItemView = (ListItemView) findViewById(R.id.eta_view);
        boolean z2 = true;
        if (Math.abs(j2) >= TimeUnit.MINUTES.toMillis(1)) {
            String l = C7925b.m18024l(this, j);
            String g = C7925b.m18019g(this, j2);
            if (j2 > 0) {
                z = true;
            } else {
                z = false;
            }
            charSequence = m39546y2(this, l, g, z);
        } else {
            charSequence = C7925b.m18024l(this, j);
        }
        listItemView.setAccessoryText(charSequence);
        ListItemView listItemView2 = (ListItemView) findViewById(R.id.price_view);
        ImageView imageView = (ImageView) findViewById(R.id.divider2);
        CurrencyAmount currencyAmount = todRideUpdateOffer.f40299g;
        CurrencyAmount currencyAmount2 = todRideUpdateOffer.f40300h;
        if (currencyAmount2 == null) {
            currencyAmount2 = currencyAmount;
        }
        if (currencyAmount == null) {
            listItemView2.setVisibility(8);
            imageView.setVisibility(8);
        } else {
            CurrencyAmount g2 = CurrencyAmount.m17930g(currencyAmount, currencyAmount2);
            if (!currencyAmount.equals(currencyAmount2)) {
                String currencyAmount3 = currencyAmount.toString();
                String currencyAmount4 = g2.toString();
                if (g2.f23845c.compareTo(BigDecimal.ZERO) <= 0) {
                    z2 = false;
                }
                charSequence2 = m39546y2(this, currencyAmount3, currencyAmount4, z2);
            } else {
                charSequence2 = currencyAmount.toString();
            }
            listItemView2.setAccessoryText(charSequence2);
        }
        ((Button) findViewById(R.id.confirm_button)).setOnClickListener(new C13535g(4, this, todRideUpdateOffer));
    }
}
