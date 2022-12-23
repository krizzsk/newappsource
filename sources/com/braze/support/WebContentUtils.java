package com.braze.support;

import android.content.Context;
import androidx.annotation.Keep;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.IntentUtils;
import com.appboy.support.StringUtils;
import java.io.File;
import java.util.Map;
import p001a0.C0017h;
import p358af.C13437d;

@Keep
public class WebContentUtils {
    public static final String FILE_URI_SCHEME_PREFIX = "file://";
    public static final String HTML_INAPP_MESSAGES_FOLDER = "appboy-html-inapp-messages";
    public static final String TAG = AppboyLogger.getBrazeLogTag(WebContentUtils.class);
    public static final String ZIP_EXTENSION = ".zip";
    public static final int ZIP_UNPACK_BYTE_BUFFER_LENGTH = 8192;

    public static File getHtmlInAppMessageAssetCacheDirectory(Context context) {
        return new File(context.getCacheDir().getPath() + "/" + HTML_INAPP_MESSAGES_FOLDER);
    }

    public static String getLocalHtmlUrlFromRemoteUrl(File file, String str) {
        if (file == null) {
            AppboyLogger.m5459w(TAG, "Internal cache directory is null. No local URL will be created.");
            return null;
        } else if (StringUtils.isNullOrBlank(str)) {
            AppboyLogger.m5459w(TAG, "Remote zip url is null or empty. No local URL will be created.");
            return null;
        } else {
            String absolutePath = file.getAbsolutePath();
            String valueOf = String.valueOf(IntentUtils.getRequestCode());
            String k = C13437d.m33706k(absolutePath, "/", valueOf);
            String str2 = TAG;
            AppboyLogger.m5448d(str2, "Starting download of url: " + str);
            File downloadFileToPath = AppboyFileUtils.downloadFileToPath(k, str, valueOf, ZIP_EXTENSION);
            if (downloadFileToPath == null) {
                AppboyLogger.m5448d(str2, "Could not download zip file to local storage.");
                AppboyFileUtils.deleteFileOrDirectory(new File(k));
                return null;
            }
            AppboyLogger.m5448d(str2, "Html content zip downloaded.");
            if (!unpackZipIntoDirectory(k, downloadFileToPath)) {
                AppboyLogger.m5459w(str2, "Error during the zip unpack.");
                AppboyFileUtils.deleteFileOrDirectory(new File(k));
                return null;
            }
            AppboyLogger.m5448d(str2, "Html content zip unpacked.");
            return k;
        }
    }

