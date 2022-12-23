package p40;

import android.content.Context;
import android.util.SparseArray;
import ce0.C21100e;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.network.model.ServerId;
import java.io.IOException;
import l40.C5605d;
import p001a0.C0017h;
import s00.C19393f;
import v00.C20062a;

/* renamed from: p40.n */
public final class C6085n extends C6071e {

    /* renamed from: p40.n$a */
    public static class C6086a extends C5605d.C5610e {

        /* renamed from: a */
        public final SQLiteStatement f19336a;

        /* renamed from: b */
        public final SparseArray<String> f19337b;

        /* renamed from: c */
        public int[] f19338c = new int[100];

        public C6086a(SQLiteDatabase sQLiteDatabase, int i, long j, SparseArray<String> sparseArray) {
            StringBuilder k = C13555b.m33972k("INSERT ");
            k.append(DatabaseUtils.getConflictAlgorithm(4));
            k.append(" INTO ");
            k.append("patterns");
            k.append('(');
            k.append("metro_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "revision", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_id");
            C0017h.m61R(k, AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_id", AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR, "pattern_stop_name");
            k.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append("pattern_stop_order_index");
            k.append(") VALUES (?,?,?,?,?,?);");
            SQLiteStatement compileStatement = sQLiteDatabase.compileStatement(k.toString());
            this.f19336a = compileStatement;
            C21100e.m49373x(sparseArray, "stopIdToName");
            this.f19337b = sparseArray;
            compileStatement.bindLong(1, (long) i);
            compileStatement.bindLong(2, j);
        }

        /* renamed from: a */
        public final void mo21455a(int i) {
            this.f19336a.bindLong(3, (long) i);
        }

        /* renamed from: b */
        public final void mo21456b() {
        }

        /* renamed from: c */
        public final void mo21457c(int[] iArr, int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = iArr[i3];
                this.f19336a.bindLong(4, (long) i4);
                this.f19336a.bindString(5, this.f19337b.get(i4));
                this.f19336a.bindLong(6, (long) i3);
                this.f19336a.executeInsert();
            }
        }

        /* renamed from: d */
        public final int[] mo21458d(int i) {
            if (this.f19338c.length < i) {
                this.f19338c = new int[((i * 3) / 2)];
            }
            return this.f19338c;
        }

        /* renamed from: e */
        public final void mo21459e(int i) {
        }
    }

    /* renamed from: p40.n$b */
    public static class C6087b extends C5605d.C5614i {

        /* renamed from: a */
        public SparseArray<String> f19339a;

        /* renamed from: a */
        public final void mo21460a(String str, int i, int i2, int i3, int i4, int i5, String str2) {
            this.f19339a.put(i, str2);
        }

        /* renamed from: m */
        public final void mo21472m(int i) {
            this.f19339a = new SparseArray<>(i);
        }
    }

    public C6085n() {
        super(8);
    }

    /* renamed from: q */
    public final C20062a mo22056q(C19393f fVar) {
        return fVar.f49337k;
    }

    /* renamed from: s */
    public final void mo22057s(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase, C5605d dVar) throws IOException {
        C6087b bVar = new C6087b();
        dVar.mo21437e(bVar);
        SQLiteDatabase sQLiteDatabase2 = sQLiteDatabase;
        dVar.mo21435c(new C6086a(sQLiteDatabase2, serverId.f15142b, j, bVar.f19339a), dVar.mo21439h("pattern_ids.dat"), dVar.mo21439h("stop_ids.dat"));
    }
}
