package com.moovit.offline;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.MoovitActivity;
import com.moovit.MoovitApplication;
import j00.C17691i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import p067e1.C4503l0;
import p241s0.C6302b;
import p824tp.C19731i;
import p824tp.C19740r;
import p824tp.C19742t;
import p977zz.C20975x0;

public final class GtfsInitializeActivity extends MoovitActivity {

    /* renamed from: U */
    public final Set<String> f15150U;

    /* renamed from: X */
    public final ArrayList f15151X;

    /* renamed from: Y */
    public ProgressBar f15152Y;

    /* renamed from: Z */
    public ObjectAnimator f15153Z;

    /* renamed from: l0 */
    public TextView f15154l0;

    /* renamed from: com.moovit.offline.GtfsInitializeActivity$a */
    public static class C4260a implements Comparator<String> {

        /* renamed from: b */
        public final C6302b f15155b;

        public C4260a() {
            boolean z;
            ArrayList arrayList = MoovitApplication.f37317k.f37321e.f46675n;
            if (arrayList != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int size = arrayList.size();
                this.f15155b = new C6302b(arrayList.size());
                for (int i = 0; i < size; i++) {
                    this.f15155b.put((String) arrayList.get(i), Integer.valueOf(i));
                }
                return;
            }
            throw new IllegalStateException("The app data manger seal() has never been called");
        }

        public final int compare(Object obj, Object obj2) {
            return C20975x0.m49114a(((Integer) this.f15155b.getOrDefault((String) obj, null)).intValue(), ((Integer) this.f15155b.getOrDefault((String) obj2, null)).intValue());
        }
    }

