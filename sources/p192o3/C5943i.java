package p192o3;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import p217q2.C6150e;
import p217q2.C6162k;
import p217q2.C6164m;
import p243s2.C6419b;
import p269u2.C6685f;

/* renamed from: o3.i */
public final class C5943i implements C5942h {

    /* renamed from: a */
    public final RoomDatabase f19068a;

    /* renamed from: b */
    public final C5944a f19069b;

    /* renamed from: c */
    public final C5945b f19070c;

    /* renamed from: o3.i$a */
    public class C5944a extends C6150e<C5941g> {
        public C5944a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo21492d(C6685f fVar, Object obj) {
            C5941g gVar = (C5941g) obj;
            String str = gVar.f19066a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            fVar.bindLong(2, (long) gVar.f19067b);
        }
    }

    /* renamed from: o3.i$b */
    public class C5945b extends C6164m {
        public C5945b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "DELETE FROM SystemIdInfo where work_spec_id=?";
        }
    }

    public C5943i(RoomDatabase roomDatabase) {
        this.f19068a = roomDatabase;
        this.f19069b = new C5944a(roomDatabase);
        this.f19070c = new C5945b(roomDatabase);
    }

    /* renamed from: a */
    public final C5941g mo21929a(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19068a.mo5186b();
        C5941g gVar = null;
        Cursor i = this.f19068a.mo5193i(a);
        try {
            int a2 = C6419b.m15327a(i, "work_spec_id");
            int a3 = C6419b.m15327a(i, "system_id");
            if (i.moveToFirst()) {
                gVar = new C5941g(i.getString(a2), i.getInt(a3));
            }
            return gVar;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: b */
    public final void mo21930b(C5941g gVar) {
        this.f19068a.mo5186b();
        this.f19068a.mo5187c();
        try {
            this.f19069b.mo22125e(gVar);
            this.f19068a.mo5194j();
        } finally {
            this.f19068a.mo5191g();
        }
    }

    /* renamed from: c */
    public final void mo21931c(String str) {
        this.f19068a.mo5186b();
        C6685f a = this.f19070c.mo22151a();
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19068a.mo5187c();
        try {
            a.executeUpdateDelete();
            this.f19068a.mo5194j();
        } finally {
            this.f19068a.mo5191g();
            this.f19070c.mo22152c(a);
        }
    }
}
