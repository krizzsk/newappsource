package p161la;

import com.appsflyer.AdvertisingIdUtil;
import java.util.UUID;
import p277ub.C6774a0;

/* renamed from: la.c */
public final class C5654c implements C5653b {

    /* renamed from: d */
    public static final boolean f18411d;

    /* renamed from: a */
    public final UUID f18412a;

    /* renamed from: b */
    public final byte[] f18413b;

    /* renamed from: c */
    public final boolean f18414c;

    static {
        boolean z;
        if (AdvertisingIdUtil.AMAZON_MANUFACTURER.equals(C6774a0.f20961c)) {
            String str = C6774a0.f20962d;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z = true;
                f18411d = z;
            }
        }
        z = false;
        f18411d = z;
    }

    public C5654c(UUID uuid, byte[] bArr, boolean z) {
        this.f18412a = uuid;
        this.f18413b = bArr;
        this.f18414c = z;
    }
}
