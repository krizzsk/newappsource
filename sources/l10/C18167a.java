package l10;

import c00.C13722f;
import java.util.regex.Pattern;

/* renamed from: l10.a */
public abstract class C18167a {

    /* renamed from: a */
    public static final Pattern f46400a = Pattern.compile("/topics/[a-zA-Z0-9-_.~%]+");

    /* renamed from: b */
    public static final C18168a f46401b = new C18168a();

    /* renamed from: l10.a$a */
    public class C18168a implements C13722f<String> {
        /* renamed from: o */
        public final boolean mo19661o(Object obj) {
            String str = (String) obj;
            if (!C18167a.m44869a(str) || !str.contains("metro")) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m44869a(String str) {
        return str != null && f46400a.matcher(str).matches();
    }
}
