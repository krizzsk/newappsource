package p285v6;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;
import p273u6.C6715f;
import p285v6.C6869d;

/* renamed from: v6.b */
public final class C6866b implements C6869d<Drawable> {

    /* renamed from: a */
    public final int f21222a;

    /* renamed from: b */
    public final boolean f21223b;

    public C6866b(int i, boolean z) {
        this.f21222a = i;
        this.f21223b = z;
    }

    /* renamed from: a */
    public final boolean mo23124a(Object obj, C6869d.C6870a aVar) {
        Drawable drawable = (Drawable) obj;
        C6715f fVar = (C6715f) aVar;
        Drawable drawable2 = ((ImageView) fVar.f20813c).getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.f21223b);
        transitionDrawable.startTransition(this.f21222a);
        ((ImageView) fVar.f20813c).setImageDrawable(transitionDrawable);
        return true;
    }
}
