package p041ca;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import androidx.camera.view.C0655a;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import c70.C13752e;
import com.appboy.models.InAppMessageBase;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.MoovitExecutors;
import com.moovit.app.ads.C14734b;
import com.moovit.app.ads.C14766z;
import com.moovit.transit.LocationDescriptor;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p041ca.C1835u;
import p054d0.C4288j;
import p066e0.C4443m;
import p086fa.C4715a;
import p176n0.C5786e;
import p275u9.C6743n;
import p275u9.C6751s;
import p974zw.C20915a;

/* renamed from: ca.k */
public final /* synthetic */ class C1825k implements C1835u.C1836a, CallbackToFutureAdapter.C0674b, SuccessContinuation, NativeAd.OnNativeAdLoadedListener {

    /* renamed from: b */
    public final /* synthetic */ Object f6324b;

    /* renamed from: c */
    public final /* synthetic */ Object f6325c;

    /* renamed from: d */
    public final /* synthetic */ Object f6326d;

    public /* synthetic */ C1825k(Object obj, Object obj2, Object obj3) {
        this.f6324b = obj;
        this.f6325c = obj2;
        this.f6326d = obj3;
    }

    public Object apply(Object obj) {
        boolean z;
        long j;
        boolean z2;
        byte[] bArr;
        C1835u uVar = (C1835u) this.f6324b;
        C6743n nVar = (C6743n) this.f6325c;
        C6751s sVar = (C6751s) this.f6326d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        if (uVar.mo6660q().compileStatement("PRAGMA page_size").simpleQueryForLong() * uVar.mo6660q().compileStatement("PRAGMA page_count").simpleQueryForLong() >= uVar.f6355e.mo6626e()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            uVar.mo6644j(1, LogEventDropped.Reason.CACHE_FULL, nVar.mo22895g());
            return -1L;
        }
        Long r = C1835u.m5158r(sQLiteDatabase, sVar);
        if (r != null) {
            j = r.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", sVar.mo22910b());
            contentValues.put("priority", Integer.valueOf(C4715a.m12025a(sVar.mo22912d())));
            contentValues.put("next_request_ms", 0);
            if (sVar.mo22911c() != null) {
                contentValues.put(InAppMessageBase.EXTRAS, Base64.encodeToString(sVar.mo22911c(), 0));
            }
            j = sQLiteDatabase.insert("transport_contexts", (String) null, contentValues);
        }
        int d = uVar.f6355e.mo6625d();
        byte[] bArr2 = nVar.mo22892d().f20875b;
        if (bArr2.length <= d) {
            z2 = true;
        } else {
            z2 = false;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(j));
        contentValues2.put("transport_name", nVar.mo22895g());
        contentValues2.put("timestamp_ms", Long.valueOf(nVar.mo22893e()));
        contentValues2.put("uptime_ms", Long.valueOf(nVar.mo22896h()));
        contentValues2.put("payload_encoding", nVar.mo22892d().f20874a.f19742a);
        contentValues2.put("code", nVar.mo22891c());
        contentValues2.put("num_attempts", 0);
        contentValues2.put("inline", Boolean.valueOf(z2));
        if (z2) {
            bArr = bArr2;
        } else {
            bArr = new byte[0];
        }
        contentValues2.put("payload", bArr);
        long insert = sQLiteDatabase.insert("events", (String) null, contentValues2);
        if (!z2) {
            int ceil = (int) Math.ceil(((double) bArr2.length) / ((double) d));
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr2, (i - 1) * d, Math.min(i * d, bArr2.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(insert));
                contentValues3.put("sequence_num", Integer.valueOf(i));
                contentValues3.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", (String) null, contentValues3);
            }
        }
        for (Map.Entry next : Collections.unmodifiableMap(nVar.mo22890b()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(insert));
            contentValues4.put("name", (String) next.getKey());
            contentValues4.put("value", (String) next.getValue());
            sQLiteDatabase.insert("event_metadata", (String) null, contentValues4);
        }
        return Long.valueOf(insert);
    }

    public Object attachCompleter(CallbackToFutureAdapter.C0673a aVar) {
        C4288j jVar = (C4288j) this.f6325c;
        ((C0655a) this.f6324b).getClass();
        C5786e eVar = new C5786e(aVar, jVar);
        ((List) this.f6326d).add(eVar);
        ((C4443m) jVar).mo19976a(C14226d.m35352s0(), eVar);
        return "waitForCaptureResult";
    }

    public void onNativeAdLoaded(NativeAd nativeAd) {
        ((TaskCompletionSource) this.f6325c).trySetResult(new C14766z(nativeAd, (C14734b) this.f6326d));
    }

    public Task then(Object obj) {
        return Tasks.call(MoovitExecutors.f37327IO, new C20915a((C13752e) obj, (LocationDescriptor) this.f6325c, (Long) this.f6326d, (String) this.f6324b));
    }
}
