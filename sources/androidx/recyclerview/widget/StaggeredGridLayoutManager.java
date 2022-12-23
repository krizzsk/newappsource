package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.C1223o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class StaggeredGridLayoutManager extends RecyclerView.C1134m implements RecyclerView.C1149w.C1151b {

    /* renamed from: b */
    public int f4370b = -1;

    /* renamed from: c */
    public C1159c[] f4371c;

    /* renamed from: d */
    public C1249z f4372d;

    /* renamed from: e */
    public C1249z f4373e;

    /* renamed from: f */
    public int f4374f;

    /* renamed from: g */
    public int f4375g;

    /* renamed from: h */
    public final C1239s f4376h;

    /* renamed from: i */
    public boolean f4377i;

    /* renamed from: j */
    public boolean f4378j;

    /* renamed from: k */
    public BitSet f4379k;

    /* renamed from: l */
    public int f4380l;

    /* renamed from: m */
    public int f4381m;

    /* renamed from: n */
    public LazySpanLookup f4382n;

    /* renamed from: o */
    public int f4383o;

    /* renamed from: p */
    public boolean f4384p;

    /* renamed from: q */
    public boolean f4385q;

    /* renamed from: r */
    public SavedState f4386r;

    /* renamed from: s */
    public final Rect f4387s;

    /* renamed from: t */
    public final C1158b f4388t;

    /* renamed from: u */
    public boolean f4389u;

    /* renamed from: v */
    public int[] f4390v;

    /* renamed from: w */
    public final C1157a f4391w;

    public static class LayoutParams extends RecyclerView.LayoutParams {

        /* renamed from: f */
        public C1159c f4392f;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1156a();

        /* renamed from: b */
        public int f4399b;

        /* renamed from: c */
        public int f4400c;

        /* renamed from: d */
        public int f4401d;

        /* renamed from: e */
        public int[] f4402e;

        /* renamed from: f */
        public int f4403f;

        /* renamed from: g */
        public int[] f4404g;

        /* renamed from: h */
        public List<LazySpanLookup.FullSpanItem> f4405h;

        /* renamed from: i */
        public boolean f4406i;

        /* renamed from: j */
        public boolean f4407j;

        /* renamed from: k */
        public boolean f4408k;

        /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState$a */
        public class C1156a implements Parcelable.Creator<SavedState> {
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public final Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public final int describeContents() {
            return 0;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f4399b);
            parcel.writeInt(this.f4400c);
            parcel.writeInt(this.f4401d);
            if (this.f4401d > 0) {
                parcel.writeIntArray(this.f4402e);
            }
            parcel.writeInt(this.f4403f);
            if (this.f4403f > 0) {
                parcel.writeIntArray(this.f4404g);
            }
            parcel.writeInt(this.f4406i ? 1 : 0);
            parcel.writeInt(this.f4407j ? 1 : 0);
            parcel.writeInt(this.f4408k ? 1 : 0);
            parcel.writeList(this.f4405h);
        }

        public SavedState(Parcel parcel) {
            this.f4399b = parcel.readInt();
            this.f4400c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4401d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4402e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4403f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f4404g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.f4406i = parcel.readInt() == 1;
            this.f4407j = parcel.readInt() == 1;
            this.f4408k = parcel.readInt() == 1 ? true : z;
            this.f4405h = parcel.readArrayList(LazySpanLookup.FullSpanItem.class.getClassLoader());
        }

        public SavedState(SavedState savedState) {
            this.f4401d = savedState.f4401d;
            this.f4399b = savedState.f4399b;
            this.f4400c = savedState.f4400c;
            this.f4402e = savedState.f4402e;
            this.f4403f = savedState.f4403f;
            this.f4404g = savedState.f4404g;
            this.f4406i = savedState.f4406i;
            this.f4407j = savedState.f4407j;
            this.f4408k = savedState.f4408k;
            this.f4405h = savedState.f4405h;
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$a */
    public class C1157a implements Runnable {
        public C1157a() {
        }

        public final void run() {
            StaggeredGridLayoutManager.this.mo4952l();
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$b */
    public class C1158b {

        /* renamed from: a */
        public int f4410a;

        /* renamed from: b */
        public int f4411b;

        /* renamed from: c */
        public boolean f4412c;

        /* renamed from: d */
        public boolean f4413d;

        /* renamed from: e */
        public boolean f4414e;

        /* renamed from: f */
        public int[] f4415f;

        public C1158b() {
            mo4984a();
        }

        /* renamed from: a */
        public final void mo4984a() {
            this.f4410a = -1;
            this.f4411b = Integer.MIN_VALUE;
            this.f4412c = false;
            this.f4413d = false;
            this.f4414e = false;
            int[] iArr = this.f4415f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$c */
    public class C1159c {

        /* renamed from: a */
        public ArrayList<View> f4417a = new ArrayList<>();

        /* renamed from: b */
        public int f4418b = Integer.MIN_VALUE;

        /* renamed from: c */
        public int f4419c = Integer.MIN_VALUE;

        /* renamed from: d */
        public int f4420d = 0;

        /* renamed from: e */
        public final int f4421e;

        public C1159c(int i) {
            this.f4421e = i;
        }

        /* renamed from: h */
        public static LayoutParams m3169h(View view) {
            return (LayoutParams) view.getLayoutParams();
        }

        /* renamed from: a */
        public final void mo4985a() {
            ArrayList<View> arrayList = this.f4417a;
            View view = arrayList.get(arrayList.size() - 1);
            LayoutParams h = m3169h(view);
            this.f4419c = StaggeredGridLayoutManager.this.f4372d.mo5166b(view);
            h.getClass();
        }

        /* renamed from: b */
        public final void mo4986b() {
            this.f4417a.clear();
            this.f4418b = Integer.MIN_VALUE;
            this.f4419c = Integer.MIN_VALUE;
            this.f4420d = 0;
        }

        /* renamed from: c */
        public final int mo4987c() {
            if (StaggeredGridLayoutManager.this.f4377i) {
                return mo4989e(this.f4417a.size() - 1, -1);
            }
            return mo4989e(0, this.f4417a.size());
        }

        /* renamed from: d */
        public final int mo4988d() {
            if (StaggeredGridLayoutManager.this.f4377i) {
                return mo4989e(0, this.f4417a.size());
            }
            return mo4989e(this.f4417a.size() - 1, -1);
        }

        /* renamed from: e */
        public final int mo4989e(int i, int i2) {
            int i3;
            boolean z;
            int k = StaggeredGridLayoutManager.this.f4372d.mo5175k();
            int g = StaggeredGridLayoutManager.this.f4372d.mo5171g();
            if (i2 > i) {
                i3 = 1;
            } else {
                i3 = -1;
            }
            while (i != i2) {
                View view = this.f4417a.get(i);
                int e = StaggeredGridLayoutManager.this.f4372d.mo5169e(view);
                int b = StaggeredGridLayoutManager.this.f4372d.mo5166b(view);
                boolean z2 = false;
                if (e <= g) {
                    z = true;
                } else {
                    z = false;
                }
                if (b >= k) {
                    z2 = true;
                }
                if (z && z2 && (e < k || b > g)) {
                    return StaggeredGridLayoutManager.this.getPosition(view);
                }
                i += i3;
            }
            return -1;
        }

        /* renamed from: f */
        public final int mo4990f(int i) {
            int i2 = this.f4419c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4417a.size() == 0) {
                return i;
            }
            mo4985a();
            return this.f4419c;
        }

        /* renamed from: g */
        public final View mo4991g(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f4417a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4417a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4377i && staggeredGridLayoutManager.getPosition(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4377i && staggeredGridLayoutManager2.getPosition(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4417a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f4417a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4377i && staggeredGridLayoutManager3.getPosition(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4377i && staggeredGridLayoutManager4.getPosition(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        /* renamed from: i */
        public final int mo4992i(int i) {
            int i2 = this.f4418b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f4417a.size() == 0) {
                return i;
            }
            View view = this.f4417a.get(0);
            LayoutParams h = m3169h(view);
            this.f4418b = StaggeredGridLayoutManager.this.f4372d.mo5169e(view);
            h.getClass();
            return this.f4418b;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f4377i = false;
        this.f4378j = false;
        this.f4380l = -1;
        this.f4381m = Integer.MIN_VALUE;
        this.f4382n = new LazySpanLookup();
        this.f4383o = 2;
        this.f4387s = new Rect();
        this.f4388t = new C1158b();
        this.f4389u = true;
        this.f4391w = new C1157a();
        RecyclerView.C1134m.C1138d properties = RecyclerView.C1134m.getProperties(context, attributeSet, i, i2);
        int i3 = properties.f4317a;
        if (i3 == 0 || i3 == 1) {
            assertNotInLayoutOrScroll((String) null);
            if (i3 != this.f4374f) {
                this.f4374f = i3;
                C1249z zVar = this.f4372d;
                this.f4372d = this.f4373e;
                this.f4373e = zVar;
                requestLayout();
            }
            int i4 = properties.f4318b;
            assertNotInLayoutOrScroll((String) null);
            if (i4 != this.f4370b) {
                this.f4382n.mo4969a();
                requestLayout();
                this.f4370b = i4;
                this.f4379k = new BitSet(this.f4370b);
                this.f4371c = new C1159c[this.f4370b];
                for (int i5 = 0; i5 < this.f4370b; i5++) {
                    this.f4371c[i5] = new C1159c(i5);
                }
                requestLayout();
            }
            boolean z = properties.f4319c;
            assertNotInLayoutOrScroll((String) null);
            SavedState savedState = this.f4386r;
            if (!(savedState == null || savedState.f4406i == z)) {
                savedState.f4406i = z;
            }
            this.f4377i = z;
            requestLayout();
            this.f4376h = new C1239s();
            this.f4372d = C1249z.m3371a(this, this.f4374f);
            this.f4373e = C1249z.m3371a(this, 1 - this.f4374f);
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    /* renamed from: H */
    public static int m3139H(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode);
        }
        return i;
    }

    /* renamed from: A */
    public final void mo4940A(int i, RecyclerView.C1152x xVar) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = mo4960s();
            i2 = 1;
        } else {
            i3 = mo4958r();
            i2 = -1;
        }
        this.f4376h.f4674a = true;
        mo4945F(i3, xVar);
        mo4944E(i2);
        C1239s sVar = this.f4376h;
        sVar.f4676c = i3 + sVar.f4677d;
        sVar.f4675b = Math.abs(i);
    }

    /* renamed from: B */
    public final void mo4941B(RecyclerView.C1145s sVar, C1239s sVar2) {
        int i;
        int i2;
        if (sVar2.f4674a && !sVar2.f4682i) {
            if (sVar2.f4675b != 0) {
                int i3 = 1;
                if (sVar2.f4678e == -1) {
                    int i4 = sVar2.f4679f;
                    int i5 = this.f4371c[0].mo4992i(i4);
                    while (i3 < this.f4370b) {
                        int i6 = this.f4371c[i3].mo4992i(i4);
                        if (i6 > i5) {
                            i5 = i6;
                        }
                        i3++;
                    }
                    int i7 = i4 - i5;
                    if (i7 < 0) {
                        i2 = sVar2.f4680g;
                    } else {
                        i2 = sVar2.f4680g - Math.min(i7, sVar2.f4675b);
                    }
                    mo4942C(i2, sVar);
                    return;
                }
                int i8 = sVar2.f4680g;
                int f = this.f4371c[0].mo4990f(i8);
                while (i3 < this.f4370b) {
                    int f2 = this.f4371c[i3].mo4990f(i8);
                    if (f2 < f) {
                        f = f2;
                    }
                    i3++;
                }
                int i9 = f - sVar2.f4680g;
                if (i9 < 0) {
                    i = sVar2.f4679f;
                } else {
                    i = Math.min(i9, sVar2.f4675b) + sVar2.f4679f;
                }
                mo4943D(i, sVar);
            } else if (sVar2.f4678e == -1) {
                mo4942C(sVar2.f4680g, sVar);
            } else {
                mo4943D(sVar2.f4679f, sVar);
            }
        }
    }

    /* renamed from: C */
    public final void mo4942C(int i, RecyclerView.C1145s sVar) {
        int childCount = getChildCount() - 1;
        while (childCount >= 0) {
            View childAt = getChildAt(childCount);
            if (this.f4372d.mo5169e(childAt) >= i && this.f4372d.mo5178o(childAt) >= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.getClass();
                if (layoutParams.f4392f.f4417a.size() != 1) {
                    C1159c cVar = layoutParams.f4392f;
                    int size = cVar.f4417a.size();
                    View remove = cVar.f4417a.remove(size - 1);
                    LayoutParams h = C1159c.m3169h(remove);
                    h.f4392f = null;
                    if (h.mo4706d() || h.mo4705c()) {
                        cVar.f4420d -= StaggeredGridLayoutManager.this.f4372d.mo5167c(remove);
                    }
                    if (size == 1) {
                        cVar.f4418b = Integer.MIN_VALUE;
                    }
                    cVar.f4419c = Integer.MIN_VALUE;
                    removeAndRecycleView(childAt, sVar);
                    childCount--;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: D */
    public final void mo4943D(int i, RecyclerView.C1145s sVar) {
        while (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (this.f4372d.mo5166b(childAt) <= i && this.f4372d.mo5177n(childAt) <= i) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.getClass();
                if (layoutParams.f4392f.f4417a.size() != 1) {
                    C1159c cVar = layoutParams.f4392f;
                    View remove = cVar.f4417a.remove(0);
                    LayoutParams h = C1159c.m3169h(remove);
                    h.f4392f = null;
                    if (cVar.f4417a.size() == 0) {
                        cVar.f4419c = Integer.MIN_VALUE;
                    }
                    if (h.mo4706d() || h.mo4705c()) {
                        cVar.f4420d -= StaggeredGridLayoutManager.this.f4372d.mo5167c(remove);
                    }
                    cVar.f4418b = Integer.MIN_VALUE;
                    removeAndRecycleView(childAt, sVar);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: E */
    public final void mo4944E(int i) {
        boolean z;
        C1239s sVar = this.f4376h;
        sVar.f4678e = i;
        boolean z2 = this.f4378j;
        int i2 = 1;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            i2 = -1;
        }
        sVar.f4677d = i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004b  */
    /* renamed from: F */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4945F(int r5, androidx.recyclerview.widget.RecyclerView.C1152x r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.s r0 = r4.f4376h
            r1 = 0
            r0.f4675b = r1
            r0.f4676c = r5
            boolean r0 = r4.isSmoothScrolling()
            r2 = 1
            if (r0 == 0) goto L_0x002c
            int r6 = r6.f4349a
            r0 = -1
            if (r6 == r0) goto L_0x002c
            boolean r0 = r4.f4378j
            if (r6 >= r5) goto L_0x0019
            r5 = 1
            goto L_0x001a
        L_0x0019:
            r5 = 0
        L_0x001a:
            if (r0 != r5) goto L_0x0023
            androidx.recyclerview.widget.z r5 = r4.f4372d
            int r5 = r5.mo5176l()
            goto L_0x002d
        L_0x0023:
            androidx.recyclerview.widget.z r5 = r4.f4372d
            int r5 = r5.mo5176l()
            r6 = r5
            r5 = 0
            goto L_0x002e
        L_0x002c:
            r5 = 0
        L_0x002d:
            r6 = 0
        L_0x002e:
            boolean r0 = r4.getClipToPadding()
            if (r0 == 0) goto L_0x004b
            androidx.recyclerview.widget.s r0 = r4.f4376h
            androidx.recyclerview.widget.z r3 = r4.f4372d
            int r3 = r3.mo5175k()
            int r3 = r3 - r6
            r0.f4679f = r3
            androidx.recyclerview.widget.s r6 = r4.f4376h
            androidx.recyclerview.widget.z r0 = r4.f4372d
            int r0 = r0.mo5171g()
            int r0 = r0 + r5
            r6.f4680g = r0
            goto L_0x005b
        L_0x004b:
            androidx.recyclerview.widget.s r0 = r4.f4376h
            androidx.recyclerview.widget.z r3 = r4.f4372d
            int r3 = r3.mo5170f()
            int r3 = r3 + r5
            r0.f4680g = r3
            androidx.recyclerview.widget.s r5 = r4.f4376h
            int r6 = -r6
            r5.f4679f = r6
        L_0x005b:
            androidx.recyclerview.widget.s r5 = r4.f4376h
            r5.f4681h = r1
            r5.f4674a = r2
            androidx.recyclerview.widget.z r6 = r4.f4372d
            int r6 = r6.mo5173i()
            if (r6 != 0) goto L_0x0072
            androidx.recyclerview.widget.z r6 = r4.f4372d
            int r6 = r6.mo5170f()
            if (r6 != 0) goto L_0x0072
            r1 = 1
        L_0x0072:
            r5.f4682i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4945F(int, androidx.recyclerview.widget.RecyclerView$x):void");
    }

    /* renamed from: G */
    public final void mo4946G(C1159c cVar, int i, int i2) {
        int i3 = cVar.f4420d;
        if (i == -1) {
            int i4 = cVar.f4418b;
            if (i4 == Integer.MIN_VALUE) {
                View view = cVar.f4417a.get(0);
                LayoutParams h = C1159c.m3169h(view);
                cVar.f4418b = StaggeredGridLayoutManager.this.f4372d.mo5169e(view);
                h.getClass();
                i4 = cVar.f4418b;
            }
            if (i4 + i3 <= i2) {
                this.f4379k.set(cVar.f4421e, false);
                return;
            }
            return;
        }
        int i5 = cVar.f4419c;
        if (i5 == Integer.MIN_VALUE) {
            cVar.mo4985a();
            i5 = cVar.f4419c;
        }
        if (i5 - i3 >= i2) {
            this.f4379k.set(cVar.f4421e, false);
        }
    }

    public final void assertNotInLayoutOrScroll(String str) {
        if (this.f4386r == null) {
            super.assertNotInLayoutOrScroll(str);
        }
    }

    public final boolean canScrollHorizontally() {
        return this.f4374f == 0;
    }

    public final boolean canScrollVertically() {
        return this.f4374f == 1;
    }

    public final boolean checkLayoutParams(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public final void collectAdjacentPrefetchPositions(int i, int i2, RecyclerView.C1152x xVar, RecyclerView.C1134m.C1137c cVar) {
        boolean z;
        int i3;
        int i4;
        if (this.f4374f != 0) {
            i = i2;
        }
        if (getChildCount() != 0 && i != 0) {
            mo4940A(i, xVar);
            int[] iArr = this.f4390v;
            if (iArr == null || iArr.length < this.f4370b) {
                this.f4390v = new int[this.f4370b];
            }
            int i5 = 0;
            for (int i6 = 0; i6 < this.f4370b; i6++) {
                C1239s sVar = this.f4376h;
                if (sVar.f4677d == -1) {
                    i4 = sVar.f4679f;
                    i3 = this.f4371c[i6].mo4992i(i4);
                } else {
                    i4 = this.f4371c[i6].mo4990f(sVar.f4680g);
                    i3 = this.f4376h.f4680g;
                }
                int i7 = i4 - i3;
                if (i7 >= 0) {
                    this.f4390v[i5] = i7;
                    i5++;
                }
            }
            Arrays.sort(this.f4390v, 0, i5);
            int i8 = 0;
            while (i8 < i5) {
                int i9 = this.f4376h.f4676c;
                if (i9 < 0 || i9 >= xVar.mo4935b()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    ((C1223o.C1225b) cVar).mo5117a(this.f4376h.f4676c, this.f4390v[i8]);
                    C1239s sVar2 = this.f4376h;
                    sVar2.f4676c += sVar2.f4677d;
                    i8++;
                } else {
                    return;
                }
            }
        }
    }

    public final int computeHorizontalScrollExtent(RecyclerView.C1152x xVar) {
        return computeScrollExtent(xVar);
    }

    public final int computeHorizontalScrollOffset(RecyclerView.C1152x xVar) {
        return computeScrollOffset(xVar);
    }

    public final int computeHorizontalScrollRange(RecyclerView.C1152x xVar) {
        return computeScrollRange(xVar);
    }

    public final int computeScrollExtent(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C1178f0.m3241a(xVar, this.f4372d, mo4955o(!this.f4389u), mo4954n(!this.f4389u), this, this.f4389u);
    }

    public final int computeScrollOffset(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C1178f0.m3242b(xVar, this.f4372d, mo4955o(!this.f4389u), mo4954n(!this.f4389u), this, this.f4389u, this.f4378j);
    }

    public final int computeScrollRange(RecyclerView.C1152x xVar) {
        if (getChildCount() == 0) {
            return 0;
        }
        return C1178f0.m3243c(xVar, this.f4372d, mo4955o(!this.f4389u), mo4954n(!this.f4389u), this, this.f4389u);
    }

    public final PointF computeScrollVectorForPosition(int i) {
        int k = mo4951k(i);
        PointF pointF = new PointF();
        if (k == 0) {
            return null;
        }
        if (this.f4374f == 0) {
            pointF.x = (float) k;
            pointF.y = BitmapDescriptorFactory.HUE_RED;
        } else {
            pointF.x = BitmapDescriptorFactory.HUE_RED;
            pointF.y = (float) k;
        }
        return pointF;
    }

    public final int computeVerticalScrollExtent(RecyclerView.C1152x xVar) {
        return computeScrollExtent(xVar);
    }

    public final int computeVerticalScrollOffset(RecyclerView.C1152x xVar) {
        return computeScrollOffset(xVar);
    }

    public final int computeVerticalScrollRange(RecyclerView.C1152x xVar) {
        return computeScrollRange(xVar);
    }

    public final RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (this.f4374f == 0) {
            return new LayoutParams(-2, -1);
        }
        return new LayoutParams(-1, -2);
    }

    public final RecyclerView.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    public final boolean isAutoMeasureEnabled() {
        return this.f4383o != 0;
    }

    public final boolean isLayoutRTL() {
        return getLayoutDirection() == 1;
    }

    /* renamed from: k */
    public final int mo4951k(int i) {
        boolean z;
        if (getChildCount() != 0) {
            if (i < mo4958r()) {
                z = true;
            } else {
                z = false;
            }
            if (z != this.f4378j) {
                return -1;
            }
            return 1;
        } else if (this.f4378j) {
            return 1;
        } else {
            return -1;
        }
    }

    /* renamed from: l */
    public final boolean mo4952l() {
        int i;
        if (!(getChildCount() == 0 || this.f4383o == 0 || !isAttachedToWindow())) {
            if (this.f4378j) {
                i = mo4960s();
                mo4958r();
            } else {
                i = mo4958r();
                mo4960s();
            }
            if (i == 0 && mo4965w() != null) {
                this.f4382n.mo4969a();
                requestSimpleAnimationsInNextLayout();
                requestLayout();
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public final int mo4953m(RecyclerView.C1145s sVar, C1239s sVar2, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        boolean z2;
        C1159c cVar;
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12;
        RecyclerView.C1145s sVar3 = sVar;
        C1239s sVar4 = sVar2;
        this.f4379k.set(0, this.f4370b, true);
        if (!this.f4376h.f4682i) {
            if (sVar4.f4678e == 1) {
                i12 = sVar4.f4680g + sVar4.f4675b;
            } else {
                i12 = sVar4.f4679f - sVar4.f4675b;
            }
            i = i12;
        } else if (sVar4.f4678e == 1) {
            i = Integer.MAX_VALUE;
        } else {
            i = Integer.MIN_VALUE;
        }
        int i13 = sVar4.f4678e;
        for (int i14 = 0; i14 < this.f4370b; i14++) {
            if (!this.f4371c[i14].f4417a.isEmpty()) {
                mo4946G(this.f4371c[i14], i13, i);
            }
        }
        if (this.f4378j) {
            i2 = this.f4372d.mo5171g();
        } else {
            i2 = this.f4372d.mo5175k();
        }
        int i15 = i2;
        boolean z4 = false;
        while (true) {
            int i16 = sVar4.f4676c;
            if (i16 < 0 || i16 >= xVar.mo4935b()) {
                z = false;
            } else {
                z = true;
            }
            int i17 = -1;
            if (z && (this.f4376h.f4682i || !this.f4379k.isEmpty())) {
                View d = sVar3.mo4919d(sVar4.f4676c);
                sVar4.f4676c += sVar4.f4677d;
                LayoutParams layoutParams = (LayoutParams) d.getLayoutParams();
                int b = layoutParams.mo4704b();
                int[] iArr = this.f4382n.f4393a;
                if (iArr == null || b >= iArr.length) {
                    i4 = -1;
                } else {
                    i4 = iArr[b];
                }
                if (i4 == -1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (mo4968z(sVar4.f4678e)) {
                        i9 = this.f4370b - 1;
                        i11 = -1;
                    } else {
                        i17 = this.f4370b;
                        i11 = 1;
                        i9 = 0;
                    }
                    C1159c cVar2 = null;
                    if (sVar4.f4678e == 1) {
                        int k = this.f4372d.mo5175k();
                        int i18 = Integer.MAX_VALUE;
                        while (i9 != i17) {
                            C1159c cVar3 = this.f4371c[i9];
                            int f = cVar3.mo4990f(k);
                            if (f < i18) {
                                i18 = f;
                                cVar2 = cVar3;
                            }
                            i9 += i11;
                        }
                    } else {
                        int g = this.f4372d.mo5171g();
                        int i19 = Integer.MIN_VALUE;
                        while (i9 != i17) {
                            C1159c cVar4 = this.f4371c[i9];
                            int i21 = cVar4.mo4992i(g);
                            if (i21 > i19) {
                                cVar2 = cVar4;
                                i19 = i21;
                            }
                            i9 += i11;
                        }
                    }
                    cVar = cVar2;
                    LazySpanLookup lazySpanLookup = this.f4382n;
                    lazySpanLookup.mo4970b(b);
                    lazySpanLookup.f4393a[b] = cVar.f4421e;
                } else {
                    cVar = this.f4371c[i4];
                }
                C1159c cVar5 = cVar;
                layoutParams.f4392f = cVar5;
                if (sVar4.f4678e == 1) {
                    addView(d);
                    z3 = false;
                } else {
                    z3 = false;
                    addView(d, 0);
                }
                if (this.f4374f == 1) {
                    mo4966x(d, RecyclerView.C1134m.getChildMeasureSpec(this.f4375g, getWidthMode(), z3 ? 1 : 0, layoutParams.width, z3), RecyclerView.C1134m.getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop(), layoutParams.height, true));
                } else {
                    mo4966x(d, RecyclerView.C1134m.getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft(), layoutParams.width, true), RecyclerView.C1134m.getChildMeasureSpec(this.f4375g, getHeightMode(), 0, layoutParams.height, false));
                }
                if (sVar4.f4678e == 1) {
                    int f2 = cVar5.mo4990f(i15);
                    i6 = f2;
                    i5 = this.f4372d.mo5167c(d) + f2;
                } else {
                    int i22 = cVar5.mo4992i(i15);
                    i5 = i22;
                    i6 = i22 - this.f4372d.mo5167c(d);
                }
                if (sVar4.f4678e == 1) {
                    C1159c cVar6 = layoutParams.f4392f;
                    cVar6.getClass();
                    LayoutParams layoutParams2 = (LayoutParams) d.getLayoutParams();
                    layoutParams2.f4392f = cVar6;
                    cVar6.f4417a.add(d);
                    cVar6.f4419c = Integer.MIN_VALUE;
                    if (cVar6.f4417a.size() == 1) {
                        cVar6.f4418b = Integer.MIN_VALUE;
                    }
                    if (layoutParams2.mo4706d() || layoutParams2.mo4705c()) {
                        cVar6.f4420d = StaggeredGridLayoutManager.this.f4372d.mo5167c(d) + cVar6.f4420d;
                    }
                } else {
                    C1159c cVar7 = layoutParams.f4392f;
                    cVar7.getClass();
                    LayoutParams layoutParams3 = (LayoutParams) d.getLayoutParams();
                    layoutParams3.f4392f = cVar7;
                    cVar7.f4417a.add(0, d);
                    cVar7.f4418b = Integer.MIN_VALUE;
                    if (cVar7.f4417a.size() == 1) {
                        cVar7.f4419c = Integer.MIN_VALUE;
                    }
                    if (layoutParams3.mo4706d() || layoutParams3.mo4705c()) {
                        cVar7.f4420d = StaggeredGridLayoutManager.this.f4372d.mo5167c(d) + cVar7.f4420d;
                    }
                }
                if (!isLayoutRTL() || this.f4374f != 1) {
                    i7 = this.f4373e.mo5175k() + (cVar5.f4421e * this.f4375g);
                    i8 = this.f4373e.mo5167c(d) + i7;
                } else {
                    i8 = this.f4373e.mo5171g() - (((this.f4370b - 1) - cVar5.f4421e) * this.f4375g);
                    i7 = i8 - this.f4373e.mo5167c(d);
                }
                int i23 = i8;
                int i24 = i7;
                if (this.f4374f == 1) {
                    layoutDecoratedWithMargins(d, i24, i6, i23, i5);
                } else {
                    layoutDecoratedWithMargins(d, i6, i24, i5, i23);
                }
                mo4946G(cVar5, this.f4376h.f4678e, i);
                mo4941B(sVar3, this.f4376h);
                if (this.f4376h.f4681h && d.hasFocusable()) {
                    this.f4379k.set(cVar5.f4421e, false);
                }
                z4 = true;
            }
        }
        if (!z4) {
            mo4941B(sVar3, this.f4376h);
        }
        if (this.f4376h.f4678e == -1) {
            i3 = this.f4372d.mo5175k() - mo4963u(this.f4372d.mo5175k());
        } else {
            i3 = mo4962t(this.f4372d.mo5171g()) - this.f4372d.mo5171g();
        }
        if (i3 > 0) {
            return Math.min(sVar4.f4675b, i3);
        }
        return 0;
    }

    /* renamed from: n */
    public final View mo4954n(boolean z) {
        int k = this.f4372d.mo5175k();
        int g = this.f4372d.mo5171g();
        View view = null;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            int e = this.f4372d.mo5169e(childAt);
            int b = this.f4372d.mo5166b(childAt);
            if (b > k && e < g) {
                if (b <= g || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    /* renamed from: o */
    public final View mo4955o(boolean z) {
        int k = this.f4372d.mo5175k();
        int g = this.f4372d.mo5171g();
        int childCount = getChildCount();
        View view = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int e = this.f4372d.mo5169e(childAt);
            if (this.f4372d.mo5166b(childAt) > k && e < g) {
                if (e >= k || !z) {
                    return childAt;
                }
                if (view == null) {
                    view = childAt;
                }
            }
        }
        return view;
    }

    public final void offsetChildrenHorizontal(int i) {
        super.offsetChildrenHorizontal(i);
        for (int i2 = 0; i2 < this.f4370b; i2++) {
            C1159c cVar = this.f4371c[i2];
            int i3 = cVar.f4418b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.f4418b = i3 + i;
            }
            int i4 = cVar.f4419c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.f4419c = i4 + i;
            }
        }
    }

    public final void offsetChildrenVertical(int i) {
        super.offsetChildrenVertical(i);
        for (int i2 = 0; i2 < this.f4370b; i2++) {
            C1159c cVar = this.f4371c[i2];
            int i3 = cVar.f4418b;
            if (i3 != Integer.MIN_VALUE) {
                cVar.f4418b = i3 + i;
            }
            int i4 = cVar.f4419c;
            if (i4 != Integer.MIN_VALUE) {
                cVar.f4419c = i4 + i;
            }
        }
    }

    public final void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        this.f4382n.mo4969a();
        for (int i = 0; i < this.f4370b; i++) {
            this.f4371c[i].mo4986b();
        }
    }

    public final void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.C1145s sVar) {
        super.onDetachedFromWindow(recyclerView, sVar);
        removeCallbacks(this.f4391w);
        for (int i = 0; i < this.f4370b; i++) {
            this.f4371c[i].mo4986b();
        }
        recyclerView.requestLayout();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        if (r8.f4374f == 1) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0042, code lost:
        if (r8.f4374f == 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004e, code lost:
        if (isLayoutRTL() == false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005a, code lost:
        if (isLayoutRTL() == false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0060  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onFocusSearchFailed(android.view.View r9, int r10, androidx.recyclerview.widget.RecyclerView.C1145s r11, androidx.recyclerview.widget.RecyclerView.C1152x r12) {
        /*
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            android.view.View r9 = r8.findContainingItemView(r9)
            if (r9 != 0) goto L_0x000f
            return r1
        L_0x000f:
            r8.resolveShouldLayoutReverse()
            r0 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1
            if (r10 == r3) goto L_0x0051
            r4 = 2
            if (r10 == r4) goto L_0x0045
            r4 = 17
            if (r10 == r4) goto L_0x0040
            r4 = 33
            if (r10 == r4) goto L_0x003a
            r4 = 66
            if (r10 == r4) goto L_0x0035
            r4 = 130(0x82, float:1.82E-43)
            if (r10 == r4) goto L_0x002c
            goto L_0x0032
        L_0x002c:
            int r10 = r8.f4374f
            if (r10 != r3) goto L_0x0032
        L_0x0030:
            r10 = 1
            goto L_0x005d
        L_0x0032:
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x005d
        L_0x0035:
            int r10 = r8.f4374f
            if (r10 != 0) goto L_0x0032
            goto L_0x0030
        L_0x003a:
            int r10 = r8.f4374f
            if (r10 != r3) goto L_0x0032
        L_0x003e:
            r10 = -1
            goto L_0x005d
        L_0x0040:
            int r10 = r8.f4374f
            if (r10 != 0) goto L_0x0032
        L_0x0044:
            goto L_0x003e
        L_0x0045:
            int r10 = r8.f4374f
            if (r10 != r3) goto L_0x004a
            goto L_0x0030
        L_0x004a:
            boolean r10 = r8.isLayoutRTL()
            if (r10 == 0) goto L_0x0030
            goto L_0x0055
        L_0x0051:
            int r10 = r8.f4374f
            if (r10 != r3) goto L_0x0056
        L_0x0055:
            goto L_0x0044
        L_0x0056:
            boolean r10 = r8.isLayoutRTL()
            if (r10 == 0) goto L_0x003e
            goto L_0x0030
        L_0x005d:
            if (r10 != r2) goto L_0x0060
            return r1
        L_0x0060:
            android.view.ViewGroup$LayoutParams r2 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r2
            r2.getClass()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r2 = r2.f4392f
            if (r10 != r3) goto L_0x0072
            int r4 = r8.mo4960s()
            goto L_0x0076
        L_0x0072:
            int r4 = r8.mo4958r()
        L_0x0076:
            r8.mo4945F(r4, r12)
            r8.mo4944E(r10)
            androidx.recyclerview.widget.s r5 = r8.f4376h
            int r6 = r5.f4677d
            int r6 = r6 + r4
            r5.f4676c = r6
            r6 = 1051372203(0x3eaaaaab, float:0.33333334)
            androidx.recyclerview.widget.z r7 = r8.f4372d
            int r7 = r7.mo5176l()
            float r7 = (float) r7
            float r7 = r7 * r6
            int r6 = (int) r7
            r5.f4675b = r6
            androidx.recyclerview.widget.s r5 = r8.f4376h
            r5.f4681h = r3
            r6 = 0
            r5.f4674a = r6
            r8.mo4953m(r11, r5, r12)
            boolean r11 = r8.f4378j
            r8.f4384p = r11
            android.view.View r11 = r2.mo4991g(r4, r10)
            if (r11 == 0) goto L_0x00a9
            if (r11 == r9) goto L_0x00a9
            return r11
        L_0x00a9:
            boolean r11 = r8.mo4968z(r10)
            if (r11 == 0) goto L_0x00c4
            int r11 = r8.f4370b
            int r11 = r11 - r3
        L_0x00b2:
            if (r11 < 0) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f4371c
            r12 = r12[r11]
            android.view.View r12 = r12.mo4991g(r4, r10)
            if (r12 == 0) goto L_0x00c1
            if (r12 == r9) goto L_0x00c1
            return r12
        L_0x00c1:
            int r11 = r11 + -1
            goto L_0x00b2
        L_0x00c4:
            r11 = 0
        L_0x00c5:
            int r12 = r8.f4370b
            if (r11 >= r12) goto L_0x00d9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f4371c
            r12 = r12[r11]
            android.view.View r12 = r12.mo4991g(r4, r10)
            if (r12 == 0) goto L_0x00d6
            if (r12 == r9) goto L_0x00d6
            return r12
        L_0x00d6:
            int r11 = r11 + 1
            goto L_0x00c5
        L_0x00d9:
            boolean r11 = r8.f4377i
            r11 = r11 ^ r3
            if (r10 != r0) goto L_0x00e0
            r12 = 1
            goto L_0x00e1
        L_0x00e0:
            r12 = 0
        L_0x00e1:
            if (r11 != r12) goto L_0x00e5
            r11 = 1
            goto L_0x00e6
        L_0x00e5:
            r11 = 0
        L_0x00e6:
            if (r11 == 0) goto L_0x00ed
            int r12 = r2.mo4987c()
            goto L_0x00f1
        L_0x00ed:
            int r12 = r2.mo4988d()
        L_0x00f1:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto L_0x00fa
            if (r12 == r9) goto L_0x00fa
            return r12
        L_0x00fa:
            boolean r10 = r8.mo4968z(r10)
            if (r10 == 0) goto L_0x0129
            int r10 = r8.f4370b
            int r10 = r10 - r3
        L_0x0103:
            if (r10 < 0) goto L_0x014c
            int r12 = r2.f4421e
            if (r10 != r12) goto L_0x010a
            goto L_0x0126
        L_0x010a:
            if (r11 == 0) goto L_0x0115
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f4371c
            r12 = r12[r10]
            int r12 = r12.mo4987c()
            goto L_0x011d
        L_0x0115:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r12 = r8.f4371c
            r12 = r12[r10]
            int r12 = r12.mo4988d()
        L_0x011d:
            android.view.View r12 = r8.findViewByPosition(r12)
            if (r12 == 0) goto L_0x0126
            if (r12 == r9) goto L_0x0126
            return r12
        L_0x0126:
            int r10 = r10 + -1
            goto L_0x0103
        L_0x0129:
            int r10 = r8.f4370b
            if (r6 >= r10) goto L_0x014c
            if (r11 == 0) goto L_0x0138
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r10 = r8.f4371c
            r10 = r10[r6]
            int r10 = r10.mo4987c()
            goto L_0x0140
        L_0x0138:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r10 = r8.f4371c
            r10 = r10[r6]
            int r10 = r10.mo4988d()
        L_0x0140:
            android.view.View r10 = r8.findViewByPosition(r10)
            if (r10 == 0) goto L_0x0149
            if (r10 == r9) goto L_0x0149
            return r10
        L_0x0149:
            int r6 = r6 + 1
            goto L_0x0129
        L_0x014c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.onFocusSearchFailed(android.view.View, int, androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x):android.view.View");
    }

    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (getChildCount() > 0) {
            View o = mo4955o(false);
            View n = mo4954n(false);
            if (o != null && n != null) {
                int position = getPosition(o);
                int position2 = getPosition(n);
                if (position < position2) {
                    accessibilityEvent.setFromIndex(position);
                    accessibilityEvent.setToIndex(position2);
                    return;
                }
                accessibilityEvent.setFromIndex(position2);
                accessibilityEvent.setToIndex(position);
            }
        }
    }

    public final void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        mo4964v(i, i2, 1);
    }

    public final void onItemsChanged(RecyclerView recyclerView) {
        this.f4382n.mo4969a();
        requestLayout();
    }

    public final void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        mo4964v(i, i2, 8);
    }

    public final void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        mo4964v(i, i2, 2);
    }

    public final void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
        mo4964v(i, i2, 4);
    }

    public final void onLayoutChildren(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        mo4967y(sVar, xVar, true);
    }

    public final void onLayoutCompleted(RecyclerView.C1152x xVar) {
        super.onLayoutCompleted(xVar);
        this.f4380l = -1;
        this.f4381m = Integer.MIN_VALUE;
        this.f4386r = null;
        this.f4388t.mo4984a();
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            SavedState savedState = (SavedState) parcelable;
            this.f4386r = savedState;
            if (this.f4380l != -1) {
                savedState.f4402e = null;
                savedState.f4401d = 0;
                savedState.f4399b = -1;
                savedState.f4400c = -1;
                savedState.f4402e = null;
                savedState.f4401d = 0;
                savedState.f4403f = 0;
                savedState.f4404g = null;
                savedState.f4405h = null;
            }
            requestLayout();
        }
    }

    public final Parcelable onSaveInstanceState() {
        int i;
        View view;
        int i2;
        int i3;
        int[] iArr;
        SavedState savedState = this.f4386r;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        savedState2.f4406i = this.f4377i;
        savedState2.f4407j = this.f4384p;
        savedState2.f4408k = this.f4385q;
        LazySpanLookup lazySpanLookup = this.f4382n;
        if (lazySpanLookup == null || (iArr = lazySpanLookup.f4393a) == null) {
            savedState2.f4403f = 0;
        } else {
            savedState2.f4404g = iArr;
            savedState2.f4403f = iArr.length;
            savedState2.f4405h = lazySpanLookup.f4394b;
        }
        int i4 = -1;
        if (getChildCount() > 0) {
            if (this.f4384p) {
                i = mo4960s();
            } else {
                i = mo4958r();
            }
            savedState2.f4399b = i;
            if (this.f4378j) {
                view = mo4954n(true);
            } else {
                view = mo4955o(true);
            }
            if (view != null) {
                i4 = getPosition(view);
            }
            savedState2.f4400c = i4;
            int i5 = this.f4370b;
            savedState2.f4401d = i5;
            savedState2.f4402e = new int[i5];
            for (int i6 = 0; i6 < this.f4370b; i6++) {
                if (this.f4384p) {
                    i2 = this.f4371c[i6].mo4990f(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f4372d.mo5171g();
                    } else {
                        savedState2.f4402e[i6] = i2;
                    }
                } else {
                    i2 = this.f4371c[i6].mo4992i(Integer.MIN_VALUE);
                    if (i2 != Integer.MIN_VALUE) {
                        i3 = this.f4372d.mo5175k();
                    } else {
                        savedState2.f4402e[i6] = i2;
                    }
                }
                i2 -= i3;
                savedState2.f4402e[i6] = i2;
            }
        } else {
            savedState2.f4399b = -1;
            savedState2.f4400c = -1;
            savedState2.f4401d = 0;
        }
        return savedState2;
    }

    public final void onScrollStateChanged(int i) {
        if (i == 0) {
            mo4952l();
        }
    }

    /* renamed from: p */
    public final void mo4956p(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z) {
        int g;
        int t = mo4962t(Integer.MIN_VALUE);
        if (t != Integer.MIN_VALUE && (g = this.f4372d.mo5171g() - t) > 0) {
            int i = g - (-scrollBy(-g, sVar, xVar));
            if (z && i > 0) {
                this.f4372d.mo5179p(i);
            }
        }
    }

    /* renamed from: q */
    public final void mo4957q(RecyclerView.C1145s sVar, RecyclerView.C1152x xVar, boolean z) {
        int k;
        int u = mo4963u(Integer.MAX_VALUE);
        if (u != Integer.MAX_VALUE && (k = u - this.f4372d.mo5175k()) > 0) {
            int scrollBy = k - scrollBy(k, sVar, xVar);
            if (z && scrollBy > 0) {
                this.f4372d.mo5179p(-scrollBy);
            }
        }
    }

    /* renamed from: r */
    public final int mo4958r() {
        if (getChildCount() == 0) {
            return 0;
        }
        return getPosition(getChildAt(0));
    }

    public final void resolveShouldLayoutReverse() {
        if (this.f4374f == 1 || !isLayoutRTL()) {
            this.f4378j = this.f4377i;
        } else {
            this.f4378j = !this.f4377i;
        }
    }

    /* renamed from: s */
    public final int mo4960s() {
        int childCount = getChildCount();
        if (childCount == 0) {
            return 0;
        }
        return getPosition(getChildAt(childCount - 1));
    }

    public final int scrollBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        if (getChildCount() == 0 || i == 0) {
            return 0;
        }
        mo4940A(i, xVar);
        int m = mo4953m(sVar, this.f4376h, xVar);
        if (this.f4376h.f4675b >= m) {
            if (i < 0) {
                i = -m;
            } else {
                i = m;
            }
        }
        this.f4372d.mo5179p(-i);
        this.f4384p = this.f4378j;
        C1239s sVar2 = this.f4376h;
        sVar2.f4675b = 0;
        mo4941B(sVar, sVar2);
        return i;
    }

    public final int scrollHorizontallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        return scrollBy(i, sVar, xVar);
    }

    public final void scrollToPosition(int i) {
        SavedState savedState = this.f4386r;
        if (!(savedState == null || savedState.f4399b == i)) {
            savedState.f4402e = null;
            savedState.f4401d = 0;
            savedState.f4399b = -1;
            savedState.f4400c = -1;
        }
        this.f4380l = i;
        this.f4381m = Integer.MIN_VALUE;
        requestLayout();
    }

    public final int scrollVerticallyBy(int i, RecyclerView.C1145s sVar, RecyclerView.C1152x xVar) {
        return scrollBy(i, sVar, xVar);
    }

    public final void setMeasuredDimension(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.f4374f == 1) {
            i4 = RecyclerView.C1134m.chooseSize(i2, rect.height() + paddingBottom, getMinimumHeight());
            i3 = RecyclerView.C1134m.chooseSize(i, (this.f4375g * this.f4370b) + paddingRight, getMinimumWidth());
        } else {
            i3 = RecyclerView.C1134m.chooseSize(i, rect.width() + paddingRight, getMinimumWidth());
            i4 = RecyclerView.C1134m.chooseSize(i2, (this.f4375g * this.f4370b) + paddingBottom, getMinimumHeight());
        }
        setMeasuredDimension(i3, i4);
    }

    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.C1152x xVar, int i) {
        C1240t tVar = new C1240t(recyclerView.getContext());
        tVar.f4336a = i;
        startSmoothScroll(tVar);
    }

    public final boolean supportsPredictiveItemAnimations() {
        return this.f4386r == null;
    }

    /* renamed from: t */
    public final int mo4962t(int i) {
        int f = this.f4371c[0].mo4990f(i);
        for (int i2 = 1; i2 < this.f4370b; i2++) {
            int f2 = this.f4371c[i2].mo4990f(i);
            if (f2 > f) {
                f = f2;
            }
        }
        return f;
    }

    /* renamed from: u */
    public final int mo4963u(int i) {
        int i2 = this.f4371c[0].mo4992i(i);
        for (int i3 = 1; i3 < this.f4370b; i3++) {
            int i4 = this.f4371c[i3].mo4992i(i);
            if (i4 < i2) {
                i2 = i4;
            }
        }
        return i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0044  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4964v(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f4378j
            if (r0 == 0) goto L_0x0009
            int r0 = r6.mo4960s()
            goto L_0x000d
        L_0x0009:
            int r0 = r6.mo4958r()
        L_0x000d:
            r1 = 8
            if (r9 != r1) goto L_0x001a
            if (r7 >= r8) goto L_0x0016
            int r2 = r8 + 1
            goto L_0x001c
        L_0x0016:
            int r2 = r7 + 1
            r3 = r8
            goto L_0x001d
        L_0x001a:
            int r2 = r7 + r8
        L_0x001c:
            r3 = r7
        L_0x001d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r4 = r6.f4382n
            r4.mo4971c(r3)
            r4 = 1
            if (r9 == r4) goto L_0x003c
            r5 = 2
            if (r9 == r5) goto L_0x0036
            if (r9 == r1) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4382n
            r9.mo4973e(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r6.f4382n
            r7.mo4972d(r8, r4)
            goto L_0x0041
        L_0x0036:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4382n
            r9.mo4973e(r7, r8)
            goto L_0x0041
        L_0x003c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r9 = r6.f4382n
            r9.mo4972d(r7, r8)
        L_0x0041:
            if (r2 > r0) goto L_0x0044
            return
        L_0x0044:
            boolean r7 = r6.f4378j
            if (r7 == 0) goto L_0x004d
            int r7 = r6.mo4958r()
            goto L_0x0051
        L_0x004d:
            int r7 = r6.mo4960s()
        L_0x0051:
            if (r3 > r7) goto L_0x0056
            r6.requestLayout()
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4964v(int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d1, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r10 == r11) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e7, code lost:
        r10 = false;
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00af A[SYNTHETIC] */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View mo4965w() {
        /*
            r13 = this;
            int r0 = r13.getChildCount()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r13.f4370b
            r2.<init>(r3)
            int r3 = r13.f4370b
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r13.f4374f
            r5 = -1
            if (r3 != r1) goto L_0x0020
            boolean r3 = r13.isLayoutRTL()
            if (r3 == 0) goto L_0x0020
            r3 = 1
            goto L_0x0021
        L_0x0020:
            r3 = -1
        L_0x0021:
            boolean r6 = r13.f4378j
            if (r6 == 0) goto L_0x0027
            r6 = -1
            goto L_0x002b
        L_0x0027:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L_0x002b:
            if (r0 >= r6) goto L_0x002e
            r5 = 1
        L_0x002e:
            if (r0 == r6) goto L_0x0106
            android.view.View r7 = r13.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f4392f
            int r9 = r9.f4421e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L_0x00b7
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f4392f
            boolean r10 = r13.f4378j
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == 0) goto L_0x0073
            int r10 = r9.f4419c
            if (r10 == r11) goto L_0x0051
            goto L_0x0056
        L_0x0051:
            r9.mo4985a()
            int r10 = r9.f4419c
        L_0x0056:
            androidx.recyclerview.widget.z r11 = r13.f4372d
            int r11 = r11.mo5171g()
            if (r10 >= r11) goto L_0x00ac
            java.util.ArrayList<android.view.View> r9 = r9.f4417a
            int r10 = r9.size()
            int r10 = r10 - r1
            java.lang.Object r9 = r9.get(r10)
            android.view.View r9 = (android.view.View) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.C1159c.m3169h(r9)
            r9.getClass()
            goto L_0x00aa
        L_0x0073:
            int r10 = r9.f4418b
            if (r10 == r11) goto L_0x0078
            goto L_0x0093
        L_0x0078:
            java.util.ArrayList<android.view.View> r10 = r9.f4417a
            java.lang.Object r10 = r10.get(r4)
            android.view.View r10 = (android.view.View) r10
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r11 = androidx.recyclerview.widget.StaggeredGridLayoutManager.C1159c.m3169h(r10)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r12 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.z r12 = r12.f4372d
            int r10 = r12.mo5169e(r10)
            r9.f4418b = r10
            r11.getClass()
            int r10 = r9.f4418b
        L_0x0093:
            androidx.recyclerview.widget.z r11 = r13.f4372d
            int r11 = r11.mo5175k()
            if (r10 <= r11) goto L_0x00ac
            java.util.ArrayList<android.view.View> r9 = r9.f4417a
            java.lang.Object r9 = r9.get(r4)
            android.view.View r9 = (android.view.View) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = androidx.recyclerview.widget.StaggeredGridLayoutManager.C1159c.m3169h(r9)
            r9.getClass()
        L_0x00aa:
            r9 = 1
            goto L_0x00ad
        L_0x00ac:
            r9 = 0
        L_0x00ad:
            if (r9 == 0) goto L_0x00b0
            return r7
        L_0x00b0:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r8.f4392f
            int r9 = r9.f4421e
            r2.clear(r9)
        L_0x00b7:
            int r0 = r0 + r5
            if (r0 == r6) goto L_0x002e
            android.view.View r9 = r13.getChildAt(r0)
            boolean r10 = r13.f4378j
            if (r10 == 0) goto L_0x00d4
            androidx.recyclerview.widget.z r10 = r13.f4372d
            int r10 = r10.mo5166b(r7)
            androidx.recyclerview.widget.z r11 = r13.f4372d
            int r11 = r11.mo5166b(r9)
            if (r10 >= r11) goto L_0x00d1
            return r7
        L_0x00d1:
            if (r10 != r11) goto L_0x00e7
            goto L_0x00e5
        L_0x00d4:
            androidx.recyclerview.widget.z r10 = r13.f4372d
            int r10 = r10.mo5169e(r7)
            androidx.recyclerview.widget.z r11 = r13.f4372d
            int r11 = r11.mo5169e(r9)
            if (r10 <= r11) goto L_0x00e3
            return r7
        L_0x00e3:
            if (r10 != r11) goto L_0x00e7
        L_0x00e5:
            r10 = 1
            goto L_0x00e8
        L_0x00e7:
            r10 = 0
        L_0x00e8:
            if (r10 == 0) goto L_0x002e
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = r8.f4392f
            int r8 = r8.f4421e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = r9.f4392f
            int r9 = r9.f4421e
            int r8 = r8 - r9
            if (r8 >= 0) goto L_0x00fd
            r8 = 1
            goto L_0x00fe
        L_0x00fd:
            r8 = 0
        L_0x00fe:
            if (r3 >= 0) goto L_0x0102
            r9 = 1
            goto L_0x0103
        L_0x0102:
            r9 = 0
        L_0x0103:
            if (r8 == r9) goto L_0x002e
            return r7
        L_0x0106:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4965w():android.view.View");
    }

    /* renamed from: x */
    public final void mo4966x(View view, int i, int i2) {
        calculateItemDecorationsForChild(view, this.f4387s);
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.leftMargin;
        Rect rect = this.f4387s;
        int H = m3139H(i, i3 + rect.left, layoutParams.rightMargin + rect.right);
        int i4 = layoutParams.topMargin;
        Rect rect2 = this.f4387s;
        int H2 = m3139H(i2, i4 + rect2.top, layoutParams.bottomMargin + rect2.bottom);
        if (shouldMeasureChild(view, H, H2, layoutParams)) {
            view.measure(H, H2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0420, code lost:
        if (mo4952l() != false) goto L_0x0424;
     */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01cc  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4967y(androidx.recyclerview.widget.RecyclerView.C1145s r12, androidx.recyclerview.widget.RecyclerView.C1152x r13, boolean r14) {
        /*
            r11 = this;
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r0 = r11.f4388t
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f4386r
            r2 = -1
            if (r1 != 0) goto L_0x000b
            int r1 = r11.f4380l
            if (r1 == r2) goto L_0x0018
        L_0x000b:
            int r1 = r13.mo4935b()
            if (r1 != 0) goto L_0x0018
            r11.removeAndRecycleAllViews(r12)
            r0.mo4984a()
            return
        L_0x0018:
            boolean r1 = r0.f4414e
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L_0x0029
            int r1 = r11.f4380l
            if (r1 != r2) goto L_0x0029
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r1 = r11.f4386r
            if (r1 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r1 = 0
            goto L_0x002a
        L_0x0029:
            r1 = 1
        L_0x002a:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == 0) goto L_0x020b
            r0.mo4984a()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f4386r
            if (r6 == 0) goto L_0x00ba
            int r7 = r6.f4401d
            r8 = 0
            if (r7 <= 0) goto L_0x007d
            int r9 = r11.f4370b
            if (r7 != r9) goto L_0x006f
            r6 = 0
        L_0x003f:
            int r7 = r11.f4370b
            if (r6 >= r7) goto L_0x007d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f4371c
            r7 = r7[r6]
            r7.mo4986b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f4386r
            int[] r9 = r7.f4402e
            r9 = r9[r6]
            if (r9 == r5) goto L_0x0064
            boolean r7 = r7.f4407j
            if (r7 == 0) goto L_0x005d
            androidx.recyclerview.widget.z r7 = r11.f4372d
            int r7 = r7.mo5171g()
            goto L_0x0063
        L_0x005d:
            androidx.recyclerview.widget.z r7 = r11.f4372d
            int r7 = r7.mo5175k()
        L_0x0063:
            int r9 = r9 + r7
        L_0x0064:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f4371c
            r7 = r7[r6]
            r7.f4418b = r9
            r7.f4419c = r9
            int r6 = r6 + 1
            goto L_0x003f
        L_0x006f:
            r6.f4402e = r8
            r6.f4401d = r4
            r6.f4403f = r4
            r6.f4404g = r8
            r6.f4405h = r8
            int r7 = r6.f4400c
            r6.f4399b = r7
        L_0x007d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f4386r
            boolean r7 = r6.f4408k
            r11.f4385q = r7
            boolean r6 = r6.f4406i
            r11.assertNotInLayoutOrScroll(r8)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r7 = r11.f4386r
            if (r7 == 0) goto L_0x0092
            boolean r8 = r7.f4406i
            if (r8 == r6) goto L_0x0092
            r7.f4406i = r6
        L_0x0092:
            r11.f4377i = r6
            r11.requestLayout()
            r11.resolveShouldLayoutReverse()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f4386r
            int r7 = r6.f4399b
            if (r7 == r2) goto L_0x00a7
            r11.f4380l = r7
            boolean r7 = r6.f4407j
            r0.f4412c = r7
            goto L_0x00ab
        L_0x00a7:
            boolean r7 = r11.f4378j
            r0.f4412c = r7
        L_0x00ab:
            int r7 = r6.f4403f
            if (r7 <= r3) goto L_0x00c1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r7 = r11.f4382n
            int[] r8 = r6.f4404g
            r7.f4393a = r8
            java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r6 = r6.f4405h
            r7.f4394b = r6
            goto L_0x00c1
        L_0x00ba:
            r11.resolveShouldLayoutReverse()
            boolean r6 = r11.f4378j
            r0.f4412c = r6
        L_0x00c1:
            boolean r6 = r13.f4355g
            if (r6 != 0) goto L_0x01c8
            int r6 = r11.f4380l
            if (r6 != r2) goto L_0x00cb
            goto L_0x01c8
        L_0x00cb:
            if (r6 < 0) goto L_0x01c4
            int r7 = r13.mo4935b()
            if (r6 < r7) goto L_0x00d5
            goto L_0x01c4
        L_0x00d5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f4386r
            if (r6 == 0) goto L_0x00ea
            int r7 = r6.f4399b
            if (r7 == r2) goto L_0x00ea
            int r6 = r6.f4401d
            if (r6 >= r3) goto L_0x00e2
            goto L_0x00ea
        L_0x00e2:
            r0.f4411b = r5
            int r6 = r11.f4380l
            r0.f4410a = r6
            goto L_0x01c2
        L_0x00ea:
            int r6 = r11.f4380l
            android.view.View r6 = r11.findViewByPosition(r6)
            if (r6 == 0) goto L_0x017c
            boolean r7 = r11.f4378j
            if (r7 == 0) goto L_0x00fb
            int r7 = r11.mo4960s()
            goto L_0x00ff
        L_0x00fb:
            int r7 = r11.mo4958r()
        L_0x00ff:
            r0.f4410a = r7
            int r7 = r11.f4381m
            if (r7 == r5) goto L_0x0131
            boolean r7 = r0.f4412c
            if (r7 == 0) goto L_0x011d
            androidx.recyclerview.widget.z r7 = r11.f4372d
            int r7 = r7.mo5171g()
            int r8 = r11.f4381m
            int r7 = r7 - r8
            androidx.recyclerview.widget.z r8 = r11.f4372d
            int r6 = r8.mo5166b(r6)
            int r7 = r7 - r6
            r0.f4411b = r7
            goto L_0x01c2
        L_0x011d:
            androidx.recyclerview.widget.z r7 = r11.f4372d
            int r7 = r7.mo5175k()
            int r8 = r11.f4381m
            int r7 = r7 + r8
            androidx.recyclerview.widget.z r8 = r11.f4372d
            int r6 = r8.mo5169e(r6)
            int r7 = r7 - r6
            r0.f4411b = r7
            goto L_0x01c2
        L_0x0131:
            androidx.recyclerview.widget.z r7 = r11.f4372d
            int r7 = r7.mo5167c(r6)
            androidx.recyclerview.widget.z r8 = r11.f4372d
            int r8 = r8.mo5176l()
            if (r7 <= r8) goto L_0x0154
            boolean r6 = r0.f4412c
            if (r6 == 0) goto L_0x014a
            androidx.recyclerview.widget.z r6 = r11.f4372d
            int r6 = r6.mo5171g()
            goto L_0x0150
        L_0x014a:
            androidx.recyclerview.widget.z r6 = r11.f4372d
            int r6 = r6.mo5175k()
        L_0x0150:
            r0.f4411b = r6
            goto L_0x01c2
        L_0x0154:
            androidx.recyclerview.widget.z r7 = r11.f4372d
            int r7 = r7.mo5169e(r6)
            androidx.recyclerview.widget.z r8 = r11.f4372d
            int r8 = r8.mo5175k()
            int r7 = r7 - r8
            if (r7 >= 0) goto L_0x0167
            int r6 = -r7
            r0.f4411b = r6
            goto L_0x01c2
        L_0x0167:
            androidx.recyclerview.widget.z r7 = r11.f4372d
            int r7 = r7.mo5171g()
            androidx.recyclerview.widget.z r8 = r11.f4372d
            int r6 = r8.mo5166b(r6)
            int r7 = r7 - r6
            if (r7 >= 0) goto L_0x0179
            r0.f4411b = r7
            goto L_0x01c2
        L_0x0179:
            r0.f4411b = r5
            goto L_0x01c2
        L_0x017c:
            int r6 = r11.f4380l
            r0.f4410a = r6
            int r7 = r11.f4381m
            if (r7 != r5) goto L_0x01a5
            int r6 = r11.mo4951k(r6)
            if (r6 != r3) goto L_0x018c
            r6 = 1
            goto L_0x018d
        L_0x018c:
            r6 = 0
        L_0x018d:
            r0.f4412c = r6
            if (r6 == 0) goto L_0x019a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.z r6 = r6.f4372d
            int r6 = r6.mo5171g()
            goto L_0x01a2
        L_0x019a:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.z r6 = r6.f4372d
            int r6 = r6.mo5175k()
        L_0x01a2:
            r0.f4411b = r6
            goto L_0x01c0
        L_0x01a5:
            boolean r6 = r0.f4412c
            if (r6 == 0) goto L_0x01b5
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.z r6 = r6.f4372d
            int r6 = r6.mo5171g()
            int r6 = r6 - r7
            r0.f4411b = r6
            goto L_0x01c0
        L_0x01b5:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r6 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.z r6 = r6.f4372d
            int r6 = r6.mo5175k()
            int r6 = r6 + r7
            r0.f4411b = r6
        L_0x01c0:
            r0.f4413d = r3
        L_0x01c2:
            r6 = 1
            goto L_0x01c9
        L_0x01c4:
            r11.f4380l = r2
            r11.f4381m = r5
        L_0x01c8:
            r6 = 0
        L_0x01c9:
            if (r6 == 0) goto L_0x01cc
            goto L_0x0209
        L_0x01cc:
            boolean r6 = r11.f4384p
            if (r6 == 0) goto L_0x01e8
            int r6 = r13.mo4935b()
            int r7 = r11.getChildCount()
        L_0x01d8:
            int r7 = r7 + r2
            if (r7 < 0) goto L_0x0204
            android.view.View r8 = r11.getChildAt(r7)
            int r8 = r11.getPosition(r8)
            if (r8 < 0) goto L_0x01d8
            if (r8 >= r6) goto L_0x01d8
            goto L_0x0205
        L_0x01e8:
            int r6 = r13.mo4935b()
            int r7 = r11.getChildCount()
            r8 = 0
        L_0x01f1:
            if (r8 >= r7) goto L_0x0204
            android.view.View r9 = r11.getChildAt(r8)
            int r9 = r11.getPosition(r9)
            if (r9 < 0) goto L_0x0201
            if (r9 >= r6) goto L_0x0201
            r8 = r9
            goto L_0x0205
        L_0x0201:
            int r8 = r8 + 1
            goto L_0x01f1
        L_0x0204:
            r8 = 0
        L_0x0205:
            r0.f4410a = r8
            r0.f4411b = r5
        L_0x0209:
            r0.f4414e = r3
        L_0x020b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f4386r
            if (r6 != 0) goto L_0x0228
            int r6 = r11.f4380l
            if (r6 != r2) goto L_0x0228
            boolean r6 = r0.f4412c
            boolean r7 = r11.f4384p
            if (r6 != r7) goto L_0x0221
            boolean r6 = r11.isLayoutRTL()
            boolean r7 = r11.f4385q
            if (r6 == r7) goto L_0x0228
        L_0x0221:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup r6 = r11.f4382n
            r6.mo4969a()
            r0.f4413d = r3
        L_0x0228:
            int r6 = r11.getChildCount()
            if (r6 <= 0) goto L_0x02e0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r6 = r11.f4386r
            if (r6 == 0) goto L_0x0236
            int r6 = r6.f4401d
            if (r6 >= r3) goto L_0x02e0
        L_0x0236:
            boolean r6 = r0.f4413d
            if (r6 == 0) goto L_0x0255
            r1 = 0
        L_0x023b:
            int r6 = r11.f4370b
            if (r1 >= r6) goto L_0x02e0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f4371c
            r6 = r6[r1]
            r6.mo4986b()
            int r6 = r0.f4411b
            if (r6 == r5) goto L_0x0252
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r7 = r11.f4371c
            r7 = r7[r1]
            r7.f4418b = r6
            r7.f4419c = r6
        L_0x0252:
            int r1 = r1 + 1
            goto L_0x023b
        L_0x0255:
            if (r1 != 0) goto L_0x0277
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f4388t
            int[] r1 = r1.f4415f
            if (r1 != 0) goto L_0x025e
            goto L_0x0277
        L_0x025e:
            r1 = 0
        L_0x025f:
            int r6 = r11.f4370b
            if (r1 >= r6) goto L_0x02e0
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f4371c
            r6 = r6[r1]
            r6.mo4986b()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r7 = r11.f4388t
            int[] r7 = r7.f4415f
            r7 = r7[r1]
            r6.f4418b = r7
            r6.f4419c = r7
            int r1 = r1 + 1
            goto L_0x025f
        L_0x0277:
            r1 = 0
        L_0x0278:
            int r6 = r11.f4370b
            if (r1 >= r6) goto L_0x02b8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f4371c
            r6 = r6[r1]
            boolean r7 = r11.f4378j
            int r8 = r0.f4411b
            if (r7 == 0) goto L_0x028b
            int r9 = r6.mo4990f(r5)
            goto L_0x028f
        L_0x028b:
            int r9 = r6.mo4992i(r5)
        L_0x028f:
            r6.mo4986b()
            if (r9 != r5) goto L_0x0295
            goto L_0x02b5
        L_0x0295:
            if (r7 == 0) goto L_0x02a1
            androidx.recyclerview.widget.StaggeredGridLayoutManager r10 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.z r10 = r10.f4372d
            int r10 = r10.mo5171g()
            if (r9 < r10) goto L_0x02b5
        L_0x02a1:
            if (r7 != 0) goto L_0x02ae
            androidx.recyclerview.widget.StaggeredGridLayoutManager r7 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.z r7 = r7.f4372d
            int r7 = r7.mo5175k()
            if (r9 <= r7) goto L_0x02ae
            goto L_0x02b5
        L_0x02ae:
            if (r8 == r5) goto L_0x02b1
            int r9 = r9 + r8
        L_0x02b1:
            r6.f4419c = r9
            r6.f4418b = r9
        L_0x02b5:
            int r1 = r1 + 1
            goto L_0x0278
        L_0x02b8:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r1 = r11.f4388t
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r6 = r11.f4371c
            r1.getClass()
            int r7 = r6.length
            int[] r8 = r1.f4415f
            if (r8 == 0) goto L_0x02c7
            int r8 = r8.length
            if (r8 >= r7) goto L_0x02d0
        L_0x02c7:
            androidx.recyclerview.widget.StaggeredGridLayoutManager r8 = androidx.recyclerview.widget.StaggeredGridLayoutManager.this
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c[] r8 = r8.f4371c
            int r8 = r8.length
            int[] r8 = new int[r8]
            r1.f4415f = r8
        L_0x02d0:
            r8 = 0
        L_0x02d1:
            if (r8 >= r7) goto L_0x02e0
            int[] r9 = r1.f4415f
            r10 = r6[r8]
            int r10 = r10.mo4992i(r5)
            r9[r8] = r10
            int r8 = r8 + 1
            goto L_0x02d1
        L_0x02e0:
            r11.detachAndScrapAttachedViews(r12)
            androidx.recyclerview.widget.s r1 = r11.f4376h
            r1.f4674a = r4
            androidx.recyclerview.widget.z r1 = r11.f4373e
            int r1 = r1.mo5176l()
            int r6 = r11.f4370b
            int r6 = r1 / r6
            r11.f4375g = r6
            androidx.recyclerview.widget.z r6 = r11.f4373e
            int r6 = r6.mo5173i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r6)
            int r1 = r0.f4410a
            r11.mo4945F(r1, r13)
            boolean r1 = r0.f4412c
            if (r1 == 0) goto L_0x031d
            r11.mo4944E(r2)
            androidx.recyclerview.widget.s r1 = r11.f4376h
            r11.mo4953m(r12, r1, r13)
            r11.mo4944E(r3)
            androidx.recyclerview.widget.s r1 = r11.f4376h
            int r2 = r0.f4410a
            int r6 = r1.f4677d
            int r2 = r2 + r6
            r1.f4676c = r2
            r11.mo4953m(r12, r1, r13)
            goto L_0x0334
        L_0x031d:
            r11.mo4944E(r3)
            androidx.recyclerview.widget.s r1 = r11.f4376h
            r11.mo4953m(r12, r1, r13)
            r11.mo4944E(r2)
            androidx.recyclerview.widget.s r1 = r11.f4376h
            int r2 = r0.f4410a
            int r6 = r1.f4677d
            int r2 = r2 + r6
            r1.f4676c = r2
            r11.mo4953m(r12, r1, r13)
        L_0x0334:
            androidx.recyclerview.widget.z r1 = r11.f4373e
            int r1 = r1.mo5173i()
            r2 = 1073741824(0x40000000, float:2.0)
            if (r1 != r2) goto L_0x0340
            goto L_0x03e5
        L_0x0340:
            r1 = 0
            int r2 = r11.getChildCount()
            r6 = 0
        L_0x0346:
            if (r6 >= r2) goto L_0x0368
            android.view.View r7 = r11.getChildAt(r6)
            androidx.recyclerview.widget.z r8 = r11.f4373e
            int r8 = r8.mo5167c(r7)
            float r8 = (float) r8
            int r9 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r9 >= 0) goto L_0x0358
            goto L_0x0365
        L_0x0358:
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            r7.getClass()
            float r1 = java.lang.Math.max(r1, r8)
        L_0x0365:
            int r6 = r6 + 1
            goto L_0x0346
        L_0x0368:
            int r6 = r11.f4375g
            int r7 = r11.f4370b
            float r7 = (float) r7
            float r1 = r1 * r7
            int r1 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.z r7 = r11.f4373e
            int r7 = r7.mo5173i()
            if (r7 != r5) goto L_0x0385
            androidx.recyclerview.widget.z r5 = r11.f4373e
            int r5 = r5.mo5176l()
            int r1 = java.lang.Math.min(r1, r5)
        L_0x0385:
            int r5 = r11.f4370b
            int r5 = r1 / r5
            r11.f4375g = r5
            androidx.recyclerview.widget.z r5 = r11.f4373e
            int r5 = r5.mo5173i()
            android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
            int r1 = r11.f4375g
            if (r1 != r6) goto L_0x0399
            goto L_0x03e5
        L_0x0399:
            r1 = 0
        L_0x039a:
            if (r1 >= r2) goto L_0x03e5
            android.view.View r5 = r11.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r7 = r5.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LayoutParams r7 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams) r7
            r7.getClass()
            boolean r8 = r11.isLayoutRTL()
            if (r8 == 0) goto L_0x03cb
            int r8 = r11.f4374f
            if (r8 != r3) goto L_0x03cb
            int r8 = r11.f4370b
            int r9 = r8 + -1
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.f4392f
            int r7 = r7.f4421e
            int r9 = r9 - r7
            int r9 = -r9
            int r10 = r11.f4375g
            int r9 = r9 * r10
            int r8 = r8 - r3
            int r8 = r8 - r7
            int r7 = -r8
            int r7 = r7 * r6
            int r9 = r9 - r7
            r5.offsetLeftAndRight(r9)
            goto L_0x03e2
        L_0x03cb:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r7 = r7.f4392f
            int r7 = r7.f4421e
            int r8 = r11.f4375g
            int r8 = r8 * r7
            int r7 = r7 * r6
            int r9 = r11.f4374f
            if (r9 != r3) goto L_0x03de
            int r8 = r8 - r7
            r5.offsetLeftAndRight(r8)
            goto L_0x03e2
        L_0x03de:
            int r8 = r8 - r7
            r5.offsetTopAndBottom(r8)
        L_0x03e2:
            int r1 = r1 + 1
            goto L_0x039a
        L_0x03e5:
            int r1 = r11.getChildCount()
            if (r1 <= 0) goto L_0x03fc
            boolean r1 = r11.f4378j
            if (r1 == 0) goto L_0x03f6
            r11.mo4956p(r12, r13, r3)
            r11.mo4957q(r12, r13, r4)
            goto L_0x03fc
        L_0x03f6:
            r11.mo4957q(r12, r13, r3)
            r11.mo4956p(r12, r13, r4)
        L_0x03fc:
            if (r14 == 0) goto L_0x0423
            boolean r14 = r13.f4355g
            if (r14 != 0) goto L_0x0423
            int r14 = r11.f4383o
            if (r14 == 0) goto L_0x0414
            int r14 = r11.getChildCount()
            if (r14 <= 0) goto L_0x0414
            android.view.View r14 = r11.mo4965w()
            if (r14 == 0) goto L_0x0414
            r14 = 1
            goto L_0x0415
        L_0x0414:
            r14 = 0
        L_0x0415:
            if (r14 == 0) goto L_0x0423
            androidx.recyclerview.widget.StaggeredGridLayoutManager$a r14 = r11.f4391w
            r11.removeCallbacks(r14)
            boolean r14 = r11.mo4952l()
            if (r14 == 0) goto L_0x0423
            goto L_0x0424
        L_0x0423:
            r3 = 0
        L_0x0424:
            boolean r14 = r13.f4355g
            if (r14 == 0) goto L_0x042d
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f4388t
            r14.mo4984a()
        L_0x042d:
            boolean r14 = r0.f4412c
            r11.f4384p = r14
            boolean r14 = r11.isLayoutRTL()
            r11.f4385q = r14
            if (r3 == 0) goto L_0x0441
            androidx.recyclerview.widget.StaggeredGridLayoutManager$b r14 = r11.f4388t
            r14.mo4984a()
            r11.mo4967y(r12, r13, r4)
        L_0x0441:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.mo4967y(androidx.recyclerview.widget.RecyclerView$s, androidx.recyclerview.widget.RecyclerView$x, boolean):void");
    }

    /* renamed from: z */
    public final boolean mo4968z(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.f4374f == 0) {
            if (i == -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 != this.f4378j) {
                return true;
            }
            return false;
        }
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f4378j) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 == isLayoutRTL()) {
            return true;
        }
        return false;
    }

    public final RecyclerView.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    public static class LazySpanLookup {

        /* renamed from: a */
        public int[] f4393a;

        /* renamed from: b */
        public List<FullSpanItem> f4394b;

        /* renamed from: a */
        public final void mo4969a() {
            int[] iArr = this.f4393a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4394b = null;
        }

        /* renamed from: b */
        public final void mo4970b(int i) {
            int[] iArr = this.f4393a;
            if (iArr == null) {
                int[] iArr2 = new int[(Math.max(i, 10) + 1)];
                this.f4393a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i >= iArr.length) {
                int length = iArr.length;
                while (length <= i) {
                    length *= 2;
                }
                int[] iArr3 = new int[length];
                this.f4393a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4393a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0061  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x006b  */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo4971c(int r6) {
            /*
                r5 = this;
                int[] r0 = r5.f4393a
                r1 = -1
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                int r0 = r0.length
                if (r6 < r0) goto L_0x000a
                return r1
            L_0x000a:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f4394b
                if (r0 != 0) goto L_0x000f
                goto L_0x005e
            L_0x000f:
                r2 = 0
                if (r0 != 0) goto L_0x0013
                goto L_0x002b
            L_0x0013:
                int r0 = r0.size()
                int r0 = r0 + r1
            L_0x0018:
                if (r0 < 0) goto L_0x002b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f4394b
                java.lang.Object r3 = r3.get(r0)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r4 = r3.f4395b
                if (r4 != r6) goto L_0x0028
                r2 = r3
                goto L_0x002b
            L_0x0028:
                int r0 = r0 + -1
                goto L_0x0018
            L_0x002b:
                if (r2 == 0) goto L_0x0032
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f4394b
                r0.remove(r2)
            L_0x0032:
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f4394b
                int r0 = r0.size()
                r2 = 0
            L_0x0039:
                if (r2 >= r0) goto L_0x004b
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f4394b
                java.lang.Object r3 = r3.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r3
                int r3 = r3.f4395b
                if (r3 < r6) goto L_0x0048
                goto L_0x004c
            L_0x0048:
                int r2 = r2 + 1
                goto L_0x0039
            L_0x004b:
                r2 = -1
            L_0x004c:
                if (r2 == r1) goto L_0x005e
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = r5.f4394b
                java.lang.Object r0 = r0.get(r2)
                androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem) r0
                java.util.List<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r3 = r5.f4394b
                r3.remove(r2)
                int r0 = r0.f4395b
                goto L_0x005f
            L_0x005e:
                r0 = -1
            L_0x005f:
                if (r0 != r1) goto L_0x006b
                int[] r0 = r5.f4393a
                int r2 = r0.length
                java.util.Arrays.fill(r0, r6, r2, r1)
                int[] r6 = r5.f4393a
                int r6 = r6.length
                return r6
            L_0x006b:
                int r0 = r0 + 1
                int[] r2 = r5.f4393a
                int r2 = r2.length
                int r0 = java.lang.Math.min(r0, r2)
                int[] r2 = r5.f4393a
                java.util.Arrays.fill(r2, r6, r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.LazySpanLookup.mo4971c(int):int");
        }

        /* renamed from: d */
        public final void mo4972d(int i, int i2) {
            int[] iArr = this.f4393a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4970b(i3);
                int[] iArr2 = this.f4393a;
                System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
                Arrays.fill(this.f4393a, i, i3, -1);
                List<FullSpanItem> list = this.f4394b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f4394b.get(size);
                        int i4 = fullSpanItem.f4395b;
                        if (i4 >= i) {
                            fullSpanItem.f4395b = i4 + i2;
                        }
                    }
                }
            }
        }

        /* renamed from: e */
        public final void mo4973e(int i, int i2) {
            int[] iArr = this.f4393a;
            if (iArr != null && i < iArr.length) {
                int i3 = i + i2;
                mo4970b(i3);
                int[] iArr2 = this.f4393a;
                System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
                int[] iArr3 = this.f4393a;
                Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
                List<FullSpanItem> list = this.f4394b;
                if (list != null) {
                    for (int size = list.size() - 1; size >= 0; size--) {
                        FullSpanItem fullSpanItem = this.f4394b.get(size);
                        int i4 = fullSpanItem.f4395b;
                        if (i4 >= i) {
                            if (i4 < i3) {
                                this.f4394b.remove(size);
                            } else {
                                fullSpanItem.f4395b = i4 - i2;
                            }
                        }
                    }
                }
            }
        }

        @SuppressLint({"BanParcelableUsage"})
        public static class FullSpanItem implements Parcelable {
            public static final Parcelable.Creator<FullSpanItem> CREATOR = new C1155a();

            /* renamed from: b */
            public int f4395b;

            /* renamed from: c */
            public int f4396c;

            /* renamed from: d */
            public int[] f4397d;

            /* renamed from: e */
            public boolean f4398e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem$a */
            public class C1155a implements Parcelable.Creator<FullSpanItem> {
                public final Object createFromParcel(Parcel parcel) {
                    return new FullSpanItem(parcel);
                }

                public final Object[] newArray(int i) {
                    return new FullSpanItem[i];
                }
            }

            public FullSpanItem(Parcel parcel) {
                this.f4395b = parcel.readInt();
                this.f4396c = parcel.readInt();
                this.f4398e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4397d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            public final int describeContents() {
                return 0;
            }

            public final String toString() {
                StringBuilder k = C13555b.m33972k("FullSpanItem{mPosition=");
                k.append(this.f4395b);
                k.append(", mGapDir=");
                k.append(this.f4396c);
                k.append(", mHasUnwantedGapAfter=");
                k.append(this.f4398e);
                k.append(", mGapPerSpan=");
                k.append(Arrays.toString(this.f4397d));
                k.append('}');
                return k.toString();
            }

            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f4395b);
                parcel.writeInt(this.f4396c);
                parcel.writeInt(this.f4398e ? 1 : 0);
                int[] iArr = this.f4397d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4397d);
            }

            public FullSpanItem() {
            }
        }
    }
}
