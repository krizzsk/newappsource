package p875vs;

import android.content.ContentValues;
import android.content.Context;
import com.moovit.commons.utils.SafeRunnable;
import com.moovit.database.DatabaseHelper;
import com.moovit.database.DatabaseUtils;
import p898wr.C20400b;
import p945yr.C20758c;
import p977zz.C20956o0;

/* renamed from: vs.b */
public final /* synthetic */ class C20223b implements SafeRunnable {

    /* renamed from: b */
    public final /* synthetic */ C20400b f51326b;

    /* renamed from: c */
    public final /* synthetic */ Context f51327c;

    /* renamed from: d */
    public final /* synthetic */ C20222a f51328d;

    public /* synthetic */ C20223b(C20400b bVar, Context context, C20222a aVar) {
        this.f51326b = bVar;
        this.f51327c = context;
        this.f51328d = aVar;
    }

    public final /* synthetic */ void onError(Throwable th) {
        C20956o0.m49073a(this, th);
    }

    public final /* synthetic */ void run() {
        C20956o0.m49074b(this);
    }

    public final void safeRun() {
        C20400b bVar = this.f51326b;
        Context context = this.f51327c;
        C20222a aVar = this.f51328d;
        C20758c cVar = (C20758c) bVar.mo51794a(C20758c.class);
        cVar.getClass();
        aVar.f51325i = aVar.f51324h;
        String createSelection = DatabaseUtils.createSelection("metro_id", "revision", "web_page_id");
        String[] createSelectionArgs = DatabaseUtils.createSelectionArgs(cVar.mo52108e(), cVar.mo52110g(), aVar.f51317a);
        ContentValues contentValues = new ContentValues();
        contentValues.put("web_page_shown_version", Long.valueOf(aVar.f51325i));
        DatabaseHelper.get(context).getWritableDatabase().update("web_pages", contentValues, createSelection, createSelectionArgs);
    }
}
