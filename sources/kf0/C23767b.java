package kf0;

import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23814a;
import kotlin.p980io.FileWalkDirection;
import mf0.C24362h;
import th0.C25003h;

/* renamed from: kf0.b */
public final class C23767b implements C25003h<File> {

    /* renamed from: a */
    public final File f60038a;

    /* renamed from: b */
    public final FileWalkDirection f60039b;

    /* renamed from: c */
    public final int f60040c = Integer.MAX_VALUE;

    /* renamed from: kf0.b$a */
    public static abstract class C23768a extends C23774c {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C23768a(File file) {
            super(file);
            C24362h.m61211f(file, "rootDir");
        }
    }

    /* renamed from: kf0.b$b */
    public final class C23769b extends C23814a<File> {

        /* renamed from: d */
        public final ArrayDeque<C23774c> f60041d;

        /* renamed from: kf0.b$b$a */
        public final class C23770a extends C23768a {

            /* renamed from: b */
            public boolean f60043b;

            /* renamed from: c */
            public File[] f60044c;

            /* renamed from: d */
            public int f60045d;

            /* renamed from: e */
            public boolean f60046e;

            /* renamed from: f */
            public final /* synthetic */ C23769b f60047f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23770a(C23769b bVar, File file) {
                super(file);
                C24362h.m61211f(file, "rootDir");
                this.f60047f = bVar;
            }

            /* renamed from: a */
            public final File mo59007a() {
                if (!this.f60046e && this.f60044c == null) {
                    C23767b.this.getClass();
                    File[] listFiles = this.f60054a.listFiles();
                    this.f60044c = listFiles;
                    if (listFiles == null) {
                        C23767b.this.getClass();
                        this.f60046e = true;
                    }
                }
                File[] fileArr = this.f60044c;
                if (fileArr != null) {
                    int i = this.f60045d;
                    C24362h.m61208c(fileArr);
                    if (i < fileArr.length) {
                        File[] fileArr2 = this.f60044c;
                        C24362h.m61208c(fileArr2);
                        int i2 = this.f60045d;
                        this.f60045d = i2 + 1;
                        return fileArr2[i2];
                    }
                }
                if (!this.f60043b) {
                    this.f60043b = true;
                    return this.f60054a;
                }
                C23767b.this.getClass();
                return null;
            }
        }

        /* renamed from: kf0.b$b$b */
        public final class C23771b extends C23774c {

            /* renamed from: b */
            public boolean f60048b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23771b(File file) {
                super(file);
                C24362h.m61211f(file, "rootFile");
            }

            /* renamed from: a */
            public final File mo59007a() {
                if (this.f60048b) {
                    return null;
                }
                this.f60048b = true;
                return this.f60054a;
            }
        }

        /* renamed from: kf0.b$b$c */
        public final class C23772c extends C23768a {

            /* renamed from: b */
            public boolean f60049b;

            /* renamed from: c */
            public File[] f60050c;

            /* renamed from: d */
            public int f60051d;

            /* renamed from: e */
            public final /* synthetic */ C23769b f60052e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C23772c(C23769b bVar, File file) {
                super(file);
                C24362h.m61211f(file, "rootDir");
                this.f60052e = bVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
                if (r0.length == 0) goto L_0x0046;
             */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.io.File mo59007a() {
                /*
                    r3 = this;
                    boolean r0 = r3.f60049b
                    if (r0 != 0) goto L_0x0011
                    kf0.b$b r0 = r3.f60052e
                    kf0.b r0 = kf0.C23767b.this
                    r0.getClass()
                    r0 = 1
                    r3.f60049b = r0
                    java.io.File r0 = r3.f60054a
                    return r0
                L_0x0011:
                    java.io.File[] r0 = r3.f60050c
                    r1 = 0
                    if (r0 == 0) goto L_0x0027
                    int r2 = r3.f60051d
                    mf0.C24362h.m61208c(r0)
                    int r0 = r0.length
                    if (r2 >= r0) goto L_0x001f
                    goto L_0x0027
                L_0x001f:
                    kf0.b$b r0 = r3.f60052e
                    kf0.b r0 = kf0.C23767b.this
                    r0.getClass()
                    return r1
                L_0x0027:
                    java.io.File[] r0 = r3.f60050c
                    if (r0 != 0) goto L_0x004e
                    java.io.File r0 = r3.f60054a
                    java.io.File[] r0 = r0.listFiles()
                    r3.f60050c = r0
                    if (r0 != 0) goto L_0x003c
                    kf0.b$b r0 = r3.f60052e
                    kf0.b r0 = kf0.C23767b.this
                    r0.getClass()
                L_0x003c:
                    java.io.File[] r0 = r3.f60050c
                    if (r0 == 0) goto L_0x0046
                    mf0.C24362h.m61208c(r0)
                    int r0 = r0.length
                    if (r0 != 0) goto L_0x004e
                L_0x0046:
                    kf0.b$b r0 = r3.f60052e
                    kf0.b r0 = kf0.C23767b.this
                    r0.getClass()
                    return r1
                L_0x004e:
                    java.io.File[] r0 = r3.f60050c
                    mf0.C24362h.m61208c(r0)
                    int r1 = r3.f60051d
                    int r2 = r1 + 1
                    r3.f60051d = r2
                    r0 = r0[r1]
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: kf0.C23767b.C23769b.C23772c.mo59007a():java.io.File");
            }
        }

        /* renamed from: kf0.b$b$d */
        public /* synthetic */ class C23773d {

            /* renamed from: a */
            public static final /* synthetic */ int[] f60053a;

            /* JADX WARNING: Failed to process nested try/catch */
            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
            static {
                /*
                    kotlin.io.FileWalkDirection[] r0 = kotlin.p980io.FileWalkDirection.values()
                    int r0 = r0.length
                    int[] r0 = new int[r0]
                    kotlin.io.FileWalkDirection r1 = kotlin.p980io.FileWalkDirection.TOP_DOWN     // Catch:{ NoSuchFieldError -> 0x0010 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                    r2 = 1
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                L_0x0010:
                    kotlin.io.FileWalkDirection r1 = kotlin.p980io.FileWalkDirection.BOTTOM_UP     // Catch:{ NoSuchFieldError -> 0x0019 }
                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                    r2 = 2
                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                L_0x0019:
                    f60053a = r0
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: kf0.C23767b.C23769b.C23773d.<clinit>():void");
            }
        }

        public C23769b() {
            ArrayDeque<C23774c> arrayDeque = new ArrayDeque<>();
            this.f60041d = arrayDeque;
            if (C23767b.this.f60038a.isDirectory()) {
                arrayDeque.push(mo59006e(C23767b.this.f60038a));
            } else if (C23767b.this.f60038a.isFile()) {
                arrayDeque.push(new C23771b(C23767b.this.f60038a));
            } else {
                mo59160b();
            }
        }

        /* renamed from: e */
        public final C23768a mo59006e(File file) {
            int i = C23773d.f60053a[C23767b.this.f60039b.ordinal()];
            if (i == 1) {
                return new C23772c(this, file);
            }
            if (i == 2) {
                return new C23770a(this, file);
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: kf0.b$c */
    public static abstract class C23774c {

        /* renamed from: a */
        public final File f60054a;

        public C23774c(File file) {
            C24362h.m61211f(file, "root");
            this.f60054a = file;
        }

        /* renamed from: a */
        public abstract File mo59007a();
    }

    public C23767b(File file, FileWalkDirection fileWalkDirection) {
        this.f60038a = file;
        this.f60039b = fileWalkDirection;
    }

    public final Iterator<File> iterator() {
        return new C23769b();
    }
}
