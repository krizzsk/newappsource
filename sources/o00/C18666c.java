package o00;

import android.graphics.Canvas;
import androidx.recyclerview.widget.RecyclerView;
import i00.C17525d;

/* renamed from: o00.c */
public final class C18666c extends RecyclerView.C1133l {

    /* renamed from: b */
    public final C17525d f47541b;

    public C18666c(C17525d dVar) {
        this.f47541b = dVar;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        boolean z;
        int i;
        C17525d dVar = this.f47541b;
        if (dVar.f45111a != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            dVar.mo49976b(canvas, recyclerView);
            int childCount = recyclerView.getChildCount() - 1;
            if (childCount >= 0) {
                i = recyclerView.getLayoutManager().getDecoratedBottom(recyclerView.getChildAt(childCount));
            } else {
                i = recyclerView.getPaddingTop();
            }
            dVar.mo49975a(canvas, recyclerView, 0, i, recyclerView.getWidth(), recyclerView.getHeight() - recyclerView.getPaddingBottom());
        }
    }
}
