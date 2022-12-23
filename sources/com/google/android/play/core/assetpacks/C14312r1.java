package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* renamed from: com.google.android.play.core.assetpacks.r1 */
public final class C14312r1 extends InputStream {

    /* renamed from: b */
    public final Enumeration f36016b;

    /* renamed from: c */
    public FileInputStream f36017c;

    public C14312r1(Enumeration enumeration) throws IOException {
        this.f36016b = enumeration;
        mo42885e();
    }

    public final void close() throws IOException {
        super.close();
        FileInputStream fileInputStream = this.f36017c;
        if (fileInputStream != null) {
            fileInputStream.close();
            this.f36017c = null;
        }
    }

    /* renamed from: e */
    public final void mo42885e() throws IOException {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = this.f36017c;
        if (fileInputStream2 != null) {
            fileInputStream2.close();
        }
        if (this.f36016b.hasMoreElements()) {
            fileInputStream = new FileInputStream((File) this.f36016b.nextElement());
        } else {
            fileInputStream = null;
        }
        this.f36017c = fileInputStream;
    }

    public final int read() throws IOException {
        while (true) {
            FileInputStream fileInputStream = this.f36017c;
            if (fileInputStream == null) {
                return -1;
            }
            int read = fileInputStream.read();
            if (read != -1) {
                return read;
            }
            mo42885e();
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f36017c == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        } else if (i2 == 0) {
            return 0;
        } else {
            do {
                int read = this.f36017c.read(bArr, i, i2);
                if (read > 0) {
                    return read;
                }
                mo42885e();
            } while (this.f36017c != null);
            return -1;
        }
    }
}
