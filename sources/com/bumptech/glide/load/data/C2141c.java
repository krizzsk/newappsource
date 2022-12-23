package com.bumptech.glide.load.data;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.OutputStream;
import p072e6.C4564b;

/* renamed from: com.bumptech.glide.load.data.c */
public final class C2141c extends OutputStream {

    /* renamed from: b */
    public final OutputStream f6958b;

    /* renamed from: c */
    public byte[] f6959c;

    /* renamed from: d */
    public C4564b f6960d;

    /* renamed from: e */
    public int f6961e;

    public C2141c(OutputStream outputStream, C4564b bVar) {
        this.f6958b = outputStream;
        this.f6960d = bVar;
        this.f6959c = (byte[]) bVar.mo20074c(SQLiteDatabase.OPEN_FULLMUTEX, byte[].class);
    }

    /* JADX INFO: finally extract failed */
    public final void close() throws IOException {
        try {
            flush();
            this.f6958b.close();
            byte[] bArr = this.f6959c;
            if (bArr != null) {
                this.f6960d.put(bArr);
                this.f6959c = null;
            }
        } catch (Throwable th) {
            this.f6958b.close();
            throw th;
        }
    }

    public final void flush() throws IOException {
        int i = this.f6961e;
        if (i > 0) {
            this.f6958b.write(this.f6959c, 0, i);
            this.f6961e = 0;
        }
        this.f6958b.flush();
    }

    public final void write(int i) throws IOException {
        byte[] bArr = this.f6959c;
        int i2 = this.f6961e;
        int i3 = i2 + 1;
        this.f6961e = i3;
        bArr[i2] = (byte) i;
        if (i3 == bArr.length && i3 > 0) {
            this.f6958b.write(bArr, 0, i3);
            this.f6961e = 0;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            int i6 = this.f6961e;
            if (i6 != 0 || i4 < this.f6959c.length) {
                int min = Math.min(i4, this.f6959c.length - i6);
                System.arraycopy(bArr, i5, this.f6959c, this.f6961e, min);
                int i7 = this.f6961e + min;
                this.f6961e = i7;
                i3 += min;
                byte[] bArr2 = this.f6959c;
                if (i7 == bArr2.length && i7 > 0) {
                    this.f6958b.write(bArr2, 0, i7);
                    this.f6961e = 0;
                    continue;
                }
            } else {
                this.f6958b.write(bArr, i5, i4);
                return;
            }
        } while (i3 < i2);
    }
}
