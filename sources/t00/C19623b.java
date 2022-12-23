package t00;

import android.content.Context;
import android.database.Cursor;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.network.model.ServerId;
import p389bl.C13641g;
import p898wr.C20399a;
import q00.C19047a;

/* renamed from: t00.b */
public final class C19623b extends C19622a {
    public C19623b(C20399a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public static void m47058d(Context context, ServerId serverId) {
        DatabaseHelper.get(context).getWritableDatabase().delete("configuration", "metro_id = ?", DatabaseUtils.createSelectionArgs(serverId.mo19751c()));
    }

    /* renamed from: e */
    public static C19047a m47059e(SQLiteDatabase sQLiteDatabase, ServerId serverId) {
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT configuration_data FROM configuration WHERE metro_id = ?", DatabaseUtils.createSelectionArgs(serverId.mo19751c()));
        if (!rawQuery.moveToFirst()) {
            rawQuery.close();
            return null;
        }
        byte[] blob = rawQuery.getBlob(rawQuery.getColumnIndex("configuration_data"));
        rawQuery.close();
        return (C19047a) C13641g.m34120h(blob, C19047a.f48441d);
    }
}
