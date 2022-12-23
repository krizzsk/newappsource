package p527gy;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import ce0.C21100e;
import com.usebutton.sdk.internal.api.AppActionRequest;
import p389bl.C13641g;

/* renamed from: gy.g */
public final class C17264g {

    /* renamed from: c */
    public static C17264g f44627c;

    /* renamed from: a */
    public final Context f44628a;

    /* renamed from: b */
    public C17259d f44629b = new C17259d();

    /* renamed from: gy.g$a */
    public static class C17265a extends AsyncTask<Void, Void, Boolean> {
        @SuppressLint({"StaticFieldLeak"})

        /* renamed from: a */
        public final Context f44630a;

        /* renamed from: b */
        public final C17259d f44631b;

        public C17265a(Context context, C17259d dVar) {
            C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
            this.f44630a = context.getApplicationContext();
            this.f44631b = dVar;
        }

        public final Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            C17259d dVar = this.f44631b;
            if (dVar == null) {
                return Boolean.valueOf(this.f44630a.deleteFile("user_profile.dat"));
            }
            return Boolean.valueOf(C13641g.m34136y(this.f44630a, "user_profile.dat", dVar, C17259d.f44601q));
        }

        public final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
            Boolean bool = (Boolean) obj;
        }
    }

    public C17264g(Context context) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f44628a = context.getApplicationContext();
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
    /* renamed from: a */
    public static synchronized p527gy.C17264g m43277a(android.content.Context r2) {
        /*
            java.lang.Class<gy.g> r0 = p527gy.C17264g.class
            monitor-enter(r0)
            gy.g r1 = f44627c     // Catch:{ all -> 0x001c }
            if (r1 != 0) goto L_0x0018
            monitor-enter(r0)     // Catch:{ all -> 0x001c }
            gy.g r1 = f44627c     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0013
            gy.g r1 = new gy.g     // Catch:{ all -> 0x0015 }
            r1.<init>(r2)     // Catch:{ all -> 0x0015 }
            f44627c = r1     // Catch:{ all -> 0x0015 }
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            goto L_0x0018
        L_0x0015:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0015 }
            throw r2     // Catch:{ all -> 0x001c }
        L_0x0018:
            gy.g r2 = f44627c     // Catch:{ all -> 0x001c }
            monitor-exit(r0)
            return r2
        L_0x001c:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p527gy.C17264g.m43277a(android.content.Context):gy.g");
    }

    /* renamed from: b */
    public final synchronized void mo49807b(C17258c cVar) {
        C21100e.m49373x(cVar, "userProfile");
        this.f44629b = (C17259d) cVar;
        new C17265a(this.f44628a, this.f44629b).execute(new Void[0]);
    }
}
