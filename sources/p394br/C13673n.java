package p394br;

import android.app.ActivityManager;
import android.content.Context;
import c00.C13720d;
import c00.C13722f;
import com.moovit.app.home.tab.HomeTab;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import com.moovit.commons.utils.DataUnit;
import com.moovit.offline.GtfsConfiguration;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p567iq.C17637d;
import p646lz.C18299a;
import p716oy.C18860a;
import p874vr.C20199a;
import p929xy.C20664g;
import p977zz.C20943i;
import q00.C19047a;
import q00.C19053d;

/* renamed from: br.n */
public final class C13673n extends C20664g<C17637d> {

    /* renamed from: c */
    public static final long f33705c;

    /* renamed from: br.n$a */
    public static /* synthetic */ class C13674a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f33706a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.app.home.tab.HomeTab[] r0 = com.moovit.app.home.tab.HomeTab.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33706a = r0
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.DASHBOARD     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.NEARBY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.LINES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.EXPLORE     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.TICKETING_WALLET     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.TRIP_PLANNER     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.TRANSIT_TYPE_STATIONS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x0060 }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.TRANSIT_TYPE_LINES     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f33706a     // Catch:{ NoSuchFieldError -> 0x006c }
                com.moovit.app.home.tab.HomeTab r1 = com.moovit.app.home.tab.HomeTab.WONDO_NEARBY     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p394br.C13673n.C13674a.<clinit>():void");
        }
    }

    static {
        DataUnit dataUnit = DataUnit.GiB;
        f33705c = Math.round(dataUnit.toBytes(1.5d));
        Math.round(dataUnit.toBytes(2.0d));
    }

    /* renamed from: b */
    public final HashSet mo20294b(Context context) {
        HashSet b = super.mo20294b(context);
        b.add("CONFIGURATION");
        b.add("GTFS_CONFIGURATION");
        return b;
    }

    /* renamed from: d */
    public final Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        long j;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        C18299a aVar2 = aVar;
        C19047a aVar3 = (C19047a) aVar2.mo50690c("CONFIGURATION");
        GtfsConfiguration gtfsConfiguration = (GtfsConfiguration) aVar2.mo50690c("GTFS_CONFIGURATION");
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        if (C20943i.m49051d(16)) {
            j = memoryInfo.totalMem;
        } else {
            j = -1;
        }
        C20199a.C20210k kVar = C20199a.f51268c0;
        boolean z5 = false;
        ArrayList c = C13720d.m34273c((List) aVar3.mo51505b(kVar), (C13722f) null, new C13672m(0, aVar3, gtfsConfiguration));
        List list = (List) aVar3.mo51505b(C20199a.f51270d0);
        boolean z6 = !gtfsConfiguration.mo19763c();
        boolean z7 = !gtfsConfiguration.mo19763c();
        boolean z8 = !gtfsConfiguration.mo19763c();
        if (!((Boolean) aVar3.mo51505b(C19053d.f48474m)).booleanValue()) {
            i = 0;
        } else if (gtfsConfiguration.mo19763c()) {
            i = 3;
        } else {
            i = 1;
        }
        if (0 >= j || j > f33705c) {
            z = false;
        } else {
            z = true;
        }
        boolean z9 = !z;
        if (!C18860a.m45884a().f48017e) {
            z2 = false;
        } else {
            List list2 = (List) aVar3.mo51505b(kVar);
            int intValue = ((Integer) aVar3.mo51505b(C20199a.f51304v0)).intValue();
            if (list2.contains(HomeTab.NEARBY) || list2.contains(HomeTab.EXPLORE)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (intValue != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean booleanValue = ((Boolean) aVar3.mo51505b(C19053d.f48486y)).booleanValue();
            if (z3 && (z4 || booleanValue)) {
                z5 = true;
            }
            z2 = z5;
        }
        return new C17637d(c, list, z6, z7, z8, i, z9, z2);
    }
}
