package p334z6;

import com.crashlytics.android.answers.Answers;

/* renamed from: z6.a */
public final class C7488a implements C7491d {

    /* renamed from: b */
    public final Answers f22968b;

    public C7488a(Answers answers) {
        this.f22968b = answers;
    }

    /* renamed from: a */
    public static C7488a m17192a() throws NoClassDefFoundError, IllegalStateException {
        Answers instance = Answers.getInstance();
        if (instance != null) {
            return new C7488a(instance);
        }
        throw new IllegalStateException("Answers must be initialized before logging kit events");
    }

    /* renamed from: g */
    public final void mo22172g(C7490c cVar) {
        try {
            this.f22968b.logCustom(cVar.mo23761a());
        } catch (Throwable unused) {
        }
    }
}
