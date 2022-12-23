package p572iw;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0942l;
import androidx.fragment.app.FragmentManager;
import c00.C13723g;
import com.moovit.accessibility.AccessibilityPersonalPrefs;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.suggestedroutes.TripPlanOptions;
import com.moovit.app.suggestedroutes.TripPlanOptionsActivity;
import com.moovit.app.tripplanner.C15581b;
import com.moovit.tripplanner.TripPlannerAlgorithmType;
import com.moovit.tripplanner.TripPlannerOptions;
import com.moovit.tripplanner.TripPlannerPersonalPrefs;
import com.moovit.tripplanner.TripPlannerRouteType;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.tripplanner.TripPlannerTime;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.moovit.tripplanner.TripPlannerTransportTypeInfo;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import ga0.C12699d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import p001a0.C0016g;
import p073e7.C4583a;
import p259t5.C6593c;
import p501fw.C17102a;
import p543hq.C17474b;
import p584jl.C17885a;
import p589jq.C17909a;
import p716oy.C18860a;
import p874vr.C20199a;
import p977zz.C20930c;
import p977zz.C20936e0;
import q00.C19047a;
import q00.C19053d;
import v90.C13187a;

/* renamed from: iw.f */
public class C17663f extends C15581b<TripPlanOptions> {

    /* renamed from: x */
    public static final /* synthetic */ int f45392x = 0;

    /* renamed from: s */
    public TextView f45393s;

    /* renamed from: t */
    public TextView f45394t;

    /* renamed from: u */
    public Button f45395u;

    /* renamed from: v */
    public Button f45396v;

    /* renamed from: w */
    public TextView f45397w;

