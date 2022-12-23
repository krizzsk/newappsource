package p583jk;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import ce0.C21100e;
import cf0.C21136j;
import cg0.C21154b;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.support.ValidationUtils;
import com.bumptech.glide.C2116c;
import com.bumptech.glide.C2131j;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p986firebaseauthapi.zzze;
import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.moovit.app.surveys.data.remote.SurveyAnswerTreeNode;
import com.moovit.app.surveys.data.remote.SurveyQuestionTreeNode;
import com.moovit.commons.utils.AppDeepLink;
import com.nutiteq.components.MapPos;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.tranzmate.moovit.protocol.screen.MVEXOnBoardingScreenCta;
import gg0.C23416a;
import gg0.C23418c;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.collections.C23816b;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.incremental.components.Position;
import kotlin.reflect.jvm.internal.impl.incremental.components.ScopeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import lh0.C24276j0;
import lh0.C24278k0;
import lh0.C24312z;
import mf0.C24356b;
import mf0.C24361g;
import mf0.C24362h;
import ob0.C12977b;
import p090g1.C4732a;
import p141k1.C5450a;
import p221q6.C6188h;
import p221q6.C6194m;
import p258t4.C6589c;
import p277ub.C6774a0;
import p311x6.C7176l;
import p361ai.C13470e;
import p389bl.C13637c;
import p389bl.C13641g;
import p404ce.C13791f;
import p404ce.C13806s;
import p506gd.C17173d;
import p912xh.C20526b;
import p977zz.C20944i0;
import r10.C19221e;
import ug0.C25069e;
import wh0.C25206p1;
import wh0.C25232y0;
import xg0.C25260c;
import zf0.C25432c;
import zf0.C25448i0;
import zf0.C25486u;
import zf0.C25491z;

/* renamed from: jk.p */
public class C17884p implements C13791f {

    /* renamed from: b */
    public static final C6589c f45877b = new C6589c();

    /* renamed from: c */
    public static ThreadPoolExecutor f45878c;

    /* renamed from: d */
    public static final /* synthetic */ C17884p f45879d = new C17884p();

    /* renamed from: A */
    public static String m44330A(String str) {
        boolean z;
        if (str.length() <= 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char c = charArray[0];
        if (charArray.length >= 2 && Character.isUpperCase(c)) {
            z = Character.isUpperCase(charArray[1]);
        } else {
            z = false;
        }
        if (!z) {
            charArray[0] = Character.toLowerCase(c);
        }
        return new String(charArray);
    }

    /* renamed from: B */
    public static String m44331B(String str, String str2) {
        return String.format("%s/project/%s/performance/app/android:%s", new Object[]{"https://console.firebase.google.com", str, str2});
    }

    /* renamed from: C */
    public static boolean m44332C(SurveyQuestionTreeNode surveyQuestionTreeNode, HashSet hashSet, HashSet hashSet2) {
        if (!hashSet.contains(surveyQuestionTreeNode)) {
            hashSet.add(surveyQuestionTreeNode);
            hashSet2.add(surveyQuestionTreeNode);
            for (SurveyAnswerTreeNode surveyAnswerTreeNode : surveyQuestionTreeNode.f39878e) {
                SurveyQuestionTreeNode surveyQuestionTreeNode2 = surveyAnswerTreeNode.f39873f;
                if (surveyQuestionTreeNode2 != null && ((!hashSet.contains(surveyQuestionTreeNode2) && m44332C(surveyQuestionTreeNode2, hashSet, hashSet2)) || hashSet2.contains(surveyQuestionTreeNode2))) {
                    return true;
                }
            }
        }
        hashSet2.remove(surveyQuestionTreeNode);
        return false;
    }

    /* renamed from: D */
    public static int m44333D(int i, int... iArr) {
        boolean z;
        int i2 = i + 629;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            for (int i3 : iArr) {
                i2 = (i2 * 37) + i3;
            }
        }
        return i2;
    }

