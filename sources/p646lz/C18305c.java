package p646lz;

import android.content.Context;
import android.content.res.Configuration;
import com.google.firebase.perf.metrics.Trace;
import com.moovit.commons.appdata.AppDataPartLoadFailedException;
import com.moovit.commons.request.ServerException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import p066e0.C4436j0;
import p435de.C16596f;

/* renamed from: lz.c */
public abstract class C18305c<T> {

    /* renamed from: b */
    public static volatile C4436j0 f46685b;

    /* renamed from: a */
    public C4436j0 f46686a = f46685b;

    /* renamed from: a */
    public Object mo46174a(Context context, Configuration configuration, C18299a aVar) {
        return null;
    }

    /* renamed from: b */
    public HashSet mo20294b(Context context) {
        return new HashSet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        r5 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        throw new com.moovit.commons.appdata.AppDataPartLoadFailedException(r5, (java.lang.String) null, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0059, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        mo50711g(r7, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005e, code lost:
        throw r5;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final T mo50709c(android.content.Context r5, p646lz.C18299a r6, java.lang.String r7) throws com.moovit.commons.appdata.AppDataPartLoadFailedException {
        /*
            r4 = this;
            e0.j0 r0 = r4.f46686a
            if (r0 == 0) goto L_0x0044
            de.f r1 = p435de.C16596f.m42113a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "MoovitAppDataPart["
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "] onBeforeLoad"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.mo49363b(r2)
            hf.b r1 = p532hf.C17427b.m43467a()
            r1.getClass()
            java.lang.String r1 = "app_data_part_loader"
            com.google.firebase.perf.metrics.Trace r1 = com.google.firebase.perf.metrics.Trace.m36075d(r1)
            java.lang.String r2 = "part_id"
            r1.putAttribute(r2, r7)
            java.lang.String r2 = "type"
            java.lang.String r3 = "unknown"
            r1.putAttribute(r2, r3)
            r1.start()
            java.lang.Object r0 = r0.f15501b
            java.util.Map r0 = (java.util.Map) r0
            r0.put(r7, r1)
        L_0x0044:
            r0 = 1
            java.lang.Object r5 = r4.mo6591f(r5, r6, r7)     // Catch:{ IOException -> 0x0051, ServerException -> 0x004f, all -> 0x004d }
            r4.mo50711g(r7, r0)
            return r5
        L_0x004d:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0059 }
        L_0x004f:
            r5 = move-exception
            goto L_0x0052
        L_0x0051:
            r5 = move-exception
        L_0x0052:
            com.moovit.commons.appdata.AppDataPartLoadFailedException r6 = new com.moovit.commons.appdata.AppDataPartLoadFailedException     // Catch:{ all -> 0x0059 }
            r0 = 0
            r6.<init>(r5, r0, r5)     // Catch:{ all -> 0x0059 }
            throw r6     // Catch:{ all -> 0x0059 }
        L_0x0059:
            r5 = move-exception
            r6 = 0
            r4.mo50711g(r7, r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p646lz.C18305c.mo50709c(android.content.Context, lz.a, java.lang.String):java.lang.Object");
    }

    /* renamed from: d */
    public Object mo22058d(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return null;
    }

    /* renamed from: e */
    public Object mo50710e(Context context, C18299a aVar) throws IOException, AppDataPartLoadFailedException, ServerException {
        return null;
    }

    /* renamed from: f */
    public T mo6591f(Context context, C18299a aVar, String str) throws IOException, AppDataPartLoadFailedException, ServerException {
        C4436j0 j0Var;
        T d = mo22058d(context, aVar);
        if (d != null) {
            C4436j0 j0Var2 = this.f46686a;
            if (j0Var2 != null) {
                C16596f a = C16596f.m42113a();
                a.mo49363b("MoovitAppDataPart[" + str + "] onLoadLocally");
                Trace trace = (Trace) ((Map) j0Var2.f15501b).get(str);
                if (trace != null) {
                    trace.putAttribute("type", "locally");
                }
            }
            return d;
        }
        T e = mo50710e(context, aVar);
        if (!(e == null || (j0Var = this.f46686a) == null)) {
            C16596f a2 = C16596f.m42113a();
            a2.mo49363b("MoovitAppDataPart[" + str + "] onLoadRemotely");
            Trace trace2 = (Trace) ((Map) j0Var.f15501b).get(str);
            if (trace2 != null) {
                trace2.putAttribute("type", "remotely");
            }
        }
        return e;
    }

    /* renamed from: g */
    public final void mo50711g(String str, boolean z) {
        String str2;
        C4436j0 j0Var = this.f46686a;
        if (j0Var != null) {
            C16596f a = C16596f.m42113a();
            a.mo49363b("MoovitAppDataPart[" + str + "] onAfterLoad, isSuccess=" + z);
            Trace trace = (Trace) ((Map) j0Var.f15501b).remove(str);
            if (trace != null) {
                if (z) {
                    str2 = WidgetMessageParser.KEY_SUCCESS;
                } else {
                    str2 = "failure";
                }
                trace.putAttribute("result", str2);
                trace.stop();
            }
        }
    }

    /* renamed from: h */
    public T mo50712h(Context context, C18299a aVar) throws AppDataPartLoadFailedException, IOException, ServerException {
        return null;
    }
}
