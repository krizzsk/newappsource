package com.veriff.sdk.internal.permission;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/permission/Permission;", "", "androidName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getAndroidName", "()Ljava/lang/String;", "Camera", "Microphone", "Nfc", "Companion", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.permission.c */
public enum C22254c {
    Camera("android.permission.CAMERA"),
    Microphone("android.permission.RECORD_AUDIO"),
    Nfc("android.permission.NFC");
    

    /* renamed from: d */
    public static final C22255a f56115d = null;

    /* renamed from: f */
    private final String f56117f;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/internal/permission/Permission$Companion;", "", "()V", "fromName", "Lcom/veriff/sdk/internal/permission/Permission;", "androidName", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.permission.c$a */
    public static final class C22255a {
        private C22255a() {
        }

        public /* synthetic */ C22255a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C22254c mo56208a(String str) {
            C24362h.m61211f(str, "androidName");
            for (C22254c cVar : C22254c.values()) {
                if (C24362h.m61206a(cVar.mo56207a(), str)) {
                    return cVar;
                }
            }
            return null;
        }
    }

    /* access modifiers changed from: public */
    static {
        f56115d = new C22255a((DefaultConstructorMarker) null);
    }

    private C22254c(String str) {
        this.f56117f = str;
    }

    /* renamed from: a */
    public final String mo56207a() {
        return this.f56117f;
    }
}
