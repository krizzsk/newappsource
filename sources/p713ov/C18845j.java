package p713ov;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import com.moovit.app.ridesharing.booking.EventBookingActivity;
import com.moovit.app.ridesharing.booking.EventBookingCart;
import com.moovit.app.search.AppSearchLocationCallback;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventBookingBucket;
import com.moovit.search.SearchLocationActivity;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import j20.C17706c;
import j20.C17708e;
import java.text.SimpleDateFormat;
import p073e7.C4583a;
import p259t5.C6593c;
import p801sq.C19519h;
import p824tp.C19728f;
import p858uz.C20061g;
import p977zz.C20934d0;
import p977zz.C20964s0;

/* renamed from: ov.j */
public class C18845j extends C18831a {

    /* renamed from: r */
    public static final /* synthetic */ int f47983r = 0;

    /* renamed from: o */
    public MapFragment f47984o;

    /* renamed from: p */
    public View f47985p;

    /* renamed from: q */
    public View f47986q;

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getActivity()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: n2 */
    public final int mo51314n2() {
        return "arrival_user_location_fragment_tag".equals(getTag()) ? R.string.event_booking_user_location_arrival_step_title : R.string.event_booking_user_location_return_step_title;
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1567 && i != 1568) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && intent != null) {
            mo51332s2((LocationDescriptor) intent.getParcelableExtra("search_result"));
            UiUtils.m40252k(getView());
        } else if (i2 == 0 && i == 1568) {
            ((EventBookingActivity) this.f40822c).getSupportFragmentManager().mo3939T();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            mo51335v2(mo51316p2().f39351c);
            boolean equals = "arrival_user_location_fragment_tag".equals(getTag());
            EventBookingCart o2 = mo51315o2();
            if (equals && o2.f39346e.f39358c == null) {
                mo51336w2(1568);
            } else if (!equals && o2.f39347f.f39358c == null) {
                mo51336w2(1568);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        String str2;
        View inflate = layoutInflater.inflate(R.layout.event_booking_step_pick_location, viewGroup, false);
        MapFragment mapFragment = (MapFragment) getChildFragmentManager().mo3983z(R.id.map_fragment);
        this.f47984o = mapFragment;
        mapFragment.mo48656t2(new C18844i(this));
        MapFragment mapFragment2 = this.f47984o;
        mapFragment2.f42379s0 = false;
        if (mapFragment2.mo48624U2()) {
            mapFragment2.f42368n.mo48797l(false);
        }
        MapFragment mapFragment3 = this.f47984o;
        if (mapFragment3.f42373p0) {
            mapFragment3.f42373p0 = false;
            mapFragment3.mo48659u3();
        }
        this.f47984o.mo48640k3(MapFragment.MapFollowMode.NONE);
        this.f47984o.mo48651q3(false);
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.event_descriptor);
        EventBookingCart o2 = mo51315o2();
        EventBookingBucket eventBookingBucket = o2.f39344c;
        if (eventBookingBucket != null) {
            listItemView.setTitle((CharSequence) eventBookingBucket.f42922d);
            Context context = listItemView.getContext();
            EventBookingBucket eventBookingBucket2 = o2.f39344c;
            if (C7925b.m18027o(eventBookingBucket2.f42923e, eventBookingBucket2.f42924f)) {
                str2 = C7925b.m18015c(context, eventBookingBucket2.f42923e);
            } else {
                str2 = DateUtils.formatDateRange(context, eventBookingBucket2.f42923e, eventBookingBucket2.f42924f, SQLiteDatabase.OPEN_FULLMUTEX);
            }
            listItemView.setSubtitle((CharSequence) str2);
        } else {
            listItemView.setTitle((CharSequence) o2.f39343b.f42913d);
            Context context2 = listItemView.getContext();
            Event event = o2.f39343b;
            if (event.mo49163b()) {
                long j = event.f42917h;
                long j2 = event.f42918i;
                SimpleDateFormat simpleDateFormat = C7925b.f23934a;
                str = DateUtils.formatDateRange(context2, j, j2, SQLiteDatabase.OPEN_FULLMUTEX);
            } else {
                str = C7925b.m18018f(context2, event.f42917h, false);
            }
            String string = context2.getString(R.string.string_list_delimiter_dot);
            String str3 = event.f42915f;
            listItemView.setSubtitle((CharSequence) str + string + str3);
        }
        ((TextView) inflate.findViewById(R.id.user_location)).setOnClickListener(new C6593c(this, 25));
        this.f47985p = inflate.findViewById(R.id.distance_alert);
        View findViewById = inflate.findViewById(R.id.next_button);
        this.f47986q = findViewById;
        findViewById.setOnClickListener(new C4583a(this, 22));
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LocationDescriptor r2 = mo51331r2();
        if (r2 != null) {
            mo51332s2(r2);
        }
    }

    /* renamed from: r2 */
    public final LocationDescriptor mo51331r2() {
        EventBookingCart o2 = mo51315o2();
        if ("arrival_user_location_fragment_tag".equals(getTag())) {
            return o2.f39346e.f39358c;
        }
        return o2.f39347f.f39358c;
    }

    /* renamed from: s2 */
    public final void mo51332s2(LocationDescriptor locationDescriptor) {
        boolean z;
        boolean z2;
        LocationDescriptor locationDescriptor2;
        mo46799l2(R.id.progress_bar).setVisibility(8);
        boolean z3 = false;
        mo46799l2(R.id.main).setVisibility(0);
        if (locationDescriptor == null || !LocationDescriptor.LocationType.CURRENT.equals(locationDescriptor.f23647b)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (!C20934d0.m49032c(this.f40822c) || mo46780O1() == null) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                locationDescriptor2 = LocationDescriptor.m17770k(LatLonE6.m40177j(mo46780O1()));
            } else {
                locationDescriptor2 = null;
            }
            mo51335v2(locationDescriptor2);
        } else {
            mo51335v2(locationDescriptor);
        }
        if (this.f47986q != null) {
            LocationDescriptor r2 = mo51331r2();
            View view = this.f47986q;
            if (r2 != null) {
                z3 = true;
            }
            view.setEnabled(z3);
        }
        LocationDescriptor r22 = mo51331r2();
        if (r22 == null) {
            mo51334u2();
            return;
        }
        Tasks.call(MoovitExecutors.f37327IO, new C17708e(getContext(), C19728f.m47195a(getContext()), r22, true)).continueWith(MoovitExecutors.COMPUTATION, new C17706c()).addOnCompleteListener((Activity) getActivity(), new C19519h(this, 1));
    }

    /* renamed from: t2 */
    public final void mo51333t2() {
        LocationDescriptor r2;
        if (this.f47984o.mo48624U2() && (r2 = mo51331r2()) != null) {
            this.f47984o.mo48609E2();
            if (r2.mo24310d() != null) {
                this.f47984o.mo48663x2(r2.mo24310d());
                MarkerZoomStyle markerZoomStyle = new MarkerZoomStyle(new ResourceImage(R.drawable.ic_map_pin_36_secondary, new String[0]));
                MapFragment mapFragment = this.f47984o;
                LatLonE6 d = r2.mo24310d();
                mapFragment.mo48646o2(d, d, markerZoomStyle);
            }
        }
    }

    /* renamed from: u2 */
    public final void mo51334u2() {
        String str;
        View view = getView();
        if (view != null) {
            LocationDescriptor r2 = mo51331r2();
            if (r2 != null && C20964s0.m49090h(r2.mo24313f())) {
                r2.f23651f = getString(R.string.map_tapped_location);
            }
            TextView textView = (TextView) view.findViewById(R.id.user_location);
            if (r2 == null) {
                str = getString(R.string.choose_location);
            } else {
                str = r2.mo24313f();
            }
            textView.setText(str);
            mo51333t2();
            Event event = mo51315o2().f39343b;
            LocationDescriptor r22 = mo51331r2();
            int i = 8;
            if (event == null || r22 == null || r22.mo24310d() == null) {
                this.f47985p.setVisibility(8);
                return;
            }
            LatLonE6 d = r22.mo24310d();
            LatLonE6 latLonE6 = event.f42916g;
            d.getClass();
            float c = LatLonE6.m40174c(d, latLonE6);
            View view2 = this.f47985p;
            if (c <= 1000.0f) {
                i = 0;
            }
            view2.setVisibility(i);
        }
    }

    /* renamed from: v2 */
    public final void mo51335v2(LocationDescriptor locationDescriptor) {
        EventBookingCart o2 = mo51315o2();
        if ("arrival_user_location_fragment_tag".equals(getTag())) {
            o2.f39346e.f39358c = locationDescriptor;
        } else {
            o2.f39347f.f39358c = locationDescriptor;
        }
    }

    /* renamed from: w2 */
    public final void mo51336w2(int i) {
        Context context = getContext();
        if (context != null) {
            Intent y2 = SearchLocationActivity.m17347y2(context, new AppSearchLocationCallback(mo51314n2(), 0, true, true, true), "ride_sharing", (String) null);
            if (i == 1568) {
                y2.addFlags(SQLiteDatabase.OPEN_FULLMUTEX);
            }
            startActivityForResult(y2, i);
        }
    }
}
