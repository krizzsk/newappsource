package com.moovit.app.lineschedule;

import a00.C13382a;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentContainerView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b00.C13556a;
import c00.C13717b;
import c70.C13752e;
import ce0.C21100e;
import com.appsflyer.internal.referrer.Payload;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.itinerary.C15035a;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemLayout;
import com.moovit.location.C16202a;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitStop;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import ga0.C12699d;
import h20.C17296a;
import h20.C17297b;
import i00.C17525d;
import ja0.C12793c;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import o00.C18666c;
import o00.C18669f;
import o00.C18671h;
import o00.C18675k;
import p259t5.C6593c;
import p471eq.C16850a;
import p495fq.C17057b;
import p543hq.C17474b;
import p547hu.C17496e;
import p547hu.C17497f;
import p824tp.C19728f;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;
import q00.C19047a;

public class LineScheduleActivity extends MoovitAppActivity implements C15035a.C15037b {

    /* renamed from: w0 */
    public static final /* synthetic */ int f38859w0 = 0;

    /* renamed from: U */
    public final C15112a f38860U = new C15112a();

    /* renamed from: X */
    public final C17057b f38861X = new C17057b(this, 1);

    /* renamed from: Y */
    public ServerId f38862Y;

    /* renamed from: Z */
    public ArrayList f38863Z;

    /* renamed from: l0 */
    public ServerId f38864l0;

    /* renamed from: m0 */
    public ServerId f38865m0 = null;

    /* renamed from: n0 */
    public Time f38866n0;

    /* renamed from: o0 */
    public RecyclerView f38867o0;

    /* renamed from: p0 */
    public ViewGroup f38868p0;

    /* renamed from: q0 */
    public TextView f38869q0;

    /* renamed from: r0 */
    public ListItemLayout f38870r0;

    /* renamed from: s0 */
    public C13556a f38871s0 = null;

    /* renamed from: t0 */
    public C17496e f38872t0 = null;

    /* renamed from: u0 */
    public C17297b f38873u0 = null;

    /* renamed from: v0 */
    public C17497f f38874v0 = null;

