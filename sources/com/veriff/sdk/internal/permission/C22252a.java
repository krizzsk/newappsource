package com.veriff.sdk.internal.permission;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import cf0.C21136j;
import cf0.C21147u;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.veriff.sdk.internal.permission.C22257e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import mf0.C24362h;
import p067e1.C4464a;
import p090g1.C4732a;
import p584jl.C17885a;
import rf0.C24806h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J+\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, mo59060d2 = {"Lcom/veriff/sdk/internal/permission/AndroidPermissions;", "Lcom/veriff/sdk/internal/permission/Permissions;", "", "requestCode", "", "Lcom/veriff/sdk/internal/permission/Permission;", "permissions", "Lbf0/d;", "askForPermissions", "permission", "", "hasPermission", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/veriff/sdk/internal/permission/Permissions$Listener;", "listener", "listen", "", "", "", "grantResults", "onPermissionResult", "(I[Ljava/lang/String;[I)V", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "<init>", "(Landroid/app/Activity;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.permission.a */
public final class C22252a implements C22257e {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CopyOnWriteArrayList<C22257e.C22258a> f56109a = new CopyOnWriteArrayList<>();

    /* renamed from: b */
    private final Activity f56110b;

    public C22252a(Activity activity) {
        C24362h.m61211f(activity, "activity");
        this.f56110b = activity;
    }

    /* renamed from: a */
    public boolean mo56205a(C22254c cVar) {
        C24362h.m61211f(cVar, "permission");
        return C4732a.checkSelfPermission(this.f56110b, cVar.mo56207a()) == 0;
    }

    /* renamed from: a */
    public void mo56202a(int i, List<? extends C22254c> list) {
        C24362h.m61211f(list, "permissions");
        Activity activity = this.f56110b;
        ArrayList arrayList = new ArrayList(C21136j.m49436X(list, 10));
        for (C22254c a : list) {
            arrayList.add(a.mo56207a());
        }
        Object[] array = arrayList.toArray(new String[0]);
        if (array != null) {
            C4464a.m11673a(activity, (String[]) array, i);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    /* renamed from: a */
    public void mo56204a(Lifecycle lifecycle, C22257e.C22258a aVar) {
        C24362h.m61211f(lifecycle, "lifecycle");
        C24362h.m61211f(aVar, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        this.f56109a.add(aVar);
        lifecycle.mo4224a(new AndroidPermissions$listen$1(this, aVar));
    }

    /* renamed from: a */
    public final void mo56203a(int i, String[] strArr, int[] iArr) {
        C22256d dVar;
        C24362h.m61211f(strArr, "permissions");
        C24362h.m61211f(iArr, "grantResults");
        int length = strArr.length;
        int length2 = iArr.length;
        if (length > length2) {
            length = length2;
        }
        C24806h C0 = C17885a.m44393C0(0, length);
        ArrayList arrayList = new ArrayList();
        Iterator it = C0.iterator();
        while (it.hasNext()) {
            int nextInt = ((C21147u) it).nextInt();
            C22254c a = C22254c.f56115d.mo56208a(strArr[nextInt]);
            if (a != null) {
                dVar = new C22256d(a, iArr[nextInt] == 0);
            } else {
                dVar = null;
            }
            if (dVar != null) {
                arrayList.add(dVar);
            }
        }
        for (C22257e.C22258a a2 : this.f56109a) {
            a2.mo56214a(i, arrayList);
        }
    }
}
