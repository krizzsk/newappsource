package com.appboy.support;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.Keep;
import com.braze.enums.BrazeViewBounds;
import com.braze.support.BrazeImageUtils;
import java.io.InputStream;
import p001a0.C0016g;
import p181n5.C5864a;

@Deprecated
@Keep
public class AppboyImageUtils {
    public static final int MAX_IMAGE_CACHE_SIZE_BYTES = 33554432;
    public static final int MIN_IMAGE_CACHE_SIZE_BYTES = 1024;
    public static final int RUNTIME_MEMORY_IMAGE_LOADER_USAGE_QUOTIENT = 8;
    public static final String TAG = AppboyLogger.getBrazeLogTag(BrazeImageUtils.class);

    /* renamed from: a */
    public static /* synthetic */ void m5447a(ImageView imageView, float f) {
        int width = imageView.getWidth();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.height = (int) (((float) width) / f);
        layoutParams.width = width;
        imageView.setLayoutParams(layoutParams);
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int i, int i2) {
        int i3 = 1;
        if (i2 == 0 || i == 0) {
            AppboyLogger.m5448d(TAG, "Not sampling on 0 destination width or height");
            return 1;
        }
        int i4 = options.outHeight;
        int i5 = options.outWidth;
        String str = TAG;
        StringBuilder k = C13555b.m33972k("Calculating sample size for source image bounds: (width ");
        k.append(options.outWidth);
        k.append(" height ");
        C0016g.m41y(k, options.outHeight, ") and destination image bounds: (width ", i, " height ");
        k.append(i2);
        k.append(")");
        AppboyLogger.m5448d(str, k.toString());
        if (i4 > i2 || i5 > i) {
            int i6 = i4 / 2;
            int i7 = i5 / 2;
            while (i6 / i3 >= i2 && i7 / i3 >= i) {
                i3 *= 2;
            }
        }
        String str2 = TAG;
        StringBuilder r = C25541a.m63887r("Using image sample size of ", i3, ". Image will be scaled to width: ");
        r.append(i5 / i3);
        r.append(" and height: ");
        r.append(i4 / i3);
        AppboyLogger.m5448d(str2, r.toString());
        return i3;
    }

    public static Bitmap decodeSampledBitmapFromStream(InputStream inputStream, BitmapFactory.Options options, int i, int i2) {
        options.inSampleSize = calculateInSampleSize(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(inputStream, (Rect) null, options);
    }

    public static Bitmap getBitmap(Context context, Uri uri, BrazeViewBounds brazeViewBounds) {
        if (uri == null) {
            AppboyLogger.m5453i(TAG, "Null Uri received. Not getting image.");
            return null;
        }
        if (context == null) {
            AppboyLogger.m5448d(TAG, "Non-null context is required for image sampling");
        }
        if (brazeViewBounds == null) {
            brazeViewBounds = BrazeViewBounds.NO_BOUNDS;
        }
        int destinationHeightPixels = getDestinationHeightPixels(context, brazeViewBounds);
        int destinationWidthPixels = getDestinationWidthPixels(context, brazeViewBounds);
        if (AppboyFileUtils.isLocalUri(uri)) {
            return getLocalBitmap(uri, destinationWidthPixels, destinationHeightPixels);
        }
        if (AppboyFileUtils.isRemoteUri(uri)) {
            return getRemoteBitmap(uri, destinationWidthPixels, destinationHeightPixels);
        }
        String str = TAG;
        AppboyLogger.m5459w(str, "Uri with unknown scheme received. Not getting image. Uri: " + uri);
        return null;
    }

    public static BitmapFactory.Options getBitmapMetadataFromStream(InputStream inputStream) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(inputStream, (Rect) null, options);
        return options;
    }

    public static int getDensityDpi(Context context) {
        return context.getResources().getConfiguration().densityDpi;
    }

    public static int getDestinationHeightPixels(Context context, BrazeViewBounds brazeViewBounds) {
        int displayHeightPixels = getDisplayHeightPixels(context);
        if (BrazeViewBounds.NO_BOUNDS.equals(brazeViewBounds)) {
            return displayHeightPixels;
        }
        return Math.min(displayHeightPixels, getPixelsFromDensityAndDp(getDensityDpi(context), brazeViewBounds.getHeightDp()));
    }

