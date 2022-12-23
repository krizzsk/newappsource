package p810sz;

import android.os.Parcel;
import ce0.C21100e;
import com.moovit.commons.utils.ApplicationBugException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: sz.n */
public final class C19612n extends C19615p {

    /* renamed from: a */
    public final Parcel f49793a;

    public C19612n(Parcel parcel) {
        C21100e.m49373x(parcel, "source");
        this.f49793a = parcel;
    }

    /* renamed from: v */
    public static <T> T m46981v(Parcel parcel, C19589j<T> jVar) {
        try {
            return new C19612n(parcel).mo51962q(jVar);
        } catch (IOException e) {
            throw new ApplicationBugException((Exception) e);
        }
    }

    /* renamed from: a */
    public final InputStream mo51918a() {
        return new ByteArrayInputStream(this.f49793a.createByteArray());
    }

    /* renamed from: c */
    public final byte mo51920c() throws IOException {
        return this.f49793a.readByte();
    }

    /* renamed from: d */
    public final byte[] mo51944d() throws IOException {
        return this.f49793a.createByteArray();
    }

    /* renamed from: i */
    public final double mo51922i() throws IOException {
        return this.f49793a.readDouble();
    }

    /* renamed from: j */
    public final float mo51923j() throws IOException {
        return this.f49793a.readFloat();
    }

    /* renamed from: k */
    public final float[] mo51945k() throws IOException {
        return this.f49793a.createFloatArray();
    }

    /* renamed from: l */
    public final int mo51924l() throws IOException {
        return this.f49793a.readInt();
    }

    /* renamed from: m */
    public final long mo51925m() throws IOException {
        return this.f49793a.readLong();
    }

    /* renamed from: n */
    public final long[] mo51946n() throws IOException {
        return this.f49793a.createLongArray();
    }

    /* renamed from: p */
    public final String mo51947p() throws IOException {
        return this.f49793a.readString();
    }

    /* renamed from: t */
    public final String mo51948t() throws IOException {
        return this.f49793a.readString();
    }

    /* renamed from: u */
    public final String[] mo51949u() throws IOException {
        return this.f49793a.createStringArray();
    }
}
