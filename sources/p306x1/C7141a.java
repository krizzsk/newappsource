package p306x1;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p242s1.C6315a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6526b;
import p255t1.C6531g;
import p255t1.C6535h;
import p255t1.C6540j;
import p306x1.C7145b;

/* renamed from: x1.a */
public abstract class C7141a extends C6315a {

    /* renamed from: k */
    public static final Rect f22179k = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* renamed from: l */
    public static final C7142a f22180l = new C7142a();

    /* renamed from: m */
    public static final C7143b f22181m = new C7143b();

    /* renamed from: a */
    public final Rect f22182a = new Rect();

    /* renamed from: b */
    public final Rect f22183b = new Rect();

    /* renamed from: c */
    public final Rect f22184c = new Rect();

    /* renamed from: d */
    public final int[] f22185d = new int[2];

    /* renamed from: e */
    public final AccessibilityManager f22186e;

    /* renamed from: f */
    public final View f22187f;

    /* renamed from: g */
    public C7144c f22188g;

    /* renamed from: h */
    public int f22189h = Integer.MIN_VALUE;

    /* renamed from: i */
    public int f22190i = Integer.MIN_VALUE;

    /* renamed from: j */
    public int f22191j = Integer.MIN_VALUE;

    /* renamed from: x1.a$a */
    public class C7142a implements C7145b.C7146a<C6531g> {
    }

    /* renamed from: x1.a$b */
    public class C7143b {
    }

    /* renamed from: x1.a$c */
    public class C7144c extends C6535h {
        public C7144c() {
        }

        /* renamed from: a */
        public final C6531g mo22655a(int i) {
            return new C6531g(AccessibilityNodeInfo.obtain(C7141a.this.mo23406i(i).f20334a));
        }

        /* renamed from: b */
        public final C6531g mo22656b(int i) {
            int i2;
            if (i == 2) {
                i2 = C7141a.this.f22189h;
            } else {
                i2 = C7141a.this.f22190i;
            }
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return mo22655a(i2);
        }

