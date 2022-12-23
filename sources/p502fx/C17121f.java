package p502fx;

import ce0.C21100e;
import com.appboy.models.MessageButton;
import com.moovit.image.model.Image;
import com.moovit.util.ColorScheme;

/* renamed from: fx.f */
public final class C17121f {

    /* renamed from: a */
    public final String f44310a;

    /* renamed from: b */
    public final ColorScheme f44311b;

    /* renamed from: c */
    public final Image f44312c;

    public C17121f(String str, ColorScheme colorScheme, Image image) {
        C21100e.m49373x(str, MessageButton.TEXT);
        this.f44310a = str;
        C21100e.m49373x(colorScheme, "textColor");
        this.f44311b = colorScheme;
        this.f44312c = image;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("TodPassengerListItemSpec{text=");
        k.append(this.f44310a);
        k.append(", textColor=");
        k.append(this.f44311b);
        k.append(", icon=");
        k.append(this.f44312c);
        k.append('}');
        return k.toString();
    }
}
