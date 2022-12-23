package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Handler;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0300j;
import androidx.appcompat.widget.C0427l0;
import androidx.appcompat.widget.C0455s0;
import androidx.appcompat.widget.C0458t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p114i.C5218d;
import p114i.C5221g;
import p188o.C5899d;
import p242s1.C6333d0;
import p242s1.C6382p0;

/* renamed from: androidx.appcompat.view.menu.b */
public final class C0282b extends C5899d implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: C */
    public static final int f869C = C5221g.abc_cascading_menu_item_layout;

    /* renamed from: A */
    public PopupWindow.OnDismissListener f870A;

    /* renamed from: B */
    public boolean f871B;

    /* renamed from: c */
    public final Context f872c;

    /* renamed from: d */
    public final int f873d;

    /* renamed from: e */
    public final int f874e;

    /* renamed from: f */
    public final int f875f;

    /* renamed from: g */
    public final boolean f876g;

    /* renamed from: h */
    public final Handler f877h;

    /* renamed from: i */
    public final ArrayList f878i = new ArrayList();

    /* renamed from: j */
    public final ArrayList f879j = new ArrayList();

    /* renamed from: k */
    public final C0283a f880k = new C0283a();

    /* renamed from: l */
    public final C0284b f881l = new C0284b();

    /* renamed from: m */
    public final C0285c f882m = new C0285c();

    /* renamed from: n */
    public int f883n;

    /* renamed from: o */
    public int f884o;

    /* renamed from: p */
    public View f885p;

    /* renamed from: q */
    public View f886q;

    /* renamed from: r */
    public int f887r;

    /* renamed from: s */
    public boolean f888s;

    /* renamed from: t */
    public boolean f889t;

    /* renamed from: u */
    public int f890u;

    /* renamed from: v */
    public int f891v;

    /* renamed from: w */
    public boolean f892w;

    /* renamed from: x */
    public boolean f893x;

    /* renamed from: y */
    public C0300j.C0301a f894y;

    /* renamed from: z */
    public ViewTreeObserver f895z;

    /* renamed from: androidx.appcompat.view.menu.b$a */
    public class C0283a implements ViewTreeObserver.OnGlobalLayoutListener {
        public C0283a() {
        }

        public final void onGlobalLayout() {
            if (C0282b.this.mo1048a() && C0282b.this.f879j.size() > 0 && !((C0286d) C0282b.this.f879j.get(0)).f899a.f1250y) {
                View view = C0282b.this.f886q;
                if (view == null || !view.isShown()) {
                    C0282b.this.dismiss();
                    return;
                }
                Iterator it = C0282b.this.f879j.iterator();
                while (it.hasNext()) {
                    ((C0286d) it.next()).f899a.show();
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$b */
    public class C0284b implements View.OnAttachStateChangeListener {
        public C0284b() {
        }

        public final void onViewAttachedToWindow(View view) {
        }

        public final void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = C0282b.this.f895z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    C0282b.this.f895z = view.getViewTreeObserver();
                }
                C0282b bVar = C0282b.this;
                bVar.f895z.removeGlobalOnLayoutListener(bVar.f880k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$c */
    public class C0285c implements C0455s0 {
        public C0285c() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: androidx.appcompat.view.menu.b$d} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo1072c(androidx.appcompat.view.menu.C0291f r6, androidx.appcompat.view.menu.C0295h r7) {
            /*
                r5 = this;
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0282b.this
                android.os.Handler r0 = r0.f877h
                r1 = 0
                r0.removeCallbacksAndMessages(r1)
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0282b.this
                java.util.ArrayList r0 = r0.f879j
                int r0 = r0.size()
                r2 = 0
            L_0x0011:
                r3 = -1
                if (r2 >= r0) goto L_0x0026
                androidx.appcompat.view.menu.b r4 = androidx.appcompat.view.menu.C0282b.this
                java.util.ArrayList r4 = r4.f879j
                java.lang.Object r4 = r4.get(r2)
                androidx.appcompat.view.menu.b$d r4 = (androidx.appcompat.view.menu.C0282b.C0286d) r4
                androidx.appcompat.view.menu.f r4 = r4.f900b
                if (r6 != r4) goto L_0x0023
                goto L_0x0027
            L_0x0023:
                int r2 = r2 + 1
                goto L_0x0011
            L_0x0026:
                r2 = -1
            L_0x0027:
                if (r2 != r3) goto L_0x002a
                return
            L_0x002a:
                int r2 = r2 + 1
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0282b.this
                java.util.ArrayList r0 = r0.f879j
                int r0 = r0.size()
                if (r2 >= r0) goto L_0x0041
                androidx.appcompat.view.menu.b r0 = androidx.appcompat.view.menu.C0282b.this
                java.util.ArrayList r0 = r0.f879j
                java.lang.Object r0 = r0.get(r2)
                r1 = r0
                androidx.appcompat.view.menu.b$d r1 = (androidx.appcompat.view.menu.C0282b.C0286d) r1
            L_0x0041:
                androidx.appcompat.view.menu.c r0 = new androidx.appcompat.view.menu.c
                r0.<init>(r5, r1, r7, r6)
                long r1 = android.os.SystemClock.uptimeMillis()
                r3 = 200(0xc8, double:9.9E-322)
                long r1 = r1 + r3
                androidx.appcompat.view.menu.b r7 = androidx.appcompat.view.menu.C0282b.this
                android.os.Handler r7 = r7.f877h
                r7.postAtTime(r0, r6, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0282b.C0285c.mo1072c(androidx.appcompat.view.menu.f, androidx.appcompat.view.menu.h):void");
        }

        /* renamed from: m */
        public final void mo1073m(C0291f fVar, MenuItem menuItem) {
            C0282b.this.f877h.removeCallbacksAndMessages(fVar);
        }
    }

    /* renamed from: androidx.appcompat.view.menu.b$d */
    public static class C0286d {

        /* renamed from: a */
        public final C0458t0 f899a;

        /* renamed from: b */
        public final C0291f f900b;

        /* renamed from: c */
        public final int f901c;

        public C0286d(C0458t0 t0Var, C0291f fVar, int i) {
            this.f899a = t0Var;
            this.f900b = fVar;
            this.f901c = i;
        }
    }

    public C0282b(Context context, View view, int i, int i2, boolean z) {
        int i3 = 0;
        this.f883n = 0;
        this.f884o = 0;
        this.f872c = context;
        this.f885p = view;
        this.f874e = i;
        this.f875f = i2;
        this.f876g = z;
        this.f892w = false;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        this.f887r = C6333d0.C6338e.m15063d(view) != 1 ? 1 : i3;
        Resources resources = context.getResources();
        this.f873d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C5218d.abc_config_prefDialogWidth));
        this.f877h = new Handler();
    }

    /* renamed from: a */
    public final boolean mo1048a() {
        return this.f879j.size() > 0 && ((C0286d) this.f879j.get(0)).f899a.mo1048a();
    }

    /* renamed from: b */
    public final void mo1049b(C0291f fVar, boolean z) {
        int i;
        int size = this.f879j.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (fVar == ((C0286d) this.f879j.get(i2)).f900b) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 >= 0) {
            int i3 = i2 + 1;
            if (i3 < this.f879j.size()) {
                ((C0286d) this.f879j.get(i3)).f900b.mo1102c(false);
            }
            C0286d dVar = (C0286d) this.f879j.remove(i2);
            dVar.f900b.mo1126r(this);
            if (this.f871B) {
                C0458t0 t0Var = dVar.f899a;
                if (Build.VERSION.SDK_INT >= 23) {
                    C0458t0.C0459a.m1278b(t0Var.f1251z, (Transition) null);
                } else {
                    t0Var.getClass();
                }
                dVar.f899a.f1251z.setAnimationStyle(0);
            }
            dVar.f899a.dismiss();
            int size2 = this.f879j.size();
            if (size2 > 0) {
                this.f887r = ((C0286d) this.f879j.get(size2 - 1)).f901c;
            } else {
                View view = this.f885p;
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                if (C6333d0.C6338e.m15063d(view) == 1) {
                    i = 0;
                } else {
                    i = 1;
                }
                this.f887r = i;
            }
            if (size2 == 0) {
                dismiss();
                C0300j.C0301a aVar = this.f894y;
                if (aVar != null) {
                    aVar.mo903b(fVar, true);
                }
                ViewTreeObserver viewTreeObserver = this.f895z;
                if (viewTreeObserver != null) {
                    if (viewTreeObserver.isAlive()) {
                        this.f895z.removeGlobalOnLayoutListener(this.f880k);
                    }
                    this.f895z = null;
                }
                this.f886q.removeOnAttachStateChangeListener(this.f881l);
                this.f870A.onDismiss();
            } else if (z) {
                ((C0286d) this.f879j.get(0)).f900b.mo1102c(false);
            }
        }
    }

    /* renamed from: c */
    public final void mo1044c(C0300j.C0301a aVar) {
        this.f894y = aVar;
    }

    public final void dismiss() {
        int size = this.f879j.size();
        if (size > 0) {
            C0286d[] dVarArr = (C0286d[]) this.f879j.toArray(new C0286d[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    C0286d dVar = dVarArr[size];
                    if (dVar.f899a.mo1048a()) {
                        dVar.f899a.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo1051e(Parcelable parcelable) {
    }

    /* renamed from: f */
    public final boolean mo1052f(C0307m mVar) {
        Iterator it = this.f879j.iterator();
        while (it.hasNext()) {
            C0286d dVar = (C0286d) it.next();
            if (mVar == dVar.f900b) {
                dVar.f899a.f1229d.requestFocus();
                return true;
            }
        }
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        mo1056l(mVar);
        C0300j.C0301a aVar = this.f894y;
        if (aVar != null) {
            aVar.mo904c(mVar);
        }
        return true;
    }

    /* renamed from: g */
    public final Parcelable mo1053g() {
        return null;
    }

    /* renamed from: i */
    public final void mo1054i(boolean z) {
        Iterator it = this.f879j.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C0286d) it.next()).f899a.f1229d.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C0290e) adapter).notifyDataSetChanged();
        }
    }

    /* renamed from: j */
    public final boolean mo1055j() {
        return false;
    }

    /* renamed from: l */
    public final void mo1056l(C0291f fVar) {
        fVar.mo1101b(this, this.f872c);
        if (mo1048a()) {
            mo1068w(fVar);
        } else {
            this.f878i.add(fVar);
        }
    }

    /* renamed from: n */
    public final C0427l0 mo1057n() {
        if (this.f879j.isEmpty()) {
            return null;
        }
        ArrayList arrayList = this.f879j;
        return ((C0286d) arrayList.get(arrayList.size() - 1)).f899a.f1229d;
    }

    /* renamed from: o */
    public final void mo1058o(View view) {
        if (this.f885p != view) {
            this.f885p = view;
            int i = this.f883n;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            this.f884o = Gravity.getAbsoluteGravity(i, C6333d0.C6338e.m15063d(view));
        }
    }

    public final void onDismiss() {
        C0286d dVar;
        int size = this.f879j.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                dVar = null;
                break;
            }
            dVar = (C0286d) this.f879j.get(i);
            if (!dVar.f899a.mo1048a()) {
                break;
            }
            i++;
        }
        if (dVar != null) {
            dVar.f900b.mo1102c(false);
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
        this.f892w = z;
    }

    /* renamed from: q */
    public final void mo1062q(int i) {
        if (this.f883n != i) {
            this.f883n = i;
            View view = this.f885p;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            this.f884o = Gravity.getAbsoluteGravity(i, C6333d0.C6338e.m15063d(view));
        }
    }

    /* renamed from: r */
    public final void mo1063r(int i) {
        this.f888s = true;
        this.f890u = i;
    }

    /* renamed from: s */
    public final void mo1064s(PopupWindow.OnDismissListener onDismissListener) {
        this.f870A = onDismissListener;
    }

    public final void show() {
        boolean z;
        if (!mo1048a()) {
            Iterator it = this.f878i.iterator();
            while (it.hasNext()) {
                mo1068w((C0291f) it.next());
            }
            this.f878i.clear();
            View view = this.f885p;
            this.f886q = view;
            if (view != null) {
                if (this.f895z == null) {
                    z = true;
                } else {
                    z = false;
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.f895z = viewTreeObserver;
                if (z) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.f880k);
                }
                this.f886q.addOnAttachStateChangeListener(this.f881l);
            }
        }
    }

    /* renamed from: t */
    public final void mo1066t(boolean z) {
        this.f893x = z;
    }

    /* renamed from: u */
    public final void mo1067u(int i) {
        this.f889t = true;
        this.f891v = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0143, code lost:
        if (((r10.getWidth() + r12[0]) + r4) > r11.right) goto L_0x014d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0149, code lost:
        if ((r12[0] - r4) < 0) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014d, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01ed  */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1068w(androidx.appcompat.view.menu.C0291f r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            android.content.Context r2 = r0.f872c
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            androidx.appcompat.view.menu.e r3 = new androidx.appcompat.view.menu.e
            boolean r4 = r0.f876g
            int r5 = f869C
            r3.<init>(r1, r2, r4, r5)
            boolean r4 = r16.mo1048a()
            r5 = 1
            if (r4 != 0) goto L_0x0021
            boolean r4 = r0.f892w
            if (r4 == 0) goto L_0x0021
            r3.f917d = r5
            goto L_0x002d
        L_0x0021:
            boolean r4 = r16.mo1048a()
            if (r4 == 0) goto L_0x002d
            boolean r4 = p188o.C5899d.m14375v(r17)
            r3.f917d = r4
        L_0x002d:
            android.content.Context r4 = r0.f872c
            int r6 = r0.f873d
            int r4 = p188o.C5899d.m14374m(r3, r4, r6)
            androidx.appcompat.widget.t0 r6 = new androidx.appcompat.widget.t0
            android.content.Context r7 = r0.f872c
            int r8 = r0.f874e
            int r9 = r0.f875f
            r6.<init>(r7, r8, r9)
            androidx.appcompat.view.menu.b$c r7 = r0.f882m
            r6.f1621D = r7
            r6.f1242q = r0
            android.widget.PopupWindow r7 = r6.f1251z
            r7.setOnDismissListener(r0)
            android.view.View r7 = r0.f885p
            r6.f1241p = r7
            int r7 = r0.f884o
            r6.f1238m = r7
            r6.f1250y = r5
            android.widget.PopupWindow r7 = r6.f1251z
            r7.setFocusable(r5)
            android.widget.PopupWindow r7 = r6.f1251z
            r8 = 2
            r7.setInputMethodMode(r8)
            r6.mo1626l(r3)
            r6.mo1757q(r4)
            int r3 = r0.f884o
            r6.f1238m = r3
            java.util.ArrayList r3 = r0.f879j
            int r3 = r3.size()
            r9 = 0
            if (r3 <= 0) goto L_0x00e7
            java.util.ArrayList r3 = r0.f879j
            int r10 = r3.size()
            int r10 = r10 - r5
            java.lang.Object r3 = r3.get(r10)
            androidx.appcompat.view.menu.b$d r3 = (androidx.appcompat.view.menu.C0282b.C0286d) r3
            androidx.appcompat.view.menu.f r10 = r3.f900b
            int r11 = r10.size()
            r12 = 0
        L_0x0087:
            if (r12 >= r11) goto L_0x009d
            android.view.MenuItem r13 = r10.getItem(r12)
            boolean r14 = r13.hasSubMenu()
            if (r14 == 0) goto L_0x009a
            android.view.SubMenu r14 = r13.getSubMenu()
            if (r1 != r14) goto L_0x009a
            goto L_0x009e
        L_0x009a:
            int r12 = r12 + 1
            goto L_0x0087
        L_0x009d:
            r13 = 0
        L_0x009e:
            if (r13 != 0) goto L_0x00a1
            goto L_0x00e8
        L_0x00a1:
            androidx.appcompat.widget.t0 r10 = r3.f899a
            androidx.appcompat.widget.l0 r10 = r10.f1229d
            android.widget.ListAdapter r11 = r10.getAdapter()
            boolean r12 = r11 instanceof android.widget.HeaderViewListAdapter
            if (r12 == 0) goto L_0x00ba
            android.widget.HeaderViewListAdapter r11 = (android.widget.HeaderViewListAdapter) r11
            int r12 = r11.getHeadersCount()
            android.widget.ListAdapter r11 = r11.getWrappedAdapter()
            androidx.appcompat.view.menu.e r11 = (androidx.appcompat.view.menu.C0290e) r11
            goto L_0x00bd
        L_0x00ba:
            androidx.appcompat.view.menu.e r11 = (androidx.appcompat.view.menu.C0290e) r11
            r12 = 0
        L_0x00bd:
            int r14 = r11.getCount()
            r15 = 0
        L_0x00c2:
            r8 = -1
            if (r15 >= r14) goto L_0x00cf
            androidx.appcompat.view.menu.h r7 = r11.getItem(r15)
            if (r13 != r7) goto L_0x00cc
            goto L_0x00d0
        L_0x00cc:
            int r15 = r15 + 1
            goto L_0x00c2
        L_0x00cf:
            r15 = -1
        L_0x00d0:
            if (r15 != r8) goto L_0x00d3
            goto L_0x00e8
        L_0x00d3:
            int r15 = r15 + r12
            int r7 = r10.getFirstVisiblePosition()
            int r15 = r15 - r7
            if (r15 < 0) goto L_0x00e8
            int r7 = r10.getChildCount()
            if (r15 < r7) goto L_0x00e2
            goto L_0x00e8
        L_0x00e2:
            android.view.View r7 = r10.getChildAt(r15)
            goto L_0x00e9
        L_0x00e7:
            r3 = 0
        L_0x00e8:
            r7 = 0
        L_0x00e9:
            if (r7 == 0) goto L_0x01b1
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 28
            if (r8 > r10) goto L_0x0103
            java.lang.reflect.Method r8 = androidx.appcompat.widget.C0458t0.f1620E
            if (r8 == 0) goto L_0x0108
            android.widget.PopupWindow r10 = r6.f1251z     // Catch:{ Exception -> 0x0101 }
            java.lang.Object[] r11 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0101 }
            java.lang.Boolean r12 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0101 }
            r11[r9] = r12     // Catch:{ Exception -> 0x0101 }
            r8.invoke(r10, r11)     // Catch:{ Exception -> 0x0101 }
            goto L_0x0108
        L_0x0101:
            goto L_0x0108
        L_0x0103:
            android.widget.PopupWindow r8 = r6.f1251z
            androidx.appcompat.widget.C0458t0.C0460b.m1279a(r8, r9)
        L_0x0108:
            int r8 = android.os.Build.VERSION.SDK_INT
            r10 = 23
            if (r8 < r10) goto L_0x0114
            android.widget.PopupWindow r10 = r6.f1251z
            r11 = 0
            androidx.appcompat.widget.C0458t0.C0459a.m1277a(r10, r11)
        L_0x0114:
            java.util.ArrayList r10 = r0.f879j
            int r11 = r10.size()
            int r11 = r11 - r5
            java.lang.Object r10 = r10.get(r11)
            androidx.appcompat.view.menu.b$d r10 = (androidx.appcompat.view.menu.C0282b.C0286d) r10
            androidx.appcompat.widget.t0 r10 = r10.f899a
            androidx.appcompat.widget.l0 r10 = r10.f1229d
            r11 = 2
            int[] r12 = new int[r11]
            r10.getLocationOnScreen(r12)
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>()
            android.view.View r13 = r0.f886q
            r13.getWindowVisibleDisplayFrame(r11)
            int r13 = r0.f887r
            if (r13 != r5) goto L_0x0146
            r12 = r12[r9]
            int r10 = r10.getWidth()
            int r10 = r10 + r12
            int r10 = r10 + r4
            int r11 = r11.right
            if (r10 <= r11) goto L_0x014b
            goto L_0x014d
        L_0x0146:
            r10 = r12[r9]
            int r10 = r10 - r4
            if (r10 >= 0) goto L_0x014d
        L_0x014b:
            r10 = 1
            goto L_0x014e
        L_0x014d:
            r10 = 0
        L_0x014e:
            if (r10 != r5) goto L_0x0152
            r11 = 1
            goto L_0x0153
        L_0x0152:
            r11 = 0
        L_0x0153:
            r0.f887r = r10
            r10 = 26
            r12 = 5
            if (r8 < r10) goto L_0x015f
            r6.f1241p = r7
            r8 = 0
            r13 = 0
            goto L_0x0190
        L_0x015f:
            r8 = 2
            int[] r10 = new int[r8]
            android.view.View r13 = r0.f885p
            r13.getLocationOnScreen(r10)
            int[] r8 = new int[r8]
            r7.getLocationOnScreen(r8)
            int r13 = r0.f884o
            r13 = r13 & 7
            if (r13 != r12) goto L_0x0186
            r13 = r10[r9]
            android.view.View r14 = r0.f885p
            int r14 = r14.getWidth()
            int r14 = r14 + r13
            r10[r9] = r14
            r13 = r8[r9]
            int r14 = r7.getWidth()
            int r14 = r14 + r13
            r8[r9] = r14
        L_0x0186:
            r13 = r8[r9]
            r14 = r10[r9]
            int r13 = r13 - r14
            r8 = r8[r5]
            r10 = r10[r5]
            int r8 = r8 - r10
        L_0x0190:
            int r10 = r0.f884o
            r10 = r10 & r12
            if (r10 != r12) goto L_0x019e
            if (r11 == 0) goto L_0x0199
            int r13 = r13 + r4
            goto L_0x01a7
        L_0x0199:
            int r4 = r7.getWidth()
            goto L_0x01a6
        L_0x019e:
            if (r11 == 0) goto L_0x01a6
            int r4 = r7.getWidth()
            int r13 = r13 + r4
            goto L_0x01a7
        L_0x01a6:
            int r13 = r13 - r4
        L_0x01a7:
            r6.f1232g = r13
            r6.f1237l = r5
            r6.f1236k = r5
            r6.mo1753h(r8)
            goto L_0x01cf
        L_0x01b1:
            boolean r4 = r0.f888s
            if (r4 == 0) goto L_0x01b9
            int r4 = r0.f890u
            r6.f1232g = r4
        L_0x01b9:
            boolean r4 = r0.f889t
            if (r4 == 0) goto L_0x01c2
            int r4 = r0.f891v
            r6.mo1753h(r4)
        L_0x01c2:
            android.graphics.Rect r4 = r0.f18974b
            if (r4 == 0) goto L_0x01cc
            android.graphics.Rect r11 = new android.graphics.Rect
            r11.<init>(r4)
            goto L_0x01cd
        L_0x01cc:
            r11 = 0
        L_0x01cd:
            r6.f1249x = r11
        L_0x01cf:
            androidx.appcompat.view.menu.b$d r4 = new androidx.appcompat.view.menu.b$d
            int r5 = r0.f887r
            r4.<init>(r6, r1, r5)
            java.util.ArrayList r5 = r0.f879j
            r5.add(r4)
            r6.show()
            androidx.appcompat.widget.l0 r4 = r6.f1229d
            r4.setOnKeyListener(r0)
            if (r3 != 0) goto L_0x020d
            boolean r3 = r0.f893x
            if (r3 == 0) goto L_0x020d
            java.lang.CharSequence r3 = r1.f934m
            if (r3 == 0) goto L_0x020d
            int r3 = p114i.C5221g.abc_popup_menu_header_item_layout
            android.view.View r2 = r2.inflate(r3, r4, r9)
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r3 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r3 = r2.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r2.setEnabled(r9)
            java.lang.CharSequence r1 = r1.f934m
            r3.setText(r1)
            r1 = 0
            r4.addHeaderView(r2, r1, r9)
            r6.show()
        L_0x020d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.C0282b.mo1068w(androidx.appcompat.view.menu.f):void");
    }
}
