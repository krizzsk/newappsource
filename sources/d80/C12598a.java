package d80;

import android.content.Context;
import android.net.Uri;
import d80.C12598a;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import k40.C5477a;
import p906wz.C20436g;

/* renamed from: d80.a */
public abstract class C12598a<RQ extends C12598a<RQ, RS>, RS extends C20436g<RQ, RS>> extends C5477a<RQ, RS> implements Callable<RS> {

    /* renamed from: s */
    public static final AtomicReference<String> f31146s = new AtomicReference<>((Object) null);

    /* renamed from: t */
    public static final AtomicReference<String> f31147t = new AtomicReference<>((Object) null);

    public C12598a(Context context, Uri uri, boolean z, Class<RS> cls) {
        super(context, uri, z, cls);
        AtomicReference<String> atomicReference = f31146s;
        String str = atomicReference.get();
        if (str == null) {
            synchronized (atomicReference) {
                str = atomicReference.get();
                if (str == null) {
                    int identifier = context.getResources().getIdentifier("google_wla_api_key", "string", context.getPackageName());
                    String str2 = null;
                    if (identifier == 0) {
                        str = null;
                    } else {
                        str = context.getString(identifier);
                    }
                    if (str == null) {
                        int identifier2 = context.getResources().getIdentifier("google_api_key", "string", context.getPackageName());
                        if (identifier2 != 0) {
                            str2 = context.getString(identifier2);
                        }
                        str = str2;
                    }
                    atomicReference.set(str);
                }
            }
        }
        if (str != null) {
            mo52629r(LinksConfiguration.KEY_KEY, str);
        }
        mo52629r("channel", "2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r7 != null) goto L_0x0020;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m32304M(android.content.Context r7) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String r2 = r7.getPackageName()     // Catch:{ Exception -> 0x001e }
            android.content.pm.PackageManager r7 = r7.getPackageManager()     // Catch:{ Exception -> 0x001e }
            r3 = 64
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r2, r3)     // Catch:{ Exception -> 0x001e }
            if (r7 == 0) goto L_0x001f
            android.content.pm.Signature[] r7 = r7.signatures     // Catch:{ Exception -> 0x001e }
            if (r7 == 0) goto L_0x001f
            int r2 = r7.length     // Catch:{ Exception -> 0x001e }
            if (r2 == 0) goto L_0x001f
            r7 = r7[r0]     // Catch:{ Exception -> 0x001e }
            if (r7 != 0) goto L_0x0020
            goto L_0x001f
        L_0x001e:
        L_0x001f:
            r7 = r1
        L_0x0020:
            if (r7 != 0) goto L_0x0023
            return r1
        L_0x0023:
            java.lang.String r2 = "SHA1"
            java.security.MessageDigest r2 = java.security.MessageDigest.getInstance(r2)     // Catch:{ Exception -> 0x0058 }
            byte[] r7 = r7.toByteArray()     // Catch:{ Exception -> 0x0058 }
            byte[] r7 = r2.digest(r7)     // Catch:{ Exception -> 0x0058 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0058 }
            int r3 = r7.length     // Catch:{ Exception -> 0x0058 }
            int r3 = r3 * 2
            r2.<init>(r3)     // Catch:{ Exception -> 0x0058 }
            int r3 = r7.length     // Catch:{ Exception -> 0x0058 }
        L_0x003a:
            if (r0 >= r3) goto L_0x0053
            byte r4 = r7[r0]     // Catch:{ Exception -> 0x0058 }
            char[] r5 = p626lf.C18201b.f46456e     // Catch:{ Exception -> 0x0058 }
            int r6 = r4 >> 4
            r6 = r6 & 15
            char r6 = r5[r6]     // Catch:{ Exception -> 0x0058 }
            r4 = r4 & 15
            char r4 = r5[r4]     // Catch:{ Exception -> 0x0058 }
            r2.append(r6)     // Catch:{ Exception -> 0x0058 }
            r2.append(r4)     // Catch:{ Exception -> 0x0058 }
            int r0 = r0 + 1
            goto L_0x003a
        L_0x0053:
            java.lang.String r7 = r2.toString()     // Catch:{ Exception -> 0x0058 }
            return r7
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: d80.C12598a.m32304M(android.content.Context):java.lang.String");
    }

    public final Object call() throws Exception {
        return mo52626J();
    }

    /* renamed from: t */
    public void mo20116t(HttpURLConnection httpURLConnection) throws IOException {
        super.mo20116t(httpURLConnection);
        Context context = this.f51759b;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        AtomicReference<String> atomicReference = f31147t;
        String str = atomicReference.get();
        if (str == null) {
            synchronized (atomicReference) {
                str = atomicReference.get();
                if (str == null) {
                    String M = m32304M(context);
                    atomicReference.set(M);
                    str = M;
                }
            }
        }
        if (str != null) {
            httpURLConnection.setRequestProperty("X-Android-Cert", str);
        }
    }
}
