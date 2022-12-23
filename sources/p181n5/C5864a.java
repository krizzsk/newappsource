package p181n5;

import android.widget.ImageView;
import com.appboy.support.AppboyImageUtils;

/* renamed from: n5.a */
public final /* synthetic */ class C5864a implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ ImageView f18853b;

    /* renamed from: c */
    public final /* synthetic */ float f18854c;

    public /* synthetic */ C5864a(ImageView imageView, float f) {
        this.f18853b = imageView;
        this.f18854c = f;
    }

    public final void run() {
        AppboyImageUtils.m5447a(this.f18853b, this.f18854c);
    }
}
