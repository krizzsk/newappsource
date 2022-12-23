package p720pe;

/* renamed from: pe.a */
public final class C18917a implements C18919c {

    /* renamed from: b */
    public final /* synthetic */ int f48154b;

    /* renamed from: c */
    public int f48155c;

    /* renamed from: d */
    public Object[] f48156d;

    /* renamed from: e */
    public Object f48157e;

    public C18917a(C18919c[] cVarArr) {
        this.f48154b = 0;
        this.f48155c = 1024;
        this.f48156d = cVarArr;
        this.f48157e = new C18918b(0);
    }

    /* renamed from: a */
    public final void mo51430a(String str) {
        mo51431b(str.length() + this.f48155c);
        str.getChars(0, str.length(), (char[]) this.f48157e, this.f48155c);
        this.f48155c = str.length() + this.f48155c;
    }

    /* renamed from: b */
    public final void mo51431b(int i) {
        Object obj = this.f48157e;
        if (((char[]) obj).length < i) {
            char[] cArr = new char[Math.max(i, ((char[]) obj).length * 2)];
            System.arraycopy((char[]) this.f48157e, 0, cArr, 0, this.f48155c);
            this.f48157e = cArr;
        }
    }

    /* renamed from: c */
    public final StackTraceElement[] mo50438c(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f48155c) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (C18919c cVar : (C18919c[]) this.f48156d) {
            if (stackTraceElementArr2.length <= this.f48155c) {
                break;
            }
            stackTraceElementArr2 = cVar.mo50438c(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > this.f48155c) {
            return ((C18918b) this.f48157e).mo50438c(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public final String toString() {
        switch (this.f48154b) {
            case 1:
                return new String((char[]) this.f48157e, 0, this.f48155c);
            default:
                return super.toString();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C18917a() {
        this(0);
        this.f48154b = 1;
    }

    public C18917a(int i) {
        this.f48154b = 1;
        this.f48157e = new char[16];
    }
}
