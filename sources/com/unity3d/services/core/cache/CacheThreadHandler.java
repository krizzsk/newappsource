package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.WebRequest;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class CacheThreadHandler extends Handler {
    private boolean _active = false;
    private boolean _canceled = false;
    private WebRequest _currentRequest = null;

    /* JADX WARNING: type inference failed for: r3v5, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15, types: [boolean] */
    /* JADX WARNING: type inference failed for: r3v16 */
    /* JADX WARNING: type inference failed for: r3v55 */
    /* JADX WARNING: type inference failed for: r3v56 */
    /* JADX WARNING: type inference failed for: r3v57 */
    /* JADX WARNING: type inference failed for: r3v58 */
    /* JADX WARNING: type inference failed for: r3v59 */
    /* JADX WARNING: type inference failed for: r3v60 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a8 A[SYNTHETIC, Splitter:B:103:0x02a8] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02fa A[SYNTHETIC, Splitter:B:114:0x02fa] */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x034a A[SYNTHETIC, Splitter:B:125:0x034a] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0376 A[SYNTHETIC, Splitter:B:133:0x0376] */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01b2 A[SYNTHETIC, Splitter:B:70:0x01b2] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0204 A[SYNTHETIC, Splitter:B:81:0x0204] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0256 A[SYNTHETIC, Splitter:B:92:0x0256] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void downloadFile(java.lang.String r21, java.lang.String r22, int r23, int r24, int r25, java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> r26, boolean r27) {
        /*
            r20 = this;
            r13 = r20
            r14 = r21
            r0 = r22
            r1 = r27
            java.lang.String r15 = "Error closing stream"
            boolean r2 = r13._canceled
            if (r2 != 0) goto L_0x0399
            if (r14 == 0) goto L_0x0399
            if (r0 != 0) goto L_0x0014
            goto L_0x0399
        L_0x0014:
            java.io.File r5 = new java.io.File
            r5.<init>(r0)
            java.lang.String r2 = " to "
            if (r1 == 0) goto L_0x0039
            java.lang.String r3 = "Unity Ads cache: resuming download "
            java.lang.String r4 = " at "
            java.lang.StringBuilder r0 = p379.C16759e.m42352h(r3, r14, r2, r0, r4)
            long r2 = r5.length()
            r0.append(r2)
            java.lang.String r2 = " bytes"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            goto L_0x0053
        L_0x0039:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unity Ads cache: start downloading "
            r3.append(r4)
            r3.append(r14)
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r0)
        L_0x0053:
            boolean r0 = com.unity3d.services.core.device.Device.isActiveNetworkConnected()
            r2 = 2
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "Unity Ads cache: download cancelled, no internet connection available"
            com.unity3d.services.core.log.DeviceLog.debug(r0)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r1 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r6 = com.unity3d.services.core.cache.CacheError.NO_INTERNET
            r2[r4] = r6
            r2[r3] = r14
            r0.sendEvent(r1, r5, r2)
            return
        L_0x0075:
            r13._active = r3
            long r2 = android.os.SystemClock.elapsedRealtime()
            r12 = 0
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x031d, MalformedURLException -> 0x02cd, IOException -> 0x027b, IllegalStateException -> 0x0229, NetworkIOException -> 0x01d7, Exception -> 0x0185, all -> 0x0178 }
            r11.<init>(r5, r1)     // Catch:{ FileNotFoundException -> 0x031d, MalformedURLException -> 0x02cd, IOException -> 0x027b, IllegalStateException -> 0x0229, NetworkIOException -> 0x01d7, Exception -> 0x0185, all -> 0x0178 }
            r0 = r23
            r1 = r24
            r6 = r26
            com.unity3d.services.core.request.WebRequest r0 = r13.getWebRequest(r14, r0, r1, r6)     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            r13._currentRequest = r0     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            com.unity3d.services.core.cache.CacheThreadHandler$1 r1 = new com.unity3d.services.core.cache.CacheThreadHandler$1     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            r6 = r25
            r1.<init>(r5, r6)     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            r0.setProgressListener(r1)     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            com.unity3d.services.core.request.WebRequest r0 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            long r6 = r0.makeStreamRequest(r11)     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            r13._active = r4     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            com.unity3d.services.core.request.WebRequest r0 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            long r8 = r0.getContentLength()     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            com.unity3d.services.core.request.WebRequest r0 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            boolean r10 = r0.isCanceled()     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            com.unity3d.services.core.request.WebRequest r0 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            int r0 = r0.getResponseCode()     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            com.unity3d.services.core.request.WebRequest r1 = r13._currentRequest     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            java.util.Map r16 = r1.getResponseHeaders()     // Catch:{ FileNotFoundException -> 0x016a, MalformedURLException -> 0x015c, IOException -> 0x014e, IllegalStateException -> 0x0140, NetworkIOException -> 0x0132, Exception -> 0x0124, all -> 0x0115 }
            r17 = 1
            r18 = 2
            r1 = r20
            r4 = r21
            r19 = r11
            r11 = r0
            r14 = r12
            r12 = r16
            r1.postProcessDownload(r2, r4, r5, r6, r8, r10, r11, r12)     // Catch:{ FileNotFoundException -> 0x010f, MalformedURLException -> 0x010a, IOException -> 0x0105, IllegalStateException -> 0x0100, NetworkIOException -> 0x00fb, Exception -> 0x00f6, all -> 0x00f1 }
            r13._currentRequest = r14
            r19.close()     // Catch:{ Exception -> 0x00cf }
            goto L_0x036c
        L_0x00cf:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r2 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r3 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.unity3d.services.core.cache.CacheError r5 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r6 = 0
            r4[r6] = r5
            r4[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r4[r18] = r1
            r0.sendEvent(r2, r3, r4)
            goto L_0x036c
        L_0x00f1:
            r0 = move-exception
            r1 = r14
            r2 = 3
            r3 = 0
            goto L_0x011f
        L_0x00f6:
            r0 = move-exception
            r1 = r14
            r2 = 3
            r3 = 0
            goto L_0x012e
        L_0x00fb:
            r0 = move-exception
            r1 = r14
            r2 = 3
            r3 = 0
            goto L_0x013c
        L_0x0100:
            r0 = move-exception
            r1 = r14
            r2 = 3
            r3 = 0
            goto L_0x014a
        L_0x0105:
            r0 = move-exception
            r1 = r14
            r2 = 3
            r3 = 0
            goto L_0x0158
        L_0x010a:
            r0 = move-exception
            r1 = r14
            r2 = 3
            r3 = 0
            goto L_0x0166
        L_0x010f:
            r0 = move-exception
            r1 = r14
            r2 = 3
            r3 = 0
            goto L_0x0174
        L_0x0115:
            r0 = move-exception
            r19 = r11
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
        L_0x011f:
            r4 = r3
            r11 = r19
            goto L_0x0370
        L_0x0124:
            r0 = move-exception
            r19 = r11
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
        L_0x012e:
            r12 = r19
            goto L_0x018e
        L_0x0132:
            r0 = move-exception
            r19 = r11
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
        L_0x013c:
            r12 = r19
            goto L_0x01e0
        L_0x0140:
            r0 = move-exception
            r19 = r11
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
        L_0x014a:
            r12 = r19
            goto L_0x0232
        L_0x014e:
            r0 = move-exception
            r19 = r11
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
        L_0x0158:
            r12 = r19
            goto L_0x0284
        L_0x015c:
            r0 = move-exception
            r19 = r11
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
        L_0x0166:
            r12 = r19
            goto L_0x02d6
        L_0x016a:
            r0 = move-exception
            r19 = r11
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
        L_0x0174:
            r12 = r19
            goto L_0x0326
        L_0x0178:
            r0 = move-exception
            r1 = r12
            r2 = 3
            r3 = 0
            r4 = 1
            r5 = 2
            r12 = r1
            r17 = 1
            r18 = 2
            goto L_0x036e
        L_0x0185:
            r0 = move-exception
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
            r12 = r1
        L_0x018e:
            java.lang.String r4 = "Unknown error"
            com.unity3d.services.core.log.DeviceLog.exception(r4, r0)     // Catch:{ all -> 0x036d }
            r13._active = r3     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewEventCategory r5 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheEvent r6 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x036d }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheError r8 = com.unity3d.services.core.cache.CacheError.UNKNOWN_ERROR     // Catch:{ all -> 0x036d }
            r7[r3] = r8     // Catch:{ all -> 0x036d }
            r7[r17] = r21     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036d }
            r7[r18] = r0     // Catch:{ all -> 0x036d }
            r4.sendEvent(r5, r6, r7)     // Catch:{ all -> 0x036d }
            r13._currentRequest = r1
            if (r12 == 0) goto L_0x036c
            r12.close()     // Catch:{ Exception -> 0x01b7 }
            goto L_0x036c
        L_0x01b7:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r4 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r6 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r3] = r6
            r2[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r2[r18] = r1
            r0.sendEvent(r4, r5, r2)
            goto L_0x036c
        L_0x01d7:
            r0 = move-exception
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
            r12 = r1
        L_0x01e0:
            java.lang.String r4 = "Network error"
            com.unity3d.services.core.log.DeviceLog.exception(r4, r0)     // Catch:{ all -> 0x036d }
            r13._active = r3     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewEventCategory r5 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheEvent r6 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x036d }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheError r8 = com.unity3d.services.core.cache.CacheError.NETWORK_ERROR     // Catch:{ all -> 0x036d }
            r7[r3] = r8     // Catch:{ all -> 0x036d }
            r7[r17] = r21     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036d }
            r7[r18] = r0     // Catch:{ all -> 0x036d }
            r4.sendEvent(r5, r6, r7)     // Catch:{ all -> 0x036d }
            r13._currentRequest = r1
            if (r12 == 0) goto L_0x036c
            r12.close()     // Catch:{ Exception -> 0x0209 }
            goto L_0x036c
        L_0x0209:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r4 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r6 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r3] = r6
            r2[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r2[r18] = r1
            r0.sendEvent(r4, r5, r2)
            goto L_0x036c
        L_0x0229:
            r0 = move-exception
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
            r12 = r1
        L_0x0232:
            java.lang.String r4 = "Illegal state"
            com.unity3d.services.core.log.DeviceLog.exception(r4, r0)     // Catch:{ all -> 0x036d }
            r13._active = r3     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewEventCategory r5 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheEvent r6 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x036d }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheError r8 = com.unity3d.services.core.cache.CacheError.ILLEGAL_STATE     // Catch:{ all -> 0x036d }
            r7[r3] = r8     // Catch:{ all -> 0x036d }
            r7[r17] = r21     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036d }
            r7[r18] = r0     // Catch:{ all -> 0x036d }
            r4.sendEvent(r5, r6, r7)     // Catch:{ all -> 0x036d }
            r13._currentRequest = r1
            if (r12 == 0) goto L_0x036c
            r12.close()     // Catch:{ Exception -> 0x025b }
            goto L_0x036c
        L_0x025b:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r4 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r6 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r3] = r6
            r2[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r2[r18] = r1
            r0.sendEvent(r4, r5, r2)
            goto L_0x036c
        L_0x027b:
            r0 = move-exception
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
            r12 = r1
        L_0x0284:
            java.lang.String r4 = "Couldn't request stream"
            com.unity3d.services.core.log.DeviceLog.exception(r4, r0)     // Catch:{ all -> 0x036d }
            r13._active = r3     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewEventCategory r5 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheEvent r6 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x036d }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheError r8 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR     // Catch:{ all -> 0x036d }
            r7[r3] = r8     // Catch:{ all -> 0x036d }
            r7[r17] = r21     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036d }
            r7[r18] = r0     // Catch:{ all -> 0x036d }
            r4.sendEvent(r5, r6, r7)     // Catch:{ all -> 0x036d }
            r13._currentRequest = r1
            if (r12 == 0) goto L_0x036c
            r12.close()     // Catch:{ Exception -> 0x02ad }
            goto L_0x036c
        L_0x02ad:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r4 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r6 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r3] = r6
            r2[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r2[r18] = r1
            r0.sendEvent(r4, r5, r2)
            goto L_0x036c
        L_0x02cd:
            r0 = move-exception
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
            r12 = r1
        L_0x02d6:
            java.lang.String r4 = "Malformed URL"
            com.unity3d.services.core.log.DeviceLog.exception(r4, r0)     // Catch:{ all -> 0x036d }
            r13._active = r3     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewEventCategory r5 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheEvent r6 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x036d }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheError r8 = com.unity3d.services.core.cache.CacheError.MALFORMED_URL     // Catch:{ all -> 0x036d }
            r7[r3] = r8     // Catch:{ all -> 0x036d }
            r7[r17] = r21     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036d }
            r7[r18] = r0     // Catch:{ all -> 0x036d }
            r4.sendEvent(r5, r6, r7)     // Catch:{ all -> 0x036d }
            r13._currentRequest = r1
            if (r12 == 0) goto L_0x036c
            r12.close()     // Catch:{ Exception -> 0x02fe }
            goto L_0x036c
        L_0x02fe:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r4 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r6 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r3] = r6
            r2[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r2[r18] = r1
            r0.sendEvent(r4, r5, r2)
            goto L_0x036c
        L_0x031d:
            r0 = move-exception
            r1 = r12
            r2 = 3
            r3 = 0
            r17 = 1
            r18 = 2
            r12 = r1
        L_0x0326:
            java.lang.String r4 = "Couldn't create target file"
            com.unity3d.services.core.log.DeviceLog.exception(r4, r0)     // Catch:{ all -> 0x036d }
            r13._active = r3     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewApp r4 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.webview.WebViewEventCategory r5 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheEvent r6 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR     // Catch:{ all -> 0x036d }
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x036d }
            com.unity3d.services.core.cache.CacheError r8 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR     // Catch:{ all -> 0x036d }
            r7[r3] = r8     // Catch:{ all -> 0x036d }
            r7[r17] = r21     // Catch:{ all -> 0x036d }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x036d }
            r7[r18] = r0     // Catch:{ all -> 0x036d }
            r4.sendEvent(r5, r6, r7)     // Catch:{ all -> 0x036d }
            r13._currentRequest = r1
            if (r12 == 0) goto L_0x036c
            r12.close()     // Catch:{ Exception -> 0x034e }
            goto L_0x036c
        L_0x034e:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r4 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r5 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r2 = new java.lang.Object[r2]
            com.unity3d.services.core.cache.CacheError r6 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r2[r3] = r6
            r2[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r2[r18] = r1
            r0.sendEvent(r4, r5, r2)
        L_0x036c:
            return
        L_0x036d:
            r0 = move-exception
        L_0x036e:
            r4 = r3
            r11 = r12
        L_0x0370:
            r3 = r2
            r2 = r0
            r13._currentRequest = r1
            if (r11 == 0) goto L_0x0398
            r11.close()     // Catch:{ Exception -> 0x037a }
            goto L_0x0398
        L_0x037a:
            r0 = move-exception
            r1 = r0
            com.unity3d.services.core.log.DeviceLog.exception(r15, r1)
            com.unity3d.services.core.webview.WebViewApp r0 = com.unity3d.services.core.webview.WebViewApp.getCurrentApp()
            com.unity3d.services.core.webview.WebViewEventCategory r5 = com.unity3d.services.core.webview.WebViewEventCategory.CACHE
            com.unity3d.services.core.cache.CacheEvent r6 = com.unity3d.services.core.cache.CacheEvent.DOWNLOAD_ERROR
            java.lang.Object[] r3 = new java.lang.Object[r3]
            com.unity3d.services.core.cache.CacheError r7 = com.unity3d.services.core.cache.CacheError.FILE_IO_ERROR
            r3[r4] = r7
            r3[r17] = r21
            java.lang.String r1 = r1.getMessage()
            r3[r18] = r1
            r0.sendEvent(r5, r6, r3)
        L_0x0398:
            throw r2
        L_0x0399:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.cache.CacheThreadHandler.downloadFile(java.lang.String, java.lang.String, int, int, int, java.util.HashMap, boolean):void");
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap<String, List<String>> hashMap) throws MalformedURLException {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new WebRequest(str, "GET", hashMap2, i, i2);
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map) {
        String str2 = str;
        long elapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (!z) {
            StringBuilder k = C13555b.m33972k("Unity Ads cache: File ");
            k.append(file.getName());
            k.append(" of ");
            k.append(j2);
            k.append(" bytes downloaded in ");
            k.append(elapsedRealtime);
            k.append("ms");
            DeviceLog.debug(k.toString());
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_END, str2, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        long j4 = j2;
        DeviceLog.debug("Unity Ads cache: downloading of " + str2 + " stopped");
        WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_STOPPED, str2, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(elapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    public void handleMessage(Message message) {
        HashMap hashMap;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            HashMap hashMap2 = new HashMap();
            for (String next : data.keySet()) {
                hashMap2.put(next, Arrays.asList(data.getStringArray(next)));
            }
            hashMap = hashMap2;
        } else {
            hashMap = null;
        }
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.CACHE, CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else if (message.what == 1) {
            downloadFile(string, string2, i, i2, i3, hashMap, z);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (z && (webRequest = this._currentRequest) != null) {
            this._active = false;
            webRequest.cancel();
        }
    }
}
