package com.moovit.location;

import android.app.Activity;
import android.location.Location;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.app.home.dashboard.C14951n;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.location.C16202a;
import i20.C17544f;
import i20.C17545g;
import p028ba.C1513g;
import p824tp.C19740r;
import p824tp.C19742t;
import p824tp.C19746x;
import p853uu.C19996f;
import p858uz.C20061g;
import p977zz.C20934d0;

public class LocationAlertFragment extends C15682c<MoovitActivity> {

    /* renamed from: x */
    public static final /* synthetic */ int f42235x = 0;

    /* renamed from: n */
    public LatLonE6 f42236n;

    /* renamed from: o */
    public TextView f42237o;

    /* renamed from: p */
    public Button f42238p;

    /* renamed from: q */
    public C16202a.C16203a f42239q;

    /* renamed from: r */
    public Location f42240r;

    /* renamed from: s */
    public AlertStatus f42241s = AlertStatus.ALL_OK;

    /* renamed from: t */
    public C1513g f42242t = new C1513g(this, 10);

    /* renamed from: u */
    public final C19996f f42243u = new C19996f(this, 2);

    /* renamed from: v */
    public final C14951n f42244v = new C14951n(this, 1);

    /* renamed from: w */
    public final C17544f f42245w = new C17544f(this, 0);

    public enum AlertStatus {
        MISSING_LOCATION_PERMISSIONS(C19746x.edit_location_permission_message, C19746x.action_allow),
        DISABLED_LOCATION_PROVIDER(r2, C19746x.action_turn_on),
        LOCATION_ACCURACY_INSUFFICIENT(C19746x.user_gps_accuracy_low, 0),
        TOO_FAR_FROM_TRACKED_LOCATION(C19746x.user_far_from_station, 0),
        ALL_OK(0, 0),
        UNKNOWN(r2, 0);
        
        /* access modifiers changed from: private */
        public final int actionId;
        /* access modifiers changed from: private */
        public final int messageId;

        private AlertStatus(int i, int i2) {
            this.messageId = i;
            this.actionId = i2;
        }
    }

    /* renamed from: com.moovit.location.LocationAlertFragment$a */
    public static /* synthetic */ class C16196a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f42246a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.moovit.location.LocationAlertFragment$AlertStatus[] r0 = com.moovit.location.LocationAlertFragment.AlertStatus.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f42246a = r0
                com.moovit.location.LocationAlertFragment$AlertStatus r1 = com.moovit.location.LocationAlertFragment.AlertStatus.MISSING_LOCATION_PERMISSIONS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f42246a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.location.LocationAlertFragment$AlertStatus r1 = com.moovit.location.LocationAlertFragment.AlertStatus.DISABLED_LOCATION_PROVIDER     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.location.LocationAlertFragment.C16196a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.location.LocationAlertFragment$b */
    public interface C16197b {
        /* renamed from: O0 */
        void mo48511O0(AlertStatus alertStatus);
    }

    public LocationAlertFragment() {
        super(MoovitActivity.class);
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getContext()).getPermissionAwareRealTimeAccuracyFrequentUpdates();
    }

    /* renamed from: c2 */
    public final void mo46790c2(Location location) {
        this.f42240r = location;
        mo48519n2();
    }

    /* renamed from: m2 */
    public final AlertStatus mo48518m2() {
        if (this.f42239q == null) {
            return AlertStatus.UNKNOWN;
        }
        if (!C20934d0.m49032c(requireContext())) {
            return AlertStatus.MISSING_LOCATION_PERMISSIONS;
        }
        if (!this.f42239q.mo48507a() || !this.f42239q.mo48509c()) {
            return AlertStatus.DISABLED_LOCATION_PROVIDER;
        }
        Location location = this.f42240r;
        if (location == null) {
            return AlertStatus.UNKNOWN;
        }
        if (location.getAccuracy() > 10.0f) {
            return AlertStatus.LOCATION_ACCURACY_INSUFFICIENT;
        }
        if (LatLonE6.m40174c(LatLonE6.m40177j(this.f42240r), this.f42236n) > 500.0f) {
            return AlertStatus.TOO_FAR_FROM_TRACKED_LOCATION;
        }
        return AlertStatus.ALL_OK;
    }

    /* renamed from: n2 */
    public final void mo48519n2() {
        boolean z;
        AlertStatus m2 = mo48518m2();
        if (m2.equals(this.f42241s)) {
            z = false;
        } else {
            UiUtils.m40233A(this.f42237o, m2.messageId);
            UiUtils.m40233A(this.f42238p, m2.actionId);
            this.f42241s = m2;
            z = true;
        }
        if (z) {
            Fragment targetFragment = getTargetFragment();
            if (targetFragment instanceof C16197b) {
                ((C16197b) targetFragment).mo48511O0(m2);
            }
            FragmentActivity activity = getActivity();
            if (activity instanceof C16197b) {
                ((C16197b) activity).mo48511O0(m2);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        mo48519n2();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(C19742t.location_alert_fragment, viewGroup, false);
        LatLonE6 latLonE6 = (LatLonE6) getArguments().getParcelable("trackedLocation");
        C21100e.m49373x(latLonE6, "trackedLocation");
        this.f42236n = latLonE6;
        this.f42240r = mo46780O1();
        this.f42237o = (TextView) inflate.findViewById(C19740r.alert_message);
        Button button = (Button) inflate.findViewById(C19740r.alert_action);
        this.f42238p = button;
        button.setOnClickListener(new C17545g(this));
        return inflate;
    }

    public final void onPause() {
        super.onPause();
        C16202a.get(getContext()).removeSettingsChangeListener(this.f42244v);
    }

    public final void onResume() {
        super.onResume();
        A a = this.f40822c;
        C16202a aVar = C16202a.get(a);
        aVar.addSettingsChangeListener(this.f42244v);
        aVar.requestLocationSettings().addOnSuccessListener((Activity) a, this.f42243u);
    }
}
