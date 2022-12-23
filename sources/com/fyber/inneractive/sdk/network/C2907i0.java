package com.fyber.inneractive.sdk.network;

import android.os.Environment;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.network.i0 */
public class C2907i0 extends C2897e0<String> {

    /* renamed from: g */
    public final String f9919g;

    public C2907i0(C2936u<String> uVar, String str) {
        super(uVar, C2937v.m7259b().mo13722a());
        this.f9919g = str;
    }

    /* renamed from: a */
    public String mo13664a() {
        return this.f9919g;
    }

    /* renamed from: f */
    public C2914l0 mo13671f() {
        return C2914l0.LOW;
    }

    /* renamed from: j */
    public boolean mo13675j() {
        return false;
    }

    /* renamed from: n */
    public C2943y mo13679n() {
        return C2943y.GET;
    }

    /* renamed from: p */
    public int mo13680p() {
        return 0;
    }

    /* renamed from: a */
    public C2887a0 mo13662a(InputStream inputStream, Map<String, List<String>> map, int i) throws Exception {
        T t;
        C2887a0 a0Var = new C2887a0();
        FileOutputStream fileOutputStream = null;
        try {
            File file = new File(Environment.getExternalStorageDirectory(), "Pictures");
            file.mkdirs();
            String a = mo13705a(URI.create(this.f9919g), map);
            if (!TextUtils.isEmpty(a)) {
                File file2 = new File(file, a);
                t = file2.toString();
                FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                try {
                    C3727s.m9994a(inputStream, (OutputStream) fileOutputStream2);
                    fileOutputStream = fileOutputStream2;
                } catch (Exception unused) {
                    fileOutputStream = fileOutputStream2;
                    try {
                        IAlog.m9902a("failed to download and save the image file.", new Object[0]);
                        C3727s.m9995b(fileOutputStream);
                        return a0Var;
                    } catch (Throwable th) {
                        th = th;
                        fileOutputStream2 = fileOutputStream;
                        C3727s.m9995b(fileOutputStream2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    C3727s.m9995b(fileOutputStream2);
                    throw th;
                }
            } else {
                t = null;
            }
            a0Var.f9874a = t;
        } catch (Exception unused2) {
        }
        C3727s.m9995b(fileOutputStream);
        return a0Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String mo13705a(java.net.URI r5, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r6) {
        /*
            r4 = this;
            java.lang.String r5 = r5.getPath()
            r0 = 0
            if (r5 != 0) goto L_0x0008
            return r0
        L_0x0008:
            java.io.File r1 = new java.io.File
            r1.<init>(r5)
            java.lang.String r5 = r1.getName()
            if (r6 == 0) goto L_0x001d
            java.lang.String r1 = "text/html"
            java.lang.Object r6 = r6.get(r1)
            java.util.List r6 = (java.util.List) r6
            goto L_0x001e
        L_0x001d:
            r6 = r0
        L_0x001e:
            r1 = 0
            if (r6 == 0) goto L_0x0028
            java.lang.Object r6 = r6.get(r1)
            r0 = r6
            java.lang.String r0 = (java.lang.String) r0
        L_0x0028:
            if (r0 == 0) goto L_0x0061
            java.lang.String r6 = ";"
            java.lang.String[] r6 = r0.split(r6)
            int r0 = r6.length
        L_0x0031:
            if (r1 >= r0) goto L_0x0061
            r2 = r6[r1]
            java.lang.String r3 = "image/"
            boolean r3 = r2.contains(r3)
            if (r3 == 0) goto L_0x005e
            java.lang.String r6 = "."
            java.lang.StringBuilder r6 = p379.C13555b.m33972k(r6)
            java.lang.String r0 = "/"
            java.lang.String[] r0 = r2.split(r0)
            r1 = 1
            r0 = r0[r1]
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            boolean r0 = r5.endsWith(r6)
            if (r0 != 0) goto L_0x0061
            java.lang.String r5 = p379.C25541a.m63881k(r5, r6)
            goto L_0x0061
        L_0x005e:
            int r1 = r1 + 1
            goto L_0x0031
        L_0x0061:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.C2907i0.mo13705a(java.net.URI, java.util.Map):java.lang.String");
    }
}
