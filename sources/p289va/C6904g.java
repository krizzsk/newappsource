package p289va;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.Format;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p277ub.C6803r;
import p289va.C6896d0;

/* renamed from: va.g */
public final class C6904g implements C6896d0.C6899c {

    /* renamed from: a */
    public final int f21361a = 0;

    /* renamed from: b */
    public final List<Format> f21362b;

    public C6904g() {
        ImmutableList D = ImmutableList.m35687D();
        this.f21362b = D;
    }

    /* renamed from: a */
    public final C6896d0 mo23150a(int i, C6896d0.C6898b bVar) {
        if (i == 2) {
            return new C6923t(new C6908k(new C6902e0(mo23156b(bVar))));
        }
        if (i == 3 || i == 4) {
            return new C6923t(new C6920q(bVar.f21320a));
        }
        if (i == 21) {
            return new C6923t(new C6918o());
        }
        if (i != 27) {
            if (i == 36) {
                return new C6923t(new C6916n(new C6931z(mo23156b(bVar))));
            }
            if (i == 89) {
                return new C6923t(new C6906i(bVar.f21321b));
            }
            if (i != 138) {
                if (i == 172) {
                    return new C6923t(new C6895d(bVar.f21320a));
                }
                if (i == 257) {
                    return new C6930y(new C6922s("application/vnd.dvb.ait"));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i != 134) {
                            if (i != 135) {
                                switch (i) {
                                    case 15:
                                        if (mo23157c(2)) {
                                            return null;
                                        }
                                        return new C6923t(new C6903f(false, bVar.f21320a));
                                    case 16:
                                        return new C6923t(new C6910l(new C6902e0(mo23156b(bVar))));
                                    case 17:
                                        if (mo23157c(2)) {
                                            return null;
                                        }
                                        return new C6923t(new C6919p(bVar.f21320a));
                                    default:
                                        return null;
                                }
                            }
                        } else if (mo23157c(16)) {
                            return null;
                        } else {
                            return new C6930y(new C6922s("application/x-scte35"));
                        }
                    } else if (!mo23157c(64)) {
                        return null;
                    }
                }
                return new C6923t(new C6889b(bVar.f21320a));
            }
            return new C6923t(new C6905h(bVar.f21320a));
        } else if (mo23157c(4)) {
            return null;
        } else {
            return new C6923t(new C6913m(new C6931z(mo23156b(bVar)), mo23157c(1), mo23157c(8)));
        }
    }

    /* renamed from: b */
    public final List<Format> mo23156b(C6896d0.C6898b bVar) {
        ArrayList arrayList;
        boolean z;
        String str;
        int i;
        boolean z2;
        if (mo23157c(32)) {
            return this.f21362b;
        }
        C6803r rVar = new C6803r(bVar.f21322c);
        List<Format> list = this.f21362b;
        while (rVar.f21040c - rVar.f21039b > 0) {
            int p = rVar.mo22997p();
            int p2 = rVar.f21039b + rVar.mo22997p();
            if (p == 134) {
                ArrayList arrayList2 = new ArrayList();
                int p3 = rVar.mo22997p() & 31;
                for (int i2 = 0; i2 < p3; i2++) {
                    String m = rVar.mo22994m(3);
                    int p4 = rVar.mo22997p();
                    if ((p4 & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i = p4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte p5 = (byte) rVar.mo22997p();
                    rVar.mo22981A(1);
                    List<byte[]> list2 = null;
                    if (z) {
                        if ((p5 & 64) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        list2 = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    }
                    Format.C3872b bVar2 = new Format.C3872b();
                    bVar2.f13446k = str;
                    bVar2.f13438c = m;
                    bVar2.f13434C = i;
                    bVar2.f13448m = list2;
                    arrayList2.add(new Format(bVar2));
                }
                arrayList = arrayList2;
            } else {
                arrayList = list;
            }
            rVar.mo23007z(p2);
            list = arrayList;
        }
        return list;
    }

    /* renamed from: c */
    public final boolean mo23157c(int i) {
        return (i & this.f21361a) != 0;
    }
}
