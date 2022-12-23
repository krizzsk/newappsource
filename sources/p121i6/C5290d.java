package p121i6;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import mf0.C24361g;
import p025b6.C1492e;
import p108h6.C5104n;
import p108h6.C5106o;
import p108h6.C5112r;
import p298w6.C7000d;

/* renamed from: i6.d */
public final class C5290d<DataT> implements C5104n<Uri, DataT> {

    /* renamed from: a */
    public final Context f17461a;

    /* renamed from: b */
    public final C5104n<File, DataT> f17462b;

    /* renamed from: c */
    public final C5104n<Uri, DataT> f17463c;

    /* renamed from: d */
    public final Class<DataT> f17464d;

    /* renamed from: i6.d$a */
    public static abstract class C5291a<DataT> implements C5106o<Uri, DataT> {

        /* renamed from: a */
        public final Context f17465a;

        /* renamed from: b */
        public final Class<DataT> f17466b;

        public C5291a(Context context, Class<DataT> cls) {
            this.f17465a = context;
            this.f17466b = cls;
        }

        /* renamed from: b */
        public final C5104n<Uri, DataT> mo20818b(C5112r rVar) {
            return new C5290d(this.f17465a, rVar.mo20844b(File.class, this.f17466b), rVar.mo20844b(Uri.class, this.f17466b), this.f17466b);
        }
    }

    /* renamed from: i6.d$b */
    public static final class C5292b extends C5291a<ParcelFileDescriptor> {
        public C5292b(Context context) {
            super(context, ParcelFileDescriptor.class);
        }
    }

    /* renamed from: i6.d$c */
    public static final class C5293c extends C5291a<InputStream> {
        public C5293c(Context context) {
            super(context, InputStream.class);
        }
    }

    /* renamed from: i6.d$d */
    public static final class C5294d<DataT> implements C2142d<DataT> {

        /* renamed from: l */
        public static final String[] f17467l = {"_data"};

        /* renamed from: b */
        public final Context f17468b;

        /* renamed from: c */
        public final C5104n<File, DataT> f17469c;

        /* renamed from: d */
        public final C5104n<Uri, DataT> f17470d;

        /* renamed from: e */
        public final Uri f17471e;

        /* renamed from: f */
        public final int f17472f;

        /* renamed from: g */
        public final int f17473g;

        /* renamed from: h */
        public final C1492e f17474h;

        /* renamed from: i */
        public final Class<DataT> f17475i;

        /* renamed from: j */
        public volatile boolean f17476j;

        /* renamed from: k */
        public volatile C2142d<DataT> f17477k;

        public C5294d(Context context, C5104n<File, DataT> nVar, C5104n<Uri, DataT> nVar2, Uri uri, int i, int i2, C1492e eVar, Class<DataT> cls) {
            this.f17468b = context.getApplicationContext();
            this.f17469c = nVar;
            this.f17470d = nVar2;
            this.f17471e = uri;
            this.f17472f = i;
            this.f17473g = i2;
            this.f17474h = eVar;
            this.f17475i = cls;
        }

        /* renamed from: a */
        public final Class<DataT> mo6607a() {
            return this.f17475i;
        }

