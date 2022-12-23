package aa0;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;

/* renamed from: aa0.g */
public final class C7535g extends RecyclerView.C1142q {
    /* renamed from: a */
    public final void mo4913a(int i, RecyclerView recyclerView) {
        if (i == 2) {
            ArrayList arrayList = recyclerView.f4292x0;
            if (arrayList != null) {
                arrayList.remove(this);
            }
            BottomSheetBehavior.m34710e(recyclerView).setState(4);
        }
    }
}
