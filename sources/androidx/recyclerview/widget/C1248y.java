package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.y */
public final class C1248y extends C1249z {
    public C1248y(RecyclerView.C1134m mVar) {
        super(mVar);
    }

    /* renamed from: b */
    public final int mo5166b(View view) {
        return this.f4699a.getDecoratedBottom(view) + ((RecyclerView.LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    /* renamed from: c */
    public final int mo5167c(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f4699a.getDecoratedMeasuredHeight(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    /* renamed from: d */
    public final int mo5168d(View view) {
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        return this.f4699a.getDecoratedMeasuredWidth(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    /* renamed from: e */
    public final int mo5169e(View view) {
        return this.f4699a.getDecoratedTop(view) - ((RecyclerView.LayoutParams) view.getLayoutParams()).topMargin;
    }

    /* renamed from: f */
    public final int mo5170f() {
        return this.f4699a.getHeight();
    }

    /* renamed from: g */
    public final int mo5171g() {
        return this.f4699a.getHeight() - this.f4699a.getPaddingBottom();
    }

    /* renamed from: h */
    public final int mo5172h() {
        return this.f4699a.getPaddingBottom();
    }

    /* renamed from: i */
    public final int mo5173i() {
        return this.f4699a.getHeightMode();
    }

    /* renamed from: j */
    public final int mo5174j() {
        return this.f4699a.getWidthMode();
    }

    /* renamed from: k */
    public final int mo5175k() {
        return this.f4699a.getPaddingTop();
    }

    /* renamed from: l */
    public final int mo5176l() {
        return (this.f4699a.getHeight() - this.f4699a.getPaddingTop()) - this.f4699a.getPaddingBottom();
    }

    /* renamed from: n */
    public final int mo5177n(View view) {
        this.f4699a.getTransformedBoundingBox(view, true, this.f4701c);
        return this.f4701c.bottom;
    }

    /* renamed from: o */
    public final int mo5178o(View view) {
        this.f4699a.getTransformedBoundingBox(view, true, this.f4701c);
        return this.f4701c.top;
    }

    /* renamed from: p */
    public final void mo5179p(int i) {
        this.f4699a.offsetChildrenVertical(i);
    }
}