    public static int getDestinationWidthPixels(Context context, BrazeViewBounds brazeViewBounds) {
        int displayWidthPixels = getDisplayWidthPixels(context);
        if (BrazeViewBounds.NO_BOUNDS.equals(brazeViewBounds)) {
            return displayWidthPixels;
        }
        return Math.min(displayWidthPixels, getPixelsFromDensityAndDp(getDensityDpi(context), brazeViewBounds.getWidthDp()));
    }

    public static int getDisplayHeightPixels(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds().height();
        }
        return populateDisplayMetricsFromDisplay(context).heightPixels;
    }

    public static int getDisplayWidthPixels(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 30) {
            return windowManager.getCurrentWindowMetrics().getBounds().width();
        }
        return populateDisplayMetricsFromDisplay(context).widthPixels;
    }

    public static int getImageLoaderCacheSize() {
        return Math.max(1024, Math.min((int) Math.min(Runtime.getRuntime().maxMemory() / 8, 2147483647L), MAX_IMAGE_CACHE_SIZE_BYTES));
    }

    /* JADX WARNING: Removed duplicated region for block: B:54:0x012e A[SYNTHETIC, Splitter:B:54:0x012e] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x013d A[SYNTHETIC, Splitter:B:61:0x013d] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0166 A[SYNTHETIC, Splitter:B:69:0x0166] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:51:0x0112=Splitter:B:51:0x0112, B:58:0x0134=Splitter:B:58:0x0134, B:66:0x0145=Splitter:B:66:0x0145} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap getLocalBitmap(android.net.Uri r8, int r9, int r10) {
        /*
            java.lang.String r0 = " width "
            java.lang.String r1 = "IOException during closing of bitmap metadata image stream."
            r2 = 0
            java.lang.String r3 = r8.getPath()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            boolean r4 = com.appboy.support.StringUtils.isNullOrEmpty(r3)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            if (r4 == 0) goto L_0x0026
            java.lang.String r9 = TAG     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r0 = "Local bitmap path is null. URI: "
            r10.append(r0)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r10.append(r8)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            com.appboy.support.AppboyLogger.m5448d(r9, r10)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            return r2
        L_0x0026:
            java.io.File r4 = new java.io.File     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r4.<init>(r3)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            boolean r3 = r4.exists()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            if (r3 != 0) goto L_0x0048
            java.lang.String r9 = TAG     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r0 = "Local bitmap file does not exist. URI: "
            r10.append(r0)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r10.append(r8)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            com.appboy.support.AppboyLogger.m5448d(r9, r10)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            return r2
        L_0x0048:
            java.lang.String r3 = TAG     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r5.<init>()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r6 = "Retrieving image from local path: "
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r6 = r4.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r5.append(r6)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r5 = r5.toString()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            com.appboy.support.AppboyLogger.m5453i(r3, r5)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            if (r9 <= 0) goto L_0x0102
            if (r10 > 0) goto L_0x0068
            goto L_0x0102
        L_0x0068:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            r5.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            java.lang.String r7 = "Sampling bitmap with destination image bounds: (height "
            r6.append(r7)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            r6.append(r10)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            r6.append(r0)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            r6.append(r9)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            java.lang.String r7 = ")"
            r6.append(r7)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            java.lang.String r6 = r6.toString()     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            com.appboy.support.AppboyLogger.m5448d(r3, r6)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            android.graphics.BitmapFactory$Options r6 = getBitmapMetadataFromStream(r5)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            r5.close()     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            r7.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x0100, Exception -> 0x00fe, all -> 0x00fc }
            int r5 = r6.outHeight     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            if (r5 == 0) goto L_0x00b5
            int r5 = r6.outWidth     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            if (r5 != 0) goto L_0x00a1
            goto L_0x00b5
        L_0x00a1:
            java.lang.String r0 = "Decoding sampled bitmap"
            com.appboy.support.AppboyLogger.m5448d(r3, r0)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            android.graphics.Bitmap r8 = decodeSampledBitmapFromStream(r7, r6, r9, r10)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            r7.close()     // Catch:{ IOException -> 0x00ae }
            goto L_0x00b4
        L_0x00ae:
            r9 = move-exception
            java.lang.String r10 = TAG
            com.appboy.support.AppboyLogger.m5452e(r10, r1, r9)
        L_0x00b4:
            return r8
        L_0x00b5:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            r9.<init>()     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            java.lang.String r10 = "The bitmap metadata with image uri "
            r9.append(r10)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            r9.append(r8)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            java.lang.String r10 = " had bounds: (height "
            r9.append(r10)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            int r10 = r6.outHeight     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            r9.append(r10)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            r9.append(r0)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            int r10 = r6.outWidth     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            r9.append(r10)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            java.lang.String r10 = "). Returning a bitmap with no sampling."
            r9.append(r10)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            java.lang.String r9 = r9.toString()     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r3, (java.lang.String) r9)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            java.lang.String r9 = r4.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r9)     // Catch:{ OutOfMemoryError -> 0x00f9, Exception -> 0x00f6, all -> 0x00f3 }
            r7.close()     // Catch:{ IOException -> 0x00ec }
            goto L_0x00f2
        L_0x00ec:
            r9 = move-exception
            java.lang.String r10 = TAG
            com.appboy.support.AppboyLogger.m5452e(r10, r1, r9)
        L_0x00f2:
            return r8
        L_0x00f3:
            r9 = move-exception
            r5 = r7
            goto L_0x0112
        L_0x00f6:
            r8 = move-exception
            r5 = r7
            goto L_0x0134
        L_0x00f9:
            r9 = move-exception
            r5 = r7
            goto L_0x0145
        L_0x00fc:
            r9 = move-exception
            goto L_0x0112
        L_0x00fe:
            r8 = move-exception
            goto L_0x0134
        L_0x0100:
            r9 = move-exception
            goto L_0x0145
        L_0x0102:
            java.lang.String r9 = "Destination bounds unset. Loading entire bitmap into memory."
            com.appboy.support.AppboyLogger.m5448d(r3, r9)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            java.lang.String r9 = r4.getAbsolutePath()     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            android.graphics.Bitmap r8 = android.graphics.BitmapFactory.decodeFile(r9)     // Catch:{ OutOfMemoryError -> 0x0143, Exception -> 0x0132, all -> 0x0110 }
            return r8
        L_0x0110:
            r9 = move-exception
            r5 = r2
        L_0x0112:
            java.lang.String r10 = TAG     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            r0.<init>()     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = "Throwable caught in local bitmap file retrieval for Uri: "
            r0.append(r3)     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0170 }
            r0.append(r8)     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0170 }
            com.appboy.support.AppboyLogger.m5452e(r10, r8, r9)     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x016f
            r5.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x016f
        L_0x0132:
            r8 = move-exception
            r5 = r2
        L_0x0134:
            java.lang.String r9 = TAG     // Catch:{ all -> 0x0170 }
            java.lang.String r10 = "Exception occurred when attempting to retrieve local bitmap."
            com.appboy.support.AppboyLogger.m5452e(r9, r10, r8)     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x016f
            r5.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x016f
        L_0x0141:
            r8 = move-exception
            goto L_0x016a
        L_0x0143:
            r9 = move-exception
            r5 = r2
        L_0x0145:
            java.lang.String r10 = TAG     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            r0.<init>()     // Catch:{ all -> 0x0170 }
            java.lang.String r3 = "Out of Memory Error in local bitmap file retrieval for Uri: "
            r0.append(r3)     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0170 }
            r0.append(r8)     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = "."
            r0.append(r8)     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = r0.toString()     // Catch:{ all -> 0x0170 }
            com.appboy.support.AppboyLogger.m5452e(r10, r8, r9)     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x016f
            r5.close()     // Catch:{ IOException -> 0x0141 }
            goto L_0x016f
        L_0x016a:
            java.lang.String r9 = TAG
            com.appboy.support.AppboyLogger.m5452e(r9, r1, r8)
        L_0x016f:
            return r2
        L_0x0170:
            r8 = move-exception
            if (r5 == 0) goto L_0x017d
            r5.close()     // Catch:{ IOException -> 0x0177 }
            goto L_0x017d
        L_0x0177:
            r9 = move-exception
            java.lang.String r10 = TAG
            com.appboy.support.AppboyLogger.m5452e(r10, r1, r9)
        L_0x017d:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.support.AppboyImageUtils.getLocalBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    public static int getPixelsFromDensityAndDp(int i, int i2) {
        return Math.abs((i * i2) / 160);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01b2 A[SYNTHETIC, Splitter:B:101:0x01b2] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x01d6  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x01db A[SYNTHETIC, Splitter:B:110:0x01db] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0204 A[SYNTHETIC, Splitter:B:119:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015b A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0160 A[SYNTHETIC, Splitter:B:82:0x0160] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0185 A[SYNTHETIC, Splitter:B:91:0x0185] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ad  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:96:0x0190=Splitter:B:96:0x0190, B:114:0x01e2=Splitter:B:114:0x01e2, B:77:0x0143=Splitter:B:77:0x0143, B:86:0x0168=Splitter:B:86:0x0168, B:105:0x01b9=Splitter:B:105:0x01b9} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap getRemoteBitmap(android.net.Uri r9, int r10, int r11) {
        /*
            java.lang.String r0 = " width "
            java.lang.String r1 = "IOException during closing of bitmap metadata download stream."
            r2 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r2)
            java.lang.String r9 = r9.toString()
            boolean r2 = com.appboy.Appboy.getOutboundNetworkRequestsOffline()
            r3 = 0
            if (r2 == 0) goto L_0x002b
            java.lang.String r10 = TAG
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "SDK is in offline mode, not downloading remote bitmap with uri: "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.appboy.support.AppboyLogger.m5453i(r10, r9)
            return r3
        L_0x002b:
            java.net.URL r2 = new java.net.URL     // Catch:{ OutOfMemoryError -> 0x01df, UnknownHostException -> 0x01b6, MalformedURLException -> 0x018d, Exception -> 0x0165, all -> 0x0140 }
            r2.<init>(r9)     // Catch:{ OutOfMemoryError -> 0x01df, UnknownHostException -> 0x01b6, MalformedURLException -> 0x018d, Exception -> 0x0165, all -> 0x0140 }
            java.net.URLConnection r4 = p030bo.app.C1698u.m4769a(r2)     // Catch:{ OutOfMemoryError -> 0x01df, UnknownHostException -> 0x01b6, MalformedURLException -> 0x018d, Exception -> 0x0165, all -> 0x0140 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ OutOfMemoryError -> 0x01df, UnknownHostException -> 0x01b6, MalformedURLException -> 0x018d, Exception -> 0x0165, all -> 0x0140 }
            int r5 = r4.getResponseCode()     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 == r6) goto L_0x0065
            java.lang.String r10 = TAG     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            r11.<init>()     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            java.lang.String r0 = "HTTP response code was "
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            r11.append(r5)     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            java.lang.String r0 = ". Bitmap with url "
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            r11.append(r2)     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            java.lang.String r0 = " could not be downloaded."
            r11.append(r0)     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            java.lang.String r11 = r11.toString()     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r10, (java.lang.String) r11)     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            r4.disconnect()
            return r3
        L_0x0065:
            java.io.InputStream r5 = r4.getInputStream()     // Catch:{ OutOfMemoryError -> 0x013c, UnknownHostException -> 0x0138, MalformedURLException -> 0x0135, Exception -> 0x0132, all -> 0x012f }
            if (r10 == 0) goto L_0x010e
            if (r11 == 0) goto L_0x010e
            java.lang.String r6 = TAG     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            r7.<init>()     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r8 = "Sampling bitmap with destination image bounds: (height "
            r7.append(r8)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            r7.append(r11)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            r7.append(r0)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            r7.append(r10)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r8 = ")"
            r7.append(r8)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            java.lang.String r7 = r7.toString()     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            com.appboy.support.AppboyLogger.m5448d(r6, r7)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            android.graphics.BitmapFactory$Options r7 = getBitmapMetadataFromStream(r5)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            r4.disconnect()     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            java.net.URLConnection r8 = p030bo.app.C1698u.m4769a(r2)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            java.net.HttpURLConnection r8 = (java.net.HttpURLConnection) r8     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            java.io.InputStream r5 = r8.getInputStream()     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            int r4 = r7.outHeight     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            if (r4 == 0) goto L_0x00bc
            int r4 = r7.outWidth     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            if (r4 != 0) goto L_0x00a8
            goto L_0x00bc
        L_0x00a8:
            android.graphics.Bitmap r9 = decodeSampledBitmapFromStream(r5, r7, r10, r11)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            r8.disconnect()
            if (r5 == 0) goto L_0x00bb
            r5.close()     // Catch:{ IOException -> 0x00b5 }
            goto L_0x00bb
        L_0x00b5:
            r10 = move-exception
            java.lang.String r11 = TAG
            com.appboy.support.AppboyLogger.m5452e(r11, r1, r10)
        L_0x00bb:
            return r9
        L_0x00bc:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            r10.<init>()     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            java.lang.String r11 = "The bitmap metadata with image url "
            r10.append(r11)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            r10.append(r2)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            java.lang.String r11 = " had bounds: (height "
            r10.append(r11)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            int r11 = r7.outHeight     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            r10.append(r11)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            r10.append(r0)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            int r11 = r7.outWidth     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            r10.append(r11)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            java.lang.String r11 = "). Returning a bitmap with no sampling."
            r10.append(r11)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            java.lang.String r10 = r10.toString()     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            com.appboy.support.AppboyLogger.m5459w((java.lang.String) r6, (java.lang.String) r10)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ OutOfMemoryError -> 0x010a, UnknownHostException -> 0x0106, MalformedURLException -> 0x0102, Exception -> 0x00fe, all -> 0x00fb }
            r8.disconnect()
            if (r5 == 0) goto L_0x00fa
            r5.close()     // Catch:{ IOException -> 0x00f4 }
            goto L_0x00fa
        L_0x00f4:
            r10 = move-exception
            java.lang.String r11 = TAG
            com.appboy.support.AppboyLogger.m5452e(r11, r1, r10)
        L_0x00fa:
            return r9
        L_0x00fb:
            r10 = move-exception
            r4 = r8
            goto L_0x0143
        L_0x00fe:
            r10 = move-exception
            r4 = r8
            goto L_0x0168
        L_0x0102:
            r10 = move-exception
            r4 = r8
            goto L_0x0190
        L_0x0106:
            r10 = move-exception
            r4 = r8
            goto L_0x01b9
        L_0x010a:
            r10 = move-exception
            r4 = r8
            goto L_0x01e2
        L_0x010e:
            android.graphics.Bitmap r9 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch:{ OutOfMemoryError -> 0x012c, UnknownHostException -> 0x0129, MalformedURLException -> 0x0126, Exception -> 0x0124, all -> 0x0122 }
            r4.disconnect()
            if (r5 == 0) goto L_0x0121
            r5.close()     // Catch:{ IOException -> 0x011b }
            goto L_0x0121
        L_0x011b:
            r10 = move-exception
            java.lang.String r11 = TAG
            com.appboy.support.AppboyLogger.m5452e(r11, r1, r10)
        L_0x0121:
            return r9
        L_0x0122:
            r10 = move-exception
            goto L_0x0143
        L_0x0124:
            r10 = move-exception
            goto L_0x0168
        L_0x0126:
            r10 = move-exception
            goto L_0x0190
        L_0x0129:
            r10 = move-exception
            goto L_0x01b9
        L_0x012c:
            r10 = move-exception
            goto L_0x01e2
        L_0x012f:
            r10 = move-exception
            r5 = r3
            goto L_0x0143
        L_0x0132:
            r10 = move-exception
            r5 = r3
            goto L_0x0168
        L_0x0135:
            r10 = move-exception
            r5 = r3
            goto L_0x0190
        L_0x0138:
            r10 = move-exception
            r5 = r3
            goto L_0x01b9
        L_0x013c:
            r10 = move-exception
            r5 = r3
            goto L_0x01e2
        L_0x0140:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x0143:
            java.lang.String r11 = TAG     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Throwable caught in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x020e }
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x020e }
            com.appboy.support.AppboyLogger.m5452e(r11, r9, r10)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x015e
            r4.disconnect()
        L_0x015e:
            if (r5 == 0) goto L_0x020d
            r5.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x020d
        L_0x0165:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x0168:
            java.lang.String r11 = TAG     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Exception in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x020e }
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x020e }
            com.appboy.support.AppboyLogger.m5452e(r11, r9, r10)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x0183
            r4.disconnect()
        L_0x0183:
            if (r5 == 0) goto L_0x020d
            r5.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x020d
        L_0x018a:
            r9 = move-exception
            goto L_0x0208
        L_0x018d:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x0190:
            java.lang.String r11 = TAG     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Malformed URL Exception in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x020e }
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = ". Image Uri may be corrupted."
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x020e }
            com.appboy.support.AppboyLogger.m5452e(r11, r9, r10)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x01b0
            r4.disconnect()
        L_0x01b0:
            if (r5 == 0) goto L_0x020d
            r5.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x020d
        L_0x01b6:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x01b9:
            java.lang.String r11 = TAG     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Unknown Host Exception in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x020e }
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = ". Device may be offline."
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x020e }
            com.appboy.support.AppboyLogger.m5452e(r11, r9, r10)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x01d9
            r4.disconnect()
        L_0x01d9:
            if (r5 == 0) goto L_0x020d
            r5.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x020d
        L_0x01df:
            r10 = move-exception
            r4 = r3
            r5 = r4
        L_0x01e2:
            java.lang.String r11 = TAG     // Catch:{ all -> 0x020e }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x020e }
            r0.<init>()     // Catch:{ all -> 0x020e }
            java.lang.String r2 = "Out of Memory Error in image bitmap download for Uri: "
            r0.append(r2)     // Catch:{ all -> 0x020e }
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = "."
            r0.append(r9)     // Catch:{ all -> 0x020e }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x020e }
            com.appboy.support.AppboyLogger.m5452e(r11, r9, r10)     // Catch:{ all -> 0x020e }
            if (r4 == 0) goto L_0x0202
            r4.disconnect()
        L_0x0202:
            if (r5 == 0) goto L_0x020d
            r5.close()     // Catch:{ IOException -> 0x018a }
            goto L_0x020d
        L_0x0208:
            java.lang.String r10 = TAG
            com.appboy.support.AppboyLogger.m5452e(r10, r1, r9)
        L_0x020d:
            return r3
        L_0x020e:
            r9 = move-exception
            if (r4 == 0) goto L_0x0214
            r4.disconnect()
        L_0x0214:
            if (r5 == 0) goto L_0x0220
            r5.close()     // Catch:{ IOException -> 0x021a }
            goto L_0x0220
        L_0x021a:
            r10 = move-exception
            java.lang.String r11 = TAG
            com.appboy.support.AppboyLogger.m5452e(r11, r1, r10)
        L_0x0220:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.support.AppboyImageUtils.getRemoteBitmap(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    public static DisplayMetrics populateDisplayMetricsFromDisplay(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    public static void resizeImageViewToBitmapDimensions(Bitmap bitmap, ImageView imageView) {
        if (bitmap == null || imageView == null) {
            AppboyLogger.m5459w(TAG, "Neither source bitmap nor ImageView may be null. Not resizing ImageView");
        } else if (bitmap.getWidth() == 0 || bitmap.getHeight() == 0) {
            AppboyLogger.m5459w(TAG, "Bitmap dimensions cannot be 0. Not resizing ImageView");
        } else if (imageView.getWidth() == 0 || imageView.getHeight() == 0) {
            AppboyLogger.m5459w(TAG, "ImageView dimensions cannot be 0. Not resizing ImageView");
        } else {
            float width = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
            String str = TAG;
            AppboyLogger.m5448d(str, "Resizing ImageView to aspect ratio: " + width);
            imageView.post(new C5864a(imageView, width));
        }
    }
}
