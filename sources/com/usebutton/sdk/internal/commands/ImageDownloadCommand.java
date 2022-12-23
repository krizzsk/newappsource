package com.usebutton.sdk.internal.commands;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import com.usebutton.sdk.internal.core.Command;
import com.usebutton.sdk.internal.core.FailableReceiver;
import com.usebutton.sdk.internal.util.ButtonLog;
import com.usebutton.sdk.internal.util.ButtonUtil;

public class ImageDownloadCommand extends Command<RemoteImage> {
    private static final String TAG = "ImageDownloadCommand";
    private final Context context;
    private Bitmap fallbackBitmap;
    private final int fallbackResource;
    private final Uri imageUri;
    private final String key;

    public static class RemoteImage {
        private final Bitmap bitmap;
        private final String key;

        public RemoteImage(String str, Bitmap bitmap2) {
            this.key = str;
            this.bitmap = bitmap2;
        }

        public Bitmap getBitmap() {
            return this.bitmap;
        }

        public String getKey() {
            return this.key;
        }
    }

    public ImageDownloadCommand(Context context2, String str, Uri uri, int i, FailableReceiver<RemoteImage> failableReceiver) {
        super(failableReceiver);
        this.context = context2.getApplicationContext();
        this.key = str;
        this.imageUri = uri;
        this.fallbackResource = i;
    }

    private Bitmap fallback() {
        String format = String.format("Error retrieving image for key: [%s].", new Object[]{this.key});
        if (this.fallbackResource != 0) {
            ButtonLog.warn(TAG, C25541a.m63881k(format, " Providing fallback bitmap."));
            if (this.fallbackBitmap == null) {
                this.fallbackBitmap = ButtonUtil.resourceToBitmap(this.context, this.fallbackResource);
            }
            return this.fallbackBitmap;
        }
        ButtonLog.warn(TAG, format);
        return null;
    }

    public String key() {
        return this.key;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0035, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0036, code lost:
        if (r0 != null) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0040, code lost:
        throw r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.usebutton.sdk.internal.commands.ImageDownloadCommand.RemoteImage execute() {
        /*
            r4 = this;
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0041 }
            android.net.Uri r1 = r4.imageUri     // Catch:{ IOException -> 0x0041 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0041 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0041 }
            java.io.InputStream r0 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r0)     // Catch:{ IOException -> 0x0041 }
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeStream(r0)     // Catch:{ all -> 0x0033 }
            if (r1 != 0) goto L_0x0026
            com.usebutton.sdk.internal.commands.ImageDownloadCommand$RemoteImage r1 = new com.usebutton.sdk.internal.commands.ImageDownloadCommand$RemoteImage     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = r4.key     // Catch:{ all -> 0x0033 }
            android.graphics.Bitmap r3 = r4.fallback()     // Catch:{ all -> 0x0033 }
            r1.<init>(r2, r3)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0025
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0025:
            return r1
        L_0x0026:
            com.usebutton.sdk.internal.commands.ImageDownloadCommand$RemoteImage r2 = new com.usebutton.sdk.internal.commands.ImageDownloadCommand$RemoteImage     // Catch:{ all -> 0x0033 }
            java.lang.String r3 = r4.key     // Catch:{ all -> 0x0033 }
            r2.<init>(r3, r1)     // Catch:{ all -> 0x0033 }
            if (r0 == 0) goto L_0x0032
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0032:
            return r2
        L_0x0033:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0035 }
        L_0x0035:
            r2 = move-exception
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch:{ all -> 0x003c }
            goto L_0x0040
        L_0x003c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0041 }
        L_0x0040:
            throw r2     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            com.usebutton.sdk.internal.commands.ImageDownloadCommand$RemoteImage r0 = new com.usebutton.sdk.internal.commands.ImageDownloadCommand$RemoteImage
            java.lang.String r1 = r4.key
            android.graphics.Bitmap r2 = r4.fallback()
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.usebutton.sdk.internal.commands.ImageDownloadCommand.execute():com.usebutton.sdk.internal.commands.ImageDownloadCommand$RemoteImage");
    }
}
