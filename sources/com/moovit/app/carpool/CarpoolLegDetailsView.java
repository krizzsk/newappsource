package com.moovit.app.carpool;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.UiUtils;
import com.moovit.commons.view.FormatTextView;
import com.moovit.itinerary.model.Itinerary;
import com.moovit.itinerary.model.leg.Leg;
import com.tranzmate.R;
import e20.C16783l;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p641lu.C18277b;
import p977zz.C20941h;

public class CarpoolLegDetailsView extends ConstraintLayout {

    /* renamed from: h */
    public final FormatTextView f37627h;

    /* renamed from: i */
    public final CarpoolRidePriceView f37628i;

    /* renamed from: j */
    public final FormatTextView f37629j;

    /* renamed from: k */
    public final TextView f37630k;

    /* renamed from: l */
    public final ImageView f37631l;

    /* renamed from: m */
    public final ImageView f37632m;

    /* renamed from: n */
    public final TextView f37633n;

    /* renamed from: o */
    public final RatingBar f37634o;

    /* renamed from: p */
    public final TextView f37635p;

    /* renamed from: q */
    public final TextView f37636q;

    /* renamed from: r */
    public final TextView f37637r;

    /* renamed from: s */
    public final TextView f37638s;

    /* renamed from: t */
    public final TextView f37639t;

    public CarpoolLegDetailsView() {
        throw null;
    }

    public CarpoolLegDetailsView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: c */
    public static String m37191c(Context context, Itinerary itinerary, int i, int i2, boolean z) {
        Leg leg;
        if (z) {
            List<Leg> u0 = itinerary.mo48295u0();
            C18277b bVar = C16783l.f43688a;
            if (i <= 0 || i > u0.size() - 1) {
                leg = null;
            } else {
                leg = u0.get(i - 1);
            }
        } else {
            leg = C16783l.m42489u(i, itinerary.mo48295u0());
        }
        if (leg == null || leg.getType() != 1) {
            return null;
        }
        return context.getString(i2, new Object[]{Long.valueOf(C16783l.m42488t(leg, TimeUnit.MINUTES))});
    }

