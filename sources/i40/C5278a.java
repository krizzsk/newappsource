package i40;

import android.content.Context;
import android.net.Uri;
import ce0.C21100e;
import com.moovit.navigation.ArrivalState;
import com.moovit.navigation.event.NavigationProgressEvent;
import com.moovit.util.DistanceUtils;
import com.usebutton.sdk.internal.api.AppActionRequest;
import d40.C4351g;
import h40.C5052c;
import p175n.C5768c;
import p583jk.C17884p;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19745w;
import p824tp.C19746x;
import p824tp.C19747y;
import p977zz.C20941h;

/* renamed from: i40.a */
public final class C5278a implements C5052c {

    /* renamed from: b */
    public final C5768c f17428b;

    /* renamed from: c */
    public final NavigationProgressEvent f17429c;

    /* renamed from: i40.a$a */
    public static /* synthetic */ class C5279a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f17430a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.moovit.navigation.ArrivalState[] r0 = com.moovit.navigation.ArrivalState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17430a = r0
                com.moovit.navigation.ArrivalState r1 = com.moovit.navigation.ArrivalState.TRAVELLING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17430a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.navigation.ArrivalState r1 = com.moovit.navigation.ArrivalState.ARRIVING_SOON     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f17430a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.navigation.ArrivalState r1 = com.moovit.navigation.ArrivalState.ARRIVAL_IMMINENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f17430a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.moovit.navigation.ArrivalState r1 = com.moovit.navigation.ArrivalState.DISEMBARK     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f17430a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.moovit.navigation.ArrivalState r1 = com.moovit.navigation.ArrivalState.ARRIVED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i40.C5278a.C5279a.<clinit>():void");
        }
    }

    public C5278a(C4351g gVar, NavigationProgressEvent navigationProgressEvent) {
        C21100e.m49373x(gVar, AppActionRequest.KEY_CONTEXT);
        this.f17428b = new C5768c((Context) gVar, C19747y.MoovitTheme);
        C21100e.m49373x(navigationProgressEvent, "evt");
        this.f17429c = navigationProgressEvent;
    }

    /* renamed from: a */
    public final long[] mo20784a() {
        long[] jArr;
        int i = C5279a.f17430a[this.f17429c.f15115f.ordinal()];
        if (i == 2) {
            jArr = new long[]{0, 200, 50, 200, 50, 200};
        } else if (i == 3) {
            jArr = new long[]{0, 200, 50, 200, 50, 200};
        } else if (i != 4) {
            jArr = null;
        } else {
            jArr = new long[]{0, 200, 50, 200, 50, 200, 500, 200, 50, 200, 50, 200};
        }
        if (jArr == null) {
            return null;
        }
        return jArr;
    }

    /* renamed from: b */
    public final Integer mo20773b() {
        return null;
    }

    /* renamed from: c */
    public final void mo20774c() {
    }

    /* renamed from: d */
    public final Integer mo20775d() {
        return Integer.valueOf(C20941h.m49043f(C19735m.colorLive, this.f17428b));
    }

    /* renamed from: e */
    public final int mo20776e() {
        return 0;
    }

    /* renamed from: f */
    public final CharSequence mo20777f() {
        return null;
    }

    public final int getIcon() {
        return C19739q.img_notification_center_bell;
    }

    public final CharSequence getTitle() {
        int i = C5279a.f17430a[this.f17429c.f15115f.ordinal()];
        if (i == 2) {
            return this.f17428b.getText(C19746x.live_notification_destination_near_title).toString();
        }
        if (i == 3) {
            return this.f17428b.getText(C19746x.live_notification_destination_imminent_title).toString();
        }
        if (i == 4 || i == 5) {
            return this.f17428b.getText(C19746x.live_notification_destination_arrived_title).toString();
        }
        return null;
    }

    /* renamed from: i */
    public final CharSequence mo20780i() {
        NavigationProgressEvent navigationProgressEvent = this.f17429c;
        ArrivalState arrivalState = navigationProgressEvent.f15115f;
        int i = navigationProgressEvent.f15119j;
        int i2 = navigationProgressEvent.f15118i;
        int i3 = C5279a.f17430a[arrivalState.ordinal()];
        if (i3 == 2 || i3 == 3) {
            float c = DistanceUtils.m17936c(this.f17428b, (float) i2);
            String a = DistanceUtils.m17934a(Math.round(c), this.f17428b);
            if (i > 1) {
                return this.f17428b.getString(C19746x.live_notification_destination_near_subtitle, new Object[]{Integer.valueOf(i), a});
            }
            return this.f17428b.getString(C19746x.live_notification_destination_imminent_subtitle, new Object[]{a});
        } else if (i3 == 4 || i3 == 5) {
            return this.f17428b.getString(C19746x.live_notification_destination_arrived_subtitle);
        } else {
            return null;
        }
    }

    /* renamed from: k */
    public final Uri mo20785k() {
        int i;
        int i2 = C5279a.f17430a[this.f17429c.f15115f.ordinal()];
        if (i2 == 2) {
            i = C19745w.notification_gettingclose;
        } else if (i2 == 3) {
            i = C19745w.notification_gettingclose;
        } else if (i2 != 4) {
            i = 0;
        } else {
            i = C19745w.notification_getoff;
        }
        if (i == 0) {
            return null;
        }
        return C17884p.m44351V(this.f17428b.getResources(), i);
    }
}
