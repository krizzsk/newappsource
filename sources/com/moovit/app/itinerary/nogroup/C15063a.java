package com.moovit.app.itinerary.nogroup;

import a00.C13382a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.app.itinerary.nogroup.ItineraryNoGroupActivity;
import com.moovit.app.itinerary.nogroup.NoGroupItineraryView;
import com.moovit.app.servicealerts.LineServiceAlertDigestView;
import com.moovit.commons.utils.Color;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.design.view.list.ListItemView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.MultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.TransitLineLeg;
import com.moovit.itinerary.model.leg.WaitToMultiTransitLinesLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.network.model.ServerId;
import com.moovit.servicealerts.LineServiceAlertDigest;
import com.moovit.servicealerts.ServiceStatusCategory;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitStopPlatform;
import com.moovit.util.time.C7925b;
import com.moovit.view.SimpleStopsView;
import com.tranzmate.R;
import e20.C16783l;
import java.util.ArrayList;
import java.util.List;
import m00.C18306a;
import m00.C18315f;
import p090g1.C4732a;
import p641lu.C18277b;
import p824tp.C19728f;
import p977zz.C20941h;

/* renamed from: com.moovit.app.itinerary.nogroup.a */
public final class C15063a extends C18306a<Itinerary, Itinerary> {

    /* renamed from: c */
    public final boolean f38616c;

    /* renamed from: d */
    public C15064a f38617d;

    /* renamed from: com.moovit.app.itinerary.nogroup.a$a */
    public interface C15064a extends NoGroupItineraryView.C15059a {
    }

