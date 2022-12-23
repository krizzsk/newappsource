package com.moovit.app.itinerary.view;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ce0.C21100e;
import com.moovit.app.itinerary.view.leg.AbstractLegView;
import com.moovit.app.itinerary.view.leg.C15077b;
import com.moovit.app.itinerary.view.leg.C15084i;
import com.moovit.app.itinerary.view.leg.C15087l;
import com.moovit.app.itinerary.view.leg.C15090n;
import com.moovit.app.itinerary.view.leg.C15092o;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.list.FixedListView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.LocationDescriptor;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import e20.C16769e;
import e20.C16783l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p241s0.C6302b;
import p373au.C13526b;
import p397bu.C13688f;
import p453dw.C16738n;
import p641lu.C18277b;
import p716oy.C18860a;
import p952yy.C20787c;
import p977zz.C20943i;

public class ItineraryListView extends FixedListView {

    /* renamed from: O */
    public static final SparseIntArray f38651O;

    /* renamed from: J */
    public C15084i f38652J;

    /* renamed from: K */
    public final ArrayList f38653K;

    /* renamed from: L */
    public Itinerary f38654L;

    /* renamed from: M */
    public AbstractLegView.C15075b f38655M;

    /* renamed from: N */
    public C16738n f38656N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f38651O = sparseIntArray;
        sparseIntArray.put(6, 1);
        sparseIntArray.put(3, 1);
        sparseIntArray.put(10, 1);
        sparseIntArray.put(12, 1);
        sparseIntArray.put(14, 1);
        sparseIntArray.put(15, 1);
        sparseIntArray.put(16, 1);
        sparseIntArray.put(17, 1);
    }

    public ItineraryListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.itineraryListViewStyle);
    }

    /* renamed from: m */
    public static void m38177m(ItineraryListView itineraryListView) {
        if (!C20943i.m49051d(15)) {
            itineraryListView.getClass();
            return;
        }
        int childCount = itineraryListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = itineraryListView.getChildAt(i);
            if ("decorator".equals(childAt.getTag())) {
                LayoutTransition layoutTransition = new LayoutTransition();
                if (C20943i.m49051d(16)) {
                    layoutTransition.enableTransitionType(4);
                }
                ((ViewGroup) childAt).setLayoutTransition(layoutTransition);
            }
        }
    }

    /* renamed from: n */
    public final void mo45336n(List<Leg> list, int i, C13688f fVar, ViewGroup viewGroup) {
        Leg leg = list.get(i);
        Leg u = C16783l.m42489u(i, list);
        AbstractLegView abstractLegView = (AbstractLegView) leg.mo48338i0(fVar);
        if (abstractLegView != null) {
            abstractLegView.mo45376I(leg, u, this.f38655M, this.f38656N);
            viewGroup.addView(abstractLegView);
        }
        this.f38653K.add(abstractLegView);
    }

    /* renamed from: o */
    public final void mo45337o() {
        if (C20943i.m49051d(15)) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                if ("decorator".equals(childAt.getTag())) {
                    ((ViewGroup) childAt).setLayoutTransition((LayoutTransition) null);
                }
            }
        }
    }

    /* renamed from: p */
    public final void mo45338p(List<Leg> list) {
        Leg leg;
        Leg leg2 = list.get(0);
        if (list.size() >= 2) {
            leg = list.get(1);
        } else {
            leg = null;
        }
        this.f38652J.mo45376I(leg2, leg, this.f38655M, this.f38656N);
    }

    public void setItinerary(Itinerary itinerary) {
        C21100e.m49373x(itinerary, "itinerary");
        this.f38654L = itinerary;
        Context context = getContext();
        List<Leg> u0 = this.f38654L.mo48295u0();
        int size = u0.size();
        mo45337o();
        removeAllViews();
        this.f38653K.clear();
        C13688f fVar = new C13688f(context);
        this.f38652J = new C15084i(context);
        mo45338p(u0);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.leg_view_decorator, this, false);
        addView(viewGroup);
        viewGroup.addView(this.f38652J);
        int i = 0;
        while (i < size) {
            while (i < size && f38651O.get(u0.get(i).getType(), -1) == -1) {
                mo45336n(u0, i, fVar, viewGroup);
                i++;
            }
            if (i >= size) {
                break;
            }
            viewGroup = (ViewGroup) LayoutInflater.from(getContext()).inflate(R.layout.leg_view_decorator, this, false);
            addView(viewGroup);
            mo45336n(u0, i, fVar, viewGroup);
            i++;
        }
        UiUtils.m40259r(this, new C13526b(this));
    }

    public void setItineraryRealTimeInfo(C16769e.C16772c cVar) {
        Time time;
        List<Leg> u0 = this.f38654L.mo48295u0();
        int size = u0.size();
        for (int i = 0; i < size; i++) {
            Leg leg = u0.get(i);
            int type = leg.getType();
            if (type != 1) {
                Time time2 = null;
                if (type == 3) {
                    WaitToTransitLineLeg waitToTransitLineLeg = (WaitToTransitLineLeg) leg;
                    C15090n nVar = (C15090n) this.f38653K.get(i);
                    ServerId serverId = waitToTransitLineLeg.f42135f.getServerId();
                    ServerId serverId2 = waitToTransitLineLeg.f42136g.getServerId();
                    ServerId serverId3 = waitToTransitLineLeg.f42137h.getServerId();
                    if (C18860a.m45884a().f48029q) {
                        time2 = C16783l.m42482n(leg.mo48331K1());
                    }
                    C20787c b = cVar.mo49467b(serverId, serverId2, serverId3, time2);
                    if (b == null || b.f52458c.isEmpty()) {
                        nVar.setRealTime(Collections.emptyMap());
                    } else {
                        nVar.setRealTime(Collections.singletonMap(b.f52456a, b));
                    }
                } else if (type == 10) {
                    C15087l lVar = (C15087l) this.f38653K.get(i);
                    List<WaitToTransitLineLeg> list = ((WaitToMultiTransitLinesLeg) leg).f42117b;
                    C6302b bVar = new C6302b(list.size());
                    for (WaitToTransitLineLeg next : list) {
                        ServerId serverId4 = next.f42135f.getServerId();
                        ServerId serverId5 = next.f42136g.getServerId();
                        ServerId serverId6 = next.f42137h.getServerId();
                        if (C18860a.m45884a().f48029q) {
                            time = C16783l.m42482n(next.f42132c);
                        } else {
                            time = null;
                        }
                        C20787c b2 = cVar.mo49467b(serverId4, serverId5, serverId6, time);
                        if (b2 != null && !b2.f52458c.isEmpty()) {
                            bVar.put(serverId4, b2);
                        }
                    }
                    lVar.setRealTime(bVar);
                } else if (type == 12) {
                    LocationDescriptor.LocationType locationType = LocationDescriptor.LocationType.BICYCLE_STOP;
                    C18277b bVar2 = C16783l.f43688a;
                    if (leg.mo48334e2().mo24316j(locationType)) {
                        ((C15077b) this.f38653K.get(i)).setAvailableBicycleDocksAtDestination(C16783l.m42480l(cVar, leg.mo48334e2().f23649d));
                    }
                }
            } else {
                LocationDescriptor.LocationType locationType2 = LocationDescriptor.LocationType.BICYCLE_STOP;
                C18277b bVar3 = C16783l.f43688a;
                if (leg.mo48334e2().mo24316j(locationType2)) {
                    ((C15092o) this.f38653K.get(i)).setAvailableBicyclesAtDestination(C16783l.m42481m(cVar, leg.mo48334e2().f23649d));
                }
            }
        }
    }

    public void setListener(AbstractLegView.C15075b bVar) {
        this.f38655M = bVar;
    }

    public void setStopImagesManagerFragment(C16738n nVar) {
        this.f38656N = nVar;
    }

    public ItineraryListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38653K = new ArrayList();
    }
}
