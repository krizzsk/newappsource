package u00;

import android.content.Context;
import ce0.C21100e;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import s00.C19389b;
import s00.C19391d;

/* renamed from: u00.a */
public abstract class C19806a extends C19389b<C19391d> {

    /* renamed from: u00.a$a */
    public static abstract class C19807a extends DatabaseJobQueue.Job {

        /* renamed from: b */
        public final ServerId f50337b;

        /* renamed from: c */
        public final long f50338c;

        public C19807a(Context context, ServerId serverId, long j) {
            super(context);
            C21100e.m49373x(serverId, "metroId");
            this.f50337b = serverId;
            this.f50338c = j;
        }

        /* renamed from: a */
        public abstract void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase);

        public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
            mo52111a(context, this.f50337b, this.f50338c, sQLiteDatabase);
        }
    }

    public C19806a(C19391d dVar) {
        super(dVar);
    }

    /* renamed from: d */
    public final ServerId mo52107d() {
        return ((C19391d) this.f49320a).f49321d;
    }

    /* renamed from: e */
    public final String mo52108e() {
        return mo52107d().mo19751c();
    }

    /* renamed from: f */
    public final long mo52109f() {
        return ((C19391d) this.f49320a).f49322e;
    }

    /* renamed from: g */
    public final String mo52110g() {
        return Long.toString(mo52109f());
    }
}
