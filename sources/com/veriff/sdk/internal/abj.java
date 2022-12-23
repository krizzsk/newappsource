package com.veriff.sdk.internal;

import java.io.IOException;
import java.nio.channels.WritableByteChannel;

public interface abj extends abz, WritableByteChannel {
    /* renamed from: a */
    abj mo53857a(aca aca, long j) throws IOException;

    /* renamed from: b */
    abj mo53870b(String str) throws IOException;

    /* renamed from: b */
    abj mo53871b(String str, int i, int i2) throws IOException;

    /* renamed from: c */
    abi mo53875c();

    /* renamed from: c */
    abj mo53877c(byte[] bArr) throws IOException;

    /* renamed from: c */
    abj mo53878c(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: d */
    abj mo53882d(abl abl) throws IOException;

    void flush() throws IOException;

    /* renamed from: g */
    abj mo53891g(int i) throws IOException;

    /* renamed from: h */
    abj mo53894h(int i) throws IOException;

    /* renamed from: i */
    abj mo53899i(int i) throws IOException;

    /* renamed from: l */
    abj mo53907l(long j) throws IOException;

    /* renamed from: m */
    abj mo53908m(long j) throws IOException;

    /* renamed from: y */
    abj mo53924y() throws IOException;
}
