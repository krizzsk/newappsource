package t70;

import java.io.IOException;
import p583jk.C17884p;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: t70.a */
public final class C19639a {

    /* renamed from: d */
    public static final C19640a f49827d = new C19640a();

    /* renamed from: a */
    public final int f49828a;

    /* renamed from: b */
    public final int f49829b;

    /* renamed from: c */
    public final int f49830c;

    /* renamed from: t70.a$a */
    public class C19640a extends C19619s<C19639a> {
        public C19640a() {
            super(0, C19639a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i == 0;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            return new C19639a(pVar.mo51924l(), pVar.mo51924l(), pVar.mo51924l());
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C19639a aVar = (C19639a) obj;
            qVar.mo51939l(aVar.f49828a);
            qVar.mo51939l(aVar.f49829b);
            qVar.mo51939l(aVar.f49830c);
        }
    }

    public C19639a(int i, int i2, int i3) {
        this.f49828a = i;
        this.f49829b = i2;
        this.f49830c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19639a)) {
            return false;
        }
        C19639a aVar = (C19639a) obj;
        if (aVar.f49828a == this.f49828a && aVar.f49829b == this.f49829b && aVar.f49830c == this.f49830c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C17884p.m44333D(this.f49828a, this.f49829b, this.f49830c);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DaySchedule{dayOfWeek=");
        k.append(this.f49828a);
        k.append(", startTimeMillis=");
        k.append(this.f49829b);
        k.append(", endTimeMillis=");
        return C16530d.m42014g(k, this.f49830c, '}');
    }
}
