package d80;

import android.content.Context;
import android.net.Uri;
import ce0.C21100e;
import java.util.Locale;
import p824tp.C19728f;
import p977zz.C20964s0;
import z70.C13321a;

/* renamed from: d80.h */
public final class C12605h extends C12598a<C12605h, C12606i> {

    /* renamed from: u */
    public final C13321a f31152u;

    public C12605h(Context context, C19728f fVar, C13321a aVar) {
        super(context, Uri.parse("https://maps.googleapis.com/maps/api/geocode/json"), false, C12606i.class);
        C21100e.m49373x(fVar, "metroContext");
        C21100e.m49373x(aVar, "searchLocation");
        this.f31152u = aVar;
        mo52629r("place_id", aVar.f33070b);
        Locale locale = Locale.getDefault();
        if (locale != null && !C20964s0.m49090h(locale.getLanguage())) {
            mo52629r("language", locale.getLanguage());
        }
    }
}
