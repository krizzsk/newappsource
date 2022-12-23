package p555ie;

import p648me.C18365c;

/* renamed from: ie.c */
public final class C17580c {

    /* renamed from: c */
    public static final C17581a f45207c = new C17581a();

    /* renamed from: a */
    public final C18365c f45208a;

    /* renamed from: b */
    public C17578a f45209b;

    /* renamed from: ie.c$a */
    public static final class C17581a implements C17578a {
        /* renamed from: a */
        public final void mo50030a() {
        }

        /* renamed from: b */
        public final String mo50031b() {
            return null;
        }

        /* renamed from: c */
        public final void mo50032c(long j, String str) {
        }
    }

    public C17580c(C18365c cVar) {
        this.f45208a = cVar;
        this.f45209b = f45207c;
    }

    /* renamed from: a */
    public final void mo50035a(String str) {
        this.f45209b.mo50030a();
        this.f45209b = f45207c;
        if (str != null) {
            this.f45209b = new C17587g(this.f45208a.mo50830a(str, "userlog"));
        }
    }

    public C17580c(C18365c cVar, String str) {
        this(cVar);
        mo50035a(str);
    }
}
