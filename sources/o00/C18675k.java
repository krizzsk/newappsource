package o00;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import k00.C17988b;

/* renamed from: o00.k */
public final class C18675k extends RecyclerView.C1133l {

    /* renamed from: b */
    public final Drawable f47551b;

    public C18675k(Context context, int i) {
        Drawable b = C17988b.m44611b(i, context);
        C21100e.m49373x(b, "shadow");
        this.f47551b = b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000c, code lost:
        r9 = r8.getChildAt(0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onDrawOver(android.graphics.Canvas r7, androidx.recyclerview.widget.RecyclerView r8, androidx.recyclerview.widget.RecyclerView.C1152x r9) {
        /*
            r6 = this;
            super.onDrawOver(r7, r8, r9)
            android.graphics.drawable.Drawable r1 = r6.f47551b
            int r9 = r8.getChildCount()
            if (r9 != 0) goto L_0x000c
            goto L_0x004f
        L_0x000c:
            r9 = 0
            android.view.View r9 = r8.getChildAt(r9)
            int r0 = androidx.recyclerview.widget.RecyclerView.m3000I(r9)
            if (r0 >= 0) goto L_0x0018
            goto L_0x004f
        L_0x0018:
            if (r0 != 0) goto L_0x0029
            int r0 = r8.getPaddingTop()
            androidx.recyclerview.widget.RecyclerView$m r2 = r8.getLayoutManager()
            int r9 = r2.getDecoratedTop(r9)
            int r0 = r0 - r9
            r5 = r0
            goto L_0x002f
        L_0x0029:
            r9 = 2147483647(0x7fffffff, float:NaN)
            r5 = 2147483647(0x7fffffff, float:NaN)
        L_0x002f:
            if (r5 != 0) goto L_0x0032
            goto L_0x004f
        L_0x0032:
            int r2 = r8.getPaddingLeft()
            int r9 = r8.getPaddingRight()
            int r0 = r8.getPaddingTop()
            int r3 = r8.getScrollY()
            int r4 = r3 + r0
            int r8 = r8.getWidth()
            int r8 = r8 - r2
            int r3 = r8 - r9
            r0 = r7
            i00.C17534j.m43664a(r0, r1, r2, r3, r4, r5)
        L_0x004f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: o00.C18675k.onDrawOver(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, androidx.recyclerview.widget.RecyclerView$x):void");
    }
}
