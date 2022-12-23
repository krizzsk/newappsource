package p810sz;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: sz.d */
public final class C19578d extends C19615p {

    /* renamed from: a */
    public final DataInputStream f49763a;

    public C19578d(InputStream inputStream) {
        DataInputStream dataInputStream;
        if (inputStream instanceof DataInputStream) {
            dataInputStream = (DataInputStream) inputStream;
        } else {
            dataInputStream = new DataInputStream(inputStream);
        }
        this.f49763a = dataInputStream;
    }

    /* renamed from: a */
    public final InputStream mo51918a() {
        return new C19579a();
    }

    /* renamed from: b */
    public final boolean mo51919b() throws IOException {
        return this.f49763a.readBoolean();
    }

    /* renamed from: c */
    public final byte mo51920c() throws IOException {
        return this.f49763a.readByte();
    }

    /* renamed from: e */
    public final char mo51921e() throws IOException {
        return this.f49763a.readChar();
    }

    /* renamed from: i */
    public final double mo51922i() throws IOException {
        return this.f49763a.readDouble();
    }

    /* renamed from: j */
    public final float mo51923j() throws IOException {
        return this.f49763a.readFloat();
    }

    /* renamed from: l */
    public final int mo51924l() throws IOException {
        return this.f49763a.readInt();
    }

    /* renamed from: m */
    public final long mo51925m() throws IOException {
        return this.f49763a.readLong();
    }

    /* renamed from: r */
    public final short mo51926r() throws IOException {
        return this.f49763a.readShort();
    }

    /* renamed from: sz.d$a */
    public class C19579a extends InputStream {
        public C19579a() {
        }

        public final int available() throws IOException {
            return C19578d.this.f49763a.available();
        }

        public final int read() throws IOException {
            return C19578d.this.f49763a.read();
        }

        public final long skip(long j) throws IOException {
            return C19578d.this.f49763a.skip(j);
        }

        public final int read(byte[] bArr, int i, int i2) throws IOException {
            return C19578d.this.f49763a.read(bArr, i, i2);
        }
    }
}
