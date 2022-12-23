package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b */
public final class C3381b {

    /* renamed from: a */
    public final File f12086a;

    /* renamed from: b */
    public final File f12087b;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b$a */
    public static final class C3382a extends OutputStream {

        /* renamed from: a */
        public final FileOutputStream f12088a;

        /* renamed from: b */
        public boolean f12089b = false;

        public C3382a(File file) throws FileNotFoundException {
            this.f12088a = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.f12089b) {
                this.f12089b = true;
                this.f12088a.flush();
                try {
                    this.f12088a.getFD().sync();
                } catch (IOException unused) {
                }
                this.f12088a.close();
            }
        }

        public void flush() throws IOException {
            this.f12088a.flush();
        }

        public void write(int i) throws IOException {
            this.f12088a.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f12088a.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f12088a.write(bArr, i, i2);
        }
    }

    public C3381b(File file) {
        this.f12086a = file;
        this.f12087b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public InputStream mo14523a() throws FileNotFoundException {
        if (this.f12087b.exists()) {
            this.f12086a.delete();
            this.f12087b.renameTo(this.f12086a);
        }
        return new FileInputStream(this.f12086a);
    }

    /* renamed from: b */
    public OutputStream mo14524b() throws IOException {
        if (this.f12086a.exists()) {
            if (this.f12087b.exists()) {
                this.f12086a.delete();
            } else if (!this.f12086a.renameTo(this.f12087b)) {
                Objects.toString(this.f12086a);
                Objects.toString(this.f12087b);
            }
        }
        try {
            return new C3382a(this.f12086a);
        } catch (FileNotFoundException unused) {
            if (this.f12086a.getParentFile().mkdirs()) {
                try {
                    return new C3382a(this.f12086a);
                } catch (FileNotFoundException unused2) {
                    StringBuilder k = C13555b.m33972k("Couldn't create ");
                    k.append(this.f12086a);
                    throw new IOException(k.toString());
                }
            } else {
                StringBuilder k2 = C13555b.m33972k("Couldn't create directory ");
                k2.append(this.f12086a);
                throw new IOException(k2.toString());
            }
        }
    }
}
