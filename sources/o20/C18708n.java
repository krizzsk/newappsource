package o20;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.moovit.image.model.Image;
import com.moovit.map.C16281i;
import java.util.concurrent.Callable;
import p583jk.C17884p;

/* renamed from: o20.n */
public final /* synthetic */ class C18708n implements Callable {

    /* renamed from: b */
    public final /* synthetic */ Context f47619b;

    /* renamed from: c */
    public final /* synthetic */ Image f47620c;

    /* renamed from: d */
    public final /* synthetic */ String f47621d;

    public /* synthetic */ C18708n(Context context, Image image, String str) {
        this.f47619b = context;
        this.f47620c = image;
        this.f47621d = str;
    }

    public final Object call() {
        Context context = this.f47619b;
        Image image = this.f47620c;
        String str = this.f47621d;
        return C16281i.m41513i(context, image.hashCode(), (Drawable) C17884p.m44353X(context).mo51642v(image).mo51628o0(image).mo10862d0().get(), str);
    }
}
