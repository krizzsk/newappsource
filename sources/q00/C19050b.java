package q00;

import android.content.ContentValues;
import android.content.Context;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import p389bl.C13641g;
import p824tp.C19731i;
import t00.C19623b;

/* renamed from: q00.b */
public final class C19050b extends DatabaseJobQueue.Job {

    /* renamed from: b */
    public final /* synthetic */ ServerId f48446b;

    /* renamed from: c */
    public final /* synthetic */ C19047a f48447c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19050b(Context context, ServerId serverId, C19047a aVar) {
        super(context);
        this.f48446b = serverId;
        this.f48447c = aVar;
    }

    public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
        C19623b c = C19731i.m47197a(context).f50175e.mo51800c();
        ServerId serverId = this.f48446b;
        C19047a aVar = this.f48447c;
        c.getClass();
        ContentValues contentValues = new ContentValues();
        contentValues.put("metro_id", Integer.valueOf(serverId.f15142b));
        contentValues.put("configuration_data", C13641g.m34110B(aVar, C19047a.f48441d));
        sQLiteDatabase.insertWithOnConflict("configuration", (String) null, contentValues, 5);
    }
}
