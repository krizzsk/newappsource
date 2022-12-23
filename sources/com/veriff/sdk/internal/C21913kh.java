package com.veriff.sdk.internal;

import bf0.C21050d;
import ff0.C23349c;
import gf0.C23413c;
import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;
import java.util.UUID;
import kf0.C23775c;
import kotlin.Metadata;
import kotlin.collections.C23816b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import lf0.C24236l;
import lf0.C24240p;
import mf0.C24362h;
import p584jl.C17885a;
import uh0.C25072a;
import wh0.C25177g;
import wh0.C25235z;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0006J#\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000bH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n \u0019*\u0004\u0018\u00010\u00180\u00188\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, mo59060d2 = {"Lcom/veriff/sdk/internal/io/FileStore;", "Lcom/veriff/sdk/internal/io/Store;", "", "key", "Lbf0/d;", "delete", "(Ljava/lang/String;Lff0/c;)Ljava/lang/Object;", "Ljava/io/File;", "getFile$veriff_library_dist", "(Ljava/lang/String;)Ljava/io/File;", "getFile", "", "read", "bytes", "write", "(Ljava/lang/String;[BLff0/c;)Ljava/lang/Object;", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "errorReporter", "Lcom/veriff/sdk/internal/errors/ErrorReporter;", "folder", "Ljava/io/File;", "Lkotlinx/coroutines/CoroutineDispatcher;", "io", "Lkotlinx/coroutines/CoroutineDispatcher;", "Ljava/security/MessageDigest;", "kotlin.jvm.PlatformType", "sha1", "Ljava/security/MessageDigest;", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lcom/veriff/sdk/internal/errors/ErrorReporter;Ljava/io/File;)V", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.kh */
public final class C21913kh implements C21919kj {

    /* renamed from: a */
    private final MessageDigest f55396a = MessageDigest.getInstance("SHA1");

    /* renamed from: b */
    private final CoroutineDispatcher f55397b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C21910kf f55398c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final File f55399d;

