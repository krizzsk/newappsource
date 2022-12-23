package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0300j;
import java.util.WeakHashMap;
import p188o.C5899d;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.view.menu.i */
public class C0297i {

    /* renamed from: a */
    public final Context f979a;

    /* renamed from: b */
    public final C0291f f980b;

    /* renamed from: c */
    public final boolean f981c;

    /* renamed from: d */
    public final int f982d;

    /* renamed from: e */
    public final int f983e;

    /* renamed from: f */
    public View f984f;

    /* renamed from: g */
    public int f985g;

    /* renamed from: h */
    public boolean f986h;

    /* renamed from: i */
    public C0300j.C0301a f987i;

    /* renamed from: j */
    public C5899d f988j;

    /* renamed from: k */
    public PopupWindow.OnDismissListener f989k;

    /* renamed from: l */
    public final C0298a f990l;

    /* renamed from: androidx.appcompat.view.menu.i$a */
    public class C0298a implements PopupWindow.OnDismissListener {
        public C0298a() {
        }

        public final void onDismiss() {
            C0297i.this.mo1209c();
        }
    }

    /* renamed from: androidx.appcompat.view.menu.i$b */
    public static class C0299b {
        /* renamed from: a */
        public static void m701a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public C0297i(Context context, C0291f fVar, View view, boolean z, int i) {
        this(i, 0, context, view, fVar, z);
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [o.d, androidx.appcompat.view.menu.j] */
    /* JADX WARNING: type inference failed for: r7v1, types: [androidx.appcompat.view.menu.l] */
    /* JADX WARNING: type inference failed for: r1v13, types: [androidx.appcompat.view.menu.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p188o.C5899d mo1207a() {
        /*
            r14 = this;
            o.d r0 = r14.f988j
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r14.f979a
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r1 = new android.graphics.Point
            r1.<init>()
            androidx.appcompat.view.menu.C0297i.C0299b.m701a(r0, r1)
            int r0 = r1.x
            int r1 = r1.y
            int r0 = java.lang.Math.min(r0, r1)
            android.content.Context r1 = r14.f979a
            android.content.res.Resources r1 = r1.getResources()
            int r2 = p114i.C5218d.abc_cascading_menus_min_smallest_width
            int r1 = r1.getDimensionPixelSize(r2)
            if (r0 < r1) goto L_0x0033
            r0 = 1
            goto L_0x0034
        L_0x0033:
            r0 = 0
        L_0x0034:
            if (r0 == 0) goto L_0x0047
            androidx.appcompat.view.menu.b r0 = new androidx.appcompat.view.menu.b
            android.content.Context r2 = r14.f979a
            android.view.View r3 = r14.f984f
            int r4 = r14.f982d
            int r5 = r14.f983e
            boolean r6 = r14.f981c
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x0059
        L_0x0047:
            androidx.appcompat.view.menu.l r0 = new androidx.appcompat.view.menu.l
            android.content.Context r10 = r14.f979a
            androidx.appcompat.view.menu.f r12 = r14.f980b
            android.view.View r11 = r14.f984f
            int r8 = r14.f982d
            int r9 = r14.f983e
            boolean r13 = r14.f981c
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L_0x0059:
            androidx.appcompat.view.menu.f r1 = r14.f980b
            r0.mo1056l(r1)
            androidx.appcompat.view.menu.i$a r1 = r14.f990l
            r0.mo1064s(r1)
            android.view.View r1 = r14.f984f
            r0.mo1058o(r1)
            androidx.appcompat.view.menu.j$a r1 = r14.f987i
            r0.mo1044c(r1)
            boolean r1 = r14.f986h
            r0.mo1061p(r1)
            int r1 = r14.f985g
            r0.mo1062q(r1)
            r14.f988j = r0
        L_0x0079:
            o.d r0 = r14.f988j
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0297i.mo1207a():o.d");
    }

    /* renamed from: b */
    public final boolean mo1208b() {
        C5899d dVar = this.f988j;
        return dVar != null && dVar.mo1048a();
    }

    /* renamed from: c */
    public void mo1209c() {
        this.f988j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f989k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* renamed from: d */
    public final void mo1210d(int i, int i2, boolean z, boolean z2) {
        C5899d a = mo1207a();
        a.mo1066t(z2);
        if (z) {
            int i3 = this.f985g;
            View view = this.f984f;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if ((Gravity.getAbsoluteGravity(i3, C6333d0.C6338e.m15063d(view)) & 7) == 5) {
                i -= this.f984f.getWidth();
            }
            a.mo1063r(i);
            a.mo1067u(i2);
            int i4 = (int) ((this.f979a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a.f18974b = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a.show();
    }

    public C0297i(int i, int i2, Context context, View view, C0291f fVar, boolean z) {
        this.f985g = 8388611;
        this.f990l = new C0298a();
        this.f979a = context;
        this.f980b = fVar;
        this.f984f = view;
        this.f981c = z;
        this.f982d = i;
        this.f983e = i2;
    }
}
