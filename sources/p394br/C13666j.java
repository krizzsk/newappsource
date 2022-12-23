package p394br;

import aa0.C7538j;
import android.content.Context;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import java.util.ArrayList;
import java.util.List;
import p567iq.C17635b;
import p669mz.C18482c;
import p898wr.C20400b;
import p945yr.C20755a;
import s00.C19393f;

/* renamed from: br.j */
public final class C13666j extends DatabaseJobQueue.Job {

    /* renamed from: b */
    public final /* synthetic */ ServerId f33698b;

    /* renamed from: c */
    public final /* synthetic */ long f33699c;

    /* renamed from: d */
    public final /* synthetic */ List f33700d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13666j(Context context, ServerId serverId, long j, ArrayList arrayList) {
        super(context);
        this.f33698b = serverId;
        this.f33699c = j;
        this.f33700d = arrayList;
    }

    public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
        C20755a aVar = (C20755a) ((C20400b) C17635b.m43779f(context).mo52084b(this.f33698b, this.f33699c)).mo51794a(C20755a.class);
        List list = this.f33700d;
        aVar.mo52107d();
        aVar.mo52109f();
        C7538j<ServerId> h = aVar.mo52891h(context);
        h.mo51499b();
        C18482c<T> cVar = h.f48432b;
        cVar.clear();
        cVar.addAll(list);
        h.mo51500c();
        C19393f.f49325q.f49331e.mo52327f(sQLiteDatabase, this.f33698b, this.f33699c, Boolean.TRUE);
    }
}
