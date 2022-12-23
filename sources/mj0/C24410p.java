package mj0;

import java.util.Locale;
import java.util.regex.Pattern;
import org.simpleframework.xml.transform.InvalidFormatException;

/* renamed from: mj0.p */
public final class C24410p implements C24415u<Locale> {

    /* renamed from: a */
    public final Pattern f61773a = Pattern.compile("_");

    /* renamed from: a */
    public final Object mo60538a(String str) throws Exception {
        String[] split = this.f61773a.split(str);
        if (split.length >= 1) {
            String[] strArr = {"", "", ""};
            for (int i = 0; i < 3; i++) {
                if (i < split.length) {
                    strArr[i] = split[i];
                }
            }
            return new Locale(strArr[0], strArr[1], strArr[2]);
        }
        throw new InvalidFormatException("Invalid locale %s", str);
    }
}
