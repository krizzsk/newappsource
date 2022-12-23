package com.moovit.app.tod.bookingflow;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.C0932h0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1026n0;
import com.moovit.MoovitActivity;
import com.moovit.app.ads.consent.AdjustAdsPreferencesActivity;
import com.moovit.app.tod.bookingflow.TodBookingOrderViewModel;
import com.moovit.map.MapFragment;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import p001a0.C0017h;
import p304x.C7121y;
import p376ax.C13541c;
import p687nt.C18594d;
import p811tc.C19648g;
import p811tc.C19654k;
import p950yw.C20774b;
import p950yw.C20779f;
import p977zz.C20941h;
import p977zz.C20944i0;

public class TodBookingOrderActivity extends MoovitActivity {

    /* renamed from: Z */
    public static final /* synthetic */ int f40067Z = 0;

    /* renamed from: U */
    public TodBookingOrderViewModel f40068U;

    /* renamed from: X */
    public C20774b f40069X;

    /* renamed from: Y */
    public C20779f f40070Y;

    /* renamed from: P1 */
    public final boolean mo24039P1() {
        if (this.f40069X == null) {
            this.f40069X = new C20774b(this, (MapFragment) mo44529n1(R.id.map_fragment));
        }
        this.f40069X.mo52906b((CharSequence) null);
        return this instanceof AdjustAdsPreferencesActivity;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo46211y2(intent);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.tod_booking_order_activity);
        TodBookingOrderViewModel todBookingOrderViewModel = (TodBookingOrderViewModel) new C1026n0(this).mo4313a(TodBookingOrderViewModel.class);
        this.f40068U = todBookingOrderViewModel;
        todBookingOrderViewModel.f40071c.observe(this, new C7121y(this, 2));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.coordinator);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.fragment_container);
        C19648g gVar = new C19648g(new C19654k(C19654k.m47122a(this, 2131952366, 2131952388)));
        gVar.setTint(C20941h.m49043f(R.attr.colorSurface, this));
        viewGroup2.setBackground(gVar);
        viewGroup2.addOnLayoutChangeListener(new C18594d((MapFragment) mo44529n1(R.id.map_fragment), viewGroup, viewGroup2, 1));
        mo46211y2(getIntent());
    }

    /* renamed from: y2 */
    public final void mo46211y2(Intent intent) {
        String str;
        String str2;
        C20944i0 i0Var;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getQueryParameter("pi");
        } else {
            str = intent.getStringExtra("providerId");
        }
        if (data != null) {
            str2 = data.getQueryParameter("ti");
        } else {
            str2 = intent.getStringExtra("taxiProviderId");
        }
        if (str == null || str2 == null) {
            i0Var = null;
        } else {
            i0Var = new C20944i0(str, str2);
        }
        if (i0Var == null) {
            finish();
            return;
        }
        TodBookingOrderViewModel todBookingOrderViewModel = this.f40068U;
        todBookingOrderViewModel.f40071c.setValue(new TodBookingOrderViewModel.OrderInformation((String) i0Var.f52692a, (String) i0Var.f52693b, -1, (LocationDescriptor) null, (LocationDescriptor) null));
        todBookingOrderViewModel.f40073e.setValue(null);
        todBookingOrderViewModel.f40078j.setValue(null);
    }

    /* renamed from: z2 */
    public final C0932h0 mo46212z2(C13541c cVar, String str, boolean z, C0932h0 h0Var) {
        int i;
        if (h0Var == null) {
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            h0Var = C0017h.m54K(supportFragmentManager, supportFragmentManager);
        }
        int i2 = 0;
        if (z) {
            i = R.anim.slide_fragment_enter;
        } else {
            i = 0;
        }
        if (z) {
            i2 = R.anim.slide_fragment_exit;
        }
        h0Var.mo4112g(i, i2, R.anim.slide_fragment_pop_enter, R.anim.slide_fragment_pop_exit);
        h0Var.mo4111f(R.id.fragment_container, cVar, str);
        if (z) {
            h0Var.mo4110c(str);
        }
        return h0Var;
    }
}
