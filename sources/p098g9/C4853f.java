package p098g9;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import p358af.C13437d;

/* renamed from: g9.f */
public final class C4853f {

    /* renamed from: a */
    public final HashSet f16278a = new HashSet();

    /* renamed from: b */
    public final C4850c f16279b;

    /* renamed from: c */
    public final C4849b f16280c;

    /* renamed from: d */
    public C4851d f16281d;

    public C4853f() {
        C4854g gVar = new C4854g();
        C4847a aVar = new C4847a();
        this.f16279b = gVar;
        this.f16280c = aVar;
    }

    /* renamed from: a */
    public final File mo20337a(Context context, String str, String str2) {
        boolean z;
        String a = ((C4854g) this.f16279b).mo20340a(str);
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new File(context.getDir("lib", 0), a);
        }
        return new File(context.getDir("lib", 0), C13437d.m33706k(a, ".", str2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: boolean} */
    /* JADX WARNING: type inference failed for: r4v0 */
    /* JADX WARNING: type inference failed for: r4v1 */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        p098g9.C4847a.m12168a(r2);
        p098g9.C4847a.m12168a(r11);
        r0.setReadable(r5, r4);
        r0.setExecutable(r5, r4);
        r0.setWritable(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:?, code lost:
        r2 = r10.f16275a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        if (r2 == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0161, code lost:
        r4 = r1.f16281d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0165, code lost:
        if (r4 == null) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0167, code lost:
        r4.log("FATAL! Couldn't extract the library from the APK!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        r2 = r10.f16275a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x016c, code lost:
        if (r2 == null) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x016e, code lost:
        r2.close();
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01af A[SYNTHETIC, Splitter:B:106:0x01af] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo20338b(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            r3 = r21
            java.util.HashSet r0 = r1.f16278a
            boolean r0 = r0.contains(r3)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x001a
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r4] = r3
            java.lang.String r2 = "%s already loaded previously!"
            r1.mo20339c(r2, r0)
            return
        L_0x001a:
            r6 = 2
            g9.c r0 = r1.f16279b     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            g9.g r0 = (p098g9.C4854g) r0     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            r0.getClass()     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            java.lang.System.loadLibrary(r21)     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            java.util.HashSet r0 = r1.f16278a     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            r0.add(r3)     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            java.lang.String r0 = "%s (%s) was loaded normally!"
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            r7[r4] = r3     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            r7[r5] = r22     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            r1.mo20339c(r0, r7)     // Catch:{ UnsatisfiedLinkError -> 0x0036 }
            return
        L_0x0036:
            r0 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            r7[r4] = r0
            java.lang.String r0 = "Loading the library normally failed: %s"
            r1.mo20339c(r0, r7)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r0[r4] = r3
            r0[r5] = r22
            java.lang.String r7 = "%s (%s) was not loaded normally, re-linking..."
            r1.mo20339c(r7, r0)
            java.io.File r0 = r19.mo20337a(r20, r21, r22)
            boolean r7 = r0.exists()
            if (r7 == 0) goto L_0x005b
            goto L_0x0171
        L_0x005b:
            java.lang.String r7 = "lib"
            java.io.File r7 = r2.getDir(r7, r4)
            java.io.File r8 = r19.mo20337a(r20, r21, r22)
            g9.c r9 = r1.f16279b
            g9.g r9 = (p098g9.C4854g) r9
            java.lang.String r9 = r9.mo20340a(r3)
            g9.e r10 = new g9.e
            r10.<init>(r9)
            java.io.File[] r7 = r7.listFiles(r10)
            if (r7 != 0) goto L_0x0079
            goto L_0x0093
        L_0x0079:
            int r9 = r7.length
            r10 = 0
        L_0x007b:
            if (r10 >= r9) goto L_0x0093
            r11 = r7[r10]
            java.lang.String r12 = r11.getAbsolutePath()
            java.lang.String r13 = r8.getAbsolutePath()
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L_0x0090
            r11.delete()
        L_0x0090:
            int r10 = r10 + 1
            goto L_0x007b
        L_0x0093:
            g9.b r7 = r1.f16280c
            g9.c r8 = r1.f16279b
            g9.g r8 = (p098g9.C4854g) r8
            r8.getClass()
            java.lang.String[] r8 = android.os.Build.SUPPORTED_ABIS
            int r9 = r8.length
            if (r9 <= 0) goto L_0x00a2
            goto L_0x00c2
        L_0x00a2:
            java.lang.String r8 = android.os.Build.CPU_ABI2
            if (r8 == 0) goto L_0x00af
            int r9 = r8.length()
            if (r9 != 0) goto L_0x00ad
            goto L_0x00af
        L_0x00ad:
            r9 = 0
            goto L_0x00b0
        L_0x00af:
            r9 = 1
        L_0x00b0:
            if (r9 != 0) goto L_0x00bc
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.String r10 = android.os.Build.CPU_ABI
            r9[r4] = r10
            r9[r5] = r8
            r8 = r9
            goto L_0x00c2
        L_0x00bc:
            java.lang.String[] r8 = new java.lang.String[r5]
            java.lang.String r9 = android.os.Build.CPU_ABI
            r8[r4] = r9
        L_0x00c2:
            g9.c r9 = r1.f16279b
            g9.g r9 = (p098g9.C4854g) r9
            java.lang.String r9 = r9.mo20340a(r3)
            g9.a r7 = (p098g9.C4847a) r7
            r7.getClass()
            g9.a$a r10 = p098g9.C4847a.m12169b(r2, r8, r9, r1)     // Catch:{ all -> 0x01ab }
            if (r10 == 0) goto L_0x0192
            r2 = 0
        L_0x00d6:
            int r8 = r2 + 1
            r11 = 5
            if (r2 >= r11) goto L_0x0161
            java.lang.String r2 = "Found %s! Extracting..."
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ all -> 0x0133 }
            r11[r4] = r9     // Catch:{ all -> 0x0133 }
            r1.mo20339c(r2, r11)     // Catch:{ all -> 0x0133 }
            boolean r2 = r0.exists()     // Catch:{ IOException -> 0x015b }
            if (r2 != 0) goto L_0x00f2
            boolean r2 = r0.createNewFile()     // Catch:{ IOException -> 0x015b }
            if (r2 != 0) goto L_0x00f2
            goto L_0x015c
        L_0x00f2:
            java.util.zip.ZipFile r2 = r10.f16275a     // Catch:{ FileNotFoundException | IOException -> 0x0152, all -> 0x0147 }
            java.util.zip.ZipEntry r11 = r10.f16276b     // Catch:{ FileNotFoundException | IOException -> 0x0152, all -> 0x0147 }
            java.io.InputStream r2 = r2.getInputStream(r11)     // Catch:{ FileNotFoundException | IOException -> 0x0152, all -> 0x0147 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException | IOException -> 0x0153, all -> 0x0141 }
            r11.<init>(r0)     // Catch:{ FileNotFoundException | IOException -> 0x0153, all -> 0x0141 }
            r12 = 4096(0x1000, float:5.74E-42)
            byte[] r12 = new byte[r12]     // Catch:{ FileNotFoundException | IOException -> 0x0154, all -> 0x013e }
            r13 = 0
        L_0x0105:
            int r15 = r2.read(r12)     // Catch:{ FileNotFoundException | IOException -> 0x0154, all -> 0x013e }
            r7 = -1
            if (r15 != r7) goto L_0x0136
            r11.flush()     // Catch:{ FileNotFoundException | IOException -> 0x0154, all -> 0x013e }
            java.io.FileDescriptor r7 = r11.getFD()     // Catch:{ FileNotFoundException | IOException -> 0x0154, all -> 0x013e }
            r7.sync()     // Catch:{ FileNotFoundException | IOException -> 0x0154, all -> 0x013e }
            long r17 = r0.length()     // Catch:{ FileNotFoundException | IOException -> 0x0154, all -> 0x013e }
            int r7 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r7 == 0) goto L_0x011f
            goto L_0x0154
        L_0x011f:
            p098g9.C4847a.m12168a(r2)     // Catch:{ all -> 0x0133 }
            p098g9.C4847a.m12168a(r11)     // Catch:{ all -> 0x0133 }
            r0.setReadable(r5, r4)     // Catch:{ all -> 0x0133 }
            r0.setExecutable(r5, r4)     // Catch:{ all -> 0x0133 }
            r0.setWritable(r5)     // Catch:{ all -> 0x0133 }
            java.util.zip.ZipFile r2 = r10.f16275a     // Catch:{ IOException -> 0x0171 }
            if (r2 == 0) goto L_0x0171
            goto L_0x016e
        L_0x0133:
            r0 = move-exception
            goto L_0x01a9
        L_0x0136:
            r11.write(r12, r4, r15)     // Catch:{ FileNotFoundException | IOException -> 0x0154, all -> 0x013e }
            long r4 = (long) r15
            long r13 = r13 + r4
            r4 = 0
            r5 = 1
            goto L_0x0105
        L_0x013e:
            r0 = move-exception
            r7 = r11
            goto L_0x0143
        L_0x0141:
            r0 = move-exception
            r7 = 0
        L_0x0143:
            r16 = r7
            r7 = r2
            goto L_0x014b
        L_0x0147:
            r0 = move-exception
            r7 = 0
            r16 = 0
        L_0x014b:
            p098g9.C4847a.m12168a(r7)     // Catch:{ all -> 0x0133 }
            p098g9.C4847a.m12168a(r16)     // Catch:{ all -> 0x0133 }
            throw r0     // Catch:{ all -> 0x0133 }
        L_0x0152:
            r2 = 0
        L_0x0153:
            r11 = 0
        L_0x0154:
            p098g9.C4847a.m12168a(r2)     // Catch:{ all -> 0x0133 }
            p098g9.C4847a.m12168a(r11)     // Catch:{ all -> 0x0133 }
            goto L_0x015c
        L_0x015b:
        L_0x015c:
            r2 = r8
            r4 = 0
            r5 = 1
            goto L_0x00d6
        L_0x0161:
            java.lang.String r2 = "FATAL! Couldn't extract the library from the APK!"
            g9.d r4 = r1.f16281d     // Catch:{ all -> 0x0133 }
            if (r4 == 0) goto L_0x016a
            r4.log(r2)     // Catch:{ all -> 0x0133 }
        L_0x016a:
            java.util.zip.ZipFile r2 = r10.f16275a     // Catch:{ IOException -> 0x0171 }
            if (r2 == 0) goto L_0x0171
        L_0x016e:
            r2.close()     // Catch:{ IOException -> 0x0171 }
        L_0x0171:
            g9.c r2 = r1.f16279b
            java.lang.String r0 = r0.getAbsolutePath()
            g9.g r2 = (p098g9.C4854g) r2
            r2.getClass()
            java.lang.System.load(r0)
            java.util.HashSet r0 = r1.f16278a
            r0.add(r3)
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r2 = 0
            r0[r2] = r3
            r2 = 1
            r0[r2] = r22
            java.lang.String r2 = "%s (%s) was re-linked!"
            r1.mo20339c(r2, r0)
            return
        L_0x0192:
            java.lang.String[] r0 = p098g9.C4847a.m12170c(r2, r9)     // Catch:{ Exception -> 0x0197 }
            goto L_0x01a3
        L_0x0197:
            r0 = move-exception
            r2 = r0
            r3 = 1
            java.lang.String[] r0 = new java.lang.String[r3]     // Catch:{ all -> 0x0133 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0133 }
            r3 = 0
            r0[r3] = r2     // Catch:{ all -> 0x0133 }
        L_0x01a3:
            com.getkeepsafe.relinker.MissingLibraryException r2 = new com.getkeepsafe.relinker.MissingLibraryException     // Catch:{ all -> 0x0133 }
            r2.<init>(r9, r8, r0)     // Catch:{ all -> 0x0133 }
            throw r2     // Catch:{ all -> 0x0133 }
        L_0x01a9:
            r7 = r10
            goto L_0x01ad
        L_0x01ab:
            r0 = move-exception
            r7 = 0
        L_0x01ad:
            if (r7 == 0) goto L_0x01b6
            java.util.zip.ZipFile r2 = r7.f16275a     // Catch:{ IOException -> 0x01b6 }
            if (r2 == 0) goto L_0x01b6
            r2.close()     // Catch:{ IOException -> 0x01b6 }
        L_0x01b6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p098g9.C4853f.mo20338b(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* renamed from: c */
    public final void mo20339c(String str, Object... objArr) {
        String format = String.format(Locale.US, str, objArr);
        C4851d dVar = this.f16281d;
        if (dVar != null) {
            dVar.log(format);
        }
    }
}
