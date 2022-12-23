package com.veriff.sdk.internal;

import com.appsflyer.ServerParameters;
import com.veriff.sdk.internal.C21430ba;
import com.veriff.sdk.internal.C22048nc;
import java.io.IOException;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001a\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0016R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\f0\u000b8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011¨\u0006\u0017"}, mo59060d2 = {"Lcom/veriff/sdk/internal/upload/KotshiMediaUploadStatusJsonAdapter;", "Lse/ansman/kotshi/NamedJsonAdapter;", "Lcom/veriff/sdk/internal/upload/MediaUploadStatus;", "Lcom/squareup/moshi/JsonReader;", "reader", "fromJson", "Lnb0/k;", "writer", "value", "Lbf0/d;", "toJson", "", "Lcom/squareup/moshi/k;", "adapters", "[Lcom/squareup/moshi/k;", "Lcom/squareup/moshi/JsonReader$a;", "labelKeyOptions", "Lcom/squareup/moshi/JsonReader$a;", "options", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.mt */
public final class C22038mt extends aed<C22048nc> {

    /* renamed from: a */
    private final C21420av<C22048nc>[] f55593a;

    /* renamed from: b */
    private final C21430ba.C21431a f55594b;

    /* renamed from: c */
    private final C21430ba.C21431a f55595c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22038mt(C21450bi biVar) {
        super("KotshiJsonAdapter(MediaUploadStatus)");
        C24362h.m61211f(biVar, "moshi");
        C21420av<C22048nc.C22052d> a = biVar.mo54335a((Type) C22048nc.C22052d.class);
        C24362h.m61210e(a, "moshi.adapter<MediaUploa…tatus.Queued::class.java)");
        C21420av<C22048nc.C22053e> a2 = biVar.mo54335a((Type) C22048nc.C22053e.class);
        C24362h.m61210e(a2, "moshi.adapter<MediaUploa…us.Uploading::class.java)");
        C21420av<C22048nc.C22050b> a3 = biVar.mo54335a((Type) C22048nc.C22050b.class);
        C24362h.m61210e(a3, "moshi.adapter<MediaUploa…us.Completed::class.java)");
        C21420av<C22048nc.C22051c> a4 = biVar.mo54335a((Type) C22048nc.C22051c.class);
        C24362h.m61210e(a4, "moshi.adapter<MediaUploa…tatus.Failed::class.java)");
        this.f55593a = new C21420av[]{a, a2, a3, a4};
        C21430ba.C21431a a5 = C21430ba.C21431a.m51080a("queued", "uploading", "completed", "failed");
        C24362h.m61210e(a5, "JsonReader.Options.of(\n …eted\",\n      \"failed\"\n  )");
        this.f55594b = a5;
        C21430ba.C21431a a6 = C21430ba.C21431a.m51080a(ServerParameters.STATUS);
        C24362h.m61210e(a6, "JsonReader.Options.of(\"status\")");
        this.f55595c = a6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0071, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0072, code lost:
        p584jl.C17885a.m44462t(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0075, code lost:
        throw r1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.veriff.sdk.internal.C22048nc mo54204a(com.veriff.sdk.internal.C21430ba r5) throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "reader"
            mf0.C24362h.m61211f(r5, r0)
            com.veriff.sdk.internal.ba$b r0 = r5.mo54249h()
            com.veriff.sdk.internal.ba$b r1 = com.veriff.sdk.internal.C21430ba.C21432b.NULL
            if (r0 != r1) goto L_0x0014
            java.lang.Object r5 = r5.mo54253l()
            com.veriff.sdk.internal.nc r5 = (com.veriff.sdk.internal.C22048nc) r5
            return r5
        L_0x0014:
            com.veriff.sdk.internal.ba r0 = r5.mo54258q()
            r1 = 0
            r2 = 0
            r0.mo54242b((boolean) r2)     // Catch:{ all -> 0x006f }
            r0.mo54246e()     // Catch:{ all -> 0x006f }
        L_0x0020:
            boolean r2 = r0.mo54248g()     // Catch:{ all -> 0x006f }
            if (r2 == 0) goto L_0x0067
            com.veriff.sdk.internal.ba$a r2 = r4.f55595c     // Catch:{ all -> 0x006f }
            int r2 = r0.mo54236a((com.veriff.sdk.internal.C21430ba.C21431a) r2)     // Catch:{ all -> 0x006f }
            r3 = -1
            if (r2 != r3) goto L_0x0036
            r0.mo54250i()     // Catch:{ all -> 0x006f }
            r0.mo54257p()     // Catch:{ all -> 0x006f }
            goto L_0x0020
        L_0x0036:
            com.veriff.sdk.internal.ba$a r2 = r4.f55594b     // Catch:{ all -> 0x006f }
            int r2 = r0.mo54241b((com.veriff.sdk.internal.C21430ba.C21431a) r2)     // Catch:{ all -> 0x006f }
            if (r2 == r3) goto L_0x004c
            com.veriff.sdk.internal.av<com.veriff.sdk.internal.nc>[] r3 = r4.f55593a     // Catch:{ all -> 0x006f }
            r2 = r3[r2]     // Catch:{ all -> 0x006f }
            java.lang.Object r5 = r2.mo54204a((com.veriff.sdk.internal.C21430ba) r5)     // Catch:{ all -> 0x006f }
            com.veriff.sdk.internal.nc r5 = (com.veriff.sdk.internal.C22048nc) r5     // Catch:{ all -> 0x006f }
            p584jl.C17885a.m44462t(r0, r1)
            return r5
        L_0x004c:
            com.veriff.sdk.internal.ax r5 = new com.veriff.sdk.internal.ax     // Catch:{ all -> 0x006f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x006f }
            r1.<init>()     // Catch:{ all -> 0x006f }
            java.lang.String r2 = "Expected one of [queued, uploading, completed, failed] for key 'status' but found "
            r1.append(r2)     // Catch:{ all -> 0x006f }
            java.lang.String r2 = r0.mo54251j()     // Catch:{ all -> 0x006f }
            r1.append(r2)     // Catch:{ all -> 0x006f }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x006f }
            r5.<init>(r1)     // Catch:{ all -> 0x006f }
            throw r5     // Catch:{ all -> 0x006f }
        L_0x0067:
            com.veriff.sdk.internal.ax r5 = new com.veriff.sdk.internal.ax     // Catch:{ all -> 0x006f }
            java.lang.String r1 = "Missing label for status"
            r5.<init>(r1)     // Catch:{ all -> 0x006f }
            throw r5     // Catch:{ all -> 0x006f }
        L_0x006f:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            p584jl.C17885a.m44462t(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.veriff.sdk.internal.C22038mt.mo54204a(com.veriff.sdk.internal.ba):com.veriff.sdk.internal.nc");
    }

    /* renamed from: a */
    public void mo54205a(C21437bf bfVar, C22048nc ncVar) throws IOException {
        C21420av<C22048nc> avVar;
        C24362h.m61211f(bfVar, "writer");
        if (ncVar == null) {
            bfVar.mo54276e();
            return;
        }
        if (ncVar instanceof C22048nc.C22052d) {
            avVar = this.f55593a[0];
        } else if (ncVar instanceof C22048nc.C22053e) {
            avVar = this.f55593a[1];
        } else if (ncVar instanceof C22048nc.C22050b) {
            avVar = this.f55593a[2];
        } else if (ncVar instanceof C22048nc.C22051c) {
            avVar = this.f55593a[3];
        } else {
            throw new NoWhenBranchMatchedException();
        }
        avVar.mo54205a(bfVar, ncVar);
    }
}
