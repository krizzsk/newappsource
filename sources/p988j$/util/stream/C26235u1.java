package p988j$.util.stream;

/* renamed from: j$.util.stream.u1 */
class C26235u1 extends C26240v1 {

    /* renamed from: c */
    public final /* synthetic */ int f65029c;

    /* renamed from: d */
    private final Object f65030d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26235u1(C26038D0 d0, Object obj) {
        this((C26043E0) d0, obj, 0);
        this.f65029c = 0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26235u1(C26043E0 e0, Object obj, int i) {
        super(e0);
        this.f65029c = i;
        this.f65030d = obj;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26235u1(C26043E0 e0, Object[] objArr) {
        this(e0, (Object) objArr, 1);
        this.f65029c = 1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26235u1(C26235u1 u1Var, C26038D0 d0, int i) {
        super(u1Var, d0, i);
        this.f65029c = 0;
        this.f65030d = u1Var.f65030d;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C26235u1(C26235u1 u1Var, C26043E0 e0, int i) {
        super(u1Var, e0, i);
        this.f65029c = 1;
        this.f65030d = (Object[]) u1Var.f65030d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo84595a() {
        switch (this.f65029c) {
            case 0:
                ((C26038D0) this.f65042a).mo84200c(this.f65043b, this.f65030d);
                return;
            default:
                this.f65042a.mo84243j((Object[]) this.f65030d, this.f65043b);
                return;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C26235u1 mo84596b(int i, int i2) {
        switch (this.f65029c) {
            case 0:
                return new C26235u1(this, ((C26038D0) this.f65042a).mo84198a(i), i2);
            default:
                return new C26235u1(this, this.f65042a.mo84198a(i), i2);
        }
    }
}
