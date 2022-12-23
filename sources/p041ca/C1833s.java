package p041ca;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p041ca.C1835u;
import p325y9.C7348a;
import p325y9.C7350b;
import p325y9.C7351c;
import p325y9.C7352d;
import p325y9.C7353e;
import p337z9.C7506a;

/* renamed from: ca.s */
public final /* synthetic */ class C1833s implements C1835u.C1836a {

    /* renamed from: b */
    public final /* synthetic */ C1835u f6347b;

    /* renamed from: c */
    public final /* synthetic */ Map f6348c;

    /* renamed from: d */
    public final /* synthetic */ C7348a.C7349a f6349d;

    public /* synthetic */ C1833s(C1835u uVar, Map map, C7348a.C7349a aVar) {
        this.f6347b = uVar;
        this.f6348c = map;
        this.f6349d = aVar;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        C1835u uVar = this.f6347b;
        Map map = this.f6348c;
        C7348a.C7349a aVar = this.f6349d;
        Cursor cursor = (Cursor) obj;
        uVar.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            int i = cursor.getInt(1);
            LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
            if (i != reason.getNumber()) {
                LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                if (i != reason2.getNumber()) {
                    reason2 = LogEventDropped.Reason.CACHE_FULL;
                    if (i != reason2.getNumber()) {
                        reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                        if (i != reason2.getNumber()) {
                            reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                            if (i != reason2.getNumber()) {
                                reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                if (i != reason2.getNumber()) {
                                    reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                    if (i != reason2.getNumber()) {
                                        C7506a.m17226a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
                                    }
                                }
                            }
                        }
                    }
                }
                reason = reason2;
            }
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(new LogEventDropped(j, reason));
        }
        for (Map.Entry entry : map.entrySet()) {
            int i2 = C7351c.f22578c;
            new ArrayList();
            aVar.f22574b.add(new C7351c((String) entry.getKey(), Collections.unmodifiableList((List) entry.getValue())));
        }
        long V = uVar.f6353c.mo20139V();
        SQLiteDatabase q = uVar.mo6660q();
        q.beginTransaction();
        try {
            C7353e eVar = (C7353e) C1835u.m5160w(q.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C1834t(V));
            q.setTransactionSuccessful();
            q.endTransaction();
            aVar.f22573a = eVar;
            aVar.f22575c = new C7350b(new C7352d(uVar.mo6660q().compileStatement("PRAGMA page_size").simpleQueryForLong() * uVar.mo6660q().compileStatement("PRAGMA page_count").simpleQueryForLong(), C1816e.f6319a.f6303b));
            aVar.f22576d = uVar.f6356f.get();
            return new C7348a(aVar.f22573a, Collections.unmodifiableList(aVar.f22574b), aVar.f22575c, aVar.f22576d);
        } catch (Throwable th) {
            q.endTransaction();
            throw th;
        }
    }
}
