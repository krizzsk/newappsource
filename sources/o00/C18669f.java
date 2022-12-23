package o00;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import com.usebutton.sdk.internal.BaseCardActivity;
import k00.C17988b;
import k00.C17992e;

/* renamed from: o00.f */
public final class C18669f extends RecyclerView.C1133l {

    /* renamed from: b */
    public final Drawable f47546b;

    public C18669f(Context context, int i) {
        this(C17988b.m44611b(i, context));
    }

    /* renamed from: e */
    public static C18669f m45651e(int i) {
        return new C18669f(new C17992e(i, i));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        int i3;
        if (C18674j.m45653a(recyclerView, view)) {
            boolean b = C15780a.m40269b(recyclerView);
            boolean b2 = C18674j.m45654b(recyclerView);
            if (b2 || !b) {
                i = 0;
            } else {
                i = this.f47546b.getIntrinsicWidth();
            }
            if (b2 || b) {
                i2 = 0;
            } else {
                i2 = this.f47546b.getIntrinsicWidth();
            }
            if (b2) {
                i3 = this.f47546b.getIntrinsicHeight();
            } else {
                i3 = 0;
            }
            rect.set(i, 0, i2, i3);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        int childCount = recyclerView.getChildCount();
        if (childCount != 0) {
            View childAt = recyclerView.getChildAt(childCount - 1);
            if (C18674j.m45653a(recyclerView, childAt)) {
                if (C18674j.m45654b(recyclerView)) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                    this.f47546b.setBounds(paddingLeft, bottom, width, this.f47546b.getIntrinsicHeight() + bottom);
                    this.f47546b.draw(canvas);
                    return;
                }
                int paddingTop = recyclerView.getPaddingTop();
                int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                boolean b = C15780a.m40269b(recyclerView);
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
                if (b) {
                    i2 = childAt.getLeft() + layoutParams.leftMargin;
                    i = i2 - this.f47546b.getIntrinsicWidth();
                } else {
                    i = layoutParams.rightMargin + childAt.getRight();
                    i2 = this.f47546b.getIntrinsicWidth() + i;
                }
                this.f47546b.setBounds(i, paddingTop, i2, height);
                this.f47546b.draw(canvas);
            }
        }
    }

    public C18669f(Drawable drawable) {
        C21100e.m49373x(drawable, BaseCardActivity.EXTRA_FOOTER);
        this.f47546b = drawable;
    }
}
