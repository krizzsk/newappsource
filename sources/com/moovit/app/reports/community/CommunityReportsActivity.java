package com.moovit.app.reports.community;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.C0909a;
import androidx.fragment.app.FragmentManager;
import com.moovit.app.MoovitAppActivity;
import com.moovit.app.reports.service.ReportEntityType;
import com.moovit.network.model.ServerId;
import com.tranzmate.R;
import ga0.C12704f;
import java.util.HashSet;
import java.util.Set;
import p001a0.C0017h;
import p524gv.C17241h;

public abstract class CommunityReportsActivity<T extends Parcelable> extends MoovitAppActivity implements C12704f.C12706b {

    /* renamed from: Y */
    public static final /* synthetic */ int f39177Y = 0;

    /* renamed from: U */
    public ServerId f39178U;

    /* renamed from: X */
    public C12704f f39179X;

    /* renamed from: com.moovit.app.reports.community.CommunityReportsActivity$a */
    public static /* synthetic */ class C15201a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39180a;

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
                com.moovit.metro.ReportCategoryType[] r0 = com.moovit.metro.ReportCategoryType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f39180a = r0
                com.moovit.metro.ReportCategoryType r1 = com.moovit.metro.ReportCategoryType.STOP_STATION_CLOSED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f39180a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.metro.ReportCategoryType r1 = com.moovit.metro.ReportCategoryType.STOP_INCORRECT_LOCATION     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f39180a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.metro.ReportCategoryType r1 = com.moovit.metro.ReportCategoryType.STOP_MISSING_LINE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f39180a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.metro.ReportCategoryType r1 = com.moovit.metro.ReportCategoryType.LINE_LATE_DELAY     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f39180a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.metro.ReportCategoryType r1 = com.moovit.metro.ReportCategoryType.LINE_OUT_OF_SERVICE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f39180a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.metro.ReportCategoryType r1 = com.moovit.metro.ReportCategoryType.LINE_ROUTE_CHANGE     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f39180a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.metro.ReportCategoryType r1 = com.moovit.metro.ReportCategoryType.LINE_MISSING     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moovit.app.reports.community.CommunityReportsActivity.C15201a.<clinit>():void");
        }
    }

    /* renamed from: A2 */
    public abstract void mo45686A2(T t);

    /* renamed from: K */
    public final void mo39497K() {
        setResult(-1);
        finish();
    }

    /* renamed from: e2 */
    public final void mo19425e2(Bundle bundle) {
        super.mo19425e2(bundle);
        setContentView((int) R.layout.community_report_layout);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("entityExtra");
        this.f39178U = (ServerId) getIntent().getParcelableExtra("entityIdExtra");
        this.f39179X = (C12704f) getSupportFragmentManager().mo3923A(C12704f.f31376m);
        if (this.f39178U != null) {
            ReportEntityType z2 = mo45689z2();
            if (getSupportFragmentManager().mo3923A("reportsListTag") == null) {
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                C0909a K = C0017h.m54K(supportFragmentManager, supportFragmentManager);
                C17241h hVar = new C17241h();
                Bundle bundle2 = new Bundle();
                bundle2.putSerializable("reportEntityType", z2);
                hVar.setArguments(bundle2);
                K.mo4041e(R.id.communityReportsContainer, hVar, "reportsListTag", 1);
                K.mo4040d();
            }
            mo45686A2(parcelableExtra);
            return;
        }
        mo45688y2();
    }

    /* renamed from: s1 */
    public final Set<String> mo19438s1() {
        Set<String> s1 = super.mo19438s1();
        ((HashSet) s1).add("GTFS_METRO_ENTITIES_LOADER");
        return s1;
    }

    /* renamed from: y2 */
    public void mo45688y2() {
    }

    /* renamed from: z2 */
    public abstract ReportEntityType mo45689z2();
}
