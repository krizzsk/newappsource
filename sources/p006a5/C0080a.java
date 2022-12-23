package p006a5;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashMap;
import p107h5.C5055c;
import w10.C20268a;

/* renamed from: a5.a */
public final class C0080a {

    /* renamed from: a */
    public final C20268a f210a = new C20268a();

    /* renamed from: b */
    public final HashMap f211b = new HashMap();

    /* renamed from: c */
    public final HashMap f212c = new HashMap();

    /* renamed from: d */
    public final AssetManager f213d;

    /* renamed from: e */
    public String f214e = ".ttf";

    public C0080a(Drawable.Callback callback) {
        if (!(callback instanceof View)) {
            C5055c.m12896b("LottieDrawable must be inside of a view for images to work.");
            this.f213d = null;
            return;
        }
        this.f213d = ((View) callback).getContext().getAssets();
    }
}
