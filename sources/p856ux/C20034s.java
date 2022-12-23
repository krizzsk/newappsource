package p856ux;

import android.content.Context;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;

/* renamed from: ux.s */
public final class C20034s extends DatabaseJobQueue.Job {
    public C20034s(Context context) {
        super(context);
    }

    public final void work(Context context, SQLiteDatabase sQLiteDatabase) throws Exception {
        sQLiteDatabase.delete("configuration", (String) null, (String[]) null);
    }
}
