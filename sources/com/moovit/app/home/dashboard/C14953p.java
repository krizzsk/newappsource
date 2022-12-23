package com.moovit.app.home.dashboard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import ce0.C21100e;
import com.moovit.C15682c;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsAttributeKey;
import com.moovit.analytics.AnalyticsEventKey;
import com.moovit.app.navigation.MultiLegNavActivity;
import com.moovit.app.navigation.checkin.Checkin;
import com.moovit.app.navigation.itinerary.ItineraryNavigable;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.navigation.C4231d;
import com.moovit.navigation.Navigable;
import com.moovit.navigation.NavigationService;
import com.moovit.navigation.event.NavigationDeviationEvent;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.navigation.event.NavigationStartEvent;
import com.moovit.navigation.event.NavigationStopEvent;
import com.tranzmate.R;
import d40.C4346b;
import d40.C4360j;
import e20.C16769e;
import h40.C5051b;
import java.util.Collections;
import java.util.Set;
import p241s0.C6302b;
import p543hq.C17474b;
import p925xu.C20619a;
import p948yu.C20768a;
import p972zu.C20903j;
import p977zz.C20934d0;
import p977zz.C20941h;

/* renamed from: com.moovit.app.home.dashboard.p */
public class C14953p extends C15682c<MoovitActivity> {

    /* renamed from: n */
    public View f38269n;

    /* renamed from: o */
    public C14954a f38270o;

    /* renamed from: p */
    public C6302b f38271p = new C6302b();

    /* renamed from: com.moovit.app.home.dashboard.p$a */
    public class C14954a extends C4360j {
        public C14954a(FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        /* renamed from: d */
        public final void mo19879d(Navigable navigable) {
            C14953p.m37784m2(C14953p.this, navigable.mo19639e0());
        }

        /* renamed from: e */
        public final void mo19880e(Navigable navigable, NavigationDeviationEvent navigationDeviationEvent) {
            NavigationProgressEvent navigationProgressEvent;
            NavigationService navigationService;
            C4346b x;
            C14955b m2 = C14953p.m37784m2(C14953p.this, navigable.mo19639e0());
            C14953p pVar = C14953p.this;
            String e0 = navigable.mo19639e0();
            C14954a aVar = pVar.f38270o;
            if (aVar == null || (navigationService = aVar.f15350a) == null || (x = navigationService.mo19689x(e0)) == null) {
                navigationProgressEvent = null;
            } else {
                navigationProgressEvent = x.f15315b;
            }
            if (navigationProgressEvent == null) {
                m2.mo45160b(navigable, navigationDeviationEvent.f15108c, (NavigationProgressEvent) null);
            }
        }

        /* renamed from: f */
        public final void mo19881f(Navigable navigable, NavigationProgressEvent navigationProgressEvent) {
            C14953p.m37784m2(C14953p.this, navigable.mo19639e0()).mo45160b(navigable, navigationProgressEvent.f15112c, navigationProgressEvent);
        }

        /* renamed from: g */
        public final void mo19882g(Navigable navigable) {
            C14953p.m37784m2(C14953p.this, navigable.mo19639e0());
        }

        /* renamed from: h */
        public final void mo19883h(Navigable navigable, NavigationStartEvent navigationStartEvent) {
            C14955b m2 = C14953p.m37784m2(C14953p.this, navigable.mo19639e0());
            if (m2.f38275d.getParent() == null) {
                m2.f38274c.addView(m2.f38275d);
            }
            m2.mo45159a();
        }

        /* renamed from: i */
        public final void mo19884i(Navigable navigable, NavigationStopEvent navigationStopEvent) {
            int i;
            C14953p pVar = C14953p.this;
            C14955b bVar = (C14955b) pVar.f38271p.remove(navigable.mo19639e0());
            int i2 = pVar.f38271p.f19969d;
            View view = pVar.f38269n;
            if (i2 == 0) {
                i = 8;
            } else {
                i = 0;
            }
            view.setVisibility(i);
            if (bVar != null) {
                bVar.f38274c.removeView(bVar.f38275d);
            }
        }
    }

    /* renamed from: com.moovit.app.home.dashboard.p$b */
    public class C14955b implements View.OnClickListener {

        /* renamed from: b */
        public final String f38273b;

        /* renamed from: c */
        public final ViewGroup f38274c;

        /* renamed from: d */
        public final View f38275d;

        /* renamed from: e */
        public final View f38276e;

        /* renamed from: f */
        public final View f38277f;

        /* renamed from: g */
        public final TextView f38278g;

        /* renamed from: h */
        public final TextView f38279h;

        /* renamed from: i */
        public final TextView f38280i;

        /* renamed from: j */
        public final TextView f38281j;

