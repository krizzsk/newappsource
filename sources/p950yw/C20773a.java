package p950yw;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: yw.a */
public final /* synthetic */ class C20773a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b */
    public final /* synthetic */ C20774b f52415b;

    public /* synthetic */ C20773a(C20774b bVar) {
        this.f52415b = bVar;
    }

    public final void onGlobalLayout() {
        TextView textView = this.f52415b.f52417b;
        textView.setTranslationY((float) textView.getMeasuredHeight());
    }
}
