package p192o3;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import p217q2.C6150e;
import p217q2.C6162k;
import p269u2.C6685f;

/* renamed from: o3.f */
public final class C5939f implements C5938e {

    /* renamed from: a */
    public final RoomDatabase f19064a;

    /* renamed from: b */
    public final C5940a f19065b;

    /* renamed from: o3.f$a */
    public class C5940a extends C6150e<C5937d> {
        public C5940a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo21492d(C6685f fVar, Object obj) {
            C5937d dVar = (C5937d) obj;
            String str = dVar.f19062a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            Long l = dVar.f19063b;
            if (l == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindLong(2, l.longValue());
            }
        }
    }

    public C5939f(RoomDatabase roomDatabase) {
        this.f19064a = roomDatabase;
        this.f19065b = new C5940a(roomDatabase);
    }

    /* renamed from: a */
    public final Long mo21925a(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT long_value FROM Preference where `key`=?");
        a.bindString(1, str);
        this.f19064a.mo5186b();
        Long l = null;
        Cursor i = this.f19064a.mo5193i(a);
        try {
            if (i.moveToFirst()) {
                if (!i.isNull(0)) {
                    l = Long.valueOf(i.getLong(0));
                }
            }
            return l;
        } finally {
            i.close();
            a.release();
        }
    }

    /* renamed from: b */
    public final void mo21926b(C5937d dVar) {
        this.f19064a.mo5186b();
        this.f19064a.mo5187c();
        try {
            this.f19065b.mo22125e(dVar);
            this.f19064a.mo5194j();
        } finally {
            this.f19064a.mo5191g();
        }
    }
}
