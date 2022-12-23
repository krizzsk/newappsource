package com.veriff.sdk.internal.permission;

import androidx.lifecycle.Lifecycle;
import java.util.List;
import kotlin.Metadata;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¨\u0006\u0012"}, mo59060d2 = {"Lcom/veriff/sdk/internal/permission/Permissions;", "", "", "requestCode", "", "Lcom/veriff/sdk/internal/permission/Permission;", "permissions", "Lbf0/d;", "askForPermissions", "permission", "", "hasPermission", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcom/veriff/sdk/internal/permission/Permissions$Listener;", "listener", "listen", "Listener", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.permission.e */
public interface C22257e {

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¨\u0006\t"}, mo59060d2 = {"Lcom/veriff/sdk/internal/permission/Permissions$Listener;", "", "", "requestCode", "", "Lcom/veriff/sdk/internal/permission/PermissionResult;", "results", "Lbf0/d;", "onPermissionResults", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.permission.e$a */
    public interface C22258a {
        /* renamed from: a */
        void mo56214a(int i, List<C22256d> list);
    }

    /* renamed from: a */
    void mo56202a(int i, List<? extends C22254c> list);

    /* renamed from: a */
    void mo56204a(Lifecycle lifecycle, C22258a aVar);

    /* renamed from: a */
    boolean mo56205a(C22254c cVar);
}
