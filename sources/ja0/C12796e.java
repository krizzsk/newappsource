package ja0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.tranzmate.R;

/* renamed from: ja0.e */
public final class C12796e extends RecyclerView.C1133l {

    /* renamed from: b */
    public final int f31621b = 0;

    /* renamed from: c */
    public final int f31622c;

    /* renamed from: d */
    public final int f31623d;

    /* renamed from: e */
    public final int f31624e;

    /* renamed from: f */
    public final Paint f31625f;

    /* renamed from: g */
    public final Paint f31626g;

    /* renamed from: h */
    public final Paint f31627h;

    /* renamed from: i */
    public final int f31628i;

    /* renamed from: j */
    public final float f31629j;

    /* renamed from: k */
    public int f31630k;

    public C12796e(Context context, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f31630k = i;
        this.f31622c = i2;
        this.f31623d = i3;
        this.f31624e = 0;
        Paint paint = new Paint(1);
        this.f31625f = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i5);
        float f = (float) i4;
        paint.setStrokeWidth(f);
        Paint paint2 = new Paint(1);
        this.f31626g = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(i6);
        paint2.setStrokeWidth(f);
        Paint paint3 = new Paint(1);
        this.f31627h = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(i7);
        this.f31628i = R.id.item;
        this.f31629j = (float) UiUtils.m40249h(context.getResources(), 1.0f);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        recyclerView.getClass();
        if (RecyclerView.m3000I(view) >= this.f31621b) {
            if (C15780a.m40269b(recyclerView)) {
                rect.set(this.f31624e, 0, this.f31622c, 0);
            } else {
                rect.set(this.f31622c, 0, this.f31624e, 0);
            }
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1152x xVar) {
        int i;
        int i2;
        Canvas canvas2 = canvas;
        RecyclerView recyclerView2 = recyclerView;
        RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            boolean b = C15780a.m40269b(recyclerView);
            int i3 = this.f31622c / 2;
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
                int i6 = i;
                if (i6 >= this.f31621b) {
                    int top = childAt.getTop();
                    int i7 = this.f31628i;
                    if (i7 == 0) {
                        i2 = childAt.getHeight() / 2;
                    } else {
                        View findViewById = childAt.findViewById(i7);
                        if (findViewById == null || findViewById == childAt) {
                            i2 = childAt.getHeight() / 2;
                        } else {
                            i2 = (findViewById.getHeight() / 2) + findViewById.getTop();
                        }
                    }
                    int i8 = top + i2;
                    if (i6 == this.f31621b) {
                        if (i6 == this.f31630k) {
                            float f = (float) i4;
                            canvas.drawLine(f, (float) i8, f, (float) childAt.getBottom(), this.f31626g);
                        } else {
                            float f2 = (float) i4;
                            canvas.drawLine(f2, (float) i8, f2, (float) childAt.getBottom(), this.f31625f);
                        }
                    } else if (i6 != itemCount - 1) {
                        int i9 = this.f31630k;
                        if (i6 == i9) {
                            float f3 = (float) i4;
                            float f4 = (float) i8;
                            float f5 = f3;
                            canvas.drawLine(f3, (float) childAt.getTop(), f3, f4, this.f31625f);
                            canvas.drawLine(f5, f4, f5, (float) childAt.getBottom(), this.f31626g);
                        } else if (i6 > i9) {
                            float f6 = (float) i4;
                            canvas.drawLine(f6, (float) childAt.getTop(), f6, (float) childAt.getBottom(), this.f31626g);
                        } else {
                            float f7 = (float) i4;
                            canvas.drawLine(f7, (float) childAt.getTop(), f7, (float) childAt.getBottom(), this.f31625f);
                        }
                    } else if (i6 == this.f31630k) {
                        float f8 = (float) i4;
                        canvas.drawLine(f8, (float) childAt.getTop(), f8, (float) i8, this.f31625f);
                    } else {
                        float f9 = (float) i4;
                        canvas.drawLine(f9, (float) childAt.getTop(), f9, (float) i8, this.f31626g);
                    }
                    int i11 = this.f31630k;
                    if (i6 == i11) {
                        canvas2.drawCircle((float) i4, (float) i8, (float) this.f31623d, this.f31626g);
                    } else if (i6 > i11) {
                        float f11 = (float) i4;
                        float f12 = (float) i8;
                        canvas2.drawCircle(f11, f12, (float) this.f31623d, this.f31626g);
                        canvas2.drawCircle(f11, f12, ((float) this.f31623d) - this.f31629j, this.f31627h);
                    } else {
                        float f13 = (float) i4;
                        float f14 = (float) i8;
                        canvas2.drawCircle(f13, f14, (float) this.f31623d, this.f31625f);
                        canvas2.drawCircle(f13, f14, ((float) this.f31623d) - this.f31629j, this.f31627h);
                    }
                }
            }
        }
    }
}
