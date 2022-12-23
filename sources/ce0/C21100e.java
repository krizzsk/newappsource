package ce0;

import android.app.Application;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowManager;
import bi0.C21079q;
import c70.C13752e;
import cf0.C21151y;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.ValidationUtils;
import com.appsflyer.ServerParameters;
import com.cubic.umo.Environment;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.appupdate.C14226d;
import com.moovit.MoovitApplication;
import com.moovit.commons.utils.ApplicationBugException;
import com.moovit.location.C16202a;
import com.moovit.request.UserRequestError;
import com.moovit.sdk.Locale.LocaleInfo;
import com.moovit.sdk.protocol.ProtocolEnums$MVClientResolution;
import ff0.C23349c;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import kg0.C23776a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C23825c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C23830xa50de660;
import kotlin.coroutines.intrinsics.C23831xa50de661;
import kotlin.coroutines.intrinsics.C23832xa50de662;
import kotlin.coroutines.intrinsics.C23833xa50de663;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.random.Random;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Function;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Property;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Type;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$ValueParameter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import lf0.C24240p;
import lh0.C24298r;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import org.apache.thrift.TBase;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p001a0.C0016g;
import p001a0.C0017h;
import p009a8.C0098d0;
import p009a8.C0115o;
import p043ch.C13832c;
import p221q6.C6181b;
import p232r4.C6241a;
import p232r4.C6242b;
import p232r4.C6243c;
import p242s1.C6333d0;
import p242s1.C6382p0;
import p242s1.C6386q0;
import p258t4.C6587a;
import p277ub.C6774a0;
import p358af.C13437d;
import p389bl.C13637c;
import p404ce.C13791f;
import p404ce.C13806s;
import p599kc.C18017a;
import p627lg.C18205d;
import p627lg.C18209h;
import p646lz.C18299a;
import p651mh.C18370a;
import p651mh.C18371b;
import p675nh.C18551b;
import p746qh.C19121b;
import p746qh.C19124d;
import p746qh.C19126f;
import p792sh.C19461a;
import p811tc.C19645d;
import p811tc.C19648g;
import p811tc.C19653j;
import rf0.C24806h;
import sg0.C24879e;
import uf0.C25032b;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25081h;
import vi0.C25111a;
import xi0.C25276a;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25449j;
import zf0.C25485t;
import zf0.C25486u;
import zf0.C25487v;
import zf0.C25488w;

/* renamed from: ce0.e */
public class C21100e implements C13791f, C23776a, C6386q0 {

    /* renamed from: b */
    public static final C21100e f52941b = new C21100e();

    /* renamed from: c */
    public static final C21079q f52942c = new C21079q("CONDITION_FALSE");

    /* renamed from: d */
    public static final /* synthetic */ C21100e f52943d = new C21100e();

    /* renamed from: e */
    public static C18371b f52944e = new C18371b();

    /* renamed from: f */
    public static boolean f52945f;

    /* renamed from: g */
    public static final byte[] f52946g = {-3, 55, 122, 88, 90, 0};

    /* renamed from: h */
    public static final byte[] f52947h = {89, 90};

    /* renamed from: A */
    public static final void m49296A(C25487v vVar, C25066c cVar, ArrayList arrayList) {
        C24362h.m61211f(vVar, "<this>");
        C24362h.m61211f(cVar, "fqName");
        if (vVar instanceof C25488w) {
            ((C25488w) vVar).mo53521a(cVar, arrayList);
        } else {
            arrayList.addAll(vVar.mo53522b(cVar));
        }
    }

