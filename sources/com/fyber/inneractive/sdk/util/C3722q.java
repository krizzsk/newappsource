package com.fyber.inneractive.sdk.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import com.fyber.inneractive.sdk.player.C2948c;
import com.fyber.inneractive.sdk.player.C3021d;

/* renamed from: com.fyber.inneractive.sdk.util.q */
public class C3722q extends AsyncTask<Void, Void, Bitmap> {

    /* renamed from: a */
    public Context f12910a;

    /* renamed from: b */
    public C3723a f12911b;

    /* renamed from: c */
    public String f12912c;

    /* renamed from: d */
    public String f12913d = null;

    /* renamed from: e */
    public int f12914e;

    /* renamed from: com.fyber.inneractive.sdk.util.q$a */
    public interface C3723a {
    }

    public C3722q(Context context, C3723a aVar, String str, String str2, int i) {
        this.f12910a = context;
        this.f12911b = aVar;
        this.f12912c = str;
        this.f12914e = i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v18, resolved type: java.net.HttpURLConnection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.net.HttpURLConnection} */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r6v17 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00cf A[Catch:{ all -> 0x00e6, all -> 0x00f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d4 A[SYNTHETIC, Splitter:B:68:0x00d4] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x00d9 A[Catch:{ all -> 0x00e2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00de A[Catch:{ all -> 0x00e2 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object doInBackground(java.lang.Object[] r12) {
        /*
            r11 = this;
            java.lang.Void[] r12 = (java.lang.Void[]) r12
            r12 = 8192(0x2000, float:1.14794E-41)
            byte[] r0 = new byte[r12]
            r1 = 1
            r2 = 0
            r3 = 0
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00bb }
            android.content.Context r5 = r11.f12910a     // Catch:{ all -> 0x00bb }
            java.io.File r5 = r5.getFilesDir()     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = r11.f12913d     // Catch:{ all -> 0x00bb }
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x00bb }
            if (r6 == 0) goto L_0x0033
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x00bb }
            r6.<init>()     // Catch:{ all -> 0x00bb }
            java.util.UUID r7 = java.util.UUID.randomUUID()     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x00bb }
            r6.append(r7)     // Catch:{ all -> 0x00bb }
            java.lang.String r7 = ".mp4"
            r6.append(r7)     // Catch:{ all -> 0x00bb }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00bb }
            goto L_0x0035
        L_0x0033:
            java.lang.String r6 = r11.f12913d     // Catch:{ all -> 0x00bb }
        L_0x0035:
            r4.<init>(r5, r6)     // Catch:{ all -> 0x00bb }
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch:{ all -> 0x00b8 }
            r5.<init>(r4)     // Catch:{ all -> 0x00b8 }
            java.net.URL r6 = new java.net.URL     // Catch:{ all -> 0x00b5 }
            java.lang.String r7 = r11.f12912c     // Catch:{ all -> 0x00b5 }
            r6.<init>(r7)     // Catch:{ all -> 0x00b5 }
            java.net.URLConnection r6 = r6.openConnection()     // Catch:{ all -> 0x00b5 }
            java.lang.Object r6 = com.google.firebase.perf.network.FirebasePerfUrlConnection.instrument(r6)     // Catch:{ all -> 0x00b5 }
            java.net.URLConnection r6 = (java.net.URLConnection) r6     // Catch:{ all -> 0x00b5 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ all -> 0x00b5 }
            java.io.InputStream r7 = r6.getInputStream()     // Catch:{ all -> 0x00b2 }
            r8 = 0
        L_0x0055:
            int r9 = r11.f12914e     // Catch:{ all -> 0x00b0 }
            int r9 = r9 - r12
            if (r8 >= r9) goto L_0x0066
            int r9 = r7.read(r0, r2, r12)     // Catch:{ all -> 0x00b0 }
            r10 = -1
            if (r9 <= r10) goto L_0x0055
            r5.write(r0, r2, r9)     // Catch:{ all -> 0x00b0 }
            int r8 = r8 + r9
            goto L_0x0055
        L_0x0066:
            r6.disconnect()     // Catch:{ all -> 0x0072 }
            r5.close()     // Catch:{ all -> 0x0072 }
            if (r7 == 0) goto L_0x0075
            r7.close()     // Catch:{ all -> 0x0072 }
            goto L_0x0075
        L_0x0072:
            r4.delete()
        L_0x0075:
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            android.media.MediaMetadataRetriever r5 = new android.media.MediaMetadataRetriever
            r5.<init>()
            monitor-enter(r0)     // Catch:{ Exception -> 0x0097 }
            java.lang.String r6 = r4.getPath()     // Catch:{ all -> 0x0092 }
            r5.setDataSource(r6)     // Catch:{ all -> 0x0092 }
            r5.extractMetadata(r12)     // Catch:{ all -> 0x0092 }
            r6 = 1
            android.graphics.Bitmap r3 = r5.getFrameAtTime(r6)     // Catch:{ all -> 0x0092 }
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            goto L_0x00a5
        L_0x0092:
            r12 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0092 }
            throw r12     // Catch:{ Exception -> 0x0097 }
        L_0x0095:
            r12 = move-exception
            goto L_0x00ac
        L_0x0097:
            r12 = move-exception
            java.lang.String r0 = "Failed getting frame from video file%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0095 }
            java.lang.String r12 = com.fyber.inneractive.sdk.util.C3727s.m9990a((java.lang.Throwable) r12)     // Catch:{ all -> 0x0095 }
            r1[r2] = r12     // Catch:{ all -> 0x0095 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r0, r1)     // Catch:{ all -> 0x0095 }
        L_0x00a5:
            r5.release()     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            r4.delete()
            goto L_0x00e5
        L_0x00ac:
            r5.release()     // Catch:{ all -> 0x00af }
        L_0x00af:
            throw r12
        L_0x00b0:
            r12 = move-exception
            goto L_0x00c0
        L_0x00b2:
            r12 = move-exception
            r7 = r3
            goto L_0x00c0
        L_0x00b5:
            r12 = move-exception
            r6 = r3
            goto L_0x00bf
        L_0x00b8:
            r12 = move-exception
            r5 = r3
            goto L_0x00be
        L_0x00bb:
            r12 = move-exception
            r4 = r3
            r5 = r4
        L_0x00be:
            r6 = r5
        L_0x00bf:
            r7 = r6
        L_0x00c0:
            java.lang.String r0 = "Failed getting frame from video file%s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00e6 }
            java.lang.String r12 = com.fyber.inneractive.sdk.util.C3727s.m9990a((java.lang.Throwable) r12)     // Catch:{ all -> 0x00e6 }
            r1[r2] = r12     // Catch:{ all -> 0x00e6 }
            com.fyber.inneractive.sdk.util.IAlog.m9902a(r0, r1)     // Catch:{ all -> 0x00e6 }
            if (r4 == 0) goto L_0x00d2
            r4.delete()     // Catch:{ all -> 0x00e6 }
        L_0x00d2:
            if (r6 == 0) goto L_0x00d7
            r6.disconnect()     // Catch:{ all -> 0x00e2 }
        L_0x00d7:
            if (r5 == 0) goto L_0x00dc
            r5.close()     // Catch:{ all -> 0x00e2 }
        L_0x00dc:
            if (r7 == 0) goto L_0x00e5
            r7.close()     // Catch:{ all -> 0x00e2 }
            goto L_0x00e5
        L_0x00e2:
            r4.delete()
        L_0x00e5:
            return r3
        L_0x00e6:
            r12 = move-exception
            if (r6 == 0) goto L_0x00ec
            r6.disconnect()     // Catch:{ all -> 0x00f7 }
        L_0x00ec:
            if (r5 == 0) goto L_0x00f1
            r5.close()     // Catch:{ all -> 0x00f7 }
        L_0x00f1:
            if (r7 == 0) goto L_0x00fa
            r7.close()     // Catch:{ all -> 0x00f7 }
            goto L_0x00fa
        L_0x00f7:
            r4.delete()
        L_0x00fa:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.util.C3722q.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    public void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        C3723a aVar = this.f12911b;
        if (aVar != null) {
            if (bitmap != null) {
                C3021d dVar = (C3021d) aVar;
                C2948c cVar = dVar.f10318a;
                if (cVar.f10095n != null) {
                    cVar.mo13738a(bitmap);
                    C2948c cVar2 = dVar.f10318a;
                    cVar2.f10094m = null;
                    cVar2.f10095n = null;
                }
                IAlog.m9902a("MediaPlayerController: fetching video frame success!", new Object[0]);
            } else {
                C3021d dVar2 = (C3021d) aVar;
                C2948c cVar3 = dVar2.f10318a;
                if (cVar3.f10095n != null) {
                    cVar3.mo13738a((Bitmap) null);
                    C2948c cVar4 = dVar2.f10318a;
                    cVar4.f10094m = null;
                    cVar4.f10095n = null;
                }
                IAlog.m9902a("MediaPlayerController: fetching video frame failed!", new Object[0]);
            }
            this.f12911b = null;
        }
    }
}
