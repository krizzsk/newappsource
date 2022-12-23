package p506gd;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.regex.Pattern;

/* renamed from: gd.m */
public final class C17182m {

    /* renamed from: b */
    public static final Pattern f44427b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a */
    public final C17174e f44428a;

    public C17182m(C17174e eVar) throws IOException {
        this.f44428a = eVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e1 A[SYNTHETIC, Splitter:B:31:0x00e1] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m43172b(p506gd.C17184o r12, p506gd.C17179j r13) throws java.io.IOException {
        /*
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x00dd }
            java.io.File r1 = r12.mo49755a()     // Catch:{ IOException -> 0x00dd }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00dd }
            java.lang.String r12 = r12.mo49756b()     // Catch:{ IOException -> 0x00db }
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r1.<init>()     // Catch:{ IOException -> 0x00db }
            java.util.Enumeration r2 = r0.entries()     // Catch:{ IOException -> 0x00db }
        L_0x0016:
            boolean r3 = r2.hasMoreElements()     // Catch:{ IOException -> 0x00db }
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L_0x0064
            java.lang.Object r3 = r2.nextElement()     // Catch:{ IOException -> 0x00db }
            java.util.zip.ZipEntry r3 = (java.util.zip.ZipEntry) r3     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r3.getName()     // Catch:{ IOException -> 0x00db }
            java.util.regex.Pattern r8 = f44427b     // Catch:{ IOException -> 0x00db }
            java.util.regex.Matcher r7 = r8.matcher(r7)     // Catch:{ IOException -> 0x00db }
            boolean r8 = r7.matches()     // Catch:{ IOException -> 0x00db }
            if (r8 == 0) goto L_0x0016
            java.lang.String r8 = r7.group(r5)     // Catch:{ IOException -> 0x00db }
            java.lang.String r7 = r7.group(r4)     // Catch:{ IOException -> 0x00db }
            r9 = 3
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ IOException -> 0x00db }
            r9[r6] = r12     // Catch:{ IOException -> 0x00db }
            r9[r5] = r7     // Catch:{ IOException -> 0x00db }
            r9[r4] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r4 = "NativeLibraryExtractor: split '%s' has native library '%s' for ABI '%s'"
            java.lang.String.format(r4, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r4 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ IOException -> 0x00db }
            if (r4 != 0) goto L_0x005b
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            r4.<init>()     // Catch:{ IOException -> 0x00db }
            r1.put(r8, r4)     // Catch:{ IOException -> 0x00db }
        L_0x005b:
            gd.l r5 = new gd.l     // Catch:{ IOException -> 0x00db }
            r5.<init>(r3, r7)     // Catch:{ IOException -> 0x00db }
            r4.add(r5)     // Catch:{ IOException -> 0x00db }
            goto L_0x0016
        L_0x0064:
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ IOException -> 0x00db }
            r12.<init>()     // Catch:{ IOException -> 0x00db }
            java.lang.String[] r2 = android.os.Build.SUPPORTED_ABIS     // Catch:{ IOException -> 0x00db }
            int r3 = r2.length     // Catch:{ IOException -> 0x00db }
            r7 = 0
        L_0x006d:
            if (r7 >= r3) goto L_0x00cb
            r8 = r2[r7]     // Catch:{ IOException -> 0x00db }
            boolean r9 = r1.containsKey(r8)     // Catch:{ IOException -> 0x00db }
            if (r9 == 0) goto L_0x00bf
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x00db }
            r9[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: there are native libraries for supported ABI %s; will use this ABI"
            java.lang.String.format(r10, r9)     // Catch:{ IOException -> 0x00db }
            java.lang.Object r9 = r1.get(r8)     // Catch:{ IOException -> 0x00db }
            java.util.Set r9 = (java.util.Set) r9     // Catch:{ IOException -> 0x00db }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ IOException -> 0x00db }
        L_0x008a:
            boolean r10 = r9.hasNext()     // Catch:{ IOException -> 0x00db }
            if (r10 == 0) goto L_0x00c8
            java.lang.Object r10 = r9.next()     // Catch:{ IOException -> 0x00db }
            gd.l r10 = (p506gd.C17181l) r10     // Catch:{ IOException -> 0x00db }
            java.lang.String r11 = r10.f44425a     // Catch:{ IOException -> 0x00db }
            boolean r11 = r12.containsKey(r11)     // Catch:{ IOException -> 0x00db }
            if (r11 == 0) goto L_0x00ac
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f44425a     // Catch:{ IOException -> 0x00db }
            r11[r6] = r10     // Catch:{ IOException -> 0x00db }
            r11[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: skipping library %s for ABI %s; already present for a better ABI"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00ac:
            java.lang.String r11 = r10.f44425a     // Catch:{ IOException -> 0x00db }
            r12.put(r11, r10)     // Catch:{ IOException -> 0x00db }
            java.lang.Object[] r11 = new java.lang.Object[r4]     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = r10.f44425a     // Catch:{ IOException -> 0x00db }
            r11[r6] = r10     // Catch:{ IOException -> 0x00db }
            r11[r5] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r10 = "NativeLibraryExtractor: using library %s for ABI %s"
            java.lang.String.format(r10, r11)     // Catch:{ IOException -> 0x00db }
            goto L_0x008a
        L_0x00bf:
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ IOException -> 0x00db }
            r9[r6] = r8     // Catch:{ IOException -> 0x00db }
            java.lang.String r8 = "NativeLibraryExtractor: there are no native libraries for supported ABI %s"
            java.lang.String.format(r8, r9)     // Catch:{ IOException -> 0x00db }
        L_0x00c8:
            int r7 = r7 + 1
            goto L_0x006d
        L_0x00cb:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ IOException -> 0x00db }
            java.util.Collection r12 = r12.values()     // Catch:{ IOException -> 0x00db }
            r1.<init>(r12)     // Catch:{ IOException -> 0x00db }
            r13.mo49766a(r0, r1)     // Catch:{ IOException -> 0x00db }
            r0.close()     // Catch:{ IOException -> 0x00db }
            return
        L_0x00db:
            r12 = move-exception
            goto L_0x00df
        L_0x00dd:
            r12 = move-exception
            r0 = 0
        L_0x00df:
            if (r0 == 0) goto L_0x00e4
            r0.close()     // Catch:{ IOException -> 0x00e4 }
        L_0x00e4:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p506gd.C17182m.m43172b(gd.o, gd.j):void");
    }

    /* renamed from: a */
    public final HashSet mo49767a() throws IOException {
        HashSet a = this.f44428a.mo49761a();
        C17174e eVar = this.f44428a;
        eVar.getClass();
        ArrayList arrayList = new ArrayList();
        File file = new File(eVar.mo49764g(), "native-libraries");
        C17174e.m43161e(file);
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = a.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C17184o) it2.next()).mo49756b().equals(str)) {
                        break;
                    }
                } else {
                    String.format("NativeLibraryExtractor: extracted split '%s' has no corresponding split; deleting", new Object[]{str});
                    C17174e eVar2 = this.f44428a;
                    eVar2.getClass();
                    File file3 = new File(eVar2.mo49764g(), "native-libraries");
                    C17174e.m43161e(file3);
                    File d = C17174e.m43160d(file3, str);
                    C17174e.m43161e(d);
                    C17174e.m43159c(d);
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = a.iterator();
        while (it3.hasNext()) {
            C17184o oVar = (C17184o) it3.next();
            HashSet hashSet2 = new HashSet();
            m43172b(oVar, new C17177h(this, hashSet2, oVar));
            C17174e eVar3 = this.f44428a;
            String b = oVar.mo49756b();
            eVar3.getClass();
            HashSet hashSet3 = new HashSet();
            File file4 = new File(eVar3.mo49764g(), "native-libraries");
            C17174e.m43161e(file4);
            File d2 = C17174e.m43160d(file4, b);
            C17174e.m43161e(d2);
            File[] listFiles2 = d2.listFiles();
            if (listFiles2 != null) {
                for (File file5 : listFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    String.format("NativeLibraryExtractor: file '%s' found in split '%s' that is not in the split file '%s'; removing", new Object[]{file6.getAbsolutePath(), oVar.mo49756b(), oVar.mo49755a().getAbsolutePath()});
                    C17174e eVar4 = this.f44428a;
                    eVar4.getClass();
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(eVar4.mo49764g(), "native-libraries");
                    C17174e.m43161e(file7);
                    if (parentFile.equals(file7)) {
                        C17174e.m43159c(file6);
                    } else {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    /* renamed from: c */
    public final void mo49768c(C17184o oVar, HashSet hashSet, C17180k kVar) throws IOException {
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C17181l lVar = (C17181l) it.next();
            C17174e eVar = this.f44428a;
            String b = oVar.mo49756b();
            String str = lVar.f44425a;
            eVar.getClass();
            File file = new File(eVar.mo49764g(), "native-libraries");
            C17174e.m43161e(file);
            File d = C17174e.m43160d(file, b);
            C17174e.m43161e(d);
            File d2 = C17174e.m43160d(d, str);
            boolean z = true;
            if (!d2.exists() || d2.length() != lVar.f44426b.getSize() || !(!d2.canWrite())) {
                z = false;
            }
            kVar.mo49765a(lVar, d2, z);
        }
    }
}
