package p451du;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import com.moovit.app.linedetail.p416ui.C15101a;
import com.moovit.design.view.TextPicker;
import com.moovit.map.C16280h;
import com.moovit.map.MapFragment;
import ga0.C12717o;
import o20.C18704j;

/* renamed from: du.f */
public final /* synthetic */ class C16709f implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ int f43516b;

    /* renamed from: c */
    public final /* synthetic */ Object f43517c;

    public /* synthetic */ C16709f(Object obj, int i) {
        this.f43516b = i;
        this.f43517c = obj;
    }

    public final void onGlobalLayout() {
        switch (this.f43516b) {
            case 0:
                int i = C15101a.f38810T;
                ((C15101a) this.f43517c).mo45472z2();
                return;
            case 1:
                TextPicker textPicker = (TextPicker) this.f43517c;
                textPicker.f41391b.setAnimateFirstView(true);
                textPicker.mo47771b();
                return;
            default:
                C12717o oVar = (C12717o) this.f43517c;
                oVar.f31407n.getGlobalVisibleRect(oVar.f31403j);
                int i2 = oVar.f31403j.top;
                C16280h hVar = (C16280h) oVar;
                C18704j jVar = (C18704j) hVar.mo46751J1();
                if (jVar != null) {
                    MapFragment X = jVar.mo50993X();
                    if (X.getView() != null) {
                        X.getView().getGlobalVisibleRect(hVar.f42547t);
                        int i3 = hVar.f42547t.bottom - i2;
                        if (hVar.f42546s == null) {
                            Rect rect = new Rect();
                            rect.set(X.f42369n0);
                            hVar.f42546s = rect;
                        }
                        Rect rect2 = hVar.f42546s;
                        X.mo48645n3(rect2.left, rect2.top, rect2.right, i3);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
