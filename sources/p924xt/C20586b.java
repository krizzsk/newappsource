package p924xt;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.app.carpool.CarpoolRidePriceView;
import com.moovit.carpool.CarpoolRide;
import com.moovit.commons.utils.AppDeepLink;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.moovit.tripplanner.TripPlannerLocations;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import e20.C16783l;
import ja0.C12797f;
import java.util.Set;
import o00.C18669f;
import o00.C18670g;
import p009a8.C0112l;
import p373au.C13527c;
import p472er.C16865g;
import p977zz.C20958p0;
import p977zz.C20964s0;

/* renamed from: xt.b */
public final class C20586b extends C20589d {

    /* renamed from: c */
    public static final /* synthetic */ int f52072c = 0;

    /* renamed from: xt.b$a */
    public static /* synthetic */ class C20587a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f52073a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType[] r0 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f52073a = r0
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.SINGLE_DRIVER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f52073a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.ANONYMOUS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f52073a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.NEARBY_DRIVERS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p924xt.C20586b.C20587a.<clinit>():void");
        }
    }

    public C20586b() {
        super(12);
    }

    /* renamed from: o */
    public static String m48357o(Context context, String str, String str2, boolean z) {
        if (z) {
            return context.getString(R.string.carpool_pickup_soon_from, new Object[]{str2});
        }
        return context.getString(R.string.carpool_booking_pickup_when_from, new Object[]{str, str2});
    }

    /* renamed from: a */
    public final void mo52782a(C12797f fVar, Itinerary itinerary, TripPlannerLocations tripPlannerLocations) {
        boolean z;
        CharSequence charSequence;
        String str;
        boolean z2;
        int i;
        C12797f fVar2 = fVar;
        Itinerary itinerary2 = itinerary;
        super.mo52782a(fVar, itinerary, tripPlannerLocations);
        Context e = fVar.mo39638e();
        CarpoolLeg carpoolLeg = (CarpoolLeg) mo52791j(itinerary2);
        CarpoolLeg.CarpoolDriverInfo carpoolDriverInfo = carpoolLeg.f41976l;
        CarpoolRide carpoolRide = carpoolLeg.f41980p;
        boolean a = C16783l.m42469a(itinerary2, 2);
        if (carpoolLeg.f41972h == CarpoolLeg.CarpoolType.SINGLE_DRIVER) {
            z = true;
        } else {
            z = false;
        }
        RecyclerView recyclerView = (RecyclerView) fVar2.mo39639f(R.id.legs_preview);
        recyclerView.setAdapter(new C13527c(e, itinerary2));
        recyclerView.setChildDrawingOrderCallback(new C0112l(13));
        CarpoolRidePriceView carpoolRidePriceView = (CarpoolRidePriceView) fVar2.mo39639f(R.id.ride_price);
        FormatTextView formatTextView = (FormatTextView) fVar2.mo39639f(R.id.estimated_price);
        TextView textView = (TextView) fVar2.mo39639f(R.id.free_ride_view);
        if (carpoolRide != null) {
            carpoolRidePriceView.mo24682a(carpoolRide.f40917i, carpoolRide.f40918j, (String) null);
            C20964s0.m49107y(carpoolRidePriceView.f23947f, R.attr.textAppearanceBodySmall, R.attr.colorOnSecondaryEmphasisMedium);
            carpoolRidePriceView.setVisibility(0);
            UiUtils.m40238F(8, textView, formatTextView);
        } else if (a || carpoolLeg.f41974j == null) {
            UiUtils.m40238F(8, carpoolRidePriceView, formatTextView, textView);
        } else {
            Set<CarpoolLeg.CarpoolProvider> set = C16865g.f43870a;
            AppDeepLink appDeepLink = carpoolLeg.f41978n;
            if (!C16865g.f43870a.contains(carpoolLeg.f41971g) || appDeepLink == null || appDeepLink.mo46945b(e)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z2) {
                i = 0;
            } else {
                i = 8;
            }
            textView.setVisibility(i);
            formatTextView.setArguments(carpoolLeg.f41974j);
            UiUtils.m40265x(textView, formatTextView);
            carpoolRidePriceView.setVisibility(8);
        }
        RatingBar ratingBar = (RatingBar) fVar2.mo39639f(R.id.driver_rating);
        float f = carpoolDriverInfo.f41987d;
        if (!z || f < BitmapDescriptorFactory.HUE_RED) {
            ratingBar.setVisibility(8);
        } else {
            ratingBar.setRating(f);
            ratingBar.setVisibility(0);
        }
        TextView textView2 = (TextView) fVar2.mo39639f(R.id.number_of_rides);
        int i2 = carpoolDriverInfo.f41988e;
        if (z) {
            if (i2 > 0) {
                str = e.getString(R.string.carpool_number_of_rides, new Object[]{Integer.valueOf(i2)});
            } else {
                str = e.getString(R.string.carpool_no_rides);
            }
            UiUtils.m40234B(textView2, str);
        } else {
            textView2.setVisibility(8);
        }
        TextView textView3 = (TextView) fVar2.mo39639f(R.id.metadata);
        Context e2 = fVar.mo39638e();
        String f2 = carpoolLeg.f41969e.mo24313f();
        String l = C7925b.m18024l(e2, carpoolLeg.f41966b.mo24631g());
        CarpoolLeg.CarpoolType carpoolType = carpoolLeg.f41972h;
        int i3 = C20587a.f52073a[carpoolType.ordinal()];
        if (i3 == 1) {
            StringBuilder sb = new StringBuilder();
            CarpoolLeg.CarpoolDriverInfo carpoolDriverInfo2 = carpoolLeg.f41976l;
            if (!C20964s0.m49090h(carpoolDriverInfo2.f41985b)) {
                sb.append(e2.getString(R.string.carpool_ride_with, new Object[]{carpoolDriverInfo2.f41985b}));
                sb.append(e2.getString(R.string.string_list_delimiter_dot));
            }
            sb.append(m48357o(e2, l, f2, carpoolLeg.f41968d));
            charSequence = sb;
        } else if (i3 == 2) {
            charSequence = m48357o(e2, l, f2, carpoolLeg.f41968d);
        } else if (i3 == 3) {
            CharSequence text = e2.getText(R.string.carpool_booking_no_specific_driver);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append(C20964s0.m49085c(e2, R.drawable.ic_real_time_12_live));
            spannableStringBuilder.append(C7925b.f23936c.mo24602b(e2, 0));
            spannableStringBuilder.setSpan(C20964s0.m49084b(e2, R.attr.textAppearanceCaptionStrong, R.attr.colorLive), 1, spannableStringBuilder.length(), 33);
            charSequence = C20958p0.m49077a(text, spannableStringBuilder);
        } else {
            throw new IllegalStateException("Unknown carpool type: " + carpoolType);
        }
        textView3.setText(charSequence);
        UiUtils.m40234B((TextView) fVar2.mo39639f(R.id.attribute_view), C16865g.m42678a(e, itinerary2, carpoolLeg));
        C20589d.m48367e(fVar, itinerary);
    }

    /* renamed from: h */
    public final View mo52786h(ViewGroup viewGroup) {
        View e = C13715c.m34239e(viewGroup, R.layout.suggested_routes_carpool_leg_result, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) e.findViewById(R.id.legs_preview);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(R.dimen.screen_edge) - UiUtils.m40249h(viewGroup.getResources(), 3.0f);
        recyclerView.mo4593g(C18669f.m45651e(dimensionPixelSize), -1);
        recyclerView.mo4593g(C18670g.m45652e(dimensionPixelSize), -1);
        return e;
    }

    /* renamed from: k */
    public final int mo52787k() {
        return 7;
    }

    /* renamed from: n */
    public final boolean mo52788n(Itinerary itinerary) {
        return C16783l.m42469a(itinerary, 7);
    }
}
