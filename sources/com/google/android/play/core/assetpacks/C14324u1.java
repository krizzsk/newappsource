package com.google.android.play.core.assetpacks;

import androidx.appcompat.app.C0262r;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: com.google.android.play.core.assetpacks.u1 */
public final class C14324u1 {

    /* renamed from: b */
    public static final C0262r f36072b = new C0262r("MergeSliceTaskHandler");

    /* renamed from: a */
    public final C14243a0 f36073a;

    public C14324u1(C14243a0 a0Var) {
        this.f36073a = a0Var;
    }

    /* renamed from: b */
    public static void m35604b(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                m35604b(file3, new File(file2, file3.getName()));
            }
            if (!file.delete()) {
                throw new zzck("Unable to delete directory: ".concat(String.valueOf(file)));
            }
        } else if (file2.exists()) {
            throw new zzck("File clashing with existing file from other slice: ".concat(file2.toString()));
        } else if (!file.renameTo(file2)) {
            throw new zzck("Unable to move file: ".concat(String.valueOf(file)));
        }
    }

    /* renamed from: a */
    public final void mo42899a(C14320t1 t1Var) {
        File l = this.f36073a.mo42795l(t1Var.f36055d, t1Var.f35934b, t1Var.f36056e, t1Var.f36054c);
        if (l.exists()) {
            C14243a0 a0Var = this.f36073a;
            String str = t1Var.f35934b;
            int i = t1Var.f36054c;
            long j = t1Var.f36055d;
            a0Var.getClass();
            File file = new File(a0Var.mo42788c(i, j, str), "_packs");
            if (!file.exists()) {
                file.mkdirs();
            }
            m35604b(l, file);
            try {
                int h = this.f36073a.mo42791h(t1Var.f36054c, t1Var.f36055d, t1Var.f35934b);
                C14243a0 a0Var2 = this.f36073a;
                String str2 = t1Var.f35934b;
                int i2 = t1Var.f36054c;
                long j2 = t1Var.f36055d;
                a0Var2.getClass();
                File file2 = new File(new File(a0Var2.mo42788c(i2, j2, str2), "_packs"), "merge.tmp");
                Properties properties = new Properties();
                properties.put("numberOfMerges", String.valueOf(h + 1));
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
            } catch (IOException e) {
                f36072b.mo975b("Writing merge checkpoint failed with %s.", e.getMessage());
                throw new zzck("Writing merge checkpoint failed.", e, t1Var.f35933a);
            }
        } else {
            throw new zzck(String.format("Cannot find verified files for slice %s.", new Object[]{t1Var.f36056e}), t1Var.f35933a);
        }
    }
}
