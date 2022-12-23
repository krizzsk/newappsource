package p720pe;

/* renamed from: pe.b */
public final class C18918b implements C18919c {

    /* renamed from: b */
    public int f48158b;

    public /* synthetic */ C18918b() {
    }

    public /* synthetic */ C18918b(int i) {
        this.f48158b = 1024;
    }

    /* renamed from: a */
    public final void mo51433a() {
        int i = this.f48158b;
        this.f48158b = i <= 3 ? 0 : i <= 9 ? i - 3 : i - 6;
    }

    /* renamed from: b */
    public final void mo51434b() {
        this.f48158b = this.f48158b < 7 ? 8 : 11;
    }

    /* renamed from: c */
    public final StackTraceElement[] mo50438c(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f48158b;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }

    /* renamed from: d */
    public final void mo51435d() {
        int i = 7;
        if (this.f48158b >= 7) {
            i = 10;
        }
        this.f48158b = i;
    }
}
