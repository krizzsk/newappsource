package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.x */
public final class C1247x extends C1249z {
    public C1247x(RecyclerView.C1134m mVar) {
        super(mVar);
    }

    /* renamed from: b */
    public final int mo5166b(View view) {
        return this.f4699a.getDecoratedRight(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).rightMargin;
    }

    /* renamed from: c */
    public final int mo5167c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f4699a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    /* renamed from: d */
    public final int mo5168d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f4699a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: e */
    public final int mo5169e(View view) {
        return this.f4699a.getDecoratedLeft(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).leftMargin;
    }

    /* renamed from: f */
    public final int mo5170f() {
        return this.f4699a.getWidth();
    }

    /* renamed from: g */
    public final int mo5171g() {
        return this.f4699a.getWidth() - this.f4699a.getPaddingRight();
    }

    /* renamed from: h */
    public final int mo5172h() {
        return this.f4699a.getPaddingRight();
    }

    /* renamed from: i */
    public final int mo5173i() {
        return this.f4699a.getWidthMode();
    }

    /* renamed from: j */
    public final int mo5174j() {
        return this.f4699a.getHeightMode();
    }

    /* renamed from: k */
    public final int mo5175k() {
        return this.f4699a.getPaddingLeft();
    }

    /* renamed from: l */
    public final int mo5176l() {
        return (this.f4699a.getWidth() - this.f4699a.getPaddingLeft()) - this.f4699a.getPaddingRight();
    }

    /* renamed from: n */
    public final int mo5177n(View view) {
        this.f4699a.getTransformedBoundingBox(view, true, this.f4701c);
        return this.f4701c.right;
    }

    /* renamed from: o */
    public final int mo5178o(View view) {
        this.f4699a.getTransformedBoundingBox(view, true, this.f4701c);
        return this.f4701c.left;
    }

    /* renamed from: p */
    public final void mo5179p(int i) {
        this.f4699a.offsetChildrenHorizontal(i);
    }
}
