package p030bo.app;

import com.appboy.support.AppboyLogger;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

/* renamed from: bo.app.j4 */
public class C1612j4 {

    /* renamed from: a */
    public static final String f5760a = AppboyLogger.getBrazeLogTag(C1612j4.class);

    /* renamed from: a */
    public static <TargetEnum extends Enum<TargetEnum>> TargetEnum m4333a(String str, Class<TargetEnum> cls) {
        return Enum.valueOf(cls, str);
    }

    /* renamed from: a */
    public static Set<String> m4335a(EnumSet<?> enumSet) {
        HashSet hashSet = new HashSet();
        Iterator<?> it = enumSet.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().toString());
        }
        return hashSet;
    }

    /* renamed from: a */
    public static <TargetEnum extends Enum<TargetEnum>> EnumSet<TargetEnum> m4334a(Class<TargetEnum> cls, Set<String> set) {
        EnumSet<TargetEnum> noneOf = EnumSet.noneOf(cls);
        for (String next : set) {
            try {
                noneOf.add(m4333a(next.toUpperCase(Locale.US), cls));
            } catch (Exception unused) {
                String str = f5760a;
                AppboyLogger.m5459w(str, "Failed to create valid device key enum from string: " + next);
            }
        }
        return noneOf;
    }
}
