package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: com.google.android.play.core.assetpacks.w0 */
public final class C14331w0 extends OutputStream {

    /* renamed from: b */
    public final C14316s1 f36097b = new C14316s1();

    /* renamed from: c */
    public final File f36098c;

    /* renamed from: d */
    public final C14289l2 f36099d;

    /* renamed from: e */
    public long f36100e;

    /* renamed from: f */
    public long f36101f;

    /* renamed from: g */
    public FileOutputStream f36102g;

    /* renamed from: h */
    public C14275i0 f36103h;

    public C14331w0(File file, C14289l2 l2Var) {
        this.f36098c = file;
        this.f36099d = l2Var;
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i}, 0, 1);
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        while (i2 > 0) {
            boolean z = true;
            if (this.f36100e == 0 && this.f36101f == 0) {
                int a = this.f36097b.mo42892a(bArr, i, i2);
                if (a != -1) {
                    i += a;
                    i2 -= a;
                    C14275i0 b = this.f36097b.mo42893b();
                    this.f36103h = b;
                    if (b.f35902e) {
                        this.f36100e = 0;
                        C14289l2 l2Var = this.f36099d;
                        byte[] bArr2 = b.f35903f;
                        int length = bArr2.length;
                        l2Var.f35947g++;
                        FileOutputStream fileOutputStream = new FileOutputStream(l2Var.mo42857c());
                        try {
                            fileOutputStream.write(bArr2, 0, length);
                            fileOutputStream.close();
                            this.f36101f = (long) this.f36103h.f35903f.length;
                        } catch (Throwable unused) {
                        }
                    } else {
                        if (!(b.mo42830a() == 0) || this.f36103h.mo42882g()) {
                            byte[] bArr3 = this.f36103h.f35903f;
                            C14289l2 l2Var2 = this.f36099d;
                            int length2 = bArr3.length;
                            l2Var2.f35947g++;
                            FileOutputStream fileOutputStream2 = new FileOutputStream(l2Var2.mo42857c());
                            try {
                                fileOutputStream2.write(bArr3, 0, length2);
                                fileOutputStream2.close();
                                this.f36100e = this.f36103h.f35899b;
                            } catch (Throwable unused2) {
                            }
                        } else {
                            this.f36099d.mo42862h(this.f36103h.f35903f);
                            File file = new File(this.f36098c, this.f36103h.f35898a);
                            file.getParentFile().mkdirs();
                            this.f36100e = this.f36103h.f35899b;
                            this.f36102g = new FileOutputStream(file);
                        }
                    }
                } else {
                    return;
                }
            }
            if (!this.f36103h.mo42882g()) {
                C14275i0 i0Var = this.f36103h;
                if (i0Var.f35902e) {
                    C14289l2 l2Var3 = this.f36099d;
                    long j = this.f36101f;
                    RandomAccessFile randomAccessFile = new RandomAccessFile(l2Var3.mo42857c(), "rw");
                    try {
                        randomAccessFile.seek(j);
                        randomAccessFile.write(bArr, i, i2);
                        randomAccessFile.close();
                        this.f36101f += (long) i2;
                        i3 = i2;
                    } catch (Throwable unused3) {
                    }
                } else {
                    if (i0Var.mo42830a() != 0) {
                        z = false;
                    }
                    if (z) {
                        i3 = (int) Math.min((long) i2, this.f36100e);
                        this.f36102g.write(bArr, i, i3);
                        long j2 = this.f36100e - ((long) i3);
                        this.f36100e = j2;
                        if (j2 == 0) {
                            this.f36102g.close();
                        }
                    } else {
                        i3 = (int) Math.min((long) i2, this.f36100e);
                        C14275i0 i0Var2 = this.f36103h;
                        long length3 = (((long) i0Var2.f35903f.length) + i0Var2.f35899b) - this.f36100e;
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f36099d.mo42857c(), "rw");
                        try {
                            randomAccessFile2.seek(length3);
                            randomAccessFile2.write(bArr, i, i3);
                            randomAccessFile2.close();
                            this.f36100e -= (long) i3;
                        } catch (Throwable unused4) {
                        }
                    }
                }
                i += i3;
                i2 -= i3;
            }
        }
        return;
        throw th;
        throw th;
        throw th;
        throw th;
    }
}
