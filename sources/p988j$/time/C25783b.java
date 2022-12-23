package p988j$.time;

import com.appboy.support.StringUtils;

/* renamed from: j$.time.b */
public abstract /* synthetic */ class C25783b {
    /* renamed from: a */
    public static StringBuilder m64414a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb;
    }

    /* renamed from: b */
    public static /* synthetic */ String m64415b(int i) {
        return i == 1 ? "REFERENCE" : i == 2 ? "INT_VALUE" : i == 3 ? "LONG_VALUE" : i == 4 ? "DOUBLE_VALUE" : StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
    }
}
