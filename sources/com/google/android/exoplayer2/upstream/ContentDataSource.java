package com.google.android.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import p265tb.C6651d;
import p265tb.C6657i;
import p277ub.C6774a0;

public final class ContentDataSource extends C6651d {

    /* renamed from: e */
    public final ContentResolver f14563e;

    /* renamed from: f */
    public Uri f14564f;

    /* renamed from: g */
    public AssetFileDescriptor f14565g;

    /* renamed from: h */
    public FileInputStream f14566h;

    /* renamed from: i */
    public long f14567i;

    /* renamed from: j */
    public boolean f14568j;

    public static class ContentDataSourceException extends IOException {
        public ContentDataSourceException(IOException iOException) {
            super(iOException);
        }
    }

    public ContentDataSource(Context context) {
        super(false);
        this.f14563e = context.getContentResolver();
    }

    public final void close() throws ContentDataSourceException {
        this.f14564f = null;
        try {
            FileInputStream fileInputStream = this.f14566h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.f14566h = null;
            try {
                AssetFileDescriptor assetFileDescriptor = this.f14565g;
                if (assetFileDescriptor != null) {
                    assetFileDescriptor.close();
                }
                this.f14565g = null;
                if (this.f14568j) {
                    this.f14568j = false;
                    mo22822l();
                }
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            } catch (Throwable th) {
                this.f14565g = null;
                if (this.f14568j) {
                    this.f14568j = false;
                    mo22822l();
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new ContentDataSourceException(e2);
        } catch (Throwable th2) {
            this.f14566h = null;
            try {
                AssetFileDescriptor assetFileDescriptor2 = this.f14565g;
                if (assetFileDescriptor2 != null) {
                    assetFileDescriptor2.close();
                }
                this.f14565g = null;
                if (this.f14568j) {
                    this.f14568j = false;
                    mo22822l();
                }
                throw th2;
            } catch (IOException e3) {
                throw new ContentDataSourceException(e3);
            } catch (Throwable th3) {
                this.f14565g = null;
                if (this.f14568j) {
                    this.f14568j = false;
                    mo22822l();
                }
                throw th3;
            }
        }
    }

    /* renamed from: e */
    public final long mo16699e(C6657i iVar) throws ContentDataSourceException {
        try {
            Uri uri = iVar.f20668a;
            this.f14564f = uri;
            mo22823m(iVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f14563e.openAssetFileDescriptor(uri, "r");
            this.f14565g = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                long length = openAssetFileDescriptor.getLength();
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.f14566h = fileInputStream;
                int i = (length > -1 ? 1 : (length == -1 ? 0 : -1));
                if (i != 0) {
                    if (iVar.f20673f > length) {
                        throw new DataSourceException();
                    }
                }
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(iVar.f20673f + startOffset) - startOffset;
                if (skip == iVar.f20673f) {
                    if (i == 0) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.f14567i = -1;
                        } else {
                            long position = size - channel.position();
                            this.f14567i = position;
                            if (position < 0) {
                                throw new DataSourceException();
                            }
                        }
                    } else {
                        long j = length - skip;
                        this.f14567i = j;
                        if (j < 0) {
                            throw new DataSourceException();
                        }
                    }
                    long j2 = iVar.f20674g;
                    if (j2 != -1) {
                        long j3 = this.f14567i;
                        if (j3 != -1) {
                            j2 = Math.min(j3, j2);
                        }
                        this.f14567i = j2;
                    }
                    this.f14568j = true;
                    mo22824n(iVar);
                    long j4 = iVar.f20674g;
                    if (j4 != -1) {
                        return j4;
                    }
                    return this.f14567i;
                }
                throw new DataSourceException();
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(valueOf.length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new ContentDataSourceException(e);
        }
    }

    public final Uri getUri() {
        return this.f14564f;
    }

    public final int read(byte[] bArr, int i, int i2) throws ContentDataSourceException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f14567i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, (long) i2);
            } catch (IOException e) {
                throw new ContentDataSourceException(e);
            }
        }
        FileInputStream fileInputStream = this.f14566h;
        int i3 = C6774a0.f20959a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.f14567i;
        if (j2 != -1) {
            this.f14567i = j2 - ((long) read);
        }
        mo22821k(read);
        return read;
    }
}
