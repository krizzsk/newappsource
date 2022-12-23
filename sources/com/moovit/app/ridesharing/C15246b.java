package com.moovit.app.ridesharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import b00.C13556a;
import c00.C13717b;
import com.moovit.C15682c;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.EventsProvider;
import com.moovit.app.ridesharing.view.EventView;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.location.C16202a;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventRequest;
import com.tranzmate.R;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p011aa.C0141e;
import p073e7.C4583a;
import p259t5.C6593c;
import p297w5.C6996c;
import p527gy.C17261e;
import p665mv.C18468d;
import p737pv.C19027q;
import p737pv.C19028r;
import p858uz.C20061g;
import p874vr.C20199a;
import p906wz.C20431c;
import p906wz.C20436g;
import p977zz.C20975x0;
import q00.C19047a;

/* renamed from: com.moovit.app.ridesharing.b */
public class C15246b extends C15682c<MoovitAppActivity> implements EventsProvider.C15238d {

    /* renamed from: A */
    public static final /* synthetic */ int f39321A = 0;

    /* renamed from: n */
    public final C15247a f39322n = new C15247a();

    /* renamed from: o */
    public final C15248b f39323o = new C15248b();

    /* renamed from: p */
    public C15249c f39324p = new C15249c();

    /* renamed from: q */
    public ListItemView f39325q;

    /* renamed from: r */
    public EventView f39326r;

    /* renamed from: s */
    public ImageView f39327s;

    /* renamed from: t */
    public EventView f39328t;

    /* renamed from: u */
    public ImageView f39329u;

    /* renamed from: v */
    public Button f39330v;

    /* renamed from: w */
    public ListItemView f39331w;

    /* renamed from: x */
    public ListItemView f39332x;

    /* renamed from: y */
    public C19028r f39333y = null;

    /* renamed from: z */
    public C13556a f39334z = null;

    /* renamed from: com.moovit.app.ridesharing.b$a */
    public class C15247a extends BroadcastReceiver {
        public C15247a() {
        }

        public final void onReceive(Context context, Intent intent) {
            String str;
            if (intent == null) {
                str = null;
            } else {
                str = intent.getAction();
            }
            if ("com.moovit.useraccount.manager.user_profile_update_success".equals(str)) {
                C15246b bVar = C15246b.this;
                int i = C15246b.f39321A;
                bVar.mo45752o2();
            }
        }
    }

