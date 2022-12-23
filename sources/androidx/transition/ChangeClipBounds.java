package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import java.util.WeakHashMap;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p330z2.C7441q;

public class ChangeClipBounds extends Transition {

    /* renamed from: z */
    public static final String[] f4894z = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    public class C1293a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ View f4895a;

        public C1293a(View view) {
            this.f4895a = view;
        }

        public final void onAnimationEnd(Animator animator) {
            View view = this.f4895a;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6339f.m15073c(view, (Rect) null);
        }
    }

    public ChangeClipBounds() {
    }

    /* renamed from: J */
    public final void mo5378J(C7441q qVar) {
        View view = qVar.f22855b;
        if (view.getVisibility() != 8) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            Rect a = C6333d0.C6339f.m15071a(view);
            qVar.f22854a.put("android:clipBounds:clip", a);
            if (a == null) {
                qVar.f22854a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    /* renamed from: d */
    public final void mo5356d(C7441q qVar) {
        mo5378J(qVar);
    }

    /* renamed from: g */
    public final void mo5357g(C7441q qVar) {
        mo5378J(qVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.animation.Animator mo5358k(android.view.ViewGroup r8, p330z2.C7441q r9, p330z2.C7441q r10) {
        /*
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L_0x0080
            if (r10 == 0) goto L_0x0080
            java.util.HashMap r0 = r9.f22854a
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0080
            java.util.HashMap r0 = r10.f22854a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x0080
        L_0x0018:
            java.util.HashMap r0 = r9.f22854a
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.HashMap r2 = r10.f22854a
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x002e
            r4 = 1
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0034
            return r8
        L_0x0034:
            java.lang.String r5 = "android:clipBounds:bounds"
            if (r0 != 0) goto L_0x0042
            java.util.HashMap r9 = r9.f22854a
            java.lang.Object r9 = r9.get(r5)
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x004d
        L_0x0042:
            if (r1 != 0) goto L_0x004d
            java.util.HashMap r9 = r10.f22854a
            java.lang.Object r9 = r9.get(r5)
            r1 = r9
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x004d:
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto L_0x0054
            return r8
        L_0x0054:
            android.view.View r8 = r10.f22855b
            java.util.WeakHashMap<android.view.View, s1.p0> r9 = p242s1.C6333d0.f19990a
            p242s1.C6333d0.C6339f.m15073c(r8, r0)
            z2.k r8 = new z2.k
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.<init>(r9)
            android.view.View r9 = r10.f22855b
            z2.t$b r5 = p330z2.C7444t.f22867c
            r6 = 2
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            r6[r2] = r0
            r6[r3] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r9, r5, r8, r6)
            if (r4 == 0) goto L_0x0080
            android.view.View r9 = r10.f22855b
            androidx.transition.ChangeClipBounds$a r10 = new androidx.transition.ChangeClipBounds$a
            r10.<init>(r9)
            r8.addListener(r10)
        L_0x0080:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeClipBounds.mo5358k(android.view.ViewGroup, z2.q, z2.q):android.animation.Animator");
    }

    /* renamed from: q */
    public final String[] mo5359q() {
        return f4894z;
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
