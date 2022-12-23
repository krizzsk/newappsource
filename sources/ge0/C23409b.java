package ge0;

import com.zendesk.logger.Logger;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;

/* renamed from: ge0.b */
public final class C23409b {

    /* renamed from: a */
    public static final List<String> f59192a = Arrays.asList(new String[]{"he", "yi", "id"});

    /* renamed from: a */
    public static Locale m57531a(String str) {
        boolean z;
        int i;
        String str2;
        Locale locale;
        Locale locale2;
        Class<String> cls = String.class;
        Logger.m57302a("Assuming Locale.getDefault()", new Object[0]);
        Locale locale3 = Locale.getDefault();
        if (!C23410c.m57533a(str)) {
            return locale3;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, "-");
        int countTokens = stringTokenizer.countTokens();
        if (countTokens == 1 || countTokens == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (countTokens == 1) {
                i = 2;
            } else {
                i = 5;
            }
            if (i != str.length()) {
                Logger.m57302a("number of tokens is correct but the length of the locale string does not match the expected length", new Object[0]);
                return locale3;
            }
            String nextToken = stringTokenizer.nextToken();
            if (stringTokenizer.hasMoreTokens()) {
                str2 = stringTokenizer.nextToken();
            } else {
                str2 = "";
            }
            String upperCase = str2.toUpperCase(Locale.US);
            if (f59192a.contains(nextToken)) {
                Logger.m57302a("New ISO-6390-Alpha3 locale detected trying to create new locale per reflection", new Object[0]);
                Locale locale4 = null;
                try {
                    Method declaredMethod = Locale.class.getDeclaredMethod("createConstant", new Class[]{cls, cls});
                    declaredMethod.setAccessible(true);
                    locale2 = (Locale) declaredMethod.invoke((Object) null, new Object[]{nextToken, upperCase});
                } catch (Exception unused) {
                    Logger.m57304c("Unable to create ISO-6390-Alpha3 per reflection", new Object[0]);
                    locale2 = null;
                }
                if (locale2 == null) {
                    try {
                        Constructor<Locale> declaredConstructor = Locale.class.getDeclaredConstructor(new Class[]{Boolean.TYPE, cls, cls});
                        declaredConstructor.setAccessible(true);
                        locale4 = declaredConstructor.newInstance(new Object[]{Boolean.TRUE, nextToken, upperCase});
                    } catch (Exception unused2) {
                        Logger.m57304c("Unable to create ISO-6390-Alpha3 per reflection", new Object[0]);
                    }
                    locale2 = locale4;
                }
                if (locale2 != null) {
                    return locale2;
                }
                locale = new Locale(nextToken, upperCase);
            } else {
                locale = new Locale(nextToken, upperCase);
            }
            return locale;
        }
        Logger.m57306e("Unexpected number of tokens, must be at least one and at most two", new Object[0]);
        return locale3;
    }

    /* renamed from: b */
    public static String m57532b(Locale locale) {
        if (locale == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(locale.getLanguage());
        if (C23410c.m57533a(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry().toLowerCase(Locale.US));
        }
        return sb.toString();
    }
}
