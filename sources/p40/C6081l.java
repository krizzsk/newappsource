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

/* renamed from: p40.l */
public final class C6081l extends C6071e {

    /* renamed from: p40.l$a */
    public static class C6082a extends C5605d.C5607b {

        /* renamed from: a */
        public final SQLiteStatement f19329a;

        public C6082a(SQLiteDatabase sQLiteDatabase, int i, long j) {
            StringBuilder k = C13555b.m33972k("INSERT ");
            k.append(DatabaseUtils.getConflictAlgorithm(4));
            k.append(" INTO ");
            k.append("transit_frequencies");
            k.append('(');
            k.append("metro_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "transit_frequency_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "min_interval_in_seconds", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "max_interval_in_seconds");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "min_window_in_seconds", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "max_window_in_seconds");
            k.append(") VALUES (?,?,?,?,?,?,?);");
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(k.toString());
            this.f19329a = compileStatement;
            compileStatement.bindLong(1, (long) i);
            compileStatement.bindLong(2, j);
        }
    }

    public C6081l() {
        super(1024);
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49341o;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        C6082a aVar = new C6082a(sQLiteDatabase, serverId.f15142b, j);
        DataInputStream a = dVar.mo21433a("frequencies.dat");
        int readInt = a.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = a.readInt();
            int readInt3 = a.readInt();
            aVar.f19329a.bindLong(3, (long) readInt2);
            for (int i2 = 0; i2 < readInt3; i2++) {
                int readInt4 = a.readInt();
                int readInt5 = a.readInt();
                int readInt6 = a.readInt();
                int readInt7 = a.readInt();
                aVar.f19329a.bindLong(4, (long) readInt6);
                aVar.f19329a.bindLong(5, (long) readInt7);
                aVar.f19329a.bindLong(6, (long) readInt4);
                aVar.f19329a.bindLong(7, (long) readInt5);
                aVar.f19329a.executeInsert();
            }
        }
        a.close();
    }
}
