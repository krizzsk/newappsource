package androidx.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C1165b0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.C1354g;
import androidx.viewpager2.widget.C1375f;
import com.moovit.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p035c3.C1770a;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p255t1.C6531g;
import p255t1.C6541k;

public final class ViewPager2 extends ViewGroup {

    /* renamed from: b */
    public final Rect f5065b = new Rect();

    /* renamed from: c */
    public final Rect f5066c = new Rect();

    /* renamed from: d */
    public C1372c f5067d = new C1372c();

    /* renamed from: e */
    public int f5068e;

    /* renamed from: f */
    public boolean f5069f = false;

    /* renamed from: g */
    public C1356a f5070g = new C1356a();

    /* renamed from: h */
    public C1361f f5071h;

    /* renamed from: i */
    public int f5072i = -1;

    /* renamed from: j */
    public Parcelable f5073j;

    /* renamed from: k */
    public C1368k f5074k;

    /* renamed from: l */
    public C1367j f5075l;

    /* renamed from: m */
    public C1375f f5076m;

    /* renamed from: n */
    public C1372c f5077n;

    /* renamed from: o */
    public C1373d f5078o;

    /* renamed from: p */
    public C1374e f5079p;

    /* renamed from: q */
    public RecyclerView.C1128j f5080q = null;

    /* renamed from: r */
    public boolean f5081r = false;

    /* renamed from: s */
    public boolean f5082s = true;

    /* renamed from: t */
    public int f5083t = -1;

    /* renamed from: u */
    public C1363h f5084u;

    /* renamed from: androidx.viewpager2.widget.ViewPager2$a */
    public class C1356a extends C1360e {
        public C1356a() {
            super(0);
        }

        /* renamed from: a */
        public final void mo4765a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f5069f = true;
            viewPager2.f5076m.f5121l = true;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$b */
    public class C1357b extends C1362g {
        public C1357b() {
        }

        /* renamed from: a */
        public final void mo5603a(int i) {
            if (i == 0) {
                ViewPager2.this.mo5610d();
            }
        }