    public GtfsInitializeActivity() {
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"GTFS_CONFIGURATION", "GTFS_STATIC_DATA_DOWNLOADER", "GTFS_DYNAMIC_DATA_DOWNLOADER", "GTFS_REMOTE_IMAGES_PARSER_LOADER", "GTFS_LINE_GROUPS_PARSER_LOADER", "GTFS_STOPS_PARSER_LOADER", "GTFS_PATTERNS_PARSER_LOADER", "GTFS_BICYCLE_STOPS_PARSER_LOADER", "GTFS_SHAPES_PARSER_LOADER", "GTFS_SHAPE_SEGMENTS_PARSER_LOADER", "GTFS_FREQUENCIES_PARSER_LOADER", "SEARCH_LINE_FTS", "SEARCH_STOP_FTS"})));
        this.f15150U = unmodifiableSet;
        this.f15151X = new ArrayList(unmodifiableSet.size());
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e8, code lost:
        if (r5.equals("GTFS_FREQUENCIES_PARSER_LOADER") == false) goto L_0x00f6;
     */
    /* renamed from: N1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19768N1(java.lang.Object r5, java.lang.String r6) {
        /*
            r4 = this;
            java.util.Set<java.lang.String> r0 = r4.f15150U
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0104
            java.util.ArrayList r5 = r4.f15151X
            r5.remove(r6)
            android.widget.TextView r5 = r4.f15154l0
            if (r5 == 0) goto L_0x0103
            android.widget.ProgressBar r5 = r4.f15152Y
            if (r5 != 0) goto L_0x0017
            goto L_0x0103
        L_0x0017:
            java.util.Set<java.lang.String> r5 = r4.f15150U
            int r5 = r5.size()
            java.util.ArrayList r6 = r4.f15151X
            int r6 = r6.size()
            int r5 = r5 - r6
            int r5 = r5 * 1000
            r6 = 24
            boolean r6 = p977zz.C20943i.m49051d(r6)
            r0 = 1
            r1 = 0
            if (r6 != 0) goto L_0x0044
            android.animation.ObjectAnimator r6 = r4.f15153Z
            r6.cancel()
            android.animation.ObjectAnimator r6 = r4.f15153Z
            int[] r2 = new int[r0]
            r2[r1] = r5
            r6.setIntValues(r2)
            android.animation.ObjectAnimator r5 = r4.f15153Z
            r5.start()
            goto L_0x0049
        L_0x0044:
            android.widget.ProgressBar r6 = r4.f15152Y
            r6.setProgress(r5, true)
        L_0x0049:
            java.util.ArrayList r5 = r4.f15151X
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0103
            java.util.ArrayList r5 = r4.f15151X
            java.lang.Object r5 = r5.get(r1)
            java.lang.String r5 = (java.lang.String) r5
            android.widget.TextView r6 = r4.f15154l0
            r5.getClass()
            int r2 = r5.hashCode()
            r3 = 4
            switch(r2) {
                case -2094728117: goto L_0x00eb;
                case -1987113463: goto L_0x00e2;
                case -1676868603: goto L_0x00d7;
                case -898102319: goto L_0x00cc;
                case -495809732: goto L_0x00c1;
                case -190064448: goto L_0x00b6;
                case 329860734: goto L_0x00ab;
                case 357474656: goto L_0x00a0;
                case 814809905: goto L_0x0092;
                case 1209323246: goto L_0x0084;
                case 1340974143: goto L_0x0076;
                case 1505916864: goto L_0x0068;
                default: goto L_0x0066;
            }
        L_0x0066:
            goto L_0x00f6
        L_0x0068:
            java.lang.String r0 = "GTFS_STOPS_PARSER_LOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0072
            goto L_0x00f6
        L_0x0072:
            r0 = 11
            goto L_0x00f7
        L_0x0076:
            java.lang.String r0 = "SEARCH_STOP_FTS"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x0080
            goto L_0x00f6
        L_0x0080:
            r0 = 10
            goto L_0x00f7
        L_0x0084:
            java.lang.String r0 = "GTFS_LINE_GROUPS_PARSER_LOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x008e
            goto L_0x00f6
        L_0x008e:
            r0 = 9
            goto L_0x00f7
        L_0x0092:
            java.lang.String r0 = "SEARCH_LINE_FTS"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x009c
            goto L_0x00f6
        L_0x009c:
            r0 = 8
            goto L_0x00f7
        L_0x00a0:
            java.lang.String r0 = "GTFS_BICYCLE_STOPS_PARSER_LOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00a9
            goto L_0x00f6
        L_0x00a9:
            r0 = 7
            goto L_0x00f7
        L_0x00ab:
            java.lang.String r0 = "GTFS_STATIC_DATA_DOWNLOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00b4
            goto L_0x00f6
        L_0x00b4:
            r0 = 6
            goto L_0x00f7
        L_0x00b6:
            java.lang.String r0 = "GTFS_REMOTE_IMAGES_PARSER_LOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00bf
            goto L_0x00f6
        L_0x00bf:
            r0 = 5
            goto L_0x00f7
        L_0x00c1:
            java.lang.String r0 = "GTFS_PATTERNS_PARSER_LOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00ca
            goto L_0x00f6
        L_0x00ca:
            r0 = 4
            goto L_0x00f7
        L_0x00cc:
            java.lang.String r0 = "GTFS_CONFIGURATION"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00d5
            goto L_0x00f6
        L_0x00d5:
            r0 = 3
            goto L_0x00f7
        L_0x00d7:
            java.lang.String r0 = "GTFS_DYNAMIC_DATA_DOWNLOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00e0
            goto L_0x00f6
        L_0x00e0:
            r0 = 2
            goto L_0x00f7
        L_0x00e2:
            java.lang.String r2 = "GTFS_FREQUENCIES_PARSER_LOADER"
            boolean r5 = r5.equals(r2)
            if (r5 != 0) goto L_0x00f7
            goto L_0x00f6
        L_0x00eb:
            java.lang.String r0 = "GTFS_SHAPES_PARSER_LOADER"
            boolean r5 = r5.equals(r0)
            if (r5 != 0) goto L_0x00f4
            goto L_0x00f6
        L_0x00f4:
            r0 = 0
            goto L_0x00f7
        L_0x00f6:
            r0 = -1
        L_0x00f7:
            switch(r0) {
                case 0: goto L_0x00fe;
                case 1: goto L_0x00fe;
                case 2: goto L_0x00fb;
                case 3: goto L_0x00fb;
                case 4: goto L_0x00fe;
                case 5: goto L_0x00fe;
                case 6: goto L_0x00fb;
                case 7: goto L_0x00fe;
                case 8: goto L_0x00fe;
                case 9: goto L_0x00fe;
                case 10: goto L_0x00fe;
                case 11: goto L_0x00fe;
                default: goto L_0x00fa;
            }
        L_0x00fa:
            goto L_0x0100
        L_0x00fb:
            int r1 = p824tp.C19746x.gtfs_initialize_step_1
            goto L_0x0100
        L_0x00fe:
            int r1 = p824tp.C19746x.gtfs_initialize_step_2
        L_0x0100:
            com.moovit.commons.utils.UiUtils.m40235C(r6, r1, r3)
        L_0x0103:
            return
        L_0x0104:
            super.mo19768N1(r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.offline.GtfsInitializeActivity.mo19768N1(java.lang.Object, java.lang.String):void");
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        C4503l0 l0Var = new C4503l0(this);
        l0Var.mo20022b(Intent.makeMainActivity(C19731i.m47197a(this).f50171a.f50151b));
        l0Var.mo20024e();
    }

    /* renamed from: r2 */
    public final void mo19769r2() {
        setContentView(C19742t.gtfs_initialize_activity);
        ProgressBar progressBar = (ProgressBar) findViewById(C19740r.progress_bar);
        this.f15152Y = progressBar;
        progressBar.setMax(this.f15150U.size() * 1000);
        this.f15152Y.setProgress(0);
        this.f15153Z = ObjectAnimator.ofInt(this.f15152Y, C17691i.f45445c, new int[]{0});
        this.f15154l0 = (TextView) findViewById(C19740r.message);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(findViewById(C19740r.large), View.ROTATION, new float[]{BitmapDescriptorFactory.HUE_RED, 360.0f});
        ofFloat.setDuration(3500);
        ofFloat.setRepeatCount(-1);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(findViewById(C19740r.medium), View.ROTATION, new float[]{360.0f, BitmapDescriptorFactory.HUE_RED});
        ofFloat2.setDuration(3000);
        ofFloat2.setRepeatCount(-1);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(findViewById(C19740r.small), View.ROTATION, new float[]{BitmapDescriptorFactory.HUE_RED, 360.0f});
        ofFloat3.setDuration(2500);
        ofFloat3.setRepeatCount(-1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.start();
        for (String next : this.f15150U) {
            if (this.f37297F.mo44595c(next)) {
                mo19768N1(mo44537r1(next), next);
            }
        }
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        this.f15151X.clear();
        this.f15151X.addAll(super.mo19438s1());
        this.f15151X.addAll(this.f15150U);
        Collections.sort(this.f15151X, new C4260a());
        return this.f15150U;
    }
}
