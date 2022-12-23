package p988j$.time.format;

import com.appboy.support.StringUtils;

/* renamed from: j$.time.format.w */
public abstract /* synthetic */ class C25818w {

    /* renamed from: a */
    public static final /* synthetic */ int[] f64390a = {1, 2, 3, 4, 5};

    /* renamed from: a */
    public static /* synthetic */ int m64485a(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* renamed from: b */
    public static /* synthetic */ String m64486b(int i) {
        return i == 1 ? "NORMAL" : i == 2 ? "ALWAYS" : i == 3 ? "NEVER" : i == 4 ? "NOT_NEGATIVE" : i == 5 ? "EXCEEDS_PAD" : StringUtils.NULL_USER_ID_SUBSTITUTE_STRING;
    }

    /* renamed from: c */
    public static /* synthetic */ int[] m64487c(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f64390a, 0, iArr, 0, i);
        return iArr;
    }
}
