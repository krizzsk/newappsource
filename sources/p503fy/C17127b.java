package p503fy;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import ce0.C21100e;
import com.moovit.gcm.notification.GcmNotification;
import com.usebutton.sdk.internal.api.AppActionRequest;
import f00.C16919g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p250s9.C6489b;
import p389bl.C13641g;
import p810sz.C19576b;

/* renamed from: fy.b */
public final class C17127b {

    /* renamed from: e */
    public static final C16919g.C16920a f44341e = new C16919g.C16920a("pendingNotificationAlertOn", false);

    /* renamed from: f */
    public static final C16919g.C16929j f44342f = new C16919g.C16929j("seenNotificationIds", Collections.emptySet());

    /* renamed from: g */
    public static final C6489b f44343g = new C6489b(2);

    /* renamed from: h */
    public static volatile C17127b f44344h;

    /* renamed from: a */
    public final Context f44345a;

    /* renamed from: b */
    public final SharedPreferences f44346b;

    /* renamed from: c */
    public List<GcmNotification> f44347c = new ArrayList();

    /* renamed from: d */
    public HashSet f44348d = new HashSet();

    /* renamed from: fy.b$a */
    public static class C17128a extends AsyncTask<Void, Void, Boolean> {

        /* renamed from: a */
        public final Context f44349a;

        /* renamed from: b */
        public final List<GcmNotification> f44350b;

        public C17128a(Context context, List<GcmNotification> list) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f44349a = context.getApplicationContext();
            this.f44350b = list;
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            List<GcmNotification> list = this.f44350b;
            if (list == null) {
                return Boolean.valueOf(this.f44349a.deleteFile("user_notifications.dat"));
            }
            return Boolean.valueOf(C13641g.m34136y(this.f44349a, "user_notifications.dat", list, C19576b.m46958a(GcmNotification.f41517k)));
        }

        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
        }
    }

    public C17127b(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f44345a = context.getApplicationContext();
        this.f44346b = context.getSharedPreferences("UserNotificationsPrefs", 0);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index 0 out of bounds for length 0
        	at java.base/jdk.internal.util.Preconditions.outOfBounds(Preconditions.java:64)
        	at java.base/jdk.internal.util.Preconditions.outOfBoundsCheckIndex(Preconditions.java:70)
        	at java.base/jdk.internal.util.Preconditions.checkIndex(Preconditions.java:248)
        	at java.base/java.util.Objects.checkIndex(Objects.java:372)
        	at java.base/java.util.ArrayList.get(ArrayList.java:458)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* renamed from: b */
    public static synchronized p503fy.C17127b m43096b(android.content.Context r2) {
        /*
            java.lang.Class<fy.b> r0 = p503fy.C17127b.class
            monitor-enter(r0)
            fy.b r1 = f44344h     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            fy.b r1 = f44344h     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            fy.b r1 = new fy.b     // Catch:{ all -> 0x0015 }
            r1.<init>(r2)     // Catch:{ all -> 0x0015 }
            f44344h = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2     // Catch:{ all -> 0x001c }
        L_0x0018:
            fy.b r2 = f44344h     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r2
        L_0x001c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p503fy.C17127b.m43096b(android.content.Context):fy.b");
    }

    /* renamed from: a */
    public final synchronized void mo49717a(GcmNotification gcmNotification) {
        C16919g.C16929j jVar = f44342f;
        HashSet hashSet = new HashSet((Collection) jVar.mo19759a(this.f44346b));
        if (hashSet.add(gcmNotification.f41524g.f41546b)) {
            jVar.mo49545d(this.f44346b, hashSet);
        }
    }

    /* renamed from: c */
    public final synchronized int mo49718c() {
        return this.f44348d.size() - mo49719d().size();
    }

    /* renamed from: d */
    public final synchronized Set<String> mo49719d() {
        return Collections.unmodifiableSet((Set) f44342f.mo19759a(this.f44346b));
    }

    /* renamed from: e */
    public final synchronized boolean mo49720e() {
        return f44341e.mo19759a(this.f44346b).booleanValue();
    }

    /* renamed from: f */
    public final synchronized void mo49721f(boolean z) {
        f44341e.mo49545d(this.f44346b, Boolean.valueOf(z));
    }
}
