package androidx.viewpager2.widget;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.viewpager2.widget.f */
public final class C1375f extends RecyclerView.C1142q {

    /* renamed from: a */
    public ViewPager2.C1362g f5110a;

    /* renamed from: b */
    public final ViewPager2 f5111b;

    /* renamed from: c */
    public final RecyclerView f5112c;

    /* renamed from: d */
    public final LinearLayoutManager f5113d;

    /* renamed from: e */
    public int f5114e;

    /* renamed from: f */
    public int f5115f;

    /* renamed from: g */
    public C1376a f5116g = new C1376a();

    /* renamed from: h */
    public int f5117h;

    /* renamed from: i */
    public int f5118i;

    /* renamed from: j */
    public boolean f5119j;

    /* renamed from: k */
    public boolean f5120k;

    /* renamed from: l */
    public boolean f5121l;

    /* renamed from: m */
    public boolean f5122m;

    /* renamed from: androidx.viewpager2.widget.f$a */
    public static final class C1376a {

        /* renamed from: a */
        public int f5123a;

        /* renamed from: b */
        public float f5124b;

        /* renamed from: c */
        public int f5125c;
    }

    public C1375f(ViewPager2 viewPager2) {
        this.f5111b = viewPager2;
        ViewPager2.C1368k kVar = viewPager2.f5074k;
        this.f5112c = kVar;
        this.f5113d = (LinearLayoutManager) kVar.getLayoutManager();
        mo5653e();
    }

