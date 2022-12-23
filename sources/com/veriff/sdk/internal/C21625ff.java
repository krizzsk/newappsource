package com.veriff.sdk.internal;

import kotlin.Metadata;
import mf0.C24362h;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\r\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo59060d2 = {"Lcom/veriff/sdk/internal/Idler;", "", "()V", "listener", "Lcom/veriff/sdk/internal/Idler$Listener;", "getListener", "()Lcom/veriff/sdk/internal/Idler$Listener;", "setListener", "(Lcom/veriff/sdk/internal/Idler$Listener;)V", "obtainHandle", "Lcom/veriff/sdk/internal/Idler$Handle;", "tag", "Lcom/veriff/sdk/internal/Idler$Tag;", "Handle", "Listener", "Tag", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ff */
public final class C21625ff {

    /* renamed from: a */
    public static final C21625ff f54627a = new C21625ff();

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0004\u001a\u00020\u0002H&¨\u0006\u0005"}, mo59060d2 = {"Lcom/veriff/sdk/internal/Idler$Handle;", "", "Lbf0/d;", "release", "softRelease", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ff$a */
    public interface C21626a {
        /* renamed from: a */
        void mo54900a();

        /* renamed from: b */
        void mo54901b();
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/internal/Idler$Listener;", "", "", "tag", "Lbf0/d;", "increment", "decrement", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ff$b */
    public interface C21627b {
        void decrement(String str);

        void increment(String str);
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, mo59060d2 = {"Lcom/veriff/sdk/internal/Idler$Tag;", "", "tagName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getTagName", "()Ljava/lang/String;", "DEFAULT", "STATUS_CHECK_TIMER", "MEDIA_UPLOADER", "REQUEST_CALLBACK", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ff$c */
    public enum C21628c {
        DEFAULT("DEFAULT"),
        STATUS_CHECK_TIMER("STATUS_CHECK_TIMER"),
        MEDIA_UPLOADER("MEDIA_UPLOADER"),
        REQUEST_CALLBACK("REQUEST_CALLBACK");
        

        /* renamed from: f */
        private final String f54633f;

        private C21628c(String str) {
            this.f54633f = str;
        }

        /* renamed from: a */
        public final String mo54904a() {
            return this.f54633f;
        }
    }

    private C21625ff() {
    }

    /* renamed from: a */
    public final C21626a mo54898a() {
        return m52501a(this, (C21628c) null, 1, (Object) null);
    }

    /* renamed from: a */
    public final C21626a mo54899a(C21628c cVar) {
        C24362h.m61211f(cVar, "tag");
        return new C21632fj();
    }

    /* renamed from: a */
    public static /* synthetic */ C21626a m52501a(C21625ff ffVar, C21628c cVar, int i, Object obj) {
        if ((i & 1) != 0) {
            cVar = C21628c.DEFAULT;
        }
        return ffVar.mo54899a(cVar);
    }
}
