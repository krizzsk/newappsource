package p041ca;

import android.database.sqlite.SQLiteDatabase;
import c70.C13752e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.C14471a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.moovit.MoovitExecutors;
import com.moovit.app.mot.purchase.model.MotQrCodeScanResult;
import java.util.List;
import p041ca.C1835u;
import p304x.C7038d0;
import p805su.C19554k;
import p824tp.C19728f;
import p829tu.C19771b;

/* renamed from: ca.o */
public final /* synthetic */ class C1829o implements C1835u.C1836a, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ int f6334b;

    /* renamed from: c */
    public final /* synthetic */ Object f6335c;

    /* renamed from: d */
    public final /* synthetic */ Object f6336d;

    /* renamed from: e */
    public final /* synthetic */ Object f6337e;

    public /* synthetic */ C1829o(int i, Object obj, Object obj2, Object obj3) {
        this.f6334b = i;
        this.f6336d = obj;
        this.f6335c = obj2;
        this.f6337e = obj3;
    }

    public final Object apply(Object obj) {
        C1835u uVar = (C1835u) this.f6336d;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        uVar.getClass();
        sQLiteDatabase.compileStatement((String) this.f6335c).execute();
        C1835u.m5160w(sQLiteDatabase.rawQuery((String) this.f6337e, (String[]) null), new C7038d0(uVar, 3));
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public final Task then(Object obj) {
        switch (this.f6334b) {
            case 1:
                return ((FirebaseMessaging) this.f6336d).lambda$blockingGetToken$9((String) this.f6335c, (C14471a.C14472a) this.f6337e, (String) obj);
            default:
                int i = C19554k.f49700n;
                return Tasks.call(MoovitExecutors.f37327IO, new C19771b((C13752e) this.f6336d, (C19728f) this.f6335c, (List) obj, ((MotQrCodeScanResult) this.f6337e).f39063c));
        }
    }
}
