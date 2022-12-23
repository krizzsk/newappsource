package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import p265tb.C6651d;
import p265tb.C6657i;
import p277ub.C6774a0;

public final class AssetDataSource extends C6651d {

    /* renamed from: e */
    public final AssetManager f14558e;

    /* renamed from: f */
    public Uri f14559f;

    /* renamed from: g */
    public InputStream f14560g;

    /* renamed from: h */
    public long f14561h;

    /* renamed from: i */
    public boolean f14562i;

    public static final class AssetDataSourceException extends IOException {
        public AssetDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public AssetDataSource(Context context) {
        super(false);
        this.f14558e = context.getAssets();
    }

    public final void close() throws AssetDataSourceException {
        this.f14559f = null;
        try {
            InputStream inputStream = this.f14560g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.f14560g = null;
            if (this.f14562i) {
                this.f14562i = false;
                mo22822l();
            }
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        } catch (Throwable th) {
            this.f14560g = null;
            if (this.f14562i) {
                this.f14562i = false;
                mo22822l();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) throws AssetDataSourceException {
        try {
            Uri uri = iVar.f20668a;
            this.f14559f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            mo22823m(iVar);
            InputStream open = this.f14558e.open(path, 1);
            this.f14560g = open;
            if (open.skip(iVar.f20673f) >= iVar.f20673f) {
                long j = iVar.f20674g;
                if (j != -1) {
                    this.f14561h = j;
                } else {
                    long available = (long) this.f14560g.available();
                    this.f14561h = available;
                    if (available == 2147483647L) {
                        this.f14561h = -1;
                    }
                }
                this.f14562i = true;
                mo22824n(iVar);
                return this.f14561h;
            }
            throw new DataSourceException();
        } catch (IOException e) {
            throw new AssetDataSourceException(e);
        }
    }

    public final Uri getUri() {
        return this.f14559f;
    }

    public final int read(byte[] bArr, int i, int i2) throws AssetDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14561h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new AssetDataSourceException(e);
            }
        }
        InputStream inputStream = this.f14560g;
        int i3 = C6774a0.f20959a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f14561h;
        if (j2 != -1) {
            this.f14561h = j2 - ((long) read);
        }
        mo22821k(read);
        return read;
    }
}