    /* renamed from: a */
    public final void mo4913a(int i, RecyclerView recyclerView) {
        boolean z;
        boolean z2;
        ViewPager2.C1362g gVar;
        int i2 = this.f5114e;
        boolean z3 = true;
        if (!(i2 == 1 && this.f5115f == 1) && i == 1) {
            this.f5122m = false;
            this.f5114e = 1;
            int i3 = this.f5118i;
            if (i3 != -1) {
                this.f5117h = i3;
                this.f5118i = -1;
            } else if (this.f5117h == -1) {
                this.f5117h = this.f5113d.findFirstVisibleItemPosition();
            }
            mo5652d(1);
            return;
        }
        if (i2 == 1 || i2 == 4) {
            z = true;
        } else {
            z = false;
        }
        if (!z || i != 2) {
            if (i2 == 1 || i2 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && i == 0) {
                mo5654f();
                if (!this.f5120k) {
                    int i4 = this.f5116g.f5123a;
                    if (!(i4 == -1 || (gVar = this.f5110a) == null)) {
                        gVar.mo5638b(i4, BitmapDescriptorFactory.HUE_RED, 0);
                    }
                } else {
                    C1376a aVar = this.f5116g;
                    if (aVar.f5125c == 0) {
                        int i5 = this.f5117h;
                        int i6 = aVar.f5123a;
                        if (i5 != i6) {
                            mo5651c(i6);
                        }
                    } else {
                        z3 = false;
                    }
                }
                if (z3) {
                    mo5652d(0);
                    mo5653e();
                }
            }
            if (this.f5114e == 2 && i == 0 && this.f5121l) {
                mo5654f();
                C1376a aVar2 = this.f5116g;
                if (aVar2.f5125c == 0) {
                    int i7 = this.f5118i;
                    int i8 = aVar2.f5123a;
                    if (i7 != i8) {
                        if (i8 == -1) {
                            i8 = 0;
                        }
                        mo5651c(i8);
                    }
                    mo5652d(0);
                    mo5653e();
                }
            }
        } else if (this.f5120k) {
            mo5652d(2);
            this.f5119j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r6 == r7) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0040  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4914b(androidx.recyclerview.widget.RecyclerView r5, int r6, int r7) {
        /*
            r4 = this;
            r5 = 1
            r4.f5120k = r5
            r4.mo5654f()
            boolean r0 = r4.f5119j
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L_0x0044
            r4.f5119j = r1
            if (r7 > 0) goto L_0x0029
            if (r7 != 0) goto L_0x0027
            if (r6 >= 0) goto L_0x0016
            r6 = 1
            goto L_0x0017
        L_0x0016:
            r6 = 0
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r7 = r4.f5111b
            androidx.viewpager2.widget.ViewPager2$f r7 = r7.f5071h
            int r7 = r7.getLayoutDirection()
            if (r7 != r5) goto L_0x0023
            r7 = 1
            goto L_0x0024
        L_0x0023:
            r7 = 0
        L_0x0024:
            if (r6 != r7) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r6 = 0
            goto L_0x002a
        L_0x0029:
            r6 = 1
        L_0x002a:
            if (r6 == 0) goto L_0x0036
            androidx.viewpager2.widget.f$a r6 = r4.f5116g
            int r7 = r6.f5125c
            if (r7 == 0) goto L_0x0036
            int r6 = r6.f5123a
            int r6 = r6 + r5
            goto L_0x003a
        L_0x0036:
            androidx.viewpager2.widget.f$a r6 = r4.f5116g
            int r6 = r6.f5123a
        L_0x003a:
            r4.f5118i = r6
            int r7 = r4.f5117h
            if (r7 == r6) goto L_0x0052
            r4.mo5651c(r6)
            goto L_0x0052
        L_0x0044:
            int r6 = r4.f5114e
            if (r6 != 0) goto L_0x0052
            androidx.viewpager2.widget.f$a r6 = r4.f5116g
            int r6 = r6.f5123a
            if (r6 != r2) goto L_0x004f
            r6 = 0
        L_0x004f:
            r4.mo5651c(r6)
        L_0x0052:
            androidx.viewpager2.widget.f$a r6 = r4.f5116g
            int r7 = r6.f5123a
            if (r7 != r2) goto L_0x0059
            r7 = 0
        L_0x0059:
            float r0 = r6.f5124b
            int r6 = r6.f5125c
            androidx.viewpager2.widget.ViewPager2$g r3 = r4.f5110a
            if (r3 == 0) goto L_0x0064
            r3.mo5638b(r7, r0, r6)
        L_0x0064:
            androidx.viewpager2.widget.f$a r6 = r4.f5116g
            int r7 = r6.f5123a
            int r0 = r4.f5118i
            if (r7 == r0) goto L_0x006e
            if (r0 != r2) goto L_0x007c
        L_0x006e:
            int r6 = r6.f5125c
            if (r6 != 0) goto L_0x007c
            int r6 = r4.f5115f
            if (r6 == r5) goto L_0x007c
            r4.mo5652d(r1)
            r4.mo5653e()
        L_0x007c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1375f.mo4914b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: c */
    public final void mo5651c(int i) {
        ViewPager2.C1362g gVar = this.f5110a;
        if (gVar != null) {
            gVar.mo5604c(i);
        }
    }

    /* renamed from: d */
    public final void mo5652d(int i) {
        if ((this.f5114e != 3 || this.f5115f != 0) && this.f5115f != i) {
            this.f5115f = i;
            ViewPager2.C1362g gVar = this.f5110a;
            if (gVar != null) {
                gVar.mo5603a(i);
            }
        }
    }

    /* renamed from: e */
    public final void mo5653e() {
        this.f5114e = 0;
        this.f5115f = 0;
        C1376a aVar = this.f5116g;
        aVar.f5123a = -1;
        aVar.f5124b = BitmapDescriptorFactory.HUE_RED;
        aVar.f5125c = 0;
        this.f5117h = -1;
        this.f5118i = -1;
        this.f5119j = false;
        this.f5120k = false;
        this.f5122m = false;
        this.f5121l = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0139, code lost:
        if (r5[r2 - 1][1] >= r6) goto L_0x013c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0163 A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5654f() {
        /*
            r13 = this;
            androidx.viewpager2.widget.f$a r0 = r13.f5116g
            androidx.recyclerview.widget.LinearLayoutManager r1 = r13.f5113d
            int r1 = r1.findFirstVisibleItemPosition()
            r0.f5123a = r1
            r2 = 0
            r3 = -1
            r4 = 0
            if (r1 != r3) goto L_0x0016
            r0.f5123a = r3
            r0.f5124b = r2
            r0.f5125c = r4
            return
        L_0x0016:
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f5113d
            android.view.View r1 = r5.findViewByPosition(r1)
            if (r1 != 0) goto L_0x0025
            r0.f5123a = r3
            r0.f5124b = r2
            r0.f5125c = r4
            return
        L_0x0025:
            androidx.recyclerview.widget.LinearLayoutManager r3 = r13.f5113d
            int r3 = r3.getLeftDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f5113d
            int r5 = r5.getRightDecorationWidth(r1)
            androidx.recyclerview.widget.LinearLayoutManager r6 = r13.f5113d
            int r6 = r6.getTopDecorationHeight(r1)
            androidx.recyclerview.widget.LinearLayoutManager r7 = r13.f5113d
            int r7 = r7.getBottomDecorationHeight(r1)
            android.view.ViewGroup$LayoutParams r8 = r1.getLayoutParams()
            boolean r9 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r9 == 0) goto L_0x0053
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            int r9 = r8.leftMargin
            int r3 = r3 + r9
            int r9 = r8.rightMargin
            int r5 = r5 + r9
            int r9 = r8.topMargin
            int r6 = r6 + r9
            int r8 = r8.bottomMargin
            int r7 = r7 + r8
        L_0x0053:
            int r8 = r1.getHeight()
            int r8 = r8 + r6
            int r8 = r8 + r7
            int r7 = r1.getWidth()
            int r7 = r7 + r3
            int r7 = r7 + r5
            androidx.recyclerview.widget.LinearLayoutManager r5 = r13.f5113d
            int r5 = r5.getOrientation()
            r9 = 1
            if (r5 != 0) goto L_0x006a
            r5 = 1
            goto L_0x006b
        L_0x006a:
            r5 = 0
        L_0x006b:
            if (r5 == 0) goto L_0x008b
            int r1 = r1.getLeft()
            int r1 = r1 - r3
            androidx.recyclerview.widget.RecyclerView r3 = r13.f5112c
            int r3 = r3.getPaddingLeft()
            int r1 = r1 - r3
            androidx.viewpager2.widget.ViewPager2 r3 = r13.f5111b
            androidx.viewpager2.widget.ViewPager2$f r3 = r3.f5071h
            int r3 = r3.getLayoutDirection()
            if (r3 != r9) goto L_0x0085
            r3 = 1
            goto L_0x0086
        L_0x0085:
            r3 = 0
        L_0x0086:
            if (r3 == 0) goto L_0x0089
            int r1 = -r1
        L_0x0089:
            r8 = r7
            goto L_0x0097
        L_0x008b:
            int r1 = r1.getTop()
            int r1 = r1 - r6
            androidx.recyclerview.widget.RecyclerView r3 = r13.f5112c
            int r3 = r3.getPaddingTop()
            int r1 = r1 - r3
        L_0x0097:
            int r1 = -r1
            r0.f5125c = r1
            if (r1 >= 0) goto L_0x018b
            androidx.viewpager2.widget.b r1 = new androidx.viewpager2.widget.b
            androidx.recyclerview.widget.LinearLayoutManager r2 = r13.f5113d
            r1.<init>(r2)
            int r2 = r2.getChildCount()
            if (r2 != 0) goto L_0x00ab
            goto L_0x013c
        L_0x00ab:
            androidx.recyclerview.widget.LinearLayoutManager r3 = r1.f5103a
            int r3 = r3.getOrientation()
            if (r3 != 0) goto L_0x00b5
            r3 = 1
            goto L_0x00b6
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            r5 = 2
            int[] r6 = new int[r5]
            r6[r9] = r5
            r6[r4] = r2
            java.lang.Class r5 = java.lang.Integer.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r6)
            int[][] r5 = (int[][]) r5
            r6 = 0
        L_0x00c6:
            if (r6 >= r2) goto L_0x0110
            androidx.recyclerview.widget.LinearLayoutManager r7 = r1.f5103a
            android.view.View r7 = r7.getChildAt(r6)
            if (r7 == 0) goto L_0x0108
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            boolean r10 = r8 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r10 == 0) goto L_0x00db
            android.view.ViewGroup$MarginLayoutParams r8 = (android.view.ViewGroup.MarginLayoutParams) r8
            goto L_0x00dd
        L_0x00db:
            android.view.ViewGroup$MarginLayoutParams r8 = androidx.viewpager2.widget.C1371b.f5102b
        L_0x00dd:
            r10 = r5[r6]
            if (r3 == 0) goto L_0x00e8
            int r11 = r7.getLeft()
            int r12 = r8.leftMargin
            goto L_0x00ee
        L_0x00e8:
            int r11 = r7.getTop()
            int r12 = r8.topMargin
        L_0x00ee:
            int r11 = r11 - r12
            r10[r4] = r11
            r10 = r5[r6]
            if (r3 == 0) goto L_0x00fc
            int r7 = r7.getRight()
            int r8 = r8.rightMargin
            goto L_0x0102
        L_0x00fc:
            int r7 = r7.getBottom()
            int r8 = r8.bottomMargin
        L_0x0102:
            int r7 = r7 + r8
            r10[r9] = r7
            int r6 = r6 + 1
            goto L_0x00c6
        L_0x0108:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "null view contained in the view hierarchy"
            r0.<init>(r1)
            throw r0
        L_0x0110:
            androidx.viewpager2.widget.a r3 = new androidx.viewpager2.widget.a
            r3.<init>()
            java.util.Arrays.sort(r5, r3)
            r3 = 1
        L_0x0119:
            if (r3 >= r2) goto L_0x012b
            int r6 = r3 + -1
            r6 = r5[r6]
            r6 = r6[r9]
            r7 = r5[r3]
            r7 = r7[r4]
            if (r6 == r7) goto L_0x0128
            goto L_0x013e
        L_0x0128:
            int r3 = r3 + 1
            goto L_0x0119
        L_0x012b:
            r3 = r5[r4]
            r6 = r3[r9]
            r3 = r3[r4]
            int r6 = r6 - r3
            if (r3 > 0) goto L_0x013e
            int r2 = r2 - r9
            r2 = r5[r2]
            r2 = r2[r9]
            if (r2 >= r6) goto L_0x013c
            goto L_0x013e
        L_0x013c:
            r2 = 1
            goto L_0x013f
        L_0x013e:
            r2 = 0
        L_0x013f:
            if (r2 == 0) goto L_0x0149
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f5103a
            int r2 = r2.getChildCount()
            if (r2 > r9) goto L_0x0168
        L_0x0149:
            androidx.recyclerview.widget.LinearLayoutManager r2 = r1.f5103a
            int r2 = r2.getChildCount()
            r3 = 0
        L_0x0150:
            if (r3 >= r2) goto L_0x0163
            androidx.recyclerview.widget.LinearLayoutManager r5 = r1.f5103a
            android.view.View r5 = r5.getChildAt(r3)
            boolean r5 = androidx.viewpager2.widget.C1371b.m3693a(r5)
            if (r5 == 0) goto L_0x0160
            r1 = 1
            goto L_0x0164
        L_0x0160:
            int r3 = r3 + 1
            goto L_0x0150
        L_0x0163:
            r1 = 0
        L_0x0164:
            if (r1 == 0) goto L_0x0168
            r1 = 1
            goto L_0x0169
        L_0x0168:
            r1 = 0
        L_0x0169:
            if (r1 == 0) goto L_0x0173
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started."
            r0.<init>(r1)
            throw r0
        L_0x0173:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.util.Locale r2 = java.util.Locale.US
            java.lang.Object[] r3 = new java.lang.Object[r9]
            int r0 = r0.f5125c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r4] = r0
            java.lang.String r0 = "Page can only be offset by a positive amount, not by %d"
            java.lang.String r0 = java.lang.String.format(r2, r0, r3)
            r1.<init>(r0)
            throw r1
        L_0x018b:
            if (r8 != 0) goto L_0x018e
            goto L_0x0192
        L_0x018e:
            float r1 = (float) r1
            float r2 = (float) r8
            float r2 = r1 / r2
        L_0x0192:
            r0.f5124b = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C1375f.mo5654f():void");
    }
}
