package p506gd;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* renamed from: gd.e */
public final class C17174e {

    /* renamed from: a */
    public final long f44411a;

    /* renamed from: b */
    public final Context f44412b;

    /* renamed from: c */
    public File f44413c;

    public C17174e(Context context) throws PackageManager.NameNotFoundException {
        this.f44412b = context;
        this.f44411a = (long) context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    /* renamed from: c */
    public static void m43159c(File file) throws IOException {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File c : listFiles) {
                m43159c(c);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(String.format("Failed to delete '%s'", new Object[]{file.getAbsolutePath()}));
        }
    }

    /* renamed from: d */
    public static File m43160d(File file, String str) throws IOException {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    /* renamed from: e */
    public static void m43161e(File file) throws IOException {
        String str;
        if (!file.exists()) {
            file.mkdirs();
            if (!file.isDirectory()) {
                String valueOf = String.valueOf(file.getAbsolutePath());
                if (valueOf.length() != 0) {
                    str = "Unable to create directory: ".concat(valueOf);
                } else {
                    str = new String("Unable to create directory: ");
                }
                throw new IOException(str);
            }
        } else if (!file.isDirectory()) {
            throw new IllegalArgumentException("File input must be directory when it exists.");
        }
    }

    /* renamed from: a */
    public final HashSet mo49761a() throws IOException {
        File file = new File(mo49764g(), "verified-splits");
        m43161e(file);
        HashSet hashSet = new HashSet();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && (!file2.canWrite())) {
                    String name = file2.getName();
                    hashSet.add(new C17172c(file2, name.substring(0, name.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    /* renamed from: b */
    public final void mo49762b() throws IOException {
        File f = mo49763f();
        String[] list = f.list();
        if (list != null) {
            for (String str : list) {
                if (!str.equals(Long.toString(this.f44411a))) {
                    File file = new File(f, str);
                    new StringBuilder(file.toString().length() + 118);
                    m43159c(file);
                }
            }
        }
    }

    /* renamed from: f */
    public final File mo49763f() throws IOException {
        if (this.f44413c == null) {
            Context context = this.f44412b;
            if (context != null) {
                this.f44413c = context.getFilesDir();
            } else {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
        }
        File file = new File(this.f44413c, "splitcompat");
        m43161e(file);
        return file;
    }

    /* renamed from: g */
    public final File mo49764g() throws IOException {
        File file = new File(mo49763f(), Long.toString(this.f44411a));
        m43161e(file);
        return file;
    }
}
