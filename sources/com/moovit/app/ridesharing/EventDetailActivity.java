package com.moovit.app.ridesharing;

import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import b00.C13556a;
import com.google.android.exoplayer2.p052ui.C4051q;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.ridesharing.C15241a;
import com.moovit.app.ridesharing.EventsProvider;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polyline;
import com.moovit.commons.geo.Polylon;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.image.model.ResourceImage;
import com.moovit.location.C16202a;
import com.moovit.map.MapFragment;
import com.moovit.map.MarkerZoomStyle;
import com.moovit.network.model.ServerId;
import com.moovit.request.RequestOptions;
import com.moovit.ridesharing.model.Event;
import com.moovit.ridesharing.model.EventDriver;
import com.moovit.ridesharing.model.EventInstance;
import com.moovit.ridesharing.model.EventRequest;
import com.moovit.ridesharing.model.EventRide;
import com.moovit.ridesharing.model.EventVehicle;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import k10.C17993a;
import p011aa.C0141e;
import p073e7.C4585c;
import p090g1.C4732a;
import p665mv.C18465a;
import p665mv.C18466b;
import p665mv.C18467c;
import p665mv.C18468d;
import p665mv.C18470e;
import p737pv.C19016g;
import p737pv.C19017h;
import p737pv.C19023n;
import p762qz.C19206b;
import p824tp.C19725d;
import p824tp.C19739q;
import p858uz.C20061g;
import p906wz.C20431c;
import p906wz.C20436g;
import p906wz.C20438i;
import p977zz.C20927a0;
import p977zz.C20964s0;
import p977zz.C20975x0;
import w20.C20275b;
import w20.C20276c;

public class EventDetailActivity extends MoovitAppActivity implements EventsProvider.C15237c, C15241a.C15245d {

    /* renamed from: u0 */
    public static final /* synthetic */ int f39265u0 = 0;

    /* renamed from: U */
    public final C15232a f39266U = new C15232a();

    /* renamed from: X */
    public ServerId f39267X;

    /* renamed from: Y */
    public Event f39268Y;

    /* renamed from: Z */
    public ServerId f39269Z;

    /* renamed from: l0 */
    public EventRequest f39270l0;

    /* renamed from: m0 */
    public ListItemView f39271m0;

    /* renamed from: n0 */
    public View f39272n0;

    /* renamed from: o0 */
    public Button f39273o0;

    /* renamed from: p0 */
    public Button f39274p0;

    /* renamed from: q0 */
    public MenuItem f39275q0;

    /* renamed from: r0 */
    public MapFragment f39276r0;

    /* renamed from: s0 */
    public Object f39277s0;

    /* renamed from: t0 */
    public C13556a f39278t0 = null;

    /* renamed from: com.moovit.app.ridesharing.EventDetailActivity$a */
    public class C15232a extends C18468d {
        public C15232a() {
        }

        /* renamed from: f */
        public final void mo45736f(C19023n nVar) {
            LatLonE6 latLonE6;
            EventDetailActivity eventDetailActivity = EventDetailActivity.this;
            if (eventDetailActivity.f39276r0.mo48624U2()) {
                EventRequest eventRequest = nVar.f48384m;
                EventRequest eventRequest2 = eventDetailActivity.f39270l0;
                if (eventRequest2 != null && eventRequest2.equals(eventRequest) && (latLonE6 = nVar.f48388q) != null) {
                    Object obj = eventDetailActivity.f39277s0;
                    if (obj != null) {
                        eventDetailActivity.f39276r0.mo48636g3(obj);
                        eventDetailActivity.f39277s0 = null;
                    }
                    eventDetailActivity.f39277s0 = eventDetailActivity.f39276r0.mo48646o2(latLonE6, latLonE6, new MarkerZoomStyle(new ResourceImage(C19739q.img_map_center_marker, new String[0])));
                }
            }
        }
    }

    /* renamed from: com.moovit.app.ridesharing.EventDetailActivity$b */
    public class C15233b extends C0141e {
        public C15233b() {
        }

