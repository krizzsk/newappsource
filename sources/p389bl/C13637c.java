package p389bl;

import ac0.C7557a;
import ag0.C20989e;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import androidx.recyclerview.widget.RecyclerView;
import bi0.C21065d;
import bi0.C21073k;
import bi0.C21077o;
import bi0.C21079q;
import cc0.C7585a;
import cf0.C21136j;
import cf0.C21140n;
import ci0.C21207b;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.cubic.umo.p045ad.ext.types.UMOAdKitBannerParams;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.cubic.umo.p045ad.types.AKHostedAdTemplate;
import com.cubic.umo.p045ad.types.AKHostedAdTemplatesData;
import com.cubic.umo.p045ad.types.AKHostedAdTemplatesDataJsonAdapter;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.play.core.internal.zzbt;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonDataException;
import com.umo.ads.p345h.zzd;
import ef0.C23289a;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.AbstractMap;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jg0.C23726g;
import kg0.C23780d;
import kotlin.Pair;
import kotlin.collections.C23825c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23899b;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23910d;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlinx.coroutines.C24182a;
import lf0.C24236l;
import lf0.C24240p;
import lh0.C24286o;
import lh0.C24298r;
import lh0.C24306u0;
import lh0.C24307v;
import mc0.C12912d;
import mf0.C24361g;
import mf0.C24362h;
import mf0.C24368m;
import mf0.C24369n;
import nc0.C12954d;
import og0.C24589d;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24623l;
import p025b6.C1486a;
import p025b6.C1492e;
import p043ch.qos.logback.classic.Logger;
import p120i5.C5282c;
import p172m9.C5720b;
import p221q6.C6181b;
import p258t4.C6588b;
import p277ub.C6774a0;
import p277ub.C6804s;
import p311x6.C7160a;
import p358af.C13437d;
import p370ar.C13506a;
import p404ce.C13791f;
import p404ce.C13806s;
import p434dd.C16571p;
import p434dd.C16581u;
import p434dd.C16583v;
import p434dd.C16590z;
import p530hd.C17382g;
import p583jk.C17875h;
import p583jk.C17884p;
import p626lf.C18201b;
import p627lg.C18202a;
import p627lg.C18214m;
import p627lg.C18216o;
import p651mh.C18370a;
import p746qh.C19125e;
import p988j$.util.concurrent.ConcurrentHashMap;
import rh0.C24823d;
import tf0.C24979k;
import ug0.C25069e;
import wb0.C13233c;
import wh0.C25155a1;
import wh0.C25184i0;
import wh0.C25206p1;
import wh0.C25219u;
import wh0.C25230y;
import wh0.C25232y0;
import xg0.C25261d;
import yb0.C13301f;
import yh0.C25319k;
import zf0.C25432c;
import zf0.C25433c0;
import zf0.C25435d0;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25452k0;
import zf0.C25454l0;
import zf0.C25491z;

/* renamed from: bl.c */
public class C13637c implements C13791f, C6588b, C1486a, RewardItem, C16571p {

    /* renamed from: b */
    public static final C13506a f33635b = new C13506a(1);

    /* renamed from: c */
    public static final /* synthetic */ C13637c f33636c = new C13637c();

    /* renamed from: d */
    public static final int[] f33637d = new int[0];

    /* renamed from: e */
    public static final long[] f33638e = new long[0];

    /* renamed from: f */
    public static final Object[] f33639f = new Object[0];

    /* renamed from: g */
    public static final byte[] f33640g = {0, 0, 0, 1};

    /* renamed from: h */
    public static final String[] f33641h = {"", "A", "B", "C"};

    /* renamed from: i */
    public static final C21079q f33642i = new C21079q("RESUME_TOKEN");

    /* renamed from: j */
    public static final C21079q f33643j = new C21079q("REMOVED_TASK");

    /* renamed from: k */
    public static final C21079q f33644k = new C21079q("CLOSED_EMPTY");

    /* renamed from: l */
    public static final C13637c f33645l = new C13637c();

    /* renamed from: m */
    public static boolean f33646m;

    /* renamed from: n */
    public static boolean f33647n;

    /* renamed from: o */
    public static C7585a f33648o;

    /* renamed from: p */
    public static ConcurrentHashMap f33649p;

    public /* synthetic */ C13637c() {
    }

