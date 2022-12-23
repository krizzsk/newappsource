package com.moovit.app.tod.center.rides;

import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import c20.C13744a;
import c70.C13751d;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.tod.TodRideRatingDialogFragment;
import com.moovit.app.tod.TodRidesProvider;
import com.moovit.app.tod.model.TodRide;
import com.moovit.app.tod.model.TodRideStatus;
import com.moovit.app.tod.model.TodRideVehicle;
import com.moovit.commons.utils.C15780a;
import com.moovit.design.view.list.ListItemView;
import com.moovit.util.CurrencyAmount;
import com.moovit.util.time.C7925b;
import com.moovit.view.PriceView;
import com.tranzmate.R;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p001a0.C0017h;
import p241s0.C6302b;
import p471eq.C16850a;
import p543hq.C17474b;
import p824tp.C19725d;
import p977zz.C20941h;
import p977zz.C20964s0;

public class TodRideDetailsActivity extends MoovitAppActivity implements TodRidesProvider.C15457c, TodRideRatingDialogFragment.C15454b {

    /* renamed from: X */
    public static final /* synthetic */ int f40215X = 0;

    /* renamed from: U */
    public String f40216U;

    /* renamed from: A2 */
    public final void mo46289A2(boolean z) {
        int i;
        View findViewById = findViewById(R.id.group_content);
        int i2 = 0;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        findViewById.setVisibility(i);
        View findViewById2 = findViewById(R.id.progress);
        if (!z) {
            i2 = 8;
        }
        findViewById2.setVisibility(i2);
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        mo46290y2(intent);
        setIntent(intent);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_ride_details_activity);
        mo46290y2(getIntent());
    }

    /* renamed from: i0 */
    public final void mo46193i0() {
    }

    /* renamed from: r0 */
    public final void mo46194r0(int i) {
        mo46291z2(Integer.valueOf(i), false);
    }

    /* renamed from: s */
    public final void mo46199s(Exception exc) {
        if (exc instanceof NoSuchElementException) {
            Toast.makeText(this, R.string.general_error_title, 1).show();
            finish();
            return;
        }
        mo46289A2(false);
        mo44530n2(C13751d.m34341b(this, (String) null, exc));
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("TOD_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: x */
    public final void mo46200x(TodRide todRide) {
        String str;
        int i;
        int i2 = 0;
        mo46289A2(false);
        mo44549x2(R.id.date).setText(C7925b.m18023k(this, todRide.f40265c));
        TodRideStatus todRideStatus = todRide.f40266d;
        TextView x2 = mo44549x2(R.id.status);
        x2.setText(todRideStatus.textResId);
        x2.setTextColor(C20941h.m49044g(todRideStatus.textColorAttrId, this));
        C15780a.m40272e(x2, todRideStatus.iconResId);
        ListItemView listItemView = (ListItemView) findViewById(R.id.provider_details);
        C13744a.m34301c(listItemView.getIconView(), todRide.f40274l, 4);
        listItemView.setTitle((CharSequence) todRide.f40273k);
        TodRideVehicle todRideVehicle = todRide.f40268f;
        boolean z = true;
        if (todRideVehicle != null) {
            str = C20964s0.m49102t(getString(R.string.string_list_delimiter_dot), todRideVehicle.f40302b, todRideVehicle.f40303c);
        } else {
            str = null;
        }
        listItemView.setSubtitle((CharSequence) str);
        ListItemView listItemView2 = (ListItemView) findViewById(R.id.trip);
        listItemView2.setTitle((CharSequence) todRide.f40267e.f40284b.mo24313f());
        listItemView2.setSubtitle((CharSequence) todRide.f40267e.f40287e.mo24313f());
        TextView x22 = mo44549x2(R.id.passenger_count);
        Resources resources = getResources();
        int i3 = todRide.f40271i;
        x22.setText(resources.getQuantityString(R.plurals.tod_ride_details_passenger_options, i3, new Object[]{Integer.valueOf(i3)}));
        TextView x23 = mo44549x2(R.id.accessible);
        if (todRide.f40272j) {
            i = R.string.tod_passenger_ride_details_accessible;
        } else {
            i = R.string.tod_passenger_ride_details_not_accessible;
        }
        x23.setText(i);
        ListItemView listItemView3 = (ListItemView) findViewById(R.id.ride_fare);
        CurrencyAmount currencyAmount = todRide.f40269g;
        if (currencyAmount == null) {
            z = false;
        }
        if (!z) {
            i2 = 8;
        }
        listItemView3.setVisibility(i2);
        PriceView priceView = (PriceView) listItemView3.getAccessoryView();
        if (z) {
            priceView.setPrice(currencyAmount);
        }
        mo46291z2(todRide.f40276n, todRide.f40277o);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "tod_ride_details_impression");
        aVar.mo49939g(AnalyticsAttributeKey.ID, todRide.f40264b);
        aVar.mo49939g(AnalyticsAttributeKey.STATUS, C0017h.m66W(todRide.f40266d));
        aVar.mo49936d(AnalyticsAttributeKey.TIME, todRide.f40265c);
        aVar.mo49941i(AnalyticsAttributeKey.RATABLE, todRide.f40277o);
        Integer num = todRide.f40276n;
        if (num != null) {
            aVar.mo49935c(AnalyticsAttributeKey.RATING, num.intValue());
        }
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: y2 */
    public final void mo46290y2(Intent intent) {
        String str;
        Uri data = intent.getData();
        Object obj = null;
        boolean z = true;
        if (!"android.intent.action.VIEW".equals(intent.getAction()) || data == null) {
            str = intent.getStringExtra("ride_id");
        } else {
            List<String> pathSegments = data.getPathSegments();
            if (pathSegments == null || pathSegments.size() < 2) {
                str = null;
            } else {
                str = pathSegments.get(1);
            }
        }
        if (str == null) {
            finish();
            return;
        }
        this.f40216U = str;
        mo46289A2(true);
        TodRidesProvider c = TodRidesProvider.m39561c();
        TodRidesProvider.C15456b bVar = c.f40034c;
        C6302b bVar2 = bVar.f40040b;
        if (bVar.f40043e == -1 || SystemClock.elapsedRealtime() - bVar.f40043e >= TodRidesProvider.f40030g) {
            z = false;
        }
        if (z && bVar2 != null) {
            obj = bVar2.getOrDefault(str, null);
        }
        TodRide todRide = (TodRide) obj;
        if (todRide != null) {
            mo46200x(todRide);
        }
        TodRidesProvider.C15459e eVar = new TodRidesProvider.C15459e(this, str, this);
        C19725d.m47191a(eVar.f40044b).f50162b.add(eVar);
        c.f40036e.add(eVar);
        if (!c.mo46197f()) {
            eVar.mo46186a0();
        }
    }

    /* renamed from: z2 */
    public final void mo46291z2(Integer num, boolean z) {
        boolean z2;
        int i;
        int i2 = 0;
        if (num != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        ListItemView listItemView = (ListItemView) findViewById(R.id.ride_rating);
        if (z2) {
            i = 0;
        } else {
            i = 8;
        }
        listItemView.setVisibility(i);
        if (z2) {
            ((RatingBar) listItemView.getAccessoryView()).setRating((float) Math.floor((double) num.intValue()));
        }
        ((Button) findViewById(R.id.rate_button)).setOnClickListener(new C16850a(this, 25));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.rate_container);
        if (!z) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
    }
}
