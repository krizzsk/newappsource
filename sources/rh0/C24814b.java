package rh0;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import lf0.C24236l;

/* renamed from: rh0.b */
public final class C24814b {

    /* renamed from: rh0.b$a */
    public static abstract class C24815a<N, R> implements C24817c<N, R> {
        /* renamed from: b */
        public void mo53187b(N n) {
        }
    }

    /* renamed from: rh0.b$b */
    public interface C24816b<N> {
        /* renamed from: b */
        Iterable<? extends N> mo50617b(N n);
    }

    /* renamed from: rh0.b$c */
    public interface C24817c<N, R> {
        /* renamed from: a */
        R mo53186a();

        /* renamed from: b */
        void mo53187b(N n);

        /* renamed from: c */
        boolean mo53188c(N n);
    }

    /* renamed from: rh0.b$d */
    public static class C24818d<N> {

        /* renamed from: a */
        public final Set<N> f62758a = new HashSet();
    }

    /* renamed from: a */
    public static /* synthetic */ void m62343a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 5:
            case 8:
            case 11:
            case 15:
            case 18:
            case 21:
            case 23:
                objArr[0] = "neighbors";
                break;
            case 2:
            case 12:
            case 16:
            case 19:
            case 24:
                objArr[0] = "visited";
                break;
            case 3:
            case 6:
            case 13:
            case 25:
                objArr[0] = "handler";
                break;
            case 9:
                objArr[0] = "predicate";
                break;
            case 10:
            case 14:
                objArr[0] = "node";
                break;
            case 22:
                objArr[0] = "current";
                break;
            default:
                objArr[0] = "nodes";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/DFS";
        switch (i) {
            case 7:
            case 8:
            case 9:
                objArr[2] = "ifAny";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "dfsFromNode";
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "topologicalOrder";
                break;
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "doDfs";
                break;
            default:
                objArr[2] = "dfs";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* renamed from: b */
    public static Object m62344b(List list, C24816b bVar, C24815a aVar) {
        C24818d dVar = new C24818d();
        for (Object c : list) {
            m62345c(c, bVar, dVar, aVar);
        }
        return aVar.mo53186a();
    }

    /* renamed from: c */
    public static void m62345c(Object obj, C24816b bVar, C24818d dVar, C24815a aVar) {
        if (obj == null) {
            m62343a(22);
            throw null;
        } else if (dVar.f62758a.add(obj) && aVar.mo53188c(obj)) {
            for (Object c : bVar.mo50617b(obj)) {
                m62345c(c, bVar, dVar, aVar);
            }
            aVar.mo53187b(obj);
        }
    }

    /* renamed from: d */
    public static Boolean m62346d(List list, C24816b bVar, C24236l lVar) {
        if (lVar != null) {
            return (Boolean) m62344b(list, bVar, new C24813a(lVar, new boolean[1]));
        }
        m62343a(9);
        throw null;
    }
}
