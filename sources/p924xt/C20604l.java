package p924xt;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import b20.C13569d;
import c00.C13717b;
import c00.C13720d;
import c00.C13722f;
import com.moovit.app.ads.AdSource;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.commons.utils.UiUtils;
import com.moovit.database.DbEntityRef;
import com.moovit.itinerary.TripPlanFlexTimeBanner;
import com.moovit.itinerary.TripPlanTodBanner;
import com.moovit.itinerary.model.EmissionLevel;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.ItinerarySection;
import com.moovit.itinerary.model.ItinerarySectionBranding;
import com.moovit.itinerary.model.leg.BicycleRentalLeg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleStop;
import com.moovit.transit.Schedule;
import com.moovit.tripplanner.TripPlannerSortType;
import com.moovit.util.time.C7925b;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import k00.C17988b;
import p009a8.C0112l;
import p025b6.C1488c;
import p066e0.C4454r0;
import p146k6.C5504j;
import p504fz.C17133e;
import p584jl.C17885a;
import p716oy.C18860a;
import p828tt.C19759a;
import p899ws.C20406f;
import p977zz.C20941h;
import p977zz.C20958p0;
import p977zz.C20964s0;
import q20.C19078d;

/* renamed from: xt.l */
public final class C20604l {

    /* renamed from: a */
    public static final C20596g f52116a;

    /* renamed from: b */
    public static final List<C20589d> f52117b;

    /* renamed from: c */
    public static final SparseArray<C20589d> f52118c;

    /* renamed from: xt.l$a */
    public static /* synthetic */ class C20605a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52119a;