    @C23413c(mo58554c = "com.veriff.sdk.internal.io.FileStore$delete$2", mo58555f = "FileStore.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kh$a */
    public static final class C21914a extends SuspendLambda implements C24240p<C25235z, C23349c<? super Boolean>, Object> {

        /* renamed from: a */
        public int f55400a;

        /* renamed from: b */
        public final /* synthetic */ C21913kh f55401b;

        /* renamed from: c */
        public final /* synthetic */ String f55402c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21914a(C21913kh khVar, String str, C23349c cVar) {
            super(2, cVar);
            this.f55401b = khVar;
            this.f55402c = str;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C21914a(this.f55401b, this.f55402c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C21914a) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55400a == 0) {
                C17885a.m44475z0(obj);
                return Boolean.valueOf(this.f55401b.mo55697a(this.f55402c).delete());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo59060d2 = {"", "it", "", "invoke", "(B)Ljava/lang/CharSequence;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kh$b */
    public static final class C21915b extends Lambda implements C24236l<Byte, CharSequence> {

        /* renamed from: a */
        public static final C21915b f55403a = new C21915b();

        public C21915b() {
            super(1);
        }

        /* renamed from: a */
        public final CharSequence mo55701a(byte b) {
            return C21941kx.m53552b(b);
        }

        public /* synthetic */ Object invoke(Object obj) {
            return mo55701a(((Number) obj).byteValue());
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.io.FileStore$read$2", mo58555f = "FileStore.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kh$c */
    public static final class C21916c extends SuspendLambda implements C24240p<C25235z, C23349c<? super byte[]>, Object> {

        /* renamed from: a */
        public int f55404a;

        /* renamed from: b */
        public final /* synthetic */ C21913kh f55405b;

        /* renamed from: c */
        public final /* synthetic */ String f55406c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21916c(C21913kh khVar, String str, C23349c cVar) {
            super(2, cVar);
            this.f55405b = khVar;
            this.f55406c = str;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C21916c(this.f55405b, this.f55406c, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C21916c) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55404a == 0) {
                C17885a.m44475z0(obj);
                try {
                    File a = this.f55405b.mo55697a(this.f55406c);
                    if (!a.exists()) {
                        return null;
                    }
                    return C17885a.m44451n0(a);
                } catch (IOException e) {
                    this.f55405b.f55398c.mo55690a(e, "FileStore.read", C21720gj.file_handling);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @C23413c(mo58554c = "com.veriff.sdk.internal.io.FileStore$write$2", mo58555f = "FileStore.kt", mo58556l = {}, mo58557m = "invokeSuspend")
    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H@¢\u0006\u0004\b\u0002\u0010\u0003"}, mo59060d2 = {"Lwh0/z;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.kh$d */
    public static final class C21917d extends SuspendLambda implements C24240p<C25235z, C23349c<? super Boolean>, Object> {

        /* renamed from: a */
        public int f55407a;

        /* renamed from: b */
        public final /* synthetic */ C21913kh f55408b;

        /* renamed from: c */
        public final /* synthetic */ String f55409c;

        /* renamed from: d */
        public final /* synthetic */ byte[] f55410d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21917d(C21913kh khVar, String str, byte[] bArr, C23349c cVar) {
            super(2, cVar);
            this.f55408b = khVar;
            this.f55409c = str;
            this.f55410d = bArr;
        }

        public final C23349c<C21050d> create(Object obj, C23349c<?> cVar) {
            C24362h.m61211f(cVar, "completion");
            return new C21917d(this.f55408b, this.f55409c, this.f55410d, cVar);
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C21917d) create(obj, (C23349c) obj2)).invokeSuspend(C21050d.f52856a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.f55407a == 0) {
                C17885a.m44475z0(obj);
                try {
                    this.f55408b.f55399d.mkdirs();
                    File a = this.f55408b.mo55697a(this.f55409c);
                    File T0 = C23775c.m58353T0(a, UUID.randomUUID() + ".tmp");
                    C17885a.m44397E0(T0, this.f55410d);
                    a.delete();
                    return Boolean.valueOf(T0.renameTo(a));
                } catch (IOException e) {
                    this.f55408b.f55398c.mo55690a(e, "FileStore.write", C21720gj.file_handling);
                    return null;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public C21913kh(CoroutineDispatcher coroutineDispatcher, C21910kf kfVar, File file) {
        C24362h.m61211f(coroutineDispatcher, "io");
        C24362h.m61211f(kfVar, "errorReporter");
        C24362h.m61211f(file, "folder");
        this.f55397b = coroutineDispatcher;
        this.f55398c = kfVar;
        this.f55399d = file;
    }

    /* renamed from: a */
    public Object mo55699a(String str, byte[] bArr, C23349c<? super C21050d> cVar) {
        Object e = C25177g.m63221e(this.f55397b, new C21917d(this, str, bArr, (C23349c) null), cVar);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return C21050d.f52856a;
    }

    /* renamed from: b */
    public Object mo55700b(String str, C23349c<? super C21050d> cVar) {
        Object e = C25177g.m63221e(this.f55397b, new C21914a(this, str, (C23349c) null), cVar);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        return C21050d.f52856a;
    }

    /* renamed from: a */
    public Object mo55698a(String str, C23349c<? super byte[]> cVar) {
        return C25177g.m63221e(this.f55397b, new C21916c(this, str, (C23349c) null), cVar);
    }

    /* renamed from: a */
    public final File mo55697a(String str) {
        C24362h.m61211f(str, LinksConfiguration.KEY_KEY);
        MessageDigest messageDigest = this.f55396a;
        byte[] bytes = str.getBytes(C25072a.f63272a);
        C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        C24362h.m61210e(digest, "sha1.digest(key.toByteArray(Charsets.UTF_8))");
        return C23775c.m58352S0(this.f55399d, C23816b.m58443Y0(digest, "", C21915b.f55403a));
    }
}
