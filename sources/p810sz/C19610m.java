package p810sz;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: sz.m */
public final class C19610m extends C19616q {

    /* renamed from: a */
    public final DataOutputStream f49791a;

    public C19610m(OutputStream outputStream) {
        DataOutputStream dataOutputStream;
        if (outputStream instanceof DataOutputStream) {
            dataOutputStream = (DataOutputStream) outputStream;
        } else {
            dataOutputStream = new DataOutputStream(outputStream);
        }
        this.f49791a = dataOutputStream;
    }

    /* renamed from: a */
    public final OutputStream mo51933a() {
        return new C19611a();
    }

    /* renamed from: b */
    public final void mo51934b(boolean z) throws IOException {
        this.f49791a.writeBoolean(z);
    }

    /* renamed from: c */
    public final void mo51935c(int i) throws IOException {
        this.f49791a.writeByte(i);
    }

    /* renamed from: f */
    public final void mo51936f(char c) throws IOException {
        this.f49791a.writeChar(c);
    }

    /* renamed from: i */
    public final void mo51937i(double d) throws IOException {
        this.f49791a.writeDouble(d);
    }

    /* renamed from: j */
    public final void mo51938j(float f) throws IOException {
        this.f49791a.writeFloat(f);
    }

    /* renamed from: l */
    public final void mo51939l(int i) throws IOException {
        this.f49791a.writeInt(i);
    }

    /* renamed from: m */
    public final void mo51940m(long j) throws IOException {
        this.f49791a.writeLong(j);
    }

    /* renamed from: r */
    public final void mo51941r(int i) throws IOException {
        this.f49791a.writeShort(i);
    }

    /* renamed from: sz.m$a */
    public class C19611a extends OutputStream {
        public C19611a() {
        }

        public final void write(byte[] bArr, int i, int i2) throws IOException {
            C19610m.this.f49791a.write(bArr, i, i2);
        }

        public final void write(int i) throws IOException {
            C19610m.this.f49791a.write(i);
        }
    }
}
