package p741pz;

import android.content.Context;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import p304x.C7072l1;
import p669mz.C18482c;
import p786rz.C19387a;
import p810sz.C19578d;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19610m;
import p977zz.C20964s0;

/* renamed from: pz.c */
public class C19044c<T> extends C19046e<T> {

    /* renamed from: f */
    public static final C7072l1 f48433f = new C7072l1(6);

    /* renamed from: g */
    public static final Pattern f48434g = Pattern.compile("^[a-z][a-z0-9_]*$");

    /* renamed from: e */
    public final String f48435e;

    public C19044c(Context context, C19589j jVar, C19600l lVar, String str) {
        super(context, lVar, jVar);
        Pattern pattern = f48434g;
        if (pattern.matcher(str).matches()) {
            this.f48435e = str;
            return;
        }
        StringBuilder k = C13555b.m33972k("Store name must adhere to: ");
        k.append(pattern.pattern());
        throw new IllegalArgumentException(k.toString());
    }

    /* renamed from: c */
    public final boolean mo51500c() {
        BufferedOutputStream bufferedOutputStream;
        mo51499b();
        File g = mo23800g(this.f48435e);
        if (!g.isDirectory() && !g.mkdirs()) {
            g.getAbsolutePath();
            g = null;
        }
        C19387a.m46674f(g);
        mo51499b();
        C18482c<T> cVar = this.f48432b;
        boolean z = true;
        for (int i = 0; i < cVar.size(); i++) {
            Object[] objArr = {Integer.valueOf(i)};
            String str = C20964s0.f52718a;
            File file = new File(g, String.format((Locale) null, "%10d", objArr));
            try {
                T t = cVar.get(i);
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                this.f48439c.write(t, new C19610m(bufferedOutputStream));
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (IOException unused) {
                file.getAbsolutePath();
                z = false;
            } catch (Throwable th) {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                throw th;
            }
        }
        return z;
    }

    /* renamed from: d */
    public final boolean mo51501d() {
        if (!mo51502e()) {
            ArrayList arrayList = new ArrayList();
            try {
                File g = mo23800g(this.f48435e);
                if (!g.isDirectory() && !g.mkdirs()) {
                    g.getAbsolutePath();
                    g = null;
                }
                if (g == null) {
                    return false;
                }
                File[] listFiles = g.listFiles();
                Arrays.sort(listFiles, f48433f);
                arrayList.ensureCapacity(listFiles.length);
                for (File h : listFiles) {
                    arrayList.add(mo51504h(h));
                }
                mo51503f(arrayList);
                return true;
            } catch (IOException unused) {
                return false;
            } finally {
                mo51503f(arrayList);
            }
        } else {
            throw new IllegalStateException("Store already initialized");
        }
    }

    /* renamed from: g */
    public File mo23800g(String str) {
        throw null;
    }

    /* renamed from: h */
    public final T mo51504h(File file) throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        try {
            return this.f48440d.read(new C19578d(bufferedInputStream));
        } finally {
            bufferedInputStream.close();
        }
    }
}