        public C14955b(String str, ViewGroup viewGroup) {
            C21100e.m49373x(str, "navigableId");
            this.f38273b = str;
            C21100e.m49373x(viewGroup, "parent");
            this.f38274c = viewGroup;
            View e = C13715c.m34239e(viewGroup, R.layout.navigable_bar_layout, viewGroup, false);
            this.f38275d = e;
            e.setOnClickListener(this);
            this.f38276e = e.findViewById(R.id.missing_location_permissions);
            View findViewById = e.findViewById(R.id.navigation_progress);
            this.f38277f = findViewById;
            this.f38278g = (TextView) findViewById.findViewById(R.id.title);
            this.f38279h = (TextView) findViewById.findViewById(R.id.subtitle_1);
            this.f38280i = (TextView) findViewById.findViewById(R.id.separator);
            this.f38281j = (TextView) findViewById.findViewById(R.id.subtitle_2);
        }

        /* renamed from: a */
        public final void mo45159a() {
            int i;
            View view = this.f38277f;
            if (C20934d0.m49032c(this.f38275d.getContext())) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            UiUtils.m40265x(this.f38277f, this.f38276e);
        }

        /* renamed from: b */
        public final void mo45160b(Navigable navigable, int i, NavigationProgressEvent navigationProgressEvent) {
            C5051b bVar;
            int i2;
            int i3;
            C16769e.C16772c cVar;
            Context context = this.f38275d.getContext();
            if (navigable instanceof ItineraryNavigable) {
                ItineraryNavigable itineraryNavigable = (ItineraryNavigable) navigable;
                Leg leg = itineraryNavigable.f39149j.mo48295u0().get(i);
                C4231d<?> dVar = itineraryNavigable.f15017d;
                C20768a aVar = itineraryNavigable.f39148i;
                if (aVar != null) {
                    cVar = aVar.f43661l;
                } else {
                    cVar = null;
                }
                bVar = (C5051b) leg.mo48338i0(new C20903j(context, itineraryNavigable, navigationProgressEvent, dVar, cVar));
            } else if (navigable instanceof Checkin) {
                bVar = new C20619a(context, navigable.mo19644u0().get(i), navigable, navigationProgressEvent, ((Checkin) navigable).f15017d);
            } else {
                StringBuilder k = C13555b.m33972k("Unknown navigable type: ");
                k.append(navigable.getClass().getSimpleName());
                throw new UnsupportedOperationException(k.toString());
            }
            UiUtils.m40234B(this.f38278g, bVar.getTitle());
            UiUtils.m40234B(this.f38279h, bVar.mo20780i());
            TextView textView = this.f38279h;
            bVar.mo20774c();
            C15780a.m40272e(textView, 0);
            UiUtils.m40234B(this.f38281j, bVar.mo20777f());
            C15780a.m40272e(this.f38281j, bVar.mo20776e());
            if (bVar.mo20773b() != null) {
                i2 = bVar.mo20773b().intValue();
            } else {
                i2 = this.f38281j.getVisibility();
            }
            this.f38280i.setVisibility(i2);
            Integer d = bVar.mo20775d();
            if (d != null) {
                i3 = d.intValue();
            } else {
                i3 = C20941h.m49043f(R.attr.colorOnSurface, this.f38275d.getContext());
            }
            this.f38279h.setTextColor(i3);
            this.f38280i.setTextColor(i3);
            this.f38281j.setTextColor(i3);
            mo45159a();
        }

        public final void onClick(View view) {
            C14953p pVar = C14953p.this;
            C17474b.C17475a aVar = new C17474b.C17475a(AnalyticsEventKey.BUTTON_CLICK);
            aVar.mo49939g(AnalyticsAttributeKey.TYPE, "live_direction_button_type");
            pVar.mo46797j2(aVar.mo49933a());
            Context context = view.getContext();
            String str = this.f38273b;
            int i = MultiLegNavActivity.f39101S0;
            Intent intent = new Intent(context, MultiLegNavActivity.class);
            intent.putExtra("navigable_id_key", str);
            context.startActivity(intent);
        }
    }

    public C14953p() {
        super(MoovitActivity.class);
    }

    /* renamed from: m2 */
    public static C14955b m37784m2(C14953p pVar, String str) {
        int i;
        C14955b bVar = (C14955b) pVar.f38271p.getOrDefault(str, null);
        if (bVar != null) {
            return bVar;
        }
        C14955b bVar2 = new C14955b(str, (ViewGroup) pVar.getView());
        pVar.f38271p.put(str, bVar2);
        int i2 = pVar.f38271p.f19969d;
        View view = pVar.f38269n;
        if (i2 == 0) {
            i = 8;
        } else {
            i = 0;
        }
        view.setVisibility(i);
        return bVar2;
    }

    /* renamed from: K1 */
    public final Set<String> mo23781K1() {
        return Collections.singleton("TAXI_PROVIDERS_MANAGER");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f38270o = new C14954a(getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.navigables_section_fragment, viewGroup, false);
        this.f38269n = inflate.findViewById(R.id.header);
        return inflate;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f38270o.mo19886k();
        this.f38271p.clear();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f38271p.clear();
        this.f38270o.mo19885j();
    }
}
