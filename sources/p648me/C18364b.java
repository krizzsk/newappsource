package p648me;

import com.google.firebase.crashlytics.internal.settings.C14454a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import p223q8.C6214c;
import p236r8.C6266c;
import p304x.C7072l1;
import p358af.C13437d;
import p577je.C17798k;
import p601ke.C18028a;
import p696oe.C18736f;
import p837ue.C19895d;

/* renamed from: me.b */
public final class C18364b {

    /* renamed from: d */
    public static final Charset f46812d = Charset.forName("UTF-8");

    /* renamed from: e */
    public static final int f46813e = 15;

    /* renamed from: f */
    public static final C18028a f46814f = new C18028a();

    /* renamed from: g */
    public static final C6266c f46815g = new C6266c(2);

    /* renamed from: h */
    public static final C18363a f46816h = new C18363a();

    /* renamed from: a */
    public final AtomicInteger f46817a = new AtomicInteger(0);

    /* renamed from: b */
    public final C18365c f46818b;

    /* renamed from: c */
    public final C18736f f46819c;

    public C18364b(C18365c cVar, C14454a aVar) {
        this.f46818b = cVar;
        this.f46819c = aVar;
    }

    /* renamed from: a */
    public static void m45212a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    /* renamed from: d */
    public static String m45213d(File file) throws IOException {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), f46812d);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    /* renamed from: e */
    public static void m45214e(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), f46812d);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* renamed from: b */
    public final ArrayList mo50828b() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(C18365c.m45219d(this.f46818b.f46824e.listFiles()));
        arrayList.addAll(C18365c.m45219d(this.f46818b.f46825f.listFiles()));
        C6266c cVar = f46815g;
        Collections.sort(arrayList, cVar);
        List d = C18365c.m45219d(this.f46818b.f46823d.listFiles());
        Collections.sort(d, cVar);
        arrayList.addAll(d);
        return arrayList;
    }

    /* renamed from: c */
    public final void mo50829c(C17798k kVar, String str, boolean z) {
        String str2;
        int i = ((C14454a) this.f46819c).f36510h.get().f47639a.f47647a;
        f46814f.getClass();
        C19895d dVar = C18028a.f46139a;
        dVar.getClass();
        StringWriter stringWriter = new StringWriter();
        try {
            dVar.mo52175a(stringWriter, kVar);
        } catch (IOException unused) {
        }
        String stringWriter2 = stringWriter.toString();
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(this.f46817a.getAndIncrement())});
        if (z) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            m45214e(this.f46818b.mo50830a(str, C13437d.m33706k("event", format, str2)), stringWriter2);
        } catch (IOException unused2) {
        }
        C18365c cVar = this.f46818b;
        C6214c cVar2 = new C6214c(1);
        cVar.getClass();
        File file = new File(cVar.f46822c, str);
        file.mkdirs();
        List<File> d = C18365c.m45219d(file.listFiles(cVar2));
        Collections.sort(d, new C7072l1(3));
        int size = d.size();
        for (File file2 : d) {
            if (size > i) {
                C18365c.m45218c(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
