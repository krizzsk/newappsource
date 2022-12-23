package ge0;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: ge0.c */
public final class C23410c {

    /* renamed from: a */
    public static HashMap f59193a;

    static {
        HashMap hashMap = new HashMap();
        f59193a = hashMap;
        hashMap.put('\'', "\\'");
        f59193a.put('\"', "\\\"");
        f59193a.put('\\', "\\\\");
        f59193a.put('/', "\\/");
        f59193a.put(8, "\\b");
        f59193a.put(10, "\\n");
        f59193a.put(9, "\\t");
        f59193a.put(12, "\\f");
        f59193a.put(13, "\\r");
        System.getProperty("line.separator");
    }

    /* renamed from: a */
    public static boolean m57533a(String str) {
        return str != null && str.trim().length() > 0;
    }

    /* renamed from: b */
    public static boolean m57534b(String str) {
        return !m57533a(str);
    }

    /* renamed from: c */
    public static String m57535c(List<String> list) {
        if (list == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (m57533a(list.get(i))) {
                sb.append(list.get(i));
                if (i < list.size() - 1) {
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: d */
    public static String m57536d(String... strArr) {
        List list;
        if (strArr == null) {
            list = null;
        } else {
            list = Arrays.asList(strArr);
        }
        return m57535c(list);
    }

    /* renamed from: e */
    public static String m57537e(List<? extends Number> list) {
        ArrayList arrayList;
        if (list != null) {
            arrayList = new ArrayList();
            for (Number number : list) {
                if (number != null) {
                    arrayList.add(number.toString());
                }
            }
        } else {
            arrayList = null;
        }
        return m57535c(arrayList);
    }
}
