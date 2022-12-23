package p065e;

import android.content.Intent;
import androidx.activity.ComponentActivity;
import com.usebutton.sdk.internal.api.AppActionRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import mf0.C24362h;
import p065e.C4410a;
import p090g1.C4732a;
import p389bl.C13637c;

/* renamed from: e.b */
public final class C4412b extends C4410a<String[], Map<String, Boolean>> {
    /* renamed from: a */
    public final Intent mo3996a(ComponentActivity componentActivity, Object obj) {
        String[] strArr = (String[]) obj;
        C24362h.m61211f(componentActivity, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(strArr, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
        C24362h.m61210e(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
        return putExtra;
    }

    /* renamed from: b */
    public final C4410a.C4411a mo19921b(ComponentActivity componentActivity, Object obj) {
        boolean z;
        boolean z2;
        String[] strArr = (String[]) obj;
        C24362h.m61211f(componentActivity, AppActionRequest.KEY_CONTEXT);
        C24362h.m61211f(strArr, "input");
        boolean z3 = true;
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C4410a.C4411a(C23826d.m58530U());
        }
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (C4732a.checkSelfPermission(componentActivity, strArr[i]) == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                z3 = false;
                break;
            }
            i++;
        }
        if (!z3) {
            return null;
        }
        int z4 = C13637c.m34083z(strArr.length);
        if (z4 < 16) {
            z4 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z4);
        for (String pair : strArr) {
            Pair pair2 = new Pair(pair, Boolean.TRUE);
            linkedHashMap.put(pair2.mo59068c(), pair2.mo59069d());
        }
        return new C4410a.C4411a(linkedHashMap);
    }

    /* renamed from: c */
    public final Object mo3997c(int i, Intent intent) {
        boolean z;
        if (i != -1) {
            return C23826d.m58530U();
        }
        if (intent == null) {
            return C23826d.m58530U();
        }
        String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
        int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
        if (intArrayExtra == null || stringArrayExtra == null) {
            return C23826d.m58530U();
        }
        ArrayList arrayList = new ArrayList(intArrayExtra.length);
        for (int i2 : intArrayExtra) {
            if (i2 == 0) {
                z = true;
            } else {
                z = false;
            }
            arrayList.add(Boolean.valueOf(z));
        }
        return C23826d.m58536a0(C23825c.m58505Q0(C23816b.m58438T0(stringArrayExtra), arrayList));
    }
}
