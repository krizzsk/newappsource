package p782rv;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import p977zz.C20964s0;

/* renamed from: rv.l */
public final /* synthetic */ class C19355l implements View.OnKeyListener {

    /* renamed from: b */
    public final /* synthetic */ C19356m f49246b;

    public /* synthetic */ C19355l(C19356m mVar) {
        this.f49246b = mVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C19356m mVar = this.f49246b;
        int i2 = C19356m.f49247B;
        mVar.getClass();
        EditText editText = (EditText) view;
        if (i != 67 || keyEvent.getAction() != 0 || !C20964s0.m49090h(editText.getText())) {
            return false;
        }
        View focusSearch = editText.focusSearch(17);
        if (focusSearch != null) {
            focusSearch.requestFocus();
        }
        return true;
    }
}
