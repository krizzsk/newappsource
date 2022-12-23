package td0;

import android.content.ContentValues;
import android.database.SQLException;
import com.appsflyer.ServerParameters;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.concurrent.Callable;

/* renamed from: td0.g */
public final class C24937g implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ int f63026b = 1;

    /* renamed from: c */
    public final /* synthetic */ String f63027c;

    /* renamed from: d */
    public final /* synthetic */ int f63028d;

    /* renamed from: e */
    public final /* synthetic */ String f63029e;

    /* renamed from: f */
    public final /* synthetic */ C23192a f63030f;

    public C24937g(C23192a aVar, String str, String str2) {
        this.f63030f = aVar;
        this.f63027c = str;
        this.f63028d = 0;
        this.f63029e = str2;
    }

    public final Object call() throws Exception {
        ContentValues contentValues = new ContentValues();
        contentValues.put(ServerParameters.STATUS, Integer.valueOf(this.f63026b));
        String[] strArr = {this.f63027c, String.valueOf(this.f63028d), this.f63029e};
        DatabaseHelper databaseHelper = this.f63030f.f58874a;
        databaseHelper.getClass();
        try {
            databaseHelper.mo58264e().update("report", contentValues, "placementId = ?  AND status = ?  AND appId = ? ", strArr);
            return null;
        } catch (SQLException e) {
            throw new DatabaseHelper.DBException(e.getMessage());
        }
    }
}
