package p172m9;

import ag0.C20989e;
import ag0.C20993f;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.webkit.MimeTypeMap;
import androidx.appcompat.widget.C0456s1;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.assetpacks.C14313r2;
import com.google.android.play.core.internal.zzbx;
import com.google.firebase.appindexing.FirebaseAppIndexingException;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.FirebaseAppIndexingTooManyArgumentsException;
import com.google.firebase.appindexing.zza;
import com.google.firebase.appindexing.zzb;
import com.moovit.MoovitActivity;
import com.moovit.analytics.AnalyticsFlowKey;
import com.moovit.app.general.settings.privacy.C14894a;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.map.MapFragment;
import com.tranzmate.moovit.protocol.kinesis.MVAnalyticsFlowKey;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;
import eg0.C23291b;
import eg0.C23296f;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lf0.C24225a;
import lh0.C24281l0;
import lh0.C24285n0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import o20.C18703i;
import p271u4.C6692c;
import p377ay.C13547a;
import p377ay.C13550c;
import p401bz.C13709c;
import p401bz.C13712f;
import p527gy.C17259d;
import p543hq.C17477d;
import p554id.C17562a;
import p583jk.C17875h;
import p755qs.C19164a;
import p755qs.C19169f;
import p824tp.C19731i;
import p977zz.C20932c0;
import p977zz.C20964s0;
import qg0.C24757k;
import sf0.C24855b;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25067d;
import ug0.C25069e;
import yf0.C25295c;
import zf0.C25432c;
import zf0.C25437e;
import zg0.C25497f;

/* renamed from: m9.b */
public final class C5720b implements C17562a {

    /* renamed from: b */
    public static C5720b f18546b;

    /* renamed from: c */
    public static final /* synthetic */ C5720b f18547c = new C5720b();

    /* renamed from: d */
    public static final Class[] f18548d = {String.class};

