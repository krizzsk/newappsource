package s00;

import android.content.Context;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import p824tp.C19731i;

/* renamed from: s00.e */
public final class C19392e extends DatabaseJobQueue.Job {

    /* renamed from: b */
    public final /* synthetic */ ServerId f49323b;

    /* renamed from: c */
    public final /* synthetic */ long f49324c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19392e(Context context, ServerId serverId, long j) {
        super(context);
        this.f49323b = serverId;
        this.f49324c = j;
    }

    public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
        synchronized ("DELETE  FROM revisions WHERE metro_id = ? AND revision = ?;") {
            C19391d e = C19731i.m47197a(context).mo52087e(this.f49323b, this.f49324c);
            int size = e.f49318b.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((C19389b) e.f49318b.get(size)).mo6588a(context);
                } else {
                    sQLiteDatabase.execSQL("DELETE  FROM revisions WHERE metro_id = ? AND revision = ?;", DatabaseUtils.createSelectionArgs(this.f49323b.mo19751c(), Long.toString(this.f49324c)));
                }
            }
        }
    }
}
