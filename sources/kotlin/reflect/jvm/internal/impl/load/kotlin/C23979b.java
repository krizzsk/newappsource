package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import kotlin.collections.C23825c;
import mf0.C24362h;

/* renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.b */
public final class C23979b {

    /* renamed from: a */
    public static final C23979b f60763a = new C23979b();

    /* renamed from: a */
    public static String[] m59200a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            i++;
            arrayList.add("<init>(" + str + ")V");
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            return (String[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    /* renamed from: b */
    public static LinkedHashSet m59201b(String str, String... strArr) {
        C24362h.m61211f(str, "internalName");
        C24362h.m61211f(strArr, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str2 = strArr[i];
            i++;
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public static LinkedHashSet m59202c(String str, String... strArr) {
        C24362h.m61211f(strArr, "signatures");
        return m59201b(C24362h.m61216k(str, "java/lang/"), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: d */
    public static LinkedHashSet m59203d(String str, String... strArr) {
        return m59201b(C24362h.m61216k(str, "java/util/"), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    /* renamed from: e */
    public static String m59204e(String str, String str2, ArrayList arrayList) {
        C24362h.m61211f(str, "name");
        C24362h.m61211f(str2, "ret");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('(');
        sb.append(C23825c.m58520q0(arrayList, "", (String) null, (String) null, SignatureBuildingComponents$jvmDescriptor$1.f60757f, 30));
        sb.append(')');
        if (str2.length() > 1) {
            str2 = 'L' + str2 + ';';
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: f */
    public static String m59205f(String str, String str2) {
        C24362h.m61211f(str, "internalName");
        C24362h.m61211f(str2, "jvmDescriptor");
        return str + '.' + str2;
    }
}
