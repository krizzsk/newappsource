package com.moovit.app.home.dashboard;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.exoplayer2.p052ui.C4052r;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.commons.utils.UiUtils;
import com.moovit.location.C16202a;
import com.tranzmate.R;
import p001a0.C0016g;
import p543hq.C17474b;
import p578jf.C17843u;
import p977zz.C20934d0;

public class LocationServicesStateSection extends C15682c<MoovitActivity> {

    /* renamed from: r */
    public static final /* synthetic */ int f38179r = 0;

    /* renamed from: n */
    public final C14924a f38180n = new C14924a();

    /* renamed from: o */
    public final C14951n f38181o = new C14951n(this, 0);

    /* renamed from: p */
    public State f38182p = State.ENABLED;

    /* renamed from: q */
    public TextView f38183q;

    public enum State {
        ENABLED(0, "location_enabled"),
        MISSING_LOCATION_PERMISSION(R.string.directions_no_gps, "permission_denied"),
        RESOLVABLE_WRONG_LOCATION_SETTINGS(R.string.directions_no_gps, "wrong_settings_fixable"),
        WRONG_LOCATION_SETTINGS(R.string.directions_no_gps_no_action, "wrong_settings");
        
        /* access modifiers changed from: private */
        public final String analyticStatus;
        /* access modifiers changed from: private */
        public final int messageResId;

        private State(int i, String str) {
            this.messageResId = i;
            this.analyticStatus = str;
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.LocationServicesStateSection$a */
    public class C14924a extends BroadcastReceiver {
        public C14924a() {
        }

        public final void onReceive(Context context, Intent intent) {
            LocationServicesStateSection locationServicesStateSection = LocationServicesStateSection.this;
            int i = LocationServicesStateSection.f38179r;
            locationServicesStateSection.mo45126o2();
        }
    }

    public LocationServicesStateSection() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static /* synthetic */ void m37694m2(LocationServicesStateSection locationServicesStateSection, C16202a.C16203a aVar) {
        State state;
        locationServicesStateSection.getClass();
        if (aVar == null || !aVar.mo48507a() || !aVar.mo48509c()) {
            if (aVar == null || !aVar.mo48508b()) {
                state = State.WRONG_LOCATION_SETTINGS;
            } else {
                state = State.RESOLVABLE_WRONG_LOCATION_SETTINGS;
            }
            locationServicesStateSection.mo45125n2(state);
            return;
        }
        locationServicesStateSection.mo45125n2(State.ENABLED);
    }

    /* renamed from: n2 */
    public final void mo45125n2(State state) {
        if (getContext() != null && getView() != null && this.f38182p != state) {
            this.f38182p = state;
            UiUtils.m40233A(this.f38183q, state.messageResId);
            Context context = this.f38183q.getContext();
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.CONTENT_SHOWN);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "location_services_bar");
            aVar.mo49939g(AnalyticsAttributeKey.STATUS, this.f38182p.analyticStatus);
            aVar.mo49941i(AnalyticsAttributeKey.IS_LOCATION_ENABLED, C20934d0.m49034e(context));
            aVar.mo49939g(AnalyticsAttributeKey.LOCATION_PERMISSIONS, C0016g.m21d(context));
            aVar.mo49939g(AnalyticsAttributeKey.LOCATION_PROVIDERS, C0016g.m22e(context));
            mo46797j2(aVar.mo49933a());
        }
    }

    /* renamed from: o2 */
    public final void mo45126o2() {
        A a = this.f40822c;
        if (a != null && this.f38183q != null) {
            C16202a aVar = C16202a.get(a);
            if (!aVar.hasLocationPermissions()) {
                mo45125n2(State.MISSING_LOCATION_PERMISSION);
            } else {
                aVar.requestLocationSettings().addOnSuccessListener((Activity) a, new C17843u(this, 2));
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        State state;
        super.onCreate(bundle);
        if (bundle != null) {
            state = (State) bundle.getSerializable("state");
        } else {
            state = null;
        }
        if (state == null) {
            state = State.ENABLED;
        }
        this.f38182p = state;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.location_services_state_section_fragment, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.location_services_message);
        this.f38183q = textView;
        textView.setOnClickListener(new C4052r(this, 8));
        return inflate;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putSerializable("state", this.f38182p);
    }

    public final void onStart() {
        super.onStart();
        A a = this.f40822c;
        C16202a.registerPassiveBroadcastReceiver(a, this.f38180n);
        C16202a.get(a).addSettingsChangeListener(this.f38181o);
        mo45126o2();
    }

    public final void onStop() {
        super.onStop();
        A a = this.f40822c;
        C16202a.get(a).removeSettingsChangeListener(this.f38181o);
        C16202a.unregisterPassiveBroadcastReceiver(a, this.f38180n);
    }
}
