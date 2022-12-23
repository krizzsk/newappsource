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

/* renamed from: p40.j */
public final class C6078j extends C6071e {

    /* renamed from: p40.j$a */
    public static class C6079a extends C5605d.C5613h {

        /* renamed from: a */
        public final SQLiteStatement f19328a;

        public C6079a(SQLiteDatabase sQLiteDatabase, int i, long j) {
            StringBuilder k = C13555b.m33972k("INSERT ");
            k.append(DatabaseUtils.getConflictAlgorithm(4));
            k.append(" INTO ");
            k.append("shapes");
            k.append('(');
            k.append("metro_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "shape_id");
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append("shape_polyline");
            k.append(") VALUES (?,?,?,?);");
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(k.toString());
            this.f19328a = compileStatement;
            compileStatement.bindLong(1, (long) i);
            compileStatement.bindLong(2, j);
        }
    }

    public C6078j() {
        super(512);
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49339m;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        C6079a aVar = new C6079a(sQLiteDatabase, serverId.f15142b, j);
        DataInputStream a = dVar.mo21433a("shapes.dat");
        int readInt = a.readInt();
        for (int i = 0; i < readInt; i++) {
            int readInt2 = a.readInt();
            String j2 = dVar.mo21441j(a, a.readInt());
            aVar.f19328a.bindLong(3, (long) readInt2);
            aVar.f19328a.bindString(4, j2);
            aVar.f19328a.executeInsert();
        }
        a.close();
    }
}
