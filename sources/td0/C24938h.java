package td0;

import android.content.ContentValues;
import android.database.SQLException;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.concurrent.Callable;

/* renamed from: td0.h */
public final class C24938h implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ C23192a f63031b;

    public C24938h(C23192a aVar) {
        this.f63031b = aVar;
    }

    public final Object call() throws Exception {
        this.f63031b.f58874a.mo58264e();
        ContentValues contentValues = new ContentValues();
        contentValues.put("state", 3);
        String[] strArr = {String.valueOf(2)};
        DatabaseHelper databaseHelper = this.f63031b.f58874a;
        databaseHelper.getClass();
        try {
            databaseHelper.mo58264e().update("advertisement", contentValues, "state=?", strArr);
            return null;
        } catch (SQLException e) {
            throw new DatabaseHelper.DBException(e.getMessage());
        }
    }
}
