package qg0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.text.C24179b;
import mf0.C24362h;
import p001a0.C0017h;
import qg0.C24747h;

/* renamed from: qg0.i */
public final class C24751i {

    /* renamed from: a */
    public static final C24751i f62658a = new C24751i();

    /* renamed from: qg0.i$a */
    public /* synthetic */ class C24752a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f62659a;

        static {
            int[] iArr = new int[PrimitiveType.values().length];
            iArr[PrimitiveType.BOOLEAN.ordinal()] = 1;
            iArr[PrimitiveType.CHAR.ordinal()] = 2;
            iArr[PrimitiveType.BYTE.ordinal()] = 3;
            iArr[PrimitiveType.SHORT.ordinal()] = 4;
            iArr[PrimitiveType.INT.ordinal()] = 5;
            iArr[PrimitiveType.FLOAT.ordinal()] = 6;
            iArr[PrimitiveType.LONG.ordinal()] = 7;
            iArr[PrimitiveType.DOUBLE.ordinal()] = 8;
            f62659a = iArr;
        }
    }

    /* renamed from: a */
    public static C24747h m62271a(String str) {
        JvmPrimitiveType jvmPrimitiveType;
        C24747h bVar;
        boolean z;
        C24362h.m61211f(str, "representation");
        char charAt = str.charAt(0);
        JvmPrimitiveType[] values = JvmPrimitiveType.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                jvmPrimitiveType = null;
                break;
            }
            jvmPrimitiveType = values[i];
            i++;
            if (jvmPrimitiveType.getDesc().charAt(0) == charAt) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        if (jvmPrimitiveType != null) {
            return new C24747h.C24750c(jvmPrimitiveType);
        }
        if (charAt == 'V') {
            return new C24747h.C24750c((JvmPrimitiveType) null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
            bVar = new C24747h.C24748a(m62271a(substring));
        } else {
            if (charAt == 'L') {
                C24179b.m60560H(str, ';');
            }
            String substring2 = str.substring(1, str.length() - 1);
            C24362h.m61210e(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            bVar = new C24747h.C24749b(substring2);
        }
        return bVar;
    }

    /* renamed from: f */
    public static String m62272f(C24747h hVar) {
        String str;
        C24362h.m61211f(hVar, "type");
        if (hVar instanceof C24747h.C24748a) {
            return C24362h.m61216k(m62272f(((C24747h.C24748a) hVar).f62655i), "[");
        }
        if (hVar instanceof C24747h.C24750c) {
            JvmPrimitiveType jvmPrimitiveType = ((C24747h.C24750c) hVar).f62657i;
            if (jvmPrimitiveType == null) {
                str = "V";
            } else {
                str = jvmPrimitiveType.getDesc();
            }
            C24362h.m61210e(str, "type.jvmPrimitiveType?.desc ?: \"V\"");
            return str;
        } else if (hVar instanceof C24747h.C24749b) {
            return C0017h.m57N(C25541a.m63886q('L'), ((C24747h.C24749b) hVar).f62656i, ';');
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: b */
    public final C24747h.C24749b mo61229b(String str) {
        C24362h.m61211f(str, "internalName");
        return new C24747h.C24749b(str);
    }

    /* renamed from: c */
    public final C24747h.C24750c mo61230c(PrimitiveType primitiveType) {
        switch (C24752a.f62659a[primitiveType.ordinal()]) {
            case 1:
                return C24747h.f62647a;
            case 2:
                return C24747h.f62648b;
            case 3:
                return C24747h.f62649c;
            case 4:
                return C24747h.f62650d;
            case 5:
                return C24747h.f62651e;
            case 6:
                return C24747h.f62652f;
            case 7:
                return C24747h.f62653g;
            case 8:
                return C24747h.f62654h;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* renamed from: d */
    public final C24747h.C24749b mo61231d() {
        return new C24747h.C24749b("java/lang/Class");
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ String mo61232e(Object obj) {
        return m62272f((C24747h) obj);
    }
}
