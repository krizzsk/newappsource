package tg0;

import com.google.android.play.core.assetpacks.C14256d1;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.C23825c;
import lf0.C24236l;
import mf0.C24362h;
import p001a0.C0016g;
import p583jk.C17875h;
import uh0.C25081h;

/* renamed from: tg0.b */
public final class C24983b {

    /* renamed from: a */
    public static final String f63120a = C23825c.m58520q0(C17875h.m44281E('k', 'o', 't', 'l', 'i', 'n'), "", (String) null, (String) null, (C24236l) null, 62);

    /* renamed from: b */
    public static final LinkedHashMap f63121b;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List E = C17875h.m44281E("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int f = C14256d1.m35488f(0, E.size() - 1, 2);
        if (f >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 2;
                StringBuilder sb = new StringBuilder();
                String str = f63120a;
                sb.append(str);
                sb.append('/');
                sb.append((String) E.get(i));
                int i3 = i + 1;
                linkedHashMap.put(sb.toString(), E.get(i3));
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append('/');
                linkedHashMap.put(C0016g.m31o(sb2, (String) E.get(i), "Array"), C24362h.m61216k(E.get(i3), "["));
                if (i == f) {
                    break;
                }
                i = i2;
            }
        }
        linkedHashMap.put(C24362h.m61216k("/Unit", f63120a), "V");
        m62684a("Any", "java/lang/Object", linkedHashMap);
        m62684a("Nothing", "java/lang/Void", linkedHashMap);
        m62684a("Annotation", "java/lang/annotation/Annotation", linkedHashMap);
        for (String str2 : C17875h.m44281E("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            m62684a(str2, C24362h.m61216k(str2, "java/lang/"), linkedHashMap);
        }
        for (String str3 : C17875h.m44281E("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            m62684a(C24362h.m61216k(str3, "collections/"), C24362h.m61216k(str3, "java/util/"), linkedHashMap);
            m62684a(C24362h.m61216k(str3, "collections/Mutable"), C24362h.m61216k(str3, "java/util/"), linkedHashMap);
        }
        m62684a("collections/Iterable", "java/lang/Iterable", linkedHashMap);
        m62684a("collections/MutableIterable", "java/lang/Iterable", linkedHashMap);
        m62684a("collections/Map.Entry", "java/util/Map$Entry", linkedHashMap);
        m62684a("collections/MutableMap.MutableEntry", "java/util/Map$Entry", linkedHashMap);
        for (int i4 = 0; i4 < 23; i4++) {
            String k = C24362h.m61216k(Integer.valueOf(i4), "Function");
            StringBuilder sb3 = new StringBuilder();
            String str4 = f63120a;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i4);
            m62684a(k, sb3.toString(), linkedHashMap);
            m62684a(C24362h.m61216k(Integer.valueOf(i4), "reflect/KFunction"), C24362h.m61216k("/reflect/KFunction", str4), linkedHashMap);
        }
        for (String str5 : C17875h.m44281E("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            m62684a(C24362h.m61216k(".Companion", str5), C13715c.m34246l(new StringBuilder(), f63120a, "/jvm/internal/", str5, "CompanionObject"), linkedHashMap);
        }
        f63121b = linkedHashMap;
    }

    /* renamed from: a */
    public static final void m62684a(String str, String str2, LinkedHashMap linkedHashMap) {
        linkedHashMap.put(f63120a + '/' + str, 'L' + str2 + ';');
    }

    /* renamed from: b */
    public static final String m62685b(String str) {
        C24362h.m61211f(str, "classId");
        String str2 = (String) f63121b.get(str);
        if (str2 != null) {
            return str2;
        }
        StringBuilder q = C25541a.m63886q('L');
        q.append(C25081h.m62834E(str, '.', '$'));
        q.append(';');
        return q.toString();
    }
}
