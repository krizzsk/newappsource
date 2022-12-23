package p929xy;

import android.content.Context;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.List;
import p824tp.C19731i;
import s00.C19393f;
import u00.C19812d;

/* renamed from: xy.a */
public final class C20657a extends DatabaseJobQueue.Job {

    /* renamed from: b */
    public final /* synthetic */ ServerId f52228b;

    /* renamed from: c */
    public final /* synthetic */ long f52229c;

    /* renamed from: d */
    public final /* synthetic */ List f52230d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20657a(Context context, ServerId serverId, long j, ArrayList arrayList) {
        super(context);
        this.f52228b = serverId;
        this.f52229c = j;
        this.f52230d = arrayList;
    }

    public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
        C19812d dVar = (C19812d) C19731i.m47197a(context).mo52084b(this.f52228b, this.f52229c).mo51794a(C19812d.class);
        Context context2 = context;
        new C19812d.C19813a(context2, dVar.mo52107d(), dVar.mo52109f(), this.f52230d).run();
        C19393f.f49325q.f49329c.mo52327f(sQLiteDatabase, this.f52228b, this.f52229c, Boolean.TRUE);
    }
}
