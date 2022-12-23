package androidx.viewpager2.widget;

import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: androidx.viewpager2.widget.c */
public final class C1372c extends ViewPager2.C1362g {

    /* renamed from: a */
    public final ArrayList f5104a = new ArrayList(3);

    /* renamed from: a */
    public final void mo5603a(int i) {
        try {
            Iterator it = this.f5104a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.C1362g) it.next()).mo5603a(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    /* renamed from: b */
    public final void mo5638b(int i, float f, int i2) {
        try {
            Iterator it = this.f5104a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.C1362g) it.next()).mo5638b(i, f, i2);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }

    /* renamed from: c */
    public final void mo5604c(int i) {
        try {
            Iterator it = this.f5104a.iterator();
            while (it.hasNext()) {
                ((ViewPager2.C1362g) it.next()).mo5604c(i);
            }
        } catch (ConcurrentModificationException e) {
            throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e);
        }
    }
}