    /* renamed from: com.moovit.app.ridesharing.b$b */
    public class C15248b extends C18468d {
        public C15248b() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: com.moovit.ridesharing.model.EventVehicle} */
        /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.CharSequence] */
        /* JADX WARNING: type inference failed for: r4v2 */
        /* JADX WARNING: type inference failed for: r4v14 */
        /* JADX WARNING: type inference failed for: r4v15 */
        /* JADX WARNING: type inference failed for: r4v16 */
        /* JADX WARNING: type inference failed for: r4v17 */
        /* JADX WARNING: type inference failed for: r4v18 */
        /* JADX WARNING: type inference failed for: r4v19 */
        /* JADX WARNING: type inference failed for: r4v20 */
        /* JADX WARNING: type inference failed for: r4v21 */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: f */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo45736f(p737pv.C19023n r9) {
            /*
                r8 = this;
                com.moovit.app.ridesharing.b r0 = com.moovit.app.ridesharing.C15246b.this
                int r1 = com.moovit.app.ridesharing.C15246b.f39321A
                com.moovit.design.view.list.ListItemView r1 = r0.f39332x
                java.lang.Object r1 = r1.getTag()
                com.moovit.ridesharing.model.EventRequest r1 = (com.moovit.ridesharing.model.EventRequest) r1
                com.moovit.ridesharing.model.EventRequest r2 = r9.f48384m
                if (r1 == 0) goto L_0x00d7
                boolean r1 = r1.equals(r2)
                if (r1 != 0) goto L_0x0018
                goto L_0x00d7
            L_0x0018:
                com.moovit.design.view.list.ListItemView r0 = r0.f39332x
                android.content.Context r1 = r0.getContext()
                int r2 = r9.f48385n
                if (r2 == 0) goto L_0x00cd
                r3 = 60
                r4 = 0
                r5 = 0
                r6 = 1
                if (r2 == r6) goto L_0x0086
                r7 = 2
                if (r2 == r7) goto L_0x007e
                r7 = 3
                if (r2 == r7) goto L_0x0054
                r3 = 4
                if (r2 == r3) goto L_0x0034
                goto L_0x00d4
            L_0x0034:
                r2 = 2131887213(0x7f12046d, float:1.9409027E38)
                java.lang.Object[] r3 = new java.lang.Object[r6]
                com.moovit.ridesharing.model.EventRequest r9 = r9.f48384m
                com.moovit.ridesharing.model.EventInstance r4 = r9.f42953c
                int r7 = r4.f42949h
                if (r7 != r6) goto L_0x0046
                com.moovit.ridesharing.model.Event r9 = r4.f42943b
                java.lang.String r9 = r9.f42913d
                goto L_0x004c
            L_0x0046:
                com.moovit.transit.LocationDescriptor r9 = r9.f42954d
                java.lang.String r9 = r9.mo24313f()
            L_0x004c:
                r3[r5] = r9
                java.lang.String r4 = r1.getString(r2, r3)
                goto L_0x00d4
            L_0x0054:
                int r2 = r9.f48386o
                if (r2 > r3) goto L_0x005a
                r2 = 1
                goto L_0x005b
            L_0x005a:
                r2 = 0
            L_0x005b:
                if (r2 == 0) goto L_0x0066
                r9 = 2131887212(0x7f12046c, float:1.9409025E38)
                java.lang.String r4 = r1.getString(r9)
                goto L_0x00d4
            L_0x0066:
                java.util.Locale r2 = p977zz.C20930c.m49020b(r1)
                r3 = 2131887214(0x7f12046e, float:1.9409029E38)
                java.lang.String r3 = r1.getString(r3)
                java.lang.Object[] r4 = new java.lang.Object[r6]
                java.lang.CharSequence r9 = p665mv.C18470e.m45332a(r1, r9)
                r4[r5] = r9
                android.text.SpannedString r4 = p977zz.C20958p0.m49078b(r2, r3, r4)
                goto L_0x00d4
            L_0x007e:
                r9 = 2131887217(0x7f120471, float:1.9409035E38)
                java.lang.String r4 = r1.getString(r9)
                goto L_0x00d4
            L_0x0086:
                int r2 = r9.f48386o
                if (r2 > r3) goto L_0x008c
                r2 = 1
                goto L_0x008d
            L_0x008c:
                r2 = 0
            L_0x008d:
                if (r2 == 0) goto L_0x00b5
                com.moovit.ridesharing.model.EventRequest r9 = r9.f48384m
                com.moovit.ridesharing.model.EventRide r9 = r9.f42957g
                if (r9 == 0) goto L_0x0098
                com.moovit.ridesharing.model.EventDriver r9 = r9.f42973f
                goto L_0x0099
            L_0x0098:
                r9 = r4
            L_0x0099:
                if (r9 == 0) goto L_0x009d
                com.moovit.ridesharing.model.EventVehicle r4 = r9.f42941f
            L_0x009d:
                if (r4 == 0) goto L_0x00a2
                java.lang.String r9 = r4.f42975b
                goto L_0x00a9
            L_0x00a2:
                r9 = 2131889510(0x7f120d66, float:1.9413686E38)
                java.lang.String r9 = r1.getString(r9)
            L_0x00a9:
                r2 = 2131887211(0x7f12046b, float:1.9409023E38)
                java.lang.Object[] r3 = new java.lang.Object[r6]
                r3[r5] = r9
                java.lang.String r4 = r1.getString(r2, r3)
                goto L_0x00d4
            L_0x00b5:
                java.util.Locale r2 = p977zz.C20930c.m49020b(r1)
                r3 = 2131887216(0x7f120470, float:1.9409033E38)
                java.lang.String r3 = r1.getString(r3)
                java.lang.Object[] r4 = new java.lang.Object[r6]
                java.lang.CharSequence r9 = p665mv.C18470e.m45332a(r1, r9)
                r4[r5] = r9
                android.text.SpannedString r4 = p977zz.C20958p0.m49078b(r2, r3, r4)
                goto L_0x00d4
            L_0x00cd:
                r9 = 2131887215(0x7f12046f, float:1.940903E38)
                java.lang.String r4 = r1.getString(r9)
            L_0x00d4:
                r0.setTitle((java.lang.CharSequence) r4)
            L_0x00d7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.ridesharing.C15246b.C15248b.mo45736f(pv.n):void");
        }
    }

    /* renamed from: com.moovit.app.ridesharing.b$c */
    public class C15249c extends C0141e {
        public C15249c() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19027q qVar = (C19027q) cVar;
            C15246b.this.f39334z = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19027q qVar = (C19027q) cVar;
            C15246b bVar = C15246b.this;
            bVar.f39334z = null;
            bVar.f39333y = (C19028r) gVar;
            bVar.mo45752o2();
        }
    }

    public C15246b() {
        super(MoovitAppActivity.class);
    }

    /* renamed from: B */
    public final void mo45744B(int i) {
        if ((i & 7) != 0) {
            mo45752o2();
        }
    }

    /* renamed from: I1 */
    public final C20061g mo21526I1() {
        return C16202a.get(getContext()).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return C16530d.m42016i(2, "CONFIGURATION", "USER_ACCOUNT");
    }

    /* renamed from: W1 */
    public final void mo23788W1(View view) {
        if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51302t0)).booleanValue()) {
            C17261e.m43265f(getContext(), this.f39322n, Collections.singletonList("com.moovit.useraccount.manager.user_profile_update_success"));
            EventsProvider eventsProvider = EventsProvider.f39286k;
            eventsProvider.getClass();
            EventsProvider.m38934b(7);
            eventsProvider.f39293g.put(this, 7);
        }
        mo45752o2();
    }

    /* renamed from: b0 */
    public final void mo45745b0() {
        mo45752o2();
    }

    /* renamed from: k1 */
    public final void mo45746k1(IOException iOException, int i) {
        if ((i & 7) != 0 && getView() != null) {
            mo45750m2();
        }
    }

    /* renamed from: m2 */
    public final void mo45750m2() {
        UiUtils.m40238F(8, this.f39325q, this.f39326r, this.f39327s, this.f39328t, this.f39329u, this.f39330v, this.f39331w, this.f39332x);
        this.f39326r.setTag((Object) null);
        this.f39327s.setTag((Object) null);
        this.f39328t.setTag((Object) null);
        this.f39329u.setTag((Object) null);
        this.f39330v.setTag((Object) null);
        this.f39332x.setTag((Object) null);
        this.f39332x.getAccessoryView().setTag((Object) null);
    }

    /* renamed from: n2 */
    public final void mo45751n2() {
        if (!C20975x0.m49118e((EventRequest) this.f39332x.getTag(), this.f39323o.f47071f)) {
            C15248b bVar = this.f39323o;
            Context context = getContext();
            bVar.mo23803d();
            bVar.f47070e = context;
            bVar.f47071f = (EventRequest) this.f39332x.getTag();
            bVar.mo23804e();
        }
    }

    /* renamed from: o2 */
    public final void mo45752o2() {
        if (mo46775H1() && getView() != null) {
            mo45750m2();
            if (((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51302t0)).booleanValue()) {
                if (this.f39334z == null) {
                    C19028r rVar = this.f39333y;
                    if (rVar == null) {
                        C19027q qVar = new C19027q(mo46783R1(), LatLonE6.m40177j(mo46780O1()));
                        StringBuilder sb = new StringBuilder();
                        C13715c.m34249o(C19027q.class, sb, "_");
                        sb.append(qVar.f48393w);
                        String sb2 = sb.toString();
                        RequestOptions L1 = mo46777L1();
                        L1.f42909f = true;
                        this.f39334z = mo46793f2(sb2, qVar, L1, this.f39324p);
                    } else {
                        List<Event> list = rVar.f48394m;
                        if (list != null) {
                            int size = list.size();
                            if (size >= 1) {
                                EventView eventView = this.f39326r;
                                Event event = list.get(0);
                                eventView.setTag(event);
                                eventView.mo45800u(event, false);
                                eventView.setOnClickListener(new C6593c(this, 23));
                                eventView.setVisibility(0);
                            }
                            if (size >= 2) {
                                this.f39327s.setVisibility(0);
                                EventView eventView2 = this.f39328t;
                                Event event2 = list.get(1);
                                eventView2.setTag(event2);
                                eventView2.mo45800u(event2, false);
                                eventView2.setOnClickListener(new C6593c(this, 23));
                                eventView2.setVisibility(0);
                            } else {
                                this.f39327s.setVisibility(8);
                            }
                            if (size > 2) {
                                this.f39330v.setText(R.string.event_section_view_all);
                                this.f39330v.setTag(list);
                                this.f39330v.setVisibility(0);
                                this.f39329u.setVisibility(0);
                            } else {
                                this.f39330v.setVisibility(8);
                                this.f39329u.setVisibility(8);
                            }
                        }
                    }
                }
                if (((UserAccountManager) mo46776J1("USER_ACCOUNT")).mo46575f().mo49805e().f44614m.f40611b) {
                    EventsProvider eventsProvider = EventsProvider.f39286k;
                    if (!eventsProvider.mo45739e(7)) {
                        List<T> list2 = eventsProvider.f39290d.f39297a;
                        if (!C13717b.m34258e(list2)) {
                            EventRequest eventRequest = (EventRequest) list2.get(0);
                            this.f39332x.setTag(eventRequest);
                            this.f39332x.getAccessoryView().setTag(eventRequest);
                            this.f39332x.setTitle((CharSequence) eventRequest.f42953c.f42943b.f42913d);
                            this.f39332x.setVisibility(0);
                            mo45751n2();
                        }
                    }
                }
                UiUtils.m40267z(this.f39326r, this.f39325q);
                UiUtils.m40267z(this.f39332x, this.f39331w);
            }
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.events_section_fragment, viewGroup, false);
        this.f39325q = (ListItemView) inflate.findViewById(R.id.header);
        this.f39326r = (EventView) inflate.findViewById(R.id.event_view_1);
        this.f39327s = (ImageView) inflate.findViewById(R.id.events_divider);
        this.f39328t = (EventView) inflate.findViewById(R.id.event_view_2);
        this.f39329u = (ImageView) inflate.findViewById(R.id.view_all_divider);
        Button button = (Button) inflate.findViewById(R.id.view_all);
        this.f39330v = button;
        button.setOnClickListener(new C4583a(this, 20));
        this.f39331w = (ListItemView) inflate.findViewById(R.id.real_time_header);
        ListItemView listItemView = (ListItemView) inflate.findViewById(R.id.event_real_time_view);
        this.f39332x = listItemView;
        listItemView.setOnClickListener(new C6996c(this, 25));
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (mo46775H1() && ((Boolean) ((C19047a) mo46776J1("CONFIGURATION")).mo51505b(C20199a.f51302t0)).booleanValue()) {
            C17261e.m43267h(getContext(), this.f39322n);
            EventsProvider eventsProvider = EventsProvider.f39286k;
            eventsProvider.getClass();
            eventsProvider.f39293g.remove(this);
        }
    }

    public final void onStart() {
        super.onStart();
        mo45751n2();
    }

    public final void onStop() {
        super.onStop();
        C15248b bVar = this.f39323o;
        bVar.f47070e = null;
        bVar.f47071f = null;
        bVar.mo23803d();
        C13556a aVar = this.f39334z;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39334z = null;
        }
    }
}
