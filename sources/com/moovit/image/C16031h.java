package com.moovit.image;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import com.moovit.image.ImageProviderFragment;
import java.util.concurrent.Callable;

/* renamed from: com.moovit.image.h */
public final /* synthetic */ class C16031h implements Callable {

    /* renamed from: b */
    public final /* synthetic */ ImageProviderFragment f41743b;

    /* renamed from: c */
    public final /* synthetic */ Context f41744c;

    /* renamed from: d */
    public final /* synthetic */ Uri f41745d;

    /* renamed from: e */
    public final /* synthetic */ ContentResolver f41746e;

    /* renamed from: f */
    public final /* synthetic */ ImageProviderFragment.PhotoTakingParams f41747f;

    public /* synthetic */ C16031h(ImageProviderFragment imageProviderFragment, Context context, Uri uri, ContentResolver contentResolver, ImageProviderFragment.PhotoTakingParams photoTakingParams) {
        this.f41743b = imageProviderFragment;
        this.f41744c = context;
        this.f41745d = uri;
        this.f41746e = contentResolver;
        this.f41747f = photoTakingParams;
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            com.moovit.image.ImageProviderFragment r0 = r9.f41743b
            android.content.Context r1 = r9.f41744c
            android.net.Uri r2 = r9.f41745d
            android.content.ContentResolver r3 = r9.f41746e
            com.moovit.image.ImageProviderFragment$PhotoTakingParams r4 = r9.f41747f
            r0.getClass()
            ce0.C21100e.m49355o()
            r5 = 0
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ Exception -> 0x0044 }
            java.io.InputStream r1 = r1.openInputStream(r2)     // Catch:{ Exception -> 0x0044 }
            android.graphics.BitmapFactory$Options r6 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x0038 }
            r6.<init>()     // Catch:{ all -> 0x0038 }
            r7 = 1
            r6.inJustDecodeBounds = r7     // Catch:{ all -> 0x0038 }
            android.graphics.BitmapFactory.decodeStream(r1, r5, r6)     // Catch:{ all -> 0x0038 }
            int r8 = r6.outWidth     // Catch:{ all -> 0x0038 }
            if (r8 <= 0) goto L_0x0032
            int r6 = r6.outHeight     // Catch:{ all -> 0x0038 }
            if (r6 <= 0) goto L_0x0032
            if (r1 == 0) goto L_0x0045
            r1.close()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0045
        L_0x0032:
            if (r1 == 0) goto L_0x0044
            r1.close()     // Catch:{ Exception -> 0x0044 }
            goto L_0x0044
        L_0x0038:
            r6 = move-exception
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x003f }
            goto L_0x0043
        L_0x003f:
            r1 = move-exception
            r6.addSuppressed(r1)     // Catch:{ Exception -> 0x0044 }
        L_0x0043:
            throw r6     // Catch:{ Exception -> 0x0044 }
        L_0x0044:
            r7 = 0
        L_0x0045:
            if (r7 == 0) goto L_0x008b
            java.io.InputStream r1 = r3.openInputStream(r2)
            boolean r2 = r1 instanceof java.io.BufferedInputStream
            if (r2 == 0) goto L_0x0052
            java.io.BufferedInputStream r1 = (java.io.BufferedInputStream) r1
            goto L_0x0058
        L_0x0052:
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream
            r2.<init>(r1)
            r1 = r2
        L_0x0058:
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x007f }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x007f }
            com.moovit.image.ImageProviderFragment$PhotoTakingParams r0 = r0.f41702n     // Catch:{ all -> 0x007f }
            java.lang.String r0 = r0.f41704b     // Catch:{ all -> 0x007f }
            r3.<init>(r0)     // Catch:{ all -> 0x007f }
            r2.<init>(r3)     // Catch:{ all -> 0x007f }
            p786rz.C19387a.m46671c(r1, r2)     // Catch:{ all -> 0x0075 }
            r2.close()     // Catch:{ all -> 0x007f }
            if (r1 == 0) goto L_0x0071
            r1.close()
        L_0x0071:
            com.moovit.image.ImageProviderFragment.PhotoTakingParams.m40796b(r4)
            return r5
        L_0x0075:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x007a }
            goto L_0x007e
        L_0x007a:
            r2 = move-exception
            r0.addSuppressed(r2)     // Catch:{ all -> 0x007f }
        L_0x007e:
            throw r0     // Catch:{ all -> 0x007f }
        L_0x007f:
            r0 = move-exception
            if (r1 == 0) goto L_0x008a
            r1.close()     // Catch:{ all -> 0x0086 }
            goto L_0x008a
        L_0x0086:
            r1 = move-exception
            r0.addSuppressed(r1)
        L_0x008a:
            throw r0
        L_0x008b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "Not a valid image uri: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moovit.image.C16031h.call():java.lang.Object");
    }
}
