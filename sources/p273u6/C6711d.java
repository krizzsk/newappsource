package p273u6;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import com.bumptech.glide.C2128h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p260t6.C6598d;
import p584jl.C17885a;

/* renamed from: u6.d */
public abstract class C6711d<T extends View, Z> implements C6720j<Z> {

    /* renamed from: d */
    public static final int f20799d = C2128h.glide_custom_view_target_tag;

    /* renamed from: b */
    public final C6712a f20800b;

    /* renamed from: c */
    public final T f20801c;

    /* renamed from: u6.d$a */
    public static final class C6712a {

        /* renamed from: d */
        public static Integer f20802d;

        /* renamed from: a */
        public final View f20803a;

        /* renamed from: b */
        public final ArrayList f20804b = new ArrayList();

        /* renamed from: c */
        public C6713a f20805c;

        /* renamed from: u6.d$a$a */
        public static final class C6713a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<C6712a> f20806b;

            public C6713a(C6712a aVar) {
                this.f20806b = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                boolean z;
                boolean z2;
                C6712a aVar = this.f20806b.get();
                if (aVar != null && !aVar.f20804b.isEmpty()) {
                    int c = aVar.mo22879c();
                    int b = aVar.mo22878b();
                    boolean z3 = false;
                    if (c > 0 || c == Integer.MIN_VALUE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (b > 0 || b == Integer.MIN_VALUE) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (z2) {
                            z3 = true;
                        }
                    }
                    if (z3) {
                        Iterator it = new ArrayList(aVar.f20804b).iterator();
                        while (it.hasNext()) {
                            ((C6719i) it.next()).mo11025b(c, b);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f20803a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f20805c);
                        }
                        aVar.f20805c = null;
                        aVar.f20804b.clear();
                    }
                }
                return true;
            }
        }

        public C6712a(View view) {
            this.f20803a = view;
        }

        /* renamed from: a */
        public final int mo22877a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f20803a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Context context = this.f20803a.getContext();
            if (f20802d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C17885a.m44458r(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f20802d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f20802d.intValue();
        }

        /* renamed from: b */
        public final int mo22878b() {
            int i;
            int paddingBottom = this.f20803a.getPaddingBottom() + this.f20803a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f20803a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return mo22877a(this.f20803a.getHeight(), i, paddingBottom);
        }

        /* renamed from: c */
        public final int mo22879c() {
            int i;
            int paddingRight = this.f20803a.getPaddingRight() + this.f20803a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f20803a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return mo22877a(this.f20803a.getWidth(), i, paddingRight);
        }
    }

    public C6711d(T t) {
        C17885a.m44458r(t);
        this.f20801c = t;
        this.f20800b = new C6712a(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r3 != false) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22742a(p273u6.C6719i r8) {
        /*
            r7 = this;
            u6.d$a r0 = r7.f20800b
            int r1 = r0.mo22879c()
            int r2 = r0.mo22878b()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            r5 = 0
            if (r1 > 0) goto L_0x0015
            if (r1 != r3) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r6 = 0
            goto L_0x0016
        L_0x0015:
            r6 = 1
        L_0x0016:
            if (r6 == 0) goto L_0x0023
            if (r2 > 0) goto L_0x001f
            if (r2 != r3) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            goto L_0x0020
        L_0x001f:
            r3 = 1
        L_0x0020:
            if (r3 == 0) goto L_0x0023
            goto L_0x0024
        L_0x0023:
            r4 = 0
        L_0x0024:
            if (r4 == 0) goto L_0x002a
            r8.mo11025b(r1, r2)
            goto L_0x004b
        L_0x002a:
            java.util.ArrayList r1 = r0.f20804b
            boolean r1 = r1.contains(r8)
            if (r1 != 0) goto L_0x0037
            java.util.ArrayList r1 = r0.f20804b
            r1.add(r8)
        L_0x0037:
            u6.d$a$a r8 = r0.f20805c
            if (r8 != 0) goto L_0x004b
            android.view.View r8 = r0.f20803a
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()
            u6.d$a$a r1 = new u6.d$a$a
            r1.<init>(r0)
            r0.f20805c = r1
            r8.addOnPreDrawListener(r1)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p273u6.C6711d.mo22742a(u6.i):void");
    }

    /* renamed from: b */
    public final void mo22743b(Drawable drawable) {
        mo22875g(drawable);
    }

    /* renamed from: c */
    public final C6598d mo22744c() {
        Object tag = this.f20801c.getTag(f20799d);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C6598d) {
            return (C6598d) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    /* renamed from: d */
    public final void mo22005d(Drawable drawable) {
        C6712a aVar = this.f20800b;
        ViewTreeObserver viewTreeObserver = aVar.f20803a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f20805c);
        }
        aVar.f20805c = null;
        aVar.f20804b.clear();
        mo10886f(drawable);
    }

    /* renamed from: e */
    public final void mo22746e(C6598d dVar) {
        this.f20801c.setTag(f20799d, dVar);
    }

    /* renamed from: f */
    public abstract void mo10886f(Drawable drawable);

    /* renamed from: g */
    public void mo22875g(Drawable drawable) {
    }

    /* renamed from: j */
    public final void mo22753j(C6719i iVar) {
        this.f20800b.f20804b.remove(iVar);
    }

    public final void onDestroy() {
    }

    public final void onStart() {
    }

    public final void onStop() {
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Target for: ");
        k.append(this.f20801c);
        return k.toString();
    }
}
