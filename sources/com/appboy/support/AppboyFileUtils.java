package com.appboy.support;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.Keep;
import com.braze.support.BrazeFileUtils;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Deprecated
@Keep
public class AppboyFileUtils {
    public static final int BUFFER_SIZE = 8192;
    public static final String FILE_SCHEME = "file";
    public static final List<String> REMOTE_SCHEMES = Collections.unmodifiableList(Arrays.asList(new String[]{"http", "https", "ftp", "ftps", "about", "javascript"}));
    public static final String SHARED_PREFERENCES_FILENAME_SUFFIX = ".xml";
    public static final String TAG = AppboyLogger.getBrazeLogTag(BrazeFileUtils.class);

    public static void deleteFileOrDirectory(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        for (String file2 : file.list()) {
                            deleteFileOrDirectory(new File(file, file2));
                        }
                    }
                    file.delete();
                }
            } catch (Exception e) {
                String str = TAG;
                StringBuilder k = C13555b.m33972k("Caught exception while trying to delete file or directory ");
                k.append(file.getName());
                AppboyLogger.m5452e(str, k.toString(), e);
            }
        }
    }

    @SuppressLint({"ApplySharedPref"})
    public static void deleteSharedPreferencesFile(Context context, File file) {
        if (file == null) {
            AppboyLogger.m5459w(TAG, "Cannot delete null SharedPreferences file.");
        } else if (!file.exists()) {
            String str = TAG;
            StringBuilder k = C13555b.m33972k("Cannot delete SharedPreferences that does not exist. Path: ");
            k.append(file.getAbsolutePath());
            AppboyLogger.m5459w(str, k.toString());
        } else {
            String name = file.getName();
            if (!name.endsWith(SHARED_PREFERENCES_FILENAME_SUFFIX)) {
                String str2 = TAG;
                StringBuilder k2 = C13555b.m33972k("SharedPreferences file is expected to end in .xml. Path: ");
                k2.append(file.getAbsolutePath());
                AppboyLogger.m5459w(str2, k2.toString());
                return;
            }
            String substring = name.substring(0, name.length() - 4);
            if (Build.VERSION.SDK_INT >= 24) {
                context.deleteSharedPreferences(substring);
                return;
            }
            context.getSharedPreferences(substring, 0).edit().clear().commit();
            deleteFileOrDirectory(file);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.io.DataInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.io.BufferedOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: java.io.BufferedOutputStream} */
    /* JADX WARNING: type inference failed for: r1v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v6, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v8, types: [java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x011c A[DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0121 A[SYNTHETIC, Splitter:B:61:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0129 A[Catch:{ Exception -> 0x0125 }, DONT_GENERATE] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0157 A[SYNTHETIC, Splitter:B:77:0x0157] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x015f A[Catch:{ Exception -> 0x015b }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0104=Splitter:B:56:0x0104, B:72:0x013a=Splitter:B:72:0x013a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File downloadFileToPath(java.lang.String r7, java.lang.String r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "Exception during closing of file download streams."
            r1 = 1337(0x539, float:1.874E-42)
            android.net.TrafficStats.setThreadStatsTag(r1)
            boolean r1 = com.appboy.Appboy.getOutboundNetworkRequestsOffline()
            r2 = 0
            if (r1 == 0) goto L_0x0025
            java.lang.String r7 = TAG
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "SDK is offline. File not downloaded for url: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.appboy.support.AppboyLogger.m5453i(r7, r8)
            return r2
        L_0x0025:
            boolean r1 = com.appboy.support.StringUtils.isNullOrBlank(r7)
            if (r1 == 0) goto L_0x0033
            java.lang.String r7 = TAG
            java.lang.String r8 = "Download directory null or blank. File not downloaded."
            com.appboy.support.AppboyLogger.m5453i(r7, r8)
            return r2
        L_0x0033:
            boolean r1 = com.appboy.support.StringUtils.isNullOrBlank(r8)
            if (r1 == 0) goto L_0x0041
            java.lang.String r7 = TAG
            java.lang.String r8 = "Zip file url null or blank. File not downloaded."
            com.appboy.support.AppboyLogger.m5453i(r7, r8)
            return r2
        L_0x0041:
            boolean r1 = com.appboy.support.StringUtils.isNullOrBlank(r9)
            if (r1 == 0) goto L_0x004f
            java.lang.String r7 = TAG
            java.lang.String r8 = "Output filename null or blank. File not downloaded."
            com.appboy.support.AppboyLogger.m5453i(r7, r8)
            return r2
        L_0x004f:
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            r1.<init>(r7)     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            r1.mkdirs()     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            boolean r1 = com.appboy.support.StringUtils.isNullOrBlank(r10)     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            if (r1 != 0) goto L_0x006c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            r1.<init>()     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            r1.append(r9)     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            r1.append(r10)     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
        L_0x006c:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            r10.<init>(r7, r9)     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            java.net.URL r7 = new java.net.URL     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            java.net.URLConnection r7 = p030bo.app.C1698u.m4769a(r7)     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            java.net.HttpURLConnection r7 = (java.net.HttpURLConnection) r7     // Catch:{ Exception -> 0x0133, all -> 0x00fd }
            int r9 = r7.getResponseCode()     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r9 == r1) goto L_0x00ab
            java.lang.String r10 = TAG     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            r1.<init>()     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.lang.String r3 = "HTTP response code was "
            r1.append(r3)     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            r1.append(r9)     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.lang.String r9 = ". File with url "
            r1.append(r9)     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            r1.append(r8)     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.lang.String r9 = " could not be downloaded."
            r1.append(r9)     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.lang.String r9 = r1.toString()     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            com.appboy.support.AppboyLogger.m5448d(r10, r9)     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            r7.disconnect()
            return r2
        L_0x00ab:
            r9 = 8192(0x2000, float:1.14794E-41)
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.io.InputStream r3 = r7.getInputStream()     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            r1.<init>(r3)     // Catch:{ Exception -> 0x00f8, all -> 0x00f3 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r4.<init>(r10)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00f0, all -> 0x00ed }
        L_0x00c2:
            int r4 = r1.read(r9)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r5 = -1
            if (r4 == r5) goto L_0x00ce
            r5 = 0
            r3.write(r9, r5, r4)     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            goto L_0x00c2
        L_0x00ce:
            r1.close()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r7.disconnect()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r3.close()     // Catch:{ Exception -> 0x00ea, all -> 0x00e8 }
            r7.disconnect()
            r1.close()     // Catch:{ Exception -> 0x00e1 }
            r3.close()     // Catch:{ Exception -> 0x00e1 }
            goto L_0x00e7
        L_0x00e1:
            r7 = move-exception
            java.lang.String r8 = TAG
            com.appboy.support.AppboyLogger.m5452e(r8, r0, r7)
        L_0x00e7:
            return r10
        L_0x00e8:
            r9 = move-exception
            goto L_0x0104
        L_0x00ea:
            r9 = move-exception
            goto L_0x013a
        L_0x00ed:
            r9 = move-exception
            r3 = r2
            goto L_0x0104
        L_0x00f0:
            r9 = move-exception
            r3 = r2
            goto L_0x013a
        L_0x00f3:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x00ff
        L_0x00f8:
            r9 = move-exception
            r6 = r9
            r9 = r7
            r7 = r6
            goto L_0x0135
        L_0x00fd:
            r7 = move-exception
            r9 = r2
        L_0x00ff:
            r1 = r2
            r3 = r1
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x0104:
            java.lang.String r10 = TAG     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r4.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = "Throwable during download of file from url : "
            r4.append(r5)     // Catch:{ all -> 0x0169 }
            r4.append(r8)     // Catch:{ all -> 0x0169 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0169 }
            com.appboy.support.AppboyLogger.m5452e(r10, r8, r9)     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x011f
            r7.disconnect()
        L_0x011f:
            if (r1 == 0) goto L_0x0127
            r1.close()     // Catch:{ Exception -> 0x0125 }
            goto L_0x0127
        L_0x0125:
            r7 = move-exception
            goto L_0x012d
        L_0x0127:
            if (r3 == 0) goto L_0x0132
            r3.close()     // Catch:{ Exception -> 0x0125 }
            goto L_0x0132
        L_0x012d:
            java.lang.String r8 = TAG
            com.appboy.support.AppboyLogger.m5452e(r8, r0, r7)
        L_0x0132:
            return r2
        L_0x0133:
            r7 = move-exception
            r9 = r2
        L_0x0135:
            r1 = r2
            r3 = r1
            r6 = r9
            r9 = r7
            r7 = r6
        L_0x013a:
            java.lang.String r10 = TAG     // Catch:{ all -> 0x0169 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0169 }
            r4.<init>()     // Catch:{ all -> 0x0169 }
            java.lang.String r5 = "Exception during download of file from url : "
            r4.append(r5)     // Catch:{ all -> 0x0169 }
            r4.append(r8)     // Catch:{ all -> 0x0169 }
            java.lang.String r8 = r4.toString()     // Catch:{ all -> 0x0169 }
            com.appboy.support.AppboyLogger.m5452e(r10, r8, r9)     // Catch:{ all -> 0x0169 }
            if (r7 == 0) goto L_0x0155
            r7.disconnect()
        L_0x0155:
            if (r1 == 0) goto L_0x015d
            r1.close()     // Catch:{ Exception -> 0x015b }
            goto L_0x015d
        L_0x015b:
            r7 = move-exception
            goto L_0x0163
        L_0x015d:
            if (r3 == 0) goto L_0x0168
            r3.close()     // Catch:{ Exception -> 0x015b }
            goto L_0x0168
        L_0x0163:
            java.lang.String r8 = TAG
            com.appboy.support.AppboyLogger.m5452e(r8, r0, r7)
        L_0x0168:
            return r2
        L_0x0169:
            r8 = move-exception
            if (r7 == 0) goto L_0x016f
            r7.disconnect()
        L_0x016f:
            if (r1 == 0) goto L_0x0177
            r1.close()     // Catch:{ Exception -> 0x0175 }
            goto L_0x0177
        L_0x0175:
            r7 = move-exception
            goto L_0x017d
        L_0x0177:
            if (r3 == 0) goto L_0x0182
            r3.close()     // Catch:{ Exception -> 0x0175 }
            goto L_0x0182
        L_0x017d:
            java.lang.String r9 = TAG
            com.appboy.support.AppboyLogger.m5452e(r9, r0, r7)
        L_0x0182:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.support.AppboyFileUtils.downloadFileToPath(java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.io.File");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0077 A[SYNTHETIC, Splitter:B:32:0x0077] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x007f A[Catch:{ Exception -> 0x007b }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x009a A[SYNTHETIC, Splitter:B:41:0x009a] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00a2 A[Catch:{ Exception -> 0x009e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getAssetFileStringContents(android.content.res.AssetManager r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "Exception attempting to close file download streams for path:"
            r1 = 0
            java.io.InputStream r8 = r8.open(r9)     // Catch:{ Exception -> 0x005b, all -> 0x0056 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.lang.String r4 = "UTF-8"
            r3.<init>(r8, r4)     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0053, all -> 0x004e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x004c }
            r3.<init>()     // Catch:{ Exception -> 0x004c }
        L_0x0018:
            java.lang.String r4 = r2.readLine()     // Catch:{ Exception -> 0x004c }
            if (r4 == 0) goto L_0x0027
            r3.append(r4)     // Catch:{ Exception -> 0x004c }
            r4 = 10
            r3.append(r4)     // Catch:{ Exception -> 0x004c }
            goto L_0x0018
        L_0x0027:
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x004c }
            if (r8 == 0) goto L_0x0030
            r8.close()     // Catch:{ Exception -> 0x0034 }
        L_0x0030:
            r2.close()     // Catch:{ Exception -> 0x0034 }
            goto L_0x0049
        L_0x0034:
            r8 = move-exception
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.appboy.support.AppboyLogger.m5452e(r2, r9, r8)
        L_0x0049:
            return r1
        L_0x004a:
            r1 = move-exception
            goto L_0x0098
        L_0x004c:
            r3 = move-exception
            goto L_0x005f
        L_0x004e:
            r2 = move-exception
            r7 = r2
            r2 = r1
            r1 = r7
            goto L_0x0098
        L_0x0053:
            r2 = move-exception
            r3 = r2
            goto L_0x005e
        L_0x0056:
            r8 = move-exception
            r2 = r1
            r1 = r8
            r8 = r2
            goto L_0x0098
        L_0x005b:
            r8 = move-exception
            r3 = r8
            r8 = r1
        L_0x005e:
            r2 = r1
        L_0x005f:
            java.lang.String r4 = TAG     // Catch:{ all -> 0x004a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x004a }
            r5.<init>()     // Catch:{ all -> 0x004a }
            java.lang.String r6 = "Exception attempting to get asset content for "
            r5.append(r6)     // Catch:{ all -> 0x004a }
            r5.append(r9)     // Catch:{ all -> 0x004a }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x004a }
            com.appboy.support.AppboyLogger.m5452e(r4, r5, r3)     // Catch:{ all -> 0x004a }
            if (r8 == 0) goto L_0x007d
            r8.close()     // Catch:{ Exception -> 0x007b }
            goto L_0x007d
        L_0x007b:
            r8 = move-exception
            goto L_0x0083
        L_0x007d:
            if (r2 == 0) goto L_0x0097
            r2.close()     // Catch:{ Exception -> 0x007b }
            goto L_0x0097
        L_0x0083:
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.appboy.support.AppboyLogger.m5452e(r2, r9, r8)
        L_0x0097:
            return r1
        L_0x0098:
            if (r8 == 0) goto L_0x00a0
            r8.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00a0
        L_0x009e:
            r8 = move-exception
            goto L_0x00a6
        L_0x00a0:
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ Exception -> 0x009e }
            goto L_0x00ba
        L_0x00a6:
            java.lang.String r2 = TAG
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            com.appboy.support.AppboyLogger.m5452e(r2, r9, r8)
        L_0x00ba:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appboy.support.AppboyFileUtils.getAssetFileStringContents(android.content.res.AssetManager, java.lang.String):java.lang.String");
    }

    public static boolean isLocalUri(Uri uri) {
        if (uri == null) {
            AppboyLogger.m5453i(TAG, "Null Uri received.");
            return false;
        }
        String scheme = uri.getScheme();
        if (StringUtils.isNullOrBlank(scheme) || scheme.equals(FILE_SCHEME)) {
            return true;
        }
        return false;
    }

    public static boolean isRemoteUri(Uri uri) {
        if (uri == null) {
            AppboyLogger.m5453i(TAG, "Null Uri received.");
            return false;
        }
        String scheme = uri.getScheme();
        if (!StringUtils.isNullOrBlank(scheme)) {
            return REMOTE_SCHEMES.contains(scheme);
        }
        AppboyLogger.m5453i(TAG, "Null or blank Uri scheme.");
        return false;
    }
}
