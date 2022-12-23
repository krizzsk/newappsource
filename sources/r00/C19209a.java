package r00;

import com.usebutton.sdk.internal.util.DiskLruCache;

/* renamed from: r00.a */
public class C19209a extends C19215g<Boolean> {
    public C19209a(String str, Boolean bool) {
        super(str, bool);
    }

    /* renamed from: d */
    public static boolean m46358d(String str) {
        return DiskLruCache.VERSION_1.equals(str);
    }

    /* renamed from: c */
    public Boolean mo49672b(String str) throws Exception {
        return Boolean.valueOf(m46358d(str));
    }
}
