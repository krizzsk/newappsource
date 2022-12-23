package od0;

import android.content.ContentValues;
import com.appboy.models.outgoing.AttributionData;
import td0.C24931b;

/* renamed from: od0.t */
public final class C24576t implements C24931b<C24575s> {
    /* renamed from: d */
    public static C24575s m61770d(ContentValues contentValues) {
        return new C24575s(contentValues.getAsLong("timestamp").longValue(), contentValues.getAsString("creative"), contentValues.getAsString(AttributionData.CAMPAIGN_KEY), contentValues.getAsString("advertiser"));
    }

    /* renamed from: a */
    public final ContentValues mo60801a(Object obj) {
        C24575s sVar = (C24575s) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("timestamp", Long.valueOf(sVar.f62304a));
        contentValues.put("creative", sVar.f62305b);
        contentValues.put(AttributionData.CAMPAIGN_KEY, sVar.f62306c);
        contentValues.put("advertiser", sVar.f62307d);
        return contentValues;
    }

    /* renamed from: b */
    public final String mo60802b() {
        return "vision_data";
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo60803c(ContentValues contentValues) {
        return m61770d(contentValues);
    }
}
