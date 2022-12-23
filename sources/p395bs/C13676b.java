package p395bs;

import android.view.MotionEvent;
import android.view.View;
import com.moovit.app.editing.entity.AbstractEditEntityActivity;

/* renamed from: bs.b */
public final class C13676b implements View.OnTouchListener {

    /* renamed from: b */
    public final /* synthetic */ AbstractEditEntityActivity f33709b;

    public C13676b(AbstractEditEntityActivity abstractEditEntityActivity) {
        this.f33709b = abstractEditEntityActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f33709b.f37961m0.getVisibility() == 0) {
            return true;
        }
        return false;
    }
}
