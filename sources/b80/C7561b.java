package b80;

import android.content.Context;
import android.database.Cursor;
import ce0.C21100e;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.Tokenizer;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.transit.LocationDescriptor;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import p373au.C13534f;
import p824tp.C19728f;
import p824tp.C19731i;
import p977zz.C20964s0;
import s00.C19391d;
import u00.C19812d;
import z70.C13324c;
import z70.C13329g;

/* renamed from: b80.b */
public final class C7561b implements Callable<C13324c.C13325a> {

    /* renamed from: b */
    public final Context f23044b;

    /* renamed from: c */
    public final C19728f f23045c;

    /* renamed from: d */
    public final String f23046d;

    /* renamed from: e */
    public final LatLonE6 f23047e;

    public C7561b(Context context, C19728f fVar, String str, LatLonE6 latLonE6) {
        C21100e.m49373x(context, AppActionRequest.KEY_CONTEXT);
        this.f23044b = context;
        C21100e.m49373x(fVar, "metroContext");
        this.f23045c = fVar;
        this.f23046d = str;
        this.f23047e = latLonE6;
    }

    public final Object call() throws Exception {
        List list;
        C19391d d = C19731i.m47197a(this.f23044b).mo52086d(this.f23045c);
        SQLiteDatabase readableDatabase = DatabaseHelper.get(this.f23044b).getReadableDatabase();
        C19812d dVar = (C19812d) d.mo51794a(C19812d.class);
        String str = this.f23046d;
        dVar.getClass();
        String str2 = Tokenizer.tokenPrefixQuery(str);
        if (C20964s0.m49090h(str2)) {
            list = Collections.emptyList();
        } else {
            Cursor rawQuery = readableDatabase.rawQuery("SELECT poi_data_id,poi_data_image,poi_data_title,poi_data_subtitle,poi_data_lat,poi_data_lon FROM custom_poi_data WHERE metro_id = ? AND revision = ? AND rowid IN (SELECT rowid FROM custom_poi_fts WHERE custom_poi_fts MATCH ? ORDER BY rank LIMIT 300) LIMIT 30", DatabaseUtils.createSelectionArgs(dVar.mo52108e(), dVar.mo52110g(), str2));
            try {
                ArrayList h = C19812d.m47265h(rawQuery);
                rawQuery.close();
                list = h;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        Map<LocationDescriptor, Integer> a = C13329g.m33602a(list, this.f23047e);
        if (!a.isEmpty()) {
            Collections.sort(list, new C13534f(a, 1));
        }
        if (list.size() > 3) {
            list = list.subList(0, 3);
        }
        return new C13324c.C13325a((List<LocationDescriptor>) list, a);
        throw th;
    }
}
