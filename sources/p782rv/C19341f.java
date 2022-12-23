package p782rv;

import a60.C13390a;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import k60.C18007e;

/* renamed from: rv.f */
public final /* synthetic */ class C19341f implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f49210b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f49211c;

    public /* synthetic */ C19341f(Fragment fragment, int i) {
        this.f49210b = i;
        this.f49211c = fragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f49210b) {
            case 0:
                C19342g gVar = (C19342g) this.f49211c;
                int i2 = C19342g.f49212A;
                if (i == 4) {
                    gVar.mo51752r2();
                } else {
                    gVar.getClass();
                }
                return false;
            case 1:
                C13390a aVar = (C13390a) this.f49211c;
                int i3 = C13390a.f33229p;
                if (i == 6) {
                    aVar.mo40266S1();
                } else {
                    aVar.getClass();
                }
                return false;
            default:
                C18007e eVar = (C18007e) this.f49211c;
                int i4 = C18007e.f46109A;
                if (i == 4) {
                    eVar.mo50511y2();
                } else {
                    eVar.getClass();
                }
                return false;
        }
    }
}
