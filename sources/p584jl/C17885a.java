package p584jl;

import ac0.C7557a;
import android.content.ContentValues;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.widget.C0801k;
import androidx.lifecycle.C1033p;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import bi0.C21073k;
import cc0.C7585a;
import ce0.C21100e;
import cf0.C21136j;
import ci0.C21207b;
import com.appboy.Constants;
import com.appsflyer.internal.referrer.Payload;
import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.internal.C2397f0;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.VisibleRegion;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.play.core.appupdate.C14226d;
import com.google.android.play.core.assetpacks.C14342z;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.moovit.commons.geo.LatLonE6;
import com.moovit.image.model.Image;
import com.moovit.image.model.ResourceImage;
import com.moovit.image.model.UriImage;
import com.umo.ads.p342c.zzb;
import com.umo.ads.p342c.zzd;
import com.usebutton.sdk.internal.util.DiskLruCache;
import com.vungle.warren.AdConfig;
import fg0.C23358d;
import hc0.C12753b;
import hg0.C23470j;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import k00.C17988b;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23894a;
import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import kotlin.reflect.jvm.internal.impl.descriptors.C23903e;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;
import kotlin.text.C24179b;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import lf0.C24236l;
import lh0.C24256b0;
import lh0.C24261d0;
import lh0.C24274i0;
import lh0.C24298r;
import lh0.C24302s0;
import lh0.C24303t;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24361g;
import mf0.C24362h;
import mh0.C24373a;
import nc0.C12954d;
import oh0.C24617f;
import oh0.C24618g;
import oh0.C24621j;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p025b6.C1488c;
import p025b6.C1492e;
import p025b6.C1495h;
import p060d6.C4397l;
import p069e3.C4528a;
import p069e3.C4538c;
import p069e3.C4539d;
import p083f5.C4685d;
import p083f5.C4686e;
import p100gb.C4961b0;
import p146k6.C5502h;
import p146k6.C5504j;
import p175n.C5768c;
import p206p4.C6063b;
import p208p6.C6095c;
import p221q6.C6181b;
import p336z8.C7505e;
import p389bl.C13637c;
import p404ce.C13791f;
import p404ce.C13806s;
import p406cg.C13821j;
import p431cy.C16525b;
import p502fx.C17118c;
import p579jg.C17845a;
import p583jk.C17875h;
import p583jk.C17884p;
import p603kg.C18040c;
import p605ki.C18067u;
import p626lf.C18201b;
import p824tp.C19722a0;
import p824tp.C19746x;
import p977zz.C20930c;
import p977zz.C20941h;
import p988j$.util.concurrent.ConcurrentHashMap;
import qg0.C24747h;
import qg0.C24768q;
import r10.C19220d;
import rf0.C24802d;
import rf0.C24806h;
import rh0.C24819c;
import sg0.C24876c;
import ug0.C25065b;
import ug0.C25066c;
import ug0.C25069e;
import uh0.C25072a;
import uh0.C25081h;
import w00.C20261b;
import w00.C20266g;
import w00.C20267h;
import wh0.C25184i0;
import wh0.C25206p1;
import xg0.C25260c;
import yh0.C25306b;
import yh0.C25308c;
import yh0.C25316h;
import yh0.C25317i;
import yh0.C25323o;
import zf0.C25432c;
import zf0.C25440f;
import zf0.C25442g;
import zf0.C25448i0;
import zf0.C25455m;
import zf0.C25478n;
import zf0.C25479n0;

/* renamed from: jl.a */
public class C17885a implements C13821j, C14342z, C4961b0, C13791f, C6095c {

    /* renamed from: b */
    public static int f45880b;

    /* renamed from: c */
    public static volatile C4686e f45881c;

    /* renamed from: d */
    public static volatile C4685d f45882d;

    /* renamed from: e */
    public static final /* synthetic */ C17885a f45883e = new C17885a();

    /* renamed from: f */
    public static final C6181b f45884f = new C6181b();

    /* renamed from: g */
    public static final /* synthetic */ C17885a f45885g = new C17885a();

    /* renamed from: h */
    public static final C17885a f45886h = new C17885a();

    /* renamed from: i */
    public static final /* synthetic */ int[] f45887i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    /* renamed from: A */
    public static final String m44388A(C23894a aVar) {
        C25432c cVar;
        C23903e eVar;
        C24362h.m61211f(aVar, "<this>");
        if (C25260c.m63398o(aVar)) {
            return null;
        }
        C25442g b = aVar.mo53399b();
        if (b instanceof C25432c) {
            cVar = (C25432c) b;
        } else {
            cVar = null;
        }
        if (cVar == null || cVar.getName().f63264c) {
            return null;
        }
        C23894a a = aVar.mo53407a();
        if (a instanceof C23903e) {
            eVar = (C23903e) a;
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return null;
        }
        return C17875h.m44291R(cVar, m44474z(eVar, 3));
    }

    /* renamed from: A0 */
    public static final C25478n m44389A0(C25479n0 n0Var) {
        C24362h.m61211f(n0Var, "<this>");
        C25478n nVar = (C25478n) C23470j.f59257d.get(n0Var);
        if (nVar == null) {
            return C25455m.m63778g(n0Var);
        }
        return nVar;
    }

