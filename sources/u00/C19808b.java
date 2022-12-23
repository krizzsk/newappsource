package u00;

import android.content.Context;
import android.database.Cursor;
import c70.C13749c;
import com.moovit.commons.utils.Color;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.image.C16019d;
import com.moovit.image.model.Image;
import com.moovit.network.model.ServerId;
import com.moovit.transit.BicycleProvider;
import com.moovit.util.HasServerIdMap;
import java.util.ArrayList;
import java.util.List;
import p389bl.C13641g;
import p898wr.C20400b;
import p977zz.C20952m0;
import u00.C19806a;

/* renamed from: u00.b */
public final class C19808b extends C19806a {

    /* renamed from: d */
    public static final StatementHelper f50339d = StatementHelper.newInsertHelper("bicycle_providers", 5, "metro_id", "revision", "provider_order_index", "provider_id", "provider_name", "provider_primary_color", "provider_secondary_color", "provider_real_time_indicator", "provider_image_data");

    /* renamed from: e */
    public static final StatementHelper f50340e = StatementHelper.newDeleteHelper("bicycle_providers", "metro_id", "revision");

    /* renamed from: b */
    public final ArrayList f50341b = new ArrayList();

    /* renamed from: c */
    public final HasServerIdMap<BicycleProvider> f50342c = new HasServerIdMap<>();

    /* renamed from: u00.b$a */
    public static class C19809a extends C19806a.C19807a {

        /* renamed from: d */
        public final List<BicycleProvider> f50343d;

        public C19809a(Context context, ServerId serverId, long j, List<BicycleProvider> list) {
            super(context, serverId, j);
            this.f50343d = list;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            int i = serverId.f15142b;
            SQLiteStatement prepare = C19808b.f50339d.prepare(sQLiteDatabase);
            int i2 = 0;
            for (BicycleProvider next : this.f50343d) {
                int i3 = i2 + 1;
                StatementHelper statementHelper = C19808b.f50339d;
                statementHelper.bindValue(prepare, "metro_id", (long) i);
                statementHelper.bindValue(prepare, "revision", j);
                statementHelper.bindValue(prepare, "provider_order_index", (long) i2);
                statementHelper.bindValue(prepare, "provider_id", (long) next.f23629b.f15142b);
                statementHelper.bindValue(prepare, "provider_name", next.f23630c);
                Color color = next.f23631d;
                C20952m0<Integer> m0Var = C13749c.f33838a;
                statementHelper.bindValue(prepare, "provider_primary_color", (long) color.f41007b);
                statementHelper.bindValue(prepare, "provider_secondary_color", (long) next.f23632e.f41007b);
                statementHelper.bindValue(prepare, "provider_real_time_indicator", next.f23633f);
                Image image = next.f23634g;
                if (image != null) {
                    statementHelper.bindValue(prepare, "provider_image_data", C13641g.m34110B(image, C16019d.m40803a().f41718d));
                } else {
                    statementHelper.bindNullValue(prepare, "provider_image_data");
                }
                prepare.executeInsert();
                i2 = i3;
            }
        }
    }

    public C19808b(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: i */
    public static ArrayList m47255i(Cursor cursor) {
        boolean z;
        int columnIndex = cursor.getColumnIndex("provider_id");
        int columnIndex2 = cursor.getColumnIndex("provider_name");
        int columnIndex3 = cursor.getColumnIndex("provider_primary_color");
        int columnIndex4 = cursor.getColumnIndex("provider_secondary_color");
        int columnIndex5 = cursor.getColumnIndex("provider_image_data");
        int columnIndex6 = cursor.getColumnIndex("provider_real_time_indicator");
        ArrayList arrayList = new ArrayList(cursor.getCount());
        while (cursor.moveToNext()) {
            ServerId serverId = new ServerId(cursor.getInt(columnIndex));
            String string = cursor.getString(columnIndex2);
            int i = cursor.getInt(columnIndex3);
            C20952m0<Integer> m0Var = C13749c.f33838a;
            Color color = new Color(i);
            Color color2 = new Color(cursor.getInt(columnIndex4));
            if (cursor.getInt(columnIndex6) == 1) {
                z = true;
            } else {
                z = false;
            }
            Image image = null;
            if (!cursor.isNull(columnIndex5)) {
                image = (Image) C13641g.m34120h(cursor.getBlob(columnIndex5), C16019d.m40803a().f41718d);
            }
            arrayList.add(new BicycleProvider(serverId, string, color, color2, z, image));
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50340e;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /* renamed from: h */
    public final synchronized void mo52112h(Context context) {
        Cursor rawQuery = DatabaseHelper.get(context).getReadableDatabase().rawQuery("SELECT provider_id,provider_name,provider_primary_color,provider_secondary_color,provider_real_time_indicator,provider_image_data FROM bicycle_providers WHERE metro_id = ? AND revision = ? ORDER BY provider_order_index ASC", DatabaseUtils.createSelectionArgs(mo52108e(), mo52110g()));
        ArrayList i = m47255i(rawQuery);
        rawQuery.close();
        mo52113j(i);
    }

    /* renamed from: j */
    public final synchronized void mo52113j(List<BicycleProvider> list) {
        this.f50341b.clear();
        this.f50342c.clear();
        this.f50341b.addAll(list);
        this.f50342c.mo24548c(list);
    }
}
