package com.veriff.sdk.internal;

import android.util.Base64;
import ce0.C21100e;
import cf0.C21136j;
import com.veriff.sdk.internal.C21931kq;
import com.veriff.sdk.internal.C21943ky;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C23816b;
import kotlin.collections.C23826d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mf0.C24362h;
import mobi.lab.veriff.util.C24465j;
import org.json.JSONObject;
import p584jl.C17885a;
import uh0.C25072a;

@Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0003\u0011\u0012\u0013B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrtdReader;", "", "chip", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "auth", "Lcom/veriff/sdk/internal/nfc/Authenticator;", "reader", "Lcom/veriff/sdk/internal/nfc/ChipFileReader;", "flags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "(Lcom/veriff/sdk/internal/nfc/ChipInterface;Lcom/veriff/sdk/internal/nfc/Authenticator;Lcom/veriff/sdk/internal/nfc/ChipFileReader;Lcom/veriff/sdk/internal/data/FeatureFlags;)V", "readMrtd", "Lcom/veriff/sdk/internal/nfc/MrtdReader$Result;", "mrzInfo", "Lcom/veriff/sdk/internal/nfc/MrzInfo;", "listener", "Lcom/veriff/sdk/internal/nfc/MrtdReader$ProgressListener;", "Companion", "ProgressListener", "Result", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
/* renamed from: com.veriff.sdk.internal.ld */
public final class C21952ld {

    /* renamed from: a */
    public static final C21953a f55465a = new C21953a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private final C21945kz f55466b;

    /* renamed from: c */
    private final C21936ks f55467c;

    /* renamed from: d */
    private final C21943ky f55468d;

    /* renamed from: e */
    private final C21789ix f55469e;

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrtdReader$Companion;", "", "()V", "getReadChunkSize", "", "chip", "Lcom/veriff/sdk/internal/nfc/ChipInterface;", "reader", "Lcom/veriff/sdk/internal/nfc/ChipFileReader;", "flags", "Lcom/veriff/sdk/internal/data/FeatureFlags;", "getReadChunkSize$veriff_library_dist", "(Lcom/veriff/sdk/internal/nfc/ChipInterface;Lcom/veriff/sdk/internal/nfc/ChipFileReader;Lcom/veriff/sdk/internal/data/FeatureFlags;)Ljava/lang/Integer;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ld$a */
    public static final class C21953a {
        private C21953a() {
        }

        public /* synthetic */ C21953a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Integer mo55772a(C21945kz kzVar, C21943ky kyVar, C21789ix ixVar) {
            C24362h.m61211f(kzVar, "chip");
            C24362h.m61211f(kyVar, "reader");
            C24362h.m61211f(ixVar, "flags");
            if (!kzVar.mo55752a()) {
                C21959le.f55472a.mo60705d("Transceiver does not support extended Lc/Le");
                return null;
            }
            try {
                byte[] a = C21943ky.C21944a.m53560a(kyVar, kzVar, (byte) 47, (byte) 1, ixVar.mo55429F(), false, 16, (Object) null);
                if (a == null) {
                    C21959le.f55472a.mo60705d("Chip does not have ATR info");
                    return null;
                }
                C21931kq a2 = C21931kq.f55435a.mo55747a(a);
                C21931kq.C21933b a3 = a2.mo55734a();
                if (a3 == null) {
                    C24465j a4 = C21959le.f55472a;
                    a4.mo60705d("Chip does not have capabilities DO in ATR (" + C21941kx.m53557f(a));
                    return null;
                } else if (!a3.mo55743a()) {
                    C21959le.f55472a.mo60705d("Chip does not support extended Lc/Le");
                    return null;
                } else {
                    C21931kq.C21932a b = a2.mo55735b();
                    if (b != null) {
                        return Integer.valueOf(C17885a.m44464u(b.mo55739a() - 64, ixVar.mo55427D(), ixVar.mo55428E()));
                    }
                    C21959le.f55472a.mo60705d("Chip does not advertise buffer sizes in ATR");
                    return null;
                }
            } catch (Throwable unused) {
                C21959le.f55472a.mo60705d("Failed to read buffer size from atr bytes");
                return null;
            }
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrtdReader$ProgressListener;", "", "Lcom/veriff/sdk/internal/nfc/MrtdFileId;", "id", "Lbf0/d;", "onFileRead", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ld$b */
    public interface C21954b {
        /* renamed from: a */
        void mo55773a(C21951lc lcVar);
    }

    @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0001\u0002\u0005\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrtdReader$Result;", "", "()V", "Failure", "Success", "Lcom/veriff/sdk/internal/nfc/MrtdReader$Result$Success;", "Lcom/veriff/sdk/internal/nfc/MrtdReader$Result$Failure;", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ld$c */
    public static abstract class C21955c {

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrtdReader$Result$Failure;", "Lcom/veriff/sdk/internal/nfc/MrtdReader$Result;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.ld$c$a */
        public static final class C21956a extends C21955c {

            /* renamed from: a */
            private final Throwable f55470a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21956a(Throwable th) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(th, "throwable");
                this.f55470a = th;
            }

            /* renamed from: a */
            public final Throwable mo55774a() {
                return this.f55470a;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C21956a) && C24362h.m61206a(this.f55470a, ((C21956a) obj).f55470a);
                }
                return true;
            }

