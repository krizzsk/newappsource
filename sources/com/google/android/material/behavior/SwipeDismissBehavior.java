package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.C14129f;
import com.google.android.material.snackbar.C14132i;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p306x1.C7148c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    public C7148c f34282a;

    /* renamed from: b */
    public C13899b f34283b;

    /* renamed from: c */
    public boolean f34284c;

    /* renamed from: d */
    public int f34285d = 2;

    /* renamed from: e */
    public float f34286e = 0.5f;

    /* renamed from: f */
    public float f34287f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g */
    public float f34288g = 0.5f;

    /* renamed from: h */
    public final C13898a f34289h = new C13898a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    public class C13898a extends C7148c.C7151c {

        /* renamed from: a */
        public int f34290a;

        /* renamed from: b */
        public int f34291b = -1;

        public C13898a() {
        }

        /* renamed from: a */
        public final int mo3593a(View view, int i) {
            boolean z;
            int i2;
            int i3;
            int i4;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6338e.m15063d(view) == 1) {
                z = true;
            } else {
                z = false;
            }
            int i5 = SwipeDismissBehavior.this.f34285d;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f34290a - view.getWidth();
                    i2 = view.getWidth() + this.f34290a;
                } else if (z) {
                    i3 = this.f34290a;
                    i4 = view.getWidth();
                } else {
                    i3 = this.f34290a - view.getWidth();
                    i2 = this.f34290a;
                }
                return Math.min(Math.max(i3, i), i2);
            } else if (z) {
                i3 = this.f34290a - view.getWidth();
                i2 = this.f34290a;
                return Math.min(Math.max(i3, i), i2);
            } else {
                i3 = this.f34290a;
                i4 = view.getWidth();
            }
            i2 = i4 + i3;
            return Math.min(Math.max(i3, i), i2);
        }

        /* renamed from: b */
        public final int mo3594b(View view, int i) {
            return view.getTop();
        }

        /* renamed from: c */
        public final int mo3595c(View view) {
            return view.getWidth();
        }

        /* renamed from: g */
        public final void mo3598g(int i, View view) {
            this.f34291b = i;
            this.f34290a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: h */
        public final void mo3599h(int i) {
            C13899b bVar = SwipeDismissBehavior.this.f34283b;
            if (bVar != null) {
                C14129f fVar = (C14129f) bVar;
                if (i == 0) {
                    C14132i b = C14132i.m35170b();
                    BaseTransientBottomBar.C14118c cVar = fVar.f35349a.f35321n;
                    synchronized (b.f35354a) {
                        if (b.mo42276c(cVar)) {
                            C14132i.C14135c cVar2 = b.f35356c;
                            if (cVar2.f35361c) {
                                cVar2.f35361c = false;
                                b.mo42277d(cVar2);
                            }
                        }
                    }
                } else if (i == 1 || i == 2) {
                    C14132i b2 = C14132i.m35170b();
                    BaseTransientBottomBar.C14118c cVar3 = fVar.f35349a.f35321n;
                    synchronized (b2.f35354a) {
                        if (b2.mo42276c(cVar3)) {
                            C14132i.C14135c cVar4 = b2.f35356c;
                            if (!cVar4.f35361c) {
                                cVar4.f35361c = true;
                                b2.f35355b.removeCallbacksAndMessages(cVar4);
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: i */
        public final void mo3600i(View view, int i, int i2) {
            float width = (((float) view.getWidth()) * SwipeDismissBehavior.this.f34287f) + ((float) this.f34290a);
            float width2 = (((float) view.getWidth()) * SwipeDismissBehavior.this.f34288g) + ((float) this.f34290a);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setAlpha(Math.min(Math.max(BitmapDescriptorFactory.HUE_RED, 1.0f - ((f - width) / (width2 - width))), 1.0f));
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
            if (java.lang.Math.abs(r9) >= java.lang.Math.round(((float) r8.getWidth()) * r7.f34292c.f34286e)) goto L_0x0055;
         */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0066  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
        /* renamed from: j */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo3601j(android.view.View r8, float r9, float r10) {
            /*
                r7 = this;
                r10 = -1
                r7.f34291b = r10
                int r10 = r8.getWidth()
                r0 = 0
                r1 = 1
                r2 = 0
                int r3 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0039
                java.util.WeakHashMap<android.view.View, s1.p0> r4 = p242s1.C6333d0.f19990a
                int r4 = p242s1.C6333d0.C6338e.m15063d(r8)
                if (r4 != r1) goto L_0x0018
                r4 = 1
                goto L_0x0019
            L_0x0018:
                r4 = 0
            L_0x0019:
                com.google.android.material.behavior.SwipeDismissBehavior r5 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r5 = r5.f34285d
                r6 = 2
                if (r5 != r6) goto L_0x0021
                goto L_0x0055
            L_0x0021:
                if (r5 != 0) goto L_0x002d
                if (r4 == 0) goto L_0x002a
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L_0x0057
                goto L_0x0055
            L_0x002a:
                if (r3 <= 0) goto L_0x0057
                goto L_0x0055
            L_0x002d:
                if (r5 != r1) goto L_0x0057
                if (r4 == 0) goto L_0x0034
                if (r3 <= 0) goto L_0x0057
                goto L_0x0055
            L_0x0034:
                int r9 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
                if (r9 >= 0) goto L_0x0057
                goto L_0x0055
            L_0x0039:
                int r9 = r8.getLeft()
                int r2 = r7.f34290a
                int r9 = r9 - r2
                int r2 = r8.getWidth()
                float r2 = (float) r2
                com.google.android.material.behavior.SwipeDismissBehavior r3 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r3 = r3.f34286e
                float r2 = r2 * r3
                int r2 = java.lang.Math.round(r2)
                int r9 = java.lang.Math.abs(r9)
                if (r9 < r2) goto L_0x0057
            L_0x0055:
                r9 = 1
                goto L_0x0058
            L_0x0057:
                r9 = 0
            L_0x0058:
                if (r9 == 0) goto L_0x0066
                int r9 = r8.getLeft()
                int r0 = r7.f34290a
                if (r9 >= r0) goto L_0x0064
                int r0 = r0 - r10
                goto L_0x006a
            L_0x0064:
                int r0 = r0 + r10
                goto L_0x006a
            L_0x0066:
                int r9 = r7.f34290a
                r0 = r9
                r1 = 0
            L_0x006a:
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                x1.c r9 = r9.f34282a
                int r10 = r8.getTop()
                boolean r9 = r9.mo23430s(r0, r10)
                if (r9 == 0) goto L_0x0085
                com.google.android.material.behavior.SwipeDismissBehavior$c r9 = new com.google.android.material.behavior.SwipeDismissBehavior$c
                com.google.android.material.behavior.SwipeDismissBehavior r10 = com.google.android.material.behavior.SwipeDismissBehavior.this
                r9.<init>(r8, r1)
                java.util.WeakHashMap<android.view.View, s1.p0> r10 = p242s1.C6333d0.f19990a
                p242s1.C6333d0.C6337d.m15053m(r8, r9)
                goto L_0x0092
            L_0x0085:
                if (r1 == 0) goto L_0x0092
                com.google.android.material.behavior.SwipeDismissBehavior r9 = com.google.android.material.behavior.SwipeDismissBehavior.this
                com.google.android.material.behavior.SwipeDismissBehavior$b r9 = r9.f34283b
                if (r9 == 0) goto L_0x0092
                com.google.android.material.snackbar.f r9 = (com.google.android.material.snackbar.C14129f) r9
                r9.mo42272a(r8)
            L_0x0092:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C13898a.mo3601j(android.view.View, float, float):void");
        }

        /* renamed from: k */
        public final boolean mo3602k(int i, View view) {
            int i2 = this.f34291b;
            if ((i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo41000a(view)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    public interface C13899b {
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public class C13900c implements Runnable {

        /* renamed from: b */
        public final View f34293b;

        /* renamed from: c */
        public final boolean f34294c;

        public C13900c(View view, boolean z) {
            this.f34293b = view;
            this.f34294c = z;
        }

        public final void run() {
            C13899b bVar;
            C7148c cVar = SwipeDismissBehavior.this.f34282a;
            if (cVar != null && cVar.mo23421h(true)) {
                View view = this.f34293b;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                C6333d0.C6337d.m15053m(view, this);
            } else if (this.f34294c && (bVar = SwipeDismissBehavior.this.f34283b) != null) {
                ((C14129f) bVar).mo42272a(this.f34293b);
            }
        }
    }

    /* renamed from: a */
    public boolean mo41000a(View view) {
        return true;
    }

    public boolean onInterceptTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f34284c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo3306u(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f34284c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f34284c = false;
        }
        if (!z) {
            return false;
        }
        if (this.f34282a == null) {
            this.f34282a = new C7148c(coordinatorLayout.getContext(), coordinatorLayout, this.f34289h);
        }
        return this.f34282a.mo23431t(motionEvent);
    }

    public final boolean onLayoutChild(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, v, i);
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        if (C6333d0.C6337d.m15043c(v) == 0) {
            C6333d0.C6337d.m15059s(v, 1);
            C6333d0.m15026n(1048576, v);
            C6333d0.m15021i(0, v);
            if (mo41000a(v)) {
                C6333d0.m15027o(v, C6531g.C6532a.f20344l, new C13901a(this));
            }
        }
        return onLayoutChild;
    }

    public final boolean onTouchEvent(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C7148c cVar = this.f34282a;
        if (cVar == null) {
            return false;
        }
        cVar.mo23424m(motionEvent);
        return true;
    }
}
