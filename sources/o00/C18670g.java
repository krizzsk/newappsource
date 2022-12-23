package o00;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.C15780a;
import k00.C17992e;

/* renamed from: o00.g */
public final class C18670g extends RecyclerView.C1133l {

    /* renamed from: b */
    public final Drawable f47547b;

    public C18670g(C17992e eVar) {
        this.f47547b = eVar;
    }

    /* renamed from: e */
    public static C18670g m45652e(int i) {
        return new C18670g(new C17992e(i, i));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        recyclerView.getClass();
        if (RecyclerView.m3000I(view) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            boolean b = C15780a.m40269b(recyclerView);
            boolean b2 = C18674j.m45654b(recyclerView);
            if (b2) {
                i = this.f47547b.getIntrinsicHeight();
            } else {
                i = 0;
            }
            if (b2 || b) {
                i2 = 0;
            } else {
                i2 = this.f47547b.getIntrinsicWidth();
            }
            if (b2 || !b) {
                i3 = 0;
            } else {
                i3 = this.f47547b.getIntrinsicWidth();
            }
            rect.set(i2, i, i3, 0);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        if (recyclerView.getChildCount() != 0) {
            if (C18674j.m45654b(recyclerView)) {
                int paddingTop = recyclerView.getPaddingTop();
                this.f47547b.setBounds(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), this.f47547b.getIntrinsicHeight() + paddingTop);
                this.f47547b.draw(canvas);
                return;
            }
            int paddingTop2 = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            if (C15780a.m40269b(recyclerView)) {
                i2 = recyclerView.getRight() - recyclerView.getPaddingRight();
                i = i2 - this.f47547b.getIntrinsicWidth();
            } else {
                i = recyclerView.getPaddingLeft() + recyclerView.getLeft();
                i2 = this.f47547b.getIntrinsicWidth() + i;
            }
            this.f47547b.setBounds(i, paddingTop2, i2, height);
            this.f47547b.draw(canvas);
        }
    }
}
