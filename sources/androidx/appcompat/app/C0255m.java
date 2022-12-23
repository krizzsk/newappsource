package androidx.appcompat.app;

import android.view.View;
import ce0.C21100e;
import p242s1.C6386q0;

/* renamed from: androidx.appcompat.app.m */
public final class C0255m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ AppCompatDelegateImpl f742b;

    /* renamed from: androidx.appcompat.app.m$a */
    public class C0256a extends C21100e {
        public C0256a() {
        }

        /* renamed from: b */
        public final void mo909b(View view) {
            C0255m.this.f742b.f662q.setAlpha(1.0f);
            C0255m.this.f742b.f665t.mo22497g((C6386q0) null);
            C0255m.this.f742b.f665t = null;
        }

        /* renamed from: d */
        public final void mo957d() {
            C0255m.this.f742b.f662q.setVisibility(0);
        }
    }

    public C0255m(AppCompatDelegateImpl appCompatDelegateImpl) {
        this.f742b = appCompatDelegateImpl;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0050  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            android.widget.PopupWindow r1 = r0.f663r
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f662q
            r2 = 55
            r3 = 0
            r1.showAtLocation(r0, r2, r3, r3)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            s1.p0 r0 = r0.f665t
            if (r0 == 0) goto L_0x0015
            r0.mo22492b()
        L_0x0015:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            boolean r1 = r0.f667v
            if (r1 == 0) goto L_0x0029
            android.view.ViewGroup r0 = r0.f668w
            if (r0 == 0) goto L_0x0029
            java.util.WeakHashMap<android.view.View, s1.p0> r1 = p242s1.C6333d0.f19990a
            boolean r0 = p242s1.C6333d0.C6340g.m15076c(r0)
            if (r0 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0050
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f662q
            r2 = 0
            r0.setAlpha(r2)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            androidx.appcompat.widget.ActionBarContextView r2 = r0.f662q
            s1.p0 r2 = p242s1.C6333d0.m15013a(r2)
            r2.mo22491a(r1)
            r0.f665t = r2
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            s1.p0 r0 = r0.f665t
            androidx.appcompat.app.m$a r1 = new androidx.appcompat.app.m$a
            r1.<init>()
            r0.mo22497g(r1)
            goto L_0x005e
        L_0x0050:
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f662q
            r0.setAlpha(r1)
            androidx.appcompat.app.AppCompatDelegateImpl r0 = r4.f742b
            androidx.appcompat.widget.ActionBarContextView r0 = r0.f662q
            r0.setVisibility(r3)
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0255m.run():void");
    }
}
