package b60;

import android.view.KeyEvent;
import android.widget.TextView;
import com.moovit.view.p340cc.C7963e;

/* renamed from: b60.a */
public final /* synthetic */ class C13570a implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ C13571b f33522b;

    public /* synthetic */ C13570a(C13571b bVar) {
        this.f33522b = bVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C13571b bVar = this.f33522b;
        if (i != 2) {
            int i2 = C13571b.f33523k;
            bVar.getClass();
            return false;
        } else if (!C7963e.m18150a(bVar.f33525i.getText())) {
            return false;
        } else {
            bVar.mo40453T1();
            return false;
        }
    }
}
