package j30;

import android.content.Context;
import ce0.C21100e;
import com.moovit.commons.utils.collections.CollectionHashMap;
import com.moovit.database.DatabaseJobQueue;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.metroentities.MetroEntityType;
import j40.C5384a;
import java.util.Collection;
import s00.C19391d;

/* renamed from: j30.i */
public final class C5382i extends DatabaseJobQueue.Job {

    /* renamed from: b */
    public final C19391d f17693b;

    /* renamed from: c */
    public final CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> f17694c;

    public C5382i(Context context, C19391d dVar, CollectionHashMap.HashSetHashMap<MetroEntityType, C5384a> hashSetHashMap) {
        super(context);
        C21100e.m49373x(dVar, "metroDal");
        this.f17693b = dVar;
        C21100e.m49373x(hashSetHashMap, "itemsByType");
        this.f17694c = hashSetHashMap;
    }

    public final void work(Context context, SQLiteDatabase sQLiteDatabase) {
        for (MetroEntityType next : this.f17694c.keySet()) {
            next.getLearner().mo21153a(context, this.f17693b, (Collection) this.f17694c.get(next));
        }
    }
}