    public C15063a(List list, boolean z, ItineraryNoGroupActivity.C15056a aVar) {
        super(list);
        this.f38617d = aVar;
        this.f38616c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ int mo45057a(Object obj) {
        Itinerary itinerary = (Itinerary) obj;
        return 1;
    }

    /* renamed from: b */
    public final Object mo45058b(int i, Object obj) {
        return (Itinerary) obj;
    }

    /* renamed from: c */
    public final View mo45059c(Object obj, View view, ViewGroup viewGroup) {
        WaitToTransitLineLeg waitToTransitLineLeg;
        boolean z;
        String str;
        String str2;
        int i;
        Itinerary itinerary = (Itinerary) obj;
        NoGroupItineraryView noGroupItineraryView = (NoGroupItineraryView) view;
        if (noGroupItineraryView == null) {
            noGroupItineraryView = new NoGroupItineraryView(viewGroup.getContext(), (AttributeSet) null);
        }
        boolean z2 = this.f38616c;
        noGroupItineraryView.f38608c = this.f38617d;
        noGroupItineraryView.f38609d = z2;
        List<Leg> u0 = itinerary.mo48295u0();
        noGroupItineraryView.f38607b.removeAllViews();
        for (int i2 = 0; i2 < u0.size(); i2++) {
            TransitLineLeg v = C16783l.m42490v(u0.get(i2));
            if (v != null) {
                Leg i3 = C16783l.m42477i(u0, i2, 3, 10);
                if (i3 instanceof WaitToMultiTransitLinesLeg) {
                    waitToTransitLineLeg = ((WaitToMultiTransitLinesLeg) i3).mo48467b();
                } else if (i3 instanceof WaitToTransitLineLeg) {
                    waitToTransitLineLeg = (WaitToTransitLineLeg) i3;
                } else {
                    waitToTransitLineLeg = null;
                }
                if (waitToTransitLineLeg != null) {
                    if (noGroupItineraryView.f38607b.getChildCount() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        LayoutInflater.from(noGroupItineraryView.getContext()).inflate(R.layout.itinerary_ng_transfer_view_layout, noGroupItineraryView.f38607b, true);
                    }
                    ServerId serverId = v.f42110d.getServerId();
                    TransitStopPlatform c = v.mo48460c().get().mo24411c(serverId);
                    if (c != null) {
                        str = c.f23754b;
                    } else {
                        str = null;
                    }
                    TransitStopPlatform c2 = v.mo48459b().get().mo24411c(serverId);
                    if (c2 != null) {
                        str2 = c2.f23754b;
                    } else {
                        str2 = null;
                    }
                    NoGroupTransitLegView noGroupTransitLegView = new NoGroupTransitLegView(noGroupItineraryView.getContext(), (AttributeSet) null);
                    LineServiceAlertDigest lineServiceAlertDigest = waitToTransitLineLeg.f42139j;
                    boolean z3 = noGroupItineraryView.f38609d;
                    NoGroupItineraryView.C15059a aVar = noGroupItineraryView.f38608c;
                    noGroupTransitLegView.f38610b = v;
                    noGroupTransitLegView.f38611c = aVar;
                    ListItemView listItemView = (ListItemView) noGroupTransitLegView.findViewById(R.id.list_item_view);
                    LineServiceAlertDigestView lineServiceAlertDigestView = (LineServiceAlertDigestView) noGroupTransitLegView.findViewById(R.id.service_status);
                    C16181a.m41233b(C19728f.m47195a(noGroupTransitLegView.getContext()).mo52082b(LinePresentationType.ITINERARY), listItemView, v.f42110d.get());
                    View accessoryView = listItemView.getAccessoryView();
                    accessoryView.setOnClickListener(noGroupTransitLegView.f38613e);
                    if (z3) {
                        i = 0;
                    } else {
                        i = 4;
                    }
                    accessoryView.setVisibility(i);
                    if (lineServiceAlertDigest == null || !ServiceStatusCategory.IMPORTANT_LEVEL.contains(lineServiceAlertDigest.f23186c.f23213b)) {
                        lineServiceAlertDigestView.setVisibility(8);
                    } else {
                        lineServiceAlertDigestView.setLineServiceAlertDigest(lineServiceAlertDigest);
                    }
                    SimpleStopsView simpleStopsView = (SimpleStopsView) noGroupTransitLegView.findViewById(R.id.stops_view);
                    Context context = simpleStopsView.getContext();
                    Color a = C7843b.m17874a(context, v.f42110d.get().mo24369b());
                    simpleStopsView.setFullColor(a.f41007b);
                    simpleStopsView.setFillColor(C7843b.m17875b(context, a).f41007b);
                    simpleStopsView.setStopsCountClickListener(noGroupTransitLegView.f38612d);
                    simpleStopsView.mo24754a(v.f42111e.size() - 1, v.mo48460c().get(), v.mo48459b().get(), v.f42108b, v.f42109c, str, str2);
                    noGroupItineraryView.f38607b.addView(noGroupTransitLegView);
                }
            }
        }
        C13382a.C13383a aVar2 = C13382a.f33219a;
        noGroupItineraryView.requestFocus();
        noGroupItineraryView.sendAccessibilityEvent(8);
        return noGroupItineraryView;
    }

    /* renamed from: d */
    public final View mo45060d(Object obj, boolean z, View view, ViewGroup viewGroup) {
        View view2;
        String str;
        int i;
        int i2;
        int i3;
        Itinerary itinerary = (Itinerary) obj;
        Context context = viewGroup.getContext();
        if (view == null) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.itinerary_ng_item_group_layout, viewGroup, false);
            C18315f fVar = new C18315f();
            View findViewById = inflate.findViewById(R.id.trip_times_range);
            fVar.f46706a.put(findViewById.getId(), findViewById);
            View findViewById2 = inflate.findViewById(R.id.relative_time);
            fVar.f46706a.put(findViewById2.getId(), findViewById2);
            View findViewById3 = inflate.findViewById(R.id.expand);
            fVar.f46706a.put(findViewById3.getId(), findViewById3);
            View findViewById4 = inflate.findViewById(R.id.transfers);
            fVar.f46706a.put(findViewById4.getId(), findViewById4);
            inflate.setTag(fVar);
            view2 = inflate;
        } else {
            view2 = view;
        }
        C18315f fVar2 = (C18315f) view2.getTag();
        TextView textView = (TextView) fVar2.f46706a.get(R.id.trip_times_range);
        String l = C7925b.m18024l(context, itinerary.mo48294o1().mo24631g());
        String l2 = C7925b.m18024l(context, itinerary.mo48288K1().mo24631g());
        textView.setText(context.getString(R.string.itinerary_start_end_times, new Object[]{l, l2}));
        textView.setContentDescription(context.getString(R.string.voice_over_tripplan_beginning_end_time, new Object[]{l, l2}));
        ((TextView) fVar2.f46706a.get(R.id.relative_time)).setText(C7925b.f23935b.mo24605e(context, itinerary.mo48294o1().mo24631g(), itinerary.mo48288K1().mo24631g()));
        TextView textView2 = (TextView) fVar2.f46706a.get(R.id.transfers);
        C18277b bVar = C16783l.f43688a;
        ArrayList arrayList = new ArrayList();
        for (Leg next : itinerary.mo48295u0()) {
            int type = next.getType();
            if (type == 2) {
                arrayList.add(((TransitLineLeg) next).f42110d);
            } else if (type == 9) {
                arrayList.add(((MultiTransitLinesLeg) next).mo48440b().f42110d);
            }
        }
        int size = arrayList.size() - 1;
        if (size > 0) {
            str = context.getResources().getQuantityString(R.plurals.transfers, size, new Object[]{Integer.valueOf(size)});
        } else {
            str = "";
        }
        textView2.setText(str);
        ImageView imageView = (ImageView) fVar2.f46706a.get(R.id.expand);
        if (z) {
            i = R.drawable.ic_arrow_up_12_primary;
        } else {
            i = R.drawable.ic_arrow_down_12_primary;
        }
        imageView.setImageResource(i);
        if (z) {
            i2 = R.string.voice_over_close_button;
        } else {
            i2 = R.string.voice_over_expand;
        }
        imageView.setContentDescription(context.getString(i2));
        if (z) {
            i3 = C20941h.m49043f(R.attr.colorSurfaceVariant, context);
        } else {
            i3 = C4732a.getColor(context, R.color.transparent);
        }
        view2.setBackgroundColor(i3);
        if (z) {
            C13382a.C13383a aVar = C13382a.f33219a;
            view2.sendAccessibilityEvent(SQLiteDatabase.OPEN_FULLMUTEX);
        }
        return view2;
    }
}
