package p178n2;

/* renamed from: n2.h */
public abstract class C5824h {

    /* renamed from: a */
    public final boolean f18788a;

    /* renamed from: n2.h$a */
    public static final class C5825a extends C5824h {

        /* renamed from: b */
        public static final C5825a f18789b = new C5825a();

        public C5825a() {
            super(false);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5825a) || this.f18788a != ((C5825a) obj).f18788a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f18788a ? 1231 : 1237;
        }

        public final String toString() {
            return C13715c.m34247m(C13555b.m33972k("Loading(endOfPaginationReached="), this.f18788a, ')');
        }
    }

    /* renamed from: n2.h$b */
    public static final class C5826b extends C5824h {

        /* renamed from: b */
        public static final C5826b f18790b = new C5826b(true);

        /* renamed from: c */
        public static final C5826b f18791c = new C5826b(false);

        public C5826b(boolean z) {
            super(z);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C5826b) || this.f18788a != ((C5826b) obj).f18788a) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f18788a ? 1231 : 1237;
        }

        public final String toString() {
            return C13715c.m34247m(C13555b.m33972k("NotLoading(endOfPaginationReached="), this.f18788a, ')');
        }
    }

    public C5824h(boolean z) {
        this.f18788a = z;
    }
}