    /* renamed from: B */
    public static LatLonE6 m44390B(LatLonE6 latLonE6, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double m = latLonE6.mo46924m();
        double radians2 = Math.toRadians(latLonE6.mo46926o());
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double sin2 = Math.sin(m);
        double cos2 = sin * Math.cos(m);
        double cos3 = (Math.cos(radians) * cos2) + (cos * sin2);
        return LatLonE6.m40176g(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians2 + Math.atan2(Math.sin(radians) * cos2, cos - (sin2 * cos3))));
    }

    /* renamed from: B0 */
    public static final String m44391B0(byte b) {
        char[] cArr = C14226d.f35757l;
        return new String(new char[]{cArr[(b >> 4) & 15], cArr[b & 15]});
    }

    /* renamed from: C */
    public static final Collection m44392C(Collection collection, Collection collection2) {
        C24362h.m61211f(collection2, "collection");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == null) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    /* renamed from: C0 */
    public static final C24806h m44393C0(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new C24806h(i, i2 - 1);
        }
        C24806h hVar = C24806h.f62735e;
        return C24806h.f62735e;
    }

    /* renamed from: D */
    public static Date m44394D(Date date) {
        return new Date(date.getTime());
    }

    /* renamed from: D0 */
    public static final C24306u0 m44395D0(C24306u0 u0Var, C24307v vVar) {
        C24362h.m61211f(u0Var, "<this>");
        if (u0Var instanceof C24302s0) {
            return m44395D0(((C24302s0) u0Var).mo60413W(), vVar);
        }
        if (vVar == null || C24362h.m61206a(vVar, u0Var)) {
            return u0Var;
        }
        if (u0Var instanceof C24312z) {
            return new C24256b0((C24312z) u0Var, vVar);
        }
        if (u0Var instanceof C24298r) {
            return new C24303t((C24298r) u0Var, vVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: E */
    public static final Bundle m44396E(UUID uuid, ShareContent shareContent, boolean z) {
        C24362h.m61211f(uuid, "callId");
        C24362h.m61211f(shareContent, "shareContent");
        if (shareContent instanceof ShareLinkContent) {
            return m44398F((ShareLinkContent) shareContent, z);
        }
        if (shareContent instanceof SharePhotoContent) {
            SharePhotoContent sharePhotoContent = (SharePhotoContent) shareContent;
            Collection a = C7505e.m17222a(sharePhotoContent, uuid);
            if (a == null) {
                a = EmptyList.f60173b;
            }
            Bundle F = m44398F(sharePhotoContent, z);
            F.putStringArrayList("com.facebook.platform.extra.PHOTOS", new ArrayList(a));
            return F;
        }
        boolean z2 = shareContent instanceof ShareVideoContent;
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        m44462t(r0, r1);
     */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m44397E0(java.io.File r1, byte[] r2) {
        /*
            java.lang.String r0 = "array"
            mf0.C24362h.m61211f(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0014 }
            bf0.d r1 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0014 }
            r1 = 0
            m44462t(r0, r1)
            return
        L_0x0014:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0016 }
        L_0x0016:
            r2 = move-exception
            m44462t(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p584jl.C17885a.m44397E0(java.io.File, byte[]):void");
    }

    /* renamed from: F */
    public static Bundle m44398F(ShareContent shareContent, boolean z) {
        boolean z2;
        Bundle bundle = new Bundle();
        C2397f0 f0Var = C2397f0.f8630a;
        C2397f0.m6301J(bundle, "com.facebook.platform.extra.LINK", shareContent.f8919b);
        C2397f0.m6300I(bundle, "com.facebook.platform.extra.PLACE", shareContent.f8921d);
        C2397f0.m6300I(bundle, "com.facebook.platform.extra.REF", shareContent.f8923f);
        bundle.putBoolean("com.facebook.platform.extra.DATA_FAILURES_FATAL", z);
        List<String> list = shareContent.f8920c;
        if (list == null || list.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            bundle.putStringArrayList("com.facebook.platform.extra.FRIENDS", new ArrayList(list));
        }
        return bundle;
    }

    /* renamed from: F0 */
    public static final void m44399F0(String str, String str2) {
        File V = m44425V();
        if (V != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(V, str));
                byte[] bytes = str2.getBytes(C25072a.f63272a);
                C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: G */
    public static final Result.Failure m44400G(Throwable th) {
        C24362h.m61211f(th, "exception");
        return new Result.Failure(th);
    }

    /* renamed from: G0 */
    public static int m44401G0(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: H */
    public static final String m44402H(C24274i0 i0Var) {
        StringBuilder sb = new StringBuilder();
        m44404I(C24362h.m61216k(i0Var, "type: "), sb);
        m44404I(C24362h.m61216k(Integer.valueOf(i0Var.hashCode()), "hashCode: "), sb);
        m44404I(C24362h.m61216k(i0Var.getClass().getCanonicalName(), "javaClass: "), sb);
        for (C25442g o = i0Var.mo53460o(); o != null; o = o.mo53399b()) {
            m44404I(C24362h.m61216k(DescriptorRenderer.f61106a.mo60100E(o), "fqName: "), sb);
            m44404I(C24362h.m61216k(o.getClass().getCanonicalName(), "javaClass: "), sb);
        }
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    /* renamed from: H0 */
    public static String m44403H0(String str) {
        return " (SpotId: [" + str + "])";
    }

    /* renamed from: I */
    public static final void m44404I(String str, StringBuilder sb) {
        C24362h.m61211f(str, "<this>");
        sb.append(str);
        sb.append(10);
    }

    /* renamed from: I0 */
    public static String m44405I0(StringBuilder sb, String str) {
        sb.append("GeneratedJsonAdapter(");
        sb.append(str);
        sb.append(')');
        String sb2 = sb.toString();
        C24362h.m61210e(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    /* renamed from: J */
    public static String m44406J(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String lowerCase = str.substring(0, 1).toLowerCase(Locale.US);
        if (str.length() <= 1) {
            return lowerCase;
        }
        StringBuilder k = C13555b.m33972k(lowerCase);
        k.append(str.substring(1));
        return k.toString();
    }

    /* renamed from: J0 */
    public static void m44407J0(C12753b bVar, String str, C12753b bVar2, String str2) {
        C24362h.m61211f(bVar, "this");
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(bVar2, "this");
        C24362h.m61211f(str2, "spotId");
    }

    /* renamed from: K */
    public static final void m44408K(String str) {
        File V = m44425V();
        if (V != null && str != null) {
            new File(V, str).delete();
        }
    }

    /* renamed from: K0 */
    public static void m44409K0(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* renamed from: L */
    public static final float m44410L(DisplayMetrics displayMetrics, float f) {
        C24362h.m61211f(displayMetrics, "$this$dpToPx");
        return TypedValue.applyDimension(1, f, displayMetrics);
    }

    /* renamed from: L0 */
    public static void m44411L0(String str, List list, zzb zzb, int i, int i2, zzd zzd) {
        String str2;
        String str3;
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(zzb, "beaconType");
        C24362h.m61211f(zzd, "vastError");
        StringBuilder sb = new StringBuilder();
        sb.append(" (");
        sb.append(zzb.name());
        sb.append(')');
        if (C12954d.m32800c(str)) {
            str2 = m44403H0(str);
        } else {
            str2 = "";
        }
        sb.append(str2);
        String sb2 = sb.toString();
        if (list == null || !(!list.isEmpty())) {
            C7557a.f23040a.mo6667d(C24362h.m61216k(sb2, "Invalid Beacon List"));
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            boolean z = false;
            if (zzb == zzb.ERROR && zzd != zzd.NONE) {
                str4 = C25081h.m62833D(str4, "[ERRORCODE]", String.valueOf(zzd.zza), false);
            }
            StringBuilder J0 = C21100e.m49315J0(" (");
            J0.append(zzb.name());
            J0.append(')');
            if (C12954d.m32800c(str)) {
                str3 = m44403H0(str);
            } else {
                str3 = "";
            }
            J0.append(str3);
            J0.append(": ");
            J0.append(str4);
            String sb3 = J0.toString();
            if (C12954d.m32800c(str4) && (URLUtil.isHttpUrl(str4) || URLUtil.isHttpsUrl(str4))) {
                z = true;
            }
            if (!z) {
                C7557a.f23040a.mo6667d(C24362h.m61216k(sb3, "Invalid Beacon"));
            } else {
                C7557a.f23040a.mo6672i(C24362h.m61216k(sb3, "Hitting Beacon"));
                C7585a aVar = new C7585a(i, i2);
                C24362h.m61208c(str4);
                aVar.mo23844a(str4, new C17118c(sb3, 2));
            }
        }
    }

    /* renamed from: M */
    public static void m44412M() {
        int i = f45880b;
        if (i > 0) {
            f45880b = i - 1;
        }
    }

    /* renamed from: M0 */
    public static /* synthetic */ int m44413M0(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    /* renamed from: N */
    public static final C23358d m44414N(Annotation[] annotationArr, C25066c cVar) {
        Annotation annotation;
        C24362h.m61211f(annotationArr, "<this>");
        C24362h.m61211f(cVar, "fqName");
        int length = annotationArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                annotation = null;
                break;
            }
            annotation = annotationArr[i];
            i++;
            if (C24362h.m61206a(ReflectClassUtilKt.m58949a(C24361g.m61144N(C24361g.m61140J(annotation))).mo61569b(), cVar)) {
                break;
            }
        }
        if (annotation == null) {
            return null;
        }
        return new C23358d(annotation);
    }

    /* renamed from: N0 */
    public static boolean m44415N0(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    /* renamed from: O */
    public static String m44416O(int i, Context context) {
        if (i < 1000) {
            return context.getString(C19746x.units_grams_short, new Object[]{Integer.valueOf(i)});
        }
        return context.getString(C19746x.units_kilograms_short, new Object[]{String.format(C20930c.m49020b(context), "%.2f", new Object[]{Float.valueOf(((float) i) / 1000.0f)})});
    }

    /* renamed from: O0 */
    public static /* synthetic */ int[] m44417O0(int i) {
        int[] iArr = new int[i];
        System.arraycopy(f45887i, 0, iArr, 0, i);
        return iArr;
    }

    /* renamed from: P */
    public static final ArrayList m44418P(Annotation[] annotationArr) {
        C24362h.m61211f(annotationArr, "<this>");
        ArrayList arrayList = new ArrayList(annotationArr.length);
        int length = annotationArr.length;
        int i = 0;
        while (i < length) {
            Annotation annotation = annotationArr[i];
            i++;
            arrayList.add(new C23358d(annotation));
        }
        return arrayList;
    }

    /* renamed from: P0 */
    public static boolean m44419P0(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6) {
            if (i2 != 6 && i2 != 5) {
                return true;
            }
            i = 6;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    /* renamed from: Q */
    public static boolean m44420Q(ContentValues contentValues, String str) {
        Object obj = contentValues.get(str);
        if (obj == null) {
            return false;
        }
        try {
            return ((Boolean) obj).booleanValue();
        } catch (ClassCastException unused) {
            if (obj instanceof CharSequence) {
                if (Boolean.valueOf(obj.toString()).booleanValue() || DiskLruCache.VERSION_1.equals(obj)) {
                    return true;
                }
                return false;
            } else if (!(obj instanceof Number) || ((Number) obj).intValue() == 0) {
                return false;
            } else {
                return true;
            }
        }
    }

    /* renamed from: R */
    public static final C25065b m44421R(C24876c cVar, int i) {
        C24362h.m61211f(cVar, "<this>");
        return C25065b.m62789f(cVar.mo61350b(i), cVar.mo61349a(i));
    }

    /* renamed from: S */
    public static final C24307v m44422S(C24307v vVar) {
        C24362h.m61211f(vVar, "<this>");
        if (vVar instanceof C24302s0) {
            return ((C24302s0) vVar).mo60415l0();
        }
        return null;
    }

    /* renamed from: T */
    public static final Object m44423T(GeneratedMessageLite.ExtendableMessage extendableMessage, GeneratedMessageLite.C24069e eVar) {
        C24362h.m61211f(extendableMessage, "<this>");
        C24362h.m61211f(eVar, "extension");
        if (extendableMessage.mo59993j(eVar)) {
            return extendableMessage.mo59990g(eVar);
        }
        return null;
    }

    /* renamed from: U */
    public static int m44424U(int i, int i2) {
        if (i == 80 && i2 == 1) {
            return 3;
        }
        if (i == 81 && i2 == 1) {
            return 4;
        }
        if (i == 82 && i2 == 1) {
            return 1;
        }
        if (i == 83 && i2 == 1) {
            return 2;
        }
        return i;
    }

    /* renamed from: V */
    public static final File m44425V() {
        File file = new File(C0115o.m210a().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: W */
    public static final LifecycleCoroutineScopeImpl m44426W(C1033p pVar) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        C24362h.m61211f(pVar, "<this>");
        Lifecycle lifecycle = pVar.getLifecycle();
        C24362h.m61210e(lifecycle, "lifecycle");
        while (true) {
            lifecycleCoroutineScopeImpl = (LifecycleCoroutineScopeImpl) lifecycle.f3878a.get();
            if (lifecycleCoroutineScopeImpl == null) {
                boolean z = true;
                C25206p1 a = C17884p.m44356a();
                C21207b bVar = C25184i0.f63459a;
                lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, a.mo53082y(C21073k.f52890a.mo60300z()));
                AtomicReference<Object> atomicReference = lifecycle.f3878a;
                while (true) {
                    if (!atomicReference.compareAndSet((Object) null, lifecycleCoroutineScopeImpl)) {
                        if (atomicReference.get() != null) {
                            z = false;
                            continue;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (z) {
                    lifecycleCoroutineScopeImpl.mo4234g();
                    break;
                }
            } else {
                break;
            }
        }
        return lifecycleCoroutineScopeImpl;
    }

    /* renamed from: X */
    public static final C25069e m44427X(C24876c cVar, int i) {
        C24362h.m61211f(cVar, "<this>");
        return C25069e.m62819h(cVar.getString(i));
    }

    /* renamed from: Y */
    public static Object m44428Y(Set set) {
        Iterator it = set.iterator();
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("expected one element but was: <");
        sb.append(next);
        for (int i = 0; i < 4 && it.hasNext(); i++) {
            sb.append(", ");
            sb.append(it.next());
        }
        if (it.hasNext()) {
            sb.append(", ...");
        }
        sb.append('>');
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: Z */
    public static C6063b[] m44429Z(Class cls) {
        boolean z;
        boolean z2;
        Class<?> returnType;
        HashMap hashMap = new HashMap();
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            if (!name.startsWith("get") || name.length() <= 3) {
                z = false;
            } else {
                z = true;
            }
            if (!name.startsWith("set") || name.length() <= 3) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (z || z2) {
                String J = m44406J(name.substring(3));
                C6063b bVar = (C6063b) hashMap.get(J);
                if (bVar == null) {
                    bVar = new C6063b(J);
                    hashMap.put(J, bVar);
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (z2) {
                    if (parameterTypes.length == 1) {
                        bVar.f19316a = method;
                        returnType = parameterTypes[0];
                    }
                } else if (z && parameterTypes.length == 0 && bVar.f19318c == null) {
                    returnType = method.getReturnType();
                }
                bVar.f19318c = returnType;
            }
        }
        return (C6063b[]) hashMap.values().toArray(new C6063b[0]);
    }

    /* renamed from: a0 */
    public static final int m44430a0(String str) {
        char c;
        int L;
        int L2 = C24179b.m60564L(str, File.separatorChar, 0, false, 4);
        if (L2 == 0) {
            if (str.length() <= 1 || str.charAt(1) != (c = File.separatorChar) || (L = C24179b.m60564L(str, c, 2, false, 4)) < 0) {
                return 1;
            }
            int L3 = C24179b.m60564L(str, File.separatorChar, L + 1, false, 4);
            if (L3 >= 0) {
                return L3 + 1;
            }
            return str.length();
        } else if (L2 > 0 && str.charAt(L2 - 1) == ':') {
            return L2 + 1;
        } else {
            if (L2 != -1 || !C24179b.m60560H(str, ':')) {
                return 0;
            }
            return str.length();
        }
    }

    /* renamed from: b0 */
    public static float m44431b0(MotionEvent motionEvent) {
        return motionEvent.getX(Math.min(1, motionEvent.getPointerCount() - 1));
    }

    /* renamed from: c0 */
    public static float m44432c0(MotionEvent motionEvent) {
        return motionEvent.getY(Math.min(1, motionEvent.getPointerCount() - 1));
    }

    /* renamed from: d */
    public static AbstractChannel m44433d(int i, BufferOverflow bufferOverflow, int i2) {
        boolean z = false;
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        int i3 = 1;
        if (i == -2) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                C25308c.f63618k0.getClass();
                i3 = C25308c.C25309a.f63620b;
            }
            return new C25306b(i3, bufferOverflow, (C24236l) null);
        } else if (i == -1) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                z = true;
            }
            if (z) {
                return new C25316h((C24236l) null);
            }
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        } else if (i != 0) {
            if (i == Integer.MAX_VALUE) {
                return new C25317i((C24236l) null);
            }
            if (i == 1 && bufferOverflow == BufferOverflow.DROP_OLDEST) {
                return new C25316h((C24236l) null);
            }
            return new C25306b(i, bufferOverflow, (C24236l) null);
        } else if (bufferOverflow == BufferOverflow.SUSPEND) {
            return new C25323o((C24236l) null);
        } else {
            return new C25306b(1, bufferOverflow, (C24236l) null);
        }
    }

    /* renamed from: d0 */
    public static final C24306u0 m44434d0(C24306u0 u0Var, C24307v vVar) {
        C24362h.m61211f(u0Var, "<this>");
        C24362h.m61211f(vVar, AppMeasurementSdk.ConditionalUserProperty.ORIGIN);
        return m44395D0(u0Var, m44422S(vVar));
    }

    /* renamed from: e */
    public static AdConfig m44435e(Bundle bundle, boolean z) {
        AdConfig adConfig = new AdConfig();
        if (z) {
            adConfig.f58858a |= 1;
        } else {
            adConfig.f58858a &= -2;
        }
        adConfig.f58860c = true;
        if (bundle != null) {
            if (bundle.getBoolean("startMuted", z)) {
                adConfig.f58858a |= 1;
            } else {
                adConfig.f58858a &= -2;
            }
            adConfig.f58860c = true;
            adConfig.mo58031f(bundle.getInt("ordinalViewCount", 0));
            adConfig.mo58030e(bundle.getInt("adOrientation", 2));
        }
        return adConfig;
    }

    /* renamed from: e0 */
    public static boolean m44436e0() {
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ENGLISH;
        if (str.toLowerCase(locale).equals("lge") || str.toLowerCase(locale).equals(Payload.SOURCE_SAMSUNG)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public static void m44437f(SpannableStringBuilder spannableStringBuilder, Object obj, int i, int i2) {
        for (Object obj2 : spannableStringBuilder.getSpans(i, i2, obj.getClass())) {
            if (spannableStringBuilder.getSpanStart(obj2) == i && spannableStringBuilder.getSpanEnd(obj2) == i2 && spannableStringBuilder.getSpanFlags(obj2) == 33) {
                spannableStringBuilder.removeSpan(obj2);
            }
        }
        spannableStringBuilder.setSpan(obj, i, i2, 33);
    }

    /* renamed from: f0 */
    public static boolean m44438f0(String str) {
        C4528a.C4532d dVar = C4539d.f15655a;
        Set<C4538c> unmodifiableSet = Collections.unmodifiableSet(C4528a.f15651c);
        HashSet hashSet = new HashSet();
        for (C4538c cVar : unmodifiableSet) {
            if (cVar.mo20042b().equals(str)) {
                hashSet.add(cVar);
            }
        }
        if (!hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                if (((C4538c) it.next()).mo20041a()) {
                    return true;
                }
            }
            return false;
        }
        throw new RuntimeException(C25541a.m63881k("Unknown feature ", str));
    }

    /* renamed from: g0 */
    public static final boolean m44439g0(Thread thread) {
        StackTraceElement[] stackTrace = thread.getStackTrace();
        if (stackTrace != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                String className = stackTraceElement.getClassName();
                C24362h.m61210e(className, "element.className");
                if (C25081h.m62835F(className, "com.facebook")) {
                    String className2 = stackTraceElement.getClassName();
                    C24362h.m61210e(className2, "element.className");
                    if (!C25081h.m62835F(className2, "com.facebook.appevents.codeless")) {
                        String className3 = stackTraceElement.getClassName();
                        C24362h.m61210e(className3, "element.className");
                        if (!C25081h.m62835F(className3, "com.facebook.appevents.suggestedevents")) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    C24362h.m61210e(methodName, "element.methodName");
                    if (!C25081h.m62835F(methodName, "onClick")) {
                        String methodName2 = stackTraceElement.getMethodName();
                        C24362h.m61210e(methodName2, "element.methodName");
                        if (!C25081h.m62835F(methodName2, "onItemClick")) {
                            String methodName3 = stackTraceElement.getMethodName();
                            C24362h.m61210e(methodName3, "element.methodName");
                            if (!C25081h.m62835F(methodName3, "onTouch")) {
                                return true;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: h0 */
    public static final C24819c m44440h0(ArrayList arrayList) {
        boolean z;
        C24819c cVar = new C24819c();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            MemberScope memberScope = (MemberScope) next;
            if (memberScope == null || memberScope == MemberScope.C24119a.f61217b) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                cVar.add(next);
            }
        }
        return cVar;
    }

    /* renamed from: i */
    public static void m44441i(Button button, int i, int i2, int i3) {
        Context context;
        if (button instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) button;
            if (i != 0) {
                context = new C5768c(materialButton.getContext(), i);
            } else {
                context = materialButton.getContext();
            }
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C20267h.TextAppearance, i2, i3);
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes((AttributeSet) null, C20267h.MaterialButton, i2, i3);
            try {
                materialButton.setTextColor(C20941h.m49039b(context, obtainStyledAttributes, C20267h.TextAppearance_android_textColor));
                materialButton.setIconTint(C20941h.m49039b(context, obtainStyledAttributes2, C20267h.MaterialButton_iconTint));
                materialButton.setBackgroundTintList(C20941h.m49039b(context, obtainStyledAttributes2, C20267h.MaterialButton_backgroundTint));
                materialButton.setStrokeColor(C20941h.m49039b(context, obtainStyledAttributes2, C20267h.MaterialButton_strokeColor));
                materialButton.setStrokeWidth(obtainStyledAttributes2.getDimensionPixelSize(C20267h.MaterialButton_strokeWidth, 0));
                materialButton.setRippleColor(C20941h.m49039b(context, obtainStyledAttributes2, C20267h.MaterialButton_rippleColor));
            } finally {
                obtainStyledAttributes.recycle();
                obtainStyledAttributes2.recycle();
            }
        }
    }

    /* renamed from: i0 */
    public static boolean m44442i0(VisibleRegion visibleRegion, LatLonE6 latLonE6) {
        LatLngBounds latLngBounds = visibleRegion.latLngBounds;
        LatLng latLng = latLngBounds.northeast;
        double d = latLng.latitude;
        LatLng latLng2 = latLngBounds.southwest;
        double d2 = latLng2.latitude;
        double d3 = d - d2;
        double d4 = latLng.longitude;
        double d5 = latLng2.longitude;
        double d6 = d4 - d5;
        double d7 = d2 - d3;
        double d8 = d + d3;
        double d9 = d5 - d6;
        double d11 = d4 + d6;
        double k = latLonE6.mo46922k();
        double o = latLonE6.mo46926o();
        if (d7 > k || k > d8 || d9 > o || o > d11) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static void m44443j(FloatingActionButton floatingActionButton, int i) {
        Context context;
        int i2 = C20261b.floatingActionButtonStyle;
        int i3 = C20266g.Widget_Moovit_FloatingActionButton;
        if (i != 0) {
            context = new C5768c(floatingActionButton.getContext(), i);
        } else {
            context = floatingActionButton.getContext();
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C20267h.AppCompatImageView, i2, i3);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes((AttributeSet) null, C20267h.FloatingActionButton, i2, i3);
        try {
            floatingActionButton.setSupportBackgroundTintList(C20941h.m49039b(context, obtainStyledAttributes2, C20267h.FloatingActionButton_backgroundTint));
            floatingActionButton.setRippleColor(C20941h.m49039b(context, obtainStyledAttributes2, C20267h.FloatingActionButton_rippleColor));
            floatingActionButton.setSupportImageTintList(C20941h.m49039b(context, obtainStyledAttributes, C20267h.AppCompatImageView_tint));
        } finally {
            obtainStyledAttributes.recycle();
            obtainStyledAttributes2.recycle();
        }
    }

    /* renamed from: j0 */
    public static final C24747h m44444j0(C24307v vVar) {
        return (C24747h) C13637c.m34047B(vVar, C24768q.f62665k, FunctionsKt.f61393b);
    }

    /* renamed from: k */
    public static final Object[] m44445k(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new Object[i];
        }
        throw new IllegalArgumentException("capacity must be non-negative.".toString());
    }

    /* renamed from: k0 */
    public static Date m44446k0(Date date) {
        if (date == null) {
            return null;
        }
        return m44394D(date);
    }

    /* renamed from: l */
    public static final boolean m44447l(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        C24362h.m61211f(bArr, Constants.APPBOY_PUSH_CONTENT_KEY);
        C24362h.m61211f(bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l0 */
    public static void m44448l0(Context context, C19722a0 a0Var) {
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        instance.f36333a.zzM(a0Var.f50160a.f32925a);
        instance.mo43248b("user_bucket", String.valueOf(a0Var.f50160a.f32926b));
        instance.mo43248b("metro_id", a0Var.f50160a.f32927c.mo19751c());
        instance.mo43248b("flavor_type", "world");
        instance.mo43248b("has_payment_account", "false");
        instance.mo43248b("has_subscription", "false");
    }

    /* renamed from: m0 */
    public static void m44449m0(Context context, String str) {
        String str2;
        FirebaseAnalytics instance = FirebaseAnalytics.getInstance(context);
        instance.mo43248b("payment_account_id", str);
        if (str != null) {
            str2 = InneractiveMediationDefs.SHOW_HOUSE_AD_YES;
        } else {
            str2 = "false";
        }
        instance.mo43248b("has_payment_account", str2);
    }

    /* renamed from: n */
    public static final C24307v m44450n(ArrayList arrayList, List list, C23867c cVar) {
        C24307v k = TypeSubstitutor.m60494e(new C24261d0(arrayList)).mo60251k((C24307v) C23825c.m58513j0(list), Variance.OUT_VARIANCE);
        if (k == null) {
            return cVar.mo59393p();
        }
        return k;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
        m44462t(r0, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a7, code lost:
        throw r1;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m44451n0(java.io.File r9) {
        /*
            java.lang.String r0 = "<this>"
            mf0.C24362h.m61211f(r9, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r9)
            long r1 = r9.length()     // Catch:{ all -> 0x00a1 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            java.lang.String r5 = "File "
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L_0x007f
            int r2 = (int) r1
            byte[] r1 = new byte[r2]     // Catch:{ all -> 0x00a1 }
            r3 = 0
            r4 = r2
            r6 = 0
        L_0x001d:
            if (r4 <= 0) goto L_0x0028
            int r7 = r0.read(r1, r6, r4)     // Catch:{ all -> 0x00a1 }
            if (r7 < 0) goto L_0x0028
            int r4 = r4 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r4 <= 0) goto L_0x0035
            byte[] r1 = java.util.Arrays.copyOf(r1, r6)     // Catch:{ all -> 0x00a1 }
            mf0.C24362h.m61210e(r1, r7)     // Catch:{ all -> 0x00a1 }
            goto L_0x0061
        L_0x0035:
            int r4 = r0.read()     // Catch:{ all -> 0x00a1 }
            r6 = -1
            if (r4 != r6) goto L_0x003d
            goto L_0x0061
        L_0x003d:
            kf0.a r6 = new kf0.a     // Catch:{ all -> 0x00a1 }
            r6.<init>()     // Catch:{ all -> 0x00a1 }
            r6.write(r4)     // Catch:{ all -> 0x00a1 }
            p583jk.C17884p.m44377q(r0, r6)     // Catch:{ all -> 0x00a1 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a1 }
            int r4 = r4 + r2
            if (r4 < 0) goto L_0x0065
            byte[] r9 = r6.mo59005e()     // Catch:{ all -> 0x00a1 }
            byte[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch:{ all -> 0x00a1 }
            mf0.C24362h.m61210e(r1, r7)     // Catch:{ all -> 0x00a1 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a1 }
            cf0.C21132f.m49429L0(r2, r9, r3, r1, r4)     // Catch:{ all -> 0x00a1 }
        L_0x0061:
            m44462t(r0, r8)
            return r1
        L_0x0065:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r2.<init>()     // Catch:{ all -> 0x00a1 }
            r2.append(r5)     // Catch:{ all -> 0x00a1 }
            r2.append(r9)     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = " is too big to fit in memory."
            r2.append(r9)     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = r2.toString()     // Catch:{ all -> 0x00a1 }
            r1.<init>(r9)     // Catch:{ all -> 0x00a1 }
            throw r1     // Catch:{ all -> 0x00a1 }
        L_0x007f:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a1 }
            r4.<init>()     // Catch:{ all -> 0x00a1 }
            r4.append(r5)     // Catch:{ all -> 0x00a1 }
            r4.append(r9)     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = " is too big ("
            r4.append(r9)     // Catch:{ all -> 0x00a1 }
            r4.append(r1)     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = " bytes) to fit in memory."
            r4.append(r9)     // Catch:{ all -> 0x00a1 }
            java.lang.String r9 = r4.toString()     // Catch:{ all -> 0x00a1 }
            r3.<init>(r9)     // Catch:{ all -> 0x00a1 }
            throw r3     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r1 = move-exception
            m44462t(r0, r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p584jl.C17885a.m44451n0(java.io.File):byte[]");
    }

    /* renamed from: o */
    public static void m44452o(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: o0 */
    public static final JSONObject m44453o0(String str) {
        File V = m44425V();
        if (V == null || str == null) {
            return null;
        }
        try {
            return new JSONObject(C2397f0.m6303L(new FileInputStream(new File(V, str))));
        } catch (Exception unused) {
            m44408K(str);
            return null;
        }
    }

    /* renamed from: p */
    public static void m44454p(Object obj, Object obj2) {
        if (obj == null) {
            String valueOf = String.valueOf(obj2);
            StringBuilder sb = new StringBuilder(valueOf.length() + 24);
            sb.append("null key in entry: null=");
            sb.append(valueOf);
            throw new NullPointerException(sb.toString());
        } else if (obj2 == null) {
            String valueOf2 = String.valueOf(obj);
            throw new NullPointerException(C25541a.m63875e(valueOf2.length() + 26, "null value in entry: ", valueOf2, "=null"));
        }
    }

    /* renamed from: p0 */
    public static final void m44455p0(int i, int i2, Object[] objArr) {
        C24362h.m61211f(objArr, "<this>");
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    /* renamed from: q */
    public static void m44456q(int i, String str) {
        if (i < 0) {
            StringBuilder sb = new StringBuilder(str.length() + 40);
            sb.append(str);
            sb.append(" cannot be negative but was: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: q0 */
    public static final int m44457q0(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d);
        }
    }

    /* renamed from: r */
    public static void m44458r(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Argument must not be null");
        }
    }

    /* renamed from: r0 */
    public static final int m44459r0(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    /* renamed from: s */
    public static final void m44460s(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder g = C16759e.m42351g("size=", j, " offset=");
            g.append(j2);
            g.append(" byteCount=");
            g.append(j3);
            throw new ArrayIndexOutOfBoundsException(g.toString());
        }
    }

    /* renamed from: s0 */
    public static void m44461s0(Runnable runnable) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, 0);
    }

    /* renamed from: t */
    public static final void m44462t(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            C18201b.m44913j(th, th2);
        }
    }

    /* renamed from: t0 */
    public static final void m44463t0(String str, JSONArray jSONArray, GraphRequest.C2280b bVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                JSONObject o = C2397f0.m6321o();
                if (o != null) {
                    Iterator<String> keys = o.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.put(next, o.get(next));
                    }
                }
                String str2 = GraphRequest.f8425j;
                String format = String.format("%s/instruments", Arrays.copyOf(new Object[]{C0115o.m211b()}, 1));
                C24362h.m61210e(format, "java.lang.String.format(format, *args)");
                GraphRequest.C2281c.m6138h((AccessToken) null, format, jSONObject, bVar).mo11904d();
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: u */
    public static final int m44464u(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* renamed from: u0 */
    public static void m44465u0(Button button, Drawable drawable, int i) {
        int U = m44424U(i, button.getLayoutDirection());
        if (button instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) button;
            materialButton.setIconGravity(U);
            materialButton.setIcon(drawable);
            return;
        }
        Drawable[] compoundDrawablesRelative = button.getCompoundDrawablesRelative();
        if (U != 1 && U != 2) {
            if (U != 3 && U != 4) {
                if (U != 16 && U != 32) {
                    switch (U) {
                        case 80:
                        case 81:
                            if (button.getLayoutDirection() != 0) {
                                compoundDrawablesRelative[3] = drawable;
                                break;
                            } else {
                                compoundDrawablesRelative[0] = drawable;
                                break;
                            }
                        case 82:
                        case 83:
                            if (button.getLayoutDirection() != 0) {
                                compoundDrawablesRelative[0] = drawable;
                                break;
                            } else {
                                compoundDrawablesRelative[3] = drawable;
                                break;
                            }
                    }
                } else {
                    compoundDrawablesRelative[1] = drawable;
                }
            } else {
                compoundDrawablesRelative[3] = drawable;
            }
        } else {
            compoundDrawablesRelative[0] = drawable;
        }
        button.setCompoundDrawablesRelativeWithIntrinsicBounds(compoundDrawablesRelative[0], compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
    }

    /* renamed from: v */
    public static final int m44466v(int i, C24806h hVar) {
        C24362h.m61211f(hVar, "range");
        if (hVar instanceof C24802d) {
            Object valueOf = Integer.valueOf(i);
            C24802d dVar = (C24802d) hVar;
            C24362h.m61211f(valueOf, "<this>");
            if (!dVar.isEmpty()) {
                dVar.mo61244e();
                if (dVar.mo61251n()) {
                    dVar.mo61244e();
                    if (!dVar.mo61251n()) {
                        valueOf = dVar.mo61244e();
                        return ((Number) valueOf).intValue();
                    }
                }
                dVar.mo61247i();
                if (dVar.mo61251n()) {
                    dVar.mo61247i();
                    if (!dVar.mo61251n()) {
                        valueOf = dVar.mo61247i();
                    }
                }
                return ((Number) valueOf).intValue();
            }
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + dVar + '.');
        } else if (hVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + hVar + '.');
        } else if (i < ((Number) hVar.mo61244e()).intValue()) {
            return ((Number) hVar.mo61244e()).intValue();
        } else {
            if (i > ((Number) hVar.mo61247i()).intValue()) {
                return ((Number) hVar.mo61247i()).intValue();
            }
            return i;
        }
    }

    /* renamed from: v0 */
    public static void m44467v0(Button button, int i) {
        m44465u0(button, C17988b.m44611b(i, button.getContext()), 2);
    }

    /* renamed from: w */
    public static double m44468w(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        double m = latLonE6.mo46924m();
        double radians = Math.toRadians(latLonE6.mo46926o());
        double m2 = latLonE62.mo46924m();
        double radians2 = radians - Math.toRadians(latLonE62.mo46926o());
        double sin = Math.sin((m - m2) * 0.5d);
        double sin2 = Math.sin(radians2 * 0.5d);
        return Math.asin(Math.sqrt((Math.cos(m2) * Math.cos(m) * sin2 * sin2) + (sin * sin))) * 2.0d * 6371009.0d;
    }

    /* renamed from: w0 */
    public static void m44469w0(ImageView imageView, Uri uri, int i) {
        Image image;
        if (imageView.isInEditMode()) {
            imageView.setImageResource(i);
            return;
        }
        if (uri == null) {
            image = new ResourceImage(i, new String[0]);
        } else {
            image = new UriImage(uri, new String[0]);
        }
        C19220d<Drawable> s0 = C17884p.m44354Y(imageView).mo51642v(image).mo51628o0(image).mo22738w(i);
        C1495h[] hVarArr = {new C5502h(), new C5504j()};
        s0.getClass();
        ((C19220d) s0.mo22717H(new C1488c(hVarArr), true)).mo10850T(imageView);
    }

    /* renamed from: x */
    public static final C24617f m44470x(C24617f fVar, HashSet hashSet) {
        C24617f x;
        C14226d dVar = C14226d.f35756k;
        C24621j o = dVar.mo42748o(fVar);
        if (!hashSet.add(o)) {
            return null;
        }
        C25448i0 x2 = C24373a.C24374a.m61322x(dVar, o);
        if (x2 != null) {
            x = m44470x(C24373a.C24374a.m61318t(dVar, x2), hashSet);
            if (x == null) {
                return null;
            }
            if (!C24373a.C24374a.m61275Q(dVar, x) && dVar.mo42760y0(fVar)) {
                return dVar.mo42698B0(x);
            }
        } else if (!C24373a.C24374a.m61269K(dVar, o)) {
            return fVar;
        } else {
            C24307v u = C24373a.C24374a.m61319u(dVar, fVar);
            if (u == null || (x = m44470x(u, hashSet)) == null) {
                return null;
            }
            if (C24373a.C24374a.m61275Q(dVar, fVar)) {
                if (C24373a.C24374a.m61275Q(dVar, x)) {
                    return fVar;
                }
                if (!(x instanceof C24618g) || !C24373a.C24374a.m61276R(dVar, (C24618g) x)) {
                    return dVar.mo42698B0(x);
                }
                return fVar;
            }
        }
        return x;
    }

    /* renamed from: x0 */
    public static final void m44471x0(TextView textView) {
        C0801k.m2424f(textView, C18067u.JustRideSDKUniversalTicketBodyTextAppearance);
        textView.setGravity(8388611);
        textView.setLineSpacing(BitmapDescriptorFactory.HUE_RED, 1.4f);
    }

    /* renamed from: y */
    public static double m44472y(LatLonE6 latLonE6, LatLonE6 latLonE62) {
        double m = latLonE6.mo46924m();
        double radians = Math.toRadians(latLonE6.mo46926o());
        double m2 = latLonE62.mo46924m();
        double radians2 = Math.toRadians(latLonE62.mo46926o()) - radians;
        double cos = Math.cos(m2) * Math.sin(radians2);
        double cos2 = Math.cos(m);
        double sin = Math.sin(m);
        double degrees = Math.toDegrees(Math.atan2(cos, (Math.sin(m2) * cos2) - (Math.cos(radians2) * (Math.cos(m2) * sin))));
        if (degrees < -180.0d || degrees >= 180.0d) {
            return ((((degrees - -180.0d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        }
        return degrees;
    }

    /* renamed from: y0 */
    public static final C24307v m44473y0(C25448i0 i0Var) {
        C24362h.m61211f(i0Var, "<this>");
        C25442g b = i0Var.mo53399b();
        C24362h.m61210e(b, "this.containingDeclaration");
        if (b instanceof C25440f) {
            List<C25448i0> parameters = ((C25440f) b).mo53481j().getParameters();
            C24362h.m61210e(parameters, "descriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(parameters, 10));
            for (C25448i0 j : parameters) {
                C24274i0 j2 = j.mo53481j();
                C24362h.m61210e(j2, "it.typeConstructor");
                arrayList.add(j2);
            }
            List<C24307v> upperBounds = i0Var.getUpperBounds();
            C24362h.m61210e(upperBounds, "upperBounds");
            return m44450n(arrayList, upperBounds, DescriptorUtilsKt.m60284e(i0Var));
        } else if (b instanceof C23900c) {
            List<C25448i0> typeParameters = ((C23900c) b).getTypeParameters();
            C24362h.m61210e(typeParameters, "descriptor.typeParameters");
            ArrayList arrayList2 = new ArrayList(C21136j.m49436X(typeParameters, 10));
            for (C25448i0 j3 : typeParameters) {
                C24274i0 j4 = j3.mo53481j();
                C24362h.m61210e(j4, "it.typeConstructor");
                arrayList2.add(j4);
            }
            List<C24307v> upperBounds2 = i0Var.getUpperBounds();
            C24362h.m61210e(upperBounds2, "upperBounds");
            return m44450n(arrayList2, upperBounds2, DescriptorUtilsKt.m60284e(i0Var));
        } else {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a0, code lost:
        if ((r6 instanceof zf0.C25429a0) == false) goto L_0x00a2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab  */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m44474z(kotlin.reflect.jvm.internal.impl.descriptors.C23900c r6, int r7) {
        /*
            r0 = r7 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0008
            r0 = 1
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            r7 = r7 & 2
            if (r7 == 0) goto L_0x000f
            r7 = 1
            goto L_0x0010
        L_0x000f:
            r7 = 0
        L_0x0010:
            java.lang.String r3 = "<this>"
            mf0.C24362h.m61211f(r6, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r7 == 0) goto L_0x0033
            boolean r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23899b
            if (r7 == 0) goto L_0x0023
            java.lang.String r7 = "<init>"
            goto L_0x0030
        L_0x0023:
            ug0.e r7 = r6.getName()
            java.lang.String r7 = r7.mo61604f()
            java.lang.String r4 = "name.asString()"
            mf0.C24362h.m61210e(r7, r4)
        L_0x0030:
            r3.append(r7)
        L_0x0033:
            java.lang.String r7 = "("
            r3.append(r7)
            zf0.c0 r7 = r6.mo53423R()
            if (r7 != 0) goto L_0x003f
            goto L_0x004f
        L_0x003f:
            lh0.v r7 = r7.getType()
            java.lang.String r4 = "it.type"
            mf0.C24362h.m61210e(r7, r4)
            qg0.h r7 = m44444j0(r7)
            r3.append(r7)
        L_0x004f:
            java.util.List r7 = r6.mo53442h()
            java.util.Iterator r7 = r7.iterator()
        L_0x0057:
            boolean r4 = r7.hasNext()
            if (r4 == 0) goto L_0x0074
            java.lang.Object r4 = r7.next()
            zf0.k0 r4 = (zf0.C25452k0) r4
            lh0.v r4 = r4.getType()
            java.lang.String r5 = "parameter.type"
            mf0.C24362h.m61210e(r4, r5)
            qg0.h r4 = m44444j0(r4)
            r3.append(r4)
            goto L_0x0057
        L_0x0074:
            java.lang.String r7 = ")"
            r3.append(r7)
            if (r0 == 0) goto L_0x00b9
            boolean r7 = r6 instanceof kotlin.reflect.jvm.internal.impl.descriptors.C23899b
            if (r7 == 0) goto L_0x0080
            goto L_0x00a2
        L_0x0080:
            lh0.v r7 = r6.mo53443i()
            mf0.C24362h.m61208c(r7)
            ug0.e r0 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.f60309e
            ug0.d r0 = kotlin.reflect.jvm.internal.impl.builtins.C23872e.C23873a.f60366d
            boolean r7 = kotlin.reflect.jvm.internal.impl.builtins.C23867c.m58674E(r7, r0)
            if (r7 == 0) goto L_0x00a3
            lh0.v r7 = r6.mo53443i()
            mf0.C24362h.m61208c(r7)
            boolean r7 = lh0.C24299r0.m60975g(r7)
            if (r7 != 0) goto L_0x00a3
            boolean r7 = r6 instanceof zf0.C25429a0
            if (r7 != 0) goto L_0x00a3
        L_0x00a2:
            r1 = 1
        L_0x00a3:
            if (r1 == 0) goto L_0x00ab
            java.lang.String r6 = "V"
            r3.append(r6)
            goto L_0x00b9
        L_0x00ab:
            lh0.v r6 = r6.mo53443i()
            mf0.C24362h.m61208c(r6)
            qg0.h r6 = m44444j0(r6)
            r3.append(r6)
        L_0x00b9:
            java.lang.String r6 = r3.toString()
            java.lang.String r7 = "StringBuilder().apply(builderAction).toString()"
            mf0.C24362h.m61210e(r6, r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p584jl.C17885a.m44474z(kotlin.reflect.jvm.internal.impl.descriptors.c, int):java.lang.String");
    }

    /* renamed from: z0 */
    public static final void m44475z0(Object obj) {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).exception;
        }
    }

    /* renamed from: a */
    public void mo20648a() {
    }

    /* renamed from: b */
    public int mo20649b(C16525b bVar, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.f17757b = 4;
        return -4;
    }

    /* renamed from: c */
    public int mo20650c(long j) {
        return 0;
    }

    /* renamed from: g */
    public Object mo40737g() {
        return new ConcurrentHashMap();
    }

    /* renamed from: h */
    public C4397l mo20049h(C4397l lVar, C1492e eVar) {
        return lVar;
    }

    public boolean isReady() {
        return true;
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return new C18040c.C18041a(sVar.mo40719h(C17845a.class));
    }

    public int zza(int i) {
        return i;
    }
}
