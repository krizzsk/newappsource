package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.e */
public final class C1374e extends ViewPager2.C1362g {

    /* renamed from: a */
    public final LinearLayoutManager f5108a;

    /* renamed from: b */
    public ViewPager2.C1366i f5109b;

    public C1374e(LinearLayoutManager linearLayoutManager) {
        this.f5108a = linearLayoutManager;
    }

    /* renamed from: a */
    public final void mo5603a(int i) {
    }

    /* renamed from: b */
    public final void mo5638b(int i, float f, int i2) {
        if (this.f5109b != null) {
            float f2 = -f;
            int i3 = 0;
            while (i3 < this.f5108a.getChildCount()) {
                View childAt = this.f5108a.getChildAt(i3);
                if (childAt != null) {
                    this.f5109b.transformPage(childAt, ((float) (this.f5108a.getPosition(childAt) - i)) + f2);
                    i3++;
                } else {
                    throw new IllegalStateException(String.format(Locale.US, "LayoutManager returned a null child at pos %d/%d while transforming pages", new Object[]{Integer.valueOf(i3), Integer.valueOf(this.f5108a.getChildCount())}));
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo5604c(int i) {
    }
}
