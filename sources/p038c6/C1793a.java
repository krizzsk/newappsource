package p038c6;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.C2142d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: c6.a */
public final class C1793a implements C2142d<InputStream> {

    /* renamed from: b */
    public final Uri f6271b;

    /* renamed from: c */
    public final C1797c f6272c;

    /* renamed from: d */
    public InputStream f6273d;

    /* renamed from: c6.a$a */
    public static class C1794a implements C1796b {

        /* renamed from: b */
        public static final String[] f6274b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f6275a;

        public C1794a(ContentResolver contentResolver) {
            this.f6275a = contentResolver;
        }

        /* renamed from: a */
        public final Cursor mo6613a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6275a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f6274b, "kind = 1 AND image_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    /* renamed from: c6.a$b */
    public static class C1795b implements C1796b {

        /* renamed from: b */
        public static final String[] f6276b = {"_data"};

        /* renamed from: a */
        public final ContentResolver f6277a;

        public C1795b(ContentResolver contentResolver) {
            this.f6277a = contentResolver;
        }

        /* renamed from: a */
        public final Cursor mo6613a(Uri uri) {
            String lastPathSegment = uri.getLastPathSegment();
            return this.f6277a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f6276b, "kind = 1 AND video_id = ?", new String[]{lastPathSegment}, (String) null);
        }
    }

    public C1793a(Uri uri, C1797c cVar) {
        this.f6271b = uri;
        this.f6272c = cVar;
    }

    /* renamed from: c */
    public static C1793a m5102c(Context context, Uri uri, C1796b bVar) {
        return new C1793a(uri, new C1797c(C2116c.m5520b(context).f6885f.mo10830d(), bVar, C2116c.m5520b(context).f6886g, context.getContentResolver()));
    }

