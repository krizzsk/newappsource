package p041ca;

import android.database.Cursor;
import b40.C1476d;
import c00.C13723g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.micromobility.ride.MicroMobilityRide;
import com.moovit.search.C7604a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import l30.C5577i;
import p041ca.C1835u;
import p237r9.C6269b;
import p275u9.C6735h;
import p275u9.C6742m;
import p275u9.C6751s;
import p927xw.C20649p;

/* renamed from: ca.q */
public final /* synthetic */ class C1831q implements C1835u.C1836a, SuccessContinuation {

    /* renamed from: b */
    public final /* synthetic */ int f6342b;

    /* renamed from: c */
    public final /* synthetic */ Object f6343c;

    /* renamed from: d */
    public final /* synthetic */ Object f6344d;

    /* renamed from: e */
    public final /* synthetic */ Object f6345e;

    public /* synthetic */ C1831q(int i, Object obj, Serializable serializable, Object obj2) {
        this.f6342b = i;
        this.f6343c = obj;
        this.f6344d = serializable;
        this.f6345e = obj2;
    }

    /* JADX INFO: finally extract failed */
    public final Object apply(Object obj) {
        boolean z;
        C1835u uVar;
        C6269b bVar;
        C6269b bVar2;
        C1835u uVar2 = (C1835u) this.f6343c;
        List list = (List) this.f6344d;
        C6751s sVar = (C6751s) this.f6345e;
        Cursor cursor = (Cursor) obj;
        uVar2.getClass();
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            if (cursor.getInt(7) != 0) {
                z = true;
            } else {
                z = false;
            }
            C6735h.C6736a aVar = new C6735h.C6736a();
            aVar.f20857f = new HashMap();
            aVar.mo22901d(cursor.getString(1));
            aVar.f20855d = Long.valueOf(cursor.getLong(2));
            aVar.f20856e = Long.valueOf(cursor.getLong(3));
            if (z) {
                String string = cursor.getString(4);
                if (string == null) {
                    bVar2 = C1835u.f6351g;
                } else {
                    bVar2 = new C6269b(string);
                }
                aVar.mo22900c(new C6742m(bVar2, cursor.getBlob(5)));
                uVar = uVar2;
            } else {
                String string2 = cursor.getString(4);
                if (string2 == null) {
                    bVar = C1835u.f6351g;
                } else {
                    bVar = new C6269b(string2);
                }
                Cursor query = uVar2.mo6660q().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, (String) null, (String) null, "sequence_num");
                try {
                    C6269b bVar3 = C1835u.f6351g;
                    ArrayList arrayList = new ArrayList();
                    int i = 0;
                    while (query.moveToNext()) {
                        byte[] blob = query.getBlob(0);
                        arrayList.add(blob);
                        i += blob.length;
                    }
                    byte[] bArr = new byte[i];
                    int i2 = 0;
                    int i3 = 0;
                    while (i2 < arrayList.size()) {
                        byte[] bArr2 = (byte[]) arrayList.get(i2);
                        C1835u uVar3 = uVar2;
                        System.arraycopy(bArr2, 0, bArr, i3, bArr2.length);
                        i3 += bArr2.length;
                        i2++;
                        uVar2 = uVar3;
                    }
                    uVar = uVar2;
                    query.close();
                    aVar.mo22900c(new C6742m(bVar, bArr));
                } catch (Throwable th) {
                    query.close();
                    throw th;
                }
            }
            if (!cursor.isNull(6)) {
                aVar.f20853b = Integer.valueOf(cursor.getInt(6));
            }
            list.add(new C1810b(j, sVar, aVar.mo22899b()));
            uVar2 = uVar;
        }
        return null;
    }

    public final Task then(Object obj) {
        switch (this.f6342b) {
            case 1:
                String str = (String) this.f6343c;
                String str2 = (String) this.f6344d;
                C5577i iVar = C5577i.f18275d;
                MicroMobilityRide microMobilityRide = (MicroMobilityRide) C13723g.m34286g(((C1476d) obj).f5361a, new C20649p(1, str, str2, (Set) this.f6345e));
                if (microMobilityRide != null) {
                    return Tasks.forResult(microMobilityRide);
                }
                return Tasks.forException(new ApplicationBugException(C25541a.m63882l("Couldn't find user wallet ride with service id= ", str, ", item id=", str2)));
            default:
                C7604a aVar = (C7604a) this.f6343c;
                String str3 = (String) this.f6344d;
                LatLonE6 latLonE6 = (LatLonE6) this.f6345e;
                if (obj != null) {
                    C7604a.C7605a aVar2 = new C7604a.C7605a(str3, aVar.mo23836b(aVar.f23152a, aVar.f23153b, str3, obj));
                    aVar.f23154c.put(aVar.mo23775a(str3, latLonE6), aVar2);
                    return Tasks.forResult(aVar2);
                }
                aVar.getClass();
                throw new IllegalStateException("Search response may not be null!");
        }
    }
}
