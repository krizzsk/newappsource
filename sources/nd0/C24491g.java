package nd0;

import java.io.File;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.UUID;
import nd0.C24486e;

/* renamed from: nd0.g */
public final class C24491g extends C24480a {

    /* renamed from: g */
    public static final /* synthetic */ int f61997g = 0;

    /* renamed from: d */
    public C24486e.C24489c f61998d;

    /* renamed from: e */
    public File f61999e;

    /* renamed from: f */
    public int f62000f = 100;

    /* renamed from: nd0.g$a */
    public class C24492a implements FilenameFilter {
        public C24492a() {
        }

        public final boolean accept(File file, String str) {
            return !str.endsWith(C24491g.this.f61957c);
        }
    }

    public C24491g(File file) {
        super(file);
        if (this.f61955a != null) {
            this.f61999e = mo60741f();
        }
    }

    /* renamed from: f */
    public final File mo60741f() {
        File file = this.f61955a;
        File file2 = null;
        if (file == null || !file.exists()) {
            return null;
        }
        File[] listFiles = this.f61955a.listFiles(new C24492a());
        if (listFiles == null || listFiles.length == 0) {
            return C24480a.m61581b(this.f61955a, this.f61956b + System.currentTimeMillis() + UUID.randomUUID().toString(), false);
        }
        Arrays.sort(listFiles, new C24483b());
        File file3 = listFiles[0];
        int d = C24480a.m61582d(file3);
        if (d <= 0 || d < this.f62000f) {
            return file3;
        }
        try {
            if (mo60730e(file3, file3.getName() + this.f61957c)) {
                file2 = mo60741f();
            }
        } catch (Exception unused) {
        }
        if (file2 == null) {
            return file3;
        }
        return file2;
    }

    /* renamed from: g */
    public final void mo60742g(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (this.f61955a != null) {
            C24485d dVar = new C24485d(str, str2, str3, str4, str5, TimeZone.getDefault().getID(), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(new Date(System.currentTimeMillis())), str6, str7, str8);
            StringBuilder k = C13555b.m33972k("crash_");
            k.append(System.currentTimeMillis());
            File b = C24480a.m61581b(this.f61955a, k.toString(), false);
            if (b != null) {
                C24480a.m61580a(b, dVar.mo60736b(), new C24493h(this, b));
            }
        }
    }
}
