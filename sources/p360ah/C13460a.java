package p360ah;

import android.hardware.Camera;
import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: ah.a */
public final class C13460a implements Camera.AutoFocusCallback {

    /* renamed from: g */
    public static final ArrayList f33309g;

    /* renamed from: a */
    public long f33310a = InstallSheetPresenter.LOADING_TIMER_DELAY_IN_MILLIS;

    /* renamed from: b */
    public boolean f33311b;

    /* renamed from: c */
    public boolean f33312c;

    /* renamed from: d */
    public final boolean f33313d;

    /* renamed from: e */
    public final Camera f33314e;

    /* renamed from: f */
    public C13461a f33315f;

    /* renamed from: ah.a$a */
    public final class C13461a extends AsyncTask<Object, Object, Object> {
        public C13461a() {
        }

        public final Object doInBackground(Object... objArr) {
            try {
                Thread.sleep(C13460a.this.f33310a);
            } catch (InterruptedException unused) {
            }
            C13460a.this.mo40362b();
            return null;
        }
    }

    static {
        Class<C13460a> cls = C13460a.class;
        ArrayList arrayList = new ArrayList(2);
        f33309g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C13460a(Camera camera) {
        this.f33314e = camera;
        this.f33313d = f33309g.contains(camera.getParameters().getFocusMode());
        mo40362b();
    }

    /* renamed from: a */
    public final synchronized void mo40361a() {
        if (!this.f33311b && this.f33315f == null) {
            C13461a aVar = new C13461a();
            try {
                aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
                this.f33315f = aVar;
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0019 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo40362b() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f33313d     // Catch:{ all -> 0x001e }
            if (r0 == 0) goto L_0x001c
            r0 = 0
            r1.f33315f = r0     // Catch:{ all -> 0x001e }
            boolean r0 = r1.f33311b     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            boolean r0 = r1.f33312c     // Catch:{ all -> 0x001e }
            if (r0 != 0) goto L_0x001c
            android.hardware.Camera r0 = r1.f33314e     // Catch:{ RuntimeException -> 0x0019 }
            r0.autoFocus(r1)     // Catch:{ RuntimeException -> 0x0019 }
            r0 = 1
            r1.f33312c = r0     // Catch:{ RuntimeException -> 0x0019 }
            goto L_0x001c
        L_0x0019:
            r1.mo40361a()     // Catch:{ all -> 0x001e }
        L_0x001c:
            monitor-exit(r1)
            return
        L_0x001e:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p360ah.C13460a.mo40362b():void");
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
    /* renamed from: c */
    public final synchronized void mo40363c() {
        /*
            r3 = this;
            monitor-enter(r3)
            r0 = 1
            r3.f33311b = r0     // Catch:{ all -> 0x002b }
            boolean r1 = r3.f33313d     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            monitor-enter(r3)     // Catch:{ all -> 0x002b }
            ah.a$a r1 = r3.f33315f     // Catch:{ all -> 0x001e }
            if (r1 == 0) goto L_0x0020
            android.os.AsyncTask$Status r1 = r1.getStatus()     // Catch:{ all -> 0x001e }
            android.os.AsyncTask$Status r2 = android.os.AsyncTask.Status.FINISHED     // Catch:{ all -> 0x001e }
            if (r1 == r2) goto L_0x001a
            ah.a$a r1 = r3.f33315f     // Catch:{ all -> 0x001e }
            r1.cancel(r0)     // Catch:{ all -> 0x001e }
        L_0x001a:
            r0 = 0
            r3.f33315f = r0     // Catch:{ all -> 0x001e }
            goto L_0x0020
        L_0x001e:
            r0 = move-exception
            goto L_0x0027
        L_0x0020:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            android.hardware.Camera r0 = r3.f33314e     // Catch:{ RuntimeException -> 0x0029 }
            r0.cancelAutoFocus()     // Catch:{ RuntimeException -> 0x0029 }
            goto L_0x0029
        L_0x0027:
            monitor-exit(r3)     // Catch:{ all -> 0x002b }
            throw r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r3)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p360ah.C13460a.mo40363c():void");
    }

    public final synchronized void onAutoFocus(boolean z, Camera camera) {
        this.f33312c = false;
        mo40361a();
    }
}
