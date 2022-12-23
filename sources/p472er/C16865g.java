package p472er;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.ImageView;
import android.widget.TextView;
import c00.C13717b;
import com.moovit.MoovitActivity;
import com.moovit.itinerary.model.EmissionLevel;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.CarpoolLeg;
import com.tranzmate.R;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p304x.C7109v;
import p584jl.C17885a;
import p924xt.C20604l;
import p977zz.C20964s0;

/* renamed from: er.g */
public final class C16865g {

    /* renamed from: a */
    public static final Set<CarpoolLeg.CarpoolProvider> f43870a = Collections.singleton(CarpoolLeg.CarpoolProvider.WAZE);

    /* renamed from: er.g$a */
    public static /* synthetic */ class C16866a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f43871a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider[] r0 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f43871a = r0
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.WAZE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f43871a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.MOOVIT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f43871a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.BLABLALINES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f43871a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.BLABLA     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f43871a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.KAROS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f43871a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r1 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolProvider.KLAXIT     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p472er.C16865g.C16866a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static SpannableStringBuilder m42678a(Context context, Itinerary itinerary, CarpoolLeg carpoolLeg) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        List<CarpoolLeg.CarpoolAttribute> list = carpoolLeg.f41977m;
        if (!C13717b.m34258e(list)) {
            for (CarpoolLeg.CarpoolAttribute next : list) {
                int i = next.colorAttrId;
                C20604l.m48424a(context, spannableStringBuilder, next.iconResId, 0, context.getString(next.textResId), i);
            }
        }
        EmissionLevel emissionLevel = itinerary.f41895c.f41909k;
        if (emissionLevel != null) {
            int colorAttrId = emissionLevel.f41891c.getColorAttrId();
            C20604l.m48424a(context, spannableStringBuilder, R.drawable.ic_co2_16, colorAttrId, context.getString(R.string.suggested_routes_co2_label, new Object[]{C17885a.m44416O(emissionLevel.f41890b, context)}), colorAttrId);
        }
        if (spannableStringBuilder.length() > 0) {
            return spannableStringBuilder;
        }
        return null;
    }

    /* renamed from: b */
    public static String m42679b(Context context, CarpoolLeg.CarpoolProvider carpoolProvider) {
        switch (C16866a.f43871a[carpoolProvider.ordinal()]) {
            case 1:
                return context.getString(R.string.waze_carpool_name);
            case 2:
                return context.getString(R.string.moovit_carpool_name);
            case 3:
                return context.getString(R.string.blablalines_name);
            case 4:
                return context.getString(R.string.blablacardaily_name);
            case 5:
                return context.getString(R.string.idfm_karos_carpool_name);
            case 6:
                return context.getString(R.string.idfm_klaxit_carpool_name);
            default:
                throw new IllegalStateException("Unknown carpool source: " + carpoolProvider);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01d5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01de  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42680c(android.view.View r14, com.moovit.carpool.CarpoolConfirmationRate r15) {
        /*
            if (r15 != 0) goto L_0x0008
            r15 = 8
            r14.setVisibility(r15)
            return
        L_0x0008:
            android.content.Context r0 = r14.getContext()
            r1 = 0
            r14.setVisibility(r1)
            r2 = 2131363993(0x7f0a0899, float:1.834781E38)
            android.view.View r2 = r14.findViewById(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            int r3 = r15.f40871b
            java.util.Locale r4 = java.util.Locale.getDefault()
            r5 = 1
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r6[r1] = r7
            java.lang.String r7 = "%1$d%%"
            java.lang.String r4 = java.lang.String.format(r4, r7, r6)
            r2.setText(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 35
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r6 = "min"
            ce0.C21100e.m49373x(r1, r6)
            java.lang.String r8 = "max"
            ce0.C21100e.m49373x(r4, r8)
            r9 = 36
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10 = 75
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            ce0.C21100e.m49373x(r9, r6)
            ce0.C21100e.m49373x(r10, r8)
            r11 = 76
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r12 = 100
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            ce0.C21100e.m49373x(r11, r6)
            ce0.C21100e.m49373x(r12, r8)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            int r1 = r13.compareTo(r1)
            if (r1 < 0) goto L_0x007b
            int r1 = r13.compareTo(r4)
            if (r1 > 0) goto L_0x007b
            r1 = 1
            goto L_0x007c
        L_0x007b:
            r1 = 0
        L_0x007c:
            r4 = 2130969057(0x7f0401e1, float:1.7546785E38)
            if (r1 == 0) goto L_0x0082
            goto L_0x00c6
        L_0x0082:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            int r9 = r1.compareTo(r9)
            if (r9 < 0) goto L_0x0094
            int r1 = r1.compareTo(r10)
            if (r1 > 0) goto L_0x0094
            r1 = 1
            goto L_0x0095
        L_0x0094:
            r1 = 0
        L_0x0095:
            if (r1 == 0) goto L_0x009b
            r1 = 2130969057(0x7f0401e1, float:1.7546785E38)
            goto L_0x00c9
        L_0x009b:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            int r9 = r1.compareTo(r11)
            if (r9 < 0) goto L_0x00ad
            int r1 = r1.compareTo(r12)
            if (r1 > 0) goto L_0x00ad
            r1 = 1
            goto L_0x00ae
        L_0x00ad:
            r1 = 0
        L_0x00ae:
            if (r1 == 0) goto L_0x00b4
            r1 = 2130968985(0x7f040199, float:1.754664E38)
            goto L_0x00c9
        L_0x00b4:
            de.f r1 = p435de.C16596f.m42113a()
            com.moovit.commons.utils.ApplicationBugException r9 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r10 = "Illegal response rate value: "
            java.lang.String r3 = p379.C16759e.m42349e(r10, r3)
            r9.<init>((java.lang.String) r3)
            r1.mo49364c(r9)
        L_0x00c6:
            r1 = 2130968971(0x7f04018b, float:1.754661E38)
        L_0x00c9:
            int r1 = p977zz.C20941h.m49043f(r1, r0)
            r2.setTextColor(r1)
            r1 = 2131362022(0x7f0a00e6, float:1.8343813E38)
            android.view.View r1 = r14.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            int r2 = r15.f40872c
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
            r10 = 0
            r5[r10] = r9
            java.lang.String r3 = java.lang.String.format(r3, r7, r5)
            r1.setText(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r10)
            r5 = 25
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            ce0.C21100e.m49373x(r3, r6)
            ce0.C21100e.m49373x(r5, r8)
            r7 = 26
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 70
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            ce0.C21100e.m49373x(r7, r6)
            ce0.C21100e.m49373x(r9, r8)
            r10 = 71
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11 = 100
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            ce0.C21100e.m49373x(r10, r6)
            ce0.C21100e.m49373x(r11, r8)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
            int r3 = r12.compareTo(r3)
            if (r3 < 0) goto L_0x0135
            int r3 = r12.compareTo(r5)
            if (r3 > 0) goto L_0x0135
            r3 = 1
            goto L_0x0136
        L_0x0135:
            r3 = 0
        L_0x0136:
            if (r3 == 0) goto L_0x0139
            goto L_0x017d
        L_0x0139:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r5 = r3.compareTo(r7)
            if (r5 < 0) goto L_0x014b
            int r3 = r3.compareTo(r9)
            if (r3 > 0) goto L_0x014b
            r3 = 1
            goto L_0x014c
        L_0x014b:
            r3 = 0
        L_0x014c:
            if (r3 == 0) goto L_0x0152
            r2 = 2130969057(0x7f0401e1, float:1.7546785E38)
            goto L_0x0180
        L_0x0152:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            int r5 = r3.compareTo(r10)
            if (r5 < 0) goto L_0x0164
            int r3 = r3.compareTo(r11)
            if (r3 > 0) goto L_0x0164
            r3 = 1
            goto L_0x0165
        L_0x0164:
            r3 = 0
        L_0x0165:
            if (r3 == 0) goto L_0x016b
            r2 = 2130968985(0x7f040199, float:1.754664E38)
            goto L_0x0180
        L_0x016b:
            de.f r3 = p435de.C16596f.m42113a()
            com.moovit.commons.utils.ApplicationBugException r5 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r7 = "Illegal approval rate value: "
            java.lang.String r2 = p379.C16759e.m42349e(r7, r2)
            r5.<init>((java.lang.String) r2)
            r3.mo49364c(r5)
        L_0x017d:
            r2 = 2130968971(0x7f04018b, float:1.754661E38)
        L_0x0180:
            int r2 = p977zz.C20941h.m49043f(r2, r0)
            r1.setTextColor(r2)
            r1 = 2131363995(0x7f0a089b, float:1.8347815E38)
            android.view.View r14 = r14.findViewById(r1)
            android.widget.TextView r14 = (android.widget.TextView) r14
            int r15 = r15.f40873d
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r2 = (long) r15
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MINUTES
            long r1 = r1.convert(r2, r5)
            java.lang.String r1 = com.moovit.util.time.C7925b.m18021i(r0, r1)
            r14.setText(r1)
            r1 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 14
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            ce0.C21100e.m49373x(r1, r6)
            ce0.C21100e.m49373x(r2, r8)
            r3 = 15
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r5 = 60
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            ce0.C21100e.m49373x(r3, r6)
            ce0.C21100e.m49373x(r7, r8)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r15)
            int r1 = r6.compareTo(r1)
            if (r1 < 0) goto L_0x01d7
            int r1 = r6.compareTo(r2)
            if (r1 > 0) goto L_0x01d7
            r1 = 1
            goto L_0x01d8
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            if (r1 == 0) goto L_0x01de
            r4 = 2130968985(0x7f040199, float:1.754664E38)
            goto L_0x020c
        L_0x01de:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            int r2 = r1.compareTo(r3)
            if (r2 < 0) goto L_0x01f0
            int r1 = r1.compareTo(r7)
            if (r1 > 0) goto L_0x01f0
            r1 = 1
            goto L_0x01f1
        L_0x01f0:
            r1 = 0
        L_0x01f1:
            if (r1 == 0) goto L_0x01f4
            goto L_0x020c
        L_0x01f4:
            if (r15 <= r5) goto L_0x01f7
            goto L_0x0209
        L_0x01f7:
            de.f r1 = p435de.C16596f.m42113a()
            com.moovit.commons.utils.ApplicationBugException r2 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.String r3 = "Illegal response time value: "
            java.lang.String r15 = p379.C16759e.m42349e(r3, r15)
            r2.<init>((java.lang.String) r15)
            r1.mo49364c(r2)
        L_0x0209:
            r4 = 2130968971(0x7f04018b, float:1.754661E38)
        L_0x020c:
            int r15 = p977zz.C20941h.m49043f(r4, r0)
            r14.setTextColor(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p472er.C16865g.m42680c(android.view.View, com.moovit.carpool.CarpoolConfirmationRate):void");
    }

    /* renamed from: d */
    public static void m42681d(ImageView imageView, Uri uri) {
        C17885a.m44469w0(imageView, uri, R.drawable.img_profile_seat_belt_90_gray52);
    }

    /* renamed from: e */
    public static void m42682e(MoovitActivity moovitActivity, TextView textView) {
        Resources resources = moovitActivity.getResources();
        String string = resources.getString(R.string.carpool_passenger_registration_terms_of_use_link_text);
        textView.setText(resources.getString(R.string.carpool_passenger_registration_terms_of_use, new Object[]{string}));
        C20964s0.m49105w(textView, string, false, new C7109v(11, moovitActivity, resources));
    }
}
