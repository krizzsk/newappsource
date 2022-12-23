package j70;

import java.io.IOException;
import p810sz.C19589j;
import p810sz.C19600l;
import p810sz.C19615p;
import p810sz.C19616q;
import p810sz.C19619s;

/* renamed from: j70.a */
public final class C17712a {

    /* renamed from: j */
    public static final C17713a f45463j = new C17713a();

    /* renamed from: a */
    public String f45464a;

    /* renamed from: b */
    public String f45465b;

    /* renamed from: c */
    public String f45466c;

    /* renamed from: d */
    public int f45467d;

    /* renamed from: e */
    public int f45468e;

    /* renamed from: f */
    public long f45469f;

    /* renamed from: g */
    public Integer f45470g;

    /* renamed from: h */
    public Integer f45471h;

    /* renamed from: i */
    public Integer f45472i;

    /* renamed from: j70.a$a */
    public class C17713a extends C19619s<C17712a> {
        public C17713a() {
            super(1, C17712a.class);
        }

        /* renamed from: a */
        public final boolean mo177a(int i) {
            return i <= 1;
        }

        /* renamed from: b */
        public final Object mo178b(C19615p pVar, int i) throws IOException {
            C19615p pVar2 = pVar;
            if (i != 1) {
                return new C17712a(pVar.mo51948t(), pVar.mo51948t(), pVar.mo51948t(), pVar.mo51924l(), pVar.mo51924l(), pVar.mo51925m(), (Integer) null, (Integer) null, (Integer) null);
            }
            String t = pVar.mo51948t();
            String t2 = pVar.mo51948t();
            String t3 = pVar.mo51948t();
            int l = pVar.mo51924l();
            int l2 = pVar.mo51924l();
            long m = pVar.mo51925m();
            C19589j.C19593d dVar = C19589j.f49774f;
            return new C17712a(t, t2, t3, l, l2, m, (Integer) pVar2.mo51962q(dVar), (Integer) pVar2.mo51962q(dVar), (Integer) pVar2.mo51962q(dVar));
        }

        /* renamed from: c */
        public final void mo179c(Object obj, C19616q qVar) throws IOException {
            C17712a aVar = (C17712a) obj;
            qVar.mo51955t(aVar.f45464a);
            qVar.mo51955t(aVar.f45465b);
            qVar.mo51955t(aVar.f45466c);
            qVar.mo51939l(aVar.f45467d);
            qVar.mo51939l(aVar.f45468e);
            qVar.mo51940m(aVar.f45469f);
            Integer num = aVar.f45470g;
            C19600l.C19604d dVar = C19600l.f49785o;
            qVar.mo51967q(num, dVar);
            qVar.mo51967q(aVar.f45471h, dVar);
            qVar.mo51967q(aVar.f45472i, dVar);
        }
    }

    public C17712a(String str, String str2, String str3, int i, int i2, long j, Integer num, Integer num2, Integer num3) {
        this.f45464a = str;
        this.f45465b = str2;
        this.f45466c = str3;
        this.f45467d = i;
        this.f45468e = i2;
        this.f45469f = j;
        this.f45470g = num;
        this.f45471h = num2;
        this.f45472i = num3;
    }
}
