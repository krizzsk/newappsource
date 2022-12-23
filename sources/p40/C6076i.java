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

/* renamed from: p40.i */
public final class C6076i extends C6071e {

    /* renamed from: p40.i$a */
    public static class C6077a extends C5605d.C5612g {

        /* renamed from: a */
        public final SQLiteStatement f19327a;

        public C6077a(SQLiteDatabase sQLiteDatabase, int i, long j) {
            StringBuilder k = C13555b.m33972k("INSERT ");
            k.append(DatabaseUtils.getConflictAlgorithm(4));
            k.append(" INTO ");
            k.append("shape_segments");
            k.append('(');
            k.append("metro_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "segment_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "from_stop_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "to_stop_id");
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append("segment_polyline");
            k.append(") VALUES (?,?,?,?,?,?);");
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(k.toString());
            this.f19327a = compileStatement;
            compileStatement.bindLong(1, (long) i);
            compileStatement.bindLong(2, j);
        }
    }

    public C6076i() {
        super(2048);
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49340n;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        C6077a aVar = new C6077a(sQLiteDatabase, serverId.f15142b, j);
        DataInputStream a = dVar.mo21433a("shape_segments.dat");
        int readInt = a.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = a.readInt();
            int readInt3 = a.readInt();
            int readInt4 = a.readInt();
            String j2 = dVar.mo21441j(a, a.readInt());
            aVar.f19327a.bindLong(3, (long) readInt2);
            aVar.f19327a.bindLong(4, (long) readInt3);
            aVar.f19327a.bindLong(5, (long) readInt4);
            aVar.f19327a.bindString(6, j2);
            aVar.f19327a.executeInsert();
        }
        a.close();
    }
}
