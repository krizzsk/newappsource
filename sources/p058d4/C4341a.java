package p058d4;

import p001a0.C0017h;
import p070e4.C4548c;
import p257t3.C6557a;
import p283v4.C6857b;
import p296w4.C6990g;
import p358af.C13437d;

/* renamed from: d4.a */
public final class C4341a {

    /* renamed from: a */
    public final ClassLoader f15305a = C6990g.m16471a(this);

    /* renamed from: b */
    public final C6557a f15306b;

    public C4341a(C6557a aVar) {
        this.f15306b = aVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v10, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v13, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v19, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v20, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v22, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v23, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: android.content.ContextWrapper} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v22, resolved type: v4.f} */
    /* JADX WARNING: type inference failed for: r1v3, types: [android.content.ContextWrapper] */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v15, types: [v4.f] */
    /* JADX WARNING: type inference failed for: r1v18 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:66|67|(2:68|69)|(2:(1:76)(1:77)|78)) */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r4 = r8.f15305a;
        r5 = p296w4.C6990g.f21761a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r4 = r4.getResource(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x012e, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012f, code lost:
        if (r4 == 0) goto L_0x0139;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0139, code lost:
        if (r4 != 0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013b, code lost:
        r4 = r4.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0140, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0145, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0146, code lost:
        mo19848b(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0149, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:66:0x0125 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d0 A[SYNTHETIC, Splitter:B:49:0x00d0] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00fe A[SYNTHETIC, Splitter:B:57:0x00fe] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x014d  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo19847a() throws p043ch.qos.logback.core.joran.spi.JoranException {
        /*
            r8 = this;
            t3.a r0 = r8.f15306b
            java.lang.String r1 = "logback.statusListenerClass"
            java.lang.String r1 = p296w4.C6992h.m16472a(r1)
            boolean r2 = p296w4.C6992h.m16474c(r1)
            r3 = 0
            if (r2 != 0) goto L_0x003a
            java.lang.Class<v4.f> r2 = p283v4.C6861f.class
            java.lang.Object r1 = p296w4.C6992h.m16473b(r1, r2, r0)     // Catch:{ Exception -> 0x0018 }
            v4.f r1 = (p283v4.C6861f) r1     // Catch:{ Exception -> 0x0018 }
            goto L_0x001d
        L_0x0018:
            r1 = move-exception
            r1.printStackTrace()
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x003a
            boolean r2 = r1 instanceof p271u4.C6692c
            if (r2 == 0) goto L_0x0029
            r2 = r1
            u4.c r2 = (p271u4.C6692c) r2
            r2.mo20064b(r0)
        L_0x0029:
            e4.c r0 = r0.f15676d
            boolean r0 = r0.mo20057b(r1)
            if (r0 == 0) goto L_0x003a
            boolean r0 = r1 instanceof p271u4.C6695f
            if (r0 == 0) goto L_0x003a
            u4.f r1 = (p271u4.C6695f) r1
            r1.start()
        L_0x003a:
            r0 = 0
            java.lang.String r1 = "android.app.AppGlobals"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.String r2 = "getInitialApplication"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            java.lang.Object r1 = r2.invoke(r1, r4)     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1     // Catch:{ ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException -> 0x0052 }
            goto L_0x0054
        L_0x0052:
            r1 = r3
        L_0x0054:
            t3.a r2 = r8.f15306b
            java.util.Properties r4 = new java.util.Properties
            r4.<init>()
            java.lang.String r5 = ""
            if (r1 == 0) goto L_0x006a
            java.io.File r6 = r1.getFilesDir()
            if (r6 == 0) goto L_0x006a
            java.lang.String r6 = r6.getAbsolutePath()
            goto L_0x006b
        L_0x006a:
            r6 = r5
        L_0x006b:
            java.lang.String r7 = "DATA_DIR"
            r4.setProperty(r7, r6)
            java.lang.String r6 = android.os.Environment.getExternalStorageState()
            java.lang.String r7 = "mounted"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L_0x0087
            java.lang.String r7 = "mounted_ro"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L_0x0085
            goto L_0x0087
        L_0x0085:
            r6 = r3
            goto L_0x0093
        L_0x0087:
            java.io.File r6 = android.os.Environment.getExternalStorageDirectory()
            if (r6 == 0) goto L_0x0092
            java.lang.String r6 = r6.getAbsolutePath()
            goto L_0x0093
        L_0x0092:
            r6 = r5
        L_0x0093:
            if (r6 == 0) goto L_0x009a
            java.lang.String r7 = "EXT_DIR"
            r4.setProperty(r7, r6)
        L_0x009a:
            if (r1 == 0) goto L_0x00a1
            java.lang.String r6 = r1.getPackageName()
            goto L_0x00a2
        L_0x00a1:
            r6 = r5
        L_0x00a2:
            java.lang.String r7 = "PACKAGE_NAME"
            r4.setProperty(r7, r6)
            if (r1 == 0) goto L_0x00c8
            android.content.pm.PackageManager r6 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00c7 }
            java.lang.String r7 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00c7 }
            android.content.pm.PackageInfo r6 = r6.getPackageInfo(r7, r0)     // Catch:{ NameNotFoundException -> 0x00c7 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NameNotFoundException -> 0x00c7 }
            r7.<init>()     // Catch:{ NameNotFoundException -> 0x00c7 }
            r7.append(r5)     // Catch:{ NameNotFoundException -> 0x00c7 }
            int r6 = r6.versionCode     // Catch:{ NameNotFoundException -> 0x00c7 }
            r7.append(r6)     // Catch:{ NameNotFoundException -> 0x00c7 }
            java.lang.String r6 = r7.toString()     // Catch:{ NameNotFoundException -> 0x00c7 }
            goto L_0x00c9
        L_0x00c7:
        L_0x00c8:
            r6 = r5
        L_0x00c9:
            java.lang.String r7 = "VERSION_CODE"
            r4.setProperty(r7, r6)
            if (r1 == 0) goto L_0x00e0
            android.content.pm.PackageManager r6 = r1.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r1 = r1.getPackageName()     // Catch:{ NameNotFoundException -> 0x00df }
            android.content.pm.PackageInfo r1 = r6.getPackageInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x00df }
            java.lang.String r1 = r1.versionName     // Catch:{ NameNotFoundException -> 0x00df }
            goto L_0x00e1
        L_0x00df:
        L_0x00e0:
            r1 = r5
        L_0x00e1:
            if (r1 == 0) goto L_0x00e4
            r5 = r1
        L_0x00e4:
            java.lang.String r1 = "VERSION_NAME"
            r4.setProperty(r1, r5)
            r2.mo22671g(r4)
            v3.a r1 = new v3.a
            r1.<init>()
            t3.a r2 = r8.f15306b
            r1.mo20064b(r2)
            java.lang.String r2 = "logback.configurationFile"
            java.lang.String r2 = p296w4.C6992h.m16472a(r2)
            if (r2 == 0) goto L_0x014a
            java.io.File r4 = new java.io.File     // Catch:{ MalformedURLException -> 0x0125 }
            r4.<init>(r2)     // Catch:{ MalformedURLException -> 0x0125 }
            boolean r5 = r4.exists()     // Catch:{ MalformedURLException -> 0x0125 }
            if (r5 == 0) goto L_0x011b
            boolean r5 = r4.isFile()     // Catch:{ MalformedURLException -> 0x0125 }
            if (r5 == 0) goto L_0x011b
            r8.mo19848b(r2, r2)     // Catch:{ MalformedURLException -> 0x0125 }
            java.net.URI r4 = r4.toURI()     // Catch:{ MalformedURLException -> 0x0125 }
            java.net.URL r4 = r4.toURL()     // Catch:{ MalformedURLException -> 0x0125 }
            goto L_0x0120
        L_0x011b:
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0125 }
            r4.<init>(r2)     // Catch:{ MalformedURLException -> 0x0125 }
        L_0x0120:
            if (r4 == 0) goto L_0x0123
            goto L_0x0131
        L_0x0123:
            r5 = r3
            goto L_0x0135
        L_0x0125:
            java.lang.ClassLoader r4 = r8.f15305a     // Catch:{ all -> 0x0145 }
            boolean r5 = p296w4.C6990g.f21761a     // Catch:{ all -> 0x0145 }
            java.net.URL r4 = r4.getResource(r2)     // Catch:{ all -> 0x012e }
            goto L_0x012f
        L_0x012e:
            r4 = r3
        L_0x012f:
            if (r4 == 0) goto L_0x0139
        L_0x0131:
            java.lang.String r5 = r4.toString()
        L_0x0135:
            r8.mo19848b(r2, r5)
            goto L_0x014b
        L_0x0139:
            if (r4 == 0) goto L_0x0140
            java.lang.String r4 = r4.toString()
            goto L_0x0141
        L_0x0140:
            r4 = r3
        L_0x0141:
            r8.mo19848b(r2, r4)
            goto L_0x014a
        L_0x0145:
            r0 = move-exception
            r8.mo19848b(r2, r3)
            throw r0
        L_0x014a:
            r4 = r3
        L_0x014b:
            if (r4 == 0) goto L_0x0151
            r1.mo21422r(r4)
            r0 = 1
        L_0x0151:
            if (r0 != 0) goto L_0x0166
            java.lang.ClassLoader r0 = r8.f15305a
            java.lang.String r2 = "assets/logback.xml"
            java.net.URL r0 = r0.getResource(r2)
            if (r0 == 0) goto L_0x015e
            r3 = r2
        L_0x015e:
            r8.mo19848b(r2, r3)
            if (r0 == 0) goto L_0x0166
            r1.mo21422r(r0)
        L_0x0166:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p058d4.C4341a.mo19847a():void");
    }

    /* renamed from: b */
    public final void mo19848b(String str, String str2) {
        C4548c cVar = this.f15306b.f15676d;
        if (str2 == null) {
            cVar.mo20056a(new C6857b(C13437d.m33706k("Could NOT find resource [", str, "]"), this.f15306b));
        } else {
            cVar.mo20056a(new C6857b(C0017h.m56M("Found resource [", str, "] at [", str2, "]"), this.f15306b));
        }
    }
}
