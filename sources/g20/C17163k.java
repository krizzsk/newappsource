package g20;

import p810sz.C19599k;
import p977zz.C20964s0;

/* renamed from: g20.k */
public abstract class C17163k {

    /* renamed from: a */
    public static final C17164a f44397a;

    /* renamed from: b */
    public static final C17165b f44398b;

    /* renamed from: c */
    public static final C17166c f44399c;

    /* renamed from: d */
    public static final C17167d f44400d;

    /* renamed from: e */
    public static C19599k<C17163k> f44401e;

    /* renamed from: g20.k$a */
    public class C17164a extends C17163k {
        /* renamed from: a */
        public final CharSequence mo49745a(CharSequence[] charSequenceArr) {
            return C20964s0.m49097o(" ", charSequenceArr);
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* renamed from: g20.k$b */
    public class C17165b extends C17163k {
        /* renamed from: a */
        public final CharSequence mo49745a(CharSequence[] charSequenceArr) {
            return C20964s0.m49097o(" • ", charSequenceArr);
        }

        public final String toString() {
            return "Dot( • )";
        }
    }

    /* renamed from: g20.k$c */
    public class C17166c extends C17163k {
        /* renamed from: a */
        public final CharSequence mo49745a(CharSequence[] charSequenceArr) {
            String str;
            if (charSequenceArr.length == 0) {
                return "";
            }
            if (C20964s0.m49091i(charSequenceArr[0])) {
                str = " ← ";
            } else {
                str = " → ";
            }
            return C20964s0.m49097o(str, charSequenceArr);
        }

        public final String toString() {
            return "DirectionalArrow( ← / → )";
        }
    }

    /* renamed from: g20.k$d */
    public class C17167d extends C17163k {
        /* renamed from: a */
        public final CharSequence mo49745a(CharSequence[] charSequenceArr) {
            return C20964s0.m49097o(" ↔ ", charSequenceArr);
        }

        public final String toString() {
            return "BidirectionalArrow( ↔ )";
        }
    }

    static {
        C17164a aVar = new C17164a();
        f44397a = aVar;
        C17165b bVar = new C17165b();
        f44398b = bVar;
        C17166c cVar = new C17166c();
        f44399c = cVar;
        C17167d dVar = new C17167d();
        f44400d = dVar;
        f44401e = new C19599k<>(aVar, bVar, cVar, dVar);
    }

    /* renamed from: a */
    public abstract CharSequence mo49745a(CharSequence[] charSequenceArr);
}
