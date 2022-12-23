package com.moovit.app.itinerary.suggestion;

import android.content.Context;
import android.text.SpannableString;
import android.util.AttributeSet;
import com.moovit.itinerary.model.leg.Leg;
import com.moovit.itinerary.model.leg.WaitToTransitLineLeg;
import com.moovit.l10n.C16181a;
import com.moovit.l10n.LinePresentationType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.Schedule;
import com.moovit.transit.TransitLine;
import com.moovit.util.time.Time;
import com.tranzmate.R;
import da0.C12610a;
import e20.C16769e;
import e20.C16783l;
import g20.C17161i;
import p716oy.C18860a;
import p824tp.C19728f;
import p952yy.C20787c;
import p977zz.C20964s0;

abstract class TripPlanTransitLineSuggestionView<L extends Leg> extends TripPlanSuggestionView<L> {

    /* renamed from: y */
    public final C15070b f38640y;

    /* renamed from: z */
    public C17161i<C16181a.C16184c, TransitLine> f38641z;

    /* renamed from: com.moovit.app.itinerary.suggestion.TripPlanTransitLineSuggestionView$a */
    public static /* synthetic */ class C15069a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f38642a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.util.time.CongestionLevel[] r0 = com.moovit.util.time.CongestionLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f38642a = r0
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.EMPTY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f38642a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.FEW     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f38642a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.LOW     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f38642a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.MED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f38642a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.HIGH     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f38642a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.FULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f38642a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.util.time.CongestionLevel r1 = com.moovit.util.time.CongestionLevel.PACKED     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.suggestion.TripPlanTransitLineSuggestionView.C15069a.<clinit>():void");
        }
    }

    /* renamed from: com.moovit.app.itinerary.suggestion.TripPlanTransitLineSuggestionView$b */
    public static class C15070b {

        /* renamed from: a */
        public final C12610a f38643a;

        /* renamed from: b */
        public final SpannableString f38644b;

        /* renamed from: c */
        public final SpannableString f38645c;

        /* renamed from: d */
        public final SpannableString f38646d;

        public C15070b(Context context) {
            this.f38643a = new C12610a(context);
            this.f38644b = C20964s0.m49085c(context, R.drawable.ic_crowd_trip_seats_available_12_on_surface_emphasis_medium);
            this.f38645c = C20964s0.m49085c(context, R.drawable.ic_crowd_trip_standing_only_12_on_surface_emphasis_high);
            this.f38646d = C20964s0.m49085c(context, R.drawable.ic_crowd_trip_crowded_12_critical);
        }
    }

    public TripPlanTransitLineSuggestionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private C17161i<C16181a.C16184c, TransitLine> getTemplate() {
        if (this.f38641z == null) {
            this.f38641z = C19728f.m47195a(getContext()).mo52082b(LinePresentationType.ITINERARY);
        }
        return this.f38641z;
    }

    /* renamed from: x */
    public static Schedule m38172x(WaitToTransitLineLeg waitToTransitLineLeg, C16769e.C16772c cVar) {
        Time time;
        ServerId serverId = waitToTransitLineLeg.f42135f.getServerId();
        ServerId serverId2 = waitToTransitLineLeg.f42136g.getServerId();
        ServerId serverId3 = waitToTransitLineLeg.f42137h.getServerId();
        if (C18860a.m45884a().f48029q) {
            time = C16783l.m42482n(waitToTransitLineLeg.f42132c);
        } else {
            time = null;
        }
        C20787c b = cVar.mo49467b(serverId, serverId2, serverId3, time);
        if (b != null) {
            return b.f52458c;
        }
        return Schedule.f23657c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.CharSequence[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v20, resolved type: com.moovit.util.time.CongestionLevel} */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.lang.Enum] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r13v2 */
    /* JADX WARNING: type inference failed for: r13v3 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=int, code=?, for r13v1, types: [int, boolean] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45330v(com.moovit.design.view.list.ListItemView r26, android.widget.TextView r27, android.widget.TextView r28, com.moovit.itinerary.model.Itinerary r29, L r30, e20.C16769e.C16772c r31) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r31
            android.content.Context r12 = r25.getContext()
            r4 = r30
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg r13 = r0.mo45331w(r4, r3)
            if (r3 != 0) goto L_0x001d
            com.moovit.itinerary.model.leg.WaitToTransitLineLeg$DeparturesInfo r3 = r13.f42138i
            com.moovit.transit.Schedule r3 = r3.f42142b
            com.moovit.util.time.Time r3 = r3.mo24326m()
            goto L_0x0025
        L_0x001d:
            com.moovit.transit.Schedule r3 = m38172x(r13, r3)
            com.moovit.util.time.Time r3 = r3.mo24326m()
        L_0x0025:
            r14 = r3
            r15 = 0
            if (r14 != 0) goto L_0x002a
            return r15
        L_0x002a:
            com.moovit.app.itinerary.suggestion.TripPlanTransitLineSuggestionView$b r11 = r0.f38640y
            boolean r3 = r14.mo24633j()
            r9 = 33
            r10 = 1
            r7 = 0
            if (r3 == 0) goto L_0x00bb
            long r5 = java.lang.System.currentTimeMillis()
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>()
            r3 = 2131231517(0x7f08031d, float:1.8079117E38)
            android.text.SpannableString r3 = p977zz.C20964s0.m49085c(r12, r3)
            r8.append(r3)
            long r3 = r14.mo24631g()
            com.moovit.util.time.MinutesSpanFormatter r16 = com.moovit.util.time.C7925b.f23937d
            long r17 = r14.mo24631g()
            r19 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            java.util.Set r21 = java.util.Collections.emptySet()
            r22 = r3
            r3 = r16
            r4 = r12
            r30 = r5
            r15 = r8
            r7 = r17
            r17 = r13
            r1 = 33
            r13 = 1
            r9 = r19
            r24 = r11
            r11 = r21
            android.text.SpannableStringBuilder r3 = r3.mo24606f(r4, r5, r7, r9, r11)
            r15.append(r3)
            r3 = 2130970309(0x7f0406c5, float:1.7549324E38)
            r4 = 2130968994(0x7f0401a2, float:1.7546657E38)
            android.text.style.TextAppearanceSpan r3 = p977zz.C20964s0.m49084b(r12, r3, r4)
            int r4 = r15.length()
            r15.setSpan(r3, r13, r4, r1)
            r3 = r30
            r5 = r22
            long r3 = com.moovit.util.time.C7925b.m18026n(r3, r5)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x00a8
            r3 = 2131888935(0x7f120b27, float:1.941252E38)
            java.lang.CharSequence r3 = r12.getText(r3)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r5 = 0
            r4[r5] = r15
            android.text.SpannedString r3 = p977zz.C20958p0.m49077a(r3, r4)
            goto L_0x00b8
        L_0x00a8:
            r5 = 0
            r3 = 2131888941(0x7f120b2d, float:1.9412532E38)
            java.lang.CharSequence r3 = r12.getText(r3)
            java.lang.Object[] r4 = new java.lang.Object[r13]
            r4[r5] = r15
            android.text.SpannedString r3 = p977zz.C20958p0.m49077a(r3, r4)
        L_0x00b8:
            r4 = r3
            r3 = 0
            goto L_0x00db
        L_0x00bb:
            r24 = r11
            r17 = r13
            r1 = 33
            r5 = 0
            r13 = 1
            long r3 = r14.f23901b
            java.lang.String r3 = com.moovit.util.time.C7925b.m18024l(r12, r3)
            r4 = 2131888931(0x7f120b23, float:1.9412511E38)
            java.lang.String r4 = r12.getString(r4)
            java.lang.Object[] r6 = new java.lang.Object[r13]
            r6[r5] = r3
            java.lang.String r3 = p977zz.C20964s0.f52718a
            r3 = 0
            java.lang.String r4 = java.lang.String.format(r3, r4, r6)
        L_0x00db:
            r5 = 2
            com.moovit.util.time.TimeVehicleAttributes r6 = r14.f23913n
            if (r6 != 0) goto L_0x00e1
            goto L_0x013f
        L_0x00e1:
            com.moovit.util.time.CongestionLevel r7 = r6.f23919c
            r8 = r24
            da0.a r9 = r8.f38643a
            java.lang.CharSequence r6 = r9.mo39410b(r6)
            if (r6 != 0) goto L_0x00f0
            if (r7 != 0) goto L_0x00f0
            goto L_0x013f
        L_0x00f0:
            android.text.SpannableStringBuilder r9 = new android.text.SpannableStringBuilder
            r9.<init>(r4)
            java.lang.String r10 = " • "
            r9.append(r10)
            r10 = 2130970308(0x7f0406c4, float:1.7549322E38)
            r11 = 2130969030(0x7f0401c6, float:1.754673E38)
            android.text.style.TextAppearanceSpan r10 = p977zz.C20964s0.m49084b(r12, r10, r11)
            int r4 = r4.length()
            int r11 = r9.length()
            r9.setSpan(r10, r4, r11, r1)
            if (r6 == 0) goto L_0x0114
            r9.append(r6)
        L_0x0114:
            if (r7 == 0) goto L_0x013e
            int r1 = r9.length()
            if (r1 <= 0) goto L_0x0121
            java.lang.String r1 = " "
            r9.append(r1)
        L_0x0121:
            int[] r1 = com.moovit.app.itinerary.suggestion.TripPlanTransitLineSuggestionView.C15069a.f38642a
            int r4 = r7.ordinal()
            r1 = r1[r4]
            switch(r1) {
                case 1: goto L_0x0139;
                case 2: goto L_0x0139;
                case 3: goto L_0x0139;
                case 4: goto L_0x0133;
                case 5: goto L_0x0133;
                case 6: goto L_0x012d;
                case 7: goto L_0x012d;
                default: goto L_0x012c;
            }
        L_0x012c:
            goto L_0x013e
        L_0x012d:
            android.text.SpannableString r1 = r8.f38646d
            r9.append(r1)
            goto L_0x013e
        L_0x0133:
            android.text.SpannableString r1 = r8.f38645c
            r9.append(r1)
            goto L_0x013e
        L_0x0139:
            android.text.SpannableString r1 = r8.f38644b
            r9.append(r1)
        L_0x013e:
            r4 = r9
        L_0x013f:
            r2.setText(r4)
            com.moovit.util.time.TimeVehicleAttributes r1 = r14.f23913n
            com.moovit.app.itinerary.suggestion.TripPlanTransitLineSuggestionView$b r6 = r0.f38640y
            da0.a r6 = r6.f38643a
            java.lang.CharSequence r6 = r6.mo39409a(r1)
            if (r1 == 0) goto L_0x0151
            com.moovit.util.time.CongestionLevel r7 = r1.f23919c
            goto L_0x0152
        L_0x0151:
            r7 = r3
        L_0x0152:
            if (r1 == 0) goto L_0x0157
            com.moovit.util.time.CongestionSource r1 = r1.f23920d
            goto L_0x0158
        L_0x0157:
            r1 = r3
        L_0x0158:
            x00.a r8 = aa0.C7554s.f23036a
            if (r7 != 0) goto L_0x015f
            r7 = r3
            r9 = 0
            goto L_0x01a4
        L_0x015f:
            int[] r8 = aa0.C7554s.C7555a.f23038a
            int r7 = r7.ordinal()
            r7 = r8[r7]
            switch(r7) {
                case 1: goto L_0x0188;
                case 2: goto L_0x0188;
                case 3: goto L_0x0188;
                case 4: goto L_0x017a;
                case 5: goto L_0x017a;
                case 6: goto L_0x016c;
                case 7: goto L_0x016c;
                default: goto L_0x016a;
            }
        L_0x016a:
            r1 = 0
            goto L_0x0195
        L_0x016c:
            com.moovit.util.time.CongestionSource r7 = com.moovit.util.time.CongestionSource.PREDICTION
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0177
            int r1 = p824tp.C19746x.crowdedness_line_usually_crowded
            goto L_0x0195
        L_0x0177:
            int r1 = p824tp.C19746x.crowdedness_line_crowded
            goto L_0x0195
        L_0x017a:
            com.moovit.util.time.CongestionSource r7 = com.moovit.util.time.CongestionSource.PREDICTION
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0185
            int r1 = p824tp.C19746x.crowdedness_line_usually_standing_only
            goto L_0x0195
        L_0x0185:
            int r1 = p824tp.C19746x.crowdedness_line_standing_only
            goto L_0x0195
        L_0x0188:
            com.moovit.util.time.CongestionSource r7 = com.moovit.util.time.CongestionSource.PREDICTION
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x0193
            int r1 = p824tp.C19746x.crowdedness_line_usually_available_seats
            goto L_0x0195
        L_0x0193:
            int r1 = p824tp.C19746x.crowdedness_line_available_seats
        L_0x0195:
            int r7 = p824tp.C19746x.voiceover_line_crowdedness
            java.lang.Object[] r8 = new java.lang.Object[r13]
            java.lang.String r1 = r12.getString(r1)
            r9 = 0
            r8[r9] = r1
            java.lang.String r7 = r12.getString(r7, r8)
        L_0x01a4:
            r1 = 3
            java.lang.CharSequence[] r8 = new java.lang.CharSequence[r1]
            r8[r9] = r4
            r8[r13] = r6
            r8[r5] = r7
            a00.C13382a.m33674j(r2, r8)
            r4 = r29
            java.lang.String r4 = e20.C16783l.m42486r(r12, r4)
            r6 = 2131888932(0x7f120b24, float:1.9412513E38)
            java.lang.String r6 = r12.getString(r6)
            java.lang.Object[] r7 = new java.lang.Object[r13]
            r7[r9] = r4
            java.lang.String r3 = java.lang.String.format(r3, r6, r7)
            r4 = r28
            r4.setText(r3)
            r3 = r17
            com.moovit.database.DbEntityRef<com.moovit.transit.TransitLine> r3 = r3.f42135f
            j40.a r3 = r3.get()
            com.moovit.transit.TransitLine r3 = (com.moovit.transit.TransitLine) r3
            com.moovit.l10n.a$b r6 = new com.moovit.l10n.a$b
            r6.<init>()
            g20.i r7 = r25.getTemplate()
            android.content.Context r8 = r25.getContext()
            r7.mo48496a(r8, r6, r3)
            com.moovit.image.model.Image r7 = r6.f42180b
            r8 = r26
            r8.setIcon((com.moovit.image.model.Image) r7)
            java.lang.CharSequence r7 = r6.f42181c
            r8.setTitle((java.lang.CharSequence) r7)
            java.lang.CharSequence r6 = r6.f42183e
            r8.setContentDescription(r6)
            android.widget.TextView r6 = r26.getTitleView()
            com.moovit.transit.TransitLineGroup r3 = r3.mo24369b()
            com.moovit.commons.utils.Color r3 = com.moovit.transit.C7843b.m17874a(r12, r3)
            int r3 = r3.f41007b
            r6.setTextColor(r3)
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.CharSequence r3 = r26.getContentDescription()
            r6 = 0
            r1[r6] = r3
            java.lang.CharSequence r2 = r27.getContentDescription()
            r1[r13] = r2
            java.lang.CharSequence r2 = r28.getText()
            r1[r5] = r2
            a00.C13382a.m33674j(r0, r1)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.itinerary.suggestion.TripPlanTransitLineSuggestionView.mo45330v(com.moovit.design.view.list.ListItemView, android.widget.TextView, android.widget.TextView, com.moovit.itinerary.model.Itinerary, com.moovit.itinerary.model.leg.Leg, e20.e$c):boolean");
    }

    /* renamed from: w */
    public abstract WaitToTransitLineLeg mo45331w(L l, C16769e.C16772c cVar);

    public TripPlanTransitLineSuggestionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38640y = new C15070b(context);
    }
}
