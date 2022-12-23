package p192o3;

import androidx.room.RoomDatabase;
import androidx.work.C1388b;
import p217q2.C6150e;
import p217q2.C6164m;
import p269u2.C6685f;

/* renamed from: o3.o */
public final class C5952o implements C5951n {

    /* renamed from: a */
    public final RoomDatabase f19077a;

    /* renamed from: b */
    public final C5953a f19078b;

    /* renamed from: c */
    public final C5954b f19079c;

    /* renamed from: d */
    public final C5955c f19080d;

    /* renamed from: o3.o$a */
    public class C5953a extends C6150e<C5950m> {
        public C5953a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
        }

        /* renamed from: d */
        public final void mo21492d(C6685f fVar, Object obj) {
            C5950m mVar = (C5950m) obj;
            String str = mVar.f19075a;
            if (str == null) {
                fVar.bindNull(1);
            } else {
                fVar.bindString(1, str);
            }
            byte[] c = C1388b.m3716c(mVar.f19076b);
            if (c == null) {
                fVar.bindNull(2);
            } else {
                fVar.bindBlob(2, c);
            }
        }
    }

    /* renamed from: o3.o$b */
    public class C5954b extends C6164m {
        public C5954b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "DELETE from WorkProgress where work_spec_id=?";
        }
    }

    /* renamed from: o3.o$c */
    public class C5955c extends C6164m {
        public C5955c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        /* renamed from: b */
        public final String mo21491b() {
            return "DELETE FROM WorkProgress";
        }
    }

    public C5952o(RoomDatabase roomDatabase) {
        this.f19077a = roomDatabase;
        this.f19078b = new C5953a(roomDatabase);
        this.f19079c = new C5954b(roomDatabase);
        this.f19080d = new C5955c(roomDatabase);
    }

    /* renamed from: a */
    public final void mo21932a(String str) {
        this.f19077a.mo5186b();
        C6685f a = this.f19079c.mo22151a();
        if (str == null) {
            a.bindNull(1);
        } else {
            a.bindString(1, str);
        }
        this.f19077a.mo5187c();
        try {
            a.executeUpdateDelete();
            this.f19077a.mo5194j();
        } finally {
            this.f19077a.mo5191g();
            this.f19079c.mo22152c(a);
        }
    }

    /* renamed from: b */
    public final void mo21933b() {
        this.f19077a.mo5186b();
        C6685f a = this.f19080d.mo22151a();
        this.f19077a.mo5187c();
        try {
            a.executeUpdateDelete();
            this.f19077a.mo5194j();
        } finally {
            this.f19077a.mo5191g();
            this.f19080d.mo22152c(a);
        }
    }
}
