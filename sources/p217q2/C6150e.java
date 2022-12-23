package p217q2;

import androidx.room.RoomDatabase;
import p269u2.C6685f;

/* renamed from: q2.e */
public abstract class C6150e<T> extends C6164m {
    public C6150e(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    /* renamed from: d */
    public abstract void mo21492d(C6685f fVar, T t);

    /* renamed from: e */
    public final void mo22125e(T t) {
        C6685f a = mo22151a();
        try {
            mo21492d(a, t);
            a.executeInsert();
        } finally {
            mo22152c(a);
        }
    }
}
