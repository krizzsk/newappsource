package p243s2;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.Iterator;
import p281v2.C6846a;

/* renamed from: s2.c */
public final class C6420c {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static void m15328a(C6846a aVar) {
        ArrayList arrayList = new ArrayList();
        Cursor f = aVar.mo23088f("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (f.moveToNext()) {
            try {
                arrayList.add(f.getString(0));
            } catch (Throwable th) {
                f.close();
                throw th;
            }
        }
        f.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                aVar.execSQL("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }
}
