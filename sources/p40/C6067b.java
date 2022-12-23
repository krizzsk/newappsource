package p40;

import android.content.Context;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import java.io.DataInputStream;
import java.io.IOException;
import l40.C5605d;
import p001a0.C0017h;
import s00.C19393f;
import v00.C20062a;

/* renamed from: p40.b */
public final class C6067b extends C6071e {

    /* renamed from: p40.b$a */
    public static class C6068a extends C5605d.C5606a {

        /* renamed from: a */
        public final SQLiteStatement f19324a;

        public C6068a(SQLiteDatabase sQLiteDatabase, int i, long j) {
            StringBuilder k = C13555b.m33972k("INSERT ");
            k.append(DatabaseUtils.getConflictAlgorithm(4));
            k.append(" INTO ");
            k.append("bicycle_stops");
            k.append('(');
            k.append("metro_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_provider_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_name");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_address", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "stop_lat");
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append("stop_lon");
            k.append(") VALUES (?,?,?,?,?,?,?,?);");
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(k.toString());
            this.f19324a = compileStatement;
            compileStatement.bindLong(1, (long) i);
            compileStatement.bindLong(2, j);
        }
    }

    public C6067b() {
        super(256);
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49338l;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        C6068a aVar = new C6068a(sQLiteDatabase, serverId.f15142b, j);
        int[] h = dVar.mo21439h("bicycle_stop_ids.dat");
        DataInputStream a = dVar.mo21433a("bicycle_stops.dat");
        int readInt = a.readInt();
        for (int i = 0; i < readInt; i++) {
            int i2 = h[i];
            int readInt2 = a.readInt();
            String j2 = dVar.mo21441j(a, a.readInt());
            String i3 = dVar.mo21440i(a);
            int readInt3 = a.readInt();
            int readInt4 = a.readInt();
            aVar.f19324a.bindLong(3, (long) readInt2);
            aVar.f19324a.bindLong(4, (long) i2);
            aVar.f19324a.bindString(5, j2);
            if (i3 != null) {
                aVar.f19324a.bindString(6, i3);
            } else {
                aVar.f19324a.bindNull(6);
            }
            aVar.f19324a.bindLong(7, (long) readInt3);
            aVar.f19324a.bindLong(8, (long) readInt4);
            aVar.f19324a.executeInsert();
        }
        a.close();
    }
}
