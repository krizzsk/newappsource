package com.veriff.sdk.internal;

import com.veriff.sdk.internal.permission.C22254c;
import com.veriff.sdk.internal.permission.C22257e;
import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, mo59060d2 = {"Lcom/veriff/sdk/views/intro/IntroPermissionChecks;", "Lcom/veriff/sdk/views/intro/PermissionChecks;", "permissions", "Lcom/veriff/sdk/internal/permission/Permissions;", "(Lcom/veriff/sdk/internal/permission/Permissions;)V", "isAudioRecordingPermitted", "", "isVideoRecordingPermitted", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.qx */
public final class C22360qx implements C22374rf {

    /* renamed from: a */
    private final C22257e f56420a;

    public C22360qx(C22257e eVar) {
        C24362h.m61211f(eVar, "permissions");
        this.f56420a = eVar;
    }

    /* renamed from: k */
    public boolean mo56418k() {
        return this.f56420a.mo56205a(C22254c.Camera);
    }

    /* renamed from: l */
    public boolean mo56419l() {
        return this.f56420a.mo56205a(C22254c.Microphone);
    }
}