        static {
            int[] iArr = new int[ItinerarySection.Type.values().length];
            f52119a = iArr;
            try {
                iArr[ItinerarySection.Type.CARPOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    static {
        ItinerarySection itinerarySection = new ItinerarySection(new ServerId(Integer.parseInt("-1000")), ItinerarySection.Type.UNSPECIFIED, (TripPlannerSortType) null, "", 1, false, (ItinerarySectionBranding) null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new C20595f((Itinerary) null, (C20618y) null, (C20596g) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null, AdSource.SUGGESTED_ROUTES_NATIVE_AD));
        f52116a = new C20596g(itinerarySection, arrayList, (C20595f) null);
        List<C20589d> list = C18860a.m45884a().f48025m;
        if (list == null) {
            list = Arrays.asList(new C20589d[]{new C20606m(), new C20615v(), new C20616w(), new C20607n(), new C20608o(), new C20614u(), new C20611r(), new C20613t(), new C20612s(), new C20610q(), new C20617x(), new C20586b(), new C20588c()});
        }
        HashSet<O> g = C13720d.m34277g(list, (C13722f) null, new C0112l(2));
        if (C20589d.f52074b.containsAll(g)) {
            f52117b = list;
            f52118c = new SparseArray<>(list.size());
            for (C20589d next : list) {
                f52118c.put(next.f52075a, next);
            }
            if (f52117b.size() != f52118c.size()) {
                throw new ApplicationBugException("Forms must contain unique id");
            }
            return;
        }
        HashSet g2 = C13720d.m34277g(C20589d.f52074b, new C20601i(g, 0), C13720d.f33796a);
        StringBuilder k = C13555b.m33972k("Missing form types! missing=");
        k.append(C13717b.m34269p(g2));
        throw new ApplicationBugException(k.toString());
    }

    /* renamed from: a */
    public static void m48424a(Context context, SpannableStringBuilder spannableStringBuilder, int i, int i2, String str, int i3) {
        Drawable drawable;
        if (spannableStringBuilder.length() > 0) {
            spannableStringBuilder.append("  ");
        }
        if (i2 != 0) {
            drawable = C17988b.m44612c(context, i, i2);
        } else {
            drawable = C17988b.m44611b(i, context);
        }
        if (drawable != null) {
            spannableStringBuilder.append(C20964s0.m49086d(drawable, 2)).append(' ');
        }
        int length = spannableStringBuilder.length();
        int f = C20941h.m49043f(i3, context);
        spannableStringBuilder.append(str);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(f), length, str.length() + length, 33);
    }

    @SuppressLint({"Range"})
    /* renamed from: b */
    public static SpannableStringBuilder m48425b(Context context, boolean z, int i, EmissionLevel emissionLevel) {
        int i2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (i >= 0 && i <= 100) {
            int b = C19078d.m46200b(i);
            if (z) {
                i2 = R.drawable.ic_battery_16;
            } else {
                i2 = R.drawable.ic_gazoline_14;
            }
            m48424a(context, spannableStringBuilder, i2, b, context.getString(R.string.format_percentage, new Object[]{Integer.valueOf(i)}), b);
        }
        if (emissionLevel != null) {
            int colorAttrId = emissionLevel.f41891c.getColorAttrId();
            Context context2 = context;
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            int i3 = colorAttrId;
            m48424a(context2, spannableStringBuilder2, R.drawable.ic_co2_16, i3, context.getString(R.string.suggested_routes_co2_label, new Object[]{C17885a.m44416O(emissionLevel.f41890b, context)}), colorAttrId);
        }
        if (spannableStringBuilder.length() > 0) {
            return spannableStringBuilder;
        }
        return null;
    }

    /* renamed from: c */
    public static C20595f m48426c(Context context, ItinerarySection itinerarySection, List<C20595f> list) {
        C20618y yVar;
        C20618y yVar2;
        if (!itinerarySection.f41914c.isShowMoreSupported()) {
            return null;
        }
        if (C20605a.f52119a[itinerarySection.f41914c.ordinal()] != 1) {
            return new C20595f((Itinerary) null, new C20618y(itinerarySection.f41914c.getShowMoreResId(), (ArrayList) null, (C1488c) null), (C20596g) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null, (AdSource) null);
        }
        if (C13717b.m34258e(list)) {
            yVar2 = new C20618y(itinerarySection.f41914c.getShowMoreResId(), (ArrayList) null, (C1488c) null);
        } else {
            ArrayList arrayList = new ArrayList(list.size());
            for (C20595f fVar : list) {
                Itinerary itinerary = fVar.f52087a;
                if (itinerary != null) {
                    C13720d.m34276f(itinerary.mo48295u0(), new C20603k(0), new C4454r0(3), arrayList);
                }
            }
            if (arrayList.isEmpty()) {
                yVar2 = new C20618y(itinerarySection.f41914c.getShowMoreResId(), (ArrayList) null, (C1488c) null);
            } else {
                int f = C20941h.m49043f(R.attr.colorSurface, context);
                int h = UiUtils.m40249h(context.getResources(), 1.0f);
                yVar = new C20618y(itinerarySection.f41914c.getShowMoreResId(), arrayList, new C1488c(new C5504j(), new C13569d(f, h)));
                return new C20595f((Itinerary) null, yVar, (C20596g) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null, (AdSource) null);
            }
        }
        yVar = yVar2;
        return new C20595f((Itinerary) null, yVar, (C20596g) null, (TripPlanTodBanner) null, (TripPlanFlexTimeBanner) null, (AdSource) null);
    }

    /* renamed from: d */
    public static CharSequence m48427d(Context context, BicycleRentalLeg bicycleRentalLeg, C17133e eVar) {
        BicycleStop bicycleStop;
        DbEntityRef<BicycleStop> c = bicycleRentalLeg.mo48345c();
        if (c == null || (bicycleStop = c.get()) == null) {
            return null;
        }
        String string = context.getString(R.string.suggest_routes_real_time_metadata_bicycle, new Object[]{bicycleStop.f23638d});
        if (eVar == null || eVar.f44363b < 0) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        spannableStringBuilder.append(C20964s0.f52718a);
        int length = spannableStringBuilder.length();
        Resources resources = context.getResources();
        int i = eVar.f44363b;
        spannableStringBuilder.append(resources.getQuantityString(R.plurals.available_bicycles, i, new Object[]{Integer.valueOf(i)}));
        spannableStringBuilder.setSpan(C20964s0.m49084b(context, R.attr.textAppearanceBodySmallStrong, R.attr.colorLive), length, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    /* renamed from: e */
    public static CharSequence m48428e(Context context, WaitToTransitLineLeg waitToTransitLineLeg, Schedule schedule) {
        List list;
        Context context2 = context;
        WaitToTransitLineLeg waitToTransitLineLeg2 = waitToTransitLineLeg;
        String str = waitToTransitLineLeg2.f42136g.get().f23731c;
        if (schedule != null) {
            list = C13717b.m34260g(3, C13717b.m34265l(schedule.mo24327n(), new C20406f(4)));
        } else {
            list = Collections.emptyList();
        }
        if (list.isEmpty()) {
            Time time = waitToTransitLineLeg2.f42132c;
            String string = context2.getString(R.string.suggest_routes_static_time_metadata);
            Object[] objArr = {C7925b.m18024l(context2, time.mo24631g()), str};
            String str2 = C20964s0.f52718a;
            return String.format((Locale) null, string, objArr);
        }
        long currentTimeMillis = System.currentTimeMillis();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(C20964s0.m49085c(context2, R.drawable.ic_real_time_12_live));
        ArrayList<Long> c = C13720d.m34273c(list, (C13722f) null, new C19759a(1));
        spannableStringBuilder.append(C7925b.f23936c.mo24608h(context, currentTimeMillis, c, Long.MAX_VALUE, Collections.emptySet()));
        spannableStringBuilder.setSpan(C20964s0.m49084b(context2, R.attr.textAppearanceBodySmallStrong, R.attr.colorLive), 1, spannableStringBuilder.length(), 33);
        HashSet hashSet = new HashSet(c.size());
        for (Long longValue : c) {
            hashSet.add(Long.valueOf(C7925b.m18026n(currentTimeMillis, longValue.longValue())));
        }
        if (hashSet.contains(0L)) {
            return C20958p0.m49077a(context2.getText(R.string.suggest_routes_real_time_metadata_leaves), spannableStringBuilder, str);
        }
        return C20958p0.m49077a(context2.getText(R.string.suggest_routes_real_time_metadata), spannableStringBuilder, str);
    }

    /* renamed from: f */
    public static ArrayList m48429f(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20595f fVar = (C20595f) it.next();
            Itinerary itinerary = fVar.f52087a;
            if (itinerary != null) {
                arrayList.add(itinerary);
            } else {
                C20596g gVar = fVar.f52089c;
                if (gVar != null) {
                    arrayList.addAll(m48429f(gVar));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static int m48430g(List<C20596g> list, ItinerarySection.Type type, ServerId serverId) {
        for (C20596g next : list) {
            if (type.equals(next.f52093d.f41914c) && serverId.equals(next.f52093d.f41913b)) {
                return next.mo52801s();
            }
        }
        return -1;
    }
}
