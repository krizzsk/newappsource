package p275u9;

import java.util.Set;
import p237r9.C6269b;
import p237r9.C6271d;
import p237r9.C6273f;

/* renamed from: u9.t */
public final class C6753t implements C6273f {

    /* renamed from: a */
    public final Set<C6269b> f20880a;

    /* renamed from: b */
    public final C6751s f20881b;

    /* renamed from: c */
    public final C6755v f20882c;

    public C6753t(Set set, C6738j jVar, C6755v vVar) {
        this.f20880a = set;
        this.f20881b = jVar;
        this.f20882c = vVar;
    }

    /* renamed from: a */
    public final C6754u mo22261a(String str, C6269b bVar, C6271d dVar) {
        if (this.f20880a.contains(bVar)) {
            return new C6754u(this.f20881b, str, bVar, dVar, this.f20882c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{bVar, this.f20880a}));
    }
}
