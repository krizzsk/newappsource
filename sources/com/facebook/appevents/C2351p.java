package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.facebook.internal.C2397f0;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.C23816b;
import kotlin.text.Regex;
import mf0.C24362h;
import p009a8.C0098d0;
import p009a8.C0115o;
import p262t8.C6606a;
import p389bl.C13637c;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.facebook.appevents.p */
public final class C2351p {

    /* renamed from: a */
    public final C2338j f8567a;

    /* renamed from: com.facebook.appevents.p$a */
    public static final class C2352a {
        /* renamed from: a */
        public static void m6242a(HashMap hashMap) {
            C2355s sVar;
            String[] strArr;
            boolean z;
            int i;
            boolean z2;
            C2355s sVar2 = C2355s.f8576a;
            Class<C2355s> cls = C2355s.class;
            if (!C6606a.m15601b(cls)) {
                try {
                    if (!C2355s.f8578c.get()) {
                        C2355s.f8576a.mo12517b();
                    }
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        C2397f0 f0Var = C2397f0.f8630a;
                        C2355s sVar3 = C2355s.f8576a;
                        int i2 = 1;
                        int length = str2.length() - 1;
                        int i3 = 0;
                        boolean z3 = false;
                        while (true) {
                            if (i3 > length) {
                                break;
                            }
                            if (!z3) {
                                i = i3;
                            } else {
                                i = length;
                            }
                            if (C24362h.m61213h(str2.charAt(i), 32) <= 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (!z3) {
                                if (!z2) {
                                    z3 = true;
                                } else {
                                    i3++;
                                }
                            } else if (!z2) {
                                break;
                            } else {
                                length--;
                            }
                        }
                        String N = C2397f0.m6305N(sVar3.mo12518c(str, str2.subSequence(i3, length + 1).toString()));
                        ConcurrentHashMap<String, String> concurrentHashMap = C2355s.f8580e;
                        if (concurrentHashMap.containsKey(str)) {
                            String str3 = concurrentHashMap.get(str);
                            if (str3 == null) {
                                strArr = null;
                            } else {
                                Object[] array = new Regex(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR).mo60285d(str3).toArray(new String[0]);
                                if (array != null) {
                                    strArr = (String[]) array;
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                            }
                            if (strArr == null) {
                                strArr = new String[0];
                            }
                            Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
                            C24362h.m61211f(copyOf, "elements");
                            LinkedHashSet linkedHashSet = new LinkedHashSet(C13637c.m34083z(copyOf.length));
                            C23816b.m58450f1(linkedHashSet, copyOf);
                            if (!linkedHashSet.contains(N)) {
                                StringBuilder sb = new StringBuilder();
                                if (strArr.length == 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    sb.append(N);
                                } else if (strArr.length < 5) {
                                    sb.append(str3);
                                    sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                                    sb.append(N);
                                } else {
                                    while (true) {
                                        int i4 = i2 + 1;
                                        sb.append(strArr[i2]);
                                        sb.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                                        if (i4 >= 5) {
                                            break;
                                        }
                                        i2 = i4;
                                    }
                                    sb.append(N);
                                    linkedHashSet.remove(strArr[0]);
                                }
                                C2355s.f8580e.put(str, sb.toString());
                            } else {
                                return;
                            }
                        } else {
                            concurrentHashMap.put(str, N);
                        }
                    }
                    sVar = C2355s.f8576a;
                    C2397f0 f0Var2 = C2397f0.f8630a;
                    String E = C2397f0.m6296E(C2355s.f8580e);
                    sVar.getClass();
                    if (!C6606a.m15601b(sVar)) {
                        C0115o.m212c().execute(new C2354r("com.facebook.appevents.UserDataStore.internalUserData", E, 0));
                    }
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
        }
    }

    public C2351p(Context context) {
        this.f8567a = new C2338j(context, (String) null);
    }

    /* renamed from: a */
    public final void mo12509a(Bundle bundle, String str) {
        C0115o oVar = C0115o.f331a;
        if (C0098d0.m169b()) {
            this.f8567a.mo12486f(str, bundle);
        }
    }

    public C2351p(Context context, String str) {
        this.f8567a = new C2338j(context, str);
    }
}