        /* renamed from: c */
        public final void mo5604c(int i) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5068e != i) {
                viewPager2.f5068e = i;
                viewPager2.f5084u.mo5640b();
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$c */
    public class C1358c extends C1362g {
        public C1358c() {
        }

        /* renamed from: c */
        public final void mo5604c(int i) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f5074k.requestFocus(2);
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$d */
    public abstract class C1359d {
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$e */
    public static abstract class C1360e extends RecyclerView.C1125g {
        public C1360e(int i) {
        }

        /* renamed from: a */
        public abstract void mo4765a();

        /* renamed from: b */
        public final void mo4766b(int i, int i2) {
            mo4765a();
        }

        /* renamed from: c */
        public final void mo4767c(int i, int i2, Object obj) {
            mo4765a();
        }

        /* renamed from: d */
        public final void mo4768d(int i, int i2) {
            mo4765a();
        }

        /* renamed from: e */
        public final void mo4769e(int i, int i2) {
            mo4765a();
        }

        /* renamed from: f */
        public final void mo4770f(int i, int i2) {
            mo4765a();
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$f */
    public class C1361f extends LinearLayoutManager {
        public C1361f(Context context) {
            super(context);
        }

        public final void calculateExtraLayoutSpace(RecyclerView.C1152x xVar, int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.calculateExtraLayoutSpace(xVar, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }

        public final void onInitializeAccessibilityNodeInfo(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, C6531g gVar) {
            super.onInitializeAccessibilityNodeInfo(sVar, xVar, gVar);
            ViewPager2.this.f5084u.getClass();
        }

        public final boolean performAccessibilityAction(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, int i, Bundle bundle) {
            ViewPager2.this.f5084u.getClass();
            return super.performAccessibilityAction(sVar, xVar, i, bundle);
        }

        public final boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            return false;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$g */
    public static abstract class C1362g {
        /* renamed from: a */
        public void mo5603a(int i) {
        }

        /* renamed from: b */
        public void mo5638b(int i, float f, int i2) {
        }

        /* renamed from: c */
        public void mo5604c(int i) {
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$h */
    public class C1363h extends C1359d {

        /* renamed from: a */
        public final C1364a f5092a = new C1364a();

        /* renamed from: b */
        public final C1365b f5093b = new C1365b();

        /* renamed from: c */
        public C1378h f5094c;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$h$a */
        public class C1364a implements C6541k {
            public C1364a() {
            }

            /* renamed from: a */
            public final boolean mo3589a(View view) {
                C1363h hVar = C1363h.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f5082s) {
                    viewPager2.mo5607c(currentItem, true);
                }
                return true;
            }
        }

        /* renamed from: androidx.viewpager2.widget.ViewPager2$h$b */
        public class C1365b implements C6541k {
            public C1365b() {
            }

            /* renamed from: a */
            public final boolean mo3589a(View view) {
                C1363h hVar = C1363h.this;
                int currentItem = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager2 = ViewPager2.this;
                if (viewPager2.f5082s) {
                    viewPager2.mo5607c(currentItem, true);
                }
                return true;
            }
        }

        public C1363h() {
        }

        /* renamed from: a */
        public final void mo5639a(RecyclerView recyclerView) {
            WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
            C6333d0.C6337d.m15059s(recyclerView, 2);
            this.f5094c = new C1378h(this);
            if (C6333d0.C6337d.m15043c(ViewPager2.this) == 0) {
                C6333d0.C6337d.m15059s(ViewPager2.this, 1);
            }
        }

        /* renamed from: b */
        public final void mo5640b() {
            int itemCount;
            int i;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i2 = 16908360;
            C6333d0.m15026n(16908360, viewPager2);
            boolean z = false;
            C6333d0.m15021i(0, viewPager2);
            C6333d0.m15026n(16908361, viewPager2);
            C6333d0.m15021i(0, viewPager2);
            C6333d0.m15026n(16908358, viewPager2);
            C6333d0.m15021i(0, viewPager2);
            C6333d0.m15026n(16908359, viewPager2);
            C6333d0.m15021i(0, viewPager2);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0) {
                ViewPager2 viewPager22 = ViewPager2.this;
                if (viewPager22.f5082s) {
                    if (viewPager22.getOrientation() == 0) {
                        if (ViewPager2.this.f5071h.getLayoutDirection() == 1) {
                            z = true;
                        }
                        if (z) {
                            i = 16908360;
                        } else {
                            i = 16908361;
                        }
                        if (z) {
                            i2 = 16908361;
                        }
                        if (ViewPager2.this.f5068e < itemCount - 1) {
                            C6333d0.m15027o(viewPager2, new C6531g.C6532a(i), this.f5092a);
                        }
                        if (ViewPager2.this.f5068e > 0) {
                            C6333d0.m15027o(viewPager2, new C6531g.C6532a(i2), this.f5093b);
                            return;
                        }
                        return;
                    }
                    if (ViewPager2.this.f5068e < itemCount - 1) {
                        C6333d0.m15027o(viewPager2, new C6531g.C6532a(16908359), this.f5092a);
                    }
                    if (ViewPager2.this.f5068e > 0) {
                        C6333d0.m15027o(viewPager2, new C6531g.C6532a(16908358), this.f5093b);
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$i */
    public interface C1366i {
        void transformPage(View view, float f);
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$j */
    public class C1367j extends C1165b0 {
        public C1367j() {
        }

        /* renamed from: c */
        public final View mo5016c(RecyclerView.C1134m mVar) {
            if (((C1375f) ViewPager2.this.f5078o.f5106c).f5122m) {
                return null;
            }
            return super.mo5016c(mVar);
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$k */
    public class C1368k extends RecyclerView {
        public C1368k(Context context) {
            super(context, (AttributeSet) null);
        }

        public final CharSequence getAccessibilityClassName() {
            ViewPager2.this.f5084u.getClass();
            return super.getAccessibilityClassName();
        }

        public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f5068e);
            accessibilityEvent.setToIndex(ViewPager2.this.f5068e);
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
        }

        public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.f5082s || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            if (!ViewPager2.this.f5082s || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.viewpager2.widget.ViewPager2$l */
    public static class C1369l implements Runnable {

        /* renamed from: b */
        public final int f5100b;

        /* renamed from: c */
        public final RecyclerView f5101c;

        public C1369l(int i, RecyclerView recyclerView) {
            this.f5100b = i;
            this.f5101c = recyclerView;
        }

        public final void run() {
            this.f5101c.mo4616h0(this.f5100b);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo5605a(context, attributeSet);
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public final void mo5605a(Context context, AttributeSet attributeSet) {
        this.f5084u = new C1363h();
        C1368k kVar = new C1368k(context);
        this.f5074k = kVar;
        WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
        kVar.setId(C6333d0.C6338e.m15060a());
        this.f5074k.setDescendantFocusability(SQLiteDatabase.OPEN_SHAREDCACHE);
        C1361f fVar = new C1361f(context);
        this.f5071h = fVar;
        this.f5074k.setLayoutManager(fVar);
        this.f5074k.setScrollingTouchSlop(1);
        int[] iArr = C1770a.ViewPager2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        if (Build.VERSION.SDK_INT >= 29) {
            saveAttributeDataForStyleable(context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        }
        try {
            setOrientation(obtainStyledAttributes.getInt(C1770a.ViewPager2_android_orientation, 0));
            obtainStyledAttributes.recycle();
            this.f5074k.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            C1368k kVar2 = this.f5074k;
            C1377g gVar = new C1377g();
            if (kVar2.f4227D == null) {
                kVar2.f4227D = new ArrayList();
            }
            kVar2.f4227D.add(gVar);
            C1375f fVar2 = new C1375f(this);
            this.f5076m = fVar2;
            this.f5078o = new C1373d(this, fVar2, this.f5074k);
            C1367j jVar = new C1367j();
            this.f5075l = jVar;
            jVar.mo5072a(this.f5074k);
            this.f5074k.mo4615h(this.f5076m);
            C1372c cVar = new C1372c();
            this.f5077n = cVar;
            this.f5076m.f5110a = cVar;
            C1357b bVar = new C1357b();
            C1358c cVar2 = new C1358c();
            this.f5077n.f5104a.add(bVar);
            this.f5077n.f5104a.add(cVar2);
            this.f5084u.mo5639a(this.f5074k);
            C1372c cVar3 = this.f5077n;
            cVar3.f5104a.add(this.f5067d);
            C1374e eVar = new C1374e(this.f5071h);
            this.f5079p = eVar;
            this.f5077n.f5104a.add(eVar);
            C1368k kVar3 = this.f5074k;
            attachViewToParent(kVar3, 0, kVar3.getLayoutParams());
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public final void mo5606b() {
        RecyclerView.Adapter adapter;
        if (this.f5072i != -1 && (adapter = getAdapter()) != null) {
            Parcelable parcelable = this.f5073j;
            if (parcelable != null) {
                if (adapter instanceof C1354g) {
                    ((C1354g) adapter).mo5593g(parcelable);
                }
                this.f5073j = null;
            }
            int max = Math.max(0, Math.min(this.f5072i, adapter.getItemCount() - 1));
            this.f5068e = max;
            this.f5072i = -1;
            this.f5074k.mo4589e0(max);
            this.f5084u.mo5640b();
        }
    }

    /* renamed from: c */
    public final void mo5607c(int i, boolean z) {
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        RecyclerView.Adapter adapter = getAdapter();
        boolean z4 = false;
        if (adapter == null) {
            if (this.f5072i != -1) {
                this.f5072i = Math.max(i, 0);
            }
        } else if (adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            int i4 = this.f5068e;
            if (min == i4) {
                if (this.f5076m.f5115f == 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    return;
                }
            }
            if (min != i4 || !z) {
                double d = (double) i4;
                this.f5068e = min;
                this.f5084u.mo5640b();
                C1375f fVar = this.f5076m;
                if (fVar.f5115f == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    fVar.mo5654f();
                    C1375f.C1376a aVar = fVar.f5116g;
                    d = ((double) aVar.f5123a) + ((double) aVar.f5124b);
                }
                C1375f fVar2 = this.f5076m;
                if (z) {
                    i2 = 2;
                } else {
                    i2 = 3;
                }
                fVar2.f5114e = i2;
                fVar2.f5122m = false;
                if (fVar2.f5118i != min) {
                    z4 = true;
                }
                fVar2.f5118i = min;
                fVar2.mo5652d(2);
                if (z4) {
                    fVar2.mo5651c(min);
                }
                if (!z) {
                    this.f5074k.mo4589e0(min);
                    return;
                }
                double d2 = (double) min;
                if (Math.abs(d2 - d) > 3.0d) {
                    C1368k kVar = this.f5074k;
                    if (d2 > d) {
                        i3 = min - 3;
                    } else {
                        i3 = min + 3;
                    }
                    kVar.mo4589e0(i3);
                    C1368k kVar2 = this.f5074k;
                    kVar2.post(new C1369l(min, kVar2));
                    return;
                }
                this.f5074k.mo4616h0(min);
            }
        }
    }

    public final boolean canScrollHorizontally(int i) {
        return this.f5074k.canScrollHorizontally(i);
    }

    public final boolean canScrollVertically(int i) {
        return this.f5074k.canScrollVertically(i);
    }

    /* renamed from: d */
    public final void mo5610d() {
        C1367j jVar = this.f5075l;
        if (jVar != null) {
            View c = jVar.mo5016c(this.f5071h);
            if (c != null) {
                int position = this.f5071h.getPosition(c);
                if (position != this.f5068e && getScrollState() == 0) {
                    this.f5077n.mo5604c(position);
                }
                this.f5069f = false;
                return;
            }
            return;
        }
        throw new IllegalStateException("Design assumption violated.");
    }

    public final void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i = ((SavedState) parcelable).f5085b;
            sparseArray.put(this.f5074k.getId(), sparseArray.get(i));
            sparseArray.remove(i);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        mo5606b();
    }

    public CharSequence getAccessibilityClassName() {
        this.f5084u.getClass();
        this.f5084u.getClass();
        return "androidx.viewpager.widget.ViewPager";
    }

    public RecyclerView.Adapter getAdapter() {
        return this.f5074k.getAdapter();
    }

    public int getCurrentItem() {
        return this.f5068e;
    }

    public int getItemDecorationCount() {
        return this.f5074k.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f5083t;
    }

    public int getOrientation() {
        return this.f5071h.getOrientation();
    }

    public int getPageSize() {
        int i;
        int i2;
        C1368k kVar = this.f5074k;
        if (getOrientation() == 0) {
            i = kVar.getWidth() - kVar.getPaddingLeft();
            i2 = kVar.getPaddingRight();
        } else {
            i = kVar.getHeight() - kVar.getPaddingTop();
            i2 = kVar.getPaddingBottom();
        }
        return i - i2;
    }

    public int getScrollState() {
        return this.f5076m.f5115f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo r6) {
        /*
            r5 = this;
            super.onInitializeAccessibilityNodeInfo(r6)
            androidx.viewpager2.widget.ViewPager2$h r0 = r5.f5084u
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002f
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            int r1 = r1.getOrientation()
            if (r1 != r3) goto L_0x0022
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            int r1 = r1.getItemCount()
            goto L_0x0030
        L_0x0022:
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            int r1 = r1.getItemCount()
            r4 = r1
            r1 = 0
            goto L_0x0031
        L_0x002f:
            r1 = 0
        L_0x0030:
            r4 = 0
        L_0x0031:
            t1.g$b r1 = p255t1.C6531g.C6533b.m15466a(r1, r4, r2, r2)
            java.lang.Object r1 = r1.f20352a
            android.view.accessibility.AccessibilityNodeInfo$CollectionInfo r1 = (android.view.accessibility.AccessibilityNodeInfo.CollectionInfo) r1
            r6.setCollectionInfo(r1)
            androidx.viewpager2.widget.ViewPager2 r1 = androidx.viewpager2.widget.ViewPager2.this
            androidx.recyclerview.widget.RecyclerView$Adapter r1 = r1.getAdapter()
            if (r1 != 0) goto L_0x0045
            goto L_0x006a
        L_0x0045:
            int r1 = r1.getItemCount()
            if (r1 == 0) goto L_0x006a
            androidx.viewpager2.widget.ViewPager2 r2 = androidx.viewpager2.widget.ViewPager2.this
            boolean r4 = r2.f5082s
            if (r4 != 0) goto L_0x0052
            goto L_0x006a
        L_0x0052:
            int r2 = r2.f5068e
            if (r2 <= 0) goto L_0x005b
            r2 = 8192(0x2000, float:1.14794E-41)
            r6.addAction(r2)
        L_0x005b:
            androidx.viewpager2.widget.ViewPager2 r0 = androidx.viewpager2.widget.ViewPager2.this
            int r0 = r0.f5068e
            int r1 = r1 - r3
            if (r0 >= r1) goto L_0x0067
            r0 = 4096(0x1000, float:5.74E-42)
            r6.addAction(r0)
        L_0x0067:
            r6.setScrollable(r3)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.ViewPager2.onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo):void");
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = this.f5074k.getMeasuredWidth();
        int measuredHeight = this.f5074k.getMeasuredHeight();
        this.f5065b.left = getPaddingLeft();
        this.f5065b.right = (i3 - i) - getPaddingRight();
        this.f5065b.top = getPaddingTop();
        this.f5065b.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f5065b, this.f5066c);
        C1368k kVar = this.f5074k;
        Rect rect = this.f5066c;
        kVar.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f5069f) {
            mo5610d();
        }
    }

    public final void onMeasure(int i, int i2) {
        measureChild(this.f5074k, i, i2);
        int measuredWidth = this.f5074k.getMeasuredWidth();
        int measuredHeight = this.f5074k.getMeasuredHeight();
        int measuredState = this.f5074k.getMeasuredState();
        int paddingRight = getPaddingRight() + getPaddingLeft() + measuredWidth;
        int paddingTop = getPaddingTop();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, measuredState), View.resolveSizeAndState(Math.max(getPaddingBottom() + paddingTop + measuredHeight, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f5072i = savedState.f5086c;
        this.f5073j = savedState.f5087d;
    }

    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f5085b = this.f5074k.getId();
        int i = this.f5072i;
        if (i == -1) {
            i = this.f5068e;
        }
        savedState.f5086c = i;
        Parcelable parcelable = this.f5073j;
        if (parcelable != null) {
            savedState.f5087d = parcelable;
        } else {
            RecyclerView.Adapter adapter = this.f5074k.getAdapter();
            if (adapter instanceof C1354g) {
                savedState.f5087d = ((C1354g) adapter).mo5592a();
            }
        }
        return savedState;
    }

    public final void onViewAdded(View view) {
        Class<ViewPager2> cls = ViewPager2.class;
        throw new IllegalStateException("ViewPager2 does not support direct child views");
    }

    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        boolean z;
        int i2;
        this.f5084u.getClass();
        boolean z2 = false;
        if (i == 8192 || i == 4096) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return super.performAccessibilityAction(i, bundle);
        }
        C1363h hVar = this.f5084u;
        hVar.getClass();
        if (i == 8192 || i == 4096) {
            z2 = true;
        }
        if (z2) {
            if (i == 8192) {
                i2 = ViewPager2.this.getCurrentItem() - 1;
            } else {
                i2 = ViewPager2.this.getCurrentItem() + 1;
            }
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f5082s) {
                viewPager2.mo5607c(i2, true);
            }
            return true;
        }
        throw new IllegalStateException();
    }

    public void setAdapter(RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = this.f5074k.getAdapter();
        C1363h hVar = this.f5084u;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(hVar.f5094c);
        } else {
            hVar.getClass();
        }
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.f5070g);
        }
        this.f5074k.setAdapter(adapter);
        this.f5068e = 0;
        mo5606b();
        C1363h hVar2 = this.f5084u;
        hVar2.mo5640b();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(hVar2.f5094c);
        }
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.f5070g);
        }
    }

    public void setCurrentItem(int i) {
        if (!((C1375f) this.f5078o.f5106c).f5122m) {
            mo5607c(i, true);
            return;
        }
        throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
    }

    public void setLayoutDirection(int i) {
        super.setLayoutDirection(i);
        this.f5084u.mo5640b();
    }

    public void setOffscreenPageLimit(int i) {
        if (i >= 1 || i == -1) {
            this.f5083t = i;
            this.f5074k.requestLayout();
            return;
        }
        throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
    }

    public void setOrientation(int i) {
        this.f5071h.setOrientation(i);
        this.f5084u.mo5640b();
    }

    public void setPageTransformer(C1366i iVar) {
        if (iVar != null) {
            if (!this.f5081r) {
                this.f5080q = this.f5074k.getItemAnimator();
                this.f5081r = true;
            }
            this.f5074k.setItemAnimator((RecyclerView.C1128j) null);
        } else if (this.f5081r) {
            this.f5074k.setItemAnimator(this.f5080q);
            this.f5080q = null;
            this.f5081r = false;
        }
        C1374e eVar = this.f5079p;
        if (iVar != eVar.f5109b) {
            eVar.f5109b = iVar;
            if (iVar != null) {
                C1375f fVar = this.f5076m;
                fVar.mo5654f();
                C1375f.C1376a aVar = fVar.f5116g;
                double d = ((double) aVar.f5123a) + ((double) aVar.f5124b);
                int i = (int) d;
                float f = (float) (d - ((double) i));
                this.f5079p.mo5638b(i, f, Math.round(((float) getPageSize()) * f));
            }
        }
    }

    public void setUserInputEnabled(boolean z) {
        this.f5082s = z;
        this.f5084u.mo5640b();
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1355a();

        /* renamed from: b */
        public int f5085b;

        /* renamed from: c */
        public int f5086c;

        /* renamed from: d */
        public Parcelable f5087d;

        /* renamed from: androidx.viewpager2.widget.ViewPager2$SavedState$a */
        public static class C1355a implements Parcelable.ClassLoaderCreator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, (ClassLoader) null) : new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return Build.VERSION.SDK_INT >= 24 ? new SavedState(parcel, classLoader) : new SavedState(parcel);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f5085b = parcel.readInt();
            this.f5086c = parcel.readInt();
            this.f5087d = parcel.readParcelable(classLoader);
        }

        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f5085b);
            parcel.writeInt(this.f5086c);
            parcel.writeParcelable(this.f5087d, i);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f5085b = parcel.readInt();
            this.f5086c = parcel.readInt();
            this.f5087d = parcel.readParcelable((ClassLoader) null);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo5605a(context, attributeSet);
    }
}
