package p264ta;

import com.appboy.support.ValidationUtils;
import java.util.ArrayList;
import java.util.Arrays;
import p001a0.C0016g;
import p001a0.C0017h;
import p277ub.C6803r;

/* renamed from: ta.a */
public abstract class C6619a {

    /* renamed from: a */
    public final int f20488a;

    /* renamed from: ta.a$a */
    public static final class C6620a extends C6619a {

        /* renamed from: b */
        public final long f20489b;

        /* renamed from: c */
        public final ArrayList f20490c = new ArrayList();

        /* renamed from: d */
        public final ArrayList f20491d = new ArrayList();

        public C6620a(int i, long j) {
            super(i);
            this.f20489b = j;
        }

        /* renamed from: b */
        public final C6620a mo22800b(int i) {
            int size = this.f20491d.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6620a aVar = (C6620a) this.f20491d.get(i2);
                if (aVar.f20488a == i) {
                    return aVar;
                }
            }
            return null;
        }

        /* renamed from: c */
        public final C6621b mo22801c(int i) {
            int size = this.f20490c.size();
            for (int i2 = 0; i2 < size; i2++) {
                C6621b bVar = (C6621b) this.f20490c.get(i2);
                if (bVar.f20488a == i) {
                    return bVar;
                }
            }
            return null;
        }

        public final String toString() {
            String a = C6619a.m15659a(this.f20488a);
            String arrays = Arrays.toString(this.f20490c.toArray());
            String arrays2 = Arrays.toString(this.f20491d.toArray());
            StringBuilder O = C0017h.m58O(C0016g.m25h(arrays2, C0016g.m25h(arrays, C0016g.m25h(a, 22))), a, " leaves: ", arrays, " containers: ");
            O.append(arrays2);
            return O.toString();
        }
    }

    /* renamed from: ta.a$b */
    public static final class C6621b extends C6619a {

        /* renamed from: b */
        public final C6803r f20492b;

        public C6621b(int i, C6803r rVar) {
            super(i);
            this.f20492b = rVar;
        }
    }

    public C6619a(int i) {
        this.f20488a = i;
    }

    /* renamed from: a */
    public static String m15659a(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        sb.append((char) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        sb.append((char) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        sb.append((char) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        return sb.toString();
    }

    public String toString() {
        return m15659a(this.f20488a);
    }
}
