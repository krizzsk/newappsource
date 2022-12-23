package com.facebook.internal;

import com.facebook.FacebookRequestError;
import com.google.android.gms.wallet.WalletConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.C23826d;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.n */
public final class C2421n {

    /* renamed from: d */
    public static final C2422a f8691d = new C2422a();

    /* renamed from: e */
    public static C2421n f8692e;

    /* renamed from: a */
    public final Map<Integer, Set<Integer>> f8693a;

    /* renamed from: b */
    public final Map<Integer, Set<Integer>> f8694b;

    /* renamed from: c */
    public final Map<Integer, Set<Integer>> f8695c;

    /* renamed from: com.facebook.internal.n$a */
    public static final class C2422a {
        /* renamed from: b */
        public static C2421n m6373b() {
            return new C2421n((HashMap) null, C23826d.m58532W(new Pair(2, null), new Pair(4, null), new Pair(9, null), new Pair(17, null), new Pair(341, null)), C23826d.m58532W(new Pair(102, null), new Pair(190, null), new Pair(Integer.valueOf(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION), null)), (String) null, (String) null, (String) null);
        }

        /* renamed from: c */
        public static HashMap m6374c(JSONObject jSONObject) {
            int optInt;
            HashSet hashSet;
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            if (optJSONArray.length() == 0) {
                return null;
            }
            HashMap hashMap = new HashMap();
            int length = optJSONArray.length();
            if (length > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (!(optJSONObject == null || (optInt = optJSONObject.optInt("code")) == 0)) {
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                        if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                            hashSet = null;
                        } else {
                            hashSet = new HashSet();
                            int length2 = optJSONArray2.length();
                            if (length2 > 0) {
                                int i3 = 0;
                                while (true) {
                                    int i4 = i3 + 1;
                                    int optInt2 = optJSONArray2.optInt(i3);
                                    if (optInt2 != 0) {
                                        hashSet.add(Integer.valueOf(optInt2));
                                    }
                                    if (i4 >= length2) {
                                        break;
                                    }
                                    i3 = i4;
                                }
                            }
                        }
                        hashMap.put(Integer.valueOf(optInt), hashSet);
                    }
                    if (i2 >= length) {
                        break;
                    }
                    i = i2;
                }
            }
            return hashMap;
        }

        /* renamed from: a */
        public final synchronized C2421n mo12591a() {
            C2421n nVar;
            if (C2421n.f8692e == null) {
                C2421n.f8692e = m6373b();
            }
            nVar = C2421n.f8692e;
            if (nVar == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
            }
            return nVar;
        }
    }

    /* renamed from: com.facebook.internal.n$b */
    public /* synthetic */ class C2423b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f8696a;

        static {
            int[] iArr = new int[FacebookRequestError.Category.values().length];
            iArr[FacebookRequestError.Category.OTHER.ordinal()] = 1;
            iArr[FacebookRequestError.Category.LOGIN_RECOVERABLE.ordinal()] = 2;
            iArr[FacebookRequestError.Category.TRANSIENT.ordinal()] = 3;
            f8696a = iArr;
        }
    }

    public C2421n(HashMap hashMap, HashMap hashMap2, HashMap hashMap3, String str, String str2, String str3) {
        this.f8693a = hashMap;
        this.f8694b = hashMap2;
        this.f8695c = hashMap3;
    }
}
