package tg0;

import java.util.Arrays;
import mf0.C24362h;
import sg0.C24871a;

/* renamed from: tg0.e */
public final class C24988e extends C24871a {

    /* renamed from: g */
    public static final C24988e f63127g = new C24988e(1, 6, 0);

    /* renamed from: f */
    public final boolean f63128f;

    static {
        new C24988e(new int[0]);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24988e(int[] iArr, boolean z) {
        super(Arrays.copyOf(iArr, iArr.length));
        C24362h.m61211f(iArr, "versionArray");
        this.f63128f = z;
    }

    /* renamed from: c */
    public final boolean mo61538c() {
        boolean z;
        int i = this.f62865b;
        if (i == 1 && this.f62866c == 0) {
            return false;
        }
        if (this.f63128f) {
            z = mo61342b(f63127g);
        } else {
            C24988e eVar = f63127g;
            if (i != eVar.f62865b || this.f62866c > eVar.f62866c + 1) {
                z = false;
            } else {
                z = true;
            }
        }
        if (z) {
            return true;
        }
        return false;
    }

    public C24988e(int... iArr) {
        this(iArr, false);
    }
}
