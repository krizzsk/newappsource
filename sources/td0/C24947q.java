package td0;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import com.vungle.warren.VungleLogger;
import com.vungle.warren.persistence.C23192a;
import java.util.concurrent.Callable;
import od0.C24545c;
import od0.C24547d;

/* renamed from: td0.q */
public final class C24947q implements Callable<C24545c> {

    /* renamed from: b */
    public final /* synthetic */ String f63052b;

    /* renamed from: c */
    public final /* synthetic */ String f63053c;

    /* renamed from: d */
    public final /* synthetic */ C23192a f63054d;

    public C24947q(C23192a aVar, String str, String str2) {
        this.f63054d = aVar;
        this.f63052b = str;
        this.f63053c = str2;
    }

    public final Object call() throws Exception {
        String[] strArr;
        StringBuilder l = C13555b.m33973l("placement_id = ? AND ", "(state = ? OR ", "state = ?)");
        if (this.f63052b != null) {
            l.append(" AND item_id = ?");
            strArr = new String[]{this.f63053c, String.valueOf(1), String.valueOf(0), this.f63052b};
        } else {
            strArr = new String[]{this.f63053c, String.valueOf(1), String.valueOf(0)};
        }
        String sb = l.toString();
        Cursor query = this.f63054d.f58874a.mo58264e().query("advertisement", (String[]) null, sb, strArr, (String) null, (String) null, (String) null, (String) null);
        C24545c cVar = null;
        if (query != null) {
            try {
                C24547d dVar = (C24547d) this.f63054d.f58878e.get(C24545c.class);
                if (dVar != null && query.moveToNext()) {
                    ContentValues contentValues = new ContentValues();
                    DatabaseUtils.cursorRowToContentValues(query, contentValues);
                    cVar = dVar.mo60803c(contentValues);
                }
            } catch (Exception e) {
                VungleLogger.m57029b("findPotentiallyExpiredAd", e.toString());
            } catch (Throwable th) {
                query.close();
                throw th;
            }
            query.close();
        }
        return cVar;
    }
}
