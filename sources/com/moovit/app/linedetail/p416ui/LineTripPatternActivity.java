package com.moovit.app.linedetail.p416ui;

import aa0.C7535g;
import aa0.C7540l;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuItem;
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
import c00.C13722f;
import c00.C13723g;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ads.AdSource;
import com.moovit.app.ads.C14741h;
import com.moovit.app.ads.MoovitAnchoredBannerAdFragment;
import com.moovit.app.servicealerts.ServiceAlertDetailsActivity;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.Color;
import com.moovit.database.DbEntityRef;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.ImageSet;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.location.C16202a;
import com.moovit.map.C16281i;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.LongServerId;
import com.moovit.network.model.ServerId;
import com.moovit.request.UserRequestError;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.C7843b;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitLineGroup;
import com.moovit.transit.TransitPattern;
import com.moovit.transit.TransitPatternShape;
import com.moovit.transit.TransitPatternTrips;
import com.moovit.transit.TransitStop;
import com.moovit.transit.TripId;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import h20.C17296a;
import h20.C17297b;
import j80.C12775d;
import ja0.C12793c;
import ja0.C12797f;
import ja0.C12798g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import mf0.C24361g;
import o00.C18675k;
import o20.C18699e;
import p001a0.C0016g;
import p011aa.C0141e;
import p025b6.C1495h;
import p039c7.C1800c;
import p451du.C16720q;
import p451du.C16721r;
import p484ff.C16978i0;
import p543hq.C17474b;
import p567iq.C17635b;
import p567iq.C17637d;
import p613kq.C18118d;
import p824tp.C19728f;
import p858uz.C20061g;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20437h;
import p926xv.C20630k;
import p952yy.C20785a;
import p952yy.C20787c;
import p952yy.C20789d;
import p952yy.C20791e;
import p977zz.C20941h;
import p977zz.C20944i0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import q00.C19047a;
import z00.C20795a;

/* renamed from: com.moovit.app.linedetail.ui.LineTripPatternActivity */
public class LineTripPatternActivity extends MoovitAppActivity implements C20630k.C20631a {

    /* renamed from: E0 */
    public static final /* synthetic */ int f38762E0 = 0;

    /* renamed from: A0 */
    public C12798g f38763A0 = null;

    /* renamed from: B0 */
    public C18118d f38764B0;

    /* renamed from: C0 */
    public boolean f38765C0 = false;

    /* renamed from: D0 */
    public boolean f38766D0 = false;

    /* renamed from: U */
    public final C15095a f38767U = new C15095a();

    /* renamed from: X */
    public final C15096b f38768X = new C15096b();

    /* renamed from: Y */
    public final C15097c f38769Y = new C15097c();

    /* renamed from: Z */
    public final C15098d f38770Z = new C15098d();

    /* renamed from: l0 */
    public RecyclerView f38771l0;

    /* renamed from: m0 */
    public MapFragment f38772m0;

    /* renamed from: n0 */
    public ServerId f38773n0;

    /* renamed from: o0 */
    public ServerId f38774o0;

    /* renamed from: p0 */
    public ServerId f38775p0 = null;

    /* renamed from: q0 */
    public LongServerId f38776q0 = null;

    /* renamed from: r0 */
    public ServerId f38777r0 = null;

    /* renamed from: s0 */
    public int f38778s0;

    /* renamed from: t0 */
    public Time f38779t0;

    /* renamed from: u0 */
    public MenuItem f38780u0;

    /* renamed from: v0 */
    public C12775d f38781v0 = null;

    /* renamed from: w0 */
    public C13556a f38782w0 = null;

    /* renamed from: x0 */
    public C13556a f38783x0 = null;

    /* renamed from: y0 */
    public TransitLineGroup f38784y0 = null;

    /* renamed from: z0 */
    public TransitPatternTrips f38785z0 = null;

    /* renamed from: com.moovit.app.linedetail.ui.LineTripPatternActivity$a */
    public class C15095a implements C20437h<C17296a, C17297b> {
        public C15095a() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C17296a aVar = (C17296a) cVar;
            LineTripPatternActivity.this.f38782w0 = null;
        }

