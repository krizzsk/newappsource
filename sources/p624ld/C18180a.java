package p624ld;

import p001a0.C0016g;
import p583jk.C17884p;
import p988j$.util.function.Predicate;

/* renamed from: ld.a */
public abstract class C18180a implements C18192e<Character> {

    /* renamed from: ld.a$a */
    public static final class C18181a extends C18185e {

        /* renamed from: b */
        public static final C18181a f46422b = new C18181a();

        public C18181a() {
            super("CharMatcher.any()");
        }

        /* renamed from: b */
        public final int mo50601b(int i, CharSequence charSequence) {
            int length = charSequence.length();
            C17884p.m44374n(i, length);
            if (i == length) {
                return -1;
            }
            return i;
        }

        /* renamed from: c */
        public final boolean mo50602c(char c) {
            return true;
        }

        public final Predicate negate() {
            return C18186f.f46426b;
        }
    }

    /* renamed from: ld.a$b */
    public static abstract class C18182b extends C18180a {
        @Deprecated
        public final boolean apply(Object obj) {
            return mo50602c(((Character) obj).charValue());
        }
    }

    /* renamed from: ld.a$c */
    public static final class C18183c extends C18182b {

        /* renamed from: a */
        public final char f46423a;

        public C18183c(char c) {
            this.f46423a = c;
        }

        /* renamed from: c */
        public final boolean mo50602c(char c) {
            return c == this.f46423a;
        }

        public final Predicate negate() {
            return new C18184d(this.f46423a);
        }

        public final String toString() {
            String a = C18180a.m44888a(this.f46423a);
            return C25541a.m63875e(C0016g.m25h(a, 18), "CharMatcher.is('", a, "')");
        }
    }

    /* renamed from: ld.a$d */
    public static final class C18184d extends C18182b {

        /* renamed from: a */
        public final char f46424a;

        public C18184d(char c) {
            this.f46424a = c;
        }

        /* renamed from: c */
        public final boolean mo50602c(char c) {
            return c != this.f46424a;
        }

        public final Predicate negate() {
            return new C18183c(this.f46424a);
        }

        public final String toString() {
            String a = C18180a.m44888a(this.f46424a);
            return C25541a.m63875e(C0016g.m25h(a, 21), "CharMatcher.isNot('", a, "')");
        }
    }

    /* renamed from: ld.a$e */
    public static abstract class C18185e extends C18182b {

        /* renamed from: a */
        public final String f46425a;

        public C18185e(String str) {
            this.f46425a = str;
        }

        public final String toString() {
            return this.f46425a;
        }
    }

    /* renamed from: ld.a$f */
    public static final class C18186f extends C18185e {

        /* renamed from: b */
        public static final C18186f f46426b = new C18186f();

        public C18186f() {
            super("CharMatcher.none()");
        }

        /* renamed from: b */
        public final int mo50601b(int i, CharSequence charSequence) {
            C17884p.m44374n(i, charSequence.length());
            return -1;
        }

        /* renamed from: c */
        public final boolean mo50602c(char c) {
            return false;
        }

        public final Predicate negate() {
            return C18181a.f46422b;
        }
    }

    /* renamed from: a */
    public static String m44888a(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    /* renamed from: b */
    public int mo50601b(int i, CharSequence charSequence) {
        int length = charSequence.length();
        C17884p.m44374n(i, length);
        while (i < length) {
            if (mo50602c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public abstract boolean mo50602c(char c);

    /* renamed from: or */
    public final /* synthetic */ Predicate mo43234or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        return ((C18182b) this).apply(obj);
    }
}
