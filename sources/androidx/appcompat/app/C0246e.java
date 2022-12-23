package androidx.appcompat.app;

import android.view.View;
import android.widget.AbsListView;

/* renamed from: androidx.appcompat.app.e */
public final class C0246e implements AbsListView.OnScrollListener {

    /* renamed from: a */
    public final /* synthetic */ View f727a;

    /* renamed from: b */
    public final /* synthetic */ View f728b;

    public C0246e(View view, View view2) {
        this.f727a = view;
        this.f728b = view2;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AlertController.m381c(absListView, this.f727a, this.f728b);
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
