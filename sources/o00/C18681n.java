package o00;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.C15780a;

/* renamed from: o00.n */
public final class C18681n extends RecyclerView.C1133l {

    /* renamed from: b */
    public final SparseArray<Drawable> f47558b;

    /* renamed from: c */
    public final boolean f47559c;

    public C18681n(SparseArray<Drawable> sparseArray, boolean z) {
        this.f47558b = sparseArray;
        this.f47559c = z;
    }

    /* renamed from: e */
    public final Drawable mo51056e(RecyclerView recyclerView, View view) {
        return this.f47558b.get(recyclerView.mo4554J(view).getItemViewType());
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        boolean z;
        Drawable e;
        int i;
        if (this.f47559c) {
            z = true;
        } else {
            z = !C18674j.m45653a(recyclerView, view);
        }
        if (!z || (e = mo51056e(recyclerView, view)) == null) {
            return;
        }
        if (!C18674j.m45654b(recyclerView)) {
            boolean z2 = !C15780a.m40268a(recyclerView.getContext());
            int intrinsicWidth = e.getIntrinsicWidth();
            if (z2) {
                i = 0;
            } else {
                i = intrinsicWidth;
            }
            if (!z2) {
                intrinsicWidth = 0;
            }
            rect.set(i, 0, intrinsicWidth, 0);
            return;
        }
        rect.set(0, 0, 0, e.getIntrinsicHeight());
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        boolean z;
        boolean z2;
        int i = 0;
        if (!C18674j.m45654b(recyclerView)) {
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (this.f47559c) {
                    z2 = true;
                } else {
                    z2 = !C18674j.m45653a(recyclerView, childAt);
                }
                if (z2) {
                    Drawable e = mo51056e(recyclerView, childAt);
                    if (e != null) {
                        int right = childAt.getRight() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).rightMargin;
                        e.setBounds(right, paddingTop, e.getIntrinsicHeight() + right, height);
                        e.draw(canvas);
                    }
                    i++;
                } else {
                    return;
                }
            }
            return;
        }
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            if (this.f47559c) {
                z = true;
            } else {
                z = !C18674j.m45653a(recyclerView, childAt2);
            }
            if (z) {
                Drawable e2 = mo51056e(recyclerView, childAt2);
                if (e2 != null) {
                    int bottom = childAt2.getBottom() + ((RecyclerView.LayoutParams) childAt2.getLayoutParams()).bottomMargin;
                    e2.setBounds(paddingLeft, bottom, width, e2.getIntrinsicHeight() + bottom);
                    e2.draw(canvas);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C18681n(android.content.Context r6, android.util.SparseIntArray r7, boolean r8) {
        /*
            r5 = this;
            int r0 = r7.size()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>(r0)
            r2 = 0
        L_0x000a:
            if (r2 >= r0) goto L_0x001e
            int r3 = r7.keyAt(r2)
            int r4 = r7.valueAt(r2)
            android.graphics.drawable.Drawable r4 = k00.C17988b.m44611b(r4, r6)
            r1.append(r3, r4)
            int r2 = r2 + 1
            goto L_0x000a
        L_0x001e:
            r5.<init>(r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.C18681n.<init>(android.content.Context, android.util.SparseIntArray, boolean):void");
    }
}
