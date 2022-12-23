package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Keep;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.facebook.ads.C2289Ad;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.internal.api.AdViewApi;
import com.facebook.ads.internal.api.AdViewParentApi;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.api.NativeAdBaseApi;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

@Keep
class DynamicLoaderFallback {
    /* access modifiers changed from: private */
    public static final WeakHashMap<Object, AdListener> sApiProxyToAdListenersMap = new WeakHashMap<>();

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$a */
    public class C2309a implements InvocationHandler {

        /* renamed from: a */
        public final /* synthetic */ List f8469a;

        /* renamed from: b */
        public final /* synthetic */ Map f8470b;

        /* renamed from: c */
        public final /* synthetic */ List f8471c;

        /* renamed from: d */
        public final /* synthetic */ List f8472d;

        /* renamed from: e */
        public final /* synthetic */ Map f8473e;

        /* renamed from: f */
        public final /* synthetic */ List f8474f;

        /* renamed from: g */
        public final /* synthetic */ List f8475g;

        /* renamed from: h */
        public final /* synthetic */ Method f8476h;

        /* renamed from: i */
        public final /* synthetic */ Method f8477i;

        public C2309a(ArrayList arrayList, HashMap hashMap, ArrayList arrayList2, ArrayList arrayList3, HashMap hashMap2, ArrayList arrayList4, ArrayList arrayList5, Method method, Method method2) {
            this.f8469a = arrayList;
            this.f8470b = hashMap;
            this.f8471c = arrayList2;
            this.f8472d = arrayList3;
            this.f8473e = hashMap2;
            this.f8474f = arrayList4;
            this.f8475g = arrayList5;
            this.f8476h = method;
            this.f8477i = method2;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            if (method.getReturnType().isPrimitive()) {
                if (!method.getReturnType().equals(Void.TYPE)) {
                    return Array.get(Array.newInstance(method.getReturnType(), 1), 0);
                }
                Iterator it = this.f8469a.iterator();
                while (it.hasNext() && (!DynamicLoaderFallback.equalsMethods(method, (Method) it.next()) || !DynamicLoaderFallback.reportError(obj, this.f8470b))) {
                }
                for (Method access$100 : this.f8471c) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$100) && DynamicLoaderFallback.reportError(obj, this.f8470b)) {
                        return null;
                    }
                }
                return null;
            } else if (method.getReturnType().equals(String.class)) {
                return "";
            } else {
                if (method.getReturnType().equals(obj.getClass().getInterfaces()[0])) {
                    obj2 = obj;
                } else {
                    obj2 = Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{method.getReturnType()}, this);
                }
                Iterator it2 = this.f8472d.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (DynamicLoaderFallback.equalsMethods(method, (Method) it2.next())) {
                            DynamicLoaderFallback.sApiProxyToAdListenersMap.put(this.f8473e.get(obj), objArr[0]);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                for (Method access$1002 : this.f8474f) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1002)) {
                        this.f8473e.put(obj2, obj);
                    }
                }
                for (Method access$1003 : this.f8475g) {
                    if (DynamicLoaderFallback.equalsMethods(method, access$1003)) {
                        for (C2289Ad ad : objArr) {
                            if (ad instanceof C2289Ad) {
                                this.f8470b.put(obj2, ad);
                            }
                        }
                    }
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f8476h)) {
                    this.f8470b.put(objArr[1], objArr[0]);
                }
                if (DynamicLoaderFallback.equalsMethods(method, this.f8477i)) {
                    this.f8470b.put(objArr[1], objArr[0]);
                }
                return obj2;
            }
        }
    }

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$b */
    public class C2310b implements Runnable {

        /* renamed from: b */
        public final /* synthetic */ AdListener f8478b;

        /* renamed from: c */
        public final /* synthetic */ C2289Ad f8479c;

        public C2310b(AdListener adListener, C2289Ad ad) {
            this.f8478b = adListener;
            this.f8479c = ad;
        }

        public final void run() {
            this.f8478b.onError(this.f8479c, new AdError(-1, DynamicLoaderFactory.DEX_LOADING_ERROR_MESSAGE));
        }
    }

    /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$c */
    public static class C2311c {

        /* renamed from: a */
        public Method f8480a;

        /* renamed from: b */
        public final C2312a f8481b = new C2312a();

        /* renamed from: com.facebook.ads.internal.dynamicloading.DynamicLoaderFallback$c$a */
        public class C2312a implements InvocationHandler {
            public C2312a() {
            }

            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if ("toString".equals(method.getName())) {
                    return null;
                }
                C2311c.this.f8480a = method;
                return null;
            }
        }

        /* renamed from: a */
        public final <T> T mo12418a(Class<T> cls) {
            return cls.cast(Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls}, this.f8481b));
        }
    }

    private static boolean equalsMethodParams(Method method, Method method2) {
        return Arrays.equals(method.getParameterTypes(), method2.getParameterTypes());
    }

    /* access modifiers changed from: private */
    public static boolean equalsMethods(Method method, Method method2) {
        if (method == null || method2 == null || !method.getDeclaringClass().equals(method2.getDeclaringClass()) || !method.getName().equals(method2.getName()) || !equalsMethodParams(method, method2)) {
            return false;
        }
        return true;
    }

    @SuppressLint({"Parameter Not Nullable", "CatchGeneralException"})
    public static DynamicLoader makeFallbackLoader() {
        Class cls = DynamicLoader.class;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        C2311c cVar = new C2311c();
        DynamicLoader dynamicLoader = (DynamicLoader) cVar.mo12418a(cls);
        dynamicLoader.createInterstitialAd((Context) null, (String) null, (InterstitialAd) null);
        arrayList5.add(cVar.f8480a);
        dynamicLoader.createRewardedVideoAd((Context) null, (String) null, (RewardedVideoAd) null);
        arrayList5.add(cVar.f8480a);
        Class cls2 = cls;
        dynamicLoader.createAdViewApi((Context) null, (String) null, (AdSize) null, (AdViewParentApi) null, (AdView) null);
        arrayList5.add(cVar.f8480a);
        try {
            dynamicLoader.createAdViewApi((Context) null, (String) null, (String) null, (AdViewParentApi) null, (AdView) null);
        } catch (Exception unused) {
        }
        arrayList5.add(cVar.f8480a);
        dynamicLoader.createNativeAdApi((NativeAd) null, (NativeAdBaseApi) null);
        Method method = cVar.f8480a;
        dynamicLoader.createNativeBannerAdApi((NativeBannerAd) null, (NativeAdBaseApi) null);
        Method method2 = cVar.f8480a;
        NativeAdBaseApi nativeAdBaseApi = (NativeAdBaseApi) cVar.mo12418a(NativeAdBaseApi.class);
        nativeAdBaseApi.loadAd();
        arrayList.add(cVar.f8480a);
        nativeAdBaseApi.loadAd((NativeAdBase.NativeLoadAdConfig) null);
        arrayList2.add(cVar.f8480a);
        nativeAdBaseApi.buildLoadAdConfig((NativeAdBase) null);
        arrayList4.add(cVar.f8480a);
        InterstitialAdApi interstitialAdApi = (InterstitialAdApi) cVar.mo12418a(InterstitialAdApi.class);
        interstitialAdApi.loadAd();
        arrayList.add(cVar.f8480a);
        interstitialAdApi.loadAd((InterstitialAd.InterstitialLoadAdConfig) null);
        arrayList2.add(cVar.f8480a);
        interstitialAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f8480a);
        RewardedVideoAdApi rewardedVideoAdApi = (RewardedVideoAdApi) cVar.mo12418a(RewardedVideoAdApi.class);
        rewardedVideoAdApi.loadAd();
        arrayList.add(cVar.f8480a);
        rewardedVideoAdApi.loadAd((RewardedVideoAd.RewardedVideoLoadAdConfig) null);
        arrayList2.add(cVar.f8480a);
        rewardedVideoAdApi.buildLoadAdConfig();
        arrayList4.add(cVar.f8480a);
        AdViewApi adViewApi = (AdViewApi) cVar.mo12418a(AdViewApi.class);
        adViewApi.loadAd();
        arrayList.add(cVar.f8480a);
        adViewApi.loadAd((AdView.AdViewLoadConfig) null);
        arrayList2.add(cVar.f8480a);
        adViewApi.buildLoadAdConfig();
        arrayList4.add(cVar.f8480a);
        ((AdView.AdViewLoadConfigBuilder) cVar.mo12418a(AdView.AdViewLoadConfigBuilder.class)).withAdListener((AdListener) null);
        arrayList3.add(cVar.f8480a);
        ((NativeAdBase.NativeAdLoadConfigBuilder) cVar.mo12418a(NativeAdBase.NativeAdLoadConfigBuilder.class)).withAdListener((NativeAdListener) null);
        arrayList3.add(cVar.f8480a);
        ((InterstitialAd.InterstitialAdLoadConfigBuilder) cVar.mo12418a(InterstitialAd.InterstitialAdLoadConfigBuilder.class)).withAdListener((InterstitialAdListener) null);
        arrayList3.add(cVar.f8480a);
        ((RewardedVideoAd.RewardedVideoAdLoadConfigBuilder) cVar.mo12418a(RewardedVideoAd.RewardedVideoAdLoadConfigBuilder.class)).withAdListener((RewardedVideoAdListener) null);
        arrayList3.add(cVar.f8480a);
        C2309a aVar = new C2309a(arrayList, hashMap, arrayList2, arrayList3, hashMap2, arrayList4, arrayList5, method, method2);
        return (DynamicLoader) Proxy.newProxyInstance(DynamicLoaderFallback.class.getClassLoader(), new Class[]{cls2}, aVar);
    }

    /* access modifiers changed from: private */
    public static boolean reportError(Object obj, Map<Object, C2289Ad> map) {
        if (obj == null) {
            return false;
        }
        AdListener adListener = sApiProxyToAdListenersMap.get(obj);
        C2289Ad ad = map.get(obj);
        if (adListener == null) {
            return false;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new C2310b(adListener, ad), 500);
        return true;
    }
}
