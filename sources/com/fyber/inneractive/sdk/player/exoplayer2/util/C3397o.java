package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.o */
public final class C3397o extends BufferedOutputStream {

    /* renamed from: a */
    public boolean f12128a;

    public C3397o(OutputStream outputStream) {
        super(outputStream);
    }

    /* renamed from: a */
    public void mo14576a(OutputStream outputStream) {
        C3380a.m8507b(this.f12128a);
        this.out = outputStream;
        this.count = 0;
        this.f12128a = false;
    }

    public void close() throws IOException {
        this.f12128a = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            int i = C3406u.f12148a;
            throw th;
        }
    }

    public C3397o(OutputStream outputStream, int i) {
        super(outputStream, i);
    }
}
