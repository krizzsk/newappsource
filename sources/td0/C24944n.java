package td0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.C23192a;
import ee0.C23286b;
import java.util.concurrent.Callable;
import od0.C24575s;
import od0.C24576t;

/* renamed from: td0.n */
public final class C24944n implements Callable<C23286b> {

    /* renamed from: b */
    public final /* synthetic */ long f63043b;

    /* renamed from: c */
    public final /* synthetic */ C23192a f63044c;

    public C24944n(C23192a aVar, long j) {
        this.f63044c = aVar;
        this.f63043b = j;
    }

    public final Object call() throws Exception {
        Cursor query = this.f63044c.f58874a.mo58264e().query("vision_data", (String[]) null, "timestamp >= ?", new String[]{Long.toString(this.f63043b)}, (String) null, (String) null, "_id DESC", (String) null);
        C24576t tVar = (C24576t) this.f63044c.f58878e.get(C24575s.class);
        if (query != null) {
            if (tVar != null) {
                try {
                    if (query.moveToFirst()) {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(query, contentValues);
                        C23286b bVar = new C23286b(query.getCount(), C24576t.m61770d(contentValues).f62305b);
                        query.close();
                        return bVar;
                    }
                } catch (Exception e) {
                    VungleLogger.m57029b("getVisionAggregationInfo", e.toString());
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            query.close();
        }
        return null;
    }
}
