package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.facebook.ads.AdError;
import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import p001a0.C0017h;

public final class zzfe extends zzek implements zzfo {
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final zzfn zzf;
    private final zzfn zzg;
    private zzew zzh;
    private HttpURLConnection zzi;
    private InputStream zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private long zzn;

    @Deprecated
    public zzfe() {
        this((String) null, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, false, (zzfn) null, (zzfot) null, false);
    }

    public /* synthetic */ zzfe(String str, int i, int i2, boolean z, zzfn zzfn, zzfot zzfot, boolean z2, zzfd zzfd) {
        this(str, i, i2, z, zzfn, (zzfot) null, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0088  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.net.HttpURLConnection zzk(java.net.URL r3, int r4, byte[] r5, long r6, long r8, boolean r10, boolean r11, java.util.Map r12) throws java.io.IOException {
        /*
            r2 = this;
            java.net.URLConnection r3 = r3.openConnection()
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3
            int r4 = r2.zzc
            r3.setConnectTimeout(r4)
            int r4 = r2.zzd
            r3.setReadTimeout(r4)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            com.google.android.gms.internal.ads.zzfn r5 = r2.zzf
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            com.google.android.gms.internal.ads.zzfn r5 = r2.zzg
            java.util.Map r5 = r5.zza()
            r4.putAll(r5)
            r4.putAll(r12)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0032:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004e
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r12 = r5.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r5 = r5.getValue()
            java.lang.String r5 = (java.lang.String) r5
            r3.setRequestProperty(r12, r5)
            goto L_0x0032
        L_0x004e:
            r4 = 0
            r0 = -1
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L_0x005d
            int r6 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x005c
            r4 = 0
            goto L_0x0072
        L_0x005c:
            r6 = r4
        L_0x005d:
            java.lang.String r4 = "bytes="
            java.lang.String r5 = "-"
            java.lang.StringBuilder r4 = p379.C16759e.m42351g(r4, r6, r5)
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 == 0) goto L_0x006e
            long r6 = r6 + r8
            long r6 = r6 + r0
            r4.append(r6)
        L_0x006e:
            java.lang.String r4 = r4.toString()
        L_0x0072:
            if (r4 == 0) goto L_0x0079
            java.lang.String r5 = "Range"
            r3.setRequestProperty(r5, r4)
        L_0x0079:
            java.lang.String r4 = r2.zze
            if (r4 == 0) goto L_0x0082
            java.lang.String r5 = "User-Agent"
            r3.setRequestProperty(r5, r4)
        L_0x0082:
            r4 = 1
            if (r4 == r10) goto L_0x0088
            java.lang.String r5 = "identity"
            goto L_0x008a
        L_0x0088:
            java.lang.String r5 = "gzip"
        L_0x008a:
            java.lang.String r6 = "Accept-Encoding"
            r3.setRequestProperty(r6, r5)
            r3.setInstanceFollowRedirects(r11)
            r5 = 0
            r3.setDoOutput(r5)
            java.lang.String r4 = com.google.android.gms.internal.ads.zzew.zza(r4)
            r3.setRequestMethod(r4)
            r3.connect()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfe.zzk(java.net.URL, int, byte[], long, long, boolean, boolean, java.util.Map):java.net.HttpURLConnection");
    }

    private final URL zzl(URL url, String str, zzew zzew) throws zzfk {
        if (str != null) {
            try {
                URL url2 = new URL(url, str);
                String protocol = url2.getProtocol();
                if (!"https".equals(protocol) && !"http".equals(protocol)) {
                    throw new zzfk("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), zzew, (int) AdError.INTERNAL_ERROR_CODE, 1);
                } else if (this.zzb || protocol.equals(url.getProtocol())) {
                    return url2;
                } else {
                    throw new zzfk(C0017h.m56M("Disallowed cross-protocol redirect (", url.getProtocol(), " to ", protocol, ")"), zzew, (int) AdError.INTERNAL_ERROR_CODE, 1);
                }
            } catch (MalformedURLException e) {
                throw new zzfk((IOException) e, zzew, (int) AdError.INTERNAL_ERROR_CODE, 1);
            }
        } else {
            throw new zzfk("Null location redirect", zzew, (int) AdError.INTERNAL_ERROR_CODE, 1);
        }
    }

    private final void zzm() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                zzdn.zza("DefaultHttpDataSource", "Unexpected error while disconnecting", e);
            }
            this.zzi = null;
        }
    }

    public final int zza(byte[] bArr, int i, int i2) throws zzfk {
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.zzm;
            if (j != -1) {
                long j2 = j - this.zzn;
                if (j2 == 0) {
                    return -1;
                }
                i2 = (int) Math.min((long) i2, j2);
            }
            InputStream inputStream = this.zzj;
            int i3 = zzeg.zza;
            int read = inputStream.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            this.zzn += (long) read;
            zzg(read);
            return read;
        } catch (IOException e) {
            zzew zzew = this.zzh;
            int i4 = zzeg.zza;
            throw zzfk.zza(e, zzew, 2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b0, code lost:
        if (r8 != 0) goto L_0x00b4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long zzb(com.google.android.gms.internal.ads.zzew r25) throws com.google.android.gms.internal.ads.zzfk {
        /*
            r24 = this;
            r12 = r24
            r13 = r25
            r12.zzh = r13
            r14 = 0
            r12.zzn = r14
            r12.zzm = r14
            r24.zzi(r25)
            r11 = 1
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x01ef }
            android.net.Uri r0 = r13.zza     // Catch:{ IOException -> 0x01ef }
            java.lang.String r0 = r0.toString()     // Catch:{ IOException -> 0x01ef }
            r2.<init>(r0)     // Catch:{ IOException -> 0x01ef }
            long r9 = r13.zzf     // Catch:{ IOException -> 0x01ef }
            long r7 = r13.zzg     // Catch:{ IOException -> 0x01ef }
            boolean r0 = r13.zzb(r11)     // Catch:{ IOException -> 0x01ef }
            boolean r1 = r12.zzb     // Catch:{ IOException -> 0x01ef }
            r5 = 0
            if (r1 != 0) goto L_0x003d
            r3 = 1
            r4 = 0
            r16 = 1
            java.util.Map r6 = r13.zzd     // Catch:{ IOException -> 0x01ef }
            r1 = r24
            r17 = r6
            r5 = r9
            r9 = r0
            r10 = r16
            r11 = r17
            java.net.HttpURLConnection r0 = r1.zzk(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x01ef }
            goto L_0x0087
        L_0x003d:
            r11 = r2
            r5 = 0
        L_0x003f:
            int r6 = r5 + 1
            r1 = 20
            if (r5 > r1) goto L_0x01ca
            r3 = 1
            r4 = 0
            r16 = 0
            java.util.Map r5 = r13.zzd     // Catch:{ IOException -> 0x01ef }
            r1 = r24
            r2 = r11
            r17 = r5
            r18 = r6
            r5 = r9
            r19 = r7
            r21 = r9
            r9 = r0
            r10 = r16
            r23 = r11
            r11 = r17
            java.net.HttpURLConnection r1 = r1.zzk(r2, r3, r4, r5, r7, r9, r10, r11)     // Catch:{ IOException -> 0x01ef }
            int r2 = r1.getResponseCode()     // Catch:{ IOException -> 0x01ef }
            java.lang.String r3 = "Location"
            java.lang.String r3 = r1.getHeaderField(r3)     // Catch:{ IOException -> 0x01ef }
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 301(0x12d, float:4.22E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 302(0x12e, float:4.23E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 303(0x12f, float:4.25E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 307(0x133, float:4.3E-43)
            if (r2 == r4) goto L_0x01b7
            r4 = 308(0x134, float:4.32E-43)
            if (r2 != r4) goto L_0x0086
            goto L_0x01b7
        L_0x0086:
            r0 = r1
        L_0x0087:
            r12.zzi = r0     // Catch:{ IOException -> 0x01ef }
            int r1 = r0.getResponseCode()     // Catch:{ IOException -> 0x01ef }
            r12.zzl = r1     // Catch:{ IOException -> 0x01ef }
            java.lang.String r3 = r0.getResponseMessage()     // Catch:{ IOException -> 0x01ef }
            int r1 = r12.zzl
            r2 = 2008(0x7d8, float:2.814E-42)
            java.lang.String r4 = "Content-Range"
            r5 = 200(0xc8, float:2.8E-43)
            r6 = -1
            if (r1 < r5) goto L_0x015f
            r8 = 299(0x12b, float:4.19E-43)
            if (r1 <= r8) goto L_0x00a5
            goto L_0x015f
        L_0x00a5:
            r0.getContentType()
            int r1 = r12.zzl
            if (r1 != r5) goto L_0x00b3
            long r8 = r13.zzf
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 == 0) goto L_0x00b3
            goto L_0x00b4
        L_0x00b3:
            r8 = r14
        L_0x00b4:
            java.lang.String r1 = "Content-Encoding"
            java.lang.String r1 = r0.getHeaderField(r1)
            java.lang.String r3 = "gzip"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 != 0) goto L_0x00e2
            long r10 = r13.zzg
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 == 0) goto L_0x00cb
            r12.zzm = r10
            goto L_0x00e6
        L_0x00cb:
            java.lang.String r3 = "Content-Length"
            java.lang.String r3 = r0.getHeaderField(r3)
            java.lang.String r4 = r0.getHeaderField(r4)
            long r3 = com.google.android.gms.internal.ads.zzfp.zza(r3, r4)
            int r5 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x00df
            long r6 = r3 - r8
        L_0x00df:
            r12.zzm = r6
            goto L_0x00e6
        L_0x00e2:
            long r3 = r13.zzg
            r12.zzm = r3
        L_0x00e6:
            r3 = 2000(0x7d0, float:2.803E-42)
            java.io.InputStream r0 = r0.getInputStream()     // Catch:{ IOException -> 0x0154 }
            r12.zzj = r0     // Catch:{ IOException -> 0x0154 }
            if (r1 == 0) goto L_0x00f9
            java.util.zip.GZIPInputStream r0 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x0154 }
            java.io.InputStream r1 = r12.zzj     // Catch:{ IOException -> 0x0154 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0154 }
            r12.zzj = r0     // Catch:{ IOException -> 0x0154 }
        L_0x00f9:
            r5 = 1
            r12.zzk = r5
            r24.zzj(r25)
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            goto L_0x0140
        L_0x0104:
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]     // Catch:{ IOException -> 0x0143 }
        L_0x0108:
            int r1 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r1 <= 0) goto L_0x0140
            r6 = 4096(0x1000, double:2.0237E-320)
            long r6 = java.lang.Math.min(r8, r6)     // Catch:{ IOException -> 0x0143 }
            int r1 = (int) r6     // Catch:{ IOException -> 0x0143 }
            java.io.InputStream r4 = r12.zzj     // Catch:{ IOException -> 0x0143 }
            int r6 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ IOException -> 0x0143 }
            r6 = 0
            int r1 = r4.read(r0, r6, r1)     // Catch:{ IOException -> 0x0143 }
            java.lang.Thread r4 = java.lang.Thread.currentThread()     // Catch:{ IOException -> 0x0143 }
            boolean r4 = r4.isInterrupted()     // Catch:{ IOException -> 0x0143 }
            if (r4 != 0) goto L_0x0135
            r4 = -1
            if (r1 == r4) goto L_0x012f
            long r10 = (long) r1     // Catch:{ IOException -> 0x0143 }
            long r8 = r8 - r10
            r12.zzg(r1)     // Catch:{ IOException -> 0x0143 }
            goto L_0x0108
        L_0x012f:
            com.google.android.gms.internal.ads.zzfk r0 = new com.google.android.gms.internal.ads.zzfk     // Catch:{ IOException -> 0x0143 }
            r0.<init>(r13, r2, r5)     // Catch:{ IOException -> 0x0143 }
            throw r0     // Catch:{ IOException -> 0x0143 }
        L_0x0135:
            com.google.android.gms.internal.ads.zzfk r0 = new com.google.android.gms.internal.ads.zzfk     // Catch:{ IOException -> 0x0143 }
            java.io.InterruptedIOException r1 = new java.io.InterruptedIOException     // Catch:{ IOException -> 0x0143 }
            r1.<init>()     // Catch:{ IOException -> 0x0143 }
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.zzew) r13, (int) r3, (int) r5)     // Catch:{ IOException -> 0x0143 }
            throw r0     // Catch:{ IOException -> 0x0143 }
        L_0x0140:
            long r0 = r12.zzm
            return r0
        L_0x0143:
            r0 = move-exception
            r24.zzm()
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.zzfk
            if (r1 == 0) goto L_0x014e
            com.google.android.gms.internal.ads.zzfk r0 = (com.google.android.gms.internal.ads.zzfk) r0
            throw r0
        L_0x014e:
            com.google.android.gms.internal.ads.zzfk r1 = new com.google.android.gms.internal.ads.zzfk
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.zzew) r13, (int) r3, (int) r5)
            throw r1
        L_0x0154:
            r0 = move-exception
            r5 = 1
            r24.zzm()
            com.google.android.gms.internal.ads.zzfk r1 = new com.google.android.gms.internal.ads.zzfk
            r1.<init>((java.io.IOException) r0, (com.google.android.gms.internal.ads.zzew) r13, (int) r3, (int) r5)
            throw r1
        L_0x015f:
            r5 = 1
            java.util.Map r8 = r0.getHeaderFields()
            int r1 = r12.zzl
            r9 = 416(0x1a0, float:5.83E-43)
            if (r1 != r9) goto L_0x0186
            java.lang.String r1 = r0.getHeaderField(r4)
            long r10 = com.google.android.gms.internal.ads.zzfp.zzb(r1)
            r4 = r3
            long r2 = r13.zzf
            int r16 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r16 != 0) goto L_0x0187
            r12.zzk = r5
            r24.zzj(r25)
            long r0 = r13.zzg
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x0185
            return r0
        L_0x0185:
            return r14
        L_0x0186:
            r4 = r3
        L_0x0187:
            java.io.InputStream r0 = r0.getErrorStream()
            if (r0 == 0) goto L_0x0192
            byte[] r0 = com.google.android.gms.internal.ads.zzeg.zzaa(r0)     // Catch:{ IOException -> 0x0196 }
            goto L_0x0194
        L_0x0192:
            byte[] r0 = com.google.android.gms.internal.ads.zzeg.zzf     // Catch:{ IOException -> 0x0196 }
        L_0x0194:
            r7 = r0
            goto L_0x0199
        L_0x0196:
            byte[] r0 = com.google.android.gms.internal.ads.zzeg.zzf
            goto L_0x0194
        L_0x0199:
            r24.zzm()
            int r0 = r12.zzl
            if (r0 != r9) goto L_0x01a8
            com.google.android.gms.internal.ads.zzes r0 = new com.google.android.gms.internal.ads.zzes
            r1 = 2008(0x7d8, float:2.814E-42)
            r0.<init>(r1)
            goto L_0x01a9
        L_0x01a8:
            r0 = 0
        L_0x01a9:
            com.google.android.gms.internal.ads.zzfm r9 = new com.google.android.gms.internal.ads.zzfm
            int r2 = r12.zzl
            r1 = r9
            r3 = r4
            r4 = r0
            r5 = r8
            r6 = r25
            r1.<init>(r2, r3, r4, r5, r6, r7)
            throw r9
        L_0x01b7:
            r5 = 1
            r6 = 0
            r1.disconnect()     // Catch:{ IOException -> 0x01ed }
            r2 = r23
            java.net.URL r11 = r12.zzl(r2, r3, r13)     // Catch:{ IOException -> 0x01ed }
            r5 = r18
            r7 = r19
            r9 = r21
            goto L_0x003f
        L_0x01ca:
            r18 = r6
            r5 = 1
            com.google.android.gms.internal.ads.zzfk r0 = new com.google.android.gms.internal.ads.zzfk     // Catch:{ IOException -> 0x01ed }
            java.net.NoRouteToHostException r1 = new java.net.NoRouteToHostException     // Catch:{ IOException -> 0x01ed }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x01ed }
            r2.<init>()     // Catch:{ IOException -> 0x01ed }
            java.lang.String r3 = "Too many redirects: "
            r2.append(r3)     // Catch:{ IOException -> 0x01ed }
            r3 = r18
            r2.append(r3)     // Catch:{ IOException -> 0x01ed }
            java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01ed }
            r1.<init>(r2)     // Catch:{ IOException -> 0x01ed }
            r2 = 2001(0x7d1, float:2.804E-42)
            r0.<init>((java.io.IOException) r1, (com.google.android.gms.internal.ads.zzew) r13, (int) r2, (int) r5)     // Catch:{ IOException -> 0x01ed }
            throw r0     // Catch:{ IOException -> 0x01ed }
        L_0x01ed:
            r0 = move-exception
            goto L_0x01f1
        L_0x01ef:
            r0 = move-exception
            r5 = 1
        L_0x01f1:
            r24.zzm()
            com.google.android.gms.internal.ads.zzfk r0 = com.google.android.gms.internal.ads.zzfk.zza(r0, r13, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfe.zzb(com.google.android.gms.internal.ads.zzew):long");
    }

    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.zzi;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|(1:6)(1:7)|8|(5:13|14|(2:16|(1:18))(2:19|(1:21))|22|(4:26|27|28|29))|30|31) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd() throws com.google.android.gms.internal.ads.zzfk {
        /*
            r10 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r10.zzj     // Catch:{ all -> 0x008a }
            if (r2 == 0) goto L_0x007b
            long r3 = r10.zzm     // Catch:{ all -> 0x008a }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0010
            r3 = r5
            goto L_0x0013
        L_0x0010:
            long r7 = r10.zzn     // Catch:{ all -> 0x008a }
            long r3 = r3 - r7
        L_0x0013:
            java.net.HttpURLConnection r7 = r10.zzi     // Catch:{ all -> 0x008a }
            if (r7 == 0) goto L_0x0069
            int r8 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ all -> 0x008a }
            r9 = 20
            if (r8 <= r9) goto L_0x001e
            goto L_0x0069
        L_0x001e:
            java.io.InputStream r7 = r7.getInputStream()     // Catch:{ Exception -> 0x0069 }
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 != 0) goto L_0x002e
            int r3 = r7.read()     // Catch:{ Exception -> 0x0069 }
            r4 = -1
            if (r3 == r4) goto L_0x0069
            goto L_0x0035
        L_0x002e:
            r5 = 2048(0x800, double:1.0118E-320)
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 > 0) goto L_0x0035
            goto L_0x0069
        L_0x0035:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r3 = r3.getName()     // Catch:{ Exception -> 0x0069 }
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream"
            boolean r4 = r4.equals(r3)     // Catch:{ Exception -> 0x0069 }
            if (r4 != 0) goto L_0x004d
            java.lang.String r4 = "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream"
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x0069 }
            if (r3 == 0) goto L_0x0069
        L_0x004d:
            java.lang.Class r3 = r7.getClass()     // Catch:{ Exception -> 0x0069 }
            java.lang.Class r3 = r3.getSuperclass()     // Catch:{ Exception -> 0x0069 }
            r3.getClass()
            java.lang.String r4 = "unexpectedEndOfInput"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0069 }
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r4, r5)     // Catch:{ Exception -> 0x0069 }
            r4 = 1
            r3.setAccessible(r4)     // Catch:{ Exception -> 0x0069 }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0069 }
            r3.invoke(r7, r4)     // Catch:{ Exception -> 0x0069 }
        L_0x0069:
            r2.close()     // Catch:{ IOException -> 0x006d }
            goto L_0x007b
        L_0x006d:
            r2 = move-exception
            com.google.android.gms.internal.ads.zzfk r3 = new com.google.android.gms.internal.ads.zzfk     // Catch:{ all -> 0x008a }
            com.google.android.gms.internal.ads.zzew r4 = r10.zzh     // Catch:{ all -> 0x008a }
            int r5 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ all -> 0x008a }
            r5 = 2000(0x7d0, float:2.803E-42)
            r6 = 3
            r3.<init>((java.io.IOException) r2, (com.google.android.gms.internal.ads.zzew) r4, (int) r5, (int) r6)     // Catch:{ all -> 0x008a }
            throw r3     // Catch:{ all -> 0x008a }
        L_0x007b:
            r10.zzj = r0
            r10.zzm()
            boolean r0 = r10.zzk
            if (r0 == 0) goto L_0x0089
            r10.zzk = r1
            r10.zzh()
        L_0x0089:
            return
        L_0x008a:
            r2 = move-exception
            r10.zzj = r0
            r10.zzm()
            boolean r0 = r10.zzk
            if (r0 == 0) goto L_0x0099
            r10.zzk = r1
            r10.zzh()
        L_0x0099:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfe.zzd():void");
    }

    public final Map zze() {
        HttpURLConnection httpURLConnection = this.zzi;
        return httpURLConnection == null ? zzfrk.zzd() : new zzfc(httpURLConnection.getHeaderFields());
    }

    private zzfe(String str, int i, int i2, boolean z, zzfn zzfn, zzfot zzfot, boolean z2) {
        super(true);
        this.zze = str;
        this.zzc = i;
        this.zzd = i2;
        this.zzb = z;
        this.zzf = zzfn;
        this.zzg = new zzfn();
    }
}
