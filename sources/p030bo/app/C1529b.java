package p030bo.app;

import android.graphics.Bitmap;
import com.appboy.support.AppboyLogger;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import p030bo.app.C1540c;

/* renamed from: bo.app.b */
public class C1529b {

    /* renamed from: b */
    public static final String f5488b = AppboyLogger.getBrazeLogTag(C1529b.class);

    /* renamed from: a */
    public final C1540c f5489a;

    public C1529b(File file, int i, int i2, long j) {
        this.f5489a = C1540c.m4005a(file, i, i2, j);
    }

    /* renamed from: a */
    public void mo5903a(String str, Bitmap bitmap) {
        String c = mo5906c(str);
        OutputStream outputStream = null;
        try {
            C1540c.C1543c a = this.f5489a.mo5927a(c);
            outputStream = a.mo5945a(0);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            outputStream.flush();
            outputStream.close();
            a.mo5947b();
            try {
                outputStream.close();
            } catch (IOException e) {
                String str2 = f5488b;
                AppboyLogger.m5452e(str2, "Exception while closing disk cache output stream for key" + c, e);
            }
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e2) {
                    String str3 = f5488b;
                    AppboyLogger.m5452e(str3, "Exception while closing disk cache output stream for key" + c, e2);
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 != null) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        throw r2;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap mo5905b(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r5 = r4.mo5906c(r5)
            bo.app.c r0 = r4.f5489a     // Catch:{ all -> 0x0025 }
            bo.app.c$d r0 = r0.mo5930b((java.lang.String) r5)     // Catch:{ all -> 0x0025 }
            r1 = 0
            java.io.InputStream r1 = r0.mo5952a(r1)     // Catch:{ all -> 0x0017 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ all -> 0x0017 }
            r0.close()     // Catch:{ all -> 0x0025 }
            return r1
        L_0x0017:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r2 = move-exception
            if (r0 == 0) goto L_0x0024
            r0.close()     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0025 }
        L_0x0024:
            throw r2     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            java.lang.String r1 = f5488b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to get bitmap from disk cache for key "
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.appboy.support.AppboyLogger.m5452e(r1, r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Failed to load image from disk cache: "
            r0.append(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.appboy.support.AppboyLogger.m5448d(r1, r5)
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1529b.mo5905b(java.lang.String):android.graphics.Bitmap");
    }

    /* renamed from: c */
    public final String mo5906c(String str) {
        return Integer.toString(str.hashCode());
    }

    /* renamed from: a */
    public boolean mo5904a(String str) {
        String c = mo5906c(str);
        try {
            C1540c.C1545d b = this.f5489a.mo5930b(c);
            boolean z = b != null;
            if (b != null) {
                b.close();
            }
            return z;
        } catch (Throwable th) {
            String str2 = f5488b;
            AppboyLogger.m5452e(str2, "Error while retrieving disk for key " + c, th);
            return false;
        }
    }
}
