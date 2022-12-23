package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p241s0.C6302b;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7434j;
import p330z2.C7436l;

/* renamed from: androidx.transition.g */
public final class C1328g {

    /* renamed from: a */
    public static AutoTransition f5009a = new AutoTransition();

    /* renamed from: b */
    public static ThreadLocal<WeakReference<C6302b<ViewGroup, ArrayList<Transition>>>> f5010b = new ThreadLocal<>();

    /* renamed from: c */
    public static ArrayList<ViewGroup> f5011c = new ArrayList<>();

    /* renamed from: androidx.transition.g$a */
    public static class C1329a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* renamed from: b */
        public Transition f5012b;

        /* renamed from: c */
        public ViewGroup f5013c;

        /* renamed from: androidx.transition.g$a$a */
        public class C1330a extends C1327f {

            /* renamed from: a */
            public final /* synthetic */ C6302b f5014a;

            public C1330a(C6302b bVar) {
                this.f5014a = bVar;
            }

            /* renamed from: d */
            public final void mo5377d(Transition transition) {
                ((ArrayList) this.f5014a.getOrDefault(C1329a.this.f5013c, null)).remove(transition);
                transition.mo5427w(this);
            }
        }

        public C1329a(ViewGroup viewGroup, Transition transition) {
            this.f5012b = transition;
            this.f5013c = viewGroup;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v4, resolved type: z2.q} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:104:0x0251  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:140:0x01ff A[EDGE_INSN: B:140:0x01ff->B:88:0x01ff ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x00a3  */
        /* JADX WARNING: Removed duplicated region for block: B:91:0x0204  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x0225  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onPreDraw() {
            /*
                r19 = this;
                r0 = r19
                android.view.ViewGroup r1 = r0.f5013c
                android.view.ViewTreeObserver r1 = r1.getViewTreeObserver()
                r1.removeOnPreDrawListener(r0)
                android.view.ViewGroup r1 = r0.f5013c
                r1.removeOnAttachStateChangeListener(r0)
                java.util.ArrayList<android.view.ViewGroup> r1 = androidx.transition.C1328g.f5011c
                android.view.ViewGroup r2 = r0.f5013c
                boolean r1 = r1.remove(r2)
                r2 = 1
                if (r1 != 0) goto L_0x001c
                return r2
            L_0x001c:
                s0.b r1 = androidx.transition.C1328g.m3634b()
                android.view.ViewGroup r3 = r0.f5013c
                r4 = 0
                java.lang.Object r3 = r1.getOrDefault(r3, r4)
                java.util.ArrayList r3 = (java.util.ArrayList) r3
                if (r3 != 0) goto L_0x0036
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                android.view.ViewGroup r5 = r0.f5013c
                r1.put(r5, r3)
                goto L_0x0042
            L_0x0036:
                int r5 = r3.size()
                if (r5 <= 0) goto L_0x0042
                java.util.ArrayList r5 = new java.util.ArrayList
                r5.<init>(r3)
                goto L_0x0043
            L_0x0042:
                r5 = r4
            L_0x0043:
                androidx.transition.Transition r6 = r0.f5012b
                r3.add(r6)
                androidx.transition.Transition r3 = r0.f5012b
                androidx.transition.g$a$a r6 = new androidx.transition.g$a$a
                r6.<init>(r1)
                r3.mo5411a(r6)
                androidx.transition.Transition r1 = r0.f5012b
                android.view.ViewGroup r3 = r0.f5013c
                r6 = 0
                r1.mo5416h(r3, r6)
                if (r5 == 0) goto L_0x0072
                java.util.Iterator r1 = r5.iterator()
            L_0x0060:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0072
                java.lang.Object r3 = r1.next()
                androidx.transition.Transition r3 = (androidx.transition.Transition) r3
                android.view.ViewGroup r5 = r0.f5013c
                r3.mo5429y(r5)
                goto L_0x0060
            L_0x0072:
                androidx.transition.Transition r1 = r0.f5012b
                android.view.ViewGroup r8 = r0.f5013c
                r1.getClass()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f4952l = r3
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>()
                r1.f4953m = r3
                z2.r r3 = r1.f4948h
                z2.r r5 = r1.f4949i
                s0.b r7 = new s0.b
                java.lang.Object r9 = r3.f22858b
                s0.b r9 = (p241s0.C6302b) r9
                r7.<init>((p241s0.C6302b) r9)
                s0.b r9 = new s0.b
                java.lang.Object r10 = r5.f22858b
                s0.b r10 = (p241s0.C6302b) r10
                r9.<init>((p241s0.C6302b) r10)
                r10 = 0
            L_0x009e:
                int[] r11 = r1.f4951k
                int r12 = r11.length
                if (r10 >= r12) goto L_0x01ff
                r11 = r11[r10]
                if (r11 == r2) goto L_0x01bf
                r12 = 2
                if (r11 == r12) goto L_0x016d
                r12 = 3
                if (r11 == r12) goto L_0x0115
                r12 = 4
                if (r11 == r12) goto L_0x00b3
            L_0x00b0:
                r17 = r3
                goto L_0x0111
            L_0x00b3:
                java.lang.Object r11 = r3.f22861e
                s0.e r11 = (p241s0.C6305e) r11
                java.lang.Object r12 = r5.f22861e
                s0.e r12 = (p241s0.C6305e) r12
                int r13 = r11.mo22333m()
                r14 = 0
            L_0x00c0:
                if (r14 >= r13) goto L_0x00b0
                java.lang.Object r15 = r11.mo22334o(r14)
                android.view.View r15 = (android.view.View) r15
                if (r15 == 0) goto L_0x0107
                boolean r16 = r1.mo5424t(r15)
                if (r16 == 0) goto L_0x0107
                r17 = r3
                long r2 = r11.mo22330j(r14)
                java.lang.Object r2 = r12.mo22329i(r2, r4)
                android.view.View r2 = (android.view.View) r2
                if (r2 == 0) goto L_0x0109
                boolean r3 = r1.mo5424t(r2)
                if (r3 == 0) goto L_0x0109
                java.lang.Object r3 = r7.getOrDefault(r15, r4)
                z2.q r3 = (p330z2.C7441q) r3
                java.lang.Object r18 = r9.getOrDefault(r2, r4)
                r6 = r18
                z2.q r6 = (p330z2.C7441q) r6
                if (r3 == 0) goto L_0x0109
                if (r6 == 0) goto L_0x0109
                java.util.ArrayList<z2.q> r4 = r1.f4952l
                r4.add(r3)
                java.util.ArrayList<z2.q> r3 = r1.f4953m
                r3.add(r6)
                r7.remove(r15)
                r9.remove(r2)
                goto L_0x0109
            L_0x0107:
                r17 = r3
            L_0x0109:
                int r14 = r14 + 1
                r3 = r17
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x00c0
            L_0x0111:
                r2 = r17
                goto L_0x01f5
            L_0x0115:
                r2 = r3
                java.lang.Object r3 = r2.f22860d
                android.util.SparseArray r3 = (android.util.SparseArray) r3
                java.lang.Object r4 = r5.f22860d
                android.util.SparseArray r4 = (android.util.SparseArray) r4
                int r6 = r3.size()
                r11 = 0
            L_0x0123:
                if (r11 >= r6) goto L_0x01f5
                java.lang.Object r12 = r3.valueAt(r11)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x0168
                boolean r13 = r1.mo5424t(r12)
                if (r13 == 0) goto L_0x0168
                int r13 = r3.keyAt(r11)
                java.lang.Object r13 = r4.get(r13)
                android.view.View r13 = (android.view.View) r13
                if (r13 == 0) goto L_0x0168
                boolean r14 = r1.mo5424t(r13)
                if (r14 == 0) goto L_0x0168
                r14 = 0
                java.lang.Object r15 = r7.getOrDefault(r12, r14)
                z2.q r15 = (p330z2.C7441q) r15
                java.lang.Object r17 = r9.getOrDefault(r13, r14)
                r14 = r17
                z2.q r14 = (p330z2.C7441q) r14
                if (r15 == 0) goto L_0x0168
                if (r14 == 0) goto L_0x0168
                java.util.ArrayList<z2.q> r0 = r1.f4952l
                r0.add(r15)
                java.util.ArrayList<z2.q> r0 = r1.f4953m
                r0.add(r14)
                r7.remove(r12)
                r9.remove(r13)
            L_0x0168:
                int r11 = r11 + 1
                r0 = r19
                goto L_0x0123
            L_0x016d:
                r2 = r3
                java.lang.Object r0 = r2.f22859c
                s0.b r0 = (p241s0.C6302b) r0
                java.lang.Object r3 = r5.f22859c
                s0.b r3 = (p241s0.C6302b) r3
                int r4 = r0.f19969d
                r6 = 0
            L_0x0179:
                if (r6 >= r4) goto L_0x01f5
                java.lang.Object r11 = r0.mo22422l(r6)
                android.view.View r11 = (android.view.View) r11
                if (r11 == 0) goto L_0x01bc
                boolean r12 = r1.mo5424t(r11)
                if (r12 == 0) goto L_0x01bc
                java.lang.Object r12 = r0.mo22416h(r6)
                r13 = 0
                java.lang.Object r12 = r3.getOrDefault(r12, r13)
                android.view.View r12 = (android.view.View) r12
                if (r12 == 0) goto L_0x01bc
                boolean r14 = r1.mo5424t(r12)
                if (r14 == 0) goto L_0x01bc
                java.lang.Object r14 = r7.getOrDefault(r11, r13)
                z2.q r14 = (p330z2.C7441q) r14
                java.lang.Object r15 = r9.getOrDefault(r12, r13)
                z2.q r15 = (p330z2.C7441q) r15
                if (r14 == 0) goto L_0x01bc
                if (r15 == 0) goto L_0x01bc
                java.util.ArrayList<z2.q> r13 = r1.f4952l
                r13.add(r14)
                java.util.ArrayList<z2.q> r13 = r1.f4953m
                r13.add(r15)
                r7.remove(r11)
                r9.remove(r12)
            L_0x01bc:
                int r6 = r6 + 1
                goto L_0x0179
            L_0x01bf:
                r2 = r3
                int r0 = r7.f19969d
            L_0x01c2:
                int r0 = r0 + -1
                if (r0 < 0) goto L_0x01f5
                java.lang.Object r3 = r7.mo22416h(r0)
                android.view.View r3 = (android.view.View) r3
                if (r3 == 0) goto L_0x01c2
                boolean r4 = r1.mo5424t(r3)
                if (r4 == 0) goto L_0x01c2
                java.lang.Object r3 = r9.remove(r3)
                z2.q r3 = (p330z2.C7441q) r3
                if (r3 == 0) goto L_0x01c2
                android.view.View r4 = r3.f22855b
                boolean r4 = r1.mo5424t(r4)
                if (r4 == 0) goto L_0x01c2
                java.lang.Object r4 = r7.mo22420j(r0)
                z2.q r4 = (p330z2.C7441q) r4
                java.util.ArrayList<z2.q> r6 = r1.f4952l
                r6.add(r4)
                java.util.ArrayList<z2.q> r4 = r1.f4953m
                r4.add(r3)
                goto L_0x01c2
            L_0x01f5:
                int r10 = r10 + 1
                r0 = r19
                r3 = r2
                r2 = 1
                r4 = 0
                r6 = 0
                goto L_0x009e
            L_0x01ff:
                r0 = 0
            L_0x0200:
                int r2 = r7.f19969d
                if (r0 >= r2) goto L_0x0220
                java.lang.Object r2 = r7.mo22422l(r0)
                z2.q r2 = (p330z2.C7441q) r2
                android.view.View r3 = r2.f22855b
                boolean r3 = r1.mo5424t(r3)
                if (r3 == 0) goto L_0x021d
                java.util.ArrayList<z2.q> r3 = r1.f4952l
                r3.add(r2)
                java.util.ArrayList<z2.q> r2 = r1.f4953m
                r3 = 0
                r2.add(r3)
            L_0x021d:
                int r0 = r0 + 1
                goto L_0x0200
            L_0x0220:
                r0 = 0
            L_0x0221:
                int r2 = r9.f19969d
                if (r0 >= r2) goto L_0x0241
                java.lang.Object r2 = r9.mo22422l(r0)
                z2.q r2 = (p330z2.C7441q) r2
                android.view.View r3 = r2.f22855b
                boolean r3 = r1.mo5424t(r3)
                if (r3 == 0) goto L_0x023e
                java.util.ArrayList<z2.q> r3 = r1.f4953m
                r3.add(r2)
                java.util.ArrayList<z2.q> r2 = r1.f4952l
                r3 = 0
                r2.add(r3)
            L_0x023e:
                int r0 = r0 + 1
                goto L_0x0221
            L_0x0241:
                s0.b r0 = androidx.transition.Transition.m3523p()
                int r2 = r0.f19969d
                z2.v r3 = p330z2.C7444t.f22865a
                android.view.WindowId r3 = r8.getWindowId()
                r4 = 1
                int r2 = r2 - r4
            L_0x024f:
                if (r2 < 0) goto L_0x02c6
                java.lang.Object r4 = r0.mo22416h(r2)
                android.animation.Animator r4 = (android.animation.Animator) r4
                if (r4 == 0) goto L_0x02c2
                r5 = 0
                java.lang.Object r6 = r0.getOrDefault(r4, r5)
                androidx.transition.Transition$b r6 = (androidx.transition.Transition.C1313b) r6
                if (r6 == 0) goto L_0x02c2
                android.view.View r5 = r6.f4963a
                if (r5 == 0) goto L_0x02c2
                z2.b0 r5 = r6.f4966d
                boolean r7 = r5 instanceof p330z2.C7422a0
                if (r7 == 0) goto L_0x0278
                z2.a0 r5 = (p330z2.C7422a0) r5
                android.view.WindowId r5 = r5.f22818a
                boolean r5 = r5.equals(r3)
                if (r5 == 0) goto L_0x0278
                r5 = 1
                goto L_0x0279
            L_0x0278:
                r5 = 0
            L_0x0279:
                if (r5 == 0) goto L_0x02c2
                z2.q r5 = r6.f4965c
                android.view.View r7 = r6.f4963a
                r9 = 1
                z2.q r10 = r1.mo5422r(r7, r9)
                z2.q r11 = r1.mo5421o(r7, r9)
                if (r10 != 0) goto L_0x029b
                if (r11 != 0) goto L_0x029b
                z2.r r9 = r1.f4949i
                java.lang.Object r9 = r9.f22858b
                s0.b r9 = (p241s0.C6302b) r9
                r12 = 0
                java.lang.Object r7 = r9.getOrDefault(r7, r12)
                r11 = r7
                z2.q r11 = (p330z2.C7441q) r11
                goto L_0x029c
            L_0x029b:
                r12 = 0
            L_0x029c:
                if (r10 != 0) goto L_0x02a0
                if (r11 == 0) goto L_0x02aa
            L_0x02a0:
                androidx.transition.Transition r6 = r6.f4967e
                boolean r5 = r6.mo5423s(r5, r11)
                if (r5 == 0) goto L_0x02aa
                r5 = 1
                goto L_0x02ab
            L_0x02aa:
                r5 = 0
            L_0x02ab:
                if (r5 == 0) goto L_0x02c3
                boolean r5 = r4.isRunning()
                if (r5 != 0) goto L_0x02be
                boolean r5 = r4.isStarted()
                if (r5 == 0) goto L_0x02ba
                goto L_0x02be
            L_0x02ba:
                r0.remove(r4)
                goto L_0x02c3
            L_0x02be:
                r4.cancel()
                goto L_0x02c3
            L_0x02c2:
                r12 = 0
            L_0x02c3:
                int r2 = r2 + -1
                goto L_0x024f
            L_0x02c6:
                z2.r r9 = r1.f4948h
                z2.r r10 = r1.f4949i
                java.util.ArrayList<z2.q> r11 = r1.f4952l
                java.util.ArrayList<z2.q> r12 = r1.f4953m
                r7 = r1
                r7.mo5419l(r8, r9, r10, r11, r12)
                r1.mo5430z()
                r0 = 1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.transition.C1328g.C1329a.onPreDraw():boolean");
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            this.f5013c.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f5013c.removeOnAttachStateChangeListener(this);
            C1328g.f5011c.remove(this.f5013c);
            ArrayList orDefault = C1328g.m3634b().getOrDefault(this.f5013c, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator it = orDefault.iterator();
                while (it.hasNext()) {
                    ((Transition) it.next()).mo5429y(this.f5013c);
                }
            }
            this.f5012b.mo5417i(true);
        }
    }

    /* renamed from: a */
    public static void m3633a(ViewGroup viewGroup, Transition transition) {
        if (!f5011c.contains(viewGroup)) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6340g.m15076c(viewGroup)) {
                f5011c.add(viewGroup);
                if (transition == null) {
                    transition = f5009a;
                }
                Transition j = transition.clone();
                ArrayList orDefault = m3634b().getOrDefault(viewGroup, null);
                if (orDefault != null && orDefault.size() > 0) {
                    Iterator it = orDefault.iterator();
                    while (it.hasNext()) {
                        ((Transition) it.next()).mo5426v(viewGroup);
                    }
                }
                if (j != null) {
                    j.mo5416h(viewGroup, true);
                }
                int i = C7434j.transition_current_scene;
                if (((C7436l) viewGroup.getTag(i)) == null) {
                    viewGroup.setTag(i, (Object) null);
                    if (j != null) {
                        C1329a aVar = new C1329a(viewGroup, j);
                        viewGroup.addOnAttachStateChangeListener(aVar);
                        viewGroup.getViewTreeObserver().addOnPreDrawListener(aVar);
                        return;
                    }
                    return;
                }
                throw null;
            }
        }
    }

    /* renamed from: b */
    public static C6302b<ViewGroup, ArrayList<Transition>> m3634b() {
        C6302b<ViewGroup, ArrayList<Transition>> bVar;
        WeakReference weakReference = f5010b.get();
        if (weakReference != null && (bVar = (C6302b) weakReference.get()) != null) {
            return bVar;
        }
        C6302b<ViewGroup, ArrayList<Transition>> bVar2 = new C6302b<>();
        f5010b.set(new WeakReference(bVar2));
        return bVar2;
    }
}
