package p810sz;

import android.os.Parcel;
import ce0.C21100e;
import com.appboy.support.ValidationUtils;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: sz.o */
public final class C19613o extends C19616q {

    /* renamed from: a */
    public final Parcel f49794a;

    /* renamed from: sz.o$a */
    public class C19614a extends ByteArrayOutputStream {

        /* renamed from: b */
        public boolean f49795b = false;

        public C19614a() {
        }

        public final synchronized void close() throws IOException {
            if (!this.f49795b) {
                super.close();
                C19613o.this.f49794a.writeByteArray(this.buf, 0, this.count);
                this.f49795b = true;
            }
        }
    }

    public C19613o(Parcel parcel) {
        C21100e.m49373x(parcel, "target");
        this.f49794a = parcel;
    }

    /* renamed from: v */
    public static <T> void m46994v(Parcel parcel, T t, C19600l<? super T> lVar) {
        try {
            new C19613o(parcel).mo51967q(t, lVar);
        } catch (IOException e) {
            throw new ApplicationBugException((Exception) e);
        }
    }

    /* renamed from: a */
    public final OutputStream mo51933a() {
        return new C19614a();
    }

    /* renamed from: c */
    public final void mo51935c(int i) throws IOException {
        this.f49794a.writeByte((byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
    }

    /* renamed from: d */
    public final void mo51950d(int i, byte[] bArr) throws IOException {
        this.f49794a.writeByteArray(bArr, 0, i);
    }

    /* renamed from: e */
    public final void mo51951e(byte[] bArr) {
        this.f49794a.writeByteArray(bArr);
    }

    /* renamed from: i */
    public final void mo51937i(double d) throws IOException {
        this.f49794a.writeDouble(d);
    }

    /* renamed from: j */
    public final void mo51938j(float f) throws IOException {
        this.f49794a.writeFloat(f);
    }

    /* renamed from: k */
    public final void mo51952k(float[] fArr) throws IOException {
        this.f49794a.writeFloatArray(fArr);
    }

    /* renamed from: l */
    public final void mo51939l(int i) throws IOException {
        this.f49794a.writeInt(i);
    }

    /* renamed from: m */
    public final void mo51940m(long j) throws IOException {
        this.f49794a.writeLong(j);
    }

    /* renamed from: n */
    public final void mo51953n(long[] jArr) throws IOException {
        this.f49794a.writeLongArray(jArr);
    }

    /* renamed from: p */
    public final void mo51954p(String str) throws IOException {
        this.f49794a.writeString(str);
    }

    /* renamed from: t */
    public final void mo51955t(String str) throws IOException {
        this.f49794a.writeString(str);
    }

    /* renamed from: u */
    public final void mo51956u(String[] strArr) throws IOException {
        this.f49794a.writeStringArray(strArr);
    }
}
