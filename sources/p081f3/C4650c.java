package p081f3;

import android.net.Uri;
import java.util.HashSet;

/* renamed from: f3.c */
public final class C4650c {

    /* renamed from: a */
    public final HashSet f15892a = new HashSet();

    /* renamed from: f3.c$a */
    public static final class C4651a {

        /* renamed from: a */
        public final Uri f15893a;

        /* renamed from: b */
        public final boolean f15894b;

        public C4651a(boolean z, Uri uri) {
            this.f15893a = uri;
            this.f15894b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C4651a.class != obj.getClass()) {
                return false;
            }
            C4651a aVar = (C4651a) obj;
            if (this.f15894b != aVar.f15894b || !this.f15893a.equals(aVar.f15893a)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return (this.f15893a.hashCode() * 31) + (this.f15894b ? 1 : 0);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4650c.class != obj.getClass()) {
            return false;
        }
        return this.f15892a.equals(((C4650c) obj).f15892a);
    }

    public final int hashCode() {
        return this.f15892a.hashCode();
    }
}
