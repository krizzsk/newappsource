package p886wf;

import com.google.android.gms.common.util.BiConsumer;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import org.json.JSONException;
import p217q2.C6160i;

/* renamed from: wf.g */
public final class C20302g {

    /* renamed from: e */
    public static final Pattern f51480e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);

    /* renamed from: f */
    public static final Pattern f51481f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);

    /* renamed from: a */
    public final HashSet f51482a = new HashSet();

    /* renamed from: b */
    public final Executor f51483b;

    /* renamed from: c */
    public final C20297c f51484c;

    /* renamed from: d */
    public final C20297c f51485d;

    static {
        Charset.forName("UTF-8");
    }

    public C20302g(ExecutorService executorService, C20297c cVar, C20297c cVar2) {
        this.f51483b = executorService;
        this.f51484c = cVar;
        this.f51485d = cVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return (p886wf.C20299d) p886wf.C20297c.m47866a(r1.mo52465c(), java.util.concurrent.TimeUnit.SECONDS);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p886wf.C20299d m47870b(p886wf.C20297c r1) {
        /*
            monitor-enter(r1)
            com.google.android.gms.tasks.Task<wf.d> r0 = r1.f51466c     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0015
            boolean r0 = r0.isSuccessful()     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0015
            com.google.android.gms.tasks.Task<wf.d> r0 = r1.f51466c     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.getResult()     // Catch:{ all -> 0x0026 }
            wf.d r0 = (p886wf.C20299d) r0     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            goto L_0x0025
        L_0x0015:
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            com.google.android.gms.tasks.Task r1 = r1.mo52465c()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            java.lang.Object r1 = p886wf.C20297c.m47866a(r1, r0)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            r0 = r1
            wf.d r0 = (p886wf.C20299d) r0     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0024 }
            goto L_0x0025
        L_0x0024:
            r0 = 0
        L_0x0025:
            return r0
        L_0x0026:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p886wf.C20302g.m47870b(wf.c):wf.d");
    }

    /* renamed from: c */
    public static HashSet m47871c(C20297c cVar) {
        HashSet hashSet = new HashSet();
        C20299d b = m47870b(cVar);
        if (b == null) {
            return hashSet;
        }
        Iterator<String> keys = b.f51470b.keys();
        while (keys.hasNext()) {
            hashSet.add(keys.next());
        }
        return hashSet;
    }

    /* renamed from: d */
    public static String m47872d(C20297c cVar, String str) {
        C20299d b = m47870b(cVar);
        if (b == null) {
            return null;
        }
        try {
            return b.f51470b.getString(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static void m47873f(String str, String str2) {
        String.format("No value of type '%s' exists for parameter key '%s'.", new Object[]{str2, str});
    }

    /* renamed from: a */
    public final void mo52469a(C20299d dVar, String str) {
        if (dVar != null) {
            synchronized (this.f51482a) {
                Iterator it = this.f51482a.iterator();
                while (it.hasNext()) {
                    this.f51483b.execute(new C6160i(3, (BiConsumer) it.next(), str, dVar));
                }
            }
        }
    }

    /* renamed from: e */
    public final C20304i mo52470e(String str) {
        String d = m47872d(this.f51484c, str);
        if (d != null) {
            mo52469a(m47870b(this.f51484c), str);
            return new C20304i(d, 2);
        }
        String d2 = m47872d(this.f51485d, str);
        if (d2 != null) {
            return new C20304i(d2, 1);
        }
        m47873f(str, "FirebaseRemoteConfigValue");
        return new C20304i("", 0);
    }
}
