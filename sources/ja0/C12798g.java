package ja0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.Color;
import com.moovit.commons.utils.UiUtils;
import com.moovit.transit.C7843b;
import com.moovit.transit.TransitLineGroup;
import p824tp.C19738p;

/* renamed from: ja0.g */
public final class C12798g extends RecyclerView.C1133l {

    /* renamed from: b */
    public final int f31632b;

    /* renamed from: c */
    public final int f31633c;

    /* renamed from: d */
    public final int f31634d;

    /* renamed from: e */
    public final int f31635e = 0;

    /* renamed from: f */
    public final Paint f31636f;

    /* renamed from: g */
    public final Paint f31637g;

    /* renamed from: h */
    public final int f31638h;

    /* renamed from: i */
    public final float f31639i;

    public C12798g(Context context, int i, int i2, int i3, int i4, int i5, int i6) {
        this.f31632b = i;
        this.f31633c = i2;
        this.f31634d = i3;
        Paint paint = new Paint(1);
        this.f31636f = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i5);
        paint.setStrokeWidth((float) i4);
        Paint paint2 = new Paint(1);
        this.f31637g = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i6);
        this.f31638h = 0;
        this.f31639i = (float) UiUtils.m40249h(context.getResources(), 1.0f);
    }

    /* renamed from: e */
    public static C12798g m32602e(int i, Context context, TransitLineGroup transitLineGroup) {
        Color a = C7843b.m17874a(context, transitLineGroup);
        return new C12798g(context, i, context.getResources().getDimensionPixelSize(C19738p.line_group_decorator_start_offset), context.getResources().getDimensionPixelSize(C19738p.line_group_decorator_radius), context.getResources().getDimensionPixelSize(C19738p.line_group_decorator_stroke_size), a.f41007b, C7843b.m17875b(context, a).f41007b);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        recyclerView.getClass();
        if (RecyclerView.m3000I(view) >= this.f31632b) {
            if (C15780a.m40269b(recyclerView)) {
                rect.set(this.f31635e, 0, this.f31633c, 0);
            } else {
                rect.set(this.f31633c, 0, this.f31635e, 0);
            }
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        View findViewById;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            boolean b = C15780a.m40269b(recyclerView);
            int i3 = this.f31633c / 2;
            if (b) {
                i3 = recyclerView.getWidth() - i3;
            }
            int i4 = i3;
            int childCount = recyclerView.getChildCount();
            int itemCount = layoutManager.getItemCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = recyclerView2.getChildAt(i5);
                RecyclerView.C1119a0 J = recyclerView2.mo4554J(childAt);
                if (J.getOldPosition() == -1) {
                    i = J.getAdapterPosition();
                } else {
                    i = J.getOldPosition();
                }
                if (i >= this.f31632b) {
                    int height = (childAt.getHeight() / 2) + childAt.getTop();
                    int i6 = this.f31638h;
                    if (i6 == 0 || (findViewById = childAt.findViewById(i6)) == null) {
                        i2 = 0;
                    } else {
                        i2 = findViewById.getHeight() / 2;
                    }
                    int i7 = height - i2;
                    if (i == this.f31632b) {
                        float f = (float) i4;
                        canvas.drawLine(f, (float) i7, f, (float) childAt.getBottom(), this.f31636f);
                    } else if (i == itemCount - 1) {
                        float f2 = (float) i4;
                        canvas.drawLine(f2, (float) childAt.getTop(), f2, (float) i7, this.f31636f);
                    } else {
                        float f3 = (float) i4;
                        canvas.drawLine(f3, (float) childAt.getTop(), f3, (float) childAt.getBottom(), this.f31636f);
                    }
                    if (childAt.isActivated()) {
                        canvas2.drawCircle((float) i4, (float) i7, (float) this.f31634d, this.f31636f);
                    } else {
                        float f4 = (float) i4;
                        float f5 = (float) i7;
                        canvas2.drawCircle(f4, f5, (float) this.f31634d, this.f31636f);
                        canvas2.drawCircle(f4, f5, ((float) this.f31634d) - this.f31639i, this.f31637g);
                    }
                }
            }
        }
    }
}
