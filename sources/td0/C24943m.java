package td0;

import android.database.SQLException;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.concurrent.Callable;

/* renamed from: td0.m */
public final class C24943m implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ int f63041b;

    /* renamed from: c */
    public final /* synthetic */ C23192a f63042c;

    public C24943m(C23192a aVar, int i) {
        this.f63042c = aVar;
        this.f63041b = i;
    }

    public final Object call() throws Exception {
        String[] strArr = {Integer.toString(this.f63041b)};
        DatabaseHelper databaseHelper = this.f63042c.f58874a;
        databaseHelper.getClass();
        try {
            databaseHelper.mo58264e().delete("vision_data", "_id <= ( SELECT MAX( _id ) FROM vision_data ) - ?", strArr);
            return null;
        } catch (SQLException e) {
            throw new DatabaseHelper.DBException(e.getMessage());
        }
    }
}
