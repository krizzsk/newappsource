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

@Deprecated
/* renamed from: u6.k */
public abstract class C6721k<T extends View, Z> extends C6708a<Z> {

    /* renamed from: e */
    public static int f20812e = C2128h.glide_custom_view_target_tag;

    /* renamed from: c */
    public final T f20813c;

    /* renamed from: d */
    public final C6722a f20814d;

    /* renamed from: u6.k$a */
    public static final class C6722a {

        /* renamed from: d */
        public static Integer f20815d;

        /* renamed from: a */
        public final View f20816a;

        /* renamed from: b */
        public final ArrayList f20817b = new ArrayList();

        /* renamed from: c */
        public C6723a f20818c;

        /* renamed from: u6.k$a$a */
        public static final class C6723a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: b */
            public final WeakReference<C6722a> f20819b;

            public C6723a(C6722a aVar) {
                this.f20819b = new WeakReference<>(aVar);
            }

            public final boolean onPreDraw() {
                boolean z;
                boolean z2;
                C6722a aVar = this.f20819b.get();
                if (aVar != null && !aVar.f20817b.isEmpty()) {
                    int c = aVar.mo22885c();
                    int b = aVar.mo22884b();
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
                        Iterator it = new ArrayList(aVar.f20817b).iterator();
                        while (it.hasNext()) {
                            ((C6719i) it.next()).mo11025b(c, b);
                        }
                        ViewTreeObserver viewTreeObserver = aVar.f20816a.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.removeOnPreDrawListener(aVar.f20818c);
                        }
                        aVar.f20818c = null;
                        aVar.f20817b.clear();
                    }
                }
                return true;
            }
        }

        public C6722a(View view) {
            this.f20816a = view;
        }

        /* renamed from: a */
        public final int mo22883a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f20816a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            Context context = this.f20816a.getContext();
            if (f20815d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                C17885a.m44458r(windowManager);
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f20815d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f20815d.intValue();
        }

        /* renamed from: b */
        public final int mo22884b() {
            int i;
            int paddingBottom = this.f20816a.getPaddingBottom() + this.f20816a.getPaddingTop();
            ViewGroup.LayoutParams layoutParams = this.f20816a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return mo22883a(this.f20816a.getHeight(), i, paddingBottom);
        }

        /* renamed from: c */
        public final int mo22885c() {
            int i;
            int paddingRight = this.f20816a.getPaddingRight() + this.f20816a.getPaddingLeft();
            ViewGroup.LayoutParams layoutParams = this.f20816a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return mo22883a(this.f20816a.getWidth(), i, paddingRight);
        }
    }

    public C6721k(T t) {
        C17885a.m44458r(t);
        this.f20813c = t;
        this.f20814d = new C6722a(t);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        if (r3 != false) goto L_0x0024;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22742a(p273u6.C6719i r8) {
        /*
            r7 = this;
            u6.k$a r0 = r7.f20814d
            int r1 = r0.mo22885c()
            int r2 = r0.mo22884b()
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
            java.util.ArrayList r1 = r0.f20817b
            boolean r1 = r1.contains(r8)
            if (r1 != 0) goto L_0x0037
            java.util.ArrayList r1 = r0.f20817b
            r1.add(r8)
        L_0x0037:
            u6.k$a$a r8 = r0.f20818c
            if (r8 != 0) goto L_0x004b
            android.view.View r8 = r0.f20816a
            android.view.ViewTreeObserver r8 = r8.getViewTreeObserver()
            u6.k$a$a r1 = new u6.k$a$a
            r1.<init>(r0)
            r0.f20818c = r1
            r8.addOnPreDrawListener(r1)
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p273u6.C6721k.mo22742a(u6.i):void");
    }

    /* renamed from: c */
    public final C6598d mo22744c() {
        Object tag = this.f20813c.getTag(f20812e);
        if (tag == null) {
            return null;
        }
        if (tag instanceof C6598d) {
            return (C6598d) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    /* renamed from: d */
    public void mo22005d(Drawable drawable) {
        C6722a aVar = this.f20814d;
        ViewTreeObserver viewTreeObserver = aVar.f20816a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(aVar.f20818c);
        }
        aVar.f20818c = null;
        aVar.f20817b.clear();
    }

    /* renamed from: e */
    public final void mo22746e(C6598d dVar) {
        this.f20813c.setTag(f20812e, dVar);
    }

    /* renamed from: j */
    public final void mo22753j(C6719i iVar) {
        this.f20814d.f20817b.remove(iVar);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Target for: ");
        k.append(this.f20813c);
        return k.toString();
    }
}
