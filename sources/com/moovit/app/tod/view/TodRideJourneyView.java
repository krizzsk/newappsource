package com.moovit.app.tod.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import com.moovit.app.tod.model.TodJourneyStatus;
import com.moovit.app.tod.model.TodRideJourney;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.design.view.list.ListItemView;
import com.moovit.transit.LocationDescriptor;
import com.tranzmate.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import p977zz.C20943i;

public class TodRideJourneyView extends ConstraintLayout {

    /* renamed from: k */
    public static final HashMap f40474k;

    /* renamed from: l */
    public static final List<Integer> f40475l = Arrays.asList(new Integer[]{Integer.valueOf(R.id.origin_icon), Integer.valueOf(R.id.pickup_icon), Integer.valueOf(R.id.drop_off_icon), Integer.valueOf(R.id.destination_icon), Integer.valueOf(R.id.origin), Integer.valueOf(R.id.pickup), Integer.valueOf(R.id.drop_off), Integer.valueOf(R.id.destination)});

    /* renamed from: h */
    public final ArrayList f40476h;

    /* renamed from: i */
    public final View f40477i;

    /* renamed from: j */
    public TodJourneyStatus f40478j;

    /* renamed from: com.moovit.app.tod.view.TodRideJourneyView$a */
    public static class C15572a {

        /* renamed from: a */
        public final int f40479a;

        /* renamed from: b */
        public final boolean f40480b;

        public C15572a(int i, boolean z) {
            this.f40479a = i;
            this.f40480b = z;
        }
    }

    static {
        HashMap hashMap = new HashMap(6);
        f40474k = hashMap;
        hashMap.put(TodJourneyStatus.HEADING_PICKUP, new C15572a(R.id.pickup_icon, true));
        hashMap.put(TodJourneyStatus.ARRIVING_PICKUP, new C15572a(R.id.pickup_icon, true));
        hashMap.put(TodJourneyStatus.ARRIVED_PICKUP, new C15572a(R.id.pickup_icon, false));
        hashMap.put(TodJourneyStatus.HEADING_DROP_OFF, new C15572a(R.id.drop_off_icon, true));
        hashMap.put(TodJourneyStatus.ARRIVING_DROP_OFF, new C15572a(R.id.drop_off_icon, true));
        hashMap.put(TodJourneyStatus.ARRIVED_DROP_OFF, new C15572a(R.id.drop_off_icon, false));
    }

