package p453dw;

import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.moovit.app.stopdetail.StopDetailActivity;

/* renamed from: dw.i */
public final class C16733i extends RecyclerView.C1142q {

    /* renamed from: a */
    public final /* synthetic */ StopDetailActivity f43581a;

    public C16733i(StopDetailActivity stopDetailActivity) {
        this.f43581a = stopDetailActivity;
    }

    /* renamed from: a */
    public final void mo4913a(int i, RecyclerView recyclerView) {
        SearchView searchView = this.f43581a.f39664r0;
        if (searchView != null && i == 1) {
            searchView.clearFocus();
        }
    }
}