        /* renamed from: c */
        public final boolean mo315c(C20431c cVar, ServerException serverException) {
            C17296a aVar = (C17296a) cVar;
            if (serverException instanceof UserRequestError) {
                LineTripPatternActivity.this.f38771l0.setAdapter(new C20795a((Drawable) null, (CharSequence) null, ((UserRequestError) serverException).mo49161c()));
                return true;
            }
            LineTripPatternActivity lineTripPatternActivity = LineTripPatternActivity.this;
            int i = LineTripPatternActivity.f38762E0;
            lineTripPatternActivity.mo45441G2(R.string.response_read_error_message);
            return true;
        }

        /* renamed from: d */
        public final boolean mo316d(C20431c cVar, IOException iOException) {
            C17296a aVar = (C17296a) cVar;
            LineTripPatternActivity lineTripPatternActivity = LineTripPatternActivity.this;
            int i = LineTripPatternActivity.f38762E0;
            lineTripPatternActivity.mo45441G2(R.string.request_send_error_message);
            return true;
        }

        /* renamed from: i */
        public final boolean mo319i(C20431c cVar, IOException iOException) {
            C17296a aVar = (C17296a) cVar;
            LineTripPatternActivity lineTripPatternActivity = LineTripPatternActivity.this;
            int i = LineTripPatternActivity.f38762E0;
            lineTripPatternActivity.mo45441G2(R.string.response_read_error_message);
            return true;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            TransitPatternTrips transitPatternTrips;
            long j;
            C17296a aVar = (C17296a) cVar;
            C17297b bVar = (C17297b) gVar;
            LineTripPatternActivity lineTripPatternActivity = LineTripPatternActivity.this;
            C20944i0<TripId, Integer> i0Var = null;
            lineTripPatternActivity.f38782w0 = null;
            TransitLineGroup transitLineGroup = bVar.f44685m;
            if (transitLineGroup == null) {
                lineTripPatternActivity.mo45441G2(R.string.response_read_error_message);
                return;
            }
            Map<ServerId, List<TransitPatternTrips>> map = bVar.f44686n;
            ServerId serverId = lineTripPatternActivity.f38774o0;
            ServerId serverId2 = lineTripPatternActivity.f38775p0;
            if (!C13717b.m34259f(map)) {
                List list = map.get(serverId);
                if (!C13717b.m34258e(list)) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        transitPatternTrips = (TransitPatternTrips) it.next();
                        if (serverId2.equals(transitPatternTrips.f23717b.f23708b)) {
                            break;
                        }
                    }
                }
            }
            transitPatternTrips = null;
            if (transitPatternTrips != null) {
                i0Var = lineTripPatternActivity.mo45435A2(transitPatternTrips);
            }
            if (i0Var == null || !transitPatternTrips.f23718c.contains(i0Var.f52692a)) {
                Time time = lineTripPatternActivity.f38779t0;
                if (time != null) {
                    j = time.mo24631g();
                } else {
                    j = System.currentTimeMillis();
                }
                C7925b.m18017e(lineTripPatternActivity, j);
                lineTripPatternActivity.mo45441G2(R.string.response_read_error_message);
                return;
            }
            lineTripPatternActivity.mo45438D2(transitLineGroup, transitPatternTrips);
            lineTripPatternActivity.f38764B0.mo50565c();
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.LineTripPatternActivity$b */
    public class C15096b extends C0141e {
        public C15096b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C20789d dVar = (C20789d) cVar;
            LineTripPatternActivity.this.f38783x0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            Time m;
            C20789d dVar = (C20789d) cVar;
            C20787c cVar2 = ((C20791e) gVar).f52474m;
            if (cVar2 != null) {
                LineTripPatternActivity lineTripPatternActivity = LineTripPatternActivity.this;
                if (C20975x0.m49118e(lineTripPatternActivity.f38774o0, cVar2.f52456a) && C20975x0.m49118e(lineTripPatternActivity.f38777r0, cVar2.f52457b)) {
                    RecyclerView.Adapter adapter = lineTripPatternActivity.f38771l0.getAdapter();
                    if (adapter instanceof C15099e) {
                        C15099e eVar = (C15099e) adapter;
                        ArrayList<T> c = C13723g.m34282c(cVar2.f52458c.f23660b, lineTripPatternActivity.f38769Y);
                        if (!c.isEmpty() && (m = new Schedule(c, false).mo24326m()) != null) {
                            eVar.getClass();
                            eVar.f38794k = m;
                            eVar.notifyDataSetChanged();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.LineTripPatternActivity$c */
    public class C15097c implements C13722f<Time> {
        public C15097c() {
        }

        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            Time time = (Time) obj;
            if (!C20975x0.m49118e(LineTripPatternActivity.this.f38775p0, time.mo24630f()) || !C20975x0.m49118e(LineTripPatternActivity.this.f38776q0, time.f23904e) || !C20975x0.m49118e(Integer.valueOf(LineTripPatternActivity.this.f38778s0), Integer.valueOf(time.f23906g))) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.LineTripPatternActivity$d */
    public class C15098d extends C7540l {
        public C15098d() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x002a  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo19433a() {
            /*
                r11 = this;
                com.moovit.app.linedetail.ui.LineTripPatternActivity r0 = com.moovit.app.linedetail.p416ui.LineTripPatternActivity.this
                int r1 = com.moovit.app.linedetail.p416ui.LineTripPatternActivity.f38762E0
                c70.e r3 = r0.mo44548x1()
                if (r3 == 0) goto L_0x007f
                com.moovit.network.model.ServerId r1 = r0.f38774o0
                if (r1 == 0) goto L_0x007f
                com.moovit.network.model.ServerId r1 = r0.f38777r0
                if (r1 == 0) goto L_0x007f
                com.moovit.util.time.Time r1 = r0.f38779t0
                r9 = 1
                r2 = 0
                if (r1 == 0) goto L_0x0027
                long r4 = r1.mo24631g()
                java.text.SimpleDateFormat r1 = com.moovit.util.time.C7925b.f23934a
                boolean r1 = android.text.format.DateUtils.isToday(r4)
                if (r1 == 0) goto L_0x0025
                goto L_0x0027
            L_0x0025:
                r1 = 0
                goto L_0x0028
            L_0x0027:
                r1 = 1
            L_0x0028:
                if (r1 == 0) goto L_0x007f
                java.util.HashSet r1 = p824tp.C19728f.f50164e
                java.lang.String r1 = "metro_context"
                java.lang.Object r1 = r0.getSystemService(r1)
                r4 = r1
                tp.f r4 = (p824tp.C19728f) r4
                q00.a$a r1 = q00.C19047a.f48441d
                java.lang.String r1 = "user_configuration"
                java.lang.Object r1 = r0.getSystemService(r1)
                r5 = r1
                q00.a r5 = (q00.C19047a) r5
                java.lang.String r1 = "metroContext"
                ce0.C21100e.m49373x(r4, r1)
                java.lang.String r1 = "configuration"
                ce0.C21100e.m49373x(r5, r1)
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>()
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                yy.b r8 = new yy.b
                r8.<init>()
                com.moovit.network.model.ServerId r1 = r0.f38774o0
                com.moovit.network.model.ServerId r10 = r0.f38777r0
                r6.add(r1)
                r7.add(r10)
                r8.f52449c = r2
                r1 = -1
                r8.f52448b = r1
                yy.d r1 = new yy.d
                r2 = r1
                r2.<init>(r3, r4, r5, r6, r7, r8)
                java.lang.String r2 = r1.f52463B
                com.moovit.request.RequestOptions r3 = new com.moovit.request.RequestOptions
                r3.<init>()
                r3.f42909f = r9
                com.moovit.app.linedetail.ui.LineTripPatternActivity$b r4 = r0.f38768X
                b00.a r1 = r0.mo44527k2(r2, r1, r3, r4)
                r0.f38783x0 = r1
            L_0x007f:
                com.moovit.app.linedetail.ui.LineTripPatternActivity$d r0 = r0.f38770Z
                r0.mo23802c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.linedetail.p416ui.LineTripPatternActivity.C15098d.mo19433a():void");
        }

        /* renamed from: b */
        public final void mo21414b() {
            LineTripPatternActivity lineTripPatternActivity = LineTripPatternActivity.this;
            C13556a aVar = lineTripPatternActivity.f38783x0;
            if (aVar != null) {
                aVar.cancel(true);
                lineTripPatternActivity.f38783x0 = null;
            }
        }
    }

    /* renamed from: com.moovit.app.linedetail.ui.LineTripPatternActivity$e */
    public class C15099e extends RecyclerView.Adapter<C12797f> {

        /* renamed from: g */
        public final C7535g f38790g = new C7535g();

        /* renamed from: h */
        public final Calendar f38791h;

        /* renamed from: i */
        public final List<TransitStop> f38792i;

        /* renamed from: j */
        public final int[] f38793j;

        /* renamed from: k */
        public Time f38794k;

        public C15099e(Context context, List<TransitStop> list, int[] iArr, Time time) {
            HashSet hashSet = C19728f.f50164e;
            this.f38791h = Calendar.getInstance(((C19728f) context.getSystemService("metro_context")).f50165a.f16131f);
            this.f38792i = list;
            this.f38793j = iArr;
            C21100e.m49373x(time, "time");
            this.f38794k = time;
        }

        public final int getItemCount() {
            return this.f38792i.size() + 1;
        }

        public final int getItemViewType(int i) {
            return i != 0 ? i != 1 ? R.layout.line_trip_pattern_list_item : R.layout.line_trip_pattern_status_list_item : R.layout.line_trip_pattern_header_list_item;
        }

        /* renamed from: j */
        public final void mo45444j(C12797f fVar, int i, boolean z) {
            ((TextView) fVar.mo39639f(R.id.text)).setText(this.f38792i.get(i).f23731c);
            this.f38791h.setTimeInMillis(this.f38794k.mo24631g());
            this.f38791h.add(13, this.f38793j[i]);
            TextView textView = (TextView) fVar.mo39639f(R.id.time);
            String l = C7925b.m18024l(fVar.mo39638e(), this.f38791h.getTimeInMillis());
            CharSequence charSequence = l;
            if (z) {
                charSequence = l;
                if (Time.Status.CANCELED.equals(this.f38794k.f23910k)) {
                    charSequence = C20785a.m48770b(l);
                }
            }
            textView.setText(charSequence);
        }

        public final void onBindViewHolder(RecyclerView.C1119a0 a0Var, int i) {
            int i2;
            int i3;
            C12797f fVar = (C12797f) a0Var;
            int itemViewType = fVar.getItemViewType();
            if (itemViewType == R.layout.line_trip_pattern_header_list_item) {
                Context e = fVar.mo39638e();
                List<TransitStop> list = this.f38792i;
                TransitStop transitStop = list.get(list.size() - 1);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append(this.f38792i.get(0).f23731c);
                if (C20964s0.m49091i(transitStop.f23731c)) {
                    i2 = R.string.string_list_delimiter_arrow_left;
                } else {
                    i2 = R.string.string_list_delimiter_arrow_right;
                }
                spannableStringBuilder.append(e.getText(i2));
                spannableStringBuilder.append(transitStop.f23731c);
                ((TextView) fVar.mo39639f(R.id.title)).setText(spannableStringBuilder);
                ImageView imageView = (ImageView) fVar.mo39639f(R.id.action_map);
                LineTripPatternActivity lineTripPatternActivity = LineTripPatternActivity.this;
                if (lineTripPatternActivity.f38765C0) {
                    BottomSheetBehavior e2 = BottomSheetBehavior.m34710e(lineTripPatternActivity.f38771l0);
                    imageView.setOnClickListener(new C1800c(this, 12));
                    if (e2.f34359J == 3) {
                        i3 = R.drawable.ic_map_24_primary;
                    } else {
                        i3 = R.drawable.ic_view_list_24_primary;
                    }
                    imageView.setImageResource(i3);
                    imageView.setVisibility(0);
                    return;
                }
                imageView.setVisibility(8);
            } else if (itemViewType != R.layout.line_trip_pattern_status_list_item) {
                mo45444j(fVar, i - 1, false);
            } else {
                TextView textView = (TextView) fVar.mo39639f(R.id.status);
                if (!Time.Status.UNKNOWN.equals(this.f38794k.f23910k)) {
                    textView.setText(this.f38794k.f23910k.getTextResId());
                    textView.setTextColor(C20941h.m49043f(this.f38794k.f23910k.getColorAttrId(), textView.getContext()));
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
                mo45444j(fVar, i - 1, true);
            }
        }

        public final RecyclerView.C1119a0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C12797f(C13715c.m34239e(viewGroup, i, viewGroup, false));
        }
    }

    /* renamed from: z2 */
    public static Intent m38437z2(Context context, ServerId serverId, ServerId serverId2, ServerId serverId3, Time time) {
        ServerId f = time.mo24630f();
        LongServerId longServerId = time.f23904e;
        Long valueOf = Long.valueOf(time.f23901b);
        int i = time.f23906g;
        Intent intent = new Intent(context, LineTripPatternActivity.class);
        intent.putExtra("extra_line_group_id", serverId);
        intent.putExtra("extra_line_id", serverId2);
        intent.putExtra("extra_pattern_id", f);
        intent.putExtra("extra_server_trip_id", longServerId);
        if (valueOf != null) {
            intent.putExtra("extra_static_time", new Time(valueOf.longValue()));
        }
        if (serverId3 != null) {
            intent.putExtra("extra_stop_id", serverId3);
        }
        if (i != -1) {
            intent.putExtra("extra_stop_index", i);
        }
        return intent;
    }

    /* renamed from: A2 */
    public final C20944i0<TripId, Integer> mo45435A2(TransitPatternTrips transitPatternTrips) {
        boolean z;
        int i;
        int i2;
        TransitPattern transitPattern = transitPatternTrips.f23717b;
        if (this.f38777r0 == null && (i2 = this.f38778s0) != -1) {
            this.f38777r0 = transitPattern.mo24385c(i2);
        }
        ServerId serverId = this.f38777r0;
        boolean z2 = false;
        if (serverId == null || !transitPattern.mo24390g(serverId)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            this.f38777r0 = transitPattern.mo24385c(0);
        }
        ServerId serverId2 = this.f38777r0;
        int i3 = this.f38778s0;
        if (serverId2 != null && i3 >= 0 && i3 < transitPattern.mo24389f()) {
            z2 = C24361g.m61132B(transitPattern.mo24386d(serverId2), i3);
        }
        if (!z2) {
            ServerId serverId3 = this.f38777r0;
            Time s = transitPatternTrips.f23726k.get(serverId3).mo24328s(this.f38779t0);
            if (s != null) {
                i = s.f23906g;
            } else {
                i = transitPatternTrips.f23717b.mo24384b(serverId3);
            }
            this.f38778s0 = i;
        }
        for (TripId next : transitPatternTrips.f23718c) {
            if (next.f23764b.equals(this.f38776q0)) {
                Schedule b = transitPatternTrips.mo24403b(next);
                if (b == null) {
                    throw new IllegalStateException("Missing " + next + " schedule");
                } else if (b.mo24331u(this.f38778s0).compareTo(this.f38779t0) >= 0) {
                    return new C20944i0<>(next, Integer.valueOf(this.f38778s0));
                }
            }
        }
        StringBuilder k = C13555b.m33972k("Unable to find trip id for: serverId=");
        k.append(this.f38776q0);
        k.append(", time=");
        k.append(this.f38779t0);
        throw new IllegalStateException(k.toString());
    }

    /* renamed from: B2 */
    public final TransitLine mo45436B2() {
        ServerId serverId;
        TransitLineGroup transitLineGroup = this.f38784y0;
        if (transitLineGroup == null || (serverId = this.f38774o0) == null) {
            return null;
        }
        return transitLineGroup.mo24377c(serverId);
    }

    /* renamed from: C2 */
    public final TransitStop mo45437C2() {
        DbEntityRef dbEntityRef;
        TransitPatternTrips transitPatternTrips = this.f38785z0;
        if (transitPatternTrips == null || this.f38777r0 == null || (dbEntityRef = (DbEntityRef) C13723g.m34286g(transitPatternTrips.f23717b.f23709c, new C16721r(this, 0))) == null) {
            return null;
        }
        return (TransitStop) dbEntityRef.get();
    }

    /* renamed from: D2 */
    public final void mo45438D2(TransitLineGroup transitLineGroup, TransitPatternTrips transitPatternTrips) {
        boolean z;
        List<T> list;
        TransitLineGroup transitLineGroup2 = transitLineGroup;
        TransitPatternTrips transitPatternTrips2 = transitPatternTrips;
        this.f38784y0 = transitLineGroup2;
        this.f38785z0 = transitPatternTrips2;
        if (transitLineGroup2.f23695c != 2) {
            z = true;
        } else {
            z = false;
        }
        this.f38766D0 = z;
        C20944i0<TripId, Integer> A2 = mo45435A2(transitPatternTrips2);
        TransitLine c = transitLineGroup2.mo24377c(this.f38774o0);
        if (c != null) {
            HashSet hashSet = C19728f.f50164e;
            C16181a.m41233b(((C19728f) getSystemService("metro_context")).mo52082b(LinePresentationType.LINE_DETAIL), (ListItemView) findViewById(R.id.line_header), c);
        }
        C12798g gVar = this.f38763A0;
        if (gVar != null) {
            this.f38771l0.mo4568Z(gVar);
            this.f38763A0 = null;
        }
        C12798g e = C12798g.m32602e(1, this, transitLineGroup2);
        this.f38763A0 = e;
        this.f38771l0.mo4593g(e, -1);
        TripId tripId = (TripId) A2.f52692a;
        int intValue = ((Integer) A2.f52693b).intValue();
        List<T> entities = DbEntityRef.getEntities(transitPatternTrips2.f23717b.f23709c);
        Schedule b = transitPatternTrips2.mo24403b(tripId);
        if (b != null) {
            Time u = b.mo24331u(intValue);
            if (intValue == 0) {
                list = entities;
            } else {
                list = entities.subList(intValue, entities.size());
            }
            int[] iArr = new int[list.size()];
            for (int i = intValue; i < b.size(); i++) {
                iArr[i - intValue] = (int) TimeUnit.MILLISECONDS.toSeconds(b.mo24331u(i).mo24631g() - u.mo24631g());
            }
            this.f38771l0.setAdapter(new C15099e(this, list, iArr, u));
            mo45443y2(transitLineGroup2, transitPatternTrips2, (TripId) A2.f52692a, this.f38777r0);
            supportInvalidateOptionsMenu();
            this.f38770Z.mo23804e();
            return;
        }
        throw new IllegalStateException("Missing trip id " + tripId);
    }

    /* renamed from: E2 */
    public final void mo45439E2(Intent intent, Bundle bundle) {
        TransitPatternTrips transitPatternTrips;
        TransitLineGroup transitLineGroup;
        ServerId serverId = (ServerId) intent.getParcelableExtra("extra_line_group_id");
        this.f38773n0 = serverId;
        if (serverId != null) {
            ServerId serverId2 = (ServerId) intent.getParcelableExtra("extra_line_id");
            this.f38774o0 = serverId2;
            if (serverId2 != null) {
                ServerId serverId3 = (ServerId) intent.getParcelableExtra("extra_pattern_id");
                this.f38775p0 = serverId3;
                if (serverId3 != null) {
                    LongServerId longServerId = (LongServerId) intent.getParcelableExtra("extra_server_trip_id");
                    this.f38776q0 = longServerId;
                    if (longServerId != null) {
                        this.f38777r0 = (ServerId) intent.getParcelableExtra("extra_stop_id");
                        this.f38778s0 = intent.getIntExtra("extra_stop_index", -1);
                        Time time = (Time) intent.getParcelableExtra("extra_static_time");
                        this.f38779t0 = time;
                        if (time == null) {
                            this.f38779t0 = Time.m17980k();
                        }
                        if (bundle != null) {
                            transitLineGroup = (TransitLineGroup) bundle.getParcelable("lineGroup");
                            transitPatternTrips = (TransitPatternTrips) bundle.getParcelable("patternTrips");
                        } else {
                            transitPatternTrips = null;
                            transitLineGroup = null;
                        }
                        if (transitLineGroup == null || transitPatternTrips == null) {
                            Time time2 = this.f38779t0;
                            this.f38771l0.setAdapter(new C12793c());
                            C13556a aVar = this.f38782w0;
                            if (aVar != null) {
                                aVar.cancel(true);
                                this.f38782w0 = null;
                            }
                            HashSet hashSet = C19728f.f50164e;
                            C19047a.C19048a aVar2 = C19047a.f48441d;
                            C17296a aVar3 = new C17296a(mo44548x1(), (C19728f) getSystemService("metro_context"), (C19047a) getSystemService("user_configuration"), this.f38773n0, time2, ((C17637d) getSystemService("ui_configuration")).f45347d);
                            this.f38782w0 = mo44528l2(aVar3.f44679B, aVar3, this.f38767U);
                        } else {
                            mo45438D2(transitLineGroup, transitPatternTrips);
                        }
                        this.f38764B0.mo50564a();
                        return;
                    }
                    throw new IllegalStateException("Line trip pattern can not initiated without trip id");
                }
                throw new IllegalStateException("Line trip pattern can not initiated without pattern id");
            }
            throw new IllegalStateException("Line trip pattern can not initiated without line id");
        }
        throw new IllegalStateException("Line trip pattern can not initiated without line group id");
    }

    /* renamed from: F2 */
    public final void mo45440F2(C12775d dVar) {
        boolean z;
        this.f38781v0 = dVar;
        MenuItem menuItem = this.f38780u0;
        if (menuItem != null) {
            if (dVar == null) {
                menuItem.setVisible(false);
                return;
            }
            ServiceStatusCategory serviceStatusCategory = dVar.f31580b.f23213b;
            menuItem.setIcon(serviceStatusCategory.getIconResId());
            if (serviceStatusCategory != ServiceStatusCategory.UNKNOWN && getSupportFragmentManager().mo3923A("service_alert_preview_dialog_fragment_tag") == null) {
                if (dVar.f31581c.mo49542a().longValue() != -1) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || !ServiceStatusCategory.IMPORTANT_LEVEL.contains(serviceStatusCategory)) {
                    mo45442H2(dVar);
                    return;
                }
                this.f38780u0.setVisible(false);
                String str = dVar.f31579a;
                ServerId serverId = this.f38773n0;
                int i = C20630k.f52155o;
                Bundle bundle = new Bundle();
                bundle.putString("alertId", str);
                bundle.putParcelable("lineGroupId", serverId);
                C20630k kVar = new C20630k();
                kVar.setArguments(bundle);
                kVar.show(getSupportFragmentManager(), "service_alert_preview_dialog_fragment_tag");
            }
        }
    }

    /* renamed from: G2 */
    public final void mo45441G2(int i) {
        CharSequence charSequence;
        RecyclerView recyclerView = this.f38771l0;
        if (i == 0) {
            charSequence = null;
        } else {
            charSequence = getText(i);
        }
        recyclerView.setAdapter(new C20795a((Drawable) null, (CharSequence) null, charSequence));
    }

    /* renamed from: H2 */
    public final void mo45442H2(C12775d dVar) {
        ServiceStatusCategory serviceStatusCategory = dVar.f31580b.f23213b;
        this.f38780u0.setIcon(serviceStatusCategory.getIconResId());
        this.f38780u0.setVisible(true);
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.SERVICE_ALERT_MENU_SHOWN);
        aVar.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(serviceStatusCategory));
        aVar.mo49939g(AnalyticsAttributeKey.ALERT_ID, dVar.f31579a);
        mo44545v2(aVar.mo49933a());
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        if (this.f38784y0 == null) {
            return super.mo19421Q1(menu);
        }
        getMenuInflater().inflate(R.menu.line_trip_pattern_menu, menu);
        this.f38780u0 = menu.findItem(R.id.service_alert_action);
        C12775d dVar = this.f38781v0;
        if (dVar == null) {
            C17635b.m43779f(this).f50174d.mo39625e(this.f38773n0).addOnCompleteListener((Activity) this, new C16978i0(this, 2));
            return true;
        }
        mo45440F2(dVar);
        return true;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo45439E2(intent, (Bundle) null);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        int i;
        super.mo19425e2(bundle);
        boolean z = ((C17637d) getSystemService("ui_configuration")).f45347d;
        this.f38765C0 = z;
        if (z) {
            i = R.layout.line_trip_pattern_activity_with_map;
        } else {
            i = R.layout.line_trip_pattern_activity;
        }
        setContentView(i);
        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo793o(false);
            supportActionBar.mo792n();
            supportActionBar.mo791m(true);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.f38771l0 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        this.f38771l0.mo4593g(new C18675k(this, R.drawable.shadow_scroll), -1);
        this.f38771l0.setItemAnimator((RecyclerView.C1128j) null);
        MapFragment mapFragment = (MapFragment) getSupportFragmentManager().mo3983z(R.id.map_fragment);
        this.f38772m0 = mapFragment;
        if (mapFragment != null) {
            BottomSheetBehavior e = BottomSheetBehavior.m34710e(this.f38771l0);
            e.setState(3);
            e.mo41052a(new C15111b(this));
        }
        C14741h hVar = new C14741h();
        hVar.mo44745a(1, mo44542u1());
        ((MoovitAnchoredBannerAdFragment) ((FragmentContainerView) findViewById(R.id.banner_ad_fragment)).getFragment()).mo44739o2(AdSource.LINE_SCREEN_BANNER, hVar);
        if (this.f38764B0 == null) {
            this.f38764B0 = new C18118d(this, C20199a.f51254P0);
        }
        mo45439E2(getIntent(), bundle);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("lineGroup", this.f38784y0);
        bundle.putParcelable("patternTrips", this.f38785z0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        if (this.f38782w0 == null) {
            this.f38770Z.mo23804e();
        }
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        this.f38770Z.mo23803d();
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    public final boolean onMenuOpened(int i, Menu menu) {
        if (i == 108 && menu != null) {
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "context_menu_clicked");
            mo44545v2(aVar.mo49933a());
        }
        return super.onMenuOpened(i, menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (this.f38784y0 == null) {
            return false;
        }
        if (menuItem.getItemId() != R.id.service_alert_action) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (this.f38781v0 == null) {
            return true;
        }
        C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
        aVar.mo49939g(AnalyticsAttributeKey.TYPE, "line_status_clicked");
        aVar.mo49939g(AnalyticsAttributeKey.SERVICE_ALERT_TYPE, C0016g.m12B(this.f38781v0.f31580b.f23213b));
        aVar.mo49939g(AnalyticsAttributeKey.ALERT_ID, this.f38781v0.f31579a);
        mo44545v2(aVar.mo49933a());
        startActivity(ServiceAlertDetailsActivity.m39148z2(this, this.f38773n0, this.f38781v0.f31579a));
        return true;
    }

    /* renamed from: q */
    public final void mo45423q(String str) {
        C12775d dVar;
        if (this.f38780u0 != null && (dVar = this.f38781v0) != null && dVar.f31579a.equals(str)) {
            mo45442H2(this.f38781v0);
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: y2 */
    public final void mo45443y2(TransitLineGroup transitLineGroup, TransitPatternTrips transitPatternTrips, TripId tripId, ServerId serverId) {
        TransitStop transitStop;
        TransitPatternShape transitPatternShape;
        Polyline polyline;
        int i;
        MapFragment mapFragment = this.f38772m0;
        if (mapFragment != null) {
            if (!mapFragment.mo48624U2()) {
                this.f38772m0.mo48656t2(new C16720q(this, transitLineGroup, transitPatternTrips, tripId, serverId));
                return;
            }
            this.f38772m0.mo48609E2();
            TransitPattern transitPattern = transitPatternTrips.f23717b;
            List<T> entities = DbEntityRef.getEntities(transitPattern.f23709c);
            Color a = C7843b.m17874a(this, transitLineGroup);
            Color b = C7843b.m17875b(this, a);
            MarkerZoomStyle l = C16281i.m41516l(a, b, Float.valueOf(4.0f));
            Iterator<T> it = entities.iterator();
            while (true) {
                transitStop = null;
                if (!it.hasNext()) {
                    break;
                }
                TransitStop transitStop2 = (TransitStop) it.next();
                boolean equals = serverId.equals(transitStop2.f23730b);
                ImageSet imageSet = transitStop2.f23738j;
                if (equals) {
                    i = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
                } else {
                    i = 127;
                }
                SparseArray d = MarkerZoomStyle.m41441d(imageSet, (C1495h) null, i);
                if (equals) {
                    C16281i.m41507c(d);
                } else if (d.size() > 0 && d.keyAt(0) > 1400) {
                    d.put(1400, l);
                }
                MapFragment mapFragment2 = this.f38772m0;
                LatLonE6 latLonE6 = transitStop2.f23732d;
                mapFragment2.getClass();
                mapFragment2.mo48648p2(latLonE6, transitStop2, C18699e.m45697a(d));
            }
            int intValue = transitPatternTrips.f23724i.get(tripId).intValue();
            if (intValue == -1) {
                transitPatternShape = null;
            } else {
                transitPatternShape = transitPatternTrips.f23722g.get(intValue);
            }
            if (transitPatternShape != null) {
                polyline = transitPatternShape.mo24396c(0, transitPatternShape.f23713b.size());
            } else {
                polyline = null;
            }
            if (polyline != null) {
                this.f38772m0.mo48642m2(polyline, C16281i.m41519o(this, C7843b.m17874a(this, transitLineGroup)), b);
                this.f38772m0.mo48606B2((Rect) null, polyline.getBounds(), true);
                return;
            }
            int b2 = transitPattern.mo24384b(serverId);
            if (b2 != -1) {
                transitStop = (TransitStop) entities.get(b2);
            }
            if (transitStop != null) {
                this.f38772m0.mo48664z2(transitStop.f23732d, 18.0f);
            }
        }
    }
}
