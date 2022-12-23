package p971zt;

import a00.C13382a;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.app.itinerary.schedule.ItineraryScheduleActivity;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.transit.TransitLine;
import com.moovit.transit.TransitType;
import com.moovit.util.time.C7925b;
import com.tranzmate.R;
import da0.C12610a;
import g20.C17161i;
import ja0.C12797f;
import o00.C18676l;
import p824tp.C19728f;
import p977zz.C20964s0;

/* renamed from: zt.b */
public final class C20892b extends C18676l<C20893c, C18676l.C18679c<C20893c>, C12797f> {

    /* renamed from: j */
    public final C16181a.C16183b f52636j = new C16181a.C16183b();

    /* renamed from: k */
    public final C17161i<C16181a.C16184c, TransitLine> f52637k;

    /* renamed from: l */
    public final C12610a f52638l;

    public C20892b(ItineraryScheduleActivity itineraryScheduleActivity, C19728f fVar) {
        this.f52637k = fVar.mo52082b(LinePresentationType.STOP_DETAIL);
        this.f52638l = new C12610a(itineraryScheduleActivity);
    }

    /* renamed from: z */
    public static void m48884z(Context context, TextView textView, C20893c cVar) {
        String str;
        SpannableStringBuilder spannableStringBuilder;
        Resources resources = context.getResources();
        int i = cVar.f52643e;
        String str2 = null;
        if (i > 0) {
            str = resources.getQuantityString(R.plurals.stops, i, new Object[]{Integer.valueOf(i)});
        } else {
            str = null;
        }
        int i2 = cVar.f52644f;
        if (i2 > 0) {
            spannableStringBuilder = C7925b.f23935b.mo24602b(context, (long) i2);
        } else {
            spannableStringBuilder = null;
        }
        if (str != null && spannableStringBuilder != null) {
            CharSequence o = C20964s0.m49097o(resources.getString(R.string.string_list_delimiter_dot), str, spannableStringBuilder);
            str = C13382a.m33667c(str, context.getString(R.string.voice_over_tripplan_total_time, new Object[]{spannableStringBuilder}));
            str2 = o;
        } else if (str != null) {
            str2 = str;
        } else if (spannableStringBuilder != null) {
            str = context.getString(R.string.voice_over_tripplan_total_time, new Object[]{spannableStringBuilder});
            str2 = spannableStringBuilder;
        } else {
            str = null;
        }
        UiUtils.m40236D(textView, str2, 8);
        textView.setContentDescription(str);
    }

    /* renamed from: m */
    public final int mo40090m(int i, int i2) {
        int i3;
        C18676l.C18679c n = mo51052n(i);
        if (TransitType.ViewType.TRIPS.equals(((C20893c) n.getItem(i2)).f52640b.mo24369b().f23696d.get().f23674d.get().f23761f)) {
            i3 = 3;
        } else if (i == 0) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        if (i2 == n.mo40089e() - 1) {
            return i3 | 32768;
        }
        return i3;
    }

    /* renamed from: r */
    public final boolean mo40091r(int i) {
        int i2 = i & -32769;
        return i2 == 1 || i2 == 2 || i2 == 3;
    }

