package o00;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import k00.C17988b;
import k00.C17992e;

/* renamed from: o00.b */
public final class C18665b extends RecyclerView.C1133l {

    /* renamed from: b */
    public final Drawable f47540b;

    public C18665b(Context context, int i) {
        this(C17988b.m44611b(i, context));
    }

    /* renamed from: e */
    public static C18665b m45644e(int i) {
        return new C18665b(new C17992e(i, i));
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        if (!C18674j.m45653a(recyclerView, view)) {
            RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                boolean z = true;
                if (((LinearLayoutManager) layoutManager).getOrientation() != 1) {
                    z = false;
                }
                if (z) {
                    rect.set(0, 0, 0, this.f47540b.getIntrinsicHeight());
                } else if (C15780a.m40269b(recyclerView)) {
                    rect.set(this.f47540b.getIntrinsicWidth(), 0, 0, 0);
                } else {
                    rect.set(0, 0, this.f47540b.getIntrinsicWidth(), 0);
                }
            } else {
                throw new IllegalStateException("divider decorator can be added only with LinearLayoutManager!");
            }
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            int i3 = 0;
            boolean z = true;
            if (((LinearLayoutManager) layoutManager).getOrientation() != 1) {
                z = false;
            }
            if (z) {
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                while (i3 < childCount) {
                    View childAt = recyclerView.getChildAt(i3);
                    if (!C18674j.m45653a(recyclerView, childAt)) {
                        int bottom = childAt.getBottom() + ((RecyclerView.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                        this.f47540b.setBounds(paddingLeft, bottom, width, this.f47540b.getIntrinsicHeight() + bottom);
                        this.f47540b.draw(canvas);
                    }
                    i3++;
                }
                return;
            }
            int paddingTop = recyclerView.getPaddingTop();
            int height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            int childCount2 = recyclerView.getChildCount();
            while (i3 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i3);
                if (!C18674j.m45653a(recyclerView, childAt2)) {
                    boolean b = C15780a.m40269b(recyclerView);
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt2.getLayoutParams();
                    if (b) {
                        i2 = childAt2.getLeft() + layoutParams.leftMargin;
                        i = i2 - this.f47540b.getIntrinsicWidth();
                    } else {
                        i = layoutParams.rightMargin + childAt2.getRight();
                        i2 = this.f47540b.getIntrinsicWidth() + i;
                    }
                    this.f47540b.setBounds(i, paddingTop, i2, height);
                    this.f47540b.draw(canvas);
                }
                i3++;
            }
            return;
        }
        throw new IllegalStateException("divider decorator can be added only with LinearLayoutManager!");
    }

    public C18665b(Drawable drawable) {
        C21100e.m49373x(drawable, "divider");
        this.f47540b = drawable;
    }
}
