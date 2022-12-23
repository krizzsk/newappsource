package p006a5;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.airbnb.lottie.C1863b;
import com.airbnb.lottie.C1898n;
import java.util.HashMap;
import java.util.Map;
import p001a0.C0016g;
import p107h5.C5055c;

/* renamed from: a5.b */
public final class C0081b {

    /* renamed from: d */
    public static final Object f215d = new Object();

    /* renamed from: a */
    public final Context f216a;

    /* renamed from: b */
    public final String f217b;

    /* renamed from: c */
    public final Map<String, C1898n> f218c;

    public C0081b(Drawable.Callback callback, String str, C1863b bVar, Map<String, C1898n> map) {
        if (TextUtils.isEmpty(str) || str.charAt(str.length() - 1) == '/') {
            this.f217b = str;
        } else {
            this.f217b = C0016g.m28k(str, '/');
        }
        if (!(callback instanceof View)) {
            C5055c.m12896b("LottieDrawable must be inside of a view for images to work.");
            this.f218c = new HashMap();
            this.f216a = null;
            return;
        }
        this.f216a = ((View) callback).getContext();
        this.f218c = map;
    }

    /* renamed from: a */
    public final void mo180a(String str, Bitmap bitmap) {
        synchronized (f215d) {
            this.f218c.get(str).f6646d = bitmap;
        }
    }
}
