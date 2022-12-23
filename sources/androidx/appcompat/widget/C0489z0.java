package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.z0 */
public final class C0489z0 {

    /* renamed from: a */
    public int f1667a = 0;

    /* renamed from: b */
    public int f1668b = 0;

    /* renamed from: c */
    public int f1669c = Integer.MIN_VALUE;

    /* renamed from: d */
    public int f1670d = Integer.MIN_VALUE;

    /* renamed from: e */
    public int f1671e = 0;

    /* renamed from: f */
    public int f1672f = 0;

    /* renamed from: g */
    public boolean f1673g = false;

    /* renamed from: h */
    public boolean f1674h = false;

    /* renamed from: a */
    public final void mo2212a(int i, int i2) {
        this.f1669c = i;
        this.f1670d = i2;
        this.f1674h = true;
        if (this.f1673g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1667a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1668b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1667a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1668b = i2;
        }
    }
}
