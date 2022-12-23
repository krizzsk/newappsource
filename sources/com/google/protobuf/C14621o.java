package com.google.protobuf;

import com.google.protobuf.C14610k;
import java.util.Collections;
import java.util.List;
import p911xg.C20498h;
import p911xg.C20509q;
import p911xg.C20518x;

/* renamed from: com.google.protobuf.o */
public abstract class C14621o {

    /* renamed from: a */
    public static final C14622a f36868a = new C14622a();

    /* renamed from: b */
    public static final C14623b f36869b = new C14623b();

    /* renamed from: com.google.protobuf.o$a */
    public static final class C14622a extends C14621o {

        /* renamed from: c */
        public static final Class<?> f36870c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.protobuf.n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.protobuf.n} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.protobuf.n} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static java.util.List m36635c(java.lang.Object r3, int r4, long r5) {
            /*
                java.lang.Object r0 = p911xg.C20518x.m48172o(r5, r3)
                java.util.List r0 = (java.util.List) r0
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002f
                boolean r1 = r0 instanceof p911xg.C20498h
                if (r1 == 0) goto L_0x0016
                com.google.protobuf.n r0 = new com.google.protobuf.n
                r0.<init>((int) r4)
                goto L_0x002b
            L_0x0016:
                boolean r1 = r0 instanceof p911xg.C20509q
                if (r1 == 0) goto L_0x0026
                boolean r1 = r0 instanceof com.google.protobuf.C14610k.C14615e
                if (r1 == 0) goto L_0x0026
                com.google.protobuf.k$e r0 = (com.google.protobuf.C14610k.C14615e) r0
                com.google.protobuf.k$e r4 = r0.mo44086c1(r4)
                r0 = r4
                goto L_0x002b
            L_0x0026:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r4)
            L_0x002b:
                p911xg.C20518x.m48179v(r3, r5, r0)
                goto L_0x0081
            L_0x002f:
                java.lang.Class<?> r1 = f36870c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004d
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>(r2)
                r1.addAll(r0)
                p911xg.C20518x.m48179v(r3, r5, r1)
            L_0x004b:
                r0 = r1
                goto L_0x0081
            L_0x004d:
                boolean r1 = r0 instanceof p911xg.C20515w
                if (r1 == 0) goto L_0x0064
                com.google.protobuf.n r1 = new com.google.protobuf.n
                int r2 = r0.size()
                int r2 = r2 + r4
                r1.<init>((int) r2)
                xg.w r0 = (p911xg.C20515w) r0
                r1.addAll(r0)
                p911xg.C20518x.m48179v(r3, r5, r1)
                goto L_0x004b
            L_0x0064:
                boolean r1 = r0 instanceof p911xg.C20509q
                if (r1 == 0) goto L_0x0081
                boolean r1 = r0 instanceof com.google.protobuf.C14610k.C14615e
                if (r1 == 0) goto L_0x0081
                r1 = r0
                com.google.protobuf.k$e r1 = (com.google.protobuf.C14610k.C14615e) r1
                boolean r2 = r1.mo44025Q0()
                if (r2 != 0) goto L_0x0081
                int r0 = r0.size()
                int r0 = r0 + r4
                com.google.protobuf.k$e r0 = r1.mo44086c1(r0)
                p911xg.C20518x.m48179v(r3, r5, r0)
            L_0x0081:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C14621o.C14622a.m36635c(java.lang.Object, int, long):java.util.List");
        }

        /* renamed from: a */
        public final void mo44113a(long j, Object obj) {
            Object obj2;
            List list = (List) C20518x.m48172o(j, obj);
            if (list instanceof C20498h) {
                obj2 = ((C20498h) list).mo44105A();
            } else if (!f36870c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C20509q) || !(list instanceof C14610k.C14615e)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C14610k.C14615e eVar = (C14610k.C14615e) list;
                    if (eVar.mo44025Q0()) {
                        eVar.mo44024H();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C20518x.m48179v(obj, j, obj2);
        }

        /* renamed from: b */
        public final void mo44114b(Object obj, long j, Object obj2) {
            List list = (List) C20518x.m48172o(j, obj2);
            List c = m36635c(obj, list.size(), j);
            int size = c.size();
            int size2 = list.size();
            if (size > 0 && size2 > 0) {
                c.addAll(list);
            }
            if (size > 0) {
                list = c;
            }
            C20518x.m48179v(obj, j, list);
        }
    }

    /* renamed from: com.google.protobuf.o$b */
    public static final class C14623b extends C14621o {
        /* renamed from: a */
        public final void mo44113a(long j, Object obj) {
            ((C14610k.C14615e) C20518x.m48172o(j, obj)).mo44024H();
        }

        /* renamed from: b */
        public final void mo44114b(Object obj, long j, Object obj2) {
            C14610k.C14615e eVar = (C14610k.C14615e) C20518x.m48172o(j, obj);
            C14610k.C14615e eVar2 = (C14610k.C14615e) C20518x.m48172o(j, obj2);
            int size = eVar.size();
            int size2 = eVar2.size();
            if (size > 0 && size2 > 0) {
                if (!eVar.mo44025Q0()) {
                    eVar = eVar.mo44086c1(size2 + size);
                }
                eVar.addAll(eVar2);
            }
            if (size > 0) {
                eVar2 = eVar;
            }
            C20518x.m48179v(obj, j, eVar2);
        }
    }

    /* renamed from: a */
    public abstract void mo44113a(long j, Object obj);

    /* renamed from: b */
    public abstract void mo44114b(Object obj, long j, Object obj2);
}
