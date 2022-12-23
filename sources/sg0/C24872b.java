package sg0;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.C24084f;

/* renamed from: sg0.b */
public final class C24872b {

    /* renamed from: A */
    public static final C24873a f62869A;

    /* renamed from: B */
    public static final C24873a f62870B;

    /* renamed from: C */
    public static final C24873a f62871C;

    /* renamed from: D */
    public static final C24873a f62872D;

    /* renamed from: E */
    public static final C24873a f62873E;

    /* renamed from: F */
    public static final C24873a f62874F;

    /* renamed from: G */
    public static final C24873a f62875G;

    /* renamed from: H */
    public static final C24873a f62876H;

    /* renamed from: I */
    public static final C24873a f62877I;

    /* renamed from: J */
    public static final C24873a f62878J;

    /* renamed from: K */
    public static final C24873a f62879K;

    /* renamed from: L */
    public static final C24873a f62880L;

    /* renamed from: M */
    public static final C24873a f62881M = C24875c.m62404b();

    /* renamed from: a */
    public static final C24873a f62882a;

    /* renamed from: b */
    public static final C24873a f62883b;

    /* renamed from: c */
    public static final C24873a f62884c;

    /* renamed from: d */
    public static final C24874b f62885d;

    /* renamed from: e */
    public static final C24874b f62886e;

    /* renamed from: f */
    public static final C24874b f62887f;

    /* renamed from: g */
    public static final C24873a f62888g;

    /* renamed from: h */
    public static final C24873a f62889h;

    /* renamed from: i */
    public static final C24873a f62890i;

    /* renamed from: j */
    public static final C24873a f62891j;

    /* renamed from: k */
    public static final C24873a f62892k;

    /* renamed from: l */
    public static final C24873a f62893l;

    /* renamed from: m */
    public static final C24873a f62894m;

    /* renamed from: n */
    public static final C24873a f62895n;

    /* renamed from: o */
    public static final C24874b f62896o;

    /* renamed from: p */
    public static final C24873a f62897p;

    /* renamed from: q */
    public static final C24873a f62898q;

    /* renamed from: r */
    public static final C24873a f62899r;

    /* renamed from: s */
    public static final C24873a f62900s;

    /* renamed from: t */
    public static final C24873a f62901t;

    /* renamed from: u */
    public static final C24873a f62902u;

    /* renamed from: v */
    public static final C24873a f62903v;

    /* renamed from: w */
    public static final C24873a f62904w;

    /* renamed from: x */
    public static final C24873a f62905x;

    /* renamed from: y */
    public static final C24873a f62906y;

    /* renamed from: z */
    public static final C24873a f62907z;

    /* renamed from: sg0.b$a */
    public static class C24873a extends C24875c<Boolean> {
        public C24873a(int i) {
            super(i, 1);
        }

        /* renamed from: c */
        public final Boolean mo61346c(int i) {
            boolean z;
            if ((i & (1 << this.f62909a)) != 0) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (valueOf != null) {
                return valueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", new Object[]{"kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"}));
        }

        /* renamed from: d */
        public final int mo61347d(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f62909a;
            }
            return 0;
        }
    }

    /* renamed from: sg0.b$b */
    public static class C24874b<E extends C24084f.C24085a> extends C24875c<E> {

        /* renamed from: c */
        public final E[] f62908c;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C24874b(int r5, E[] r6) {
            /*
                r4 = this;
                r0 = 1
                if (r6 == 0) goto L_0x0032
                int r1 = r6.length
                int r1 = r1 - r0
                if (r1 != 0) goto L_0x0008
                goto L_0x0012
            L_0x0008:
                r2 = 31
            L_0x000a:
                if (r2 < 0) goto L_0x001b
                int r3 = r0 << r2
                r3 = r3 & r1
                if (r3 == 0) goto L_0x0018
                int r0 = r0 + r2
            L_0x0012:
                r4.<init>(r5, r0)
                r4.f62908c = r6
                return
            L_0x0018:
                int r2 = r2 + -1
                goto L_0x000a
            L_0x001b:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "Empty enum: "
                java.lang.StringBuilder r0 = p379.C13555b.m33972k(r0)
                java.lang.Class r6 = r6.getClass()
                r0.append(r6)
                java.lang.String r6 = r0.toString()
                r5.<init>(r6)
                throw r5
            L_0x0032:
                r5 = 3
                java.lang.Object[] r5 = new java.lang.Object[r5]
                r6 = 0
                java.lang.String r1 = "enumEntries"
                r5[r6] = r1
                java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
                r5[r0] = r6
                r6 = 2
                java.lang.String r0 = "bitWidth"
                r5[r6] = r0
                java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
                java.lang.String r5 = java.lang.String.format(r6, r5)
                java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
                r6.<init>(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: sg0.C24872b.C24874b.<init>(int, kotlin.reflect.jvm.internal.impl.protobuf.f$a[]):void");
        }

        /* renamed from: c */
        public final Object mo61348c(int i) {
            int i2 = this.f62909a;
            int i3 = (i & (((1 << this.f62910b) - 1) << i2)) >> i2;
            for (E e : this.f62908c) {
                if (e.getNumber() == i3) {
                    return e;
                }
            }
            return null;
        }
    }

    /* renamed from: sg0.b$c */
    public static abstract class C24875c<E> {

        /* renamed from: a */
        public final int f62909a;

        /* renamed from: b */
        public final int f62910b;