    public TodRideJourneyView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setJourney(TodRideJourney todRideJourney) {
        ((ListItemView) findViewById(R.id.origin)).setSubtitle((CharSequence) todRideJourney.f40284b.mo24313f());
        ((ListItemView) findViewById(R.id.destination)).setSubtitle((CharSequence) todRideJourney.f40287e.mo24313f());
        Group group = (Group) findViewById(R.id.pickup_drop_off_group);
        LocationDescriptor locationDescriptor = todRideJourney.f40285c;
        LocationDescriptor locationDescriptor2 = todRideJourney.f40286d;
        if (locationDescriptor == null || locationDescriptor2 == null) {
            group.setVisibility(8);
            return;
        }
        ((ListItemView) findViewById(R.id.pickup)).setSubtitle((CharSequence) locationDescriptor.mo24313f());
        ((ListItemView) findViewById(R.id.drop_off)).setSubtitle((CharSequence) locationDescriptor2.mo24313f());
        group.setVisibility(0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setJourneyStatus(com.moovit.app.tod.model.TodJourneyStatus r9) {
        /*
            r8 = this;
            com.moovit.app.tod.model.TodJourneyStatus r0 = r8.f40478j
            boolean r0 = p977zz.C20975x0.m49118e(r9, r0)
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            r8.f40478j = r9
            java.util.HashMap r0 = f40474k
            java.lang.Object r0 = r0.get(r9)
            com.moovit.app.tod.view.TodRideJourneyView$a r0 = (com.moovit.app.tod.view.TodRideJourneyView.C15572a) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x00c3
            int r9 = r0.f40479a
            r3 = 4
            if (r9 != 0) goto L_0x0022
            android.view.View r9 = r8.f40477i
            r9.setVisibility(r3)
            goto L_0x007a
        L_0x0022:
            boolean r4 = r0.f40480b
            if (r4 == 0) goto L_0x004e
            java.util.List<java.lang.Integer> r4 = f40475l
            java.lang.Integer r5 = java.lang.Integer.valueOf(r9)
            boolean r6 = c00.C13717b.m34258e(r4)
            r7 = 0
            if (r6 == 0) goto L_0x0034
            goto L_0x0044
        L_0x0034:
            int r5 = r4.indexOf(r5)
            r6 = -1
            if (r5 != r6) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            if (r5 != 0) goto L_0x003f
            goto L_0x0044
        L_0x003f:
            int r5 = r5 + r6
            java.lang.Object r7 = r4.get(r5)
        L_0x0044:
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 != 0) goto L_0x0049
            goto L_0x004e
        L_0x0049:
            int r4 = r7.intValue()
            goto L_0x004f
        L_0x004e:
            r4 = r9
        L_0x004f:
            r5 = 19
            boolean r5 = p977zz.C20943i.m49051d(r5)
            if (r5 == 0) goto L_0x005a
            android.transition.TransitionManager.beginDelayedTransition(r8)
        L_0x005a:
            androidx.constraintlayout.widget.a r5 = new androidx.constraintlayout.widget.a
            r5.<init>()
            r5.mo3238e(r8)
            r6 = 3
            if (r9 != r4) goto L_0x006c
            r5.mo3239f(r6, r4, r6)
            r5.mo3239f(r3, r9, r3)
            goto L_0x0072
        L_0x006c:
            r5.mo3239f(r6, r4, r3)
            r5.mo3239f(r3, r9, r6)
        L_0x0072:
            r5.mo3236b(r8)
            android.view.View r9 = r8.f40477i
            r9.setVisibility(r2)
        L_0x007a:
            int r9 = r0.f40479a
            if (r9 != 0) goto L_0x0084
            java.util.ArrayList r9 = r8.f40476h
            com.moovit.commons.utils.UiUtils.m40262u(r9, r1)
            goto L_0x00c2
        L_0x0084:
            java.util.List<java.lang.Integer> r0 = f40475l
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r9 = r0.indexOf(r9)
            if (r9 != 0) goto L_0x0096
            java.util.ArrayList r9 = r8.f40476h
            com.moovit.commons.utils.UiUtils.m40262u(r9, r1)
            goto L_0x00c2
        L_0x0096:
            java.util.ArrayList r0 = r8.f40476h
            int r0 = r0.size()
            int r0 = r0 / 2
            r3 = 0
        L_0x009f:
            java.util.ArrayList r4 = r8.f40476h
            int r4 = r4.size()
            int r4 = r4 - r1
            if (r3 >= r4) goto L_0x00c2
            java.util.ArrayList r4 = r8.f40476h
            java.lang.Object r4 = r4.get(r3)
            android.view.View r4 = (android.view.View) r4
            if (r3 < r0) goto L_0x00b7
            int r5 = r9 + r0
            if (r3 < r5) goto L_0x00bb
            goto L_0x00b9
        L_0x00b7:
            if (r3 < r9) goto L_0x00bb
        L_0x00b9:
            r5 = 1
            goto L_0x00bc
        L_0x00bb:
            r5 = 0
        L_0x00bc:
            r4.setEnabled(r5)
            int r3 = r3 + 1
            goto L_0x009f
        L_0x00c2:
            return
        L_0x00c3:
            com.moovit.commons.utils.ApplicationBugException r0 = new com.moovit.commons.utils.ApplicationBugException
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r9
            java.lang.String r9 = "Did you forget to add support for %1$s"
            java.lang.String r9 = java.lang.String.format(r9, r1)
            r0.<init>((java.lang.String) r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.tod.view.TodRideJourneyView.setJourneyStatus(com.moovit.app.tod.model.TodJourneyStatus):void");
    }

    public TodRideJourneyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        List<Integer> list = f40475l;
        this.f40476h = new ArrayList(list.size());
        if (C20943i.m49051d(21)) {
            setClipToPadding(false);
            setClipChildren(false);
            C15780a.m40273f(UiUtils.m40248g(getContext(), 2.0f), this);
        }
        LayoutInflater.from(context).inflate(R.layout.tod_ride_journey_layout, this, true);
        for (Integer intValue : list) {
            this.f40476h.add(findViewById(intValue.intValue()));
        }
        this.f40477i = findViewById(R.id.marker_icon);
    }
}
