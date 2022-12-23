package p782rv;

import android.view.KeyEvent;
import android.widget.TextView;
import com.moovit.C15682c;
import r60.C19229a;

/* renamed from: rv.i */
public final /* synthetic */ class C19350i implements TextView.OnEditorActionListener {

    /* renamed from: b */
    public final /* synthetic */ int f49233b;

    /* renamed from: c */
    public final /* synthetic */ C15682c f49234c;

    public /* synthetic */ C19350i(C15682c cVar, int i) {
        this.f49233b = i;
        this.f49234c = cVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        switch (this.f49233b) {
            case 0:
                C19351j jVar = (C19351j) this.f49234c;
                int i2 = C19351j.f49235u;
                if (i == 4) {
                    jVar.mo51760r2();
                } else {
                    jVar.getClass();
                }
                return false;
            default:
                C19229a aVar = (C19229a) this.f49234c;
                int i3 = C19229a.f48829A;
                if (i == 4) {
                    aVar.mo51648y2();
                } else {
                    aVar.getClass();
                }
                return false;
        }
    }
}
