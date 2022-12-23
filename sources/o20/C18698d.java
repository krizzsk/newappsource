package o20;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.moovit.map.C16255c;
import com.moovit.map.MapFragment;

/* renamed from: o20.d */
public final /* synthetic */ class C18698d implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ C16255c f47600b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f47601c;

    public /* synthetic */ C18698d(C16255c cVar, ImageView imageView) {
        this.f47600b = cVar;
        this.f47601c = imageView;
    }

    public final void onGlobalLayout() {
        C16255c cVar = this.f47600b;
        this.f47601c.getGlobalVisibleRect(cVar.f42470i);
        int i = cVar.f42470i.top;
        C18704j jVar = (C18704j) cVar.mo46751J1();
        if (jVar != null) {
            MapFragment X = jVar.mo50993X();
            if (X.getView() != null) {
                X.getView().getGlobalVisibleRect(cVar.f42470i);
                int i2 = cVar.f42470i.bottom - i;
                if (cVar.f42469h == null) {
                    Rect rect = new Rect();
                    rect.set(X.f42369n0);
                    cVar.f42469h = rect;
                }
                Rect rect2 = cVar.f42469h;
                X.mo48645n3(rect2.left, rect2.top, rect2.right, i2);
            }
        }
    }
}
