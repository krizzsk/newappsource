package g20;

import android.content.Context;
import com.moovit.image.model.Image;
import com.moovit.transit.TransitLine;

/* renamed from: g20.h */
public final class C17160h extends C17142d<TransitLine, Image> {

    /* renamed from: b */
    public final /* synthetic */ C17142d f44394b;

    /* renamed from: c */
    public final /* synthetic */ int f44395c;

    public C17160h(int i, C17145e eVar) {
        this.f44394b = eVar;
        this.f44395c = i;
    }

    /* renamed from: a */
    public final Object mo49725a(Context context, Object obj) {
        TransitLine transitLine = (TransitLine) obj;
        String str = (String) this.f44394b.mo49725a(context, transitLine);
        if (str == null) {
            str = "";
        }
        return transitLine.f23686b.mo24376b(this.f44395c, str);
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Image[");
        k.append(this.f44395c);
        k.append("](");
        k.append(this.f44394b);
        k.append(")");
        return k.toString();
    }
}