    private void setDriverRating(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f37634o.setRating(f);
            this.f37634o.setVisibility(0);
            return;
        }
        this.f37634o.setVisibility(8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v15, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v18, resolved type: com.moovit.util.CurrencyAmount} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo44822d(com.moovit.itinerary.model.Itinerary r17, com.moovit.itinerary.model.leg.CarpoolLeg r18, boolean r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            android.content.Context r3 = r16.getContext()
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolDriverInfo r4 = r2.f41976l
            r5 = 2
            boolean r6 = e20.C16783l.m42469a(r1, r5)
            java.lang.String r7 = e20.C16783l.m42486r(r3, r1)
            com.moovit.commons.view.FormatTextView r8 = r0.f37627h
            java.lang.String r8 = r8.getFormat()
            boolean r8 = p977zz.C20964s0.m49090h(r8)
            r9 = 0
            r10 = 1
            if (r8 == 0) goto L_0x0029
            com.moovit.commons.view.FormatTextView r8 = r0.f37627h
            r8.setText(r7)
            goto L_0x0032
        L_0x0029:
            com.moovit.commons.view.FormatTextView r8 = r0.f37627h
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r9] = r7
            r8.setArguments(r11)
        L_0x0032:
            com.moovit.commons.view.FormatTextView r7 = r0.f37627h
            r8 = 2131889654(0x7f120df6, float:1.9413978E38)
            java.lang.Object[] r11 = new java.lang.Object[r10]
            java.lang.CharSequence r12 = r7.getText()
            r11[r9] = r12
            java.lang.String r8 = r3.getString(r8, r11)
            r7.setContentDescription(r8)
            com.moovit.carpool.CarpoolRide r7 = r2.f41980p
            com.moovit.util.CurrencyAmount r8 = r2.f41974j
            r11 = 0
            r12 = 8
            if (r7 == 0) goto L_0x0070
            com.moovit.app.carpool.CarpoolRidePriceView r6 = r0.f37628i
            com.moovit.util.CurrencyAmount r8 = r7.f40917i
            com.moovit.util.CurrencyAmount r7 = r7.f40918j
            r6.mo24682a(r8, r7, r11)
            com.moovit.app.carpool.CarpoolRidePriceView r6 = r0.f37628i
            r7 = 2130970304(0x7f0406c0, float:1.7549314E38)
            r8 = 2130969032(0x7f0401c8, float:1.7546734E38)
            android.widget.TextView r6 = r6.f23947f
            p977zz.C20964s0.m49107y(r6, r7, r8)
            com.moovit.app.carpool.CarpoolRidePriceView r6 = r0.f37628i
            r6.setVisibility(r9)
            com.moovit.commons.view.FormatTextView r6 = r0.f37629j
            r6.setVisibility(r12)
            goto L_0x00af
        L_0x0070:
            if (r6 != 0) goto L_0x00a2
            if (r8 == 0) goto L_0x00a2
            com.moovit.commons.view.FormatTextView r6 = r0.f37629j
            java.lang.Object[] r7 = new java.lang.Object[r10]
            if (r19 == 0) goto L_0x0092
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            java.lang.String r8 = r8.toString()
            r13.<init>(r8)
            android.text.style.StrikethroughSpan r8 = new android.text.style.StrikethroughSpan
            r8.<init>()
            int r14 = r13.length()
            r15 = 33
            r13.setSpan(r8, r9, r14, r15)
            r8 = r13
        L_0x0092:
            r7[r9] = r8
            r6.setSpannedArguments(r7)
            com.moovit.commons.view.FormatTextView r6 = r0.f37629j
            r6.setVisibility(r9)
            com.moovit.app.carpool.CarpoolRidePriceView r6 = r0.f37628i
            r6.setVisibility(r12)
            goto L_0x00af
        L_0x00a2:
            android.view.View[] r6 = new android.view.View[r5]
            com.moovit.app.carpool.CarpoolRidePriceView r7 = r0.f37628i
            r6[r9] = r7
            com.moovit.commons.view.FormatTextView r7 = r0.f37629j
            r6[r10] = r7
            com.moovit.commons.utils.UiUtils.m40238F(r12, r6)
        L_0x00af:
            android.widget.TextView r6 = r0.f37630k
            if (r19 == 0) goto L_0x00b5
            r7 = 0
            goto L_0x00b7
        L_0x00b5:
            r7 = 8
        L_0x00b7:
            r6.setVisibility(r7)
            com.moovit.image.model.Image r6 = r4.f41986c
            r7 = 2131231717(0x7f0803e5, float:1.8079523E38)
            if (r6 == 0) goto L_0x00eb
            r10.e r8 = p583jk.C17884p.m44353X(r3)
            r10.d r8 = r8.mo51642v(r6)
            r10.d r6 = r8.mo51628o0(r6)
            r10.d r6 = r6.mo22738w(r7)
            r10.d r6 = r6.mo22730m(r7)
            r6.getClass()
            com.bumptech.glide.load.resource.bitmap.DownsampleStrategy$c r7 = com.bumptech.glide.load.resource.bitmap.DownsampleStrategy.f7149b
            k6.j r8 = new k6.j
            r8.<init>()
            t6.a r6 = r6.mo22718I(r7, r8)
            r10.d r6 = (r10.C19220d) r6
            android.widget.ImageView r7 = r0.f37631l
            r6.mo10850T(r7)
            goto L_0x00f0
        L_0x00eb:
            android.widget.ImageView r6 = r0.f37631l
            r6.setImageResource(r7)
        L_0x00f0:
            com.moovit.image.model.Image r6 = r2.f41973i
            android.widget.ImageView r7 = r0.f37632m
            c20.C13744a.m34300b(r7, r6)
            java.lang.String r6 = r4.f41985b
            android.widget.TextView r7 = r0.f37633n
            if (r6 == 0) goto L_0x00fe
            goto L_0x010f
        L_0x00fe:
            r6 = 2131886565(0x7f1201e5, float:1.9407712E38)
            java.lang.Object[] r8 = new java.lang.Object[r10]
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolProvider r13 = r2.f41971g
            java.lang.String r13 = p472er.C16865g.m42679b(r3, r13)
            r8[r9] = r13
            java.lang.String r6 = r3.getString(r6, r8)
        L_0x010f:
            r7.setText(r6)
            float r6 = r4.f41987d
            r0.setDriverRating(r6)
            int r7 = r4.f41988e
            if (r7 <= 0) goto L_0x0120
            r8 = 0
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 > 0) goto L_0x0126
        L_0x0120:
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r6 = r2.f41972h
            com.moovit.itinerary.model.leg.CarpoolLeg$CarpoolType r8 = com.moovit.itinerary.model.leg.CarpoolLeg.CarpoolType.ANONYMOUS
            if (r6 == r8) goto L_0x0145
        L_0x0126:
            android.widget.TextView r6 = r0.f37635p
            if (r7 <= 0) goto L_0x013a
            r8 = 2131886645(0x7f120235, float:1.9407875E38)
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r13[r9] = r7
            java.lang.String r7 = r3.getString(r8, r13)
            goto L_0x0141
        L_0x013a:
            r7 = 2131886642(0x7f120232, float:1.9407869E38)
            java.lang.String r7 = r3.getString(r7)
        L_0x0141:
            com.moovit.commons.utils.UiUtils.m40234B(r6, r7)
            goto L_0x014a
        L_0x0145:
            android.widget.TextView r6 = r0.f37635p
            r6.setVisibility(r12)
        L_0x014a:
            com.moovit.carpool.CarpoolCar r4 = r4.f41989f
            if (r4 == 0) goto L_0x0163
            java.lang.String r6 = r4.f40866d
            if (r6 == 0) goto L_0x0163
            java.lang.String r4 = r4.f40865c
            if (r4 == 0) goto L_0x0163
            r7 = 2131886621(0x7f12021d, float:1.9407826E38)
            java.lang.Object[] r8 = new java.lang.Object[r5]
            r8[r9] = r6
            r8[r10] = r4
            java.lang.String r11 = r3.getString(r7, r8)
        L_0x0163:
            android.widget.TextView r4 = r0.f37636q
            com.moovit.commons.utils.UiUtils.m40234B(r4, r11)
            com.moovit.util.time.Time r4 = r2.f41966b
            long r6 = r4.mo24631g()
            java.lang.String r4 = com.moovit.util.time.C7925b.m18024l(r3, r6)
            com.moovit.transit.LocationDescriptor r6 = r2.f41969e
            java.lang.String r6 = r6.mo24313f()
            android.widget.TextView r7 = r0.f37637r
            r8 = 2131886567(0x7f1201e7, float:1.9407716E38)
            java.lang.Object[] r11 = new java.lang.Object[r5]
            r11[r9] = r4
            r11[r10] = r6
            java.lang.String r4 = r3.getString(r8, r11)
            com.moovit.commons.utils.UiUtils.m40234B(r7, r4)
            java.util.List r4 = r17.mo48295u0()
            int r4 = e20.C16783l.m42475g(r4, r2)
            r6 = 2131886784(0x7f1202c0, float:1.9408157E38)
            java.lang.String r6 = m37191c(r3, r1, r4, r6, r10)
            r7 = 2131886783(0x7f1202bf, float:1.9408155E38)
            java.lang.String r4 = m37191c(r3, r1, r4, r7, r9)
            r7 = 2131888899(0x7f120b03, float:1.9412446E38)
            java.lang.String r7 = r3.getString(r7)
            java.lang.CharSequence[] r5 = new java.lang.CharSequence[r5]
            r5[r9] = r6
            r5[r10] = r4
            java.lang.CharSequence r4 = p977zz.C20964s0.m49099q(r7, r5)
            android.widget.TextView r5 = r0.f37638s
            r5.setText(r4)
            android.widget.TextView r5 = r0.f37638s
            boolean r4 = p977zz.C20964s0.m49090h(r4)
            if (r4 == 0) goto L_0x01c0
            r9 = 8
        L_0x01c0:
            r5.setVisibility(r9)
            android.widget.TextView r4 = r0.f37639t
            android.text.SpannableStringBuilder r1 = p472er.C16865g.m42678a(r3, r1, r2)
            com.moovit.commons.utils.UiUtils.m40234B(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.carpool.CarpoolLegDetailsView.mo44822d(com.moovit.itinerary.model.Itinerary, com.moovit.itinerary.model.leg.CarpoolLeg, boolean):void");
    }

    public CarpoolLegDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setBackground(C20941h.m49045h(R.attr.selectableItemBackground, context));
        setMinimumHeight(UiUtils.m40249h(context.getResources(), 108.0f));
        int h = UiUtils.m40249h(context.getResources(), 16.0f);
        setPadding(0, h, 0, h);
        LayoutInflater.from(context).inflate(R.layout.carpool_leg_details_content, this, true);
        this.f37627h = (FormatTextView) findViewById(R.id.relative_time);
        this.f37628i = (CarpoolRidePriceView) findViewById(R.id.ride_price);
        this.f37629j = (FormatTextView) findViewById(R.id.estimated_price);
        this.f37630k = (TextView) findViewById(R.id.free_ride_view);
        this.f37631l = (ImageView) findViewById(R.id.driver_image);
        this.f37632m = (ImageView) findViewById(R.id.carpool_image);
        this.f37633n = (TextView) findViewById(R.id.driver_name);
        this.f37634o = (RatingBar) findViewById(R.id.driver_rating);
        this.f37635p = (TextView) findViewById(R.id.number_of_rides);
        this.f37636q = (TextView) findViewById(R.id.driver_car);
        this.f37637r = (TextView) findViewById(R.id.pickup_time_address);
        this.f37638s = (TextView) findViewById(R.id.pickup_drop_off_walk);
        this.f37639t = (TextView) findViewById(R.id.attribute_view);
    }
}