    /* renamed from: A */
    public static final Map m34046A(Pair pair) {
        C24362h.m61211f(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.mo59068c(), pair.mo59069d());
        C24362h.m61210e(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0153, code lost:
        if (r6 == false) goto L_0x0156;
     */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016b  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m34047B(lh0.C24307v r19, qg0.C24768q r20, lf0.C24241q r21) {
        /*
            r0 = r19
            r1 = r20
            r2 = r21
            qg0.i r3 = qg0.C24751i.f62658a
            jl.b r4 = p584jl.C17886b.f45890d
            java.lang.String r5 = "kotlinType"
            mf0.C24362h.m61211f(r0, r5)
            java.lang.String r5 = "writeGenericType"
            mf0.C24362h.m61211f(r2, r5)
            boolean r5 = p172m9.C5720b.m14073x(r19)
            r6 = 0
            r7 = 0
            if (r5 == 0) goto L_0x009c
            cg0.z r3 = wf0.C25143g.f63418a
            p172m9.C5720b.m14073x(r19)
            kotlin.reflect.jvm.internal.impl.builtins.c r8 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60522g(r19)
            ag0.e r9 = r19.getAnnotations()
            lh0.v r10 = p172m9.C5720b.m14064o(r19)
            java.util.List r3 = p172m9.C5720b.m14065p(r19)
            java.util.ArrayList r4 = new java.util.ArrayList
            r5 = 10
            int r5 = cf0.C21136j.m49436X(r3, r5)
            r4.<init>(r5)
            java.util.Iterator r3 = r3.iterator()
        L_0x0040:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0054
            java.lang.Object r5 = r3.next()
            lh0.l0 r5 = (lh0.C24281l0) r5
            lh0.v r5 = r5.getType()
            r4.add(r5)
            goto L_0x0040
        L_0x0054:
            ag0.e$a$a r3 = ag0.C20989e.C20990a.f52739a
            cg0.z r5 = wf0.C25143g.f63418a
            lh0.i0 r5 = r5.mo53481j()
            p172m9.C5720b.m14069t(r19)
            java.util.List r11 = r19.mo60410N0()
            java.lang.Object r11 = kotlin.collections.C23825c.m58522s0(r11)
            lh0.l0 r11 = (lh0.C24281l0) r11
            lh0.v r11 = r11.getType()
            java.lang.String r12 = "arguments.last().type"
            mf0.C24362h.m61210e(r11, r12)
            lh0.n0 r11 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60516a(r11)
            java.util.List r11 = p583jk.C17875h.m44280D(r11)
            lh0.z r3 = kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory.m60477f(r3, r5, r11, r6, r7)
            java.util.ArrayList r11 = kotlin.collections.C23825c.m58528y0(r3, r4)
            kotlin.reflect.jvm.internal.impl.builtins.c r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60522g(r19)
            lh0.z r12 = r3.mo59393p()
            r13 = 0
            lh0.z r3 = p172m9.C5720b.m14053d(r8, r9, r10, r11, r12, r13)
            boolean r0 = r19.mo60412P0()
            lh0.z r0 = r3.mo59559S0(r0)
            java.lang.Object r0 = m34047B(r0, r1, r2)
            return r0
        L_0x009c:
            com.google.android.play.core.appupdate.d r5 = com.google.android.play.core.appupdate.C14226d.f35756k
            oh0.j r8 = r5.mo42748o(r0)
            boolean r9 = mh0.C24373a.C24374a.m61265G(r5, r8)
            java.lang.String r10 = "["
            r11 = 5
            r12 = 47
            r13 = 46
            r14 = 2
            r15 = 1
            if (r9 != 0) goto L_0x00b3
            goto L_0x0168
        L_0x00b3:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r9 = mh0.C24373a.C24374a.m61317s(r5, r8)
            if (r9 == 0) goto L_0x00fe
            qg0.h$c r8 = r3.mo61230c(r9)
            boolean r9 = mh0.C24373a.C24374a.m61275Q(r5, r0)
            if (r9 != 0) goto L_0x00d3
            ug0.c r9 = hg0.C23480p.f59282o
            java.lang.String r6 = "ENHANCED_NULLABILITY_ANNOTATION"
            mf0.C24362h.m61210e(r9, r6)
            boolean r5 = mh0.C24373a.C24374a.m61259A(r5, r0, r9)
            if (r5 == 0) goto L_0x00d1
            goto L_0x00d3
        L_0x00d1:
            r5 = 0
            goto L_0x00d4
        L_0x00d3:
            r5 = 1
        L_0x00d4:
            java.lang.String r6 = "possiblyPrimitiveType"
            mf0.C24362h.m61211f(r8, r6)
            if (r5 == 0) goto L_0x0169
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r5 = r8.f62657i
            if (r5 == 0) goto L_0x0169
            ug0.c r5 = r5.getWrapperFqName()
            if (r5 == 0) goto L_0x00fa
            java.lang.String r5 = r5.mo61580b()
            java.lang.String r5 = r5.replace(r13, r12)
            if (r5 == 0) goto L_0x00f6
            qg0.h$b r8 = new qg0.h$b
            r8.<init>(r5)
            goto L_0x0169
        L_0x00f6:
            ch0.C21203b.m49810a(r11)
            throw r7
        L_0x00fa:
            ch0.C21203b.m49810a(r14)
            throw r7
        L_0x00fe:
            kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType r6 = mh0.C24373a.C24374a.m61316r(r5, r8)
            if (r6 == 0) goto L_0x0115
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r5 = kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType.get((kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType) r6)
            java.lang.String r5 = r5.getDesc()
            java.lang.String r5 = mf0.C24362h.m61216k(r5, r10)
            qg0.h r8 = qg0.C24751i.m62271a(r5)
            goto L_0x0169
        L_0x0115:
            boolean r6 = mh0.C24373a.C24374a.m61281W(r5, r8)
            if (r6 == 0) goto L_0x0168
            ug0.d r5 = mh0.C24373a.C24374a.m61314p(r5, r8)
            java.lang.String r6 = yf0.C25295c.f63582a
            ug0.b r5 = yf0.C25295c.m63526g(r5)
            if (r5 == 0) goto L_0x0168
            boolean r6 = r1.f62672g
            if (r6 != 0) goto L_0x0156
            java.util.List<yf0.c$a> r6 = yf0.C25295c.f63593l
            boolean r8 = r6 instanceof java.util.Collection
            if (r8 == 0) goto L_0x0138
            boolean r8 = r6.isEmpty()
            if (r8 == 0) goto L_0x0138
            goto L_0x0152
        L_0x0138:
            java.util.Iterator r6 = r6.iterator()
        L_0x013c:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0152
            java.lang.Object r8 = r6.next()
            yf0.c$a r8 = (yf0.C25295c.C25296a) r8
            ug0.b r8 = r8.f63594a
            boolean r8 = mf0.C24362h.m61206a(r8, r5)
            if (r8 == 0) goto L_0x013c
            r6 = 1
            goto L_0x0153
        L_0x0152:
            r6 = 0
        L_0x0153:
            if (r6 == 0) goto L_0x0156
            goto L_0x0168
        L_0x0156:
            ch0.b r5 = ch0.C21203b.m49811b(r5)
            java.lang.String r5 = r5.mo53547d()
            java.lang.String r6 = "byClassId(classId).internalName"
            mf0.C24362h.m61210e(r5, r6)
            qg0.h$b r8 = r3.mo61229b(r5)
            goto L_0x0169
        L_0x0168:
            r8 = r7
        L_0x0169:
            if (r8 != 0) goto L_0x02d1
            lh0.i0 r5 = r19.mo60411O0()
            boolean r6 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor
            if (r6 == 0) goto L_0x0188
            kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor r5 = (kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor) r5
            lh0.v r0 = r5.f61333a
            if (r0 == 0) goto L_0x0182
            lh0.u0 r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60528m(r0)
            java.lang.Object r0 = m34047B(r0, r1, r2)
            return r0
        L_0x0182:
            java.util.LinkedHashSet<lh0.v> r0 = r5.f61334b
            r4.mo50439d(r0)
            throw r7
        L_0x0188:
            zf0.e r5 = r5.mo53460o()
            if (r5 == 0) goto L_0x02c5
            boolean r6 = lh0.C24289p.m60918h(r5)
            if (r6 == 0) goto L_0x019d
            java.lang.String r0 = "error/NonExistentClass"
            qg0.h$b r0 = r3.mo61229b(r0)
            zf0.c r5 = (zf0.C25432c) r5
            return r0
        L_0x019d:
            boolean r6 = r5 instanceof zf0.C25432c
            if (r6 == 0) goto L_0x0216
            boolean r7 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58687z(r19)
            if (r7 == 0) goto L_0x0216
            java.util.List r4 = r19.mo60410N0()
            int r4 = r4.size()
            if (r4 != r15) goto L_0x020e
            java.util.List r0 = r19.mo60410N0()
            r4 = 0
            java.lang.Object r0 = r0.get(r4)
            lh0.l0 r0 = (lh0.C24281l0) r0
            lh0.v r4 = r0.getType()
            java.lang.String r5 = "memberProjection.type"
            mf0.C24362h.m61210e(r4, r5)
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = r0.mo60241b()
            kotlin.reflect.jvm.internal.impl.types.Variance r6 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r5 != r6) goto L_0x01d4
            java.lang.String r0 = "java/lang/Object"
            qg0.h$b r0 = r3.mo61229b(r0)
            goto L_0x0201
        L_0x01d4:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r0.mo60241b()
            java.lang.String r5 = "memberProjection.projectionKind"
            mf0.C24362h.m61210e(r0, r5)
            boolean r5 = r1.f62668c
            if (r5 == 0) goto L_0x01e2
            goto L_0x01fc
        L_0x01e2:
            int[] r5 = qg0.C24768q.C24769a.f62676a
            int r0 = r0.ordinal()
            r0 = r5[r0]
            if (r0 == r15) goto L_0x01f8
            if (r0 == r14) goto L_0x01f3
            qg0.q r0 = r1.f62671f
            if (r0 != 0) goto L_0x01fd
            goto L_0x01fc
        L_0x01f3:
            qg0.q r0 = r1.f62674i
            if (r0 != 0) goto L_0x01fd
            goto L_0x01fc
        L_0x01f8:
            qg0.q r0 = r1.f62673h
            if (r0 != 0) goto L_0x01fd
        L_0x01fc:
            r0 = r1
        L_0x01fd:
            java.lang.Object r0 = m34047B(r4, r0, r2)
        L_0x0201:
            java.lang.String r0 = r3.mo61232e(r0)
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r10)
            qg0.h r0 = qg0.C24751i.m62271a(r0)
            return r0
        L_0x020e:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "arrays must have one type argument"
            r0.<init>(r1)
            throw r0
        L_0x0216:
            if (r6 == 0) goto L_0x0295
            boolean r6 = xg0.C25261d.m63407b(r5)
            if (r6 == 0) goto L_0x0251
            boolean r6 = r1.f62667b
            if (r6 != 0) goto L_0x0251
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            oh0.f r6 = p584jl.C17885a.m44470x(r0, r6)
            lh0.v r6 = (lh0.C24307v) r6
            if (r6 == 0) goto L_0x0251
            qg0.q r0 = new qg0.q
            boolean r8 = r1.f62666a
            boolean r10 = r1.f62668c
            boolean r11 = r1.f62669d
            boolean r12 = r1.f62670e
            qg0.q r13 = r1.f62671f
            boolean r14 = r1.f62672g
            qg0.q r15 = r1.f62673h
            qg0.q r1 = r1.f62674i
            r9 = 1
            r17 = 0
            r18 = 512(0x200, float:7.175E-43)
            r7 = r0
            r16 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.lang.Object r0 = m34047B(r6, r0, r2)
            return r0
        L_0x0251:
            boolean r6 = r1.f62668c
            if (r6 == 0) goto L_0x0267
            r6 = r5
            zf0.c r6 = (zf0.C25432c) r6
            ug0.e r7 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.f60309e
            ug0.d r7 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60349O
            boolean r6 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58683c(r6, r7)
            if (r6 == 0) goto L_0x0267
            qg0.h$b r3 = r3.mo61231d()
            goto L_0x0291
        L_0x0267:
            zf0.c r5 = (zf0.C25432c) r5
            zf0.c r6 = r5.mo53407a()
            java.lang.String r7 = "descriptor.original"
            mf0.C24362h.m61210e(r6, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r6 = r5.mo53513p()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r7 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_ENTRY
            if (r6 != r7) goto L_0x0280
            zf0.g r5 = r5.mo53399b()
            zf0.c r5 = (zf0.C25432c) r5
        L_0x0280:
            zf0.c r5 = r5.mo53407a()
            java.lang.String r6 = "enumClassIfEnumEntry.original"
            mf0.C24362h.m61210e(r5, r6)
            java.lang.String r4 = m34073o(r5, r4)
            qg0.h$b r3 = r3.mo61229b(r4)
        L_0x0291:
            r2.invoke(r0, r3, r1)
            return r3
        L_0x0295:
            boolean r3 = r5 instanceof zf0.C25448i0
            if (r3 == 0) goto L_0x02a6
            zf0.i0 r5 = (zf0.C25448i0) r5
            lh0.v r0 = kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt.m60523h(r5)
            lf0.q<java.lang.Object, java.lang.Object, java.lang.Object, bf0.d> r2 = kotlin.reflect.jvm.internal.impl.utils.FunctionsKt.f61393b
            java.lang.Object r0 = m34047B(r0, r1, r2)
            return r0
        L_0x02a6:
            boolean r3 = r5 instanceof zf0.C25446h0
            if (r3 == 0) goto L_0x02b9
            boolean r3 = r1.f62675j
            if (r3 == 0) goto L_0x02b9
            zf0.h0 r5 = (zf0.C25446h0) r5
            lh0.z r0 = r5.mo58970L()
            java.lang.Object r0 = m34047B(r0, r1, r2)     // Catch:{ all -> 0x0302 }
            return r0
        L_0x02b9:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Unknown type "
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x02c5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "no descriptor for type constructor of "
            java.lang.String r0 = mf0.C24362h.m61216k(r0, r2)
            r1.<init>(r0)
            throw r1
        L_0x02d1:
            boolean r3 = r1.f62666a
            if (r3 == 0) goto L_0x02fe
            boolean r3 = r8 instanceof qg0.C24747h.C24750c
            if (r3 == 0) goto L_0x02fe
            r3 = r8
            qg0.h$c r3 = (qg0.C24747h.C24750c) r3
            kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r3 = r3.f62657i
            if (r3 == 0) goto L_0x02fe
            ug0.c r3 = r3.getWrapperFqName()
            if (r3 == 0) goto L_0x02fa
            java.lang.String r3 = r3.mo61580b()
            java.lang.String r3 = r3.replace(r13, r12)
            if (r3 == 0) goto L_0x02f6
            qg0.h$b r8 = new qg0.h$b
            r8.<init>(r3)
            goto L_0x02fe
        L_0x02f6:
            ch0.C21203b.m49810a(r11)
            throw r7
        L_0x02fa:
            ch0.C21203b.m49810a(r14)
            throw r7
        L_0x02fe:
            r2.invoke(r0, r8, r1)
            return r8
        L_0x0302:
            r0 = move-exception
            r1 = r0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13637c.m34047B(lh0.v, qg0.q, lf0.q):java.lang.Object");
    }

    /* renamed from: C */
    public static final String m34048C(BufferedReader bufferedReader) {
        StringWriter stringWriter = new StringWriter();
        char[] cArr = new char[8192];
        int read = bufferedReader.read(cArr);
        while (read >= 0) {
            stringWriter.write(cArr, 0, read);
            read = bufferedReader.read(cArr);
        }
        String stringWriter2 = stringWriter.toString();
        C24362h.m61210e(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /* renamed from: D */
    public static final LazyJavaAnnotations m34049D(C23780d dVar, C24589d dVar2) {
        C24362h.m61211f(dVar, "<this>");
        C24362h.m61211f(dVar2, "annotationsOwner");
        return new LazyJavaAnnotations(dVar, dVar2, false);
    }

    /* renamed from: E */
    public static final int m34050E(int i, int i2, boolean z) {
        return z ? i | (1 << i2) : i & (~(1 << i2));
    }

    /* renamed from: F */
    public static final long m34051F(long j, int i, boolean z) {
        return z ? j | (1 << i) : j & (~(1 << i));
    }

    /* renamed from: G */
    public static final Object m34052G(C21077o oVar, C21077o oVar2, C24240p pVar) {
        Object obj;
        Object i0;
        try {
            C24369n.m61246b(2, pVar);
            obj = pVar.invoke(oVar2, oVar);
        } catch (Throwable th) {
            obj = new C25219u(th, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (obj == coroutineSingletons || (i0 = oVar.mo61783i0(obj)) == C24368m.f61697i) {
            return coroutineSingletons;
        }
        if (!(i0 instanceof C25219u)) {
            return C24368m.m61234j(i0);
        }
        throw ((C25219u) i0).f63493a;
    }

    /* renamed from: H */
    public static final boolean m34053H(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* renamed from: I */
    public static final boolean m34054I(int i, long j) {
        return (j & (1 << i)) != 0;
    }

    /* renamed from: J */
    public static void m34055J(zzd zzd) {
        C24362h.m61211f(zzd, "block");
        new C23289a(zzd).start();
    }

    /* renamed from: K */
    public static final Class m34056K(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        return m34057L(vVar.mo60411O0().mo53460o());
    }

    /* renamed from: L */
    public static final Class m34057L(C25442g gVar) {
        if (!(gVar instanceof C25432c) || !C25261d.m63407b(gVar)) {
            return null;
        }
        C25432c cVar = (C25432c) gVar;
        Class<?> g = C24979k.m62680g(cVar);
        if (g != null) {
            return g;
        }
        StringBuilder k = C13555b.m33972k("Class object for the class ");
        k.append(cVar.getName());
        k.append(" cannot be found (classId=");
        k.append(DescriptorUtilsKt.m60285f((C25437e) gVar));
        k.append(')');
        throw new KotlinReflectionInternalError(k.toString());
    }

    /* renamed from: M */
    public static final Map m34058M(AbstractMap abstractMap) {
        C24362h.m61211f(abstractMap, "<this>");
        Map.Entry entry = (Map.Entry) abstractMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        C24362h.m61210e(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object m34059N(kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            wh0.y0$b r1 = wh0.C25232y0.C25234b.f63506b
            kotlin.coroutines.CoroutineContext$a r1 = r0.mo53081c(r1)
            wh0.y0 r1 = (wh0.C25232y0) r1
            if (r1 == 0) goto L_0x001a
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L_0x0015
            goto L_0x001a
        L_0x0015:
            java.util.concurrent.CancellationException r7 = r1.mo61782i()
            throw r7
        L_0x001a:
            ff0.c r7 = ce0.C21100e.m49351l0(r7)
            boolean r1 = r7 instanceof bi0.C21066e
            r2 = 0
            if (r1 == 0) goto L_0x0026
            bi0.e r7 = (bi0.C21066e) r7
            goto L_0x0027
        L_0x0026:
            r7 = r2
        L_0x0027:
            if (r7 != 0) goto L_0x002d
            bf0.d r7 = bf0.C21050d.f52856a
            goto L_0x00a2
        L_0x002d:
            kotlinx.coroutines.CoroutineDispatcher r1 = r7.f52872e
            boolean r1 = r1.mo4336x(r0)
            r3 = 1
            if (r1 == 0) goto L_0x0042
            bf0.d r1 = bf0.C21050d.f52856a
            r7.f52874g = r1
            r7.f63457d = r3
            kotlinx.coroutines.CoroutineDispatcher r1 = r7.f52872e
            r1.mo53205q(r0, r7)
            goto L_0x00a0
        L_0x0042:
            wh0.v1 r1 = new wh0.v1
            r1.<init>()
            kotlin.coroutines.CoroutineContext r0 = r0.mo53082y(r1)
            bf0.d r4 = bf0.C21050d.f52856a
            r7.f52874g = r4
            r7.f63457d = r3
            kotlinx.coroutines.CoroutineDispatcher r5 = r7.f52872e
            r5.mo53205q(r0, r7)
            boolean r0 = r1.f63500c
            if (r0 == 0) goto L_0x00a0
            wh0.o0 r0 = wh0.C25212r1.m63301a()
            bi0.a<wh0.g0<?>> r1 = r0.f63479f
            r5 = 0
            if (r1 == 0) goto L_0x006c
            int r6 = r1.f52866b
            int r1 = r1.f52867c
            if (r6 != r1) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r1 = 0
            goto L_0x006d
        L_0x006c:
            r1 = 1
        L_0x006d:
            if (r1 == 0) goto L_0x0070
            goto L_0x0092
        L_0x0070:
            boolean r1 = r0.mo61845K()
            if (r1 == 0) goto L_0x007e
            r7.f52874g = r4
            r7.f63457d = r3
            r0.mo61843A(r7)
            goto L_0x0093
        L_0x007e:
            r0.mo61844B(r3)
            r7.run()     // Catch:{ all -> 0x008b }
        L_0x0084:
            boolean r1 = r0.mo61846V()     // Catch:{ all -> 0x008b }
            if (r1 != 0) goto L_0x0084
            goto L_0x008f
        L_0x008b:
            r1 = move-exception
            r7.mo61809i(r1, r2)     // Catch:{ all -> 0x009b }
        L_0x008f:
            r0.mo61847z(r3)
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 == 0) goto L_0x0098
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            goto L_0x00a2
        L_0x0098:
            bf0.d r7 = bf0.C21050d.f52856a
            goto L_0x00a2
        L_0x009b:
            r7 = move-exception
            r0.mo61847z(r3)
            throw r7
        L_0x00a0:
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
        L_0x00a2:
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r7 != r0) goto L_0x00a7
            return r7
        L_0x00a7:
            bf0.d r7 = bf0.C21050d.f52856a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13637c.m34059N(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* renamed from: O */
    public static AKHostedAdTemplatesData m34060O(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "LOCAL";
        } else {
            str2 = "REMOTE";
        }
        try {
            if (C12954d.m32800c(str)) {
                return (AKHostedAdTemplatesData) new AKHostedAdTemplatesDataJsonAdapter(new C8017o(new C8017o.C8018a())).mo25049b(str);
            }
            return null;
        } catch (IOException e) {
            Logger logger = C7557a.f23040a;
            StringBuilder d0 = C17884p.m44363d0("AK_INIT: IOException while processing ", str2, " Ad Templates Json (Exception: ");
            d0.append(e.getLocalizedMessage());
            d0.append(')');
            logger.mo6667d(d0.toString());
            return null;
        } catch (JsonDataException e2) {
            Logger logger2 = C7557a.f23040a;
            StringBuilder d02 = C17884p.m44363d0("AK_INIT: JsonDataException while processing ", str2, " Ad Templates Json (Exception: ");
            d02.append(e2.getLocalizedMessage());
            d02.append(')');
            logger2.mo6667d(d02.toString());
            return null;
        }
    }

    /* renamed from: P */
    public static List m34061P(String str) {
        boolean z;
        UMOAdKitBannerParams uMOAdKitBannerParams;
        C12912d q = C13233c.m33348q(str);
        if (q == null || (uMOAdKitBannerParams = q.f31966b) == null) {
            z = false;
        } else {
            z = uMOAdKitBannerParams.mo11127u();
        }
        if (z) {
            return C17875h.m44281E(com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_H_AUTO_W_FILL_TEMPLATE, com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_W_AUTO_H_FILL_TEMPLATE);
        }
        return C17875h.m44281E(com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_H_AUTO_W_TEMPLATE, com.umo.ads.p350u.zzd.HTML_AD_IMG_STYLE_FULL_W_AUTO_H_TEMPLATE);
    }

    /* renamed from: S */
    public static void m34062S(ClassLoader classLoader, HashSet hashSet, C16581u uVar) {
        Class<C17382g> cls = C17382g.class;
        if (!hashSet.isEmpty()) {
            HashSet hashSet2 = new HashSet();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                hashSet2.add(((File) it.next()).getParentFile());
            }
            Object l = C24368m.m61236l(classLoader);
            C5282c cVar = new C5282c(l, C5720b.m14048P(l, "nativeLibraryDirectories"), List.class);
            synchronized (cls) {
                ArrayList arrayList = new ArrayList((Collection) cVar.mo21086c());
                hashSet2.removeAll(arrayList);
                arrayList.addAll(hashSet2);
                cVar.mo21087d(arrayList);
            }
            ArrayList arrayList2 = new ArrayList();
            Object[] a = uVar.mo49357a(l, new ArrayList(hashSet2), arrayList2);
            if (!arrayList2.isEmpty()) {
                zzbt zzbt = new zzbt("Error in makePathElements");
                int size = arrayList2.size();
                for (int i = 0; i < size; i++) {
                    IOException iOException = (IOException) arrayList2.get(i);
                }
                throw zzbt;
            }
            synchronized (cls) {
                new C16583v(l, C5720b.m14048P(l, "nativeLibraryPathElements"), Object.class).mo49359f(Arrays.asList(a));
            }
        }
    }

    /* renamed from: T */
    public static boolean m34063T(ClassLoader classLoader, File file, File file2, boolean z) {
        return C24368m.m61238o(classLoader, file, file2, z, new C24361g(), "zip", new C6181b());
    }

    /* renamed from: a */
    public static final C21065d m34064a(CoroutineContext coroutineContext) {
        if (coroutineContext.mo53081c(C25232y0.C25234b.f63506b) == null) {
            coroutineContext = coroutineContext.mo53082y(new C25155a1((C25232y0) null));
        }
        return new C21065d(coroutineContext);
    }

    /* renamed from: b */
    public static final C21065d m34065b() {
        C25206p1 a = C17884p.m44356a();
        C21207b bVar = C25184i0.f63459a;
        return new C21065d(a.mo53082y(C21073k.f52890a));
    }

    /* renamed from: c */
    public static void m34066c(WebView webView, String str, Object... objArr) {
        if (webView != null) {
            StringBuilder sb = new StringBuilder(RecyclerView.C1119a0.FLAG_IGNORE);
            sb.append("javascript: if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        sb.append('\"');
                    } else {
                        if (obj instanceof String) {
                            String obj2 = obj.toString();
                            if (obj2.startsWith("{")) {
                                sb.append(obj2);
                            } else {
                                sb.append('\"');
                                sb.append(obj2);
                            }
                        } else {
                            sb.append(obj);
                        }
                        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                    }
                    sb.append('\"');
                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler == null || Looper.myLooper() == handler.getLooper()) {
                webView.loadUrl(sb2);
            } else {
                handler.post(new C19125e(webView, sb2));
            }
        } else {
            String k = C25541a.m63881k("The WebView is null for ", str);
            if (C18370a.f46838a.booleanValue()) {
                TextUtils.isEmpty(k);
            }
        }
    }

    /* renamed from: d */
    public static int m34067d(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    /* renamed from: g */
    public static int m34068g(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    /* renamed from: h */
    public static String m34069h(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: j */
    public static String m34070j(C6804s sVar) {
        char c;
        sVar.mo23017j(24);
        int e = sVar.mo23012e(2);
        boolean d = sVar.mo23011d();
        int e2 = sVar.mo23012e(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (sVar.mo23011d()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = sVar.mo23012e(8);
        }
        int e3 = sVar.mo23012e(8);
        Object[] objArr = new Object[5];
        objArr[0] = f33641h[e];
        objArr[1] = Integer.valueOf(e2);
        objArr[2] = Integer.valueOf(i);
        if (d) {
            c = 'H';
        } else {
            c = 'L';
        }
        objArr[3] = Character.valueOf(c);
        objArr[4] = Integer.valueOf(e3);
        StringBuilder sb = new StringBuilder(C6774a0.m15950j("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0) {
            int i5 = i3 - 1;
            if (iArr[i5] != 0) {
                break;
            }
            i3 = i5;
        }
        for (int i6 = 0; i6 < i3; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    /* renamed from: k */
    public static final void m34071k(C25319k kVar, Throwable th) {
        CancellationException cancellationException = new CancellationException("Failed to read multi-request");
        cancellationException.initCause(th);
        C25232y0 y0Var = (C25232y0) kVar.mo4232K().mo53081c(C25232y0.C25234b.f63506b);
        if (y0Var != null) {
            y0Var.mo61776a(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + kVar).toString());
    }

    /* renamed from: l */
    public static final Object m34072l(Object obj, CallableMemberDescriptor callableMemberDescriptor) {
        Class cls;
        if ((callableMemberDescriptor instanceof C25491z) && C25261d.m63409d((C25454l0) callableMemberDescriptor)) {
            return obj;
        }
        C24307v t = m34077t(callableMemberDescriptor);
        if (t == null) {
            cls = null;
        } else {
            cls = m34056K(t);
        }
        if (cls == null) {
            return obj;
        }
        return m34079v(cls, callableMemberDescriptor).invoke(obj, new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        if (r1.f63264c == false) goto L_0x0025;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m34073o(zf0.C25432c r3, qg0.C24767p r4) {
        /*
            java.lang.String r0 = "klass"
            mf0.C24362h.m61211f(r3, r0)
            java.lang.String r0 = "typeMappingConfiguration"
            mf0.C24362h.m61211f(r4, r0)
            r4.mo50436a(r3)
            zf0.g r0 = r3.mo53399b()
            java.lang.String r1 = "klass.containingDeclaration"
            mf0.C24362h.m61210e(r0, r1)
            ug0.e r1 = r3.getName()
            if (r1 == 0) goto L_0x0023
            ug0.e r2 = ug0.C25071g.f63266a
            boolean r2 = r1.f63264c
            if (r2 != 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            ug0.e r1 = ug0.C25071g.f63268c
        L_0x0025:
            java.lang.String r1 = r1.mo61605g()
            java.lang.String r2 = "safeIdentifier(klass.name).identifier"
            mf0.C24362h.m61210e(r1, r2)
            boolean r2 = r0 instanceof zf0.C25486u
            if (r2 == 0) goto L_0x0063
            zf0.u r0 = (zf0.C25486u) r0
            ug0.c r3 = r0.mo53401f()
            boolean r4 = r3.mo61582d()
            if (r4 == 0) goto L_0x003f
            goto L_0x0062
        L_0x003f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r3 = r3.mo61580b()
            java.lang.String r0 = "fqName.asString()"
            mf0.C24362h.m61210e(r3, r0)
            r0 = 46
            r2 = 47
            java.lang.String r3 = uh0.C25081h.m62834E(r3, r0, r2)
            r4.append(r3)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
        L_0x0062:
            return r1
        L_0x0063:
            boolean r2 = r0 instanceof zf0.C25432c
            if (r2 == 0) goto L_0x006b
            r2 = r0
            zf0.c r2 = (zf0.C25432c) r2
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 == 0) goto L_0x008a
            r4.mo50437b(r2)
            java.lang.String r3 = m34073o(r2, r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            r3 = 36
            r4.append(r3)
            r4.append(r1)
            java.lang.String r3 = r4.toString()
            return r3
        L_0x008a:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected container: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " for "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r4.<init>(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13637c.m34073o(zf0.c, qg0.p):java.lang.String");
    }

    /* renamed from: q */
    public static final ArrayList m34074q(ArrayList arrayList, List list, C23894a aVar) {
        C24307v vVar;
        C24362h.m61211f(list, "oldValueParameters");
        C24362h.m61211f(aVar, "newOwner");
        arrayList.size();
        list.size();
        ArrayList Q0 = C23825c.m58505Q0(arrayList, list);
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(Q0, 10));
        Iterator it = Q0.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            C23726g gVar = (C23726g) pair.mo59066a();
            C25452k0 k0Var = (C25452k0) pair.mo59067b();
            int index = k0Var.getIndex();
            C20989e annotations = k0Var.getAnnotations();
            C25069e name = k0Var.getName();
            C24362h.m61210e(name, "oldParameter.name");
            C24307v vVar2 = gVar.f59929a;
            boolean z = gVar.f59930b;
            boolean v0 = k0Var.mo59466v0();
            boolean u0 = k0Var.mo59465u0();
            if (k0Var.mo59467z0() != null) {
                vVar = DescriptorUtilsKt.m60289j(aVar).mo59460m().mo59384g(gVar.f59929a);
            } else {
                vVar = null;
            }
            C25435d0 e = k0Var.mo53400e();
            C24362h.m61210e(e, "oldParameter.source");
            arrayList2.add(new C23910d(aVar, (C25452k0) null, index, annotations, name, vVar2, z, v0, u0, vVar, e));
        }
        return arrayList2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0067, code lost:
        if (r0 != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final uf0.C25032b m34075r(uf0.C25032b r5, kotlin.reflect.jvm.internal.impl.descriptors.C23900c r6, boolean r7) {
        /*
            java.lang.String r0 = "descriptor"
            mf0.C24362h.m61211f(r6, r0)
            boolean r0 = xg0.C25261d.m63406a(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0069
            java.util.List r0 = r6.mo53442h()
            java.lang.String r3 = "descriptor.valueParameters"
            mf0.C24362h.m61210e(r0, r3)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x001d
            goto L_0x003e
        L_0x001d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0021:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x003e
            java.lang.Object r3 = r0.next()
            zf0.k0 r3 = (zf0.C25452k0) r3
            lh0.v r3 = r3.getType()
            java.lang.String r4 = "it.type"
            mf0.C24362h.m61210e(r3, r4)
            boolean r3 = xg0.C25261d.m63408c(r3)
            if (r3 == 0) goto L_0x0021
            r0 = 1
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r0 != 0) goto L_0x0069
            lh0.v r0 = r6.mo53443i()
            if (r0 != 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            boolean r0 = xg0.C25261d.m63408c(r0)
            if (r0 != r2) goto L_0x0050
            r0 = 1
            goto L_0x0051
        L_0x0050:
            r0 = 0
        L_0x0051:
            if (r0 != 0) goto L_0x0069
            boolean r0 = r5 instanceof uf0.C25031a
            if (r0 != 0) goto L_0x006a
            lh0.v r0 = m34077t(r6)
            if (r0 != 0) goto L_0x005e
            goto L_0x0066
        L_0x005e:
            boolean r0 = xg0.C25261d.m63408c(r0)
            if (r0 != r2) goto L_0x0066
            r0 = 1
            goto L_0x0067
        L_0x0066:
            r0 = 0
        L_0x0067:
            if (r0 == 0) goto L_0x006a
        L_0x0069:
            r1 = 1
        L_0x006a:
            if (r1 == 0) goto L_0x0072
            uf0.d r0 = new uf0.d
            r0.<init>(r5, r6, r7)
            r5 = r0
        L_0x0072:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13637c.m34075r(uf0.b, kotlin.reflect.jvm.internal.impl.descriptors.c, boolean):uf0.b");
    }

    /* renamed from: s */
    public static final HashSet m34076s(Iterable iterable) {
        C24362h.m61211f(iterable, "<this>");
        HashSet hashSet = new HashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Set<C25069e> f = ((MemberScope) it.next()).mo53493f();
            if (f == null) {
                return null;
            }
            C21140n.m49439a0(f, hashSet);
        }
        return hashSet;
    }

    /* renamed from: t */
    public static final C24307v m34077t(CallableMemberDescriptor callableMemberDescriptor) {
        C25432c cVar;
        C25433c0 R = callableMemberDescriptor.mo53423R();
        C25433c0 O = callableMemberDescriptor.mo53422O();
        if (R != null) {
            return R.getType();
        }
        if (O == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof C23899b) {
            return O.getType();
        }
        C25442g b = callableMemberDescriptor.mo53399b();
        if (b instanceof C25432c) {
            cVar = (C25432c) b;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        return cVar.mo53412q();
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C23940b m34078u(zf0.C25432c r3) {
        /*
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r3, r0)
            int r0 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.f61206a
            lh0.z r3 = r3.mo53412q()
            lh0.i0 r3 = r3.mo60411O0()
            java.util.Collection r3 = r3.mo53459n()
            java.util.Iterator r3 = r3.iterator()
        L_0x0017:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x0057
            java.lang.Object r0 = r3.next()
            lh0.v r0 = (lh0.C24307v) r0
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58686y(r0)
            if (r2 != 0) goto L_0x0017
            lh0.i0 r0 = r0.mo60411O0()
            zf0.e r0 = r0.mo53460o()
            int r2 = xg0.C25260c.f63536a
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.CLASS
            boolean r2 = xg0.C25260c.m63397n(r0, r2)
            if (r2 != 0) goto L_0x0047
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r2 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            boolean r2 = xg0.C25260c.m63397n(r0, r2)
            if (r2 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r2 = 0
            goto L_0x0048
        L_0x0047:
            r2 = 1
        L_0x0048:
            if (r2 == 0) goto L_0x0017
            if (r0 == 0) goto L_0x004f
            zf0.c r0 = (zf0.C25432c) r0
            goto L_0x0058
        L_0x004f:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor"
            r3.<init>(r0)
            throw r3
        L_0x0057:
            r0 = r1
        L_0x0058:
            if (r0 != 0) goto L_0x005b
            return r1
        L_0x005b:
            kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope r3 = r0.mo53515r0()
            boolean r2 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C23940b
            if (r2 == 0) goto L_0x0066
            r1 = r3
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r1 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C23940b) r1
        L_0x0066:
            if (r1 != 0) goto L_0x006c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b r1 = m34078u(r0)
        L_0x006c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13637c.m34078u(zf0.c):kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b");
    }

    /* renamed from: v */
    public static final Method m34079v(Class cls, CallableMemberDescriptor callableMemberDescriptor) {
        C24362h.m61211f(callableMemberDescriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            C24362h.m61210e(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + callableMemberDescriptor + ')');
        }
    }

    /* renamed from: w */
    public static final void m34080w(CoroutineContext coroutineContext, Throwable th) {
        try {
            C25230y yVar = (C25230y) coroutineContext.mo53081c(C25230y.C25231a.f63504b);
            if (yVar != null) {
                yVar.mo11674p(coroutineContext, th);
            } else {
                C24182a.m60599a(coroutineContext, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                C18201b.m44913j(runtimeException, th);
                th = runtimeException;
            }
            C24182a.m60599a(coroutineContext, th);
        }
    }

    /* renamed from: x */
    public static boolean m34081x(TypeCheckerState typeCheckerState, C24618g gVar, TypeCheckerState.C24156a aVar) {
        boolean z;
        TypeCheckerState.C24156a aVar2;
        boolean z2;
        C24362h.m61211f(typeCheckerState, "<this>");
        C24362h.m61211f(gVar, "type");
        C24362h.m61211f(aVar, "supertypesPolicy");
        C24623l lVar = typeCheckerState.f61344c;
        if ((!lVar.mo42756v(gVar) || lVar.mo42712P(gVar)) && !lVar.mo42705I(gVar)) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            typeCheckerState.mo60245b();
            ArrayDeque<C24618g> arrayDeque = typeCheckerState.f61348g;
            C24362h.m61208c(arrayDeque);
            C24823d dVar = typeCheckerState.f61349h;
            C24362h.m61208c(dVar);
            arrayDeque.push(gVar);
            while (!arrayDeque.isEmpty()) {
                if (dVar.f62767c <= 1000) {
                    C24618g pop = arrayDeque.pop();
                    C24362h.m61210e(pop, "current");
                    if (dVar.add(pop)) {
                        if (lVar.mo42712P(pop)) {
                            aVar2 = TypeCheckerState.C24156a.C24159c.f61351a;
                        } else {
                            aVar2 = aVar;
                        }
                        if (!(!C24362h.m61206a(aVar2, TypeCheckerState.C24156a.C24159c.f61351a))) {
                            aVar2 = null;
                        }
                        if (aVar2 == null) {
                            continue;
                        } else {
                            C24623l lVar2 = typeCheckerState.f61344c;
                            for (C24617f a : lVar2.mo42704H(lVar2.mo42733f(pop))) {
                                C24618g a2 = aVar2.mo60247a(typeCheckerState, a);
                                if ((!lVar.mo42756v(a2) || lVar.mo42712P(a2)) && !lVar.mo42705I(a2)) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (z2) {
                                    typeCheckerState.mo60244a();
                                } else {
                                    arrayDeque.add(a2);
                                }
                            }
                            continue;
                        }
                    }
                } else {
                    StringBuilder o = C13437d.m33709o("Too many supertypes for type: ", gVar, ". Supertypes = ");
                    o.append(C23825c.m58520q0(dVar, (String) null, (String) null, (String) null, (C24236l) null, 63));
                    throw new IllegalStateException(o.toString().toString());
                }
            }
            typeCheckerState.mo60244a();
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public static final boolean m34082y(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        C24306u0 R0 = vVar.mo60450R0();
        if ((R0 instanceof C24286o) || ((R0 instanceof C24298r) && (((C24298r) R0).mo59562V0() instanceof C24286o))) {
            return true;
        }
        return false;
    }

    /* renamed from: z */
    public static final int m34083z(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: Q */
    public void mo40521Q(UMOAdKitError uMOAdKitError) {
        if (f33647n) {
            C7557a.f23040a.mo6672i("AK_INIT: LOCAL Ad Templates would be used for Ad Rendering as REMOTE templates looks missing or invalid.");
            UMOAdKitError uMOAdKitError2 = UMOAdKitError.NONE;
            f33646m = false;
            C13301f fVar = C13301f.f33010a;
            C24362h.m61211f(uMOAdKitError2, "akError");
            fVar.mo40205d(true);
            return;
        }
        C7557a.f23040a.mo6667d("AK_INIT: Neither LOCAL nor REMOTE Ad Rendering Templates found.");
        f33647n = false;
        f33646m = false;
        C13301f fVar2 = C13301f.f33010a;
        C24362h.m61211f(uMOAdKitError, "akError");
        C13301f.f33012c = uMOAdKitError;
        fVar2.mo40205d(false);
    }

    /* renamed from: R */
    public boolean mo40522R(AKHostedAdTemplatesData aKHostedAdTemplatesData, boolean z) {
        String str;
        boolean z2;
        boolean z3;
        if (z) {
            str = "LOCAL";
        } else {
            str = "REMOTE";
        }
        List<AKHostedAdTemplate> templates = aKHostedAdTemplatesData.getTemplates();
        if (templates == null || !(!templates.isEmpty())) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            Logger logger = C7557a.f23040a;
            logger.mo6667d("AK_INIT: 'Templates' missing in " + str + " Ad Rendering Templates Json.");
            if (!z) {
                mo40521Q(UMOAdKitError.REMOTE_AD_TEMPLATES_INVALID);
            }
            return false;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        List<AKHostedAdTemplate> templates2 = aKHostedAdTemplatesData.getTemplates();
        C24362h.m61208c(templates2);
        for (AKHostedAdTemplate next : templates2) {
            if (C12954d.m32800c(next.getName()) && C12954d.m32800c(next.getTemplate())) {
                concurrentHashMap.put(next.getName(), next.getTemplate());
            }
        }
        if (!concurrentHashMap.isEmpty()) {
            ConcurrentHashMap concurrentHashMap2 = f33649p;
            if (concurrentHashMap2 != null) {
                concurrentHashMap2.clear();
            }
            f33649p = concurrentHashMap;
            f33647n = true;
            Logger logger2 = C7557a.f23040a;
            logger2.mo6672i("AK_INIT: " + str + " Ad Rendering Templates READY to be utilized.");
            z3 = true;
        } else {
            Logger logger3 = C7557a.f23040a;
            logger3.mo6667d("AK_INIT: No valid templates present in " + str + " Ad Rendering Templates Json.");
            z3 = false;
        }
        if (!z) {
            if (f33647n) {
                UMOAdKitError uMOAdKitError = UMOAdKitError.NONE;
                f33646m = false;
                C13301f fVar = C13301f.f33010a;
                C24362h.m61211f(uMOAdKitError, "akError");
                fVar.mo40205d(true);
            } else {
                mo40521Q(UMOAdKitError.REMOTE_AD_TEMPLATES_INVALID);
            }
        }
        return z3;
    }

    /* renamed from: e */
    public boolean mo22170e(ClassLoader classLoader, File file, File file2, boolean z) {
        return m34063T(classLoader, file, file2, z);
    }

    /* renamed from: f */
    public void mo22171f(ClassLoader classLoader, HashSet hashSet) {
        m34062S(classLoader, hashSet, new C16590z());
    }

    public int getAmount() {
        return 1;
    }

    public String getType() {
        return "";
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        C18202a aVar = new C18202a();
        aVar.f46461b.add(new C18216o(aVar, aVar.f46460a, aVar.f46461b));
        Thread thread = new Thread(new C18214m(aVar.f46460a, aVar.f46461b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    /* renamed from: n */
    public boolean mo979n(Object obj, File file, C1492e eVar) {
        try {
            C7160a.m16769c((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: p */
    public void mo22700p(String str, StringBuffer stringBuffer, char c, int i) {
        if (str.indexOf(c) < 0) {
            stringBuffer.append("\\");
        }
        stringBuffer.append(c);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C13637c(com.google.android.gms.internal.p986firebaseauthapi.zzzl r9) {
        /*
            r8 = this;
            r8.<init>()
            boolean r0 = r9.zzh()
            if (r0 == 0) goto L_0x000d
            r9.zzd()
            goto L_0x0010
        L_0x000d:
            r9.zzc()
        L_0x0010:
            r9.zzc()
            boolean r0 = r9.zzi()
            if (r0 != 0) goto L_0x001a
            return
        L_0x001a:
            java.lang.String r0 = r9.zze()
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 2
            r4 = 4
            r5 = 1
            r6 = 5
            r7 = 3
            switch(r1) {
                case -1874510116: goto L_0x005e;
                case -1452371317: goto L_0x0054;
                case -1341836234: goto L_0x004a;
                case -1099157829: goto L_0x0040;
                case 870738373: goto L_0x0036;
                case 970484929: goto L_0x002c;
                default: goto L_0x002b;
            }
        L_0x002b:
            goto L_0x0068
        L_0x002c:
            java.lang.String r1 = "RECOVER_EMAIL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 4
            goto L_0x0069
        L_0x0036:
            java.lang.String r1 = "EMAIL_SIGNIN"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 2
            goto L_0x0069
        L_0x0040:
            java.lang.String r1 = "VERIFY_AND_CHANGE_EMAIL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 3
            goto L_0x0069
        L_0x004a:
            java.lang.String r1 = "VERIFY_EMAIL"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 1
            goto L_0x0069
        L_0x0054:
            java.lang.String r1 = "PASSWORD_RESET"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 0
            goto L_0x0069
        L_0x005e:
            java.lang.String r1 = "REVERT_SECOND_FACTOR_ADDITION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0068
            r0 = 5
            goto L_0x0069
        L_0x0068:
            r0 = -1
        L_0x0069:
            if (r0 == 0) goto L_0x0080
            if (r0 == r5) goto L_0x007f
            if (r0 == r3) goto L_0x007d
            if (r0 == r7) goto L_0x007b
            if (r0 == r4) goto L_0x0079
            if (r0 == r6) goto L_0x0077
            r2 = 3
            goto L_0x0080
        L_0x0077:
            r2 = 6
            goto L_0x0080
        L_0x0079:
            r2 = 2
            goto L_0x0080
        L_0x007b:
            r2 = 5
            goto L_0x0080
        L_0x007d:
            r2 = 4
            goto L_0x0080
        L_0x007f:
            r2 = 1
        L_0x0080:
            if (r2 == r4) goto L_0x00c3
            if (r2 != r7) goto L_0x0085
            goto L_0x00c3
        L_0x0085:
            boolean r0 = r9.zzg()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = r9.zzc()
            com.google.android.gms.internal.firebase-auth-api.zzze r9 = r9.zzb()
            com.google.firebase.auth.PhoneMultiFactorInfo r9 = p583jk.C17884p.m44359b0(r9)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r9)
            com.google.firebase.auth.MultiFactorInfo r9 = (com.google.firebase.auth.MultiFactorInfo) r9
            goto L_0x00c3
        L_0x00a1:
            boolean r0 = r9.zzh()
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = r9.zzd()
            java.lang.String r9 = r9.zzc()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r0)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
            goto L_0x00c3
        L_0x00b6:
            boolean r0 = r9.zzf()
            if (r0 == 0) goto L_0x00c3
            java.lang.String r9 = r9.zzc()
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r9)
        L_0x00c3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p389bl.C13637c.<init>(com.google.android.gms.internal.firebase-auth-api.zzzl):void");
    }
}