        /* renamed from: a */
        public final void mo313a(C20431c cVar, boolean z) {
            C19016g gVar = (C19016g) cVar;
            EventDetailActivity.this.f39278t0 = null;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C19016g gVar2 = (C19016g) cVar;
            EventDetailActivity eventDetailActivity = EventDetailActivity.this;
            Event event = ((C19017h) gVar).f48378m;
            eventDetailActivity.f39268Y = event;
            eventDetailActivity.f39270l0 = null;
            eventDetailActivity.setTitle(event.f42913d);
            UiUtils.m40238F(8, eventDetailActivity.f39272n0, eventDetailActivity.f39274p0);
            Button button = eventDetailActivity.f39273o0;
            UiUtils.m40238F(0, eventDetailActivity.f39271m0, button, (View) button.getParent());
            eventDetailActivity.mo45732F2();
            eventDetailActivity.f39271m0.setTitle((CharSequence) event.f42913d);
            eventDetailActivity.f39271m0.setSubtitle((CharSequence) event.f42915f);
            eventDetailActivity.f39271m0.setAccessoryText((CharSequence) C7925b.m18024l(eventDetailActivity, event.f42917h));
            eventDetailActivity.f39276r0.mo48656t2(new C18465a(eventDetailActivity, event, 0));
        }
    }

    /* renamed from: com.moovit.app.ridesharing.EventDetailActivity$c */
    public class C15234c extends C20438i<C20275b, C20276c> {

        /* renamed from: b */
        public final /* synthetic */ C19206b f39281b;

        /* renamed from: c */
        public final /* synthetic */ C19206b f39282c;

        /* renamed from: d */
        public final /* synthetic */ Polyline f39283d;

        public C15234c(C19206b bVar, C19206b bVar2, Polyline polyline) {
            this.f39281b = bVar;
            this.f39282c = bVar2;
            this.f39283d = polyline;
        }

        /* renamed from: k */
        public final void mo21408k(C20431c cVar, C20436g gVar) {
            C20275b bVar = (C20275b) cVar;
            Polylon polylon = ((C20276c) gVar).f51410m;
            EventDetailActivity eventDetailActivity = EventDetailActivity.this;
            C19206b bVar2 = this.f39281b;
            C19206b bVar3 = this.f39282c;
            Polyline polyline = this.f39283d;
            int i = EventDetailActivity.f39265u0;
            eventDetailActivity.mo45731E2(bVar2, bVar3, polyline, polylon);
        }

        /* renamed from: w */
        public final boolean mo21415w(C20431c cVar, Exception exc) {
            C20275b bVar = (C20275b) cVar;
            EventDetailActivity eventDetailActivity = EventDetailActivity.this;
            C19206b bVar2 = this.f39281b;
            C19206b bVar3 = this.f39282c;
            Polyline polyline = this.f39283d;
            int i = EventDetailActivity.f39265u0;
            eventDetailActivity.mo45731E2(bVar2, bVar3, polyline, (Polylon) null);
            return true;
        }
    }

    /* renamed from: y2 */
    public static Intent m38909y2(Context context, ServerId serverId, ServerId serverId2) {
        Intent intent = new Intent(context, EventDetailActivity.class);
        intent.putExtra("eventId", serverId);
        intent.putExtra("eventInstanceId", serverId2);
        return intent;
    }

    /* renamed from: A2 */
    public final void mo45726A2(ServerId serverId) {
        C13556a aVar = this.f39278t0;
        if (aVar != null) {
            aVar.cancel(true);
            this.f39278t0 = null;
        }
        C19016g gVar = new C19016g(serverId, mo44548x1());
        StringBuilder sb = new StringBuilder();
        C13715c.m34249o(C19016g.class, sb, "#");
        sb.append(gVar.f48377w);
        String sb2 = sb.toString();
        RequestOptions requestOptions = new RequestOptions();
        requestOptions.f42909f = true;
        this.f39278t0 = mo44527k2(sb2, gVar, requestOptions, new C15233b());
    }

