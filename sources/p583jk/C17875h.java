package p583jk;

import android.os.IBinder;
import android.os.IInterface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraUnavailableException;
import androidx.lifecycle.C0998c;
import androidx.lifecycle.C1019k0;
import bf0.C21050d;
import bi0.C21073k;
import bi0.C21079q;
import cf0.C21130d;
import cf0.C21132f;
import ch0.C21203b;
import ci0.C21207b;
import com.google.android.play.core.appupdate.C14226d;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.masabi.justride.sdk.exception.JustRideSdkException;
import com.moovit.app.search.SearchAction;
import com.moovit.app.search.locations.SearchLocationItem;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.view.p340cc.C7959a;
import com.squareup.moshi.C8011k;
import com.tranzmate.moovit.protocol.payments.MVCashPaymentData;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData;
import com.tranzmate.moovit.protocol.payments.MVGooglePayPaymentData;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import h60.C17353s0;
import hh0.C23502m;
import java.io.PrintStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawTypeImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C23979b;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import lh0.C24289p;
import lh0.C24298r;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24373a;
import mh0.C24378d;
import nb0.C12947k;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24620i;
import oh0.C24623l;
import okio.SegmentedByteString;
import p070e4.C4548c;
import p070e4.C4549d;
import p193o4.C5976b;
import p283v4.C6857b;
import p283v4.C6860e;
import p283v4.C6862g;
import p389bl.C13637c;
import p404ce.C13791f;
import p404ce.C13806s;
import p406cg.C13821j;
import p434dd.C16553g;
import p434dd.C16576r0;
import p434dd.C16578s0;
import p434dd.C16580t0;
import p584jl.C17885a;
import p584jl.C17886b;
import p627lg.C18202a;
import p627lg.C18203b;
import p705on.C18799g;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import wh0.C25184i0;
import wh0.C25206p1;
import wh0.C25219u;
import wh0.C25235z;
import xg0.C25260c;
import yf0.C25295c;
import zf0.C25432c;

/* renamed from: jk.h */
public class C17875h implements C13821j, C16553g, C13791f, C23502m, PaymentGatewayToken.C16326a {

    /* renamed from: b */
    public static final /* synthetic */ C17875h f45858b = new C17875h();

    /* renamed from: c */
    public static final /* synthetic */ C17875h f45859c = new C17875h();

    /* renamed from: d */
    public static final C17875h f45860d = new C17875h();

    /* renamed from: e */
    public static final C17875h f45861e = new C17875h();

    /* renamed from: f */
    public static final C17875h f45862f = new C17875h();

    /* renamed from: g */
    public static final C21079q f45863g = new C21079q("EMPTY");

    /* renamed from: h */
    public static final C21079q f45864h = new C21079q("OFFER_SUCCESS");

    /* renamed from: i */
    public static final C21079q f45865i = new C21079q("OFFER_FAILED");

    /* renamed from: j */
    public static final C21079q f45866j = new C21079q("POLL_FAILED");

    /* renamed from: k */
    public static final C21079q f45867k = new C21079q("ENQUEUE_FAILED");

    /* renamed from: l */
    public static final C21079q f45868l = new C21079q("ON_CLOSE_HANDLER_INVOKED");

    /* renamed from: m */
    public static final C17875h f45869m = new C17875h();

    /* renamed from: A */
    public static boolean m44277A(C25432c cVar) {
        C24362h.m61211f(cVar, "mutable");
        String str = C25295c.f63582a;
        return C25295c.f63591j.containsKey(C25260c.m63390g(cVar));
    }

    /* renamed from: B */
    public static boolean m44278B(List list) {
        return list == null || list.size() == 0;
    }

    /* renamed from: C */
    public static final boolean m44279C(String str, int i) {
        char charAt = str.charAt(i);
        return 'A' <= charAt && charAt < '[';
    }

    /* renamed from: D */
    public static final List m44280D(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C24362h.m61210e(singletonList, "singletonList(element)");
        return singletonList;
    }

    /* renamed from: E */
    public static final List m44281E(Object... objArr) {
        C24362h.m61211f(objArr, "elements");
        if (objArr.length > 0) {
            return C21132f.m49428K0(objArr);
        }
        return EmptyList.f60173b;
    }

