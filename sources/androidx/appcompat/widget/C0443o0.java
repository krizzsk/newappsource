package androidx.appcompat.widget;

import android.view.View;
import android.widget.AdapterView;

/* renamed from: androidx.appcompat.widget.o0 */
public final class C0443o0 implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    public final /* synthetic */ ListPopupWindow f1589b;

    public C0443o0(ListPopupWindow listPopupWindow) {
        this.f1589b = listPopupWindow;
    }

    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        C0427l0 l0Var;
        if (i != -1 && (l0Var = this.f1589b.f1229d) != null) {
            l0Var.setListSelectionHidden(false);
        }
    }

    public final void onNothingSelected(AdapterView<?> adapterView) {
    }
}
