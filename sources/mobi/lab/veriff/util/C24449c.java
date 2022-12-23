package mobi.lab.veriff.util;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: mobi.lab.veriff.util.c */
public class C24449c extends RecyclerView.C1133l {

    /* renamed from: a */
    private Drawable f61886a;

    public C24449c(Drawable drawable) {
        this.f61886a = drawable;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f61886a.setBounds(paddingLeft, bottom, width, this.f61886a.getIntrinsicHeight() + bottom);
            this.f61886a.draw(canvas);
        }
    }
}
