package com.veriff.sdk.internal;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: com.veriff.sdk.internal.yt */
public abstract class C22754yt {
    /* renamed from: a */
    public static C22754yt m55735a(C22742yn ynVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (ynVar != null && (charset = ynVar.mo57331b()) == null) {
            charset = StandardCharsets.UTF_8;
            ynVar = C22742yn.m55640b(ynVar + "; charset=utf-8");
        }
        return m55736a(ynVar, str.getBytes(charset));
    }

    /* renamed from: a */
    public abstract C22742yn mo54065a();

    /* renamed from: a */
    public abstract void mo54066a(abj abj) throws IOException;

    /* renamed from: b */
    public long mo54067b() throws IOException {
        return -1;
    }

    /* renamed from: c */
    public boolean mo57412c() {
        return false;
    }

    /* renamed from: d */
    public boolean mo57413d() {
        return false;
    }

    /* renamed from: a */
    public static C22754yt m55734a(final C22742yn ynVar, final abl abl) {
        return new C22754yt() {
            /* renamed from: a */
            public C22742yn mo54065a() {
                return C22742yn.this;
            }

            /* renamed from: b */
            public long mo54067b() throws IOException {
                return (long) abl.mo53946h();
            }

            /* renamed from: a */
            public void mo54066a(abj abj) throws IOException {
                abj.mo53882d(abl);
            }
        };
    }

    /* renamed from: a */
    public static C22754yt m55736a(C22742yn ynVar, byte[] bArr) {
        return m55737a(ynVar, bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public static C22754yt m55737a(final C22742yn ynVar, final byte[] bArr, final int i, final int i2) {
        if (bArr != null) {
            C22766za.m55833a((long) bArr.length, (long) i, (long) i2);
            return new C22754yt() {
                /* renamed from: a */
                public C22742yn mo54065a() {
                    return C22742yn.this;
                }

                /* renamed from: b */
                public long mo54067b() {
                    return (long) i2;
                }

                /* renamed from: a */
                public void mo54066a(abj abj) throws IOException {
                    abj.mo53878c(bArr, i, i2);
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}
