package p399bw;

import android.view.KeyEvent;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import k60.C18002c;

/* renamed from: bw.a */
public final /* synthetic */ class C13696a implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f33755b;

    /* renamed from: c */
    public final /* synthetic */ Fragment f33756c;

    public /* synthetic */ C13696a(Fragment fragment, int i) {
        this.f33755b = i;
        this.f33756c = fragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f33755b) {
            case 0:
                C13697b bVar = (C13697b) this.f33756c;
                int i2 = C13697b.f33757n;
                if (6 == i) {
                    bVar.mo40565S1();
                } else {
                    bVar.getClass();
                }
                return false;
            default:
                C18002c cVar = (C18002c) this.f33756c;
                int i3 = C18002c.f46095y;
                if (i == 4) {
                    cVar.mo50510y2();
                } else {
                    cVar.getClass();
                }
                return false;
        }
    }
}
