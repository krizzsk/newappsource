package dj0;

import bj0.C21084a;
import bj0.C21085b;
import cj0.C21219a;
import p604kh.C18045d;

/* renamed from: dj0.d */
public final class C23278d extends C21084a<Object> {

    /* renamed from: f */
    public C18045d f59036f;

    /* renamed from: g */
    public C21085b f59037g;

    /* renamed from: h */
    public C21085b f59038h;

    /* renamed from: i */
    public C23279a f59039i = new C23279a();

    /* renamed from: j */
    public C23280b f59040j = new C23280b();

    /* renamed from: k */
    public C23281e f59041k = new C23281e();

    /* renamed from: dj0.d$a */
    public class C23279a {

        /* renamed from: a */
        public C23275a f59042a;

        /* renamed from: b */
        public C23275a f59043b;

        /* renamed from: c */
        public C23275a f59044c;

        /* renamed from: d */
        public double f59045d;

        /* renamed from: e */
        public boolean f59046e;
    }

    /* renamed from: dj0.d$b */
    public class C23280b {

        /* renamed from: a */
        public C23277c f59047a;

        /* renamed from: b */
        public boolean f59048b;
    }

    public C23278d() {
        this.f52902b.clear();
        this.f52901a.clear();
    }

    /* renamed from: a */
    public final void mo58410a(C21219a aVar) {
        for (int i = 0; i < 3; i++) {
            if (aVar.f53162a[i] == null) {
                C18045d dVar = this.f59036f;
                C21085b n = aVar.mo53580n(aVar.f53166e[i]);
                dVar.getClass();
                double a = n.mo53239a();
                C23275a aVar2 = (C23275a) dVar.f46170d;
                double a2 = aVar2.f59032d.mo53239a();
                if (a == a2) {
                    if (n != aVar2.f59032d) {
                        C23275a aVar3 = aVar2.f59030b;
                        if (n == aVar3.f59032d) {
                            aVar2 = aVar3;
                        } else {
                            aVar2 = aVar2.f59029a;
                            if (n != aVar2.f59032d) {
                                throw new RuntimeException("Failed to find Node for given afront point");
                            }
                        }
                    }
                } else if (a < a2) {
                    do {
                        aVar2 = aVar2.f59030b;
                        if (aVar2 == null) {
                            break;
                        }
                    } while (n == aVar2.f59032d);
                } else {
                    do {
                        aVar2 = aVar2.f59029a;
                        if (aVar2 == null) {
                            break;
                        }
                    } while (n == aVar2.f59032d);
                }
                dVar.f46170d = aVar2;
                if (aVar2 != null) {
                    aVar2.f59033e = aVar;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo58411b(C21219a aVar) {
        if (aVar != null && !aVar.f53165d) {
            aVar.f53165d = true;
            this.f52904d.f52755c.add(aVar);
            for (int i = 0; i < 3; i++) {
                if (!aVar.f53163b[i]) {
                    mo58411b(aVar.f53162a[i]);
                }
            }
        }
    }
}
