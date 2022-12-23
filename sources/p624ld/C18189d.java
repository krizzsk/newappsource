package p624ld;

import java.util.Arrays;

/* renamed from: ld.d */
public final class C18189d {

    /* renamed from: a */
    public final String f46432a;

    /* renamed from: b */
    public final C18191b f46433b;

    /* renamed from: c */
    public C18191b f46434c;

    /* renamed from: ld.d$a */
    public static final class C18190a extends C18191b {
    }

    /* renamed from: ld.d$b */
    public static class C18191b {

        /* renamed from: a */
        public Object f46435a;

        /* renamed from: b */
        public C18191b f46436b;
    }

    public C18189d(String str) {
        C18191b bVar = new C18191b();
        this.f46433b = bVar;
        this.f46434c = bVar;
        this.f46432a = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f46432a);
        sb.append('{');
        C18191b bVar = this.f46433b.f46436b;
        String str = "";
        while (bVar != null) {
            Object obj = bVar.f46435a;
            boolean z = bVar instanceof C18190a;
            sb.append(str);
            bVar.getClass();
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append(deepToString, 1, deepToString.length() - 1);
            }
            bVar = bVar.f46436b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