    /* renamed from: E */
    public static int m44334E(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: F */
    public static int m44335F(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* renamed from: G */
    public static final HashSet m44336G(Object... objArr) {
        HashSet hashSet = new HashSet(C13637c.m34083z(objArr.length));
        C23816b.m58450f1(hashSet, objArr);
        return hashSet;
    }

    /* renamed from: H */
    public static int m44337H(int i, int i2, byte[] bArr) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 != 0) {
            if (i3 == 1) {
                byte b2 = bArr[i];
                if (b > -12 || b2 > -65) {
                    return -1;
                }
                return b ^ (b2 << 8);
            } else if (i3 == 2) {
                byte b3 = bArr[i];
                byte b4 = bArr[i + 1];
                if (b > -12 || b3 > -65 || b4 > -65) {
                    return -1;
                }
                return ((b3 << 8) ^ b) ^ (b4 << 16);
            } else {
                throw new AssertionError();
            }
        } else if (b > -12) {
            return -1;
        } else {
            return b;
        }
    }

    /* renamed from: I */
    public static boolean m44338I(Context context) {
        try {
            return GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: J */
    public static final boolean m44339J(C25491z zVar) {
        C24362h.m61211f(zVar, "<this>");
        return zVar.getGetter() == null;
    }

    /* renamed from: K */
    public static boolean m44340K() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* renamed from: L */
    public static final C24356b m44341L(Object[] objArr) {
        C24362h.m61211f(objArr, "array");
        return new C24356b(objArr);
    }

    /* renamed from: M */
    public static String m44342M(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    /* renamed from: N */
    public static final Set m44343N(Set set) {
        int size = set.size();
        if (size == 0) {
            return EmptySet.f60175b;
        }
        if (size != 1) {
            return set;
        }
        return m44348S(set.iterator().next());
    }

    /* renamed from: O */
    public static int m44344O(int i, int i2, byte[] bArr) {
        while (r7 < i2 && bArr[r7] >= 0) {
            i = r7 + 1;
        }
        if (r7 >= i2) {
            return 0;
        }
        while (r7 < i2) {
            int i3 = r7 + 1;
            byte b = bArr[r7];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        r7 = i3 + 1;
                        if (bArr[i3] > -65) {
                        }
                    }
                } else if (b < -16) {
                    if (i3 >= i2 - 1) {
                        return m44337H(i3, i2, bArr);
                    }
                    int i4 = i3 + 1;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        r7 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                } else if (i3 >= i2 - 2) {
                    return m44337H(i3, i2, bArr);
                } else {
                    int i5 = i3 + 1;
                    byte b3 = bArr[i3];
                    if (b3 <= -65) {
                        if ((((b3 + 112) + (b << 28)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                    }
                }
                return -1;
            }
            r7 = i3;
        }
        return 0;
    }

    /* renamed from: P */
    public static void m44345P(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    /* renamed from: Q */
    public static final void m44346Q(C23418c cVar, NoLookupLocation noLookupLocation, C25432c cVar2, C25069e eVar) {
        C23416a location;
        C24362h.m61211f(cVar, "<this>");
        C24362h.m61211f(noLookupLocation, "from");
        C24362h.m61211f(cVar2, "scopeOwner");
        C24362h.m61211f(eVar, "name");
        if (cVar != C23418c.C23419a.f59200a && (location = noLookupLocation.getLocation()) != null) {
            cVar.mo58561a();
            Position position = Position.f60544b;
            String a = location.mo58559a();
            String b = C25260c.m63390g(cVar2).mo61591b();
            C24362h.m61210e(b, "getFqName(scopeOwner).asString()");
            ScopeKind scopeKind = ScopeKind.CLASSIFIER;
            String f = eVar.mo61604f();
            C24362h.m61210e(f, "name.asString()");
            cVar.mo58562b(a, position, b, scopeKind, f);
        }
    }

    /* renamed from: R */
    public static final void m44347R(C23418c cVar, NoLookupLocation noLookupLocation, C25486u uVar, C25069e eVar) {
        C23416a location;
        C24362h.m61211f(cVar, "<this>");
        C24362h.m61211f(noLookupLocation, "from");
        C24362h.m61211f(uVar, "scopeOwner");
        C24362h.m61211f(eVar, "name");
        String b = uVar.mo53401f().mo61580b();
        C24362h.m61210e(b, "scopeOwner.fqName.asString()");
        String f = eVar.mo61604f();
        C24362h.m61210e(f, "name.asString()");
        if (cVar != C23418c.C23419a.f59200a && (location = noLookupLocation.getLocation()) != null) {
            cVar.mo58561a();
            C23418c cVar2 = cVar;
            cVar2.mo58562b(location.mo58559a(), Position.f60544b, b, ScopeKind.PACKAGE, f);
        }
    }

    /* renamed from: S */
    public static final Set m44348S(Object obj) {
        Set singleton = Collections.singleton(obj);
        C24362h.m61210e(singleton, "singleton(element)");
        return singleton;
    }

    /* renamed from: T */
    public static final Set m44349T(Object... objArr) {
        if (objArr.length > 0) {
            return C23816b.m58453i1(objArr);
        }
        return EmptySet.f60175b;
    }

    /* renamed from: U */
    public static LinkedList m44350U(ArrayList arrayList) {
        LinkedList linkedList = new LinkedList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < arrayList.size(); i++) {
            MapPos mapPos = (MapPos) arrayList.get(i);
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList2.size()) {
                    break;
                } else if (mapPos.equals(arrayList2.get(i2))) {
                    if (arrayList2.size() - i2 > 2) {
                        linkedList.add(new ArrayList(arrayList2.subList(i2, arrayList2.size())));
                    }
                    arrayList2 = new ArrayList(arrayList2.subList(0, i2));
                } else {
                    i2++;
                }
            }
            arrayList2.add(mapPos);
        }
        if (arrayList2.size() > 2) {
            linkedList.add(arrayList2);
        }
        return linkedList;
    }

    /* renamed from: V */
    public static Uri m44351V(Resources resources, int i) {
        StringBuilder k = C13555b.m33972k("android.resource://");
        k.append(resources.getResourcePackageName(i));
        k.append("/");
        k.append(i);
        return Uri.parse(k.toString());
    }

    /* renamed from: W */
    public static String m44352W(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("VISVAL_FIRST") || str.equals("BARCODE_FIRST")) {
            return str;
        }
        return null;
    }

