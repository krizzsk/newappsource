package com.facebook.appevents;

import bf0.C21050d;
import com.facebook.FacebookException;
import com.facebook.internal.C2397f0;
import com.usebutton.sdk.internal.util.DiskLruCache;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.Regex;
import mf0.C24362h;
import org.json.JSONException;
import org.json.JSONObject;
import p009a8.C0115o;
import p135j8.C5398d;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0017"}, mo59060d2 = {"Lcom/facebook/appevents/AppEvent;", "Ljava/io/Serializable;", "", "writeReplace", "Lorg/json/JSONObject;", "jsonObject", "Lorg/json/JSONObject;", "b", "()Lorg/json/JSONObject;", "", "isImplicit", "Z", "e", "()Z", "inBackground", "", "name", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "checksum", "a", "SerializationProxyV2", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
public final class AppEvent implements Serializable {

    /* renamed from: b */
    public static final HashSet<String> f8484b = new HashSet<>();
    private static final long serialVersionUID = 1;
    private final String checksum;
    private final boolean inBackground;
    private final boolean isImplicit;
    private final JSONObject jsonObject;
    private final String name;

    @Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, mo59060d2 = {"Lcom/facebook/appevents/AppEvent$SerializationProxyV2;", "Ljava/io/Serializable;", "", "readResolve", "", "jsonString", "Ljava/lang/String;", "", "isImplicit", "Z", "inBackground", "checksum", "facebook-core_release"}, mo59061k = 1, mo59062mv = {1, 5, 1})
    public static final class SerializationProxyV2 implements Serializable {
        private static final long serialVersionUID = 20160803001L;
        private final String checksum;
        private final boolean inBackground;
        private final boolean isImplicit;
        private final String jsonString;

        public SerializationProxyV2(String str, String str2, boolean z, boolean z2) {
            this.jsonString = str;
            this.isImplicit = z;
            this.inBackground = z2;
            this.checksum = str2;
        }

        private final Object readResolve() throws JSONException, ObjectStreamException {
            return new AppEvent(this.jsonString, this.isImplicit, this.inBackground, this.checksum);
        }
    }

    /* renamed from: com.facebook.appevents.AppEvent$a */
    public static final class C2314a {
        /* renamed from: a */
        public static final String m6182a(String str) {
            HashSet<String> hashSet = AppEvent.f8484b;
            try {
                MessageDigest instance = MessageDigest.getInstance("MD5");
                Charset forName = Charset.forName("UTF-8");
                C24362h.m61210e(forName, "Charset.forName(charsetName)");
                if (str != null) {
                    byte[] bytes = str.getBytes(forName);
                    C24362h.m61210e(bytes, "(this as java.lang.String).getBytes(charset)");
                    instance.update(bytes, 0, bytes.length);
                    byte[] digest = instance.digest();
                    C24362h.m61210e(digest, "digest.digest()");
                    return C5398d.m13500a(digest);
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            } catch (NoSuchAlgorithmException unused) {
                C2397f0 f0Var = C2397f0.f8630a;
                C0115o oVar = C0115o.f331a;
                return "0";
            } catch (UnsupportedEncodingException unused2) {
                C2397f0 f0Var2 = C2397f0.f8630a;
                C0115o oVar2 = C0115o.f331a;
                return DiskLruCache.VERSION_1;
            }
        }

        /* renamed from: b */
        public static final void m6183b(String str) {
            boolean z;
            boolean contains;
            HashSet<String> hashSet = AppEvent.f8484b;
            if (str != null) {
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z && str.length() <= 40) {
                    HashSet<String> hashSet2 = AppEvent.f8484b;
                    synchronized (hashSet2) {
                        contains = hashSet2.contains(str);
                        C21050d dVar = C21050d.f52856a;
                    }
                    if (contains) {
                        return;
                    }
                    if (new Regex("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").mo60283b(str)) {
                        synchronized (hashSet2) {
                            hashSet2.add(str);
                        }
                        return;
                    }
                    throw new FacebookException(C13555b.m33971j(new Object[]{str}, 1, "Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", "java.lang.String.format(format, *args)"));
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            String format = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            C24362h.m61210e(format, "java.lang.String.format(locale, format, *args)");
            throw new FacebookException(format);
        }
    }

    static {
        new C2314a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:112:0x023e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045 A[Catch:{ all -> 0x003e, all -> 0x0048 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppEvent(java.lang.String r8, java.lang.String r9, java.lang.Double r10, android.os.Bundle r11, boolean r12, boolean r13, java.util.UUID r14) throws org.json.JSONException, com.facebook.FacebookException {
        /*
            r7 = this;
            java.lang.String r0 = "contextName"
            mf0.C24362h.m61211f(r8, r0)
            java.lang.String r0 = "eventName"
            mf0.C24362h.m61211f(r9, r0)
            r7.<init>()
            r7.isImplicit = r12
            r7.inBackground = r13
            r7.name = r9
            java.lang.Class<m8.a> r12 = p171m8.C5717a.class
            com.facebook.appevents.AppEvent.C2314a.m6183b(r9)
            org.json.JSONObject r13 = new org.json.JSONObject
            r13.<init>()
            m8.a r1 = p171m8.C5717a.f18537a
            boolean r1 = p262t8.C6606a.m15601b(r12)
            r2 = 0
            if (r1 == 0) goto L_0x0027
            goto L_0x004c
        L_0x0027:
            boolean r1 = p171m8.C5717a.f18538b     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x004d
            m8.a r1 = p171m8.C5717a.f18537a     // Catch:{ all -> 0x0048 }
            r1.getClass()     // Catch:{ all -> 0x0048 }
            boolean r3 = p262t8.C6606a.m15601b(r1)     // Catch:{ all -> 0x0048 }
            if (r3 == 0) goto L_0x0037
            goto L_0x0042
        L_0x0037:
            java.util.concurrent.CopyOnWriteArraySet r3 = p171m8.C5717a.f18540d     // Catch:{ all -> 0x003e }
            boolean r1 = r3.contains(r9)     // Catch:{ all -> 0x003e }
            goto L_0x0043
        L_0x003e:
            r3 = move-exception
            p262t8.C6606a.m15600a(r1, r3)     // Catch:{ all -> 0x0048 }
        L_0x0042:
            r1 = 0
        L_0x0043:
            if (r1 == 0) goto L_0x004d
            java.lang.String r9 = "_removed_"
            goto L_0x004d
        L_0x0048:
            r9 = move-exception
            p262t8.C6606a.m15600a(r12, r9)
        L_0x004c:
            r9 = 0
        L_0x004d:
            java.lang.String r1 = "_eventName"
            r13.put(r1, r9)
            java.lang.String r9 = com.facebook.appevents.AppEvent.C2314a.m6182a(r9)
            java.lang.String r1 = "_eventName_md5"
            r13.put(r1, r9)
            long r3 = java.lang.System.currentTimeMillis()
            r9 = 1000(0x3e8, float:1.401E-42)
            long r5 = (long) r9
            long r3 = r3 / r5
            java.lang.String r9 = "_logTime"
            r13.put(r9, r3)
            java.lang.String r9 = "_ui"
            r13.put(r9, r8)
            if (r14 == 0) goto L_0x0074
            java.lang.String r8 = "_session_id"
            r13.put(r8, r14)
        L_0x0074:
            r8 = 1
            if (r11 == 0) goto L_0x023c
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Set r14 = r11.keySet()
            java.util.Iterator r14 = r14.iterator()
        L_0x0084:
            boolean r1 = r14.hasNext()
            if (r1 == 0) goto L_0x00c2
            java.lang.Object r1 = r14.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r3 = "key"
            mf0.C24362h.m61210e(r1, r3)
            com.facebook.appevents.AppEvent.C2314a.m6183b(r1)
            java.lang.Object r3 = r11.get(r1)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 != 0) goto L_0x00ba
            boolean r4 = r3 instanceof java.lang.Number
            if (r4 == 0) goto L_0x00a5
            goto L_0x00ba
        L_0x00a5:
            com.facebook.FacebookException r9 = new com.facebook.FacebookException
            r10 = 2
            java.lang.Object[] r11 = new java.lang.Object[r10]
            r11[r2] = r3
            r11[r8] = r1
            java.lang.String r8 = "Parameter value '%s' for key '%s' should be a string or a numeric type."
            java.lang.String r12 = "java.lang.String.format(format, *args)"
            java.lang.String r8 = p379.C13555b.m33971j(r11, r10, r8, r12)
            r9.<init>((java.lang.String) r8)
            throw r9
        L_0x00ba:
            java.lang.String r3 = r3.toString()
            r9.put(r1, r3)
            goto L_0x0084
        L_0x00c2:
            i8.a r11 = p123i8.C5305a.f17485a
            java.lang.Class<i8.a> r11 = p123i8.C5305a.class
            boolean r14 = p262t8.C6606a.m15601b(r11)
            if (r14 == 0) goto L_0x00ce
            goto L_0x0141
        L_0x00ce:
            boolean r14 = p123i8.C5305a.f17486b     // Catch:{ all -> 0x013d }
            if (r14 == 0) goto L_0x0141
            boolean r14 = r9.isEmpty()     // Catch:{ all -> 0x013d }
            if (r14 == 0) goto L_0x00d9
            goto L_0x0141
        L_0x00d9:
            java.util.Set r14 = r9.keySet()     // Catch:{ Exception -> 0x013b }
            java.util.List r14 = kotlin.collections.C23825c.m58499K0(r14)     // Catch:{ Exception -> 0x013b }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x013b }
            r1.<init>()     // Catch:{ Exception -> 0x013b }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ Exception -> 0x013b }
        L_0x00ea:
            boolean r3 = r14.hasNext()     // Catch:{ Exception -> 0x013b }
            if (r3 == 0) goto L_0x0126
            java.lang.Object r3 = r14.next()     // Catch:{ Exception -> 0x013b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x013b }
            java.lang.Object r4 = r9.get(r3)     // Catch:{ Exception -> 0x013b }
            if (r4 == 0) goto L_0x011a
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x013b }
            i8.a r5 = p123i8.C5305a.f17485a     // Catch:{ Exception -> 0x013b }
            boolean r6 = r5.mo21090a(r3)     // Catch:{ Exception -> 0x013b }
            if (r6 != 0) goto L_0x010c
            boolean r5 = r5.mo21090a(r4)     // Catch:{ Exception -> 0x013b }
            if (r5 == 0) goto L_0x00ea
        L_0x010c:
            r9.remove(r3)     // Catch:{ Exception -> 0x013b }
            boolean r5 = p123i8.C5305a.f17487c     // Catch:{ Exception -> 0x013b }
            if (r5 == 0) goto L_0x0114
            goto L_0x0116
        L_0x0114:
            java.lang.String r4 = ""
        L_0x0116:
            r1.put(r3, r4)     // Catch:{ Exception -> 0x013b }
            goto L_0x00ea
        L_0x011a:
            java.lang.String r14 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x013b }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x013b }
            r1.<init>(r14)     // Catch:{ Exception -> 0x013b }
            throw r1     // Catch:{ Exception -> 0x013b }
        L_0x0126:
            int r14 = r1.length()     // Catch:{ Exception -> 0x013b }
            if (r14 == 0) goto L_0x0141
            java.lang.String r14 = "_onDeviceParams"
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x013b }
            java.lang.String r3 = "restrictiveParamJson.toString()"
            mf0.C24362h.m61210e(r1, r3)     // Catch:{ Exception -> 0x013b }
            r9.put(r14, r1)     // Catch:{ Exception -> 0x013b }
            goto L_0x0141
        L_0x013b:
            goto L_0x0141
        L_0x013d:
            r14 = move-exception
            p262t8.C6606a.m15600a(r11, r14)
        L_0x0141:
            m8.a r11 = p171m8.C5717a.f18537a
            java.lang.String r11 = r7.name
            boolean r14 = p262t8.C6606a.m15601b(r12)
            if (r14 == 0) goto L_0x014d
            goto L_0x01c2
        L_0x014d:
            mf0.C24362h.m61211f(r11, r0)     // Catch:{ all -> 0x01be }
            boolean r14 = p171m8.C5717a.f18538b     // Catch:{ all -> 0x01be }
            if (r14 != 0) goto L_0x0155
            goto L_0x01c2
        L_0x0155:
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x01be }
            r14.<init>()     // Catch:{ all -> 0x01be }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x01be }
            java.util.Set r3 = r9.keySet()     // Catch:{ all -> 0x01be }
            r1.<init>(r3)     // Catch:{ all -> 0x01be }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x01be }
        L_0x0167:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x01be }
            if (r3 == 0) goto L_0x0182
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x01be }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x01be }
            m8.a r4 = p171m8.C5717a.f18537a     // Catch:{ all -> 0x01be }
            java.lang.String r4 = r4.mo21555a(r11, r3)     // Catch:{ all -> 0x01be }
            if (r4 == 0) goto L_0x0167
            r14.put(r3, r4)     // Catch:{ all -> 0x01be }
            r9.remove(r3)     // Catch:{ all -> 0x01be }
            goto L_0x0167
        L_0x0182:
            boolean r11 = r14.isEmpty()     // Catch:{ all -> 0x01be }
            r11 = r11 ^ r8
            if (r11 == 0) goto L_0x01c2
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ JSONException -> 0x01bc }
            r11.<init>()     // Catch:{ JSONException -> 0x01bc }
            java.util.Set r14 = r14.entrySet()     // Catch:{ JSONException -> 0x01bc }
            java.util.Iterator r14 = r14.iterator()     // Catch:{ JSONException -> 0x01bc }
        L_0x0196:
            boolean r1 = r14.hasNext()     // Catch:{ JSONException -> 0x01bc }
            if (r1 == 0) goto L_0x01b2
            java.lang.Object r1 = r14.next()     // Catch:{ JSONException -> 0x01bc }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ JSONException -> 0x01bc }
            java.lang.Object r3 = r1.getKey()     // Catch:{ JSONException -> 0x01bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ JSONException -> 0x01bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ JSONException -> 0x01bc }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ JSONException -> 0x01bc }
            r11.put(r3, r1)     // Catch:{ JSONException -> 0x01bc }
            goto L_0x0196
        L_0x01b2:
            java.lang.String r14 = "_restrictedParams"
            java.lang.String r11 = r11.toString()     // Catch:{ JSONException -> 0x01bc }
            r9.put(r14, r11)     // Catch:{ JSONException -> 0x01bc }
            goto L_0x01c2
        L_0x01bc:
            goto L_0x01c2
        L_0x01be:
            r11 = move-exception
            p262t8.C6606a.m15600a(r12, r11)
        L_0x01c2:
            g8.a r11 = p097g8.C4845a.f16269a
            java.lang.String r11 = r7.name
            java.lang.Class<g8.a> r12 = p097g8.C4845a.class
            boolean r14 = p262t8.C6606a.m15601b(r12)
            if (r14 == 0) goto L_0x01cf
            goto L_0x0220
        L_0x01cf:
            mf0.C24362h.m61211f(r11, r0)     // Catch:{ all -> 0x021c }
            boolean r14 = p097g8.C4845a.f16270b     // Catch:{ all -> 0x021c }
            if (r14 != 0) goto L_0x01d7
            goto L_0x0220
        L_0x01d7:
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x021c }
            java.util.Set r0 = r9.keySet()     // Catch:{ all -> 0x021c }
            r14.<init>(r0)     // Catch:{ all -> 0x021c }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x021c }
            java.util.ArrayList r1 = p097g8.C4845a.f16271c     // Catch:{ all -> 0x021c }
            r0.<init>(r1)     // Catch:{ all -> 0x021c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x021c }
        L_0x01eb:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x021c }
            if (r1 == 0) goto L_0x0220
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x021c }
            g8.a$a r1 = (p097g8.C4845a.C4846a) r1     // Catch:{ all -> 0x021c }
            java.lang.String r3 = r1.f16273a     // Catch:{ all -> 0x021c }
            boolean r3 = mf0.C24362h.m61206a(r3, r11)     // Catch:{ all -> 0x021c }
            if (r3 != 0) goto L_0x0200
            goto L_0x01eb
        L_0x0200:
            java.util.Iterator r3 = r14.iterator()     // Catch:{ all -> 0x021c }
        L_0x0204:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x021c }
            if (r4 == 0) goto L_0x01eb
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x021c }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x021c }
            java.util.List<java.lang.String> r5 = r1.f16274b     // Catch:{ all -> 0x021c }
            boolean r5 = r5.contains(r4)     // Catch:{ all -> 0x021c }
            if (r5 == 0) goto L_0x0204
            r9.remove(r4)     // Catch:{ all -> 0x021c }
            goto L_0x0204
        L_0x021c:
            r11 = move-exception
            p262t8.C6606a.m15600a(r12, r11)
        L_0x0220:
            java.util.Set r11 = r9.keySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0228:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x023c
            java.lang.Object r12 = r11.next()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r14 = r9.get(r12)
            r13.put(r12, r14)
            goto L_0x0228
        L_0x023c:
            if (r10 == 0) goto L_0x0247
            double r9 = r10.doubleValue()
            java.lang.String r11 = "_valueToSum"
            r13.put(r11, r9)
        L_0x0247:
            boolean r9 = r7.inBackground
            java.lang.String r10 = "1"
            if (r9 == 0) goto L_0x0252
            java.lang.String r9 = "_inBackground"
            r13.put(r9, r10)
        L_0x0252:
            boolean r9 = r7.isImplicit
            if (r9 == 0) goto L_0x025c
            java.lang.String r8 = "_implicitlyLogged"
            r13.put(r8, r10)
            goto L_0x0274
        L_0x025c:
            com.facebook.internal.x$a r9 = com.facebook.internal.C2436x.f8729d
            com.facebook.LoggingBehavior r9 = com.facebook.LoggingBehavior.APP_EVENTS
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.String r10 = r13.toString()
            java.lang.String r11 = "eventObject.toString()"
            mf0.C24362h.m61210e(r10, r11)
            r8[r2] = r10
            java.lang.String r10 = "AppEvents"
            java.lang.String r11 = "Created app event '%s'"
            com.facebook.internal.C2436x.C2437a.m6390b(r9, r10, r11, r8)
        L_0x0274:
            r7.jsonObject = r13
            java.lang.String r8 = r13.toString()
            java.lang.String r9 = "jsonObject.toString()"
            mf0.C24362h.m61210e(r8, r9)
            java.lang.String r8 = com.facebook.appevents.AppEvent.C2314a.m6182a(r8)
            r7.checksum = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.AppEvent.<init>(java.lang.String, java.lang.String, java.lang.Double, android.os.Bundle, boolean, boolean, java.util.UUID):void");
    }

    private final Object writeReplace() throws ObjectStreamException {
        String jSONObject = this.jsonObject.toString();
        C24362h.m61210e(jSONObject, "jsonObject.toString()");
        return new SerializationProxyV2(jSONObject, this.checksum, this.isImplicit, this.inBackground);
    }

    /* renamed from: a */
    public final boolean mo12452a() {
        return this.isImplicit;
    }

    /* renamed from: b */
    public final JSONObject mo12453b() {
        return this.jsonObject;
    }

    /* renamed from: c */
    public final String mo12454c() {
        return this.name;
    }

    /* renamed from: d */
    public final boolean mo12455d() {
        if (this.checksum == null) {
            return true;
        }
        String jSONObject = this.jsonObject.toString();
        C24362h.m61210e(jSONObject, "jsonObject.toString()");
        return C24362h.m61206a(C2314a.m6182a(jSONObject), this.checksum);
    }

    /* renamed from: e */
    public final boolean mo12456e() {
        return this.isImplicit;
    }

    public final String toString() {
        return C13555b.m33971j(new Object[]{this.jsonObject.optString("_eventName"), Boolean.valueOf(this.isImplicit), this.jsonObject.toString()}, 3, "\"%s\", implicit: %b, json: %s", "java.lang.String.format(format, *args)");
    }

    public AppEvent(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.jsonObject = jSONObject;
        this.isImplicit = z;
        String optString = jSONObject.optString("_eventName");
        C24362h.m61210e(optString, "jsonObject.optString(Constants.EVENT_NAME_EVENT_KEY)");
        this.name = optString;
        this.checksum = str2;
        this.inBackground = z2;
    }
}
