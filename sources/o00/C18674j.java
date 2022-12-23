package o00;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: o00.j */
public final class C18674j {
    /* renamed from: a */
    public static boolean m45653a(RecyclerView recyclerView, View view) {
        RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null || RecyclerView.m3000I(view) != layoutManager.getItemCount() - 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m45654b(RecyclerView recyclerView) {
        RecyclerView.C1134m layoutManager = recyclerView.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("divider decorator can be added only with LinearLayoutManager!");
        } else if (((LinearLayoutManager) layoutManager).getOrientation() == 1) {
            return true;
        } else {
            return false;
        }
    }
}