    /* renamed from: B2 */
    public final void mo45727B2() {
        boolean z;
        EventRequest eventRequest = this.f39270l0;
        if (eventRequest == null || eventRequest.f42952b != 4) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            C15232a aVar = this.f39266U;
            aVar.f47070e = null;
            aVar.f47071f = null;
            aVar.mo23803d();
            Object obj = this.f39277s0;
            if (obj != null) {
                this.f39276r0.mo48636g3(obj);
                this.f39277s0 = null;
            }
        } else if (!eventRequest.equals(this.f39266U.f47071f)) {
            C15232a aVar2 = this.f39266U;
            EventRequest eventRequest2 = this.f39270l0;
            aVar2.mo23803d();
            aVar2.f47070e = this;
            aVar2.f47071f = eventRequest2;
            aVar2.mo23804e();
        }
    }

    /* renamed from: C2 */
    public final void mo45728C2(EventRide eventRide) {
        String str;
        EventVehicle eventVehicle;
        String str2;
        ListItemView listItemView = (ListItemView) this.f39272n0.findViewById(R.id.driver);
        ListItemView listItemView2 = (ListItemView) this.f39272n0.findViewById(R.id.licence_plate);
        ImageView imageView = (ImageView) this.f39272n0.findViewById(R.id.call);
        if (eventRide == null) {
            UiUtils.m40238F(8, listItemView, listItemView2, imageView);
            return;
        }
        EventDriver eventDriver = eventRide.f42973f;
        listItemView.setVisibility(0);
        String str3 = "-";
        if (eventDriver != null) {
            str = C20964s0.m49102t(" ", eventDriver.f42938c, eventDriver.f42939d);
        } else {
            str = str3;
        }
        listItemView.setSubtitle((CharSequence) str);
        Intent intent = null;
        if (eventDriver != null) {
            eventVehicle = eventDriver.f42941f;
        } else {
            eventVehicle = null;
        }
        listItemView2.setVisibility(0);
        if (eventVehicle != null) {
            str3 = eventVehicle.f42975b;
        }
        listItemView2.setSubtitle((CharSequence) str3);
        if (eventDriver != null) {
            str2 = eventDriver.f42940e;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            intent = C20927a0.m49011f(str2);
        }
        if (intent == null || intent.resolveActivity(getPackageManager()) == null) {
            imageView.setVisibility(8);
            return;
        }
        imageView.setVisibility(0);
        imageView.setOnClickListener(new C18467c(0, this, intent));
    }

    /* renamed from: D0 */
    public final void mo45729D0() {
    }

    /* renamed from: D2 */
    public final void mo45730D2(C19206b bVar, C19206b bVar2, Polyline polyline) {
        Location u1 = mo44542u1();
        if (u1 == null || u1.distanceTo(bVar.getLocation().mo46929u((Location) null)) > 2000.0f) {
            mo45731E2(bVar, bVar2, polyline, (Polylon) null);
            return;
        }
        C20275b bVar3 = new C20275b(mo44548x1(), u1, bVar.getLocation().mo46929u((Location) null));
        mo44528l2(bVar3.f51409w, bVar3, new C15234c(bVar, bVar2, polyline));
    }

    /* renamed from: E2 */
    public final void mo45731E2(C19206b bVar, C19206b bVar2, Polyline polyline, Polylon polylon) {
        this.f39276r0.mo48656t2(new C18466b(this, bVar, bVar2, polyline, polylon));
    }

    /* renamed from: F2 */
    public final void mo45732F2() {
        EventRequest eventRequest;
        boolean z;
        boolean z2;
        MenuItem menuItem = this.f39275q0;
        if (menuItem != null && (eventRequest = this.f39270l0) != null) {
            int i = eventRequest.f42952b;
            boolean z3 = false;
            if (i == 1 || i == 2) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i2 = EventRequest.C16434c.f42967a[eventRequest.f42955e.ordinal()];
                if (i2 == 1 || i2 == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z3 = true;
                }
            }
            menuItem.setVisible(z3);
        }
    }

    /* renamed from: Q1 */
    public final boolean mo19421Q1(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_event_details, menu);
        MenuItem findItem = menu.findItem(R.id.action_cancel);
        this.f39275q0 = findItem;
        findItem.setVisible(false);
        mo45732F2();
        return true;
    }

    /* renamed from: b2 */
    public final void mo19424b2(Intent intent) {
        setIntent(intent);
        mo45735z2(intent, (Bundle) null);
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.event_detail_activity);
        this.f39271m0 = (ListItemView) findViewById(R.id.event_view);
        this.f39272n0 = findViewById(R.id.ride_view);
        Button button = (Button) findViewById(R.id.book_button);
        this.f39273o0 = button;
        button.setOnClickListener(new C4585c(this, 19));
        Button button2 = (Button) findViewById(R.id.share_button);
        this.f39274p0 = button2;
        button2.setOnClickListener(new C4051q(this, 25));
        this.f39276r0 = (MapFragment) mo44529n1(R.id.map_fragment);
        mo45735z2(getIntent(), bundle);
    }

    /* renamed from: g2 */
    public final void mo23894g2(Bundle bundle) {
        bundle.putParcelable("event", this.f39268Y);
        bundle.putParcelable("eventRequest", this.f39270l0);
    }

    /* renamed from: h2 */
    public final void mo19426h2() {
        super.mo19426h2();
        mo45727B2();
    }

    /* renamed from: i2 */
    public final void mo19427i2() {
        super.mo19427i2();
        C15232a aVar = this.f39266U;
        aVar.f47070e = null;
        aVar.f47071f = null;
        aVar.mo23803d();
        Object obj = this.f39277s0;
        if (obj != null) {
            this.f39276r0.mo48636g3(obj);
            this.f39277s0 = null;
        }
        C13556a aVar2 = this.f39278t0;
        if (aVar2 != null) {
            aVar2.cancel(true);
            this.f39278t0 = null;
        }
    }

    /* renamed from: j1 */
    public final C20061g mo19428j1() {
        return C16202a.get(this).getPermissionAwareHighAccuracyFrequentUpdates();
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.action_cancel) {
            return super.onOptionsItemSelected(menuItem);
        }
        EventRequest eventRequest = this.f39270l0;
        if (eventRequest == null) {
            return true;
        }
        int i = C15241a.f39309p;
        Bundle bundle = new Bundle();
        bundle.putParcelable("eventRequest", eventRequest);
        C15241a aVar = new C15241a();
        aVar.setArguments(bundle);
        aVar.show(getSupportFragmentManager(), "purchase_cancellation_fragment_tag");
        return true;
    }

    /* renamed from: p */
    public final void mo45733p(EventRequest eventRequest) {
        if (C20975x0.m49118e(this.f39270l0, eventRequest)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(C14226d.m35335A0(this).putExtra(C17993a.f46076b, "suppress_popups"));
            if (!arrayList.isEmpty()) {
                Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                if (!C4732a.startActivities(this, intentArr, (Bundle) null)) {
                    Intent intent = new Intent(intentArr[intentArr.length - 1]);
                    intent.addFlags(268435456);
                    startActivity(intent);
                }
                finish();
                return;
            }
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        HashSet hashSet = (HashSet) s1;
        hashSet.add("RIDE_SHARING_EVENTS_SUPPORT_VALIDATOR");
        hashSet.add("USER_ACCOUNT");
        return s1;
    }

    /* renamed from: t */
    public final void mo45734t(EventRequest eventRequest) {
        String str;
        String str2;
        Polyline polyline;
        String str3;
        String str4;
        Polyline polyline2;
        EventRequest eventRequest2 = eventRequest;
        if (eventRequest2 == null) {
            mo45726A2(this.f39267X);
            return;
        }
        EventInstance eventInstance = eventRequest2.f42953c;
        if (eventInstance.f42949h == 1) {
            Event event = eventInstance.f42943b;
            LocationDescriptor locationDescriptor = eventRequest2.f42954d;
            EventRide eventRide = eventRequest2.f42957g;
            this.f39268Y = event;
            this.f39270l0 = eventRequest2;
            setTitle(event.f42913d);
            UiUtils.m40238F(8, this.f39271m0, this.f39273o0, (View) this.f39274p0.getParent());
            UiUtils.m40238F(0, this.f39272n0, this.f39274p0);
            mo45732F2();
            int i = eventRequest2.f42958h;
            ((TextView) this.f39272n0.findViewById(R.id.tickets_amount)).setText(getResources().getQuantityString(R.plurals.tickets, i, new Object[]{Integer.valueOf(i)}));
            ((TextView) this.f39272n0.findViewById(R.id.metadata)).setText(C20964s0.m49097o(" ", C7925b.m18015c(this, eventRequest2.f42953c.f42947f), getResources().getString(C18470e.m45333b(eventRequest2.f42953c.f42948g)).toLowerCase()));
            ListItemView listItemView = (ListItemView) this.f39272n0.findViewById(R.id.origin);
            listItemView.setSubtitle((CharSequence) locationDescriptor.mo24313f());
            if (eventRide != null) {
                str3 = C7925b.m18024l(this, eventRide.f42970c);
            } else {
                str3 = null;
            }
            listItemView.setAccessoryText((CharSequence) str3);
            ListItemView listItemView2 = (ListItemView) this.f39272n0.findViewById(R.id.destination);
            listItemView2.setSubtitle((CharSequence) event.f42915f);
            if (eventRide != null) {
                str4 = C7925b.m18024l(this, eventRide.f42971d);
            } else {
                str4 = C7925b.m18024l(this, eventRequest2.f42953c.f42947f);
            }
            listItemView2.setAccessoryText((CharSequence) str4);
            mo45728C2(eventRide);
            if (eventRide != null) {
                polyline2 = eventRide.f42972e;
            } else {
                polyline2 = null;
            }
            mo45730D2(locationDescriptor, event, polyline2);
        } else {
            Event event2 = eventInstance.f42943b;
            LocationDescriptor locationDescriptor2 = eventRequest2.f42954d;
            EventRide eventRide2 = eventRequest2.f42957g;
            this.f39268Y = event2;
            this.f39270l0 = eventRequest2;
            setTitle(event2.f42913d);
            UiUtils.m40238F(8, this.f39271m0, this.f39273o0, (View) this.f39274p0.getParent());
            UiUtils.m40238F(0, this.f39272n0, this.f39274p0);
            mo45732F2();
            int i2 = eventRequest2.f42958h;
            ((TextView) this.f39272n0.findViewById(R.id.tickets_amount)).setText(getResources().getQuantityString(R.plurals.tickets, i2, new Object[]{Integer.valueOf(i2)}));
            ((TextView) this.f39272n0.findViewById(R.id.metadata)).setText(C20964s0.m49097o(" ", C7925b.m18015c(this, eventRequest2.f42953c.f42947f), getResources().getString(C18470e.m45333b(eventRequest2.f42953c.f42948g)).toLowerCase()));
            ListItemView listItemView3 = (ListItemView) this.f39272n0.findViewById(R.id.origin);
            listItemView3.setSubtitle((CharSequence) event2.f42915f);
            if (eventRide2 != null) {
                str = C7925b.m18024l(this, eventRide2.f42970c);
            } else {
                str = C7925b.m18024l(this, eventRequest2.f42953c.f42947f);
            }
            listItemView3.setAccessoryText((CharSequence) str);
            ListItemView listItemView4 = (ListItemView) this.f39272n0.findViewById(R.id.destination);
            listItemView4.setSubtitle((CharSequence) locationDescriptor2.mo24313f());
            if (eventRide2 != null) {
                str2 = C7925b.m18024l(this, eventRide2.f42971d);
            } else {
                str2 = null;
            }
            listItemView4.setAccessoryText((CharSequence) str2);
            mo45728C2(eventRide2);
            if (eventRide2 != null) {
                polyline = eventRide2.f42972e;
            } else {
                polyline = null;
            }
            mo45730D2(event2, locationDescriptor2, polyline);
        }
        mo45727B2();
    }

    /* renamed from: z2 */
    public final void mo45735z2(Intent intent, Bundle bundle) {
        this.f39267X = (ServerId) intent.getParcelableExtra("eventId");
        this.f39269Z = (ServerId) intent.getParcelableExtra("eventInstanceId");
        if (this.f39267X != null) {
            this.f39268Y = null;
            this.f39270l0 = null;
            if (bundle != null) {
                Event event = (Event) bundle.getParcelable("event");
                EventRequest eventRequest = (EventRequest) bundle.getParcelable("eventRequest");
                if (event != null && event.f42911b.equals(this.f39267X)) {
                    this.f39268Y = event;
                }
                if (eventRequest != null && eventRequest.f42953c.f42944c.equals(this.f39269Z)) {
                    this.f39270l0 = eventRequest;
                }
            }
            ServerId serverId = this.f39269Z;
            if (serverId != null) {
                EventsProvider eventsProvider = EventsProvider.f39286k;
                EventRequest c = eventsProvider.mo45737c(serverId);
                if (c != null) {
                    mo45734t(c);
                }
                EventsProvider.C15239e eVar = new EventsProvider.C15239e(this, serverId, this);
                C19725d.m47191a(eVar.f39300b).f50162b.add(eVar);
                EventsProvider.m38934b(31);
                eventsProvider.f39293g.put(eVar, 31);
                if (!eventsProvider.mo45739e(31)) {
                    eVar.mo45744B(31);
                    return;
                }
                return;
            }
            mo45726A2(this.f39267X);
            return;
        }
        throw new IllegalStateException("Event id is missing!");
    }
}
