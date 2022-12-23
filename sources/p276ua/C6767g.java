package p276ua;

import ce0.C21100e;
import com.google.android.exoplayer2.Format;
import java.util.ArrayList;
import java.util.Arrays;
import p276ua.C6768h;
import p277ub.C6803r;

/* renamed from: ua.g */
public final class C6767g extends C6768h {

    /* renamed from: o */
    public static final byte[] f20932o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    public boolean f20933n;

    /* renamed from: b */
    public final long mo22934b(C6803r rVar) {
        int i;
        byte[] bArr = rVar.f21038a;
        byte b = bArr[0] & 255;
        byte b2 = b & 3;
        byte b3 = 2;
        if (b2 == 0) {
            b3 = 1;
        } else if (!(b2 == 1 || b2 == 2)) {
            b3 = bArr[1] & 63;
        }
        int i2 = b >> 3;
        int i3 = i2 & 3;
        if (i2 >= 16) {
            i = 2500 << i3;
        } else if (i2 >= 12) {
            i = 10000 << (i3 & 1);
        } else if (i3 == 3) {
            i = 60000;
        } else {
            i = 10000 << i3;
        }
        return (((long) this.f20942i) * (((long) b3) * ((long) i))) / 1000000;
    }

    /* renamed from: c */
    public final boolean mo22935c(C6803r rVar, long j, C6768h.C6769a aVar) {
        boolean z = true;
        if (!this.f20933n) {
            byte[] copyOf = Arrays.copyOf(rVar.f21038a, rVar.f21040c);
            ArrayList k = C21100e.m49348k(copyOf);
            Format.C3872b bVar = new Format.C3872b();
            bVar.f13446k = "audio/opus";
            bVar.f13459x = copyOf[9] & 255;
            bVar.f13460y = 48000;
            bVar.f13448m = k;
            aVar.f20947a = new Format(bVar);
            this.f20933n = true;
            return true;
        }
        aVar.f20947a.getClass();
        if (rVar.mo22984c() != 1332770163) {
            z = false;
        }
        rVar.mo23007z(0);
        return z;
    }

    /* renamed from: d */
    public final void mo22936d(boolean z) {
        super.mo22936d(z);
        if (z) {
            this.f20933n = false;
        }
    }
}