        /* renamed from: b */
        public final void mo6608b() {
            C2142d<DataT> dVar = this.f17477k;
            if (dVar != null) {
                dVar.mo6608b();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x007a  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.bumptech.glide.load.data.C2142d<DataT> mo21089c() throws java.io.FileNotFoundException {
            /*
                r9 = this;
                boolean r0 = android.os.Environment.isExternalStorageLegacy()
                r1 = 0
                if (r0 == 0) goto L_0x007e
                h6.n<java.io.File, DataT> r0 = r9.f17469c
                android.net.Uri r8 = r9.f17471e
                android.content.Context r2 = r9.f17468b     // Catch:{ all -> 0x0077 }
                android.content.ContentResolver r2 = r2.getContentResolver()     // Catch:{ all -> 0x0077 }
                java.lang.String[] r4 = f17467l     // Catch:{ all -> 0x0077 }
                r5 = 0
                r6 = 0
                r7 = 0
                r3 = r8
                android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0077 }
                if (r2 == 0) goto L_0x005d
                boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0074 }
                if (r3 == 0) goto L_0x005d
                java.lang.String r3 = "_data"
                int r3 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = r2.getString(r3)     // Catch:{ all -> 0x0074 }
                boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0074 }
                if (r4 != 0) goto L_0x0046
                java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
                r4.<init>(r3)     // Catch:{ all -> 0x0074 }
                r2.close()
                int r2 = r9.f17472f
                int r3 = r9.f17473g
                b6.e r5 = r9.f17474h
                h6.n$a r0 = r0.mo20816b(r4, r2, r3, r5)
                goto L_0x00a0
            L_0x0046:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "File path was empty in media store for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x005d:
                java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ all -> 0x0074 }
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
                r1.<init>()     // Catch:{ all -> 0x0074 }
                java.lang.String r3 = "Failed to media store entry for: "
                r1.append(r3)     // Catch:{ all -> 0x0074 }
                r1.append(r8)     // Catch:{ all -> 0x0074 }
                java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0074 }
                r0.<init>(r1)     // Catch:{ all -> 0x0074 }
                throw r0     // Catch:{ all -> 0x0074 }
            L_0x0074:
                r0 = move-exception
                r1 = r2
                goto L_0x0078
            L_0x0077:
                r0 = move-exception
            L_0x0078:
                if (r1 == 0) goto L_0x007d
                r1.close()
            L_0x007d:
                throw r0
            L_0x007e:
                android.content.Context r0 = r9.f17468b
                int r0 = r0.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION")
                if (r0 != 0) goto L_0x0088
                r0 = 1
                goto L_0x0089
            L_0x0088:
                r0 = 0
            L_0x0089:
                if (r0 == 0) goto L_0x0092
                android.net.Uri r0 = r9.f17471e
                android.net.Uri r0 = android.provider.MediaStore.setRequireOriginal(r0)
                goto L_0x0094
            L_0x0092:
                android.net.Uri r0 = r9.f17471e
            L_0x0094:
                h6.n<android.net.Uri, DataT> r2 = r9.f17470d
                int r3 = r9.f17472f
                int r4 = r9.f17473g
                b6.e r5 = r9.f17474h
                h6.n$a r0 = r2.mo20816b(r0, r3, r4, r5)
            L_0x00a0:
                if (r0 == 0) goto L_0x00a4
                com.bumptech.glide.load.data.d<Data> r1 = r0.f17106c
            L_0x00a4:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p121i6.C5290d.C5294d.mo21089c():com.bumptech.glide.load.data.d");
        }

        public final void cancel() {
            this.f17476j = true;
            C2142d<DataT> dVar = this.f17477k;
            if (dVar != null) {
                dVar.cancel();
            }
        }

        /* renamed from: d */
        public final DataSource mo6610d() {
            return DataSource.LOCAL;
        }

        /* renamed from: e */
        public final void mo6611e(Priority priority, C2142d.C2143a<? super DataT> aVar) {
            try {
                C2142d<DataT> c = mo21089c();
                if (c == null) {
                    aVar.mo10913c(new IllegalArgumentException("Failed to build fetcher for: " + this.f17471e));
                    return;
                }
                this.f17477k = c;
                if (this.f17476j) {
                    cancel();
                } else {
                    c.mo6611e(priority, aVar);
                }
            } catch (FileNotFoundException e) {
                aVar.mo10913c(e);
            }
        }
    }

    public C5290d(Context context, C5104n<File, DataT> nVar, C5104n<Uri, DataT> nVar2, Class<DataT> cls) {
        this.f17461a = context.getApplicationContext();
        this.f17462b = nVar;
        this.f17463c = nVar2;
        this.f17464d = cls;
    }

    /* renamed from: a */
    public final boolean mo20815a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT < 29 || !C24361g.m61153W(uri)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final C5104n.C5105a mo20816b(Object obj, int i, int i2, C1492e eVar) {
        Uri uri = (Uri) obj;
        return new C5104n.C5105a(new C7000d(uri), new C5294d(this.f17461a, this.f17462b, this.f17463c, uri, i, i2, eVar, this.f17464d));
    }
}
