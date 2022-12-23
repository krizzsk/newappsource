package td0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Environment;
import android.os.FileObserver;
import android.os.StatFs;
import android.util.Log;
import ce0.C21100e;
import ce0.C21105j;
import com.vungle.warren.VungleLogger;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: td0.a */
public final class C24927a {

    /* renamed from: a */
    public final Context f63007a;

    /* renamed from: b */
    public final C24933d f63008b;

    /* renamed from: c */
    public final HashSet f63009c = new HashSet();

    /* renamed from: d */
    public File f63010d;

    /* renamed from: e */
    public final ArrayList f63011e = new ArrayList();

    /* renamed from: f */
    public boolean f63012f;

    /* renamed from: g */
    public final ArrayList f63013g = new ArrayList();

    /* renamed from: td0.a$a */
    public class C24928a extends FileObserver {
        public C24928a(String str) {
            super(str, 1024);
        }

        public final void onEvent(int i, String str) {
            stopWatching();
            C24927a.this.mo61485e();
        }
    }

    /* renamed from: td0.a$b */
    public class C24929b extends FileObserver {

        /* renamed from: a */
        public final /* synthetic */ String f63015a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C24929b(String str, String str2) {
            super(str, 256);
            this.f63015a = str2;
        }

        public final void onEvent(int i, String str) {
            stopWatching();
            if (this.f63015a.equals(str)) {
                C24927a.this.mo61485e();
            }
        }
    }

    /* renamed from: td0.a$c */
    public interface C24930c {
        /* renamed from: b */
        void mo58065b();
    }

    public C24927a(Context context, C24933d dVar) {
        this.f63007a = context;
        this.f63008b = dVar;
        dVar.f63021e.addAll(Arrays.asList(new String[]{"cache_path", "cache_paths"}));
        dVar.mo61492a();
    }

    /* renamed from: a */
    public final void mo61481a() {
        File file = this.f63010d;
        if (file == null || !file.exists() || !this.f63010d.isDirectory() || !this.f63010d.canWrite()) {
            mo61485e();
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: b */
    public final long mo61482b(int i) {
        File c = mo61483c();
        if (c == null) {
            return -1;
        }
        StatFs statFs = null;
        try {
            statFs = new StatFs(c.getPath());
        } catch (IllegalArgumentException unused) {
            if (i > 0) {
                return mo61482b(i - 1);
            }
        }
        if (statFs == null) {
            return -1;
        }
        return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
    }

    /* renamed from: c */
    public final synchronized File mo61483c() {
        mo61481a();
        return this.f63010d;
    }

    /* renamed from: d */
    public final synchronized void mo61484d(File file) {
        if (file != null) {
            this.f63013g.clear();
            this.f63013g.add(new C24928a(file.getPath()));
            while (file.getParent() != null) {
                this.f63013g.add(new C24929b(file.getParent(), file.getName()));
                file = file.getParentFile();
            }
            Iterator it = this.f63013g.iterator();
            while (it.hasNext()) {
                try {
                    ((FileObserver) it.next()).startWatching();
                } catch (Exception e) {
                    VungleLogger.m57032e("ExceptionContext", Log.getStackTraceString(e));
                }
            }
        }
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public final synchronized void mo61485e() {
        boolean z;
        File file;
        boolean z2;
        boolean z3;
        File parentFile;
        File file2;
        Class<C21100e> cls = C21100e.class;
        synchronized (this) {
            File file3 = null;
            if (this.f63010d == null) {
                String c = this.f63008b.mo61494c("cache_path", (String) null);
                if (c != null) {
                    file2 = new File(c);
                } else {
                    file2 = null;
                }
                this.f63010d = file2;
            }
            File externalFilesDir = this.f63007a.getExternalFilesDir((String) null);
            File filesDir = this.f63007a.getFilesDir();
            if (!Environment.getExternalStorageState().equals("mounted") || externalFilesDir == null) {
                z = false;
            } else {
                z = true;
            }
            ArrayList arrayList = new ArrayList();
            if (z && (parentFile = externalFilesDir.getParentFile()) != null) {
                arrayList.add(new File(parentFile, "no_backup"));
            }
            arrayList.add(this.f63007a.getNoBackupFilesDir());
            if (z) {
                arrayList.add(externalFilesDir);
            }
            arrayList.add(filesDir);
            Iterator it = arrayList.iterator();
            boolean z4 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                File file4 = new File((File) it.next(), "vungle_cache");
                if (file4.exists() && file4.isFile()) {
                    C21105j.m49398c(file4);
                }
                if (!file4.exists()) {
                    z3 = file4.mkdirs();
                    z2 = z3;
                } else if (!file4.isDirectory() || !file4.canWrite()) {
                    z2 = z4;
                    z3 = false;
                } else {
                    z2 = z4;
                    z3 = true;
                }
                if (z3) {
                    z4 = z2;
                    file3 = file4;
                    break;
                }
                z4 = z2;
            }
            File cacheDir = this.f63007a.getCacheDir();
            C24933d dVar = this.f63008b;
            HashSet hashSet = new HashSet();
            Object obj = dVar.f63019c.get("cache_paths");
            if (obj instanceof HashSet) {
                HashSet hashSet2 = (HashSet) obj;
                synchronized (cls) {
                    hashSet = new HashSet(hashSet2);
                }
            }
            if (file3 != null) {
                String path = file3.getPath();
                synchronized (cls) {
                    hashSet.add(path);
                }
            }
            String path2 = cacheDir.getPath();
            synchronized (cls) {
                hashSet.add(path2);
            }
            C24933d dVar2 = this.f63008b;
            dVar2.mo61497f("cache_paths", hashSet);
            dVar2.mo61492a();
            this.f63011e.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                if (file3 == null || !file3.getPath().equals(str)) {
                    this.f63011e.add(new File(str));
                }
            }
            if (z4 || ((file3 != null && !file3.equals(this.f63010d)) || ((file = this.f63010d) != null && !file.equals(file3)))) {
                this.f63010d = file3;
                if (file3 != null) {
                    C24933d dVar3 = this.f63008b;
                    dVar3.mo61496e("cache_path", file3.getPath());
                    dVar3.mo61492a();
                }
                Iterator it3 = this.f63009c.iterator();
                while (it3.hasNext()) {
                    ((C24930c) it3.next()).mo58065b();
                }
                this.f63012f = true;
                Iterator it4 = this.f63011e.iterator();
                while (it4.hasNext()) {
                    File file5 = (File) it4.next();
                    if (!file5.equals(cacheDir)) {
                        try {
                            C21105j.m49397b(file5);
                        } catch (IOException unused) {
                            VungleLogger.m57029b("CacheManager", "Can't remove old cache:" + file5.getPath());
                        }
                    }
                }
            }
            mo61484d(externalFilesDir);
        }
    }
}
