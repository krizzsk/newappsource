package p929xy;

import android.content.Context;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import p824tp.C19731i;
import p977zz.C20930c;
import s00.C19393f;
import u00.C19812d;

/* renamed from: xy.c */
public final class C20660c extends DatabaseJobQueue.Job {

    /* renamed from: b */
    public final /* synthetic */ ServerId f52231b;

    /* renamed from: c */
    public final /* synthetic */ long f52232c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20660c(Context context, ServerId serverId, long j) {
        super(context);
        this.f52231b = serverId;
        this.f52232c = j;
    }

    public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
        C19812d dVar = (C19812d) C19731i.m47197a(context).mo52084b(this.f52231b, this.f52232c).mo51794a(C19812d.class);
        new C19812d.C19814b(context, dVar.mo52107d(), dVar.mo52109f()).run();
        C19393f fVar = C19393f.f49325q;
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        fVar.f49334h.mo52327f(sQLiteDatabase2, this.f52231b, this.f52232c, C20930c.m49020b(context));
    }
}