            public int hashCode() {
                Throwable th = this.f55470a;
                if (th != null) {
                    return th.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Failure(throwable=");
                k.append(this.f55470a);
                k.append(")");
                return k.toString();
            }
        }

        @Metadata(mo59058bv = {1, 0, 3}, mo59059d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0006\u0010\u0011\u001a\u00020\u0005J\t\u0010\u0012\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, mo59060d2 = {"Lcom/veriff/sdk/internal/nfc/MrtdReader$Result$Success;", "Lcom/veriff/sdk/internal/nfc/MrtdReader$Result;", "files", "", "", "", "(Ljava/util/Map;)V", "getFiles", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toByteArray", "toString", "veriff-library_dist"}, mo59061k = 1, mo59062mv = {1, 4, 2})
        /* renamed from: com.veriff.sdk.internal.ld$c$b */
        public static final class C21957b extends C21955c {

            /* renamed from: a */
            private final Map<String, byte[]> f55471a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21957b(Map<String, byte[]> map) {
                super((DefaultConstructorMarker) null);
                C24362h.m61211f(map, "files");
                this.f55471a = map;
            }

            /* renamed from: a */
            public final byte[] mo55778a() {
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry next : this.f55471a.entrySet()) {
                    jSONObject.put((String) next.getKey(), Base64.encodeToString((byte[]) next.getValue(), 2));
                }
                String jSONObject2 = jSONObject.toString(0);
                C24362h.m61210e(jSONObject2, "jsonObject.toString(0)");
                byte[] bytes = jSONObject2.getBytes(C25072a.f63272a);
                C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                return bytes;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof C21957b) && C24362h.m61206a(this.f55471a, ((C21957b) obj).f55471a);
                }
                return true;
            }

            public int hashCode() {
                Map<String, byte[]> map = this.f55471a;
                if (map != null) {
                    return map.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder k = C13555b.m33972k("Success(files=");
                k.append(this.f55471a);
                k.append(")");
                return k.toString();
            }
        }

        private C21955c() {
        }

        public /* synthetic */ C21955c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, mo59060d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 4, 2})
    /* renamed from: com.veriff.sdk.internal.ld$d */
    public static final class C21958d<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            boolean z;
            C21951lc lcVar = (C21951lc) t;
            C21951lc lcVar2 = C21951lc.DG2;
            boolean z2 = true;
            if (lcVar != lcVar2) {
                z = true;
            } else {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            if (((C21951lc) t2) == lcVar2) {
                z2 = false;
            }
            return C21100e.m49298B(valueOf, Boolean.valueOf(z2));
        }
    }

    public C21952ld(C21945kz kzVar, C21936ks ksVar, C21943ky kyVar, C21789ix ixVar) {
        C24362h.m61211f(kzVar, "chip");
        C24362h.m61211f(ksVar, "auth");
        C24362h.m61211f(kyVar, "reader");
        C24362h.m61211f(ixVar, "flags");
        this.f55466b = kzVar;
        this.f55467c = ksVar;
        this.f55468d = kyVar;
        this.f55469e = ixVar;
    }

    /* renamed from: a */
    public final C21955c mo55771a(C21960lf lfVar, C21954b bVar) {
        int i;
        boolean z;
        C24362h.m61211f(lfVar, "mrzInfo");
        try {
            Integer a = f55465a.mo55772a(this.f55466b, this.f55468d, this.f55469e);
            if (a != null) {
                i = a.intValue();
            } else {
                i = this.f55469e.mo55429F();
            }
            C21959le.f55472a.mo60705d("Using chunksize of " + i + " to read bytes");
            C21959le.f55472a.mo60705d("Starting secure messaging");
            C21945kz a2 = this.f55467c.mo55748a(this.f55466b, lfVar);
            C21959le.f55472a.mo60705d("Secure messaging setup successful, reading data");
            List<C21951lc> e1 = C23816b.m58449e1(C21951lc.values(), new C21958d());
            ArrayList arrayList = new ArrayList(C21136j.m49436X(e1, 10));
            for (C21951lc lcVar : e1) {
                arrayList.add(new Pair(lcVar, this.f55468d.mo55749a(a2, (byte) 1, lcVar.mo55768a(), i, true)));
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                boolean z2 = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((byte[]) ((Pair) next).mo59067b()) != null) {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C21951lc lcVar2 = (C21951lc) ((Pair) it2.next()).mo59066a();
                if (bVar != null) {
                    bVar.mo55773a(lcVar2);
                }
            }
            ArrayList arrayList3 = new ArrayList(C21136j.m49436X(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                Pair pair = (Pair) it3.next();
                byte[] bArr = (byte[]) pair.mo59067b();
                String b = ((C21951lc) pair.mo59066a()).mo55769b();
                C24362h.m61208c(bArr);
                arrayList3.add(new Pair(b, bArr));
            }
            Map a0 = C23826d.m58536a0(arrayList3);
            C21951lc[] values = C21951lc.values();
            ArrayList arrayList4 = new ArrayList();
            for (C21951lc lcVar3 : values) {
                if (lcVar3.mo55770c()) {
                    arrayList4.add(lcVar3);
                }
            }
            Iterator it4 = arrayList4.iterator();
            while (it4.hasNext()) {
                C21951lc lcVar4 = (C21951lc) it4.next();
                byte[] bArr2 = (byte[]) a0.get(lcVar4.mo55769b());
                if (bArr2 != null) {
                    if (bArr2.length == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        throw new IOException("File " + lcVar4 + " is empty!");
                    }
                } else {
                    throw new IOException("File " + lcVar4 + " not in passport");
                }
            }
            return new C21955c.C21957b(a0);
        } catch (Throwable th) {
            return new C21955c.C21956a(th);
        }
    }
}
