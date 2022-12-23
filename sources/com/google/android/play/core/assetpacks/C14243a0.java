package com.google.android.play.core.assetpacks;

import android.content.Context;
import androidx.appcompat.app.C0262r;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.play.core.assetpacks.a0 */
public final class C14243a0 {

    /* renamed from: c */
    public static final C0262r f35789c = new C0262r("AssetPackStorage");

    /* renamed from: a */
    public final Context f35790a;

    /* renamed from: b */
    public final C14253c2 f35791b;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        timeUnit.toMillis(14);
        timeUnit.toMillis(28);
    }

    public C14243a0(Context context, C14253c2 c2Var) {
        this.f35790a = context;
        this.f35791b = c2Var;
    }

    /* renamed from: b */
    public static long m35457b(File file, boolean z) {
        if (!file.exists()) {
            return -1;
        }
        ArrayList arrayList = new ArrayList();
        if (z && file.listFiles().length > 1) {
            f35789c.mo978e("Multiple pack versions found, using highest version code.", new Object[0]);
        }
        try {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals("stale.tmp")) {
                    arrayList.add(Long.valueOf(file2.getName()));
                }
            }
        } catch (NumberFormatException e) {
            f35789c.mo976c("Corrupt asset pack directories.", e, new Object[0]);
        }
        if (arrayList.isEmpty()) {
            return -1;
        }
        Collections.sort(arrayList);
        return ((Long) arrayList.get(arrayList.size() - 1)).longValue();
    }

    /* renamed from: f */
    public static void m35458f(File file) {
        if (file.listFiles() != null && file.listFiles().length > 1) {
            long b = m35457b(file, false);
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(b)) && !file2.getName().equals("stale.tmp")) {
                    m35459g(file2);
                }
            }
        }
    }

    /* renamed from: g */
    public static boolean m35459g(File file) {
        File[] listFiles = file.listFiles();
        boolean z = true;
        if (listFiles != null) {
            for (File g : listFiles) {
                z &= m35459g(g);
            }
        }
        if (!file.delete()) {
            return false;
        }
        return z;
    }

    /* renamed from: a */
    public final void mo42787a(int i, long j, String str) {
        File file = new File(mo42789d(), str);
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                if (!file2.getName().equals(String.valueOf(i)) && !file2.getName().equals("stale.tmp")) {
                    m35459g(file2);
                } else if (file2.getName().equals(String.valueOf(i))) {
                    for (File file3 : file2.listFiles()) {
                        if (!file3.getName().equals(String.valueOf(j))) {
                            m35459g(file3);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final File mo42788c(int i, long j, String str) {
        return new File(new File(new File(new File(mo42789d(), "_tmp"), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: d */
    public final File mo42789d() {
        return new File(this.f35790a.getFilesDir(), "assetpacks");
    }

    /* renamed from: e */
    public final ArrayList mo42790e() {
        ArrayList arrayList = new ArrayList();
        try {
            if (mo42789d().exists()) {
                if (mo42789d().listFiles() != null) {
                    for (File file : mo42789d().listFiles()) {
                        if (!file.getCanonicalPath().equals(new File(mo42789d(), "_tmp").getCanonicalPath())) {
                            arrayList.add(file);
                        }
                    }
                    return arrayList;
                }
            }
            return arrayList;
        } catch (IOException e) {
            f35789c.mo975b("Could not process directory while scanning installed packs. %s", e);
        }
    }

    /* renamed from: h */
    public final int mo42791h(int i, long j, String str) throws IOException {
        File file = new File(new File(mo42788c(i, j, str), "_packs"), "merge.tmp");
        if (!file.exists()) {
            return 0;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("numberOfMerges") != null) {
                try {
                    return Integer.parseInt(properties.getProperty("numberOfMerges"));
                } catch (NumberFormatException e) {
                    throw new zzck("Merge checkpoint file corrupt.", (Exception) e);
                }
            } else {
                throw new zzck("Merge checkpoint file corrupt.");
            }
        } catch (Throwable unused) {
        }
        throw th;
    }

    /* renamed from: i */
    public final long mo42792i(String str) {
        return m35457b(new File(new File(mo42789d(), str), String.valueOf((int) m35457b(new File(mo42789d(), str), true))), true);
    }

    /* renamed from: j */
    public final File mo42793j(int i, long j, String str) {
        return new File(new File(new File(mo42789d(), str), String.valueOf(i)), String.valueOf(j));
    }

    /* renamed from: k */
    public final File mo42794k(long j, String str, String str2, int i) {
        return new File(new File(new File(mo42788c(i, j, str), "_slices"), "_unverified"), str2);
    }

    /* renamed from: l */
    public final File mo42795l(long j, String str, String str2, int i) {
        return new File(new File(new File(mo42788c(i, j, str), "_slices"), "_verified"), str2);
    }

    /* renamed from: m */
    public final String mo42796m(String str) throws IOException {
        int length;
        File file = new File(mo42789d(), str);
        if (!file.exists()) {
            f35789c.mo974a("Pack not found with pack name: %s", str);
            return null;
        }
        File file2 = new File(file, String.valueOf(this.f35791b.mo42806a()));
        if (!file2.exists()) {
            f35789c.mo974a("Pack not found with pack name: %s app version: %s", str, Integer.valueOf(this.f35791b.mo42806a()));
            return null;
        }
        File[] listFiles = file2.listFiles();
        if (listFiles == null || (length = listFiles.length) == 0) {
            f35789c.mo974a("No pack version found for pack name: %s app version: %s", str, Integer.valueOf(this.f35791b.mo42806a()));
            return null;
        } else if (length <= 1) {
            return listFiles[0].getCanonicalPath();
        } else {
            f35789c.mo975b("Multiple pack versions found for pack name: %s app version: %s", str, Integer.valueOf(this.f35791b.mo42806a()));
            return null;
        }
    }

    /* renamed from: n */
    public final HashMap mo42797n() {
        HashMap hashMap = new HashMap();
        Iterator it = mo42790e().iterator();
        while (it.hasNext()) {
            String name = ((File) it.next()).getName();
            int b = (int) m35457b(new File(mo42789d(), name), true);
            long b2 = m35457b(new File(new File(mo42789d(), name), String.valueOf(b)), true);
            if (mo42793j(b, b2, name).exists()) {
                hashMap.put(name, Long.valueOf(b2));
            }
        }
        return hashMap;
    }
}
