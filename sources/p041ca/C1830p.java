package p041ca;

import android.database.sqlite.SQLiteDatabase;
import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.MoovitExecutors;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import l30.C5577i;
import p041ca.C1835u;
import p325y9.C7348a;
import t30.C6579s;

/* renamed from: ca.p */
public final /* synthetic */ class C1830p implements C1835u.C1836a, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ String f6338b;

    /* renamed from: c */
    public final /* synthetic */ Object f6339c;

    /* renamed from: d */
    public final /* synthetic */ Object f6340d;

    /* renamed from: e */
    public final /* synthetic */ Object f6341e;

    public /* synthetic */ C1830p(String str, String str2, String str3, ArrayList arrayList) {
        this.f6338b = str;
        this.f6339c = str2;
        this.f6340d = str3;
        this.f6341e = arrayList;
    }

    public final Object apply(Object obj) {
        C1835u uVar = (C1835u) this.f6339c;
        String str = this.f6338b;
        uVar.getClass();
        return (C7348a) C1835u.m5160w(((SQLiteDatabase) obj).rawQuery(str, new String[0]), new C1833s(uVar, (Map) this.f6340d, (C7348a.C7349a) this.f6341e));
    }

    public final Task then(Object obj) {
        C13752e eVar = (C13752e) obj;
        C5577i iVar = C5577i.f18275d;
        return Tasks.call(MoovitExecutors.f37327IO, new C6579s(eVar, this.f6338b, (String) this.f6339c, (String) this.f6340d, (List) this.f6341e));
    }
}
