package s20;

import com.moovit.database.sqlite.SQLiteDatabase;

/* renamed from: s20.i */
public final class C19413i extends ThreadLocal<int[]> {
    public final Object initialValue() {
        return new int[SQLiteDatabase.OPEN_FULLMUTEX];
    }
}