    /* renamed from: com.moovit.app.lineschedule.LineScheduleActivity$a */
    public class C15112a implements C20437h<C17296a, C17297b> {
        public C15112a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17296a aVar = (C17296a) cVar;
            LineScheduleActivity.this.f38871s0 = null;
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C17296a aVar = (C17296a) cVar;
            LineScheduleActivity.this.f38867o0.mo4627l0(new C18671h(R.layout.response_read_error_view));
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C17296a aVar = (C17296a) cVar;
            LineScheduleActivity.this.f38867o0.mo4627l0(new C18671h(R.layout.request_send_error_view));
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C17296a aVar = (C17296a) cVar;
            LineScheduleActivity.this.f38867o0.mo4627l0(new C18671h(R.layout.response_read_error_view));
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C17296a aVar = (C17296a) cVar;
            LineScheduleActivity lineScheduleActivity = LineScheduleActivity.this;
            int i = LineScheduleActivity.f38859w0;
            lineScheduleActivity.mo45477A2((C17297b) gVar);
        }
    }

    /* renamed from: com.moovit.app.lineschedule.LineScheduleActivity$b */
    public class C15113b implements View.OnClickListener {
        public C15113b() {
        }

        public final void onClick(View view) {
            LineScheduleActivity lineScheduleActivity = LineScheduleActivity.this;
            if (lineScheduleActivity.f38866n0 != null) {
                C12699d.C12701b bVar = new C12699d.C12701b(lineScheduleActivity.getResources());
                bVar.mo39494d("day_picker_dialog_fragment_tag");
                bVar.mo39483e(1);
                bVar.mo39486h(view.getContext());
                bVar.mo39493c(R.string.done);
                bVar.mo39492b(R.string.cancel);
                bVar.mo39487i(LineScheduleActivity.this.f38866n0.mo24631g());
                bVar.mo39489k().show(LineScheduleActivity.this.getSupportFragmentManager(), "day_picker_dialog_fragment_tag");
            }
        }
    }

    /* renamed from: y2 */
    public static Intent m38522y2(Context context, ServerId serverId, List<ServerId> list, ServerId serverId2, ServerId serverId3, Time time) {
        Intent intent = new Intent(context, LineScheduleActivity.class);
        intent.putExtra("lineGroupId", serverId);
        intent.putExtra("lineIds", C13717b.m34264k(list));
        intent.putExtra("originStopId", serverId2);
        intent.putExtra("destStopId", serverId3);
        intent.putExtra("date", time);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo45477A2(C17297b bVar) {
        C21100e.m49373x(bVar, Payload.RESPONSE);
        this.f38873u0 = bVar;
        C17496e eVar = this.f38872t0;
        if (eVar != null) {
            eVar.cancel(true);
            this.f38872t0 = null;
        }
        C13752e x1 = mo44548x1();
        HashSet hashSet = C19728f.f50164e;
        C19728f fVar = (C19728f) getSystemService("metro_context");
        Time time = this.f38866n0;
        if (time == null) {
            time = Time.m17980k();
        }
        C17496e eVar2 = new C17496e(x1, fVar, time, this.f38863Z, this.f38864l0, this.f38865m0, bVar, this.f38861X);
        eVar2.execute(new C17497f[]{this.f38874v0});
        this.f38872t0 = eVar2;
    }

    /* renamed from: B2 */
    public final void mo45478B2(String str) {
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.LAYOUT_CHANGED);
        aVar.mo49939g(AnalyticsAttributeKey.FULL_SCHEDULE_DISPLAY_TYPE, str);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: C2 */
    public final void mo45479C2(TransitStop transitStop) {
        TextView textView = (TextView) UiUtils.m40241I(this.f38870r0, R.id.title, "title");
        ImageView imageView = (ImageView) UiUtils.m40241I(this.f38870r0, R.id.accessory, "accessory");
        if (transitStop == null) {
            textView.setText(R.string.line_schedule_destination_option_all);
            imageView.setImageResource(R.drawable.ic_search_24_on_surface_emphasis_medium);
            imageView.setOnClickListener((View.OnClickListener) null);
            imageView.setClickable(false);
            imageView.setContentDescription(getString(R.string.voice_over_info));
            return;
        }
        textView.setText(transitStop.f23731c);
        imageView.setImageResource(R.drawable.ic_close_24_on_surface_emphasis_medium);
        imageView.setOnClickListener(new C6593c(this, 17));
        imageView.setContentDescription(getString(R.string.voice_over_filter_delete));
    }

    /* renamed from: S1 */
    public final void mo19483S1(int i, String str) {
        if ("day_picker_dialog_fragment_tag".equals(str) && i == -1) {
            mo45480z2(new Time(((C12699d) mo44539t1(str)).mo39477W1()));
        }
    }

    /* renamed from: T1 */
    public final void mo19422T1() {
        super.mo19422T1();
        C13556a aVar = this.f38871s0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f38871s0 = null;
        }
        C17496e eVar = this.f38872t0;
        if (eVar != null) {
            eVar.cancel(true);
            this.f38872t0 = null;
        }
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        Intent intent = getIntent();
        ServerId serverId = (ServerId) intent.getParcelableExtra("lineGroupId");
        this.f38862Y = serverId;
        if (serverId == null) {
            finish();
            return;
        }
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("lineIds");
        this.f38863Z = parcelableArrayListExtra;
        if (C13717b.m34258e(parcelableArrayListExtra)) {
            finish();
            return;
        }
        this.f38864l0 = (ServerId) intent.getParcelableExtra("originStopId");
        this.f38865m0 = (ServerId) intent.getParcelableExtra("destStopId");
        if (this.f38864l0 == null) {
            finish();
            return;
        }
        setContentView((int) R.layout.line_schedule_activity);
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo791m(true);
            supportActionBar.mo792n();
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.schedule_list);
        this.f38867o0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f38867o0.mo4593g(new C18666c(C17525d.m43657c(this)), -1);
        this.f38867o0.mo4593g(C18669f.m45651e(UiUtils.m40249h(getResources(), 24.0f)), -1);
        this.f38867o0.mo4593g(new C18675k(this, R.drawable.shadow_scroll), -1);
        this.f38869q0 = (TextView) findViewById(R.id.day_title);
        findViewById(R.id.day_picker).setOnClickListener(new C15113b());
        ListItemLayout listItemLayout = (ListItemLayout) findViewById(R.id.change_destination_stop);
        this.f38870r0 = listItemLayout;
        listItemLayout.setOnClickListener(new C16850a(this, 15));
        C13382a.m33674j(this.f38870r0, getString(R.string.line_schedule_destination_option_all), getString(R.string.voice_over_destination_station_hint));
        this.f38868p0 = (ViewGroup) findViewById(R.id.stops_header);
        Time time = (Time) intent.getParcelableExtra("date");
        if (time == null) {
            time = new Time(System.currentTimeMillis());
        }
        mo45480z2(time);
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo44542u1());
        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.LINE_SCHEDULE_SCREEN_BANNER, hVar);
    }

    /* renamed from: g */
    public final void mo45307g(TransitStop transitStop) {
        ServerId serverId;
        if (transitStop == null) {
            serverId = null;
        } else {
            serverId = transitStop.f23730b;
        }
        this.f38865m0 = serverId;
        mo45479C2(transitStop);
        C17297b bVar = this.f38873u0;
        if (bVar != null) {
            mo45477A2(bVar);
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("GTFS_METRO_ENTITIES_LOADER");
        hashSet.add("GTFS_TRIPS_SCHEDULE_LOADER");
        return s1;
    }

    /* renamed from: z2 */
    public final void mo45480z2(Time time) {
        boolean z;
        String str;
        Time time2 = this.f38866n0;
        if (time2 == null || !C7925b.m18027o(time2.mo24631g(), time.mo24631g())) {
            this.f38866n0 = time;
            this.f38869q0.setText(C7925b.m18017e(this, time.mo24631g()));
            long g = time.mo24631g();
            if (DateUtils.isToday(g) || C7925b.m18029q(g)) {
                z = true;
            } else {
                z = false;
            }
            TextView textView = this.f38869q0;
            if (z) {
                str = C7925b.m18017e(this, g);
            } else {
                str = DateUtils.formatDateTime(this, g, 26);
            }
            textView.setContentDescription(str);
            C13556a aVar = this.f38871s0;
            if (aVar != null) {
                aVar.cancel(true);
                this.f38871s0 = null;
            }
            C17496e eVar = this.f38872t0;
            if (eVar != null) {
                eVar.cancel(true);
                this.f38872t0 = null;
            }
            this.f38873u0 = null;
            this.f38874v0 = null;
            this.f38867o0.mo4627l0(new C12793c());
            HashSet hashSet = C19728f.f50164e;
            C19047a.C19048a aVar2 = C19047a.f48441d;
            C17296a aVar3 = new C17296a(mo44548x1(), (C19728f) getSystemService("metro_context"), (C19047a) getSystemService("user_configuration"), this.f38862Y, this.f38866n0, false);
            this.f38871s0 = mo44528l2(aVar3.f44679B, aVar3, this.f38860U);
        }
    }
}
