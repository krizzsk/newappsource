package p092g3;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.HashMap;
import p081f3.C4656h;

/* renamed from: g3.j */
public final class C4762j {

    /* renamed from: a */
    public static final String[] f16066a = {"-journal", "-shm", "-wal"};

    static {
        C4656h.m11961e("WrkDbPathHelper");
    }

    /* renamed from: a */
    public static void m12078a(Context context) {
        File file;
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        int i = Build.VERSION.SDK_INT;
        if (i >= 23 && databasePath.exists()) {
            C4656h.m11960c().mo20176a(new Throwable[0]);
            HashMap hashMap = new HashMap();
            if (i >= 23) {
                File databasePath2 = context.getDatabasePath("androidx.work.workdb");
                if (i < 23) {
                    file = context.getDatabasePath("androidx.work.workdb");
                } else {
                    file = new File(context.getNoBackupFilesDir(), "androidx.work.workdb");
                }
                hashMap.put(databasePath2, file);
                for (String str : f16066a) {
                    hashMap.put(new File(databasePath2.getPath() + str), new File(file.getPath() + str));
                }
            }
            for (File file2 : hashMap.keySet()) {
                File file3 = (File) hashMap.get(file2);
                if (file2.exists() && file3 != null) {
                    if (file3.exists()) {
                        String.format("Over-writing contents of %s", new Object[]{file3});
                        C4656h.m11960c().mo20179f(new Throwable[0]);
                    }
                    if (file2.renameTo(file3)) {
                        String.format("Migrated %s to %s", new Object[]{file2, file3});
                    } else {
                        String.format("Renaming %s to %s failed", new Object[]{file2, file3});
                    }
                    C4656h.m11960c().mo20176a(new Throwable[0]);
                }
            }
        }
    }
}