    /* renamed from: iw.f$a */
    public static /* synthetic */ class C17664a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f45398a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.moovit.app.suggestedroutes.TimeQuickAction[] r0 = com.moovit.app.suggestedroutes.TimeQuickAction.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f45398a = r0
                com.moovit.app.suggestedroutes.TimeQuickAction r1 = com.moovit.app.suggestedroutes.TimeQuickAction.DEPART_NOW     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f45398a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.suggestedroutes.TimeQuickAction r1 = com.moovit.app.suggestedroutes.TimeQuickAction.DEPART_AT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f45398a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.suggestedroutes.TimeQuickAction r1 = com.moovit.app.suggestedroutes.TimeQuickAction.ARRIVE_BY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f45398a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.suggestedroutes.TimeQuickAction r1 = com.moovit.app.suggestedroutes.TimeQuickAction.TAKE_LAST_LINE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p572iw.C17663f.C17664a.<clinit>():void");
        }
    }

    /* renamed from: t2 */
    public static C17663f m43826t2(TripPlanOptions tripPlanOptions) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("options", tripPlanOptions);
        C17663f fVar = new C17663f();
        fVar.setArguments(bundle);
        return fVar;
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        HashSet hashSet = new HashSet(3);
        hashSet.add("CONFIGURATION");
        hashSet.add("TRIP_PLANNER_CONFIGURATION");
        hashSet.add("ACCESSIBILITY_CONFIGURATION");
        return hashSet;
    }

    /* renamed from: Z1 */
    public final void mo40440Z1(int i, String str) {
        TripPlannerTime tripPlannerTime;
        if ("trip_plan_time_tag".equals(str)) {
            if (i == -1) {
                C12699d dVar = (C12699d) getFragmentManager().mo3923A(str);
                if (dVar.f31361z) {
                    tripPlannerTime = null;
                } else {
                    tripPlannerTime = new TripPlannerTime(TripPlannerTime.Type.CODER.mo51916a(dVar.getArguments().getShort("time_type")), dVar.mo39477W1());
                }
                mo50114u2(tripPlannerTime, 0);
            }
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.EDIT_TIME_DIALOG);
            aVar.mo49939g(AnalyticsAttributeKey.DIALOG_ACTION_TYPE, C0016g.m17G(i));
            mo46797j2(aVar.mo49933a());
        }
    }

    /* renamed from: n2 */
    public final TripPlannerOptions mo40550n2() {
        C13187a aVar = (C13187a) mo46776J1("TRIP_PLANNER_CONFIGURATION");
        return new TripPlanOptions(TripPlannerTime.m17899f(), aVar.mo40061b(), aVar.mo40063d(), aVar.mo40062c(), aVar.mo40060a(), ((C17909a) mo46776J1("ACCESSIBILITY_CONFIGURATION")).mo50463a());
    }

    /* renamed from: o2 */
    public final void mo40551o2(View view) {
        int i;
        int i2;
        int i3;
        Context context = view.getContext();
        TextView textView = (TextView) view.findViewById(R.id.time_picker);
        this.f45393s = textView;
        textView.setOnClickListener(new C17662e(this, 0));
        Button button = (Button) view.findViewById(R.id.route_options);
        TripPlannerAlgorithmType tripPlannerAlgorithmType = C18860a.m45884a().f48028p;
        TripPlannerAlgorithmType tripPlannerAlgorithmType2 = TripPlannerAlgorithmType.PREFERRED;
        if (tripPlannerAlgorithmType == tripPlannerAlgorithmType2) {
            i = R.drawable.ic_preferences_16;
        } else {
            i = R.drawable.ic_filter_16;
        }
        C17885a.m44467v0(button, i);
        if (C18860a.m45884a().f48028p == tripPlannerAlgorithmType2) {
            i2 = R.string.trip_plan_trip_preference_label;
        } else {
            i2 = R.string.trip_plan_preference_label;
        }
        button.setText(i2);
        button.setOnClickListener(new C6593c(this, 29));
        this.f45394t = (TextView) view.findViewById(R.id.badge);
        int intValue = ((Integer) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51283j1)).intValue();
        View findViewById = view.findViewById(R.id.earlier_later_group);
        if (intValue > 0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        findViewById.setVisibility(i3);
        Locale b = C20930c.m49020b(context);
        long millis = TimeUnit.MINUTES.toMillis((long) intValue);
        String g = C7925b.m18019g(context, millis);
        Button button2 = (Button) view.findViewById(R.id.earlier_button);
        this.f45395u = button2;
        button2.setText(String.format(b, "- %s", new Object[]{g}));
        this.f45395u.setTag(Long.valueOf(millis));
        this.f45395u.setOnClickListener(new C4583a(this, 27));
        Button button3 = (Button) view.findViewById(R.id.later_button);
        this.f45396v = button3;
        button3.setText(String.format(b, "+ %s", new Object[]{g}));
        this.f45396v.setTag(Long.valueOf(millis));
        this.f45396v.setOnClickListener(new C17102a(this, 1));
        this.f45397w = (TextView) view.findViewById(R.id.search_time);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        boolean z;
        String str;
        HashSet hashSet;
        if (i != 1374) {
            super.onActivityResult(i, i2, intent);
            return;
        }
        if (intent != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i3 = TripPlanOptionsActivity.f39809o0;
            TripPlannerRouteType tripPlannerRouteType = (TripPlannerRouteType) intent.getParcelableExtra("routeType");
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("transportTypes");
            if (parcelableArrayListExtra != null) {
                hashSet = new HashSet(parcelableArrayListExtra);
            } else {
                hashSet = null;
            }
            TripPlannerSortType tripPlannerSortType = (TripPlannerSortType) intent.getParcelableExtra("sortType");
            TripPlannerPersonalPrefs tripPlannerPersonalPrefs = (TripPlannerPersonalPrefs) intent.getParcelableExtra("personalPrefs");
            AccessibilityPersonalPrefs accessibilityPersonalPrefs = (AccessibilityPersonalPrefs) intent.getParcelableExtra("accessibilityPrefs");
            if (!(tripPlannerRouteType == null || hashSet == null || tripPlannerPersonalPrefs == null || accessibilityPersonalPrefs == null)) {
                mo46541p2(new TripPlanOptions(((TripPlanOptions) this.f40537p).f39803b, tripPlannerRouteType, hashSet, tripPlannerSortType, tripPlannerPersonalPrefs, accessibilityPersonalPrefs), 0);
            }
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.EDIT_ROUTE_TYPE_DIALOG);
        AnalyticsAttributeKey analyticsAttributeKey = AnalyticsAttributeKey.DIALOG_ACTION_TYPE;
        if (z) {
            str = "dialog_positive_btn";
        } else {
            str = "dialog_negative_btn";
        }
        aVar.mo49939g(analyticsAttributeKey, str);
        mo46797j2(aVar.mo49933a());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.trip_plan_options_fragment, viewGroup, false);
    }

    public final void onStop() {
        C0942l lVar;
        super.onStop();
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager != null && (lVar = (C0942l) fragmentManager.mo3923A("trip_plan_time_tag")) != null) {
            lVar.dismissAllowingStateLoss();
        }
    }

    /* renamed from: q2 */
    public final void mo40552q2(TripPlannerOptions tripPlannerOptions, long j) {
        int i;
        String str;
        boolean z;
        boolean z2;
        TripPlanOptions tripPlanOptions = (TripPlanOptions) tripPlannerOptions;
        if (mo46775H1()) {
            Context requireContext = requireContext();
            TripPlannerTime tripPlannerTime = tripPlanOptions.f39803b;
            int i2 = 0;
            if (tripPlannerTime.mo24489d()) {
                this.f45393s.setText(R.string.trip_plan_time);
                this.f45397w.setText(C7925b.m18024l(requireContext, j));
                this.f45395u.setEnabled(false);
                this.f45396v.setEnabled(true);
            } else if (tripPlannerTime.mo24488c()) {
                this.f45393s.setText(R.string.last_available_transit);
                this.f45397w.setText(R.string.last_available_transit);
                this.f45395u.setEnabled(false);
                this.f45396v.setEnabled(false);
            } else {
                long b = C7925b.m18014b(tripPlannerTime.mo24487b());
                if (TripPlannerTime.Type.DEPART.equals(tripPlannerTime.f23799b)) {
                    i = R.string.tripplan_itinerary_depart_picker;
                } else {
                    i = R.string.tripplan_itinerary_arrive_picker;
                }
                if (DateUtils.isToday(b)) {
                    str = requireContext.getString(i, new Object[]{C7925b.m18024l(requireContext, b)});
                } else {
                    str = C7925b.m18018f(requireContext, b, false);
                }
                this.f45393s.setText(str);
                this.f45397w.setText(C7925b.m18018f(requireContext, b, false));
                long b2 = C7925b.m18014b(System.currentTimeMillis());
                long b3 = C7925b.m18014b(mo50113s2());
                Button button = this.f45395u;
                if (b > b2) {
                    z = true;
                } else {
                    z = false;
                }
                button.setEnabled(z);
                Button button2 = this.f45396v;
                if (b < b3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                button2.setEnabled(z2);
            }
            TextView textView = this.f45393s;
            textView.setContentDescription(C15581b.m39816m2(requireContext, tripPlannerTime, textView.getText()));
            if (!mo46785T1("TRIP_PLANNER_CONFIGURATION")) {
                this.f45394t.setVisibility(4);
                return;
            }
            Set<TripPlannerTransportType> set = tripPlanOptions.f39805d;
            List<TripPlannerTransportTypeInfo> list = ((C13187a) mo46776J1("TRIP_PLANNER_CONFIGURATION")).f32742c;
            int max = Math.max(0, list.size() - C13723g.m34281b(list, new C17661d(set, 0)));
            String string = getString(R.string.format_number, Integer.valueOf(Math.min(max, 9)));
            if (max > 9) {
                string = C25541a.m63881k(string, "+");
            }
            this.f45394t.setText(string);
            TextView textView2 = this.f45394t;
            if (max <= 0) {
                i2 = 4;
            }
            textView2.setVisibility(i2);
        }
    }

    /* renamed from: r2 */
    public final TripPlannerTime mo50112r2(TripPlannerTime tripPlannerTime, long j) {
        TripPlannerTime.Type type = tripPlannerTime.f23799b;
        TripPlannerTime.Type type2 = TripPlannerTime.Type.DEPART;
        if (type != type2 && type != TripPlannerTime.Type.ARRIVE) {
            return null;
        }
        long b = C7925b.m18014b(System.currentTimeMillis());
        long b2 = C7925b.m18014b(mo50113s2());
        long b3 = C7925b.m18014b(this.f40538q + j);
        int i = C20936e0.f52684d;
        long max = Math.max(b, Math.min(b2, b3));
        if (!type2.equals(type) || b != max) {
            return new TripPlannerTime(type, max);
        }
        return TripPlannerTime.m17899f();
    }

    /* renamed from: s2 */
    public final long mo50113s2() {
        C19047a aVar;
        long j;
        if (mo46785T1("CONFIGURATION")) {
            aVar = (C19047a) mo46776J1("CONFIGURATION");
        } else {
            aVar = null;
        }
        if (aVar != null) {
            j = (long) ((Integer) aVar.mo51505b(C19053d.f48452D)).intValue();
        } else {
            j = 4;
        }
        return TimeUnit.DAYS.toMillis(j) + System.currentTimeMillis();
    }

    /* renamed from: u2 */
    public final void mo50114u2(TripPlannerTime tripPlannerTime, long j) {
        TripPlanOptions tripPlanOptions = (TripPlanOptions) this.f40537p;
        TripPlannerRouteType tripPlannerRouteType = tripPlanOptions.f39804c;
        Set<TripPlannerTransportType> set = tripPlanOptions.f39805d;
        TripPlannerSortType tripPlannerSortType = tripPlanOptions.f39806e;
        TripPlannerPersonalPrefs tripPlannerPersonalPrefs = tripPlanOptions.f39807f;
        AccessibilityPersonalPrefs accessibilityPersonalPrefs = tripPlanOptions.f39808g;
        if (tripPlannerTime == null) {
            tripPlannerTime = TripPlannerTime.m17899f();
        }
        mo46541p2(new TripPlanOptions(tripPlannerTime, tripPlannerRouteType, set, tripPlannerSortType, tripPlannerPersonalPrefs, accessibilityPersonalPrefs), j);
    }

    /* renamed from: v2 */
    public final void mo50115v2(TripPlannerTime.Type type) {
        Context context = getContext();
        FragmentManager fragmentManager = getFragmentManager();
        if (context != null && fragmentManager != null && fragmentManager.mo3923A("trip_plan_time_tag") == null) {
            C12699d.C12701b bVar = new C12699d.C12701b((Context) this.f40822c);
            bVar.mo39494d("trip_plan_time_tag");
            bVar.f31375b.putShort("time_type", TripPlannerTime.Type.CODER.mo51917b(type));
            bVar.mo39488j();
            bVar.f31375b.putLong("minTime", System.currentTimeMillis());
            bVar.f31375b.putLong("maxTime", mo50113s2());
            bVar.mo39483e(0);
            bVar.mo39486h(getContext());
            bVar.mo39485g();
            TripPlannerTime tripPlannerTime = ((TripPlanOptions) this.f40537p).f39803b;
            if (!tripPlannerTime.mo24488c() && !tripPlannerTime.mo24489d()) {
                bVar.mo39487i(tripPlannerTime.mo24487b());
            }
            C12699d k = bVar.mo39489k();
            k.setTargetFragment(this, 0);
            k.show(fragmentManager, "trip_plan_time_tag");
        }
    }
}
