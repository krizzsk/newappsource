package p238ra;

import androidx.recyclerview.widget.RecyclerView;
import java.io.IOException;
import p173ma.C5732e;
import p277ub.C6803r;

/* renamed from: ra.e */
public final class C6283e {

    /* renamed from: a */
    public final C6803r f19869a = new C6803r(8);

    /* renamed from: b */
    public int f19870b;

    /* renamed from: a */
    public final long mo22272a(C5732e eVar) throws IOException {
        int i = 0;
        eVar.mo21583j(0, 1, this.f19869a.f21038a, false);
        byte b = this.f19869a.f21038a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = RecyclerView.C1119a0.FLAG_IGNORE;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        eVar.mo21583j(1, i3, this.f19869a.f21038a, false);
        while (i < i3) {
            i++;
            i4 = (this.f19869a.f21038a[i] & 255) + (i4 << 8);
        }
        this.f19870b = i3 + 1 + this.f19870b;
        return (long) i4;
    }
}
