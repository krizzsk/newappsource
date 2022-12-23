package p192o3;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import p217q2.C6150e;
import p217q2.C6162k;
import p269u2.C6685f;

/* renamed from: o3.c */
public final class C5935c implements C5934b {

    /* renamed from: a */
    public final RoomDatabase f19060a;

    /* renamed from: b */
    public final C5936a f19061b;

    /* renamed from: o3.c$a */
    public class C5936a extends C6150e<C5933a> {
        public C5936a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo21492d(C6685f fVar, Object obj) {
            C5933a aVar = (C5933a) obj;
            String str = aVar.f19058a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            String str2 = aVar.f19059b;
            if (str2 == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindString(2, str2);
            }
        }
    }

    public C5935c(RoomDatabase roomDatabase) {
        this.f19060a = roomDatabase;
        this.f19061b = new C5936a(roomDatabase);
    }

    /* renamed from: a */
    public final ArrayList mo21921a(String str) {
        C6162k a = C6162k.m14718a(1, "SELECT work_spec_id FROM dependency WHERE prerequisite_id=?");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19060a.mo5186b();
        Cursor i = this.f19060a.mo5193i(a);
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

    /* renamed from: b */
    public final boolean mo21922b(String str) {
        boolean z = true;
        C6162k a = C6162k.m14718a(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19060a.mo5186b();
        Cursor i = this.f19060a.mo5193i(a);
        try {
            boolean z2 = false;
            if (i.moveToFirst()) {
                if (i.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            i.close();
            a.release();
        }
    }
}