        public C24875c(int i, int i2) {
            this.f62909a = i;
            this.f62910b = i2;
        }

        /* renamed from: a */
        public static C24873a m62403a(C24875c<?> cVar) {
            return new C24873a(cVar.f62909a + cVar.f62910b);
        }

        /* renamed from: b */
        public static C24873a m62404b() {
            return new C24873a(0);
        }
    }

    static {
        C24873a b = C24875c.m62404b();
        f62882a = b;
        f62883b = C24875c.m62403a(b);
        C24873a b2 = C24875c.m62404b();
        f62884c = b2;
        C24874b bVar = new C24874b(1, ProtoBuf$Visibility.values());
        f62885d = bVar;
        ProtoBuf$Modality[] values = ProtoBuf$Modality.values();
        int i = 1 + bVar.f62910b;
        C24874b bVar2 = new C24874b(i, values);
        f62886e = bVar2;
        C24874b bVar3 = new C24874b(bVar2.f62910b + i, ProtoBuf$Class.Kind.values());
        f62887f = bVar3;
        C24873a a = C24875c.m62403a(bVar3);
        f62888g = a;
        C24873a a2 = C24875c.m62403a(a);
        f62889h = a2;
        C24873a a3 = C24875c.m62403a(a2);
        f62890i = a3;
        C24873a a4 = C24875c.m62403a(a3);
        f62891j = a4;
        C24873a a5 = C24875c.m62403a(a4);
        f62892k = a5;
        f62893l = C24875c.m62403a(a5);
        C24873a a6 = C24875c.m62403a(bVar);
        f62894m = a6;
        f62895n = C24875c.m62403a(a6);
        C24874b bVar4 = new C24874b(i + bVar2.f62910b, ProtoBuf$MemberKind.values());
        f62896o = bVar4;
        C24873a a7 = C24875c.m62403a(bVar4);
        f62897p = a7;
        C24873a a8 = C24875c.m62403a(a7);
        f62898q = a8;
        C24873a a9 = C24875c.m62403a(a8);
        f62899r = a9;
        C24873a a11 = C24875c.m62403a(a9);
        f62900s = a11;
        C24873a a12 = C24875c.m62403a(a11);
        f62901t = a12;
        C24873a a13 = C24875c.m62403a(a12);
        f62902u = a13;
        C24873a a14 = C24875c.m62403a(a13);
        f62903v = a14;
        f62904w = C24875c.m62403a(a14);
        C24873a a15 = C24875c.m62403a(bVar4);
        f62905x = a15;
        C24873a a16 = C24875c.m62403a(a15);
        f62906y = a16;
        C24873a a17 = C24875c.m62403a(a16);
        f62907z = a17;
        C24873a a18 = C24875c.m62403a(a17);
        f62869A = a18;
        C24873a a19 = C24875c.m62403a(a18);
        f62870B = a19;
        C24873a a21 = C24875c.m62403a(a19);
        f62871C = a21;
        C24873a a22 = C24875c.m62403a(a21);
        f62872D = a22;
        C24873a a23 = C24875c.m62403a(a22);
        f62873E = a23;
        f62874F = C24875c.m62403a(a23);
        C24873a a24 = C24875c.m62403a(b2);
        f62875G = a24;
        C24873a a25 = C24875c.m62403a(a24);
        f62876H = a25;
        f62877I = C24875c.m62403a(a25);
        C24873a a26 = C24875c.m62403a(bVar2);
        f62878J = a26;
        C24873a a27 = C24875c.m62403a(a26);
        f62879K = a27;
        f62880L = C24875c.m62403a(a27);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m62399a(int r5) {
        /*
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 1
            r2 = 0
            r3 = 2
            if (r5 == r1) goto L_0x002b
            if (r5 == r3) goto L_0x0026
            r4 = 5
            if (r5 == r4) goto L_0x002b
            r4 = 6
            if (r5 == r4) goto L_0x0021
            r4 = 8
            if (r5 == r4) goto L_0x002b
            r4 = 9
            if (r5 == r4) goto L_0x0021
            r4 = 11
            if (r5 == r4) goto L_0x002b
            java.lang.String r4 = "visibility"
            r0[r2] = r4
            goto L_0x002f
        L_0x0021:
            java.lang.String r4 = "memberKind"
            r0[r2] = r4
            goto L_0x002f
        L_0x0026:
            java.lang.String r4 = "kind"
            r0[r2] = r4
            goto L_0x002f
        L_0x002b:
            java.lang.String r4 = "modality"
            r0[r2] = r4
        L_0x002f:
            java.lang.String r2 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags"
            r0[r1] = r2
            switch(r5) {
                case 3: goto L_0x004a;
                case 4: goto L_0x0045;
                case 5: goto L_0x0045;
                case 6: goto L_0x0045;
                case 7: goto L_0x0040;
                case 8: goto L_0x0040;
                case 9: goto L_0x0040;
                case 10: goto L_0x003b;
                case 11: goto L_0x003b;
                default: goto L_0x0036;
            }
        L_0x0036:
            java.lang.String r5 = "getClassFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x003b:
            java.lang.String r5 = "getAccessorFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0040:
            java.lang.String r5 = "getPropertyFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x0045:
            java.lang.String r5 = "getFunctionFlags"
            r0[r3] = r5
            goto L_0x004e
        L_0x004a:
            java.lang.String r5 = "getConstructorFlags"
            r0[r3] = r5
        L_0x004e:
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r5, r0)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg0.C24872b.m62399a(int):void");
    }
}
