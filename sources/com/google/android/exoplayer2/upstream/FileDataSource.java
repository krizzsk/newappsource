package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import p265tb.C6651d;
import p265tb.C6657i;
import p277ub.C6774a0;

public final class FileDataSource extends C6651d {

    /* renamed from: e */
    public RandomAccessFile f14569e;

    /* renamed from: f */
    public Uri f14570f;

    /* renamed from: g */
    public long f14571g;

    /* renamed from: h */
    public boolean f14572h;

    public static class FileDataSourceException extends IOException {
        public FileDataSourceException(IOException iOException) {
            super(iOException);
        }

        public FileDataSourceException(String str, FileNotFoundException fileNotFoundException) {
            super(str, fileNotFoundException);
        }
    }

    public FileDataSource() {
        super(false);
    }

    /* renamed from: o */
    public static RandomAccessFile m10933o(Uri uri) throws FileDataSourceException {
        try {
            String path = uri.getPath();
            path.getClass();
            return new RandomAccessFile(path, "r");
        } catch (FileNotFoundException e) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new FileDataSourceException(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", new Object[]{uri.getPath(), uri.getQuery(), uri.getFragment()}), e);
            }
            throw new FileDataSourceException(e);
        }
    }

    public final void close() throws FileDataSourceException {
        this.f14570f = null;
        try {
            RandomAccessFile randomAccessFile = this.f14569e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.f14569e = null;
            if (this.f14572h) {
                this.f14572h = false;
                mo22822l();
            }
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        } catch (Throwable th) {
            this.f14569e = null;
            if (this.f14572h) {
                this.f14572h = false;
                mo22822l();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) throws FileDataSourceException {
        try {
            Uri uri = iVar.f20668a;
            this.f14570f = uri;
            mo22823m(iVar);
            RandomAccessFile o = m10933o(uri);
            this.f14569e = o;
            o.seek(iVar.f20673f);
            long j = iVar.f20674g;
            if (j == -1) {
                j = this.f14569e.length() - iVar.f20673f;
            }
            this.f14571g = j;
            if (j >= 0) {
                this.f14572h = true;
                mo22824n(iVar);
                return this.f14571g;
            }
            throw new DataSourceException();
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }

    public final Uri getUri() {
        return this.f14570f;
    }

    public final int read(byte[] bArr, int i, int i2) throws FileDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14571g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f14569e;
            int i3 = C6774a0.f20959a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, (long) i2));
            if (read > 0) {
                this.f14571g -= (long) read;
                mo22821k(read);
            }
            return read;
        } catch (IOException e) {
            throw new FileDataSourceException(e);
        }
    }
}
