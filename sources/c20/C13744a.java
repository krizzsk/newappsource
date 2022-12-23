package c20;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.moovit.commons.utils.C15780a;
import com.moovit.commons.utils.UiUtils;
import com.moovit.image.model.Image;
import p583jk.C17884p;
import y10.C20690e;

/* renamed from: c20.a */
public final class C13744a {
    /* renamed from: a */
    public static void m34299a(TextView textView, UiUtils.Edge edge, Image image) {
        if (image != null) {
            C17884p.m44354Y(textView).mo51642v(image).mo51628o0(image).mo10848R(new C20690e(textView, edge));
            return;
        }
        C17884p.m44354Y(textView).mo10872n(textView);
        C15780a.m40271d(textView, edge, (Drawable) null);
    }

    /* renamed from: b */
    public static void m34300b(ImageView imageView, Image image) {
        m34301c(imageView, image, 8);
    }

    /* renamed from: c */
    public static void m34301c(ImageView imageView, Image image, int i) {
        if (image != null) {
            C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo10850T(imageView);
            imageView.setVisibility(0);
            return;
        }
        C17884p.m44354Y(imageView).mo10872n(imageView);
        imageView.setImageDrawable((Drawable) null);
        imageView.setVisibility(i);
    }
}
