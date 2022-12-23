package p217q2;

import androidx.room.RoomDatabase;
import java.util.concurrent.atomic.AtomicBoolean;
import p269u2.C6685f;

/* renamed from: q2.m */
public abstract class C6164m {

    /* renamed from: a */
    public final AtomicBoolean f19546a = new AtomicBoolean(false);

    /* renamed from: b */
    public final RoomDatabase f19547b;

    /* renamed from: c */
    public volatile C6685f f19548c;

    public C6164m(RoomDatabase roomDatabase) {
        this.f19547b = roomDatabase;
    }

    /* renamed from: a */
    public final C6685f mo22151a() {
        this.f19547b.mo5185a();
        if (this.f19546a.compareAndSet(false, true)) {
            if (this.f19548c == null) {
                String b = mo21491b();
                RoomDatabase roomDatabase = this.f19547b;
                roomDatabase.mo5185a();
                roomDatabase.mo5186b();
                this.f19548c = roomDatabase.f4710c.getWritableDatabase().compileStatement(b);
            }
            return this.f19548c;
        }
        String b2 = mo21491b();
        RoomDatabase roomDatabase2 = this.f19547b;
        roomDatabase2.mo5185a();
        roomDatabase2.mo5186b();
        return roomDatabase2.f4710c.getWritableDatabase().compileStatement(b2);
    }

    /* renamed from: b */
    public abstract String mo21491b();

    /* renamed from: c */
    public final void mo22152c(C6685f fVar) {
        if (fVar == this.f19548c) {
            this.f19546a.set(false);
        }
    }
}
