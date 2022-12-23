package p229r1;

/* renamed from: r1.e */
public class C6235e implements C6234d {

    /* renamed from: a */
    public int f19681a;

    /* renamed from: b */
    public Object f19682b;

    public /* synthetic */ C6235e() {
        this.f19681a = 0;
    }

    /* renamed from: a */
    public boolean mo22236a(Object obj) {
        int i;
        boolean z;
        int i2 = 0;
        while (true) {
            i = this.f19681a;
            if (i2 >= i) {
                z = false;
                break;
            } else if (((Object[]) this.f19682b)[i2] == obj) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        if (!z) {
            Object obj2 = this.f19682b;
            if (i >= ((Object[]) obj2).length) {
                return false;
            }
            ((Object[]) obj2)[i] = obj;
            this.f19681a = i + 1;
            return true;
        }
        throw new IllegalStateException("Already in the pool!");
    }

    /* renamed from: b */
    public Object mo22237b() {
        int i = this.f19681a;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object obj = this.f19682b;
        Object obj2 = ((Object[]) obj)[i2];
        ((Object[]) obj)[i2] = null;
        this.f19681a = i - 1;
        return obj2;
    }

    /* renamed from: c */
    public final synchronized void mo22238c() {
        this.f19681a++;
    }

    /* renamed from: d */
    public final synchronized void mo22239d() {
        int i = this.f19681a - 1;
        this.f19681a = i;
        if (i <= 0) {
            Object obj = this.f19682b;
            if (((Runnable) obj) != null) {
                ((Runnable) obj).run();
            }
        }
    }

    public /* synthetic */ C6235e(int i, String str) {
        this.f19681a = i;
        this.f19682b = str;
    }

    public /* synthetic */ C6235e(int i) {
        if (i > 0) {
            this.f19682b = new Object[i];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }
}