        /* renamed from: c */
        public final boolean mo22657c(int i, int i2, Bundle bundle) {
            int i3;
            C7141a aVar = C7141a.this;
            if (i != -1) {
                boolean z = true;
                if (i2 == 1) {
                    return aVar.mo23411n(i);
                }
                if (i2 == 2) {
                    return aVar.mo23398a(i);
                }
                if (i2 != 64) {
                    if (i2 != 128) {
                        return aVar.mo23407j(i, i2, bundle);
                    }
                    if (aVar.f22189h == i) {
                        aVar.f22189h = Integer.MIN_VALUE;
                        aVar.f22187f.invalidate();
                        aVar.mo23412o(i, SQLiteDatabase.OPEN_FULLMUTEX);
                        return z;
                    }
                } else if (aVar.f22186e.isEnabled() && aVar.f22186e.isTouchExplorationEnabled() && (i3 = aVar.f22189h) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        aVar.f22189h = Integer.MIN_VALUE;
                        aVar.f22187f.invalidate();
                        aVar.mo23412o(i3, SQLiteDatabase.OPEN_FULLMUTEX);
                    }
                    aVar.f22189h = i;
                    aVar.f22187f.invalidate();
                    aVar.mo23412o(i, 32768);
                    return z;
                }
                z = false;
                return z;
            }
            View view = aVar.f22187f;
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            return C6333d0.C6337d.m15050j(view, i2, bundle);
        }
    }

    public C7141a(View view) {
        if (view != null) {
            this.f22187f = view;
            this.f22186e = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            if (C6333d0.C6337d.m15043c(view) == 0) {
                C6333d0.C6337d.m15059s(view, 1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    /* renamed from: a */
    public final boolean mo23398a(int i) {
        if (this.f22190i != i) {
            return false;
        }
        this.f22190i = Integer.MIN_VALUE;
        mo23410m(i, false);
        mo23412o(i, 8);
        return true;
    }

    /* renamed from: b */
    public final AccessibilityEvent mo23399b(int i, int i2) {
        if (i != -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
            C6531g i3 = mo23406i(i);
            obtain.getText().add(i3.mo22638e());
            obtain.setContentDescription(i3.f20334a.getContentDescription());
            obtain.setScrollable(i3.f20334a.isScrollable());
            obtain.setPassword(i3.f20334a.isPassword());
            obtain.setEnabled(i3.f20334a.isEnabled());
            obtain.setChecked(i3.f20334a.isChecked());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(i3.f20334a.getClassName());
                C6540j.m15475a(obtain, this.f22187f, i);
                obtain.setPackageName(this.f22187f.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i2);
        this.f22187f.onInitializeAccessibilityEvent(obtain2);
        return obtain2;
    }

    /* renamed from: c */
    public final C6531g mo23400c(int i) {
        boolean z;
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        C6531g gVar = new C6531g(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        gVar.mo22644i("android.view.View");
        Rect rect = f22179k;
        gVar.mo22642h(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.f22187f;
        gVar.f20335b = -1;
        obtain.setParent(view);
        mo23409l(i, gVar);
        if (gVar.mo22638e() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        gVar.mo22637d(this.f22183b);
        if (!this.f22183b.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & RecyclerView.C1119a0.FLAG_IGNORE) == 0) {
                obtain.setPackageName(this.f22187f.getContext().getPackageName());
                View view2 = this.f22187f;
                gVar.f20336c = i;
                obtain.setSource(view2, i);
                boolean z2 = false;
                if (this.f22189h == i) {
                    obtain.setAccessibilityFocused(true);
                    gVar.mo22634a(RecyclerView.C1119a0.FLAG_IGNORE);
                } else {
                    obtain.setAccessibilityFocused(false);
                    gVar.mo22634a(64);
                }
                if (this.f22190i == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    gVar.mo22634a(2);
                } else if (obtain.isFocusable()) {
                    gVar.mo22634a(1);
                }
                obtain.setFocused(z);
                this.f22187f.getLocationOnScreen(this.f22185d);
                obtain.getBoundsInScreen(this.f22182a);
                if (this.f22182a.equals(rect)) {
                    gVar.mo22637d(this.f22182a);
                    if (gVar.f20335b != -1) {
                        C6531g gVar2 = new C6531g(AccessibilityNodeInfo.obtain());
                        for (int i2 = gVar.f20335b; i2 != -1; i2 = gVar2.f20335b) {
                            View view3 = this.f22187f;
                            gVar2.f20335b = -1;
                            gVar2.f20334a.setParent(view3, -1);
                            gVar2.mo22642h(f22179k);
                            mo23409l(i2, gVar2);
                            gVar2.mo22637d(this.f22183b);
                            Rect rect2 = this.f22182a;
                            Rect rect3 = this.f22183b;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        gVar2.f20334a.recycle();
                    }
                    this.f22182a.offset(this.f22185d[0] - this.f22187f.getScrollX(), this.f22185d[1] - this.f22187f.getScrollY());
                }
                if (this.f22187f.getLocalVisibleRect(this.f22184c)) {
                    this.f22184c.offset(this.f22185d[0] - this.f22187f.getScrollX(), this.f22185d[1] - this.f22187f.getScrollY());
                    if (this.f22182a.intersect(this.f22184c)) {
                        gVar.f20334a.setBoundsInScreen(this.f22182a);
                        Rect rect4 = this.f22182a;
                        if (rect4 != null && !rect4.isEmpty() && this.f22187f.getWindowVisibility() == 0) {
                            ViewParent parent = this.f22187f.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= BitmapDescriptorFactory.HUE_RED || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z2 = true;
                                }
                            }
                        }
                        if (z2) {
                            gVar.f20334a.setVisibleToUser(true);
                        }
                    }
                }
                return gVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* renamed from: d */
    public final boolean mo23401d(MotionEvent motionEvent) {
        int i;
        if (this.f22186e.isEnabled() && this.f22186e.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                int e = mo23402e(motionEvent.getX(), motionEvent.getY());
                int i2 = this.f22191j;
                if (i2 != e) {
                    this.f22191j = e;
                    mo23412o(e, RecyclerView.C1119a0.FLAG_IGNORE);
                    mo23412o(i2, 256);
                }
                if (e != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action != 10 || (i = this.f22191j) == Integer.MIN_VALUE) {
                return false;
            } else {
                if (i != Integer.MIN_VALUE) {
                    this.f22191j = Integer.MIN_VALUE;
                    mo23412o(Integer.MIN_VALUE, RecyclerView.C1119a0.FLAG_IGNORE);
                    mo23412o(i, 256);
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public abstract int mo23402e(float f, float f2);

    /* renamed from: f */
    public abstract void mo23403f(ArrayList arrayList);

    /* renamed from: g */
    public final void mo23404g(int i) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f22186e.isEnabled() && (parent = this.f22187f.getParent()) != null) {
            AccessibilityEvent b = mo23399b(i, 2048);
            C6526b.m15446b(b, 0);
            parent.requestSendAccessibilityEvent(this.f22187f, b);
        }
    }

    public final C6535h getAccessibilityNodeProvider(View view) {
        if (this.f22188g == null) {
            this.f22188g = new C7144c();
        }
        return this.f22188g;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: t1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: t1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: t1.g} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v23, resolved type: t1.g} */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013e, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x0140;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x014a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0145  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo23405h(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.mo23403f(r3)
            s0.i r4 = new s0.i
            r4.<init>()
            r5 = 0
            r6 = 0
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            t1.g r7 = r0.mo23400c(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.mo22435h(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.f22190i
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = 0
            if (r3 != r6) goto L_0x0042
            r3 = r7
            goto L_0x0048
        L_0x0042:
            java.lang.Object r3 = r4.mo22434g(r3, r7)
            t1.g r3 = (p255t1.C6531g) r3
        L_0x0048:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0151
            if (r1 == r8) goto L_0x0151
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0068
            if (r1 == r12) goto L_0x0068
            if (r1 == r11) goto L_0x0068
            if (r1 != r8) goto L_0x0060
            goto L_0x0068
        L_0x0060:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0068:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.f22190i
            java.lang.String r7 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r6) goto L_0x007b
            t1.g r2 = r0.mo23406i(r15)
            r2.mo22637d(r14)
            goto L_0x00a8
        L_0x007b:
            if (r2 == 0) goto L_0x0081
            r14.set(r2)
            goto L_0x00a8
        L_0x0081:
            android.view.View r2 = r0.f22187f
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a5
            if (r1 == r12) goto L_0x00a1
            if (r1 == r11) goto L_0x009d
            if (r1 != r8) goto L_0x0097
            r14.set(r5, r9, r15, r9)
            goto L_0x00a8
        L_0x0097:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x009d:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a8
        L_0x00a1:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a8
        L_0x00a5:
            r14.set(r15, r5, r15, r2)
        L_0x00a8:
            x1.a$b r2 = f22181m
            x1.a$a r15 = f22180l
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r14)
            if (r1 == r13) goto L_0x00dc
            if (r1 == r12) goto L_0x00d3
            if (r1 == r11) goto L_0x00c9
            if (r1 != r8) goto L_0x00c3
            int r7 = r14.height()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00c3:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r7)
            throw r1
        L_0x00c9:
            int r7 = r14.width()
            int r7 = r7 + r10
            int r7 = -r7
            r6.offset(r7, r5)
            goto L_0x00e4
        L_0x00d3:
            int r7 = r14.height()
            int r7 = r7 + r10
            r6.offset(r5, r7)
            goto L_0x00e4
        L_0x00dc:
            int r7 = r14.width()
            int r7 = r7 + r10
            r6.offset(r7, r5)
        L_0x00e4:
            r2.getClass()
            int r2 = r4.f19973d
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            r8 = 0
            r16 = 0
        L_0x00f1:
            if (r8 >= r2) goto L_0x014d
            java.lang.Object[] r11 = r4.f19972c
            r11 = r11[r8]
            t1.g r11 = (p255t1.C6531g) r11
            if (r11 != r3) goto L_0x00fc
            goto L_0x014a
        L_0x00fc:
            r15.getClass()
            r11.mo22637d(r7)
            boolean r12 = p306x1.C7145b.m16725c(r1, r14, r7)
            if (r12 != 0) goto L_0x0109
            goto L_0x0142
        L_0x0109:
            boolean r12 = p306x1.C7145b.m16725c(r1, r14, r6)
            if (r12 != 0) goto L_0x0110
            goto L_0x0140
        L_0x0110:
            boolean r12 = p306x1.C7145b.m16723a(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x0117
            goto L_0x0140
        L_0x0117:
            boolean r12 = p306x1.C7145b.m16723a(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x011e
            goto L_0x0142
        L_0x011e:
            int r12 = p306x1.C7145b.m16726d(r1, r14, r7)
            int r13 = p306x1.C7145b.m16727e(r1, r14, r7)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = p306x1.C7145b.m16726d(r1, r14, r6)
            int r17 = p306x1.C7145b.m16727e(r1, r14, r6)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x0142
        L_0x0140:
            r12 = 1
            goto L_0x0143
        L_0x0142:
            r12 = 0
        L_0x0143:
            if (r12 == 0) goto L_0x014a
            r6.set(r7)
            r16 = r11
        L_0x014a:
            int r8 = r8 + 1
            goto L_0x00f1
        L_0x014d:
            r1 = r16
            goto L_0x01bd
        L_0x0151:
            android.view.View r2 = r0.f22187f
            java.util.WeakHashMap<android.view.View, s1.p0> r6 = p242s1.C6333d0.f19990a
            int r2 = p242s1.C6333d0.C6338e.m15063d(r2)
            if (r2 != r10) goto L_0x015d
            r2 = 1
            goto L_0x015e
        L_0x015d:
            r2 = 0
        L_0x015e:
            x1.a$b r6 = f22181m
            x1.a$a r7 = f22180l
            r6.getClass()
            int r6 = r4.f19973d
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = 0
        L_0x016d:
            if (r12 >= r6) goto L_0x017b
            java.lang.Object[] r13 = r4.f19972c
            r13 = r13[r12]
            t1.g r13 = (p255t1.C6531g) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x016d
        L_0x017b:
            x1.b$b r6 = new x1.b$b
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x01a4
            if (r1 != r8) goto L_0x019c
            int r1 = r11.size()
            if (r3 != 0) goto L_0x018f
            r2 = -1
            goto L_0x0193
        L_0x018f:
            int r2 = r11.lastIndexOf(r3)
        L_0x0193:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01b7
            java.lang.Object r1 = r11.get(r2)
            r7 = r1
            goto L_0x01b8
        L_0x019c:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01a4:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01ab
            goto L_0x01af
        L_0x01ab:
            int r1 = r11.indexOf(r3)
        L_0x01af:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x01b7
            java.lang.Object r7 = r11.get(r1)
            goto L_0x01b8
        L_0x01b7:
            r7 = 0
        L_0x01b8:
            r16 = r7
            t1.g r16 = (p255t1.C6531g) r16
            goto L_0x014d
        L_0x01bd:
            if (r1 != 0) goto L_0x01c2
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01d5
        L_0x01c2:
            int r2 = r4.f19973d
            if (r5 >= r2) goto L_0x01d1
            java.lang.Object[] r2 = r4.f19972c
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01ce
            r9 = r5
            goto L_0x01d1
        L_0x01ce:
            int r5 = r5 + 1
            goto L_0x01c2
        L_0x01d1:
            int[] r1 = r4.f19971b
            r6 = r1[r9]
        L_0x01d5:
            boolean r1 = r0.mo23411n(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p306x1.C7141a.mo23405h(int, android.graphics.Rect):boolean");
    }

    /* renamed from: i */
    public final C6531g mo23406i(int i) {
        if (i != -1) {
            return mo23400c(i);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.f22187f);
        C6531g gVar = new C6531g(obtain);
        View view = this.f22187f;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        mo23403f(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                gVar.f20334a.addChild(this.f22187f, ((Integer) arrayList.get(i2)).intValue());
            }
            return gVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* renamed from: j */
    public abstract boolean mo23407j(int i, int i2, Bundle bundle);

    /* renamed from: k */
    public void mo23408k(C6531g gVar) {
    }

    /* renamed from: l */
    public abstract void mo23409l(int i, C6531g gVar);

    /* renamed from: m */
    public void mo23410m(int i, boolean z) {
    }

    /* renamed from: n */
    public final boolean mo23411n(int i) {
        int i2;
        if ((!this.f22187f.isFocused() && !this.f22187f.requestFocus()) || (i2 = this.f22190i) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            mo23398a(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f22190i = i;
        mo23410m(i, true);
        mo23412o(i, 8);
        return true;
    }

    /* renamed from: o */
    public final void mo23412o(int i, int i2) {
        ViewParent parent;
        if (i != Integer.MIN_VALUE && this.f22186e.isEnabled() && (parent = this.f22187f.getParent()) != null) {
            parent.requestSendAccessibilityEvent(this.f22187f, mo23399b(i, i2));
        }
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, C6531g gVar) {
        super.onInitializeAccessibilityNodeInfo(view, gVar);
        mo23408k(gVar);
    }
}