    /* renamed from: a */
    public final Class<InputStream> mo6607a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public final void mo6608b() {
        InputStream inputStream = this.f6273d;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    public final void cancel() {
    }

    /* renamed from: d */
    public final DataSource mo6610d() {
        return DataSource.LOCAL;
    }

    /* renamed from: e */
    public final void mo6611e(Priority priority, C2142d.C2143a<? super InputStream> aVar) {
        try {
            InputStream f = mo6612f();
            this.f6273d = f;
            aVar.mo10914f(f);
        } catch (FileNotFoundException e) {
            aVar.mo10913c(e);
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Can't wrap try/catch for region: R(4:42|43|(1:45)|(2:47|48)) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (android.util.Log.isLoggable("ThumbStreamOpener", 3) != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        java.util.Objects.toString(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r6 != null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0037, code lost:
        r7 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0083, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0089, code lost:
        if (android.util.Log.isLoggable("ThumbStreamOpener", 3) != false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008b, code lost:
        java.util.Objects.toString(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0096, code lost:
        if (r5 != 0) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x009b, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00cc, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00cd, code lost:
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00d0, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        if (r6 != null) goto L_0x0034;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0029 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0085 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.io.InputStream mo6612f() throws java.io.FileNotFoundException {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            c6.c r1 = r12.f6272c
            android.net.Uri r2 = r12.f6271b
            r1.getClass()
            r3 = 0
            r4 = 3
            r5 = 0
            c6.b r6 = r1.f6278a     // Catch:{ SecurityException -> 0x0028, all -> 0x0025 }
            android.database.Cursor r6 = r6.mo6613a(r2)     // Catch:{ SecurityException -> 0x0028, all -> 0x0025 }
            if (r6 == 0) goto L_0x0022
            boolean r7 = r6.moveToFirst()     // Catch:{ SecurityException -> 0x0029 }
            if (r7 == 0) goto L_0x0022
            java.lang.String r7 = r6.getString(r3)     // Catch:{ SecurityException -> 0x0029 }
            r6.close()
            goto L_0x0038
        L_0x0022:
            if (r6 == 0) goto L_0x0037
            goto L_0x0034
        L_0x0025:
            r0 = move-exception
            goto L_0x00ce
        L_0x0028:
            r6 = r5
        L_0x0029:
            boolean r7 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x00cc }
            if (r7 == 0) goto L_0x0032
            java.util.Objects.toString(r2)     // Catch:{ all -> 0x00cc }
        L_0x0032:
            if (r6 == 0) goto L_0x0037
        L_0x0034:
            r6.close()
        L_0x0037:
            r7 = r5
        L_0x0038:
            boolean r6 = android.text.TextUtils.isEmpty(r7)
            if (r6 == 0) goto L_0x003f
            goto L_0x0057
        L_0x003f:
            java.io.File r6 = new java.io.File
            r6.<init>(r7)
            boolean r7 = r6.exists()
            if (r7 == 0) goto L_0x0055
            r7 = 0
            long r9 = r6.length()
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 >= 0) goto L_0x0055
            r3 = 1
        L_0x0055:
            if (r3 != 0) goto L_0x0059
        L_0x0057:
            r1 = r5
            goto L_0x0063
        L_0x0059:
            android.net.Uri r3 = android.net.Uri.fromFile(r6)
            android.content.ContentResolver r1 = r1.f6280c     // Catch:{ NullPointerException -> 0x00a6 }
            java.io.InputStream r1 = r1.openInputStream(r3)     // Catch:{ NullPointerException -> 0x00a6 }
        L_0x0063:
            r2 = -1
            if (r1 == 0) goto L_0x009c
            c6.c r3 = r12.f6272c
            android.net.Uri r6 = r12.f6271b
            r3.getClass()
            android.content.ContentResolver r7 = r3.f6280c     // Catch:{ IOException | NullPointerException -> 0x0085 }
            java.io.InputStream r5 = r7.openInputStream(r6)     // Catch:{ IOException | NullPointerException -> 0x0085 }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r7 = r3.f6281d     // Catch:{ IOException | NullPointerException -> 0x0085 }
            e6.b r3 = r3.f6279b     // Catch:{ IOException | NullPointerException -> 0x0085 }
            int r0 = com.bumptech.glide.load.C2137a.m5566a(r3, r5, r7)     // Catch:{ IOException | NullPointerException -> 0x0085 }
            if (r5 == 0) goto L_0x009d
            r5.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x009d
        L_0x0081:
            goto L_0x009d
        L_0x0083:
            r0 = move-exception
            goto L_0x0096
        L_0x0085:
            boolean r0 = android.util.Log.isLoggable(r0, r4)     // Catch:{ all -> 0x0083 }
            if (r0 == 0) goto L_0x008e
            java.util.Objects.toString(r6)     // Catch:{ all -> 0x0083 }
        L_0x008e:
            if (r5 == 0) goto L_0x009c
            r5.close()     // Catch:{ IOException -> 0x0094 }
            goto L_0x009c
        L_0x0094:
            goto L_0x009c
        L_0x0096:
            if (r5 == 0) goto L_0x009b
            r5.close()     // Catch:{ IOException -> 0x009b }
        L_0x009b:
            throw r0
        L_0x009c:
            r0 = -1
        L_0x009d:
            if (r0 == r2) goto L_0x00a5
            com.bumptech.glide.load.data.g r2 = new com.bumptech.glide.load.data.g
            r2.<init>(r1, r0)
            r1 = r2
        L_0x00a5:
            return r1
        L_0x00a6:
            r0 = move-exception
            java.io.FileNotFoundException r1 = new java.io.FileNotFoundException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "NPE opening uri: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = " -> "
            r4.append(r2)
            r4.append(r3)
            java.lang.String r2 = r4.toString()
            r1.<init>(r2)
            java.lang.Throwable r0 = r1.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L_0x00cc:
            r0 = move-exception
            r5 = r6
        L_0x00ce:
            if (r5 == 0) goto L_0x00d3
            r5.close()
        L_0x00d3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p038c6.C1793a.mo6612f():java.io.InputStream");
    }
}