    /* renamed from: X */
    public static C19221e m44353X(Context context) {
        return (C19221e) C2116c.m5521c(context).mo22193f(context);
    }

    /* renamed from: Y */
    public static C19221e m44354Y(View view) {
        C2131j jVar;
        C6194m c = C2116c.m5521c(view.getContext());
        c.getClass();
        if (C7176l.m16788h()) {
            jVar = c.mo22193f(view.getContext().getApplicationContext());
        } else if (view.getContext() != null) {
            Activity a = C6194m.m14758a(view.getContext());
            if (a == null) {
                jVar = c.mo22193f(view.getContext().getApplicationContext());
            } else if (a instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) a;
                c.f19591g.clear();
                C6194m.m14759c(c.f19591g, fragmentActivity.getSupportFragmentManager().mo3930H());
                View findViewById = fragmentActivity.findViewById(16908290);
                Fragment fragment = null;
                while (!view.equals(findViewById) && (fragment = c.f19591g.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c.f19591g.clear();
                if (fragment != null) {
                    jVar = c.mo22194g(fragment);
                } else {
                    jVar = c.mo22195h(fragmentActivity);
                }
            } else {
                c.f19592h.clear();
                c.mo22190b(a.getFragmentManager(), c.f19592h);
                View findViewById2 = a.findViewById(16908290);
                android.app.Fragment fragment2 = null;
                while (!view.equals(findViewById2) && (fragment2 = c.f19592h.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                    view = (View) view.getParent();
                }
                c.f19592h.clear();
                if (fragment2 == null) {
                    jVar = c.mo22192e(a);
                } else if (fragment2.getActivity() == null) {
                    throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
                } else if (!C7176l.m16788h()) {
                    if (fragment2.getActivity() != null) {
                        C6188h hVar = c.f19594j;
                        fragment2.getActivity();
                        hVar.mo22178a();
                    }
                    jVar = c.mo22191d(fragment2.getActivity(), fragment2.getChildFragmentManager(), fragment2, fragment2.isVisible());
                } else {
                    jVar = c.mo22193f(fragment2.getActivity().getApplicationContext());
                }
            }
        } else {
            throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
        }
        return (C19221e) jVar;
    }

    /* renamed from: Z */
    public static Class m44355Z(Class cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        if (cls == Void.TYPE) {
            return Void.class;
        }
        return cls;
    }

    /* renamed from: a */
    public static C25206p1 m44356a() {
        return new C25206p1((C25232y0) null);
    }

    /* renamed from: a0 */
    public static void m44357a0(Context context, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        File file = new File(context.getFilesDir(), "moovit_sdk_profilers");
        file.mkdirs();
        sb.append(file);
        sb.append(str);
        sb.append("/");
        File file2 = new File(sb.toString());
        file2.mkdirs();
        File file3 = new File(file2, str2);
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(file3, true));
            printWriter.println(str3);
            printWriter.close();
        } catch (IOException unused) {
            file3.toString();
        }
    }

