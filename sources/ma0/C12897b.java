package ma0;

import c00.C13738r;
import ce0.C21100e;
import com.moovit.commons.utils.DataUnit;
import com.nutiteq.NutiteqBugException;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p435de.C16596f;
import p693nz.C18648a;
import p693nz.C18650b;
import p977zz.C20932c0;

/* renamed from: ma0.b */
public final class C12897b {

    /* renamed from: e */
    public static volatile C12897b f31913e;

    /* renamed from: a */
    public final File f31914a;

    /* renamed from: b */
    public final C13738r<C18650b<Long>> f31915b = new C13738r<>();

    /* renamed from: c */
    public final ExecutorService f31916c = Executors.newSingleThreadExecutor(C20932c0.m49025a("nutiteqDiskCacheQueue"));

    /* renamed from: d */
    public volatile int f31917d = 0;

    /* renamed from: ma0.b$a */
    public static class C12898a extends C12899b<Boolean> {

        /* renamed from: e */
        public final long f31918e;

        /* renamed from: f */
        public final C18648a f31919f;

        public C12898a(C13738r<C18650b<Long>> rVar, File file, int i, long j, C18648a aVar) {
            super(rVar, file, i);
            this.f31918e = j;
            this.f31919f = aVar;
        }

        /* renamed from: a */
        public final Object mo39761a(C18650b bVar) {
            return Boolean.valueOf(bVar.put(Long.valueOf(this.f31918e), this.f31919f));
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("AddOperation, tileId=");
            k.append(this.f31918e);
            k.append(", size=");
            k.append(DataUnit.formatSize((long) this.f31919f.f47516a.length));
            return k.toString();
        }
    }

    /* renamed from: ma0.b$b */
    public static abstract class C12899b<T> implements Callable<T> {

        /* renamed from: b */
        public final C13738r<C18650b<Long>> f31920b;

        /* renamed from: c */
        public final File f31921c;

        /* renamed from: d */
        public final int f31922d;

        public C12899b(C13738r<C18650b<Long>> rVar, File file, int i) {
            C21100e.m49373x(rVar, "cacheRef");
            this.f31920b = rVar;
            C21100e.m49373x(file, "directory");
            this.f31921c = file;
            this.f31922d = i;
        }

        /* renamed from: a */
        public abstract T mo39761a(C18650b<Long> bVar);

        /* renamed from: b */
        public final C18650b<Long> mo39763b() throws Exception {
            int i;
            C18650b<Long> bVar = (C18650b) this.f31920b.f33812a;
            if (bVar == null && (i = this.f31922d) > 0) {
                T bVar2 = new C18650b(this.f31921c, (long) i, false);
                bVar2.mo51042l();
                this.f31920b.f33812a = bVar2;
                return bVar2;
            } else if (bVar != null && this.f31922d <= 0) {
                try {
                    bVar.mo51040e();
                } catch (IOException unused) {
                }
                this.f31920b.f33812a = null;
                return null;
            } else if (bVar == null) {
                return bVar;
            } else {
                long j = bVar.f47528i;
                long j2 = (long) this.f31922d;
                if (j == j2) {
                    return bVar;
                }
                if (j != j2) {
                    C21100e.m49367u(j2, "maxSize");
                    bVar.f47528i = j2;
                    if (bVar.f47527h) {
                        bVar.mo39751o(j2);
                    }
                }
                try {
                    bVar.mo51040e();
                    return bVar;
                } catch (IOException unused2) {
                    return bVar;
                }
            }
        }

        public final T call() throws Exception {
            try {
                toString();
                C18650b<Long> b = mo39763b();
                if (b != null) {
                    return mo39761a(b);
                }
                return null;
            } catch (Throwable th) {
                toString();
                C16596f a = C16596f.m42113a();
                StringBuilder k = C13555b.m33972k("Failed to perform: ");
                k.append(toString());
                a.mo49364c(new NutiteqBugException(k.toString(), th));
                return null;
            }
        }
    }

    /* renamed from: ma0.b$c */
    public static class C12900c extends C12899b<Boolean> {
        public C12900c(C13738r<C18650b<Long>> rVar, File file, int i) {
            super(rVar, file, i);
        }

        /* renamed from: a */
        public final Object mo39761a(C18650b bVar) {
            boolean z;
            DataUnit.formatSize(bVar.f47529j);
            try {
                bVar.mo51040e();
                z = true;
            } catch (IOException unused) {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        public final String toString() {
            return "CommitOperation";
        }
    }

    /* renamed from: ma0.b$d */
    public static class C12901d extends C12899b<C18648a> {

        /* renamed from: e */
        public final long f31923e;

        public C12901d(C13738r<C18650b<Long>> rVar, File file, int i, long j) {
            super(rVar, file, i);
            this.f31923e = j;
        }

        /* renamed from: a */
        public final Object mo39761a(C18650b bVar) {
            return (C18648a) bVar.get(Long.valueOf(this.f31923e));
        }

        public final String toString() {
            StringBuilder k = C13555b.m33972k("GetOperation, tileId=");
            k.append(this.f31923e);
            return k.toString();
        }
    }

    public C12897b(File file) {
        this.f31914a = file;
    }
}
