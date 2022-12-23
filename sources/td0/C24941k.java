package td0;

import android.content.ContentValues;
import android.database.SQLException;
import com.vungle.warren.persistence.C23192a;
import com.vungle.warren.persistence.DatabaseHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import od0.C24566m;

/* renamed from: td0.k */
public final class C24941k implements Callable<Void> {

    /* renamed from: b */
    public final /* synthetic */ List f63037b;

    /* renamed from: c */
    public final /* synthetic */ C23192a f63038c;

    public C24941k(C23192a aVar, ArrayList arrayList) {
        this.f63038c = aVar;
        this.f63037b = arrayList;
    }

    public final Object call() throws Exception {
        boolean z;
        Class<C24566m> cls = C24566m.class;
        synchronized (C23192a.class) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("is_valid", Boolean.FALSE);
            DatabaseHelper databaseHelper = this.f63038c.f58874a;
            databaseHelper.getClass();
            try {
                databaseHelper.mo58264e().update("placement", contentValues, (String) null, (String[]) null);
                for (C24566m mVar : this.f63037b) {
                    C24566m mVar2 = (C24566m) C23192a.m57219a(this.f63038c, cls, mVar.f62257a);
                    if (!(mVar2 == null || (mVar2.f62259c == mVar.f62259c && mVar2.f62263g == mVar.f62263g))) {
                        for (String b : C23192a.m57222d(this.f63038c, mVar.f62257a)) {
                            C23192a.m57220b(this.f63038c, b);
                        }
                        this.f63038c.mo58274i(cls, mVar2.f62257a);
                    }
                    if (mVar2 != null) {
                        mVar.f62260d = mVar2.f62260d;
                        mVar.f62266j = mVar2.mo60831a();
                    }
                    if (mVar.f62265i != 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mVar.f62264h = z;
                    if (mVar.f62268l == Integer.MIN_VALUE) {
                        mVar.f62264h = false;
                    }
                    C23192a.m57223e(this.f63038c, mVar);
                }
            } catch (SQLException e) {
                throw new DatabaseHelper.DBException(e.getMessage());
            }
        }
        return null;
    }
}