    /* renamed from: A0 */
    public static void m49297A0(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C19648g) {
            m49299B0(view, (C19648g) background);
        }
    }

    /* renamed from: B */
    public static final int m49298B(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* renamed from: B0 */
    public static void m49299B0(View view, C19648g gVar) {
        boolean z;
        C18017a aVar = gVar.f49837b.f49862b;
        if (aVar == null || !aVar.f46134a) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float f = BitmapDescriptorFactory.HUE_RED;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, C6382p0> weakHashMap = C6333d0.f19990a;
                f += C6333d0.C6342i.m15092i((View) parent);
            }
            C19648g.C19650b bVar = gVar.f49837b;
            if (bVar.f49873m != f) {
                bVar.f49873m = f;
                gVar.mo52015v();
            }
        }
    }

    /* renamed from: C */
    public static int m49300C(String str, String str2) {
        int glCreateProgram = GLES20.glCreateProgram();
        m49353n();
        m49344i(35633, glCreateProgram, str);
        m49344i(35632, glCreateProgram, str2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            String valueOf = String.valueOf(GLES20.glGetProgramInfoLog(glCreateProgram));
            if (valueOf.length() != 0) {
                "Unable to link shader program: \n".concat(valueOf);
            }
        }
        m49353n();
        return glCreateProgram;
    }

    /* renamed from: C0 */
    public static int m49301C0(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: D */
    public static byte[] m49302D(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        byte[] bArr3 = new byte[(length + length2)];
        System.arraycopy(bArr, 0, bArr3, 0, length);
        System.arraycopy(bArr2, 0, bArr3, length, length2);
        return bArr3;
    }

    /* renamed from: D0 */
    public static void m49303D0(C6242b bVar) {
        C6241a aVar;
        while (bVar != null) {
            if (bVar instanceof C6241a) {
                C6241a aVar2 = (C6241a) bVar;
                m49303D0(aVar2.f19692h);
                aVar = aVar2;
            } else if (bVar instanceof C6243c) {
                aVar = (C6243c) bVar;
            } else {
                bVar = (C6242b) bVar.f19694c;
            }
            aVar.start();
            bVar = (C6242b) bVar.f19694c;
        }
    }

    /* renamed from: E */
    public static String m49304E(byte[] bArr) {
        return new String(bArr, StandardCharsets.UTF_8);
    }

    /* renamed from: E0 */
    public static String m49305E0(int i) {
        return C6774a0.m15950j("rgba(%d,%d,%d,%.3f)", Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d));
    }

    /* renamed from: F */
    public static List m49306F(List list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    /* renamed from: F0 */
    public static final ProtoBuf$Type m49307F0(ProtoBuf$ValueParameter protoBuf$ValueParameter, C24879e eVar) {
        C24362h.m61211f(eVar, "typeTable");
        if (protoBuf$ValueParameter.mo59896F()) {
            ProtoBuf$Type z = protoBuf$ValueParameter.mo59902z();
            C24362h.m61210e(z, "type");
            return z;
        } else if (protoBuf$ValueParameter.mo59897G()) {
            return eVar.mo61353a(protoBuf$ValueParameter.mo59891A());
        } else {
            throw new IllegalStateException("No type in ProtoBuf.ValueParameter".toString());
        }
    }

    /* renamed from: G */
    public static final void m49308G(int i, int i2) {
        if (i > i2) {
            throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
        }
    }

    /* renamed from: G0 */
    public static final C24312z m49309G0(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        C24306u0 R0 = vVar.mo60450R0();
        if (R0 instanceof C24298r) {
            return ((C24298r) R0).f61595d;
        }
        if (R0 instanceof C24312z) {
            return (C24312z) R0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: H */
    public static FloatBuffer m49310H(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    /* renamed from: H0 */
    public static void m49311H0(int i, int i2, long j, byte[] bArr) {
        int i3 = i;
        int i4 = i2;
        long j2 = j;
        byte[] bArr2 = bArr;
        long j3 = 1;
        if ((j2 >> (i4 - 1)) > 1) {
            throw new IllegalArgumentException("Cannot write " + j2 + " in only " + i4 + "bits!");
        } else if (i3 < 0) {
            throw new IllegalArgumentException("bitPos cannot be negative!");
        } else if (i3 >= bArr2.length * 8) {
            StringBuilder r = C25541a.m63887r("bitPos(", i3, ") cannot be >= to total number of bits (");
            r.append(bArr2.length * 8);
            r.append("");
            throw new IllegalArgumentException(r.toString());
        } else if (i4 >= 0) {
            int i5 = i3 + i4;
            if (i5 <= bArr2.length * 8) {
                int i6 = i3;
                while (i6 < i5) {
                    int i7 = (int) ((j2 >> ((i4 - (i6 - i3)) - 1)) & j3);
                    if (i7 != 0 && i7 != 1) {
                        throw new IllegalArgumentException(C25541a.m63878h("bit value can only be 0 or 1 not ", i7, " !"));
                    } else if (i6 < 0) {
                        throw new IllegalArgumentException("bitPos cannot be negative!");
                    } else if (i6 < bArr2.length * 8) {
                        int i8 = i6 / 8;
                        int i9 = 7 - (i6 % 8);
                        if (i7 == 1) {
                            bArr2[i8] = (byte) ((1 << i9) | bArr2[i8]);
                        } else {
                            bArr2[i8] = (byte) (((1 << i9) ^ 255) & bArr2[i8]);
                        }
                        i6++;
                        j3 = 1;
                    } else {
                        StringBuilder r2 = C25541a.m63887r("bitPos(", i6, ") cannot be >= to total number of bits (");
                        r2.append(bArr2.length * 8);
                        r2.append("");
                        throw new IllegalArgumentException(r2.toString());
                    }
                }
                return;
            }
            StringBuilder s = C0016g.m35s("cannot write at position bitPos( ", i3, ") + nbBits(", i4, ")=");
            s.append(i5);
            s.append("as total bit-length is ");
            s.append(bArr2.length * 8);
            s.append("only!");
            throw new IllegalArgumentException(s.toString());
        } else {
            throw new IllegalArgumentException("nBits cannot be negative!");
        }
    }

    /* renamed from: I */
    public static C6181b m49312I(int i) {
        if (i == 0) {
            return new C19653j();
        }
        if (i != 1) {
            return new C19653j();
        }
        return new C19645d();
    }

    /* renamed from: I0 */
    public static int m49313I0(int i, String str) {
        return C13715c.m34238d(str, i, 31);
    }

    /* renamed from: J */
    public static final C23349c m49314J(C24236l lVar, C23349c cVar) {
        C24362h.m61211f(lVar, "<this>");
        C24362h.m61211f(cVar, "completion");
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(cVar);
        }
        CoroutineContext context = cVar.getContext();
        if (context == EmptyCoroutineContext.f60190b) {
            return new C23830xa50de660(lVar, cVar);
        }
        return new C23831xa50de661(cVar, context, lVar);
    }

    /* renamed from: J0 */
    public static StringBuilder m49315J0(String str) {
        return C13555b.m33972k(str);
    }

    /* renamed from: K */
    public static final C23349c m49316K(C24240p pVar, Object obj, C23349c cVar) {
        C24362h.m61211f(pVar, "<this>");
        C24362h.m61211f(cVar, "completion");
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(obj, cVar);
        }
        CoroutineContext context = cVar.getContext();
        if (context == EmptyCoroutineContext.f60190b) {
            return new C23832xa50de662(pVar, obj, cVar);
        }
        return new C23833xa50de663(cVar, context, pVar, obj);
    }

    /* renamed from: L */
    public static UserRequestError m49317L(Application application, int i, int i2, int i3) {
        String str;
        String str2 = "";
        if (i2 != 0) {
            str = application.getString(i2);
        } else {
            str = str2;
        }
        if (i3 != 0) {
            str2 = application.getString(i3);
        }
        return new UserRequestError(i, str, str2);
    }

    /* renamed from: M */
    public static String m49318M(String str) {
        StringBuilder O = C0017h.m58O(C0016g.m25h(str, C0016g.m25h(str, 5)), ".", str, ",.", str);
        O.append(" *");
        return O.toString();
    }

    /* renamed from: N */
    public static JSONObject m49319N(LocaleInfo localeInfo) {
        if (localeInfo == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("language", localeInfo.f15164b);
            jSONObject.put(ServerParameters.COUNTRY, localeInfo.f15165c);
            jSONObject.put("variant", localeInfo.f15166d);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: O */
    public static Environment m49320O(String str) {
        str.getClass();
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1984588268:
                if (str.equals("Moovit")) {
                    c = 0;
                    break;
                }
                break;
            case 68597:
                if (str.equals("Dev")) {
                    c = 1;
                    break;
                }
                break;
            case 2126339:
                if (str.equals("Demo")) {
                    c = 2;
                    break;
                }
                break;
            case 2496375:
                if (str.equals("Prod")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return Environment.MOOVIT;
            case 1:
                return Environment.DEV;
            case 2:
                return Environment.SANDBOX;
            case 3:
                return Environment.PROD;
            default:
                throw new IllegalStateException(C25541a.m63881k("Unknown umo sdk environment: ", str));
        }
    }

    /* renamed from: P */
    public static void m49321P(Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            throw new IllegalArgumentException(C25541a.m63881k("Bundle must contain ", str));
        }
    }

    /* renamed from: Q */
    public static int m49322Q(float f, int i, int i2) {
        if (i == i2) {
            return i;
        }
        float f2 = ((float) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f;
        float e = m49336e(((float) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f);
        float e2 = m49336e(((float) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f);
        float e3 = m49336e(((float) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f);
        float e4 = m49336e(((float) ((i2 >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f);
        float e5 = m49336e(((float) ((i2 >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f);
        float e6 = m49336e(((float) (i2 & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f);
        float c = C16759e.m42347c(((float) ((i2 >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH)) / 255.0f, f2, f, f2);
        float c2 = C16759e.m42347c(e4, e, f, e);
        float c3 = C16759e.m42347c(e5, e2, f, e2);
        float c4 = C16759e.m42347c(e6, e3, f, e3);
        int round = Math.round(m49338f(c2) * 255.0f) << 16;
        return Math.round(m49338f(c4) * 255.0f) | round | (Math.round(c * 255.0f) << 24) | (Math.round(m49338f(c3) * 255.0f) << 8);
    }

    /* renamed from: R */
    public static final void m49323R(Throwable th) {
        HashMap hashMap;
        FeatureManager.Feature feature;
        if (f52945f && th != null) {
            HashSet hashSet = new HashSet();
            StackTraceElement[] stackTrace = th.getStackTrace();
            C24362h.m61210e(stackTrace, "e.stackTrace");
            for (StackTraceElement className : stackTrace) {
                FeatureManager featureManager = FeatureManager.f8588a;
                String className2 = className.getClassName();
                C24362h.m61210e(className2, "it.className");
                synchronized (FeatureManager.f8588a) {
                    hashMap = FeatureManager.f8589b;
                    if (hashMap.isEmpty()) {
                        hashMap.put(FeatureManager.Feature.AAM, new String[]{"com.facebook.appevents.aam."});
                        hashMap.put(FeatureManager.Feature.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
                        hashMap.put(FeatureManager.Feature.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
                        hashMap.put(FeatureManager.Feature.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
                        hashMap.put(FeatureManager.Feature.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
                        hashMap.put(FeatureManager.Feature.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
                        hashMap.put(FeatureManager.Feature.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
                        hashMap.put(FeatureManager.Feature.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
                        hashMap.put(FeatureManager.Feature.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
                        hashMap.put(FeatureManager.Feature.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
                        hashMap.put(FeatureManager.Feature.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
                        hashMap.put(FeatureManager.Feature.IapLogging, new String[]{"com.facebook.appevents.iap."});
                        hashMap.put(FeatureManager.Feature.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
                    }
                }
                Iterator it = hashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        feature = FeatureManager.Feature.Unknown;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    feature = (FeatureManager.Feature) entry.getKey();
                    String[] strArr = (String[]) entry.getValue();
                    int length = strArr.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            String str = strArr[i];
                            i++;
                            if (C25081h.m62835F(className2, str)) {
                                break;
                            }
                        }
                    }
                }
                if (feature != FeatureManager.Feature.Unknown) {
                    FeatureManager featureManager2 = FeatureManager.f8588a;
                    C24362h.m61211f(feature, "feature");
                    C0115o.m210a().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(feature.toKey(), "15.1.0").apply();
                    hashSet.add(feature.toString());
                }
            }
            C0115o oVar = C0115o.f331a;
            if (C0098d0.m169b() && (!hashSet.isEmpty())) {
                new InstrumentData(new JSONArray(hashSet)).mo12559c();
            }
        }
    }

    /* renamed from: S */
    public static TBase m49324S(Class cls, byte[] bArr) {
        try {
            C25111a aVar = new C25111a(new C25276a((InputStream) new ByteArrayInputStream(bArr)));
            TBase tBase = (TBase) cls.newInstance();
            tBase.mo25201C1(aVar);
            return tBase;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: T */
    public static String m49325T(String str, String str2) {
        if (str2.contains(str)) {
            return str2;
        }
        return C13437d.m33706k(str, " ", str2);
    }

    /* renamed from: U */
    public static String m49326U() {
        return m49304E(new byte[]{65, 99, 99, 111, 117, 110, 116, 66, 97, 115, 101, 100, 84, 105, 99, 107, 101, 116, 105, 110, 103});
    }

    /* renamed from: V */
    public static String m49327V() {
        return m49304E(new byte[]{65, 99, 99, 111, 117, 110, 116});
    }

    /* renamed from: W */
    public static String m49328W() {
        return m49304E(new byte[]{65, 99, 116, 105, 118, 97, 116, 105, 111, 110, 115});
    }

    /* renamed from: X */
    public static final C18299a m49329X(Context context) {
        C24362h.m61211f(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        C24362h.m61209d(applicationContext, "null cannot be cast to non-null type com.moovit.MoovitApplication<*, *, *>");
        C18299a aVar = ((MoovitApplication) applicationContext).f37321e;
        C24362h.m61210e(aVar, "applicationContext as Mo…<*, *, *>).appDataManager");
        return aVar;
    }

    /* renamed from: Y */
    public static final int m49330Y(C25032b bVar) {
        C24362h.m61211f(bVar, "<this>");
        return bVar.mo59359b().size();
    }

    /* renamed from: Z */
    public static String m49331Z() {
        return m49304E(new byte[]{65, 117, 116, 104, 101, 110, 116, 105, 99, 97, 116, 105, 111, 110});
    }

    /* renamed from: a0 */
    public static String m49332a0() {
        return m49304E(new byte[]{66, 114, 97, 110, 100, 68, 97, 116, 97});
    }

    /* renamed from: b0 */
    public static String m49333b0() {
        return m49304E(new byte[]{67, 114, 101, 100, 101, 110, 116, 105, 97, 108, 115});
    }

    /* renamed from: c0 */
    public static String m49334c0() {
        return m49304E(new byte[]{71, 85, 69, 83, 84});
    }

    /* renamed from: d0 */
    public static int m49335d0(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: e */
    public static float m49336e(float f) {
        return f <= 0.04045f ? f / 12.92f : (float) Math.pow((double) ((f + 0.055f) / 1.055f), 2.4000000953674316d);
    }

    /* renamed from: e0 */
    public static String m49337e0() {
        return m49304E(new byte[]{75, 101, 121, 115});
    }

    /* renamed from: f */
    public static float m49338f(float f) {
        return f <= 0.0031308f ? f * 12.92f : (float) ((Math.pow((double) f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }

    /* renamed from: f0 */
    public static final Location m49339f0(Context context) {
        C24362h.m61211f(context, "<this>");
        return C16202a.get(context).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i();
    }

    /* renamed from: g */
    public static void m49340g(String str) {
        if (C18370a.f46838a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
    }

    /* renamed from: g0 */
    public static final C13752e m49341g0(Context context) {
        C24362h.m61211f(context, "<this>");
        Context applicationContext = context.getApplicationContext();
        C24362h.m61209d(applicationContext, "null cannot be cast to non-null type com.moovit.MoovitApplication<*, *, *>");
        C13752e l = ((MoovitApplication) applicationContext).mo44560l();
        C24362h.m61210e(l, "applicationContext as Mo…<*, *, *>).requestContext");
        return l;
    }

    /* renamed from: h */
    public static void m49342h(Context context) {
        C18371b bVar = f52944e;
        Context applicationContext = context.getApplicationContext();
        C14226d.m35346l0(applicationContext, "Application Context cannot be null");
        if (!bVar.f46839a) {
            bVar.f46839a = true;
            C19126f a = C19126f.m46285a();
            a.f48625c.getClass();
            C13637c cVar = new C13637c();
            C6587a aVar = a.f48624b;
            Handler handler = new Handler();
            aVar.getClass();
            a.f48626d = new C18551b(handler, applicationContext, cVar, a);
            C19121b bVar2 = C19121b.f48610e;
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(bVar2);
            }
            WindowManager windowManager = C19461a.f49487a;
            C19461a.f49489c = applicationContext.getResources().getDisplayMetrics().density;
            C19461a.f49487a = (WindowManager) applicationContext.getSystemService("window");
            C19124d.f48618b.f48619a = applicationContext.getApplicationContext();
        }
    }

    /* renamed from: h0 */
    public static ProtocolEnums$MVClientResolution m49343h0(Context context) {
        int i = context.getResources().getDisplayMetrics().densityDpi;
        if (i <= 160) {
            return ProtocolEnums$MVClientResolution.Android_160;
        }
        if (i <= 240) {
            return ProtocolEnums$MVClientResolution.Android_240;
        }
        if (i <= 320) {
            return ProtocolEnums$MVClientResolution.Android_320;
        }
        if (i <= 480) {
            return ProtocolEnums$MVClientResolution.Android_480;
        }
        return ProtocolEnums$MVClientResolution.Android_640;
    }

    /* renamed from: i */
    public static void m49344i(int i, int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            new StringBuilder(C0016g.m25h(str, String.valueOf(GLES20.glGetShaderInfoLog(glCreateShader)).length() + 10));
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        m49353n();
    }

    /* renamed from: i0 */
    public static int m49345i0(int i, String str) {
        int indexOf = str.indexOf(46, i);
        int indexOf2 = str.indexOf(36, i);
        if (indexOf == -1 && indexOf2 == -1) {
            return -1;
        }
        return indexOf == -1 ? indexOf2 : (indexOf2 != -1 && indexOf >= indexOf2) ? indexOf2 : indexOf;
    }

    /* renamed from: j */
    public static int m49346j(C13832c cVar, boolean z) {
        int i;
        int i2;
        byte b;
        if (z) {
            i = cVar.f34033c;
        } else {
            i = cVar.f34032b;
        }
        if (z) {
            i2 = cVar.f34032b;
        } else {
            i2 = cVar.f34033c;
        }
        byte[][] bArr = (byte[][]) cVar.f34034d;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b2 = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                if (z) {
                    b = bArr[i4][i6];
                } else {
                    b = bArr[i6][i4];
                }
                if (b == b2) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 = C16530d.m42011d(i5, -5, 3, i3);
                    }
                    b2 = b;
                    i5 = 1;
                }
            }
            if (i5 >= 5) {
                i3 = C16530d.m42011d(i5, -5, 3, i3);
            }
        }
        return i3;
    }

    /* renamed from: j0 */
    public static String m49347j0() {
        return m49304E(new byte[]{84, 105, 99, 107, 101, 116, 115});
    }

    /* renamed from: k */
    public static ArrayList m49348k(byte[] bArr) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong((((long) (((bArr[11] & 255) << 8) | (bArr[10] & 255))) * 1000000000) / 48000).array());
        arrayList.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(80000000).array());
        return arrayList;
    }

    /* renamed from: k0 */
    public static final C25437e m49349k0(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        C25442g b = gVar.mo53399b();
        if (b == null || (gVar instanceof C25486u)) {
            return null;
        }
        if (!(b.mo53399b() instanceof C25486u)) {
            return m49349k0(b);
        }
        if (b instanceof C25437e) {
            return (C25437e) b;
        }
        return null;
    }

    /* renamed from: l */
    public static void m49350l(Object... objArr) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            if (objArr[i] != null) {
                i++;
            } else {
                throw new NullPointerException(C13715c.m34241g(20, "at index ", i));
            }
        }
    }

    /* renamed from: l0 */
    public static final C23349c m49351l0(C23349c cVar) {
        C23349c<Object> intercepted;
        C24362h.m61211f(cVar, "<this>");
        ContinuationImpl continuationImpl = cVar instanceof ContinuationImpl ? (ContinuationImpl) cVar : null;
        return (continuationImpl == null || (intercepted = continuationImpl.intercepted()) == null) ? cVar : intercepted;
    }

    /* renamed from: m0 */
    public static boolean m49352m0(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    /* renamed from: n */
    public static void m49353n() {
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError != 0) {
                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                if (valueOf.length() != 0) {
                    "glError ".concat(valueOf);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: n0 */
    public static final boolean m49354n0(C25487v vVar, C25066c cVar) {
        C24362h.m61211f(vVar, "<this>");
        C24362h.m61211f(cVar, "fqName");
        if (vVar instanceof C25488w) {
            return ((C25488w) vVar).mo53523c(cVar);
        }
        return m49366t0(vVar, cVar).isEmpty();
    }

    /* renamed from: o */
    public static void m49355o() {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                StackTraceElement stackTraceElement = e.getStackTrace()[2];
                throw new IllegalStateException(C25541a.m63881k(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName(), " may not be called from the main thread"));
            }
        }
    }

    /* renamed from: o0 */
    public static final boolean m49356o0(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        return vVar.mo60450R0() instanceof C24298r;
    }

    /* renamed from: p */
    public static void m49357p(float f, String str) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException(str + " (" + f + ") may not be negative");
        }
    }

    /* renamed from: p0 */
    public static final C24312z m49358p0(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        C24306u0 R0 = vVar.mo60450R0();
        if (R0 instanceof C24298r) {
            return ((C24298r) R0).f61594c;
        }
        if (R0 instanceof C24312z) {
            return (C24312z) R0;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: q */
    public static void m49359q(int i, String str) {
        if (i < 0) {
            throw new IllegalArgumentException(str + " (" + i + ") may not be negative");
        }
    }

    /* renamed from: q0 */
    public static final int m49360q0(Random.Default defaultR, C24806h hVar) {
        if (!hVar.isEmpty()) {
            int i = hVar.f62729c;
            if (i < Integer.MAX_VALUE) {
                return defaultR.mo59291d(hVar.f62728b, i + 1);
            }
            int i2 = hVar.f62728b;
            if (i2 > Integer.MIN_VALUE) {
                return defaultR.mo59291d(i2 - 1, i) + 1;
            }
            return defaultR.mo59289b();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + hVar);
    }

    /* renamed from: r */
    public static void m49361r(long j, String str) {
        if (j < 0) {
            throw new IllegalArgumentException(str + " (" + j + ") may not be negative");
        }
    }

    /* renamed from: r0 */
    public static List m49362r0(List list) {
        if (list == null) {
            return null;
        }
        return m49306F(list);
    }

    /* renamed from: s */
    public static void m49363s(float f, String str) {
        if (f < BitmapDescriptorFactory.HUE_RED || f > 1.0f) {
            throw new IllegalArgumentException(str + " (" + f + ") must be in the range [" + BitmapDescriptorFactory.HUE_RED + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + 1.0f + "]");
        }
    }

    /* renamed from: s0 */
    public static final ProtoBuf$Type m49364s0(ProtoBuf$Type protoBuf$Type, C24879e eVar) {
        C24362h.m61211f(protoBuf$Type, "<this>");
        C24362h.m61211f(eVar, "typeTable");
        if (protoBuf$Type.mo59834d0()) {
            return protoBuf$Type.mo59821Q();
        }
        if (protoBuf$Type.mo59835e0()) {
            return eVar.mo61353a(protoBuf$Type.mo59822R());
        }
        return null;
    }

    /* renamed from: t */
    public static void m49365t(int i, String str) {
        if (i <= 0) {
            throw new IllegalArgumentException(str + " (" + i + ") may not be negative or zero");
        }
    }

    /* renamed from: t0 */
    public static final ArrayList m49366t0(C25487v vVar, C25066c cVar) {
        C24362h.m61211f(vVar, "<this>");
        C24362h.m61211f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        m49296A(vVar, cVar, arrayList);
        return arrayList;
    }

    /* renamed from: u */
    public static void m49367u(long j, String str) {
        if (j <= 0) {
            throw new IllegalArgumentException(str + " (" + j + ") may not be negative or zero");
        }
    }

    /* renamed from: u0 */
    public static final ProtoBuf$Type m49368u0(ProtoBuf$Function protoBuf$Function, C24879e eVar) {
        C24362h.m61211f(protoBuf$Function, "<this>");
        C24362h.m61211f(eVar, "typeTable");
        if (protoBuf$Function.mo59740V()) {
            return protoBuf$Function.mo59729K();
        }
        if (protoBuf$Function.mo59741W()) {
            return eVar.mo61353a(protoBuf$Function.mo59730L());
        }
        return null;
    }

    /* renamed from: v */
    public static void m49369v(int i) {
        boolean z;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            try {
                throw new IllegalStateException();
            } catch (IllegalStateException e) {
                StackTraceElement stackTraceElement = e.getStackTrace()[i + 1];
                throw new IllegalStateException(C25541a.m63881k(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName(), " may only be called from the main thread"));
            }
        }
    }

    /* renamed from: v0 */
    public static final C25432c m49370v0(C25485t tVar, C25066c cVar, NoLookupLocation noLookupLocation) {
        C25432c cVar2;
        C25449j jVar;
        C24362h.m61211f(tVar, "<this>");
        C24362h.m61211f(cVar, "fqName");
        C24362h.m61211f(noLookupLocation, "lookupLocation");
        if (cVar.mo61582d()) {
            return null;
        }
        C25066c e = cVar.mo61583e();
        C24362h.m61210e(e, "fqName.parent()");
        MemberScope o = tVar.mo59458k0(e).mo59447o();
        C25069e f = cVar.mo61585f();
        C24362h.m61210e(f, "fqName.shortName()");
        C25437e g = o.mo58433g(f, noLookupLocation);
        if (g instanceof C25432c) {
            cVar2 = (C25432c) g;
        } else {
            cVar2 = null;
        }
        if (cVar2 != null) {
            return cVar2;
        }
        C25066c e2 = cVar.mo61583e();
        C24362h.m61210e(e2, "fqName.parent()");
        C25432c v0 = m49370v0(tVar, e2, noLookupLocation);
        if (v0 == null) {
            jVar = null;
        } else {
            MemberScope X = v0.mo53405X();
            C25069e f2 = cVar.mo61585f();
            C24362h.m61210e(f2, "fqName.shortName()");
            jVar = X.mo58433g(f2, noLookupLocation);
        }
        if (jVar instanceof C25432c) {
            return (C25432c) jVar;
        }
        return null;
    }

    /* renamed from: w */
    public static void m49371w(Object obj) {
        if (obj == null) {
            throw new ApplicationBugException();
        }
    }

    /* renamed from: w0 */
    public static final ProtoBuf$Type m49372w0(ProtoBuf$Function protoBuf$Function, C24879e eVar) {
        C24362h.m61211f(protoBuf$Function, "<this>");
        C24362h.m61211f(eVar, "typeTable");
        if (protoBuf$Function.mo59742X()) {
            ProtoBuf$Type M = protoBuf$Function.mo59731M();
            C24362h.m61210e(M, "returnType");
            return M;
        } else if (protoBuf$Function.mo59743Y()) {
            return eVar.mo61353a(protoBuf$Function.mo59732N());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Function".toString());
        }
    }

    /* renamed from: x */
    public static void m49373x(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(C25541a.m63881k(str, " may not be null"));
        }
    }

    /* renamed from: x0 */
    public static final ProtoBuf$Type m49374x0(ProtoBuf$Property protoBuf$Property, C24879e eVar) {
        C24362h.m61211f(protoBuf$Property, "<this>");
        C24362h.m61211f(eVar, "typeTable");
        if (protoBuf$Property.mo59786W()) {
            ProtoBuf$Type L = protoBuf$Property.mo59775L();
            C24362h.m61210e(L, "returnType");
            return L;
        } else if (protoBuf$Property.mo59787X()) {
            return eVar.mo61353a(protoBuf$Property.mo59776M());
        } else {
            throw new IllegalStateException("No returnType in ProtoBuf.Property".toString());
        }
    }

    /* renamed from: y */
    public static void m49375y(int i, int i2, String str, int i3) {
        if (i3 < i || i3 > i2) {
            throw new IllegalArgumentException(str + " (" + i3 + ") must be in the range [" + i + AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR + i2 + "]");
        }
    }

    /* renamed from: y0 */
    public static final Object m49376y0(Set set, Enum enumR, Enum enumR2, Object obj, boolean z) {
        Enum enumR3;
        C24362h.m61211f(set, "<this>");
        C24362h.m61211f(enumR, "low");
        C24362h.m61211f(enumR2, "high");
        if (z) {
            if (set.contains(enumR)) {
                enumR3 = enumR;
            } else if (set.contains(enumR2)) {
                enumR3 = enumR2;
            } else {
                enumR3 = null;
            }
            if (C24362h.m61206a(enumR3, enumR) && C24362h.m61206a(obj, enumR2)) {
                return null;
            }
            if (obj == null) {
                return enumR3;
            }
            return obj;
        }
        if (obj != null) {
            set = C23825c.m58503O0(C21151y.m49444g0(set, obj));
        }
        return C23825c.m58492D0(set);
    }

    /* renamed from: z */
    public static int m49377z(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: z0 */
    public static void m49378z0(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C19648g) {
            ((C19648g) background).mo52003m(f);
        }
    }

    /* renamed from: a */
    public void mo2022a(View view) {
    }

    /* renamed from: c */
    public void mo53294c(C25065b bVar) {
    }

    /* renamed from: d */
    public void mo957d() {
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return new C18205d(sVar.mo40719h(C18209h.class));
    }
}
