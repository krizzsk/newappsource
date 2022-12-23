package p092g3;

import androidx.room.RoomDatabase;
import androidx.work.impl.WorkDatabase;
import p281v2.C6846a;

/* renamed from: g3.i */
public final class C4761i extends RoomDatabase.C1253b {
    /* renamed from: a */
    public final void mo5198a(C6846a aVar) {
        aVar.beginTransaction();
        try {
            int i = WorkDatabase.f5155m;
            aVar.execSQL("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < " + (System.currentTimeMillis() - WorkDatabase.f5154l) + " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            aVar.setTransactionSuccessful();
        } finally {
            aVar.endTransaction();
        }
    }
}
