package p541ho;

import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ho.a */
public final class C17464a extends RecyclerView.C1133l {

    /* renamed from: b */
    public ColorDrawable f44968b;

    /* renamed from: c */
    public int f44969c;

    /* renamed from: d */
    public int f44970d;

    /* renamed from: e */
    public int f44971e;

    public C17464a(int i, int i2, int i3, int i4) {
        this.f44968b = new ColorDrawable(i);
        this.f44969c = i2;
        this.f44970d = i3;
        this.f44971e = i4;
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i = this.f44970d;
        int width = recyclerView.getWidth() - this.f44971e;
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f44968b.setBounds(i, bottom, width, this.f44969c + bottom);
            this.f44968b.draw(canvas);
        }
    }
}
