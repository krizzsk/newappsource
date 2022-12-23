package zendesk.core;

import ge0.C23410c;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class ZendeskLocaleConverter {
    private static final Map<String, String> forwardLookupMap;

    static {
        HashMap hashMap = new HashMap();
        forwardLookupMap = hashMap;
        hashMap.put("iw", "he");
        hashMap.put("nb", "no");
        hashMap.put("in", "id");
        hashMap.put("ji", "yi");
    }

    public String toHelpCenterLocaleString(Locale locale) {
        boolean z;
        if (locale == null || !C23410c.m57533a(locale.getLanguage())) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            locale = Locale.getDefault();
        }
        String str = forwardLookupMap.get(locale.getLanguage());
        if (!C23410c.m57533a(str)) {
            str = locale.getLanguage();
        }
        StringBuilder sb = new StringBuilder(str);
        if (C23410c.m57533a(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        return sb.toString().toLowerCase();
    }
}
