package p192o3;

import androidx.room.RoomDatabase;
import p217q2.C6150e;
import p269u2.C6685f;

/* renamed from: o3.l */
public final class C5948l implements C5947k {

    /* renamed from: a */
    public final RoomDatabase f19073a;

    /* renamed from: b */
    public final C5949a f19074b;

    /* renamed from: o3.l$a */
    public class C5949a extends C6150e<C5946j> {
        public C5949a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo21492d(C6685f fVar, Object obj) {
            C5946j jVar = (C5946j) obj;
            String str = jVar.f19071a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = jVar.f19072b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }
    }

    public C5948l(RoomDatabase roomDatabase) {
        this.f19073a = roomDatabase;
        this.f19074b = new C5949a(roomDatabase);
    }
}
