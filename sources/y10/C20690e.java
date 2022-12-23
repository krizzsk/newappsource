package y10;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import ce0.C21100e;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import p285v6.C6869d;

/* renamed from: y10.e */
public final class C20690e extends C20688c<TextView, Drawable> {

    /* renamed from: d */
    public final UiUtils.Edge f52262d;

    public C20690e(TextView textView, UiUtils.Edge edge) {
        super(textView);
        C21100e.m49373x(edge, "edge");
        this.f52262d = edge;
    }

    /* renamed from: f */
    public final void mo52839f(Drawable drawable) {
        C15780a.m40271d((TextView) this.f52260b, this.f52262d, drawable);
    }

    /* renamed from: g */
    public final void mo52840g(Drawable drawable) {
        C15780a.m40271d((TextView) this.f52260b, this.f52262d, drawable);
    }

    /* renamed from: h */
    public final void mo10887h(Object obj, C6869d dVar) {
        C15780a.m40271d((TextView) this.f52260b, this.f52262d, (Drawable) obj);
    }

    /* renamed from: i */
    public final void mo10888i(Drawable drawable) {
        C15780a.m40271d((TextView) this.f52260b, this.f52262d, drawable);
    }
}
