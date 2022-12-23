package p462eh;

import p172m9.C5720b;
import p221q6.C6181b;

/* renamed from: eh.g */
public final class C16826g extends C6181b {
    /* renamed from: h */
    public final int mo22173h(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            C5720b.m14067r(c);
            throw null;
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* renamed from: j */
    public final void mo22175j(C16822c cVar) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!cVar.mo49494c()) {
                break;
            }
            char b = cVar.mo49493b();
            cVar.f43788f++;
            mo22173h(b, sb);
            if (sb.length() % 3 == 0) {
                C6181b.m14739m(cVar, sb);
                if (C5720b.m14075z(cVar.f43783a, cVar.f43788f, 3) != 3) {
                    cVar.f43789g = 0;
                    break;
                }
            }
        }
        mo22177l(cVar, sb);
    }

    /* renamed from: k */
    public final int mo22176k() {
        return 3;
    }

    /* renamed from: l */
    public final void mo22177l(C16822c cVar, StringBuilder sb) {
        cVar.mo49495d(cVar.mo49492a());
        int a = cVar.f43790h.f43798b - cVar.mo49492a();
        cVar.f43788f -= sb.length();
        if ((cVar.f43783a.length() - cVar.f43791i) - cVar.f43788f > 1 || a > 1 || (cVar.f43783a.length() - cVar.f43791i) - cVar.f43788f != a) {
            cVar.mo49496e(254);
        }
        if (cVar.f43789g < 0) {
            cVar.f43789g = 0;
        }
    }
}