    /* JADX WARNING: type inference failed for: r8v8, types: [android.text.SpannableString] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23817t(androidx.recyclerview.widget.RecyclerView.C1119a0 r13, int r14, int r15) {
        /*
            r12 = this;
            ja0.f r13 = (ja0.C12797f) r13
            o00.l$c r14 = r12.mo51052n(r14)
            java.lang.Object r14 = r14.getItem(r15)
            zt.c r14 = (p971zt.C20893c) r14
            int r15 = r13.getItemViewType()
            int r0 = r13.getItemViewType()
            r1 = -32769(0xffffffffffff7fff, float:NaN)
            r0 = r0 & r1
            r1 = 1
            r2 = 2131363359(0x7f0a061f, float:1.8346525E38)
            r3 = 0
            if (r0 == r1) goto L_0x0298
            r4 = 2131363807(0x7f0a07df, float:1.8347433E38)
            r5 = 8
            r6 = 2
            if (r0 == r6) goto L_0x0228
            r2 = 3
            if (r0 != r2) goto L_0x021c
            android.content.Context r15 = r13.mo39638e()
            g20.i<com.moovit.l10n.a$c, com.moovit.transit.TransitLine> r0 = r12.f52637k
            com.moovit.l10n.a$b r2 = r12.f52636j
            com.moovit.transit.TransitLine r6 = r14.f52640b
            r0.mo48496a(r15, r2, r6)
            r0 = 2131363114(0x7f0a052a, float:1.8346028E38)
            android.view.View r0 = r13.mo39639f(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            com.moovit.l10n.a$b r2 = r12.f52636j
            com.moovit.image.model.Image r2 = r2.f42180b
            r10.e r6 = p583jk.C17884p.m44354Y(r0)
            r10.d r6 = r6.mo51642v(r2)
            r10.d r2 = r6.mo51628o0(r2)
            r2.mo10850T(r0)
            r0 = 2131364471(0x7f0a0a77, float:1.834878E38)
            android.view.View r0 = r13.mo39639f(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            com.moovit.l10n.a$b r2 = r12.f52636j
            java.lang.CharSequence r2 = r2.f42181c
            com.moovit.commons.utils.UiUtils.m40234B(r0, r2)
            r2 = 2131364278(0x7f0a09b6, float:1.8348389E38)
            android.view.View r2 = r13.mo39639f(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            com.moovit.l10n.a$b r6 = r12.f52636j
            java.lang.CharSequence r6 = r6.f42182d
            com.moovit.commons.utils.UiUtils.m40234B(r2, r6)
            r6 = 2131364231(0x7f0a0987, float:1.8348293E38)
            android.view.View r6 = r13.mo39639f(r6)
            android.widget.TextView r6 = (android.widget.TextView) r6
            com.moovit.util.time.Time r7 = r14.f52642d
            if (r7 == 0) goto L_0x0087
            long r8 = r7.f23901b
            java.lang.String r8 = com.moovit.util.time.C7925b.m18024l(r15, r8)
            goto L_0x009f
        L_0x0087:
            com.moovit.transit.Schedule r7 = r14.f52641c
            com.moovit.util.time.Time r7 = r7.mo24326m()
            if (r7 == 0) goto L_0x0098
            long r8 = r7.mo24631g()
            java.lang.String r8 = com.moovit.util.time.C7925b.m18024l(r15, r8)
            goto L_0x009f
        L_0x0098:
            r8 = 2131889506(0x7f120d62, float:1.9413677E38)
            java.lang.String r8 = r15.getString(r8)
        L_0x009f:
            if (r7 == 0) goto L_0x00af
            com.moovit.util.time.Time$Status r9 = com.moovit.util.time.Time.Status.CANCELED
            com.moovit.util.time.Time$Status r7 = r7.f23910k
            boolean r7 = r9.equals(r7)
            if (r7 == 0) goto L_0x00af
            android.text.SpannableString r8 = p952yy.C20785a.m48770b(r8)
        L_0x00af:
            r6.setText(r8)
            r7 = 2131363935(0x7f0a085f, float:1.8347693E38)
            android.view.View r7 = r13.mo39639f(r7)
            com.moovit.view.ScheduleView r7 = (com.moovit.view.ScheduleView) r7
            com.moovit.util.time.Time r8 = r14.f52642d
            r9 = 4
            if (r8 == 0) goto L_0x00cf
            boolean r8 = r8.mo24633j()
            if (r8 == 0) goto L_0x00cf
            r7.setVisibility(r3)
            com.moovit.util.time.Time r8 = r14.f52642d
            r7.setTime(r8)
            goto L_0x00d2
        L_0x00cf:
            r7.setVisibility(r9)
        L_0x00d2:
            r8 = 2131363937(0x7f0a0861, float:1.8347697E38)
            android.view.View r8 = r13.mo39639f(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            com.moovit.util.time.Time r10 = r14.f52642d
            if (r10 == 0) goto L_0x00e4
            android.text.SpannableString r10 = p952yy.C20785a.m48769a(r15, r10)
            goto L_0x00e5
        L_0x00e4:
            r10 = 0
        L_0x00e5:
            if (r10 == 0) goto L_0x00ee
            r8.setText(r10)
            r8.setVisibility(r3)
            goto L_0x00f1
        L_0x00ee:
            r8.setVisibility(r5)
        L_0x00f1:
            android.view.View r4 = r13.mo39639f(r4)
            com.moovit.commons.view.FormatTextView r4 = (com.moovit.commons.view.FormatTextView) r4
            com.moovit.util.time.Time r5 = r14.f52642d
            if (r5 == 0) goto L_0x00fe
            java.lang.String r5 = r5.f23909j
            goto L_0x00ff
        L_0x00fe:
            r5 = 0
        L_0x00ff:
            boolean r10 = p977zz.C20964s0.m49090h(r5)
            if (r10 != 0) goto L_0x011b
            r9 = 2131888452(0x7f120944, float:1.941154E38)
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r3] = r5
            java.lang.String r9 = r15.getString(r9, r10)
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r5
            r4.setArguments(r1)
            r4.setVisibility(r3)
            goto L_0x011f
        L_0x011b:
            r4.setVisibility(r9)
            r9 = 0
        L_0x011f:
            com.moovit.util.time.Time r1 = r14.f52642d
            if (r1 == 0) goto L_0x0126
            com.moovit.util.time.TimeVehicleAttributes r1 = r1.f23913n
            goto L_0x0127
        L_0x0126:
            r1 = 0
        L_0x0127:
            if (r1 == 0) goto L_0x0130
            da0.a r4 = r12.f52638l
            java.lang.CharSequence r4 = r4.mo39410b(r1)
            goto L_0x0131
        L_0x0130:
            r4 = 0
        L_0x0131:
            if (r4 == 0) goto L_0x0175
            java.lang.CharSequence r5 = r0.getText()
            boolean r5 = p977zz.C20964s0.m49090h(r5)
            if (r5 != 0) goto L_0x013e
            goto L_0x014a
        L_0x013e:
            java.lang.CharSequence r5 = r2.getText()
            boolean r5 = p977zz.C20964s0.m49090h(r5)
            if (r5 != 0) goto L_0x014a
            r5 = r2
            goto L_0x014b
        L_0x014a:
            r5 = r0
        L_0x014b:
            r5.setVisibility(r3)
            java.lang.CharSequence r10 = r5.getText()
            boolean r10 = p977zz.C20964s0.m49090h(r10)
            if (r10 != 0) goto L_0x015d
            java.lang.String r10 = " "
            r5.append(r10)
        L_0x015d:
            r5.append(r4)
            da0.a r4 = r12.f52638l
            java.lang.CharSequence r4 = r4.mo39409a(r1)
            r10 = 2
            java.lang.CharSequence[] r10 = new java.lang.CharSequence[r10]
            java.lang.CharSequence r11 = r5.getText()
            r10[r3] = r11
            r11 = 1
            r10[r11] = r4
            a00.C13382a.m33674j(r5, r10)
        L_0x0175:
            r4 = 2131362477(0x7f0a02ad, float:1.8344736E38)
            android.view.View r4 = r13.mo39639f(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r1 == 0) goto L_0x0183
            com.moovit.util.time.CongestionLevel r5 = r1.f23919c
            goto L_0x0184
        L_0x0183:
            r5 = 0
        L_0x0184:
            if (r1 == 0) goto L_0x0189
            com.moovit.util.time.CongestionSource r1 = r1.f23920d
            goto L_0x018a
        L_0x0189:
            r1 = 0
        L_0x018a:
            if (r5 == 0) goto L_0x0197
            aa0.C7554s.m17296a(r4, r5, r1)
            r4.setVisibility(r3)
            java.lang.CharSequence r1 = r4.getContentDescription()
            goto L_0x019d
        L_0x0197:
            r1 = 8
            r4.setVisibility(r1)
            r1 = 0
        L_0x019d:
            r4 = 2131363503(0x7f0a06af, float:1.8346817E38)
            android.view.View r4 = r13.mo39639f(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            m48884z(r15, r4, r14)
            int r14 = r7.getVisibility()
            if (r14 != 0) goto L_0x01b8
            java.lang.CharSequence r14 = r7.getContentDescription()
            java.lang.String r14 = r14.toString()
            goto L_0x01c8
        L_0x01b8:
            r14 = 2131889672(0x7f120e08, float:1.9414014E38)
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.CharSequence r5 = r6.getText()
            r4[r3] = r5
            java.lang.String r14 = r15.getString(r14, r4)
        L_0x01c8:
            int r4 = r8.getVisibility()
            if (r4 != 0) goto L_0x01ee
            java.lang.CharSequence r4 = r8.getText()
            if (r4 == 0) goto L_0x01ee
            r4 = 3
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r4]
            r4[r3] = r14
            r14 = 2131888728(0x7f120a58, float:1.94121E38)
            java.lang.String r14 = r15.getString(r14)
            r5 = 1
            r4[r5] = r14
            java.lang.CharSequence r14 = r8.getText()
            r5 = 2
            r4[r5] = r14
            java.lang.String r14 = a00.C13382a.m33667c(r4)
        L_0x01ee:
            android.view.View r13 = r13.itemView
            r4 = 6
            java.lang.CharSequence[] r4 = new java.lang.CharSequence[r4]
            r4[r3] = r14
            java.lang.CharSequence r14 = r0.getContentDescription()
            r0 = 1
            r4[r0] = r14
            java.lang.CharSequence r14 = r2.getContentDescription()
            r0 = 2
            r4[r0] = r14
            r14 = 3
            r4[r14] = r1
            r14 = 2131889643(0x7f120deb, float:1.9413955E38)
            java.lang.String r14 = r15.getString(r14)
            r15 = 4
            r4[r15] = r14
            r14 = 5
            r4[r14] = r9
            java.lang.String r14 = a00.C13382a.m33667c(r4)
            r13.setContentDescription(r14)
            goto L_0x02ba
        L_0x021c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "Unknown item view type: "
            java.lang.String r14 = p379.C16759e.m42349e(r14, r15)
            r13.<init>(r14)
            throw r13
        L_0x0228:
            android.content.Context r15 = r13.mo39638e()
            android.view.View r0 = r13.mo39639f(r2)
            com.moovit.view.TransitLineListItemView r0 = (com.moovit.view.TransitLineListItemView) r0
            g20.i<com.moovit.l10n.a$c, com.moovit.transit.TransitLine> r1 = r12.f52637k
            com.moovit.transit.TransitLine r2 = r14.f52640b
            r0.mo24765v(r1, r2)
            com.moovit.view.ScheduleView r1 = r0.getScheduleView()
            com.moovit.transit.Schedule r2 = r14.f52641c
            r1.setSchedule(r2)
            r1 = 1
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.CharSequence r2 = r0.getContentDescription()
            r1[r3] = r2
            a00.C13382a.m33674j(r0, r1)
            com.moovit.transit.TransitStop r0 = r14.f52639a
            com.moovit.transit.TransitLine r1 = r14.f52640b
            com.moovit.network.model.ServerId r1 = r1.f23687c
            com.moovit.transit.TransitStopPlatform r0 = r0.mo24411c(r1)
            if (r0 == 0) goto L_0x025d
            java.lang.String r0 = r0.f23754b
            goto L_0x025e
        L_0x025d:
            r0 = 0
        L_0x025e:
            android.view.View r1 = r13.mo39639f(r4)
            android.widget.TextView r1 = (android.widget.TextView) r1
            com.moovit.commons.utils.UiUtils.m40234B(r1, r0)
            r0 = 2131363503(0x7f0a06af, float:1.8346817E38)
            android.view.View r0 = r13.mo39639f(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            m48884z(r15, r0, r14)
            r15 = 2131364152(0x7f0a0938, float:1.8348133E38)
            android.view.View r13 = r13.mo39639f(r15)
            com.moovit.app.servicealerts.LineServiceAlertDigestView r13 = (com.moovit.app.servicealerts.LineServiceAlertDigestView) r13
            com.moovit.servicealerts.LineServiceAlertDigest r15 = r14.f52645g
            if (r15 == 0) goto L_0x0292
            java.util.Set<com.moovit.servicealerts.ServiceStatusCategory> r0 = com.moovit.servicealerts.ServiceStatusCategory.IMPORTANT_LEVEL
            com.moovit.servicealerts.ServiceStatus r15 = r15.f23186c
            com.moovit.servicealerts.ServiceStatusCategory r15 = r15.f23213b
            boolean r15 = r0.contains(r15)
            if (r15 == 0) goto L_0x0292
            com.moovit.servicealerts.LineServiceAlertDigest r14 = r14.f52645g
            r13.setLineServiceAlertDigest(r14)
            goto L_0x02ba
        L_0x0292:
            r14 = 8
            r13.setVisibility(r14)
            goto L_0x02ba
        L_0x0298:
            android.view.View r13 = r13.mo39639f(r2)
            com.moovit.view.TransitLineListItemView r13 = (com.moovit.view.TransitLineListItemView) r13
            g20.i<com.moovit.l10n.a$c, com.moovit.transit.TransitLine> r15 = r12.f52637k
            com.moovit.transit.TransitLine r0 = r14.f52640b
            r13.mo24765v(r15, r0)
            com.moovit.view.ScheduleView r15 = r13.getScheduleView()
            com.moovit.transit.Schedule r14 = r14.f52641c
            r15.setSchedule(r14)
            r14 = 1
            java.lang.CharSequence[] r14 = new java.lang.CharSequence[r14]
            java.lang.CharSequence r15 = r13.getContentDescription()
            r14[r3] = r15
            a00.C13382a.m33674j(r13, r14)
        L_0x02ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p971zt.C20892b.mo23817t(androidx.recyclerview.widget.RecyclerView$a0, int, int):void");
    }

    /* renamed from: v */
    public final void mo23818v(RecyclerView.C1119a0 a0Var, int i) {
        ((ListItemView) ((C12797f) a0Var).itemView).setTitle(mo51052n(i).getName());
    }

    /* renamed from: w */
    public final RecyclerView.C1119a0 mo23819w(ViewGroup viewGroup, int i) {
        View view;
        int i2 = -32769 & i;
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i2 == 1) {
            view = from.inflate(R.layout.itinerary_schedule_regular_list_item, viewGroup, false);
        } else if (i2 == 2) {
            view = from.inflate(R.layout.itinerary_schedule_detail_list_item, viewGroup, false);
        } else if (i2 == 3) {
            view = from.inflate(R.layout.itinerary_schedule_trips_list_item, viewGroup, false);
        } else {
            throw new IllegalStateException(C16759e.m42349e("Unknown item view type: ", i));
        }
        return new C12797f(view);
    }

    /* renamed from: x */
    public final RecyclerView.C1119a0 mo23820x(ViewGroup viewGroup, int i) {
        ListItemView listItemView = new ListItemView(viewGroup.getContext(), (AttributeSet) null, R.attr.listItemSectionHeaderStyle);
        listItemView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
        return new C12797f(listItemView);
    }
}
