package v00;

import android.content.ContentValues;
import android.database.Cursor;
import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.Locale;
import p977zz.C20964s0;

/* renamed from: v00.b */
public final class C20063b extends C20064c {
    public C20063b(String str) {
        super(str, (Object) null);
    }

    /* renamed from: d */
    public final void mo52324d(ContentValues contentValues, String str, Serializable serializable) {
        Locale locale = (Locale) serializable;
        contentValues.put(str, C20964s0.m49102t(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, locale.getLanguage(), locale.getCountry(), locale.getVariant()));
    }

    /* renamed from: e */
    public final Object mo52325e(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        String[] A = C20964s0.m49080A(cursor.getString(i), ',');
        return new Locale(A[0], A[1], A[2]);
    }
}
