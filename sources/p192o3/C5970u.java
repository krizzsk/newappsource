package p192o3;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import p217q2.C6150e;
import p217q2.C6162k;
import p269u2.C6685f;

/* renamed from: o3.u */
public final class C5970u implements C5969t {

    /* renamed from: a */
    public final RoomDatabase f19113a;

    /* renamed from: b */
    public final C5971a f19114b;

    /* renamed from: o3.u$a */
    public class C5971a extends C6150e<C5968s> {
        public C5971a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo21492d(C6685f fVar, Object obj) {
            C5968s sVar = (C5968s) obj;
            String str = sVar.f19111a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = sVar.f19112b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }
    }

    public C5970u(RoomDatabase roomDatabase) {
        this.f19113a = roomDatabase;
        this.f19114b = new C5971a(roomDatabase);
    }

    /* renamed from: a */
    public final ArrayList mo21959a(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19113a.mo5186b();
        Cursor i = this.f19113a.mo5193i(a);
        try {
            ArrayList arrayList = new ArrayList(i.getCount());
            while (i.moveToNext()) {
                arrayList.add(i.getString(0));
            }
            return arrayList;
        } finally {
            i.close();
            a.release();
        }
    }
}
