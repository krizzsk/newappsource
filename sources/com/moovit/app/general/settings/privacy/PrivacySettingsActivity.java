package com.moovit.app.general.settings.privacy;

import android.os.Bundle;
import android.view.View;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.tranzmate.R;
import f00.C16919g;
import java.util.HashSet;
import java.util.Set;
import p543hq.C17474b;
import p716oy.C18860a;
import p755qs.C19165b;
import p755qs.C19166c;
import p755qs.C19167d;
import p755qs.C19168e;
import p874vr.C20199a;
import q00.C19047a;

public final class PrivacySettingsActivity extends MoovitAppActivity {

    /* renamed from: l0 */
    public static final /* synthetic */ int f38067l0 = 0;

    /* renamed from: U */
    public ListItemView f38068U;

    /* renamed from: X */
    public ListItemView f38069X;

    /* renamed from: Y */
    public ListItemView f38070Y;

    /* renamed from: Z */
    public ListItemView f38071Z;

    /* renamed from: M1 */
    public final void mo44510M1() {
    }

    /* renamed from: e1 */
    public final C17474b.C17475a mo44521e1() {
        C14894a b = C14894a.m37560b(this);
        C17474b.C17475a e1 = super.mo44521e1();
        e1.mo49941i(AnalyticsAttributeKey.BACKGROUND_LOCATION_TRACKING_STATE, b.mo45014d());
        e1.mo49941i(AnalyticsAttributeKey.SELLING_DATA_STATE, b.mo45016f());
        e1.mo49938f(AnalyticsAttributeKey.PERSONALIZED_ADS_STATE, b.mo45015e());
        return e1;
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        boolean z;
        int i;
        int i2;
        boolean z2;
        super.mo19425e2(bundle);
        setContentView((int) R.layout.privacy_settings_activity);
        C19047a a = C19047a.m46164a(getApplicationContext());
        C14894a b = C14894a.m37560b(this);
        ListItemView listItemView = (ListItemView) findViewById(R.id.background_location_tracking);
        this.f38068U = listItemView;
        listItemView.setChecked(b.mo45014d());
        this.f38068U.setOnCheckedChangeListener(new C19167d(this, 0));
        this.f38068U.setVisibility(0);
        Boolean e = b.mo45015e();
        if (e != null) {
            z = e.booleanValue();
        } else if (a == null || ((Boolean) a.mo51505b(C20199a.f51261W0)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        ListItemView listItemView2 = (ListItemView) findViewById(R.id.personalized_ads);
        this.f38069X = listItemView2;
        listItemView2.setChecked(z);
        this.f38069X.setOnCheckedChangeListener(new C19168e(this));
        ListItemView listItemView3 = this.f38069X;
        int i3 = 8;
        if (a == null || !((Boolean) a.mo51505b(C20199a.f51239A0)).booleanValue()) {
            i = 8;
        } else {
            i = 0;
        }
        listItemView3.setVisibility(i);
        ListItemView listItemView4 = (ListItemView) findViewById(R.id.data_sharing);
        this.f38070Y = listItemView4;
        listItemView4.setChecked(C14894a.f38078f.mo19759a(b.mo45013c()).booleanValue());
        this.f38070Y.setOnCheckedChangeListener(new C19165b(this));
        ListItemView listItemView5 = this.f38070Y;
        if (C18860a.m45884a().f48021i) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        listItemView5.setVisibility(i2);
        View findViewById = findViewById(R.id.allow_selling_data_header);
        ListItemView listItemView6 = (ListItemView) findViewById(R.id.allow_selling_data);
        this.f38071Z = listItemView6;
        listItemView6.setChecked(b.mo45016f());
        this.f38071Z.setOnCheckedChangeListener(new C19166c(this));
        if (a == null || !((Boolean) a.mo51505b(C20199a.f51308z0)).booleanValue()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            i3 = 0;
        }
        UiUtils.m40238F(i3, findViewById, this.f38071Z);
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C14894a.C14895a a = C14894a.m37560b(this).mo45012a();
        boolean isChecked = this.f38068U.isChecked();
        C16919g.C16920a aVar = C14894a.f38076d;
        if (aVar.mo19759a(a.f38082b).booleanValue() != isChecked) {
            aVar.mo19760c(a.mo45020b(), Boolean.valueOf(isChecked));
            a.f38084d |= 1;
        }
        boolean isChecked2 = this.f38071Z.isChecked();
        C16919g.C16920a aVar2 = C14894a.f38077e;
        if (aVar2.mo19759a(a.f38082b).booleanValue() != isChecked2) {
            aVar2.mo19760c(a.mo45020b(), Boolean.valueOf(isChecked2));
            a.f38084d |= 2;
        }
        Boolean bool = (Boolean) this.f38070Y.getTag(R.id.view_tag_param1);
        if (bool != null) {
            a.mo45021c(bool.booleanValue());
        }
        Boolean bool2 = (Boolean) this.f38069X.getTag(R.id.view_tag_param1);
        if (bool2 != null) {
            a.mo45022d(bool2.booleanValue());
        }
        a.mo45019a();
    }

    /* renamed from: m1 */
    public final C17474b.C17475a mo19762m1() {
        C14894a b = C14894a.m37560b(this);
        C17474b.C17475a m1 = super.mo19762m1();
        m1.mo49941i(AnalyticsAttributeKey.BACKGROUND_LOCATION_TRACKING_STATE, b.mo45014d());
        m1.mo49941i(AnalyticsAttributeKey.SELLING_DATA_STATE, b.mo45016f());
        m1.mo49938f(AnalyticsAttributeKey.PERSONALIZED_ADS_STATE, b.mo45015e());
        return m1;
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).clear();
        return s1;
    }
}
