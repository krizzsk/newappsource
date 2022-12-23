package ya0;

/* renamed from: ya0.g */
public class C13281g<V> {

    /* renamed from: a */
    public C13283h<C13281g<V>.C25541a<V>> f32949a = new C13283h<>(100);

    /* renamed from: b */
    public C13281g<V>.C25541a<V> f32950b;

    /* renamed from: c */
    public C13281g<V>.C25541a<V> f32951c;

    /* renamed from: d */
    public int f32952d;

    /* renamed from: ya0.g$a */
    public class C13282a<K> {

        /* renamed from: a */
        public C13281g<V>.C25541a<K> f32953a;

        /* renamed from: b */
        public C13281g<V>.C25541a<K> f32954b;

        /* renamed from: c */
        public final long f32955c;

        /* renamed from: d */
        public K f32956d;

        public C13282a(long j, Object obj) {
            this.f32955c = j;
            this.f32956d = obj;
        }
    }

    /* renamed from: a */
    public final V mo40145a(long j) {
        C13281g<V>.C25541a<K> a = this.f32949a.mo40149a(j);
        if (a == null) {
            return null;
        }
        mo40148g(a);
        int i = this.f32952d;
        if (i == 0) {
            this.f32951c = a;
            this.f32950b = a;
        } else {
            C13281g<V>.C25541a<V> aVar = this.f32950b;
            a.f32953a = aVar;
            aVar.f32954b = a;
            this.f32950b = a;
        }
        this.f32952d = i + 1;
        return a.f32956d;
    }

    /* renamed from: b */
    public void mo39777b(V v) {
    }

    /* renamed from: c */
    public void mo39778c(V v) {
    }

    /* renamed from: d */
    public final void mo40146d(long j, V v) {
        C13281g<V>.C25541a<K> aVar = new C13282a<>(j, v);
        int i = this.f32952d;
        if (i == 0) {
            this.f32951c = aVar;
            this.f32950b = aVar;
        } else {
            C13281g<V>.C25541a<V> aVar2 = this.f32950b;
            aVar.f32953a = aVar2;
            aVar2.f32954b = aVar;
            this.f32950b = aVar;
        }
        this.f32952d = i + 1;
        this.f32949a.mo39771c(j, aVar);
        mo39777b(v);
        do {
            C13281g<V>.C25541a<V> aVar3 = this.f32951c;
            if (mo39760f(aVar3.f32955c, aVar3.f32956d)) {
                this.f32949a.mo40150d(this.f32951c.f32955c);
                mo39778c(this.f32951c.f32956d);
                mo40148g(this.f32951c);
            } else {
                return;
            }
        } while (this.f32951c != null);
    }

    /* renamed from: e */
    public final void mo40147e() {
        if (this.f32951c != null) {
            do {
                C13281g<V>.C25541a<V> aVar = this.f32951c;
                if (mo39760f(aVar.f32955c, aVar.f32956d)) {
                    this.f32949a.mo40150d(this.f32951c.f32955c);
                    mo39778c(this.f32951c.f32956d);
                    mo40148g(this.f32951c);
                } else {
                    return;
                }
            } while (this.f32951c != null);
        }
    }

    /* renamed from: f */
    public boolean mo39760f(long j, V v) {
        throw null;
    }

    /* renamed from: g */
    public final void mo40148g(C13281g<V>.C25541a<V> aVar) {
        int i = this.f32952d - 1;
        this.f32952d = i;
        if (i == 0) {
            this.f32951c = null;
            this.f32950b = null;
        } else if (aVar == this.f32950b) {
            C13281g<V>.C25541a<K> aVar2 = aVar.f32953a;
            this.f32950b = aVar2;
            aVar2.f32954b = null;
        } else if (aVar == this.f32951c) {
            C13281g<V>.C25541a<K> aVar3 = aVar.f32954b;
            this.f32951c = aVar3;
            aVar3.f32953a = null;
        } else {
            C13281g<V>.C25541a<K> aVar4 = aVar.f32953a;
            aVar4.f32954b = aVar.f32954b;
            aVar.f32954b.f32953a = aVar4;
        }
    }
}