    public static String replacePrefetchedUrlsWithLocalAssets(String str, Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            String str2 = (String) next.getValue();
            if (!new File(str2).exists()) {
                String str3 = TAG;
                AppboyLogger.m5459w(str3, "Cannot find local asset file at path: " + str2);
            } else {
                if (!str2.startsWith(FILE_URI_SCHEME_PREFIX)) {
                    str2 = C25541a.m63881k(FILE_URI_SCHEME_PREFIX, str2);
                }
                String str4 = (String) next.getKey();
                if (str.contains(str4)) {
                    AppboyLogger.m5448d(TAG, C0017h.m56M("Replacing remote url \"", str4, "\" with local uri \"", str2, "\""));
                    str = str.replace(str4, str2);
                }
            }
        }
        return str;
    }

    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.util.zip.ZipInputStream] */
    /* JADX WARNING: type inference failed for: r1v8 */
    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: type inference failed for: r1v13 */
    /* JADX WARNING: type inference failed for: r1v14, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v25 */
    /* JADX WARNING: type inference failed for: r1v26 */
    /* JADX WARNING: type inference failed for: r1v27 */
    /* JADX WARNING: type inference failed for: r1v28 */
    /* JADX WARNING: type inference failed for: r1v29 */
    /* JADX WARNING: type inference failed for: r1v30 */
    /* JADX WARNING: type inference failed for: r1v33 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00c5 A[SYNTHETIC, Splitter:B:55:0x00c5] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00cd A[Catch:{ IOException -> 0x00c9 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC, Splitter:B:68:0x00e2] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00ea A[Catch:{ IOException -> 0x00e6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x00ff A[SYNTHETIC, Splitter:B:81:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0107 A[Catch:{ IOException -> 0x0103 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:78:0x00f6=Splitter:B:78:0x00f6, B:65:0x00d9=Splitter:B:65:0x00d9, B:52:0x00bc=Splitter:B:52:0x00bc} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean unpackZipIntoDirectory(java.lang.String r8, java.io.File r9) {
        /*
            java.lang.String r0 = "IOException during closing of zip file unpacking streams."
            boolean r1 = com.appboy.support.StringUtils.isNullOrBlank(r8)
            r2 = 0
            if (r1 == 0) goto L_0x0011
            java.lang.String r8 = TAG
            java.lang.String r9 = "Unpack directory null or blank. Zip file not unpacked."
            com.appboy.support.AppboyLogger.m5453i(r8, r9)
            return r2
        L_0x0011:
            if (r9 != 0) goto L_0x001b
            java.lang.String r8 = TAG
            java.lang.String r9 = "Zip file is null. Zip file not unpacked."
            com.appboy.support.AppboyLogger.m5453i(r8, r9)
            return r2
        L_0x001b:
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            r1.mkdirs()
            r1 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x00f4, IOException -> 0x00d7, all -> 0x00ba }
            r3.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00f4, IOException -> 0x00d7, all -> 0x00ba }
            java.io.BufferedInputStream r9 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x00f4, IOException -> 0x00d7, all -> 0x00ba }
            r9.<init>(r3)     // Catch:{ FileNotFoundException -> 0x00f4, IOException -> 0x00d7, all -> 0x00ba }
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch:{ FileNotFoundException -> 0x00f4, IOException -> 0x00d7, all -> 0x00ba }
            r3.<init>(r9)     // Catch:{ FileNotFoundException -> 0x00f4, IOException -> 0x00d7, all -> 0x00ba }
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r9]     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
        L_0x0037:
            java.util.zip.ZipEntry r4 = r3.getNextEntry()     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            if (r4 == 0) goto L_0x009a
            java.lang.String r5 = r4.getName()     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            java.util.Locale r6 = java.util.Locale.US     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            java.lang.String r6 = r5.toLowerCase(r6)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            java.lang.String r7 = "__macosx"
            boolean r6 = r6.startsWith(r7)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            if (r6 == 0) goto L_0x0050
            goto L_0x0037
        L_0x0050:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r6.<init>()     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r6.append(r8)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r6.append(r5)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            java.lang.String r5 = r6.toString()     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            java.lang.String r5 = validateChildFileExistsUnderParent(r8, r5)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            boolean r4 = r4.isDirectory()     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            if (r4 == 0) goto L_0x0077
            java.io.File r4 = new java.io.File     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r4.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r4.mkdirs()     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            goto L_0x0037
        L_0x0077:
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            java.io.FileOutputStream r6 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r6.<init>(r5)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r4.<init>(r6)     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
        L_0x0081:
            int r1 = r3.read(r9)     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0096, all -> 0x0094 }
            r5 = -1
            if (r1 == r5) goto L_0x008c
            r4.write(r9, r2, r1)     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0096, all -> 0x0094 }
            goto L_0x0081
        L_0x008c:
            r4.close()     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0096, all -> 0x0094 }
            r3.closeEntry()     // Catch:{ FileNotFoundException -> 0x0098, IOException -> 0x0096, all -> 0x0094 }
            r1 = r4
            goto L_0x0037
        L_0x0094:
            r8 = move-exception
            goto L_0x00b0
        L_0x0096:
            r8 = move-exception
            goto L_0x00b4
        L_0x0098:
            r8 = move-exception
            goto L_0x00b8
        L_0x009a:
            r3.close()     // Catch:{ FileNotFoundException -> 0x00b6, IOException -> 0x00b2, all -> 0x00ae }
            r8 = 1
            r3.close()     // Catch:{ IOException -> 0x00a7 }
            if (r1 == 0) goto L_0x00ad
            r1.close()     // Catch:{ IOException -> 0x00a7 }
            goto L_0x00ad
        L_0x00a7:
            r9 = move-exception
            java.lang.String r1 = TAG
            com.appboy.support.AppboyLogger.m5452e(r1, r0, r9)
        L_0x00ad:
            return r8
        L_0x00ae:
            r8 = move-exception
            r4 = r1
        L_0x00b0:
            r1 = r3
            goto L_0x00bc
        L_0x00b2:
            r8 = move-exception
            r4 = r1
        L_0x00b4:
            r1 = r3
            goto L_0x00d9
        L_0x00b6:
            r8 = move-exception
            r4 = r1
        L_0x00b8:
            r1 = r3
            goto L_0x00f6
        L_0x00ba:
            r8 = move-exception
            r4 = r1
        L_0x00bc:
            java.lang.String r9 = TAG     // Catch:{ all -> 0x0111 }
            java.lang.String r3 = "Error during unpack of zip file."
            com.appboy.support.AppboyLogger.m5452e(r9, r3, r8)     // Catch:{ all -> 0x0111 }
            if (r1 == 0) goto L_0x00cb
            r1.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00cb
        L_0x00c9:
            r8 = move-exception
            goto L_0x00d1
        L_0x00cb:
            if (r4 == 0) goto L_0x00d6
            r4.close()     // Catch:{ IOException -> 0x00c9 }
            goto L_0x00d6
        L_0x00d1:
            java.lang.String r9 = TAG
            com.appboy.support.AppboyLogger.m5452e(r9, r0, r8)
        L_0x00d6:
            return r2
        L_0x00d7:
            r8 = move-exception
            r4 = r1
        L_0x00d9:
            java.lang.String r9 = TAG     // Catch:{ all -> 0x0111 }
            java.lang.String r3 = "IOException during unpack of zip file."
            com.appboy.support.AppboyLogger.m5452e(r9, r3, r8)     // Catch:{ all -> 0x0111 }
            if (r1 == 0) goto L_0x00e8
            r1.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00e8
        L_0x00e6:
            r8 = move-exception
            goto L_0x00ee
        L_0x00e8:
            if (r4 == 0) goto L_0x00f3
            r4.close()     // Catch:{ IOException -> 0x00e6 }
            goto L_0x00f3
        L_0x00ee:
            java.lang.String r9 = TAG
            com.appboy.support.AppboyLogger.m5452e(r9, r0, r8)
        L_0x00f3:
            return r2
        L_0x00f4:
            r8 = move-exception
            r4 = r1
        L_0x00f6:
            java.lang.String r9 = TAG     // Catch:{ all -> 0x0111 }
            java.lang.String r3 = "FileNotFoundException during unpack of zip file."
            com.appboy.support.AppboyLogger.m5452e(r9, r3, r8)     // Catch:{ all -> 0x0111 }
            if (r1 == 0) goto L_0x0105
            r1.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0105
        L_0x0103:
            r8 = move-exception
            goto L_0x010b
        L_0x0105:
            if (r4 == 0) goto L_0x0110
            r4.close()     // Catch:{ IOException -> 0x0103 }
            goto L_0x0110
        L_0x010b:
            java.lang.String r9 = TAG
            com.appboy.support.AppboyLogger.m5452e(r9, r0, r8)
        L_0x0110:
            return r2
        L_0x0111:
            r8 = move-exception
            if (r1 == 0) goto L_0x011a
            r1.close()     // Catch:{ IOException -> 0x0118 }
            goto L_0x011a
        L_0x0118:
            r9 = move-exception
            goto L_0x0120
        L_0x011a:
            if (r4 == 0) goto L_0x0125
            r4.close()     // Catch:{ IOException -> 0x0118 }
            goto L_0x0125
        L_0x0120:
            java.lang.String r1 = TAG
            com.appboy.support.AppboyLogger.m5452e(r1, r0, r9)
        L_0x0125:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.braze.support.WebContentUtils.unpackZipIntoDirectory(java.lang.String, java.io.File):boolean");
    }

    public static String validateChildFileExistsUnderParent(String str, String str2) {
        String canonicalPath = new File(str).getCanonicalPath();
        String canonicalPath2 = new File(str2).getCanonicalPath();
        if (canonicalPath2.startsWith(canonicalPath)) {
            return canonicalPath2;
        }
        throw new IllegalStateException(C13715c.m34245k(C16759e.m42352h("Invalid file with original path: ", str2, " with canonical path: ", canonicalPath2, " does not exist under intended parent with  path: "), str, " and canonical path: ", canonicalPath));
    }
}
