package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.widget.C0427l0;
import androidx.appcompat.widget.C0458t0;
import p114i.C5218d;
import p114i.C5221g;
import p188o.C5899d;

/* renamed from: androidx.appcompat.view.menu.l */
public final class C0304l extends C5899d implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: w */
    public static final int f992w = C5221g.abc_popup_menu_item_layout;

    /* renamed from: c */
    public final Context f993c;

    /* renamed from: d */
    public final C0291f f994d;

    /* renamed from: e */
    public final C0290e f995e;

    /* renamed from: f */
    public final boolean f996f;

    /* renamed from: g */
    public final int f997g;

    /* renamed from: h */
    public final int f998h;

    /* renamed from: i */
    public final int f999i;

    /* renamed from: j */
    public final C0458t0 f1000j;

    /* renamed from: k */
    public final C0305a f1001k = new C0305a();

    /* renamed from: l */
    public final C0306b f1002l = new C0306b();

    /* renamed from: m */
    public PopupWindow.OnDismissListener f1003m;

    /* renamed from: n */
    public View f1004n;

    /* renamed from: o */
    public View f1005o;

    /* renamed from: p */
    public C0300j.C0301a f1006p;

    /* renamed from: q */
    public ViewTreeObserver f1007q;

    /* renamed from: r */
    public boolean f1008r;

    /* renamed from: s */
    public boolean f1009s;

    /* renamed from: t */
    public int f1010t;

    /* renamed from: u */
    public int f1011u = 0;

    /* renamed from: v */
    public boolean f1012v;

    /* renamed from: androidx.appcompat.view.menu.l$a */
    public class C0305a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0305a() {
        }

        public final void onGlobalLayout() {
            if (C0304l.this.mo1048a()) {
                C0304l lVar = C0304l.this;
                if (!lVar.f1000j.f1250y) {
                    View view = lVar.f1005o;
                    if (view == null || !view.isShown()) {
                        C0304l.this.dismiss();
                    } else {
                        C0304l.this.f1000j.show();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.l$b */
    public class C0306b implements View.OnAttachStateChangeListener {
        public C0306b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0304l.this.f1007q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0304l.this.f1007q = view.getViewTreeObserver();
                }
                C0304l lVar = C0304l.this;
                lVar.f1007q.removeGlobalOnLayoutListener(lVar.f1001k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public C0304l(int i, int i2, Context context, View view, C0291f fVar, boolean z) {
        this.f993c = context;
        this.f994d = fVar;
        this.f996f = z;
        this.f995e = new C0290e(fVar, LayoutInflater.from(context), z, f992w);
        this.f998h = i;
        this.f999i = i2;
        Resources resources = context.getResources();
        this.f997g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5218d.abc_config_prefDialogWidth));
        this.f1004n = view;
        this.f1000j = new C0458t0(context, i, i2);
        fVar.mo1101b(this, context);
    }

    /* renamed from: a */
    public final boolean mo1048a() {
        return !this.f1008r && this.f1000j.mo1048a();
    }

    /* renamed from: b */
    public final void mo1049b(C0291f fVar, boolean z) {
        if (fVar == this.f994d) {
            dismiss();
            C0300j.C0301a aVar = this.f1006p;
            if (aVar != null) {
                aVar.mo903b(fVar, z);
            }
        }
    }

    /* renamed from: c */
    public final void mo1044c(C0300j.C0301a aVar) {
        this.f1006p = aVar;
    }

    public final void dismiss() {
        if (mo1048a()) {
            this.f1000j.dismiss();
        }
    }

    /* renamed from: e */
    public final void mo1051e(Parcelable parcelable) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0072  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1052f(androidx.appcompat.view.menu.C0307m r10) {
        /*
            r9 = this;
            boolean r0 = r10.hasVisibleItems()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.i r0 = new androidx.appcompat.view.menu.i
            android.content.Context r5 = r9.f993c
            android.view.View r6 = r9.f1005o
            boolean r8 = r9.f996f
            int r3 = r9.f998h
            int r4 = r9.f999i
            r2 = r0
            r7 = r10
            r2.<init>(r3, r4, r5, r6, r7, r8)
            androidx.appcompat.view.menu.j$a r2 = r9.f1006p
            r0.f987i = r2
            o.d r3 = r0.f988j
            if (r3 == 0) goto L_0x0023
            r3.mo1044c(r2)
        L_0x0023:
            boolean r2 = p188o.C5899d.m14375v(r10)
            r0.f986h = r2
            o.d r3 = r0.f988j
            if (r3 == 0) goto L_0x0030
            r3.mo1061p(r2)
        L_0x0030:
            android.widget.PopupWindow$OnDismissListener r2 = r9.f1003m
            r0.f989k = r2
            r2 = 0
            r9.f1003m = r2
            androidx.appcompat.view.menu.f r2 = r9.f994d
            r2.mo1102c(r1)
            androidx.appcompat.widget.t0 r2 = r9.f1000j
            int r3 = r2.f1232g
            int r2 = r2.mo1754k()
            int r4 = r9.f1011u
            android.view.View r5 = r9.f1004n
            java.util.WeakHashMap<android.view.View, s1.p0> r6 = p242s1.C6333d0.f19990a
            int r5 = p242s1.C6333d0.C6338e.m15063d(r5)
            int r4 = android.view.Gravity.getAbsoluteGravity(r4, r5)
            r4 = r4 & 7
            r5 = 5
            if (r4 != r5) goto L_0x005e
            android.view.View r4 = r9.f1004n
            int r4 = r4.getWidth()
            int r3 = r3 + r4
        L_0x005e:
            boolean r4 = r0.mo1208b()
            r5 = 1
            if (r4 == 0) goto L_0x0066
            goto L_0x006f
        L_0x0066:
            android.view.View r4 = r0.f984f
            if (r4 != 0) goto L_0x006c
            r0 = 0
            goto L_0x0070
        L_0x006c:
            r0.mo1210d(r3, r2, r5, r5)
        L_0x006f:
            r0 = 1
        L_0x0070:
            if (r0 == 0) goto L_0x007a
            androidx.appcompat.view.menu.j$a r0 = r9.f1006p
            if (r0 == 0) goto L_0x0079
            r0.mo904c(r10)
        L_0x0079:
            return r5
        L_0x007a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0304l.mo1052f(androidx.appcompat.view.menu.m):boolean");
    }

    /* renamed from: g */
    public final Parcelable mo1053g() {
        return null;
    }

    /* renamed from: i */
    public final void mo1054i(boolean z) {
        this.f1009s = false;
        C0290e eVar = this.f995e;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public final boolean mo1055j() {
        return false;
    }

    /* renamed from: l */
    public final void mo1056l(C0291f fVar) {
    }

    /* renamed from: n */
    public final C0427l0 mo1057n() {
        return this.f1000j.f1229d;
    }

    /* renamed from: o */
    public final void mo1058o(View view) {
        this.f1004n = view;
    }

    public final void onDismiss() {
        this.f1008r = true;
        this.f994d.mo1102c(true);
        ViewTreeObserver viewTreeObserver = this.f1007q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f1007q = this.f1005o.getViewTreeObserver();
            }
            this.f1007q.removeGlobalOnLayoutListener(this.f1001k);
            this.f1007q = null;
        }
        this.f1005o.removeOnAttachStateChangeListener(this.f1002l);
        PopupWindow.OnDismissListener onDismissListener = this.f1003m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    /* renamed from: p */
    public final void mo1061p(boolean z) {
        this.f995e.f917d = z;
    }

    /* renamed from: q */
    public final void mo1062q(int i) {
        this.f1011u = i;
    }

    /* renamed from: r */
    public final void mo1063r(int i) {
        this.f1000j.f1232g = i;
    }

    /* renamed from: s */
    public final void mo1064s(PopupWindow.OnDismissListener onDismissListener) {
        this.f1003m = onDismissListener;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ca A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00cb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void show() {
        /*
            r7 = this;
            boolean r0 = r7.mo1048a()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x000a
            goto L_0x00c7
        L_0x000a:
            boolean r0 = r7.f1008r
            if (r0 != 0) goto L_0x00c8
            android.view.View r0 = r7.f1004n
            if (r0 != 0) goto L_0x0014
            goto L_0x00c8
        L_0x0014:
            r7.f1005o = r0
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            android.widget.PopupWindow r0 = r0.f1251z
            r0.setOnDismissListener(r7)
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            r0.f1242q = r7
            r0.f1250y = r2
            android.widget.PopupWindow r0 = r0.f1251z
            r0.setFocusable(r2)
            android.view.View r0 = r7.f1005o
            android.view.ViewTreeObserver r3 = r7.f1007q
            if (r3 != 0) goto L_0x0030
            r3 = 1
            goto L_0x0031
        L_0x0030:
            r3 = 0
        L_0x0031:
            android.view.ViewTreeObserver r4 = r0.getViewTreeObserver()
            r7.f1007q = r4
            if (r3 == 0) goto L_0x003e
            androidx.appcompat.view.menu.l$a r3 = r7.f1001k
            r4.addOnGlobalLayoutListener(r3)
        L_0x003e:
            androidx.appcompat.view.menu.l$b r3 = r7.f1002l
            r0.addOnAttachStateChangeListener(r3)
            androidx.appcompat.widget.t0 r3 = r7.f1000j
            r3.f1241p = r0
            int r0 = r7.f1011u
            r3.f1238m = r0
            boolean r0 = r7.f1009s
            if (r0 != 0) goto L_0x005d
            androidx.appcompat.view.menu.e r0 = r7.f995e
            android.content.Context r3 = r7.f993c
            int r4 = r7.f997g
            int r0 = p188o.C5899d.m14374m(r0, r3, r4)
            r7.f1010t = r0
            r7.f1009s = r2
        L_0x005d:
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            int r3 = r7.f1010t
            r0.mo1757q(r3)
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            android.widget.PopupWindow r0 = r0.f1251z
            r3 = 2
            r0.setInputMethodMode(r3)
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            android.graphics.Rect r3 = r7.f18974b
            r4 = 0
            if (r3 == 0) goto L_0x007c
            r0.getClass()
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r3)
            goto L_0x007d
        L_0x007c:
            r5 = r4
        L_0x007d:
            r0.f1249x = r5
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            r0.show()
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            androidx.appcompat.widget.l0 r0 = r0.f1229d
            r0.setOnKeyListener(r7)
            boolean r3 = r7.f1012v
            if (r3 == 0) goto L_0x00bb
            androidx.appcompat.view.menu.f r3 = r7.f994d
            java.lang.CharSequence r3 = r3.f934m
            if (r3 == 0) goto L_0x00bb
            android.content.Context r3 = r7.f993c
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            int r5 = p114i.C5221g.abc_popup_menu_header_item_layout
            android.view.View r3 = r3.inflate(r5, r0, r1)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r3.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x00b5
            androidx.appcompat.view.menu.f r6 = r7.f994d
            java.lang.CharSequence r6 = r6.f934m
            r5.setText(r6)
        L_0x00b5:
            r3.setEnabled(r1)
            r0.addHeaderView(r3, r4, r1)
        L_0x00bb:
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            androidx.appcompat.view.menu.e r1 = r7.f995e
            r0.mo1626l(r1)
            androidx.appcompat.widget.t0 r0 = r7.f1000j
            r0.show()
        L_0x00c7:
            r1 = 1
        L_0x00c8:
            if (r1 == 0) goto L_0x00cb
            return
        L_0x00cb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "StandardMenuPopup cannot be used without an anchor"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0304l.show():void");
    }

    /* renamed from: t */
    public final void mo1066t(boolean z) {
        this.f1012v = z;
    }

    /* renamed from: u */
    public final void mo1067u(int i) {
        this.f1000j.mo1753h(i);
    }
}
