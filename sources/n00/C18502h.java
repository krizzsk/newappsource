package n00;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.moovit.commons.utils.C15780a;
import kotlin.collections.C23816b;
import mf0.C24362h;
import p622kz.C18162d;

/* renamed from: n00.h */
public final class C18502h extends RecyclerView.C1133l implements ViewPager2.C1366i {

    /* renamed from: b */
    public final int f47114b;

    /* renamed from: c */
    public final int f47115c;

    /* renamed from: d */
    public final int f47116d;

    /* renamed from: e */
    public C18503a f47117e;

    /* renamed from: n00.h$a */
    public static final class C18503a {

        /* renamed from: a */
        public final int f47118a;

        /* renamed from: b */
        public final int[] f47119b;

        /* renamed from: c */
        public final int[] f47120c;

        /* renamed from: d */
        public final int[] f47121d;

        /* renamed from: e */
        public final int[] f47122e;

        /* renamed from: f */
        public final float[] f47123f;

        public C18503a(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            boolean z;
            int i7;
            int i8;
            this.f47118a = i;
            this.f47119b = new int[i];
            this.f47120c = new int[i];
            this.f47121d = new int[i];
            this.f47122e = new int[i];
            this.f47123f = new float[i];
            int i9 = i - 1;
            int i11 = i4 / 2;
            int i12 = i3 + i11;
            int i13 = 0;
            while (i13 < i) {
                boolean z2 = true;
                if (i13 > 0) {
                    z = true;
                } else {
                    z = false;
                }
                z2 = i13 >= i9 ? false : z2;
                int[] iArr = this.f47119b;
                if (!z) {
                    i7 = i2;
                } else if (!z2) {
                    i7 = i12 + i11;
                } else {
                    i7 = i12;
                }
                iArr[i13] = i7;
                int[] iArr2 = this.f47120c;
                if (!z2) {
                    i8 = i2;
                } else if (!z) {
                    i8 = i12 + i11;
                } else {
                    i8 = i12;
                }
                iArr2[i13] = i8;
                i13++;
            }
            int i14 = this.f47118a;
            int i15 = 0;
            while (i15 < i14) {
                int i16 = this.f47119b[i15];
                Integer W0 = C23816b.m58441W0(i15 - 1, this.f47120c);
                if (W0 != null) {
                    i5 = W0.intValue();
                } else {
                    i5 = 0;
                }
                this.f47121d[i15] = (i16 + i5) - i3;
                int i17 = this.f47120c[i15];
                int i18 = i15 + 1;
                Integer W02 = C23816b.m58441W0(i18, this.f47119b);
                if (W02 != null) {
                    i6 = W02.intValue();
                } else {
                    i6 = 0;
                }
                this.f47122e[i15] = (i17 + i6) - i3;
                i15 = i18;
            }
        }
    }

    public C18502h(int i, int i2, int i3) {
        this.f47114b = i;
        this.f47115c = i2;
        this.f47116d = i3;
        this.f47117e = new C18503a(0, i, i2, i3);
    }

    /* renamed from: e */
    public final void mo50923e(float f, int i, View view) {
        int i2;
        int i3;
        boolean z = true;
        if (C15780a.m40269b(view)) {
            i2 = 1;
        } else {
            i2 = -1;
        }
        if (BitmapDescriptorFactory.HUE_RED >= f) {
            z = false;
        }
        if (z) {
            i3 = this.f47117e.f47121d[i];
        } else {
            i3 = this.f47117e.f47122e[i];
        }
        view.setTranslationX(((float) i2) * f * ((float) i3));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        C24362h.m61211f(rect, "outRect");
        C24362h.m61211f(view, "page");
        C24362h.m61211f(recyclerView, "parent");
        C24362h.m61211f(xVar, "state");
        RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            i = layoutManager.getItemCount();
        } else {
            i = 0;
        }
        if (this.f47117e.f47118a != i) {
            this.f47117e = new C18503a(i, this.f47114b, this.f47115c, this.f47116d);
        }
        int I = RecyclerView.m3000I(view);
        view.setTag(C18162d.view_pager_peeking_position, Integer.valueOf(I));
        if (I != -1) {
            if (C15780a.m40269b(recyclerView)) {
                C18503a aVar = this.f47117e;
                rect.left = aVar.f47120c[I];
                rect.right = aVar.f47119b[I];
            } else {
                C18503a aVar2 = this.f47117e;
                rect.left = aVar2.f47119b[I];
                rect.right = aVar2.f47120c[I];
            }
            mo50923e(this.f47117e.f47123f[I], I, view);
        }
    }

    public final void transformPage(View view, float f) {
        Integer num;
        int intValue;
        Object tag = view.getTag(C18162d.view_pager_peeking_position);
        if (tag instanceof Integer) {
            num = (Integer) tag;
        } else {
            num = null;
        }
        if (num != null && (intValue = num.intValue()) != -1) {
            this.f47117e.f47123f[intValue] = f;
            mo50923e(f, intValue, view);
        }
    }
}
