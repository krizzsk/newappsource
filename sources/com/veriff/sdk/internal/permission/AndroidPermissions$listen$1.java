package com.veriff.sdk.internal.permission;

import androidx.lifecycle.C1031o;
import androidx.lifecycle.C1045x;
import androidx.lifecycle.Lifecycle;
import com.veriff.sdk.internal.permission.C22257e;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0004"}, mo59060d2 = {"com/veriff/sdk/internal/permission/AndroidPermissions$listen$1", "Landroidx/lifecycle/o;", "Lbf0/d;", "removeListener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
public final class AndroidPermissions$listen$1 implements C1031o {

    /* renamed from: a */
    public final /* synthetic */ C22252a f56107a;

    /* renamed from: b */
    public final /* synthetic */ C22257e.C22258a f56108b;

    public AndroidPermissions$listen$1(C22252a aVar, C22257e.C22258a aVar2) {
        this.f56107a = aVar;
        this.f56108b = aVar2;
    }

    @C1045x(Lifecycle.Event.ON_DESTROY)
    public final void removeListener() {
        this.f56107a.f56109a.remove(this.f56108b);
    }
}
