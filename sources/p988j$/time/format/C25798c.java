package p988j$.time.format;

import java.util.Comparator;
import java.util.Map;

/* renamed from: j$.time.format.c */
final class C25798c implements Comparator {
    public final int compare(Object obj, Object obj2) {
        return ((String) ((Map.Entry) obj2).getKey()).length() - ((String) ((Map.Entry) obj).getKey()).length();
    }
}
