package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import p265tb.C6651d;
import p277ub.C6774a0;

public final class RawResourceDataSource extends C6651d {

    /* renamed from: e */
    public final Resources f14591e;

    /* renamed from: f */
    public final String f14592f;

    /* renamed from: g */
    public Uri f14593g;

    /* renamed from: h */
    public AssetFileDescriptor f14594h;

    /* renamed from: i */
    public FileInputStream f14595i;

    /* renamed from: j */
    public long f14596j;

    /* renamed from: k */
    public boolean f14597k;

    public static class RawResourceDataSourceException extends IOException {
        public RawResourceDataSourceException(String str) {
            super(str);
        }

        public RawResourceDataSourceException(Exception exc) {
            super(exc);
        }
    }

    public RawResourceDataSource(Context context) {
        super(false);
        this.f14591e = context.getResources();
        this.f14592f = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    public final void close() throws RawResourceDataSourceException {
        this.f14593g = null;
        try {
            FileInputStream fileInputStream = this.f14595i;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f14595i = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f14594h;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f14594h = null;
                if (this.f14597k) {
                    this.f14597k = false;
                    mo22822l();
                }
            } catch (IOException e) {
                throw new RawResourceDataSourceException((Exception) e);
            } catch (Throwable th) {
                this.f14594h = null;
                if (this.f14597k) {
                    this.f14597k = false;
                    mo22822l();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new RawResourceDataSourceException((Exception) e2);
        } catch (Throwable th2) {
            this.f14595i = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f14594h;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f14594h = null;
                if (this.f14597k) {
                    this.f14597k = false;
                    mo22822l();
                }
                throw th2;
            } catch (IOException e3) {
                throw new RawResourceDataSourceException((Exception) e3);
            } catch (Throwable th3) {
                this.f14594h = null;
                if (this.f14597k) {
                    this.f14597k = false;
                    mo22822l();
                }
                throw th3;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L_0x00a0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0151  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo16699e(p265tb.C6657i r13) throws com.google.android.exoplayer2.upstream.RawResourceDataSource.RawResourceDataSourceException {
        /*
            r12 = this;
            android.net.Uri r0 = r13.f20668a
            r12.f14593g = r0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r2 = "rawresource"
            boolean r1 = android.text.TextUtils.equals(r2, r1)
            r2 = 1
            if (r1 != 0) goto L_0x00a0
            java.lang.String r1 = r0.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0037
            java.util.List r1 = r0.getPathSegments()
            int r1 = r1.size()
            if (r1 != r2) goto L_0x0037
            java.lang.String r1 = r0.getLastPathSegment()
            r1.getClass()
            java.lang.String r4 = "\\d+"
            boolean r1 = r1.matches(r4)
            if (r1 == 0) goto L_0x0037
            goto L_0x00a0
        L_0x0037:
            java.lang.String r1 = r0.getScheme()
            boolean r1 = android.text.TextUtils.equals(r3, r1)
            if (r1 == 0) goto L_0x0098
            java.lang.String r1 = r0.getPath()
            r1.getClass()
            java.lang.String r3 = "/"
            boolean r3 = r1.startsWith(r3)
            if (r3 == 0) goto L_0x0054
            java.lang.String r1 = r1.substring(r2)
        L_0x0054:
            java.lang.String r3 = r0.getHost()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L_0x0061
            java.lang.String r3 = ""
            goto L_0x006b
        L_0x0061:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = ":"
            java.lang.String r3 = r3.concat(r4)
        L_0x006b:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r4 = r1.length()
            if (r4 == 0) goto L_0x007e
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0083
        L_0x007e:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0083:
            android.content.res.Resources r3 = r12.f14591e
            java.lang.String r4 = r12.f14592f
            java.lang.String r5 = "raw"
            int r1 = r3.getIdentifier(r1, r5, r4)
            if (r1 == 0) goto L_0x0090
            goto L_0x00ab
        L_0x0090:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r13 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "Resource not found."
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x0098:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r13 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "URI must either use scheme rawresource or android.resource"
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x00a0:
            java.lang.String r1 = r0.getLastPathSegment()     // Catch:{ NumberFormatException -> 0x0179 }
            r1.getClass()     // Catch:{ NumberFormatException -> 0x0179 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x0179 }
        L_0x00ab:
            r12.mo22823m(r13)
            android.content.res.Resources r3 = r12.f14591e     // Catch:{ NotFoundException -> 0x0172 }
            android.content.res.AssetFileDescriptor r1 = r3.openRawResourceFd(r1)     // Catch:{ NotFoundException -> 0x0172 }
            r12.f14594h = r1
            if (r1 == 0) goto L_0x0151
            long r3 = r1.getLength()
            java.io.FileInputStream r0 = new java.io.FileInputStream
            java.io.FileDescriptor r5 = r1.getFileDescriptor()
            r0.<init>(r5)
            r12.f14595i = r0
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x00da
            long r8 = r13.f20673f     // Catch:{ IOException -> 0x014a }
            int r10 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r10 > 0) goto L_0x00d4
            goto L_0x00da
        L_0x00d4:
            com.google.android.exoplayer2.upstream.DataSourceException r13 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014a }
            r13.<init>()     // Catch:{ IOException -> 0x014a }
            throw r13     // Catch:{ IOException -> 0x014a }
        L_0x00da:
            long r8 = r1.getStartOffset()     // Catch:{ IOException -> 0x014a }
            long r10 = r13.f20673f     // Catch:{ IOException -> 0x014a }
            long r10 = r10 + r8
            long r10 = r0.skip(r10)     // Catch:{ IOException -> 0x014a }
            long r10 = r10 - r8
            long r8 = r13.f20673f     // Catch:{ IOException -> 0x014a }
            int r1 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0144
            r8 = 0
            if (r7 != 0) goto L_0x0115
            java.nio.channels.FileChannel r0 = r0.getChannel()     // Catch:{ IOException -> 0x014a }
            long r3 = r0.size()     // Catch:{ IOException -> 0x014a }
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x00ff
            r12.f14596j = r5     // Catch:{ IOException -> 0x014a }
            goto L_0x011c
        L_0x00ff:
            long r3 = r0.size()     // Catch:{ IOException -> 0x014a }
            long r0 = r0.position()     // Catch:{ IOException -> 0x014a }
            long r3 = r3 - r0
            r12.f14596j = r3     // Catch:{ IOException -> 0x014a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x010f
            goto L_0x011c
        L_0x010f:
            com.google.android.exoplayer2.upstream.DataSourceException r13 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014a }
            r13.<init>()     // Catch:{ IOException -> 0x014a }
            throw r13     // Catch:{ IOException -> 0x014a }
        L_0x0115:
            long r3 = r3 - r10
            r12.f14596j = r3     // Catch:{ IOException -> 0x014a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x013e
        L_0x011c:
            long r0 = r13.f20674g
            int r3 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x012f
            long r3 = r12.f14596j
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0129
            goto L_0x012d
        L_0x0129:
            long r0 = java.lang.Math.min(r3, r0)
        L_0x012d:
            r12.f14596j = r0
        L_0x012f:
            r12.f14597k = r2
            r12.mo22824n(r13)
            long r0 = r13.f20674g
            int r13 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r13 == 0) goto L_0x013b
            goto L_0x013d
        L_0x013b:
            long r0 = r12.f14596j
        L_0x013d:
            return r0
        L_0x013e:
            com.google.android.exoplayer2.upstream.DataSourceException r13 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014a }
            r13.<init>()     // Catch:{ IOException -> 0x014a }
            throw r13     // Catch:{ IOException -> 0x014a }
        L_0x0144:
            com.google.android.exoplayer2.upstream.DataSourceException r13 = new com.google.android.exoplayer2.upstream.DataSourceException     // Catch:{ IOException -> 0x014a }
            r13.<init>()     // Catch:{ IOException -> 0x014a }
            throw r13     // Catch:{ IOException -> 0x014a }
        L_0x014a:
            r13 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r0.<init>((java.lang.Exception) r13)
            throw r0
        L_0x0151:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r13 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r1 = r0.length()
            int r1 = r1 + 24
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Resource is compressed: "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r13.<init>((java.lang.String) r0)
            throw r13
        L_0x0172:
            r13 = move-exception
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r0 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            r0.<init>((java.lang.Exception) r13)
            throw r0
        L_0x0179:
            com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException r13 = new com.google.android.exoplayer2.upstream.RawResourceDataSource$RawResourceDataSourceException
            java.lang.String r0 = "Resource identifier must be an integer."
            r13.<init>((java.lang.String) r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.mo16699e(tb.i):long");
    }

    public final Uri getUri() {
        return this.f14593g;
    }

    public final int read(byte[] bArr, int i, int i2) throws RawResourceDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14596j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new RawResourceDataSourceException((Exception) e);
            }
        }
        FileInputStream fileInputStream = this.f14595i;
        int i3 = C6774a0.f20959a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read != -1) {
            long j2 = this.f14596j;
            if (j2 != -1) {
                this.f14596j = j2 - ((long) read);
            }
            mo22821k(read);
            return read;
        } else if (this.f14596j == -1) {
            return -1;
        } else {
            throw new RawResourceDataSourceException((Exception) new EOFException());
        }
    }
}
