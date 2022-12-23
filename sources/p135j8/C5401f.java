package p135j8;

import android.os.AsyncTask;
import java.io.File;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: j8.f */
public final class C5401f extends AsyncTask<String, Void, Boolean> {

    /* renamed from: a */
    public final String f17737a;

    /* renamed from: b */
    public final File f17738b;

    /* renamed from: c */
    public final C5402a f17739c;

    /* renamed from: j8.f$a */
    public interface C5402a {
        /* renamed from: a */
        void mo19838a(File file);
    }

    public C5401f(String str, File file, C5402a aVar) {
        C24362h.m61211f(str, "uriStr");
        this.f17737a = str;
        this.f17738b = file;
        this.f17739c = aVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:13|14|15) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0054, code lost:
        return java.lang.Boolean.FALSE;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0052 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean mo21167a(java.lang.String... r5) {
        /*
            r4 = this;
            boolean r0 = p262t8.C6606a.m15601b(r4)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            boolean r0 = p262t8.C6606a.m15601b(r4)     // Catch:{ all -> 0x005a }
            if (r0 == 0) goto L_0x000f
            return r1
        L_0x000f:
            java.lang.String r0 = "args"
            mf0.C24362h.m61211f(r5, r0)     // Catch:{ all -> 0x0055 }
            java.net.URL r5 = new java.net.URL     // Catch:{ Exception -> 0x0052 }
            java.lang.String r0 = r4.f17737a     // Catch:{ Exception -> 0x0052 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0052 }
            java.net.URLConnection r0 = r5.openConnection()     // Catch:{ Exception -> 0x0052 }
            java.lang.Object r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r0)     // Catch:{ Exception -> 0x0052 }
            java.net.URLConnection r0 = (java.net.URLConnection) r0     // Catch:{ Exception -> 0x0052 }
            int r0 = r0.getContentLength()     // Catch:{ Exception -> 0x0052 }
            java.io.DataInputStream r2 = new java.io.DataInputStream     // Catch:{ Exception -> 0x0052 }
            java.io.InputStream r5 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r5)     // Catch:{ Exception -> 0x0052 }
            r2.<init>(r5)     // Catch:{ Exception -> 0x0052 }
            byte[] r5 = new byte[r0]     // Catch:{ Exception -> 0x0052 }
            r2.readFully(r5)     // Catch:{ Exception -> 0x0052 }
            r2.close()     // Catch:{ Exception -> 0x0052 }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0052 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0052 }
            java.io.File r3 = r4.f17738b     // Catch:{ Exception -> 0x0052 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0052 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0052 }
            r0.write(r5)     // Catch:{ Exception -> 0x0052 }
            r0.flush()     // Catch:{ Exception -> 0x0052 }
            r0.close()     // Catch:{ Exception -> 0x0052 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0052 }
            return r5
        L_0x0052:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0055 }
            return r5
        L_0x0055:
            r5 = move-exception
            p262t8.C6606a.m15600a(r4, r5)     // Catch:{ all -> 0x005a }
            return r1
        L_0x005a:
            r5 = move-exception
            p262t8.C6606a.m15600a(r4, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p135j8.C5401f.mo21167a(java.lang.String[]):java.lang.Boolean");
    }

    public final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            if (C6606a.m15601b(this)) {
                return null;
            }
            return mo21167a((String[]) objArr);
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    public final void onPostExecute(Object obj) {
        if (!C6606a.m15601b(this)) {
            try {
                if (!C6606a.m15601b(this)) {
                    try {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        if (!C6606a.m15601b(this)) {
                            try {
                                if (!C6606a.m15601b(this) && booleanValue) {
                                    this.f17739c.mo19838a(this.f17738b);
                                }
                            } catch (Throwable th) {
                                C6606a.m15600a(this, th);
                            }
                        }
                    } catch (Throwable th2) {
                        C6606a.m15600a(this, th2);
                    }
                }
            } catch (Throwable th3) {
                C6606a.m15600a(this, th3);
            }
        }
    }
}
