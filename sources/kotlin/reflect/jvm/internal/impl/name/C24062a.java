package kotlin.reflect.jvm.internal.impl.name;

/* renamed from: kotlin.reflect.jvm.internal.impl.name.a */
public final class C24062a {

    /* renamed from: kotlin.reflect.jvm.internal.impl.name.a$a */
    public /* synthetic */ class C24063a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f61045a;

        static {
            int[] iArr = new int[State.values().length];
            iArr[State.BEGINNING.ordinal()] = 1;
            iArr[State.AFTER_DOT.ordinal()] = 2;
            iArr[State.MIDDLE.ordinal()] = 3;
            f61045a = iArr;
        }
    }

    /* renamed from: a */
    public static final boolean m60023a(String str) {
        if (str == null) {
            return false;
        }
        State state = State.BEGINNING;
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            i++;
            int i2 = C24063a.f61045a[state.ordinal()];
            if (i2 == 1 || i2 == 2) {
                if (!Character.isJavaIdentifierPart(charAt)) {
                    return false;
                }
                state = State.MIDDLE;
            } else if (i2 != 3) {
                continue;
            } else if (charAt == '.') {
                state = State.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(charAt)) {
                return false;
            }
        }
        if (state != State.AFTER_DOT) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ug0.C25066c m60024b(ug0.C25066c r4, ug0.C25066c r5) {
        /*
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r4, r0)
            java.lang.String r0 = "prefix"
            mf0.C24362h.m61211f(r5, r0)
            boolean r0 = mf0.C24362h.m61206a(r4, r5)
            r1 = 1
            if (r0 == 0) goto L_0x0012
            goto L_0x003d
        L_0x0012:
            boolean r0 = r5.mo61582d()
            if (r0 == 0) goto L_0x0019
            goto L_0x003d
        L_0x0019:
            java.lang.String r0 = r4.mo61580b()
            java.lang.String r2 = "this.asString()"
            mf0.C24362h.m61210e(r0, r2)
            java.lang.String r2 = r5.mo61580b()
            java.lang.String r3 = "packageName.asString()"
            mf0.C24362h.m61210e(r2, r3)
            boolean r3 = uh0.C25081h.m62835F(r0, r2)
            if (r3 == 0) goto L_0x003f
            int r2 = r2.length()
            char r0 = r0.charAt(r2)
            r2 = 46
            if (r0 != r2) goto L_0x003f
        L_0x003d:
            r0 = 1
            goto L_0x0040
        L_0x003f:
            r0 = 0
        L_0x0040:
            if (r0 == 0) goto L_0x0078
            boolean r0 = r5.mo61582d()
            if (r0 == 0) goto L_0x0049
            goto L_0x0078
        L_0x0049:
            boolean r0 = mf0.C24362h.m61206a(r4, r5)
            if (r0 == 0) goto L_0x0057
            ug0.c r4 = ug0.C25066c.f63253c
            java.lang.String r5 = "ROOT"
            mf0.C24362h.m61210e(r4, r5)
            goto L_0x0078
        L_0x0057:
            ug0.c r0 = new ug0.c
            java.lang.String r4 = r4.mo61580b()
            java.lang.String r2 = "asString()"
            mf0.C24362h.m61210e(r4, r2)
            java.lang.String r5 = r5.mo61580b()
            int r5 = r5.length()
            int r5 = r5 + r1
            java.lang.String r4 = r4.substring(r5)
            java.lang.String r5 = "this as java.lang.String).substring(startIndex)"
            mf0.C24362h.m61210e(r4, r5)
            r0.<init>((java.lang.String) r4)
            r4 = r0
        L_0x0078:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.name.C24062a.m60024b(ug0.c, ug0.c):ug0.c");
    }
}
