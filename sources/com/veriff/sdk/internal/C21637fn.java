package com.veriff.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Executors;
import p358af.C13437d;

/* renamed from: com.veriff.sdk.internal.fn */
public class C21637fn {

    /* renamed from: a */
    private static final C21636fm f54637a = new C21623fd(new Handler(Looper.getMainLooper()));

    /* renamed from: b */
    private static final C21624fe f54638b = new C21624fe("veriffcamera");

    /* renamed from: c */
    private static final C21636fm f54639c = new C21621fb(Executors.newSingleThreadScheduledExecutor());

    /* renamed from: d */
    private static final C21636fm f54640d = new C21621fb(Executors.newScheduledThreadPool(3));

    /* renamed from: e */
    private static final C21636fm f54641e = new C21621fb(Executors.newScheduledThreadPool(3));

    /* renamed from: f */
    private static final C21636fm f54642f = C21621fb.m52485a("VrffVideo", 1);

    /* renamed from: g */
    private static final C21636fm f54643g = C21621fb.m52485a("VrffAudio", 1);

    /* renamed from: a */
    public static C21636fm m52520a() {
        return f54639c;
    }

    /* renamed from: b */
    public static C21636fm m52522b() {
        return f54640d;
    }

    /* renamed from: c */
    public static C21636fm m52523c() {
        return f54637a;
    }

    /* renamed from: d */
    public static C21636fm m52524d() {
        return f54641e;
    }

    /* renamed from: e */
    public static C21636fm m52525e() {
        return f54638b;
    }

    /* renamed from: f */
    public static C21636fm m52526f() {
        return f54642f;
    }

    /* renamed from: g */
    public static C21636fm m52527g() {
        return f54643g;
    }

    /* renamed from: a */
    public static Throwable m52521a(String... strArr) {
        ArrayList arrayList = new ArrayList();
        Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
        if (strArr != null) {
            for (String str : strArr) {
                for (Map.Entry next : allStackTraces.entrySet()) {
                    if (((Thread) next.getKey()).getName().equals(str)) {
                        Throwable th = new Throwable(C13437d.m33706k("Dump of ", str, ":"));
                        th.setStackTrace((StackTraceElement[]) next.getValue());
                        arrayList.add(th);
                    }
                }
            }
        }
        int i = 0;
        while (i < arrayList.size() - 1) {
            i++;
            ((Throwable) arrayList.get(i)).initCause((Throwable) arrayList.get(i));
        }
        if (arrayList.isEmpty()) {
            return new Throwable("No threads to dump found");
        }
        return (Throwable) arrayList.get(0);
    }
}
