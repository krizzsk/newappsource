package u00;

import android.content.ContentValues;
import android.content.Context;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.geo.Polylon;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.StatementHelper;
import com.moovit.database.sqlite.SQLiteDatabase;
import com.moovit.database.sqlite.SQLiteStatement;
import com.moovit.l10n.TemplateProtocol;
import com.moovit.metro.ReportCategoryType;
import com.moovit.network.model.ServerId;
import com.moovit.transit.TransitType;
import g20.C17146f;
import g30.C4776h;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import p389bl.C13641g;
import p810sz.C19576b;
import p810sz.C19584i;
import p898wr.C20400b;
import s00.C19391d;
import u00.C19806a;
import u00.C19808b;
import u00.C19844m;
import u00.C19855r;

/* renamed from: u00.g */
public final class C19824g extends C19806a {

    /* renamed from: b */
    public static final StatementHelper f50372b = StatementHelper.newDeleteHelper("metro_info", "metro_id", "revision");

    /* renamed from: u00.g$a */
    public class C19825a extends C19806a.C19807a {

        /* renamed from: d */
        public final C4776h f50373d;

        public C19825a(Context context, C4776h hVar) {
            super(context, hVar.f16126a, hVar.f16127b);
            this.f50373d = hVar;
        }

        /* renamed from: a */
        public final void mo52111a(Context context, ServerId serverId, long j, SQLiteDatabase sQLiteDatabase) {
            C4776h hVar = this.f50373d;
            ContentValues contentValues = new ContentValues();
            contentValues.put("metro_id", Integer.valueOf(hVar.f16126a.f15142b));
            contentValues.put("revision", Long.valueOf(hVar.f16127b));
            contentValues.put("metro_language", hVar.f16128c);
            contentValues.put("metro_name", hVar.f16129d);
            contentValues.put("metro_class", hVar.f16130e);
            contentValues.put("time_zone_id", hVar.f16131f.getID());
            contentValues.put("bounds", C13641g.m34110B(hVar.f16132g, Polylon.f40986i));
            contentValues.put("default_location", C13641g.m34110B(hVar.f16139n, LatLonE6.f40978f));
            contentValues.put("templates_presentation_conf_data", C13641g.m34110B(hVar.f16135j, C19576b.m46958a(C17146f.f44382c)));
            contentValues.put("templates_data", C13641g.m34110B(hVar.f16136k, C19576b.m46958a(TemplateProtocol.C16179g.f42167h)));
            List<ReportCategoryType> list = hVar.f16138m;
            C19584i<ReportCategoryType> iVar = ReportCategoryType.CODER;
            contentValues.put("stops_category_report_data", C13641g.m34110B(list, C19576b.m46958a(iVar)));
            contentValues.put("lines_category_report_data", C13641g.m34110B(hVar.f16137l, C19576b.m46958a(iVar)));
            contentValues.put("country_id", Integer.valueOf(hVar.f16140o.f15142b));
            contentValues.put("country_name", hVar.f16141p);
            contentValues.put("country_code", hVar.f16142q);
            contentValues.put("local_day_change_time", Integer.valueOf(hVar.f16143r));
            sQLiteDatabase.insert("metro_info", (String) null, contentValues);
            C19855r i = ((C19391d) C19824g.this.f49320a).mo51807i();
            List<TransitType> a = this.f50373d.mo20299a();
            i.mo52156k(a);
            new C19855r.C19856a(context, i.mo52107d(), i.mo52109f(), a).run();
            C19844m c = ((C19391d) C19824g.this.f49320a).mo51801c();
            Collection<T> unmodifiableCollection = Collections.unmodifiableCollection(this.f50373d.f16134i);
            synchronized (c) {
                c.f50436b.clear();
                c.f50436b.mo24548c(unmodifiableCollection);
            }
            new C19844m.C19845a(context, c.mo52107d(), c.mo52109f(), unmodifiableCollection).run();
            C19808b bVar = (C19808b) ((C19391d) C19824g.this.f49320a).mo51794a(C19808b.class);
            List<T> unmodifiableList = Collections.unmodifiableList(this.f50373d.f16144s);
            bVar.mo52113j(unmodifiableList);
            new C19808b.C19809a(context, bVar.mo52107d(), bVar.mo52109f(), unmodifiableList).run();
        }
    }

    public C19824g(C20400b bVar) {
        super(bVar);
    }

    /* renamed from: a */
    public final void mo6588a(Context context) {
        SQLiteDatabase writableDatabase = DatabaseHelper.get(context).getWritableDatabase();
        ServerId d = mo52107d();
        long f = mo52109f();
        StatementHelper statementHelper = f50372b;
        SQLiteStatement prepare = statementHelper.prepare(writableDatabase);
        statementHelper.bindWhereArg(prepare, "metro_id", d);
        statementHelper.bindWhereArg(prepare, "revision", f);
        prepare.executeUpdateDelete();
    }

    /* renamed from: h */
    public final void mo52129h(Context context, C4776h hVar) {
        if (!hVar.f16126a.equals(mo52107d())) {
            StringBuilder k = C13555b.m33972k("Metro ids mismatch, dal metro id = ");
            k.append(mo52107d());
            k.append(", info metro id = ");
            k.append(hVar.f16126a);
            throw new IllegalStateException(k.toString());
        } else if (hVar.f16127b == mo52109f()) {
            new C19825a(context, hVar).run();
        } else {
            StringBuilder k2 = C13555b.m33972k("Revisions mismatch, dal revision = ");
            k2.append(mo52109f());
            k2.append(", info revision = ");
            k2.append(hVar.f16127b);
            throw new IllegalStateException(k2.toString());
        }
    }
}
