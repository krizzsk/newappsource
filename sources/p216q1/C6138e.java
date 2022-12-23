package p216q1;

/* renamed from: q1.e */
public final class C6138e {

    /* renamed from: a */
    public static final C6142d f19501a = new C6142d((C6139a) null, false);

    /* renamed from: b */
    public static final C6142d f19502b = new C6142d((C6139a) null, true);

    /* renamed from: c */
    public static final C6142d f19503c;

    /* renamed from: d */
    public static final C6142d f19504d;

    /* renamed from: q1.e$a */
    public static class C6139a implements C6140b {

        /* renamed from: a */
        public static final C6139a f19505a = new C6139a();

        /* renamed from: a */
        public final int mo22116a(CharSequence charSequence, int i) {
            int i2 = i + 0;
            int i3 = 2;
            for (int i4 = 0; i4 < i2 && i3 == 2; i4++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i4));
                C6142d dVar = C6138e.f19501a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                i3 = 2;
                                break;
                        }
                    }
                    i3 = 0;
                }
                i3 = 1;
            }
            return i3;
        }
    }

    /* renamed from: q1.e$b */
    public interface C6140b {
        /* renamed from: a */
        int mo22116a(CharSequence charSequence, int i);
    }

    /* renamed from: q1.e$c */
    public static abstract class C6141c implements C6137d {

        /* renamed from: a */
        public final C6140b f19506a;

        public C6141c(C6139a aVar) {
            this.f19506a = aVar;
        }

        /* renamed from: a */
        public abstract boolean mo22117a();

        /* renamed from: b */
        public final boolean mo22118b(CharSequence charSequence, int i) {
            if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
                throw new IllegalArgumentException();
            }
            C6140b bVar = this.f19506a;
            if (bVar == null) {
                return mo22117a();
            }
            int a = bVar.mo22116a(charSequence, i);
            if (a == 0) {
                return true;
            }
            if (a != 1) {
                return mo22117a();
            }
            return false;
        }
    }

    /* renamed from: q1.e$d */
    public static class C6142d extends C6141c {

        /* renamed from: b */
        public final boolean f19507b;

        public C6142d(C6139a aVar, boolean z) {
            super(aVar);
            this.f19507b = z;
        }

        /* renamed from: a */
        public final boolean mo22117a() {
            return this.f19507b;
        }
    }

    static {
        C6139a aVar = C6139a.f19505a;
        f19503c = new C6142d(aVar, false);
        f19504d = new C6142d(aVar, true);
    }
}