    /* renamed from: F */
    public static final List m44282F(Object obj) {
        if (obj != null) {
            return m44280D(obj);
        }
        return EmptyList.f60173b;
    }

    /* renamed from: G */
    public static C25432c m44283G(C17875h hVar, C25066c cVar, C23867c cVar2) {
        hVar.getClass();
        C24362h.m61211f(cVar2, "builtIns");
        String str = C25295c.f63582a;
        C25065b f = C25295c.m63525f(cVar);
        if (f != null) {
            return cVar2.mo59387j(f.mo61569b());
        }
        return null;
    }

    /* renamed from: H */
    public static final ArrayList m44284H(Object... objArr) {
        C24362h.m61211f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C21130d(objArr, true));
    }

    /* renamed from: I */
    public static final List m44285I(List list) {
        int size = list.size();
        if (size == 0) {
            return EmptyList.f60173b;
        }
        if (size != 1) {
            return list;
        }
        return m44280D(list.get(0));
    }

    /* renamed from: J */
    public static final Object m44286J(Object obj, LockFreeLinkedListNode lockFreeLinkedListNode) {
        if (obj == null) {
            return lockFreeLinkedListNode;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(lockFreeLinkedListNode);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(lockFreeLinkedListNode);
        return arrayList;
    }

    /* renamed from: L */
    public static final Object m44287L(Object obj) {
        if (obj instanceof C25219u) {
            return C17885a.m44400G(((C25219u) obj).f63493a);
        }
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r0 != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0061  */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m44288M(ug0.C25069e r7) {
        /*
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r7, r0)
            boolean r0 = r7.f63264c
            r1 = 1
            r2 = 0
            java.lang.String r3 = "asString()"
            if (r0 == 0) goto L_0x000e
            goto L_0x003f
        L_0x000e:
            java.lang.String r0 = r7.mo61604f()
            mf0.C24362h.m61210e(r0, r3)
            java.util.HashSet r4 = wg0.C25152e.f63429a
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L_0x0040
            r4 = 0
        L_0x001e:
            int r5 = r0.length()
            if (r4 >= r5) goto L_0x003b
            char r5 = r0.charAt(r4)
            int r4 = r4 + 1
            boolean r6 = java.lang.Character.isLetterOrDigit(r5)
            if (r6 != 0) goto L_0x0036
            r6 = 95
            if (r5 == r6) goto L_0x0036
            r5 = 1
            goto L_0x0037
        L_0x0036:
            r5 = 0
        L_0x0037:
            if (r5 == 0) goto L_0x001e
            r0 = 1
            goto L_0x003c
        L_0x003b:
            r0 = 0
        L_0x003c:
            if (r0 == 0) goto L_0x003f
            goto L_0x0040
        L_0x003f:
            r1 = 0
        L_0x0040:
            if (r1 == 0) goto L_0x0061
            r0 = 96
            java.lang.String r7 = r7.mo61604f()
            mf0.C24362h.m61210e(r7, r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r0 = "`"
            java.lang.String r7 = mf0.C24362h.m61216k(r0, r7)
            goto L_0x0068
        L_0x0061:
            java.lang.String r7 = r7.mo61604f()
            mf0.C24362h.m61210e(r7, r3)
        L_0x0068:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p583jk.C17875h.m44288M(ug0.e):java.lang.String");
    }

    /* renamed from: N */
    public static final String m44289N(List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C25069e eVar = (C25069e) it.next();
            if (sb.length() > 0) {
                sb.append(".");
            }
            sb.append(m44288M(eVar));
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: O */
    public static final int m44290O(SegmentedByteString segmentedByteString, int i) {
        int i2;
        C24362h.m61211f(segmentedByteString, "$this$segment");
        int[] iArr = segmentedByteString.f62334f;
        int i3 = i + 1;
        int i4 = 0;
        int length = segmentedByteString.f62333e.length;
        C24362h.m61211f(iArr, "$this$binarySearch");
        int i5 = length - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = iArr[i2];
                if (i6 >= i3) {
                    if (i6 <= i3) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = (-i4) - 1;
                break;
            }
        }
        if (i2 >= 0) {
            return i2;
        }
        return ~i2;
    }

    /* renamed from: R */
    public static final String m44291R(C25432c cVar, String str) {
        String str2;
        C24362h.m61211f(cVar, "classDescriptor");
        C24362h.m61211f(str, "jvmDescriptor");
        String str3 = C25295c.f63582a;
        C25067d i = DescriptorUtilsKt.m60286g(cVar).mo61589i();
        C24362h.m61210e(i, "fqNameSafe.toUnsafe()");
        C25065b g = C25295c.m63526g(i);
        if (g == null) {
            str2 = C13637c.m34073o(cVar, C17886b.f45890d);
        } else {
            str2 = C21203b.m49811b(g).mo53547d();
            C24362h.m61210e(str2, "byClassId(it).internalName");
        }
        return C23979b.m59205f(str2, str);
    }

    /* renamed from: S */
    public static boolean m44292S(C24623l lVar, C24618g gVar, C24618g gVar2) {
        boolean z;
        boolean z2;
        if (lVar.mo42728c0(gVar) == lVar.mo42728c0(gVar2) && lVar.mo42712P(gVar) == lVar.mo42712P(gVar2)) {
            if (lVar.mo42716T(gVar) == null) {
                z = true;
            } else {
                z = false;
            }
            if (lVar.mo42716T(gVar2) == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z == z2 && lVar.mo42747n(lVar.mo42733f(gVar), lVar.mo42733f(gVar2))) {
                if (lVar.mo42758x(gVar, gVar2)) {
                    return true;
                }
                int c0 = lVar.mo42728c0(gVar);
                int i = 0;
                while (i < c0) {
                    int i2 = i + 1;
                    C24620i J = lVar.mo42706J(gVar, i);
                    C24620i J2 = lVar.mo42706J(gVar2, i);
                    if (lVar.mo42734f0(J) != lVar.mo42734f0(J2)) {
                        return false;
                    }
                    if (!lVar.mo42734f0(J) && (lVar.mo42736g0(J) != lVar.mo42736g0(J2) || !m44293T(lVar, lVar.mo42744k0(J), lVar.mo42744k0(J2)))) {
                        return false;
                    }
                    i = i2;
                }
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public static boolean m44293T(C24623l lVar, C24617f fVar, C24617f fVar2) {
        if (fVar == fVar2) {
            return true;
        }
        C24312z e = lVar.mo42731e(fVar);
        C24312z e2 = lVar.mo42731e(fVar2);
        if (e != null && e2 != null) {
            return m44292S(lVar, e, e2);
        }
        C24298r E = lVar.mo42701E(fVar);
        C24298r E2 = lVar.mo42701E(fVar2);
        if (E == null || E2 == null || !m44292S(lVar, lVar.mo42725b(E), lVar.mo42725b(E2)) || !m44292S(lVar, lVar.mo42727c(E), lVar.mo42727c(E2))) {
            return false;
        }
        return true;
    }

    /* renamed from: U */
    public static final void m44294U() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    /* renamed from: V */
    public static final String m44295V(String str) {
        boolean z;
        C24362h.m61211f(str, "<this>");
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            i++;
            if ('A' > charAt || charAt >= '[') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                charAt = Character.toLowerCase(charAt);
            }
            sb.append(charAt);
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "builder.toString()");
        return sb2;
    }

    /* renamed from: W */
    public static void m44296W(int i, C8011k kVar, C12947k kVar2, String str) {
        kVar.mo11094e(kVar2, Integer.valueOf(i));
        kVar2.mo25077w(str);
    }

    /* renamed from: b */
    public static void m44297b(C4549d dVar, C6860e eVar) {
        if (dVar == null) {
            PrintStream printStream = System.out;
            StringBuilder k = C13555b.m33972k("Null context in ");
            k.append(C5976b.class.getName());
            printStream.println(k.toString());
            return;
        }
        C4548c cVar = dVar.f15676d;
        if (cVar != null) {
            cVar.mo20056a(eVar);
        }
    }

    /* renamed from: e */
    public static void m44298e(C4549d dVar, URL url) {
        C5976b x = m44313x(dVar);
        if (x == null) {
            m44297b(dVar, new C6862g("Null ConfigurationWatchList. Cannot add " + url, f45860d));
            return;
        }
        m44297b(dVar, new C6857b("Adding [" + url + "] to configuration watch list.", f45860d));
        x.mo21961m(url);
    }

    /* renamed from: h */
    public static final ArrayList m44299h(Object... objArr) {
        C24362h.m61211f(objArr, "elements");
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new C21130d(objArr, true));
    }

    /* renamed from: i */
    public static final String m44300i(String str) {
        boolean z;
        C24362h.m61211f(str, "<this>");
        boolean z2 = false;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return str;
        }
        char charAt = str.charAt(0);
        if ('a' <= charAt && charAt < '{') {
            z2 = true;
        }
        if (!z2) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        String substring = str.substring(1);
        C24362h.m61210e(substring, "this as java.lang.String).substring(startIndex)");
        return upperCase + substring;
    }

    /* renamed from: k */
    public static void m44301k(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: l */
    public static void m44302l(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    /* renamed from: n */
    public static void m44303n(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* renamed from: o */
    public static void m44304o(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: p */
    public static void m44305p(boolean z, String str) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: q */
    public static void m44306q(Object obj) {
        if (obj == null) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: r */
    public static void m44307r(Object obj, String str) {
        if (obj == null) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: s */
    public static C25432c m44308s(C25432c cVar) {
        C25067d g = C25260c.m63390g(cVar);
        String str = C25295c.f63582a;
        C25066c cVar2 = C25295c.f63592k.get(g);
        if (cVar2 != null) {
            return DescriptorUtilsKt.m60284e(cVar).mo59387j(cVar2);
        }
        throw new IllegalArgumentException("Given class " + cVar + " is not a " + "read-only" + " collection");
    }

    /* renamed from: t */
    public static TypeCheckerState m44309t(boolean z, boolean z2, C24373a aVar, KotlinTypePreparator kotlinTypePreparator, C24378d dVar, int i) {
        boolean z3;
        if ((i & 2) != 0) {
            z3 = true;
        } else {
            z3 = z2;
        }
        if ((i & 4) != 0) {
            aVar = C14226d.f35756k;
        }
        C24373a aVar2 = aVar;
        if ((i & 8) != 0) {
            kotlinTypePreparator = KotlinTypePreparator.C24163a.f61359b;
        }
        KotlinTypePreparator kotlinTypePreparator2 = kotlinTypePreparator;
        if ((i & 16) != 0) {
            dVar = C24378d.C24379a.f61715b;
        }
        C24378d dVar2 = dVar;
        C24362h.m61211f(aVar2, "typeSystemContext");
        C24362h.m61211f(kotlinTypePreparator2, "kotlinTypePreparator");
        C24362h.m61211f(dVar2, "kotlinTypeRefiner");
        return new TypeCheckerState(z, z3, aVar2, kotlinTypePreparator2, dVar2);
    }

    /* renamed from: u */
    public static CameraUnavailableException m44310u(CameraAccessExceptionCompat cameraAccessExceptionCompat) {
        int a = cameraAccessExceptionCompat.mo2308a();
        int i = 1;
        if (a != 1) {
            if (a == 2) {
                i = 2;
            } else if (a == 3) {
                i = 3;
            } else if (a == 4) {
                i = 4;
            } else if (a == 5) {
                i = 5;
            } else if (a != 10001) {
                i = 0;
            } else {
                i = 6;
            }
        }
        return new CameraUnavailableException(i, cameraAccessExceptionCompat);
    }

    /* renamed from: v */
    public static C18799g m44311v(C7959a aVar) {
        String str = aVar.f24094c;
        if (str.length() == 1) {
            str = C25541a.m63881k("0", str);
        }
        String str2 = aVar.f24095d;
        if (str2.length() > 2) {
            str2 = str2.substring(str2.length() - 2);
        }
        String str3 = aVar.f24097f;
        String str4 = aVar.f24093b;
        String k = C25541a.m63881k(str, str2);
        String str5 = aVar.f24096e;
        String str6 = aVar.f24099h;
        Boolean bool = Boolean.FALSE;
        if (str3 == null) {
            throw new JustRideSdkException("Card holder name required");
        } else if (str4 == null) {
            throw new JustRideSdkException("Full PAN required");
        } else if (k == null) {
            throw new JustRideSdkException("Card expiry date required");
        } else if (str5 == null) {
            throw new JustRideSdkException("Security code required");
        } else if (str6 != null) {
            return new C18799g(str3, str4, k, str5, str6, (String) null, bool);
        } else {
            throw new JustRideSdkException("Postal code required");
        }
    }

    /* renamed from: w */
    public static boolean m44312w(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: x */
    public static C5976b m44313x(C4549d dVar) {
        if (dVar == null) {
            return null;
        }
        return (C5976b) dVar.mo20059b("CONFIGURATION_WATCH_LIST");
    }

    /* renamed from: y */
    public static final int m44314y(List list) {
        C24362h.m61211f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: z */
    public static final C25235z m44315z(C1019k0 k0Var) {
        C24362h.m61211f(k0Var, "<this>");
        C25235z zVar = (C25235z) k0Var.getTag("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY");
        if (zVar != null) {
            return zVar;
        }
        C25206p1 a = C17884p.m44356a();
        C21207b bVar = C25184i0.f63459a;
        Object tagIfAbsent = k0Var.setTagIfAbsent("androidx.lifecycle.ViewModelCoroutineScope.JOB_KEY", new C0998c(a.mo53082y(C21073k.f52890a.mo60300z())));
        C24362h.m61210e(tagIfAbsent, "setTagIfAbsent(\n        …Main.immediate)\n        )");
        return (C25235z) tagIfAbsent;
    }

    /* renamed from: K */
    public SearchAction mo45816K(SearchLocationItem searchLocationItem) {
        return null;
    }

    /* renamed from: P */
    public void mo22541P(boolean z) {
    }

    /* renamed from: Q */
    public void mo22540Q(boolean z) {
    }

    /* renamed from: a */
    public C24307v mo50433a(ProtoBuf$Type protoBuf$Type, String str, C24312z zVar, C24312z zVar2) {
        C24362h.m61211f(protoBuf$Type, "proto");
        C24362h.m61211f(str, "flexibleId");
        C24362h.m61211f(zVar, "lowerBound");
        C24362h.m61211f(zVar2, "upperBound");
        if (!C24362h.m61206a(str, "kotlin.jvm.PlatformType")) {
            return C24289p.m60914d("Error java flexible type with id: " + str + ". (" + zVar + ".." + zVar2 + ')');
        } else if (protoBuf$Type.mo59993j(JvmProtoBuf.f61005g)) {
            return new RawTypeImpl(zVar, zVar2);
        } else {
            return KotlinTypeFactory.m60474c(zVar, zVar2);
        }
    }

    /* renamed from: c */
    public Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        C21050d dVar = (C21050d) obj;
        C24362h.m61211f(cashGatewayToken, FirebaseMessagingService.EXTRA_TOKEN);
        return MVPaymentProvider.m24870k(new MVCashPaymentData());
    }

    /* renamed from: d */
    public Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        C21050d dVar = (C21050d) obj;
        C24362h.m61211f(clearanceProviderGatewayToken, FirebaseMessagingService.EXTRA_TOKEN);
        return MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
    }

    /* renamed from: f */
    public Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        C21050d dVar = (C21050d) obj;
        C24362h.m61211f(paymentMethodGatewayToken, FirebaseMessagingService.EXTRA_TOKEN);
        return MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
    }

    /* renamed from: g */
    public Object mo40737g() {
        return new TreeSet();
    }

    /* renamed from: j */
    public Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        C21050d dVar = (C21050d) obj;
        C24362h.m61211f(googlePayGatewayToken, FirebaseMessagingService.EXTRA_TOKEN);
        return MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        C18202a aVar = (C18202a) sVar.mo314b(C18202a.class);
        return new C18203b();
    }

    public Object zza(IBinder iBinder) {
        int i = C16578s0.f43233b;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.assetpacks.protocol.IAssetModuleService");
        if (queryLocalInterface instanceof C16580t0) {
            return (C16580t0) queryLocalInterface;
        }
        return new C16576r0(iBinder);
    }
}