    /* renamed from: b */
    public static void m44358b(WebView webView, String str, Object... objArr) {
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
                handler.post(new C13470e(webView, sb2));
            }
        } else {
            String k = C25541a.m63881k("The WebView is null for ", str);
            if (C20526b.f51916a.booleanValue()) {
                TextUtils.isEmpty(k);
            }
        }
    }

    /* renamed from: b0 */
    public static PhoneMultiFactorInfo m44359b0(zzze zzze) {
        if (zzze != null && !TextUtils.isEmpty(zzze.zze())) {
            return new PhoneMultiFactorInfo(zzze.zzd(), zzze.zzc(), zzze.zza(), Preconditions.checkNotEmpty(zzze.zze()));
        }
        return null;
    }

    /* renamed from: c */
    public static int m44360c(int i, Object obj) {
        return m44335F(obj) + (i * 37);
    }

    /* renamed from: c0 */
    public static C8011k m44361c0(C8017o oVar, C12977b.C12979b bVar, String str) {
        return oVar.mo25082c(bVar, EmptySet.f60175b, str);
    }

    /* renamed from: d */
    public static final void m44362d(Button button, int i) {
        C24362h.m61211f(button, "$this$addTintedLeftDrawable");
        Drawable drawable = C4732a.getDrawable(button.getContext(), i);
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            C24362h.m61210e(mutate, "it.mutate()");
            Drawable g = C5450a.m13604g(mutate);
            C5450a.C5452b.m13617h(g, button.getTextColors());
            C24362h.m61210e(g, "wrapDrawable");
            Drawable[] compoundDrawables = button.getCompoundDrawables();
            C24362h.m61210e(compoundDrawables, "this.compoundDrawables");
            button.setCompoundDrawablesWithIntrinsicBounds(g, compoundDrawables[1], compoundDrawables[2], compoundDrawables[3]);
        }
    }

    /* renamed from: d0 */
    public static StringBuilder m44363d0(String str, String str2, String str3) {
        return C13555b.m33973l(str, str2, str3);
    }

    /* renamed from: e */
    public static boolean m44364e(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        } else if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e0 */
    public static ThreadPoolExecutor m44365e0() {
        if (f45878c == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C17173d());
            f45878c = threadPoolExecutor;
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return f45878c;
    }

    /* renamed from: f */
    public static String m44366f(int i, int i2, String str) {
        if (i < 0) {
            return C13641g.m34132u("%s (%s) must not be negative", str, Integer.valueOf(i));
        } else if (i2 >= 0) {
            return C13641g.m34132u("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            throw new IllegalArgumentException(C13715c.m34241g(26, "negative size: ", i2));
        }
    }

    /* renamed from: f0 */
    public static ArrayList m44367f0(List list) {
        if (list == null || list.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PhoneMultiFactorInfo b0 = m44359b0((zzze) it.next());
            if (b0 != null) {
                arrayList.add(b0);
            }
        }
        return arrayList;
    }

    /* renamed from: g */
    public static void m44368g(String str) {
        if (C6774a0.f20959a >= 18) {
            Trace.beginSection(str);
        }
    }

    /* renamed from: h */
    public static void m44369h(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: i */
    public static void m44370i(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: j */
    public static void m44371j(int i, int i2) {
        String str;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str = C13641g.m34132u("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 >= 0) {
                str = C13641g.m34132u("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new IllegalArgumentException(C13715c.m34241g(26, "negative size: ", i2));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: k */
    public static void m44372k() {
        C24361g.m61193w("Not in application's main thread", m44340K());
    }

    /* renamed from: l */
    public static void m44373l(Object obj) {
        obj.getClass();
    }

    /* renamed from: n */
    public static void m44374n(int i, int i2) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(m44366f(i, i2, "index"));
        }
    }

    /* renamed from: o */
    public static void m44375o(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = m44366f(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = m44366f(i2, i3, "end index");
            } else {
                str = C13641g.m34132u("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    /* renamed from: p */
    public static void m44376p(boolean z, String str, Object obj) {
        if (!z) {
            throw new IllegalStateException(C13641g.m34132u(str, obj));
        }
    }

    /* renamed from: q */
    public static void m44377q(InputStream inputStream, OutputStream outputStream) {
        C24362h.m61211f(inputStream, "<this>");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            read = inputStream.read(bArr);
        }
    }

    /* renamed from: r */
    public static final C24276j0 m44378r(C25432c cVar, C21154b bVar) {
        C24362h.m61211f(cVar, "from");
        C24362h.m61211f(bVar, "to");
        cVar.mo53514r().size();
        bVar.mo53514r().size();
        C24278k0.C24279a aVar = C24278k0.f61571b;
        List<C25448i0> r = cVar.mo53514r();
        C24362h.m61210e(r, "from.declaredTypeParameters");
        ArrayList arrayList = new ArrayList(C21136j.m49436X(r, 10));
        for (C25448i0 j : r) {
            arrayList.add(j.mo53481j());
        }
        List<C25448i0> r2 = bVar.mo53514r();
        C24362h.m61210e(r2, "to.declaredTypeParameters");
        ArrayList arrayList2 = new ArrayList(C21136j.m49436X(r2, 10));
        for (C25448i0 q : r2) {
            C24312z q2 = q.mo53412q();
            C24362h.m61210e(q2, "it.defaultType");
            arrayList2.add(TypeUtilsKt.m60516a(q2));
        }
        return new C24276j0(C23826d.m58536a0(C23825c.m58505Q0(arrayList, arrayList2)), false);
    }

    /* renamed from: s */
    public static C20944i0 m44379s(MVEXOnBoardingScreenCta mVEXOnBoardingScreenCta) {
        Uri uri;
        String str = mVEXOnBoardingScreenCta.title;
        if (mVEXOnBoardingScreenCta.mo31419f()) {
            uri = Uri.parse(mVEXOnBoardingScreenCta.action);
        } else {
            uri = null;
        }
        return new C20944i0(str, new AppDeepLink("com.tranzmate", uri));
    }

    /* renamed from: t */
    public static void m44380t(MessageDigest messageDigest, int i) {
        messageDigest.update((byte) ((i >> 24) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        messageDigest.update((byte) ((i >> 16) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        messageDigest.update((byte) ((i >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
        messageDigest.update((byte) (i & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
    }

    /* renamed from: u */
    public static void m44381u(MessageDigest messageDigest, String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            messageDigest.update((byte) ((charAt >> 8) & ValidationUtils.APPBOY_STRING_MAX_LENGTH));
            messageDigest.update((byte) (charAt & 255));
        }
    }

    /* renamed from: v */
    public static void m44382v() {
        if (C6774a0.f20959a >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: w */
    public static String m44383w() {
        return C21100e.m49304E(new byte[]{66, 97, 114, 99, 111, 100, 101, 84, 111, 107, 101, 110});
    }

    /* renamed from: x */
    public static Class m44384x(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length > 0) {
            return m44385y(actualTypeArguments[0]);
        }
        return null;
    }

    /* renamed from: y */
    public static Class m44385y(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (!(type instanceof GenericArrayType)) {
            return Object.class;
        }
        Class y = m44385y(((GenericArrayType) type).getGenericComponentType());
        if (y != null) {
            return Array.newInstance(y, 0).getClass();
        }
        return null;
    }

    /* renamed from: z */
    public static Class[] m44386z(ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        Class[] clsArr = new Class[actualTypeArguments.length];
        for (int i = 0; i < actualTypeArguments.length; i++) {
            clsArr[i] = m44385y(actualTypeArguments[i]);
        }
        return clsArr;
    }

    /* renamed from: m */
    public Object mo15m(C13806s sVar) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(sVar);
    }
}