    /* renamed from: e */
    public static final byte[] f18549e = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};

    /* renamed from: A */
    public static ThreadPoolExecutor m14033A(int i, String str) {
        return m14034B(i, C20932c0.m49025a(str));
    }

    /* renamed from: B */
    public static ThreadPoolExecutor m14034B(int i, C20932c0 c0Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), c0Var);
        threadPoolExecutor.allowsCoreThreadTimeOut();
        return threadPoolExecutor;
    }

    /* renamed from: C */
    public static void m14035C(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                if (parent instanceof C0456s1) {
                    editorInfo.hintText = ((C0456s1) parent).mo2181a();
                    return;
                }
            }
        }
    }

    /* renamed from: D */
    public static void m14036D(C24757k.C24760c cVar, Annotation annotation) {
        Class N = C24361g.m61144N(C24361g.m61140J(annotation));
        C24757k.C24758a b = cVar.mo59592b(ReflectClassUtilKt.m58949a(N), new C23291b(annotation));
        if (b != null) {
            m14037E(b, annotation, N);
        }
    }

    /* renamed from: E */
    public static void m14037E(C24757k.C24758a aVar, Annotation annotation, Class cls) {
        Method[] declaredMethods = cls.getDeclaredMethods();
        C24362h.m61210e(declaredMethods, "annotationType.declaredMethods");
        int length = declaredMethods.length;
        int i = 0;
        while (i < length) {
            Method method = declaredMethods[i];
            i++;
            try {
                Object invoke = method.invoke(annotation, new Object[0]);
                C24362h.m61208c(invoke);
                C25069e i2 = C25069e.m62820i(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (C24362h.m61206a(cls2, Class.class)) {
                    aVar.mo59602d(i2, m14051b((Class) invoke));
                } else if (C23296f.f59078a.contains(cls2)) {
                    aVar.mo59604f(invoke, i2);
                } else {
                    List<C24855b<? extends Object>> list = ReflectClassUtilKt.f60530a;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        C24362h.m61210e(cls2, "if (clazz.isEnum) clazz else clazz.enclosingClass");
                        aVar.mo59603e(i2, ReflectClassUtilKt.m58949a(cls2), C25069e.m62820i(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class[] interfaces = cls2.getInterfaces();
                        C24362h.m61210e(interfaces, "clazz.interfaces");
                        Class cls3 = (Class) C23816b.m58447c1(interfaces);
                        C24362h.m61210e(cls3, "annotationClass");
                        C24757k.C24758a b = aVar.mo59600b(ReflectClassUtilKt.m58949a(cls3), i2);
                        if (b != null) {
                            m14037E(b, (Annotation) invoke, cls3);
                        }
                    } else if (cls2.isArray()) {
                        C24757k.C24759b c = aVar.mo59601c(i2);
                        if (c == null) {
                            continue;
                        } else {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                C25065b a = ReflectClassUtilKt.m58949a(componentType);
                                Object[] objArr = (Object[]) invoke;
                                int length2 = objArr.length;
                                int i3 = 0;
                                while (i3 < length2) {
                                    Object obj = objArr[i3];
                                    i3++;
                                    if (obj != null) {
                                        c.mo59594b(a, C25069e.m62820i(((Enum) obj).name()));
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Enum<*>");
                                    }
                                }
                            } else if (C24362h.m61206a(componentType, Class.class)) {
                                Object[] objArr2 = (Object[]) invoke;
                                int length3 = objArr2.length;
                                int i4 = 0;
                                while (i4 < length3) {
                                    Object obj2 = objArr2[i4];
                                    i4++;
                                    if (obj2 != null) {
                                        c.mo59596d(m14051b((Class) obj2));
                                    } else {
                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<*>");
                                    }
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                Object[] objArr3 = (Object[]) invoke;
                                int length4 = objArr3.length;
                                int i5 = 0;
                                while (i5 < length4) {
                                    Object obj3 = objArr3[i5];
                                    i5++;
                                    C24757k.C24758a e = c.mo59597e(ReflectClassUtilKt.m58949a(componentType));
                                    if (e != null) {
                                        if (obj3 != null) {
                                            m14037E(e, (Annotation) obj3, componentType);
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Annotation");
                                        }
                                    }
                                }
                            } else {
                                Object[] objArr4 = (Object[]) invoke;
                                int length5 = objArr4.length;
                                int i6 = 0;
                                while (i6 < length5) {
                                    Object obj4 = objArr4[i6];
                                    i6++;
                                    c.mo59595c(obj4);
                                }
                            }
                            c.mo59593a();
                        }
                    } else {
                        throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        aVar.mo59599a();
    }

    /* renamed from: F */
    public static final void m14038F(MapFragment mapFragment, C24225a aVar) {
        C24362h.m61211f(mapFragment, "<this>");
        mapFragment.mo48656t2(new C18703i(aVar));
    }

    /* renamed from: G */
    public static void m14039G(Context context) {
        if (m14041I(context)) {
            C19731i.m47197a(context).f50172b.mo42914c(Arrays.asList(new C13712f[]{new C19164a(context), new C19169f(context)}), true);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034 A[LOOP:0: B:11:0x0032->B:12:0x0034, LOOP_END] */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14040H(java.lang.String r7) {
        /*
            boolean r0 = ge0.C23410c.m57533a(r7)
            if (r0 == 0) goto L_0x0054
            java.lang.String r0 = "SHA-1"
            boolean r1 = ge0.C23410c.m57533a(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0026
            boolean r1 = ge0.C23410c.m57533a(r7)
            if (r1 != 0) goto L_0x0016
            goto L_0x0026
        L_0x0016:
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0026 }
            byte[] r7 = r7.getBytes()     // Catch:{ NoSuchAlgorithmException -> 0x0026 }
            r0.update(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0026 }
            byte[] r7 = r0.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0026 }
            goto L_0x0028
        L_0x0026:
            byte[] r7 = new byte[r2]
        L_0x0028:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r7.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r7.length
            r3 = 0
        L_0x0032:
            if (r3 >= r1) goto L_0x004f
            byte r4 = r7[r3]
            java.util.Locale r5 = java.util.Locale.US
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r4 = r4 & 255(0xff, float:3.57E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6[r2] = r4
            java.lang.String r4 = "%02x"
            java.lang.String r4 = java.lang.String.format(r5, r4, r6)
            r0.append(r4)
            int r3 = r3 + 1
            goto L_0x0032
        L_0x004f:
            java.lang.String r7 = r0.toString()
            return r7
        L_0x0054:
            java.lang.String r7 = ""
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p172m9.C5720b.m14040H(java.lang.String):java.lang.String");
    }

    /* renamed from: I */
    public static boolean m14041I(Context context) {
        if (C14894a.m37560b(context).mo45017g() && C13709c.m34226b(context) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public static FirebaseAppIndexingException m14042J(Status status, String str) {
        Preconditions.checkNotNull(status);
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null && !statusMessage.isEmpty()) {
            str = statusMessage;
        }
        switch (status.getStatusCode()) {
            case 17510:
                return new FirebaseAppIndexingInvalidArgumentException(str);
            case 17511:
                return new FirebaseAppIndexingTooManyArgumentsException(str);
            case 17513:
                return new zzb(str);
            case 17514:
                return new zza(str);
            default:
                return new FirebaseAppIndexingException(str);
        }
    }

    /* renamed from: K */
    public static /* synthetic */ String m14043K(int i) {
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "PREFETCHING_IN_PROGRESS";
        }
        if (i == 3) {
            return "AUTO_PREFETCHING_IN_PROGRESS";
        }
        if (i == 4) {
            return "PREFETCHED";
        }
        if (i == 5) {
            return "LOADING_IN_PROGRESS";
        }
        if (i == 6) {
            return "PLAYING_IN_PROGRESS";
        }
        if (i == 7) {
            return "REMOVAL_IN_PROGRESS";
        }
        throw null;
    }

    /* renamed from: L */
    public static StringBuilder m14044L(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        sb.append(" (SpotId(s): [");
        C24362h.m61208c(arrayList);
        return sb;
    }

    /* renamed from: M */
    public static Object m14045M(Object obj, String str, Class cls, Class cls2, Serializable serializable) {
        try {
            return cls.cast(m14049Q(obj.getClass(), str, cls2).invoke(obj, new Object[]{serializable}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: N */
    public static Object m14046N(Object obj, String str, Class cls, ArrayList arrayList, Class cls2, File file, Class cls3, ArrayList arrayList2) {
        try {
            return Object[].class.cast(m14049Q(obj.getClass(), str, cls, cls2, cls3).invoke(obj, new Object[]{arrayList, file, arrayList2}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke method %s on an object of type %s", new Object[]{str, obj.getClass()}), e);
        }
    }

    /* renamed from: O */
    public static Object m14047O(Class cls, String str) {
        try {
            return Boolean.class.cast(m14049Q(cls, "isDexOptNeeded", String.class).invoke((Object) null, new Object[]{str}));
        } catch (Exception e) {
            throw new zzbx(String.format("Failed to invoke static method %s on type %s", new Object[]{"isDexOptNeeded", cls}), e);
        }
    }

    /* renamed from: P */
    public static Field m14048P(Object obj, String str) {
        Class cls = obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(str);
                if (!declaredField.isAccessible()) {
                    declaredField.setAccessible(true);
                }
                return declaredField;
            } catch (NoSuchFieldException unused) {
                cls = cls.getSuperclass();
            }
        }
        throw new zzbx(String.format("Failed to find a field named %s on an object of instance %s", new Object[]{str, obj.getClass().getName()}));
    }

    /* renamed from: Q */
    public static Method m14049Q(Class cls, String str, Class... clsArr) {
        Class cls2 = cls;
        while (cls2 != null) {
            try {
                Method declaredMethod = cls2.getDeclaredMethod(str, clsArr);
                if (!declaredMethod.isAccessible()) {
                    declaredMethod.setAccessible(true);
                }
                return declaredMethod;
            } catch (NoSuchMethodException unused) {
                cls2 = cls2.getSuperclass();
            }
        }
        throw new zzbx(String.format("Could not find a method named %s with parameters %s in type %s", new Object[]{str, Arrays.asList(clsArr), cls}));
    }

    /* renamed from: a */
    public static void m14050a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: b */
    public static C25497f m14051b(Class<?> cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
            C24362h.m61210e(cls, "currentClass.componentType");
        }
        if (!cls.isPrimitive()) {
            C25065b a = ReflectClassUtilKt.m58949a(cls);
            String str = C25295c.f63582a;
            C25066c b = a.mo61569b();
            C24362h.m61210e(b, "javaClassId.asSingleFqName()");
            C25065b f = C25295c.m63525f(b);
            if (f != null) {
                a = f;
            }
            return new C25497f(a, i);
        } else if (C24362h.m61206a(cls, Void.TYPE)) {
            return new C25497f(C25065b.m62790l(C23872e.C23873a.f60366d.mo61600i()), i);
        } else {
            PrimitiveType primitiveType = JvmPrimitiveType.get(cls.getName()).getPrimitiveType();
            C24362h.m61210e(primitiveType, "get(currentClass.name).primitiveType");
            if (i > 0) {
                return new C25497f(C25065b.m62790l(primitiveType.getArrayTypeFqName()), i - 1);
            }
            return new C25497f(C25065b.m62790l(primitiveType.getTypeFqName()), i);
        }
    }

    /* renamed from: c */
    public static Object m14052c(C6692c cVar, Class cls, String str) {
        Method method;
        boolean z;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (String.class.isAssignableFrom(cls)) {
            return trim;
        }
        if (Integer.TYPE.isAssignableFrom(cls)) {
            return Integer.valueOf(trim);
        }
        if (Long.TYPE.isAssignableFrom(cls)) {
            return Long.valueOf(trim);
        }
        if (Float.TYPE.isAssignableFrom(cls)) {
            return Float.valueOf(trim);
        }
        if (Double.TYPE.isAssignableFrom(cls)) {
            return Double.valueOf(trim);
        }
        if (Boolean.TYPE.isAssignableFrom(cls)) {
            if (InneractiveMediationDefs.SHOW_HOUSE_AD_YES.equalsIgnoreCase(trim)) {
                return Boolean.TRUE;
            }
            if ("false".equalsIgnoreCase(trim)) {
                return Boolean.FALSE;
            }
            return null;
        } else if (cls.isEnum()) {
            return Enum.valueOf(cls, trim);
        } else {
            try {
                method = cls.getMethod("valueOf", f18548d);
            } catch (NoSuchMethodException | SecurityException unused) {
                method = null;
            }
            if (method == null) {
                z = false;
            } else {
                z = Modifier.isStatic(method.getModifiers());
            }
            if (z) {
                try {
                    return cls.getMethod("valueOf", f18548d).invoke((Object) null, new Object[]{trim});
                } catch (Exception unused2) {
                    StringBuilder k = C13555b.m33972k("Failed to invoke valueOf{} method in class [");
                    k.append(cls.getName());
                    k.append("] with value [");
                    k.append(trim);
                    k.append("]");
                    cVar.mo21722a(k.toString());
                    return null;
                }
            } else if (!Charset.class.isAssignableFrom(cls)) {
                return null;
            } else {
                try {
                    return Charset.forName(str);
                } catch (UnsupportedCharsetException e) {
                    cVar.mo21727f("Failed to get charset [" + str + "]", e);
                    return null;
                }
            }
        }
    }

    /* renamed from: d */
    public static final C24312z m14053d(C23867c cVar, C20989e eVar, C24307v vVar, ArrayList arrayList, C24307v vVar2, boolean z) {
        int i;
        C24285n0 n0Var;
        C25432c cVar2;
        C24362h.m61211f(eVar, "annotations");
        int size = arrayList.size();
        int i2 = 0;
        if (vVar != null) {
            i = 1;
        } else {
            i = 0;
        }
        ArrayList arrayList2 = new ArrayList(size + i + 1);
        if (vVar == null) {
            n0Var = null;
        } else {
            n0Var = TypeUtilsKt.m60516a(vVar);
        }
        C24361g.m61168j(n0Var, arrayList2);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 >= 0) {
                arrayList2.add(TypeUtilsKt.m60516a((C24307v) next));
                i2 = i3;
            } else {
                C17875h.m44294U();
                throw null;
            }
        }
        arrayList2.add(TypeUtilsKt.m60516a(vVar2));
        int size2 = arrayList.size();
        if (vVar != null) {
            size2++;
        }
        if (z) {
            cVar2 = cVar.mo59398w(size2);
        } else {
            C25069e eVar2 = C23872e.f60322a;
            cVar2 = cVar.mo59388k(C24362h.m61216k(Integer.valueOf(size2), "Function"));
        }
        C24362h.m61210e(cVar2, "if (isSuspendFunction) b…tFunction(parameterCount)");
        if (vVar != null) {
            C25066c cVar3 = C23872e.C23873a.f60378p;
            if (!eVar.mo53070b1(cVar3)) {
                ArrayList w0 = C23825c.m58526w0(eVar, new BuiltInAnnotationDescriptor(cVar, cVar3, C23826d.m58530U()));
                if (w0.isEmpty()) {
                    eVar = C20989e.C20990a.f52739a;
                } else {
                    eVar = new C20993f(w0);
                }
            }
        }
        return KotlinTypeFactory.m60476e(eVar, cVar2, arrayList2);
    }

    /* renamed from: e */
    public static final void m14054e(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        byte[] bArr3 = f18549e;
        int i4 = i + 1;
        bArr2[i3] = (byte) ((bArr3[bArr[i] & 255] << 2) | (bArr3[bArr[i4] & 255] >> 4));
        if (i2 > 2) {
            int i5 = i + 2;
            bArr2[i3 + 1] = (byte) (((bArr3[bArr[i4] & 255] << 4) & 240) | (bArr3[bArr[i5] & 255] >> 2));
            if (i2 > 3) {
                bArr2[i3 + 2] = (byte) (bArr3[bArr[i + 3] & 255] | ((bArr3[bArr[i5] & 255] << 6) & 192));
            }
        }
    }

    /* renamed from: f */
    public static int m14055f(int i) {
        return (int) TypedValue.applyDimension(1, (float) i, Resources.getSystem().getDisplayMetrics());
    }

    /* renamed from: g */
    public static final void m14056g(int i, byte[] bArr, int i2, byte[] bArr2) {
        bArr2[0] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((bArr[i] >> 2) & 63);
        if (i2 == 3) {
            int i3 = i + 1;
            bArr2[1] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(((bArr[i] << 4) & 48) | ((bArr[i3] >> 4) & 15));
            int i4 = i + 2;
            bArr2[2] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(((bArr[i3] << 2) & 60) | ((bArr[i4] >> 6) & 3));
            bArr2[3] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(bArr[i4] & 63);
        } else if (i2 == 2) {
            int i5 = i + 1;
            bArr2[1] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt(((bArr[i] << 4) & 48) | ((bArr[i5] >> 4) & 15));
            bArr2[2] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((bArr[i5] << 2) & 60);
        } else {
            bArr2[1] = (byte) "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".charAt((bArr[i] << 4) & 48);
        }
    }

    /* renamed from: h */
    public static MVAnalyticsFlowKey m14057h(MoovitActivity moovitActivity) {
        try {
            AnalyticsFlowKey analyticsFlowKey = moovitActivity.f37306O;
            if (analyticsFlowKey == null) {
                return null;
            }
            return C17477d.m43544a(analyticsFlowKey);
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (ug0.C25069e.m62821j(r2) != false) goto L_0x0031;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final ug0.C25069e m14058i(lh0.C24307v r2) {
        /*
            ag0.e r2 = r2.getAnnotations()
            ug0.c r0 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60379q
            ag0.c r2 = r2.mo53071c(r0)
            r0 = 0
            if (r2 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.util.Map r2 = r2.mo53067g()
            java.util.Collection r2 = r2.values()
            java.lang.Object r2 = kotlin.collections.C23825c.m58492D0(r2)
            boolean r1 = r2 instanceof zg0.C25514s
            if (r1 == 0) goto L_0x0021
            zg0.s r2 = (zg0.C25514s) r2
            goto L_0x0022
        L_0x0021:
            r2 = r0
        L_0x0022:
            if (r2 != 0) goto L_0x0025
            goto L_0x0030
        L_0x0025:
            T r2 = r2.f63774a
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = ug0.C25069e.m62821j(r2)
            if (r1 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r2 = r0
        L_0x0031:
            if (r2 != 0) goto L_0x0034
            return r0
        L_0x0034:
            ug0.e r2 = ug0.C25069e.m62820i(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p172m9.C5720b.m14058i(lh0.v):ug0.e");
    }

    /* renamed from: j */
    public static int m14059j(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil((double) fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00cd A[LOOP:0: B:35:0x00c9->B:37:0x00cd, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x010d  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m14060k(java.lang.Double r16, java.lang.Double r17, long r18, long r20, java.lang.String r22) {
        /*
            r0 = r22
            java.lang.String r1 = "encryptionKey"
            mf0.C24362h.m61211f(r0, r1)
            r1 = 32
            byte[] r1 = new byte[r1]
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r3 = "wrap(plainText)"
            mf0.C24362h.m61210e(r2, r3)
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2.order(r3)
            r4 = 0
            if (r16 != 0) goto L_0x0020
            r6 = r4
            goto L_0x0024
        L_0x0020:
            double r6 = r16.doubleValue()
        L_0x0024:
            if (r17 != 0) goto L_0x0028
            r8 = r4
            goto L_0x002c
        L_0x0028:
            double r8 = r17.doubleValue()
        L_0x002c:
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 != 0) goto L_0x0032
            r13 = 1
            goto L_0x0033
        L_0x0032:
            r13 = 0
        L_0x0033:
            if (r13 != 0) goto L_0x0041
            int r13 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r13 != 0) goto L_0x003b
            r13 = 1
            goto L_0x003c
        L_0x003b:
            r13 = 0
        L_0x003c:
            if (r13 == 0) goto L_0x003f
            goto L_0x0041
        L_0x003f:
            r13 = 0
            goto L_0x0042
        L_0x0041:
            r13 = 1
        L_0x0042:
            if (r13 == 0) goto L_0x0046
            r13 = 3
            goto L_0x0047
        L_0x0046:
            r13 = 2
        L_0x0047:
            r14 = r18
            r2.putLong(r14)
            r14 = 1412490673(0x5430e5b1, float:3.03907131E12)
            r2.putInt(r14)
            kotlin.random.Random$Default r14 = kotlin.random.Random.f60192b
            int r15 = r14.mo59289b()
            r15 = r15 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r2.put(r15)
            int r15 = r14.mo59289b()
            r15 = r15 & 255(0xff, float:3.57E-43)
            byte r15 = (byte) r15
            r2.put(r15)
            long r10 = java.lang.System.currentTimeMillis()
            r2.putLong(r10)
            if (r12 != 0) goto L_0x0073
            r10 = 1
            goto L_0x0074
        L_0x0073:
            r10 = 0
        L_0x0074:
            if (r10 != 0) goto L_0x0091
            int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x007c
            r4 = 1
            goto L_0x007d
        L_0x007c:
            r4 = 0
        L_0x007d:
            if (r4 == 0) goto L_0x0080
            goto L_0x0091
        L_0x0080:
            r4 = 11930464(0xb60b60, float:1.6718141E-38)
            double r4 = (double) r4
            double r6 = r6 * r4
            int r6 = (int) r6
            r2.putInt(r6)
            double r8 = r8 * r4
            int r4 = (int) r8
            r2.putInt(r4)
            goto L_0x0098
        L_0x0091:
            r4 = 0
            r2.putInt(r4)
            r2.putInt(r4)
        L_0x0098:
            int r4 = r14.mo59289b()
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            int r4 = r14.mo59289b()
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r2.put(r4)
            r2 = 41
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r2)
            java.lang.String r5 = "wrap(code)"
            mf0.C24362h.m61210e(r4, r5)
            r4.order(r3)
            r4.put(r13)
            int r3 = r22.length()
            int r5 = r3 / 2
            byte[] r5 = new byte[r5]
            r6 = 0
        L_0x00c9:
            r7 = 16
            if (r6 >= r3) goto L_0x00ea
            int r8 = r6 / 2
            char r9 = r0.charAt(r6)
            int r9 = java.lang.Character.digit(r9, r7)
            int r9 = r9 << 4
            int r10 = r6 + 1
            char r10 = r0.charAt(r10)
            int r7 = java.lang.Character.digit(r10, r7)
            int r7 = r7 + r9
            byte r7 = (byte) r7
            r5[r8] = r7
            int r6 = r6 + 2
            goto L_0x00c9
        L_0x00ea:
            r0 = 0
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            java.lang.String r6 = "AES"
            r3.<init>(r5, r6)     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            java.lang.String r5 = "AES/CBC/NoPadding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            byte[] r7 = new byte[r7]     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            r6.<init>(r7)     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            r7 = 1
            r5.init(r7, r3, r6)     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            byte[] r1 = r5.doFinal(r1)     // Catch:{ IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0108 }
            goto L_0x010a
        L_0x0108:
            r1 = r0
        L_0x010a:
            if (r1 != 0) goto L_0x010d
            return r0
        L_0x010d:
            r4.put(r1)
            r0 = r20
            r4.putLong(r0)
            r0 = 0
            java.lang.String r0 = android.util.Base64.encodeToString(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p172m9.C5720b.m14060k(java.lang.Double, java.lang.Double, long, long, java.lang.String):java.lang.String");
    }

    /* renamed from: l */
    public static final FunctionClassKind m14061l(C25437e eVar) {
        if (!(eVar instanceof C25432c) || !C23867c.m58680K(eVar)) {
            return null;
        }
        C25067d h = DescriptorUtilsKt.m60287h(eVar);
        if (!h.mo61596f() || h.mo61594e()) {
            return null;
        }
        FunctionClassKind.C23874a aVar = FunctionClassKind.Companion;
        String f = h.mo61598h().mo61604f();
        C24362h.m61210e(f, "shortName().asString()");
        C25066c e = h.mo61600i().mo61583e();
        C24362h.m61210e(e, "toSafe().parent()");
        aVar.getClass();
        FunctionClassKind.C23874a.C23875a a = FunctionClassKind.C23874a.m58712a(f, e);
        if (a == null) {
            return null;
        }
        return a.f60389a;
    }

    /* renamed from: m */
    public static synchronized C5720b m14062m() {
        C5720b bVar;
        synchronized (C5720b.class) {
            if (f18546b == null) {
                f18546b = new C5720b();
            }
            bVar = f18546b;
        }
        return bVar;
    }

    /* renamed from: n */
    public static String m14063n(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (C20964s0.m49090h(fileExtensionFromUrl)) {
            return "";
        }
        return C20964s0.m49106x(MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl));
    }

    /* renamed from: o */
    public static final C24307v m14064o(C24307v vVar) {
        boolean z;
        C24362h.m61211f(vVar, "<this>");
        m14069t(vVar);
        if (vVar.getAnnotations().mo53071c(C23872e.C23873a.f60378p) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return ((C24281l0) C23825c.m58513j0(vVar.mo60410N0())).getType();
        }
        return null;
    }

    /* renamed from: p */
    public static final List m14065p(C24307v vVar) {
        boolean z;
        C24362h.m61211f(vVar, "<this>");
        m14069t(vVar);
        List<C24281l0> N0 = vVar.mo60410N0();
        int i = 0;
        if (m14069t(vVar)) {
            if (vVar.getAnnotations().mo53071c(C23872e.C23873a.f60378p) != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 1;
            }
        }
        return N0.subList(i, N0.size() - 1);
    }

    /* renamed from: q */
    public static int[] m14066q(Context context, Class cls) {
        return AppWidgetManager.getInstance(context.getApplicationContext()).getAppWidgetIds(new ComponentName(context, cls));
    }

    /* renamed from: r */
    public static void m14067r(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }

    /* renamed from: s */
    public static void m14068s(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        if (UnityAds.isInitialized()) {
            iUnityAdsInitializationListener.onInitializationComplete();
            return;
        }
        MediationMetaData mediationMetaData = new MediationMetaData(context);
        mediationMetaData.setName("AdMob");
        mediationMetaData.setVersion(UnityAds.getVersion());
        mediationMetaData.set("adapter_version", (Object) "4.2.1.1");
        mediationMetaData.commit();
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }

    /* renamed from: t */
    public static final boolean m14069t(C24307v vVar) {
        boolean z;
        C24362h.m61211f(vVar, "<this>");
        C25437e o = vVar.mo60411O0().mo53460o();
        if (o == null) {
            return false;
        }
        FunctionClassKind l = m14061l(o);
        if (l == FunctionClassKind.Function || l == FunctionClassKind.SuspendFunction) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return false;
    }

    /* renamed from: u */
    public static boolean m14070u(char c) {
        return c >= 128 && c <= 255;
    }

    /* renamed from: v */
    public static boolean m14071v(UserAccountManager userAccountManager) {
        C13547a aVar;
        boolean z;
        C17259d e;
        String str;
        C13550c cVar = userAccountManager.f40567b;
        synchronized (cVar) {
            aVar = cVar.f33494b;
        }
        if (aVar.f33490a != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !ConnectProvider.GOOGLE.equals(aVar.f33491b) || (e = userAccountManager.mo46575f().mo49805e()) == null || (str = e.f44606e) == null || !str.endsWith("moovit.com")) {
            return false;
        }
        return true;
    }

    /* renamed from: w */
    public static boolean m14072w(char c) {
        return (c == 13 || c == '*' || c == '>') || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    /* renamed from: x */
    public static final boolean m14073x(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        C25437e o = vVar.mo60411O0().mo53460o();
        return (o == null ? null : m14061l(o)) == FunctionClassKind.SuspendFunction;
    }

    /* renamed from: y */
    public static void m14074y(Class cls, C24757k.C24760c cVar) {
        C24362h.m61211f(cls, "klass");
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        C24362h.m61210e(declaredAnnotations, "klass.declaredAnnotations");
        int length = declaredAnnotations.length;
        int i = 0;
        while (i < length) {
            Annotation annotation = declaredAnnotations[i];
            i++;
            C24362h.m61210e(annotation, "annotation");
            m14036D(cVar, annotation);
        }
        cVar.mo59591a();
    }

    /* renamed from: z */
    public static int m14075z(String str, int i, int i2) {
        float[] fArr;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        boolean z5;
        String str2 = str;
        int i4 = i;
        if (i4 >= str.length()) {
            return i2;
        }
        if (i2 == 0) {
            fArr = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i5 = 0;
        while (true) {
            int i6 = i4 + i5;
            if (i6 == str.length()) {
                byte[] bArr = new byte[6];
                int[] iArr = new int[6];
                int j = m14059j(fArr, iArr, bArr);
                int i7 = 0;
                for (int i8 = 0; i8 < 6; i8++) {
                    i7 += bArr[i8];
                }
                if (iArr[0] == j) {
                    return 0;
                }
                if (i7 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i7 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i7 == 1 && bArr[2] > 0) {
                    return 2;
                }
                if (i7 != 1 || bArr[3] <= 0) {
                    return 1;
                }
                return 3;
            }
            char charAt = str2.charAt(i6);
            i5++;
            if (charAt < '0' || charAt > '9') {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                fArr[0] = fArr[0] + 0.5f;
            } else if (m14070u(charAt)) {
                float ceil = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil;
                fArr[0] = ceil + 2.0f;
            } else {
                float ceil2 = (float) Math.ceil((double) fArr[0]);
                fArr[0] = ceil2;
                fArr[0] = ceil2 + 1.0f;
            }
            if (charAt == ' ' || ((charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z'))) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else if (m14070u(charAt)) {
                fArr[1] = fArr[1] + 2.6666667f;
            } else {
                fArr[1] = fArr[1] + 1.3333334f;
            }
            if (charAt == ' ' || ((charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z'))) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else if (m14070u(charAt)) {
                fArr[2] = fArr[2] + 2.6666667f;
            } else {
                fArr[2] = fArr[2] + 1.3333334f;
            }
            if (m14072w(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else if (m14070u(charAt)) {
                fArr[3] = fArr[3] + 4.3333335f;
            } else {
                fArr[3] = fArr[3] + 3.3333333f;
            }
            if (charAt < ' ' || charAt > '^') {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                i3 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i3 = 4;
                if (m14070u(charAt)) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            if (i5 >= i3) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                m14059j(fArr, iArr2, bArr2);
                int i9 = 0;
                for (int i11 = 0; i11 < 6; i11++) {
                    i9 += bArr2[i11];
                }
                int i12 = iArr2[0];
                int i13 = iArr2[5];
                if (i12 < i13 && i12 < iArr2[1] && i12 < iArr2[2] && i12 < iArr2[3] && i12 < iArr2[4]) {
                    return 0;
                }
                if (i13 < i12) {
                    return 5;
                }
                byte b = bArr2[1];
                byte b2 = bArr2[2];
                byte b3 = bArr2[3];
                byte b4 = bArr2[4];
                if (b + b2 + b3 + b4 == 0) {
                    return 5;
                }
                if (i9 == 1 && b4 > 0) {
                    return 4;
                }
                if (i9 == 1 && b2 > 0) {
                    return 2;
                }
                if (i9 == 1 && b3 > 0) {
                    return 3;
                }
                int i14 = iArr2[1];
                int i15 = i14 + 1;
                if (i15 < i12 && i15 < i13 && i15 < iArr2[4] && i15 < iArr2[2]) {
                    int i16 = iArr2[3];
                    if (i14 < i16) {
                        return 1;
                    }
                    if (i14 == i16) {
                        int i17 = i4 + i5 + 1;
                        while (i17 < str.length()) {
                            char charAt2 = str2.charAt(i17);
                            if (charAt2 == 13 || charAt2 == '*' || charAt2 == '>') {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (!z5) {
                                if (!m14072w(charAt2)) {
                                    break;
                                }
                                i17++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    public void onFailure(Exception exc) {
        C14313r2.f36018e.mo978e(String.format("Could not sync active asset packs. %s", new Object[]{exc}), new Object[0]);
    }
}
