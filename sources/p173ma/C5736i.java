package p173ma;

import java.io.IOException;
import p265tb.C6652e;

/* renamed from: ma.i */
public interface C5736i extends C6652e {
    /* renamed from: a */
    void mo21575a(int i, int i2, byte[] bArr) throws IOException;

    /* renamed from: c */
    void mo21576c();

    /* renamed from: f */
    long mo21577f();

    /* renamed from: g */
    void mo21578g(int i) throws IOException;

    long getLength();

    long getPosition();

    /* renamed from: h */
    boolean mo21581h(int i, int i2, byte[] bArr, boolean z) throws IOException;

    /* renamed from: i */
    void mo21582i(int i) throws IOException;

    /* renamed from: j */
    boolean mo21583j(int i, int i2, byte[] bArr, boolean z) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;

    void readFully(byte[] bArr, int i, int i2) throws IOException;
}
