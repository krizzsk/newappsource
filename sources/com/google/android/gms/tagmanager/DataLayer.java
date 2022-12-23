package com.google.android.gms.tagmanager;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0016g;
import p988j$.util.concurrent.ConcurrentHashMap;

@VisibleForTesting
public class DataLayer {
    public static final String EVENT_KEY = "event";
    public static final Object OBJECT_NOT_PRESENT = new Object();
    public static final String[] zza = "gtm.lifetime".split("\\.");
    private static final Pattern zzb = Pattern.compile("(\\d+)\\s*([smhd]?)");
    private final ConcurrentHashMap<zzav, Integer> zzc;
    private final Map<String, Object> zzd;
    private final ReentrantLock zze;
    private final LinkedList<Map<String, Object>> zzf;
    private final zzax zzg;
    /* access modifiers changed from: private */
    public final CountDownLatch zzh;

    @VisibleForTesting
    public DataLayer() {
        this(new zzas());
    }

    @VisibleForTesting
    public static List<Object> listOf(Object... objArr) {
        ArrayList arrayList = new ArrayList();
        for (Object add : objArr) {
            arrayList.add(add);
        }
        return arrayList;
    }

    @VisibleForTesting
    public static Map<String, Object> mapOf(Object... objArr) {
        if ((objArr.length & 1) == 0) {
            HashMap hashMap = new HashMap();
            int i = 0;
            while (i < objArr.length) {
                String str = objArr[i];
                if (str instanceof String) {
                    hashMap.put(str, objArr[i + 1]);
                    i += 2;
                } else {
                    String valueOf = String.valueOf(str);
                    throw new IllegalArgumentException(C0016g.m31o(new StringBuilder(valueOf.length() + 21), "key is not a string: ", valueOf));
                }
            }
            return hashMap;
        }
        throw new IllegalArgumentException("expected even number of key-value pairs");
    }

    private final void zzh(Map<String, Object> map, String str, Collection<zzau> collection) {
        String str2;
        for (Map.Entry next : map.entrySet()) {
            if (str.length() == 0) {
                str2 = "";
            } else {
                str2 = ".";
            }
            String str3 = (String) next.getKey();
            String k = C13715c.m34245k(new StringBuilder(str.length() + str2.length() + String.valueOf(str3).length()), str, str2, str3);
            if (next.getValue() instanceof Map) {
                zzh((Map) next.getValue(), k, collection);
            } else if (!k.equals("gtm.lifetime")) {
                collection.add(new zzau(k, next.getValue()));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void zzi(Map<String, Object> map) {
        Long l;
        long j;
        String str;
        String str2;
        String str3;
        String str4;
        this.zze.lock();
        try {
            this.zzf.offer(map);
            if (this.zze.getHoldCount() == 1) {
                int i = 0;
                while (true) {
                    Map poll = this.zzf.poll();
                    if (poll == null) {
                        break;
                    }
                    synchronized (this.zzd) {
                        for (String str5 : poll.keySet()) {
                            zzf(zza(str5, poll.get(str5)), this.zzd);
                        }
                    }
                    for (zzav zza2 : this.zzc.keySet()) {
                        zza2.zza(poll);
                    }
                    i++;
                    if (i > 500) {
                        this.zzf.clear();
                        throw new RuntimeException("Seems like an infinite loop of pushing to the data layer");
                    }
                }
            }
            String[] strArr = zza;
            int length = strArr.length;
            Object obj = map;
            int i2 = 0;
            while (true) {
                l = null;
                if (i2 >= length) {
                    break;
                }
                String str6 = strArr[i2];
                if (!(obj instanceof Map)) {
                    obj = null;
                    break;
                } else {
                    obj = ((Map) obj).get(str6);
                    i2++;
                }
            }
            if (obj != null) {
                String obj2 = obj.toString();
                Matcher matcher = zzb.matcher(obj2);
                if (!matcher.matches()) {
                    String valueOf = String.valueOf(obj2);
                    if (valueOf.length() != 0) {
                        str4 = "unknown _lifetime: ".concat(valueOf);
                    } else {
                        str4 = new String("unknown _lifetime: ");
                    }
                    zzdh.zzb.zzb(str4);
                } else {
                    try {
                        String group = matcher.group(1);
                        Preconditions.checkNotNull(group);
                        j = Long.parseLong(group);
                    } catch (NumberFormatException unused) {
                        String valueOf2 = String.valueOf(obj2);
                        if (valueOf2.length() != 0) {
                            str3 = "illegal number in _lifetime value: ".concat(valueOf2);
                        } else {
                            str3 = new String("illegal number in _lifetime value: ");
                        }
                        zzdh.zzc(str3);
                        j = 0;
                    }
                    if (j <= 0) {
                        String valueOf3 = String.valueOf(obj2);
                        if (valueOf3.length() != 0) {
                            str2 = "non-positive _lifetime: ".concat(valueOf3);
                        } else {
                            str2 = new String("non-positive _lifetime: ");
                        }
                        zzdh.zzb.zzb(str2);
                    } else {
                        String group2 = matcher.group(2);
                        Preconditions.checkNotNull(group2);
                        if (group2.length() == 0) {
                            l = Long.valueOf(j);
                        } else {
                            char charAt = group2.charAt(0);
                            if (charAt == 'd') {
                                l = Long.valueOf(j * 86400000);
                            } else if (charAt == 'h') {
                                l = Long.valueOf(j * 3600000);
                            } else if (charAt == 'm') {
                                l = Long.valueOf(j * 60000);
                            } else if (charAt != 's') {
                                String valueOf4 = String.valueOf(obj2);
                                if (valueOf4.length() != 0) {
                                    str = "unknown units in _lifetime: ".concat(valueOf4);
                                } else {
                                    str = new String("unknown units in _lifetime: ");
                                }
                                zzdh.zzc(str);
                            } else {
                                l = Long.valueOf(j * 1000);
                            }
                        }
                    }
                }
            }
            if (l != null) {
                ArrayList arrayList = new ArrayList();
                zzh(map, "", arrayList);
                this.zzg.zzc(arrayList, l.longValue());
            }
            this.zze.unlock();
        } catch (Throwable th) {
            this.zze.unlock();
            throw th;
        }
    }

    public Object get(String str) {
        synchronized (this.zzd) {
            Object obj = this.zzd;
            for (String str2 : str.split("\\.")) {
                if (!(obj instanceof Map)) {
                    return null;
                }
                obj = ((Map) obj).get(str2);
                if (obj == null) {
                    return null;
                }
            }
            return obj;
        }
    }

    public void push(String str, Object obj) {
        push(zza(str, obj));
    }

    public void pushEvent(String str, Map<String, Object> map) {
        HashMap hashMap = new HashMap(map);
        hashMap.put("event", str);
        push(hashMap);
    }

    public String toString() {
        String sb;
        synchronized (this.zzd) {
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry next : this.zzd.entrySet()) {
                sb2.append(String.format("{\n\tKey: %s\n\tValue: %s\n}\n", new Object[]{next.getKey(), next.getValue()}));
            }
            sb = sb2.toString();
        }
        return sb;
    }

    public final Map<String, Object> zza(String str, Object obj) {
        HashMap hashMap = new HashMap();
        String[] split = str.toString().split("\\.");
        int i = 0;
        HashMap hashMap2 = hashMap;
        while (true) {
            int length = split.length - 1;
            if (i < length) {
                HashMap hashMap3 = new HashMap();
                hashMap2.put(split[i], hashMap3);
                i++;
                hashMap2 = hashMap3;
            } else {
                hashMap2.put(split[length], obj);
                return hashMap;
            }
        }
    }

    public final void zzd(String str) {
        push(str, (Object) null);
        this.zzg.zza(str);
    }

    @VisibleForTesting
    public final void zze(List<Object> list, List<Object> list2) {
        while (list2.size() < list.size()) {
            list2.add((Object) null);
        }
        for (int i = 0; i < list.size(); i++) {
            Object obj = list.get(i);
            if (obj instanceof List) {
                if (!(list2.get(i) instanceof List)) {
                    list2.set(i, new ArrayList());
                }
                Object obj2 = list2.get(i);
                Preconditions.checkNotNull(obj2);
                zze((List) obj, (List) obj2);
            } else if (obj instanceof Map) {
                if (!(list2.get(i) instanceof Map)) {
                    list2.set(i, new HashMap());
                }
                Object obj3 = list2.get(i);
                Preconditions.checkNotNull(obj3);
                zzf((Map) obj, (Map) obj3);
            } else if (obj != OBJECT_NOT_PRESENT) {
                list2.set(i, obj);
            }
        }
    }

    @VisibleForTesting
    public final void zzf(Map<String, Object> map, Map<String, Object> map2) {
        for (String next : map.keySet()) {
            Object obj = map.get(next);
            if (obj instanceof List) {
                if (!(map2.get(next) instanceof List)) {
                    map2.put(next, new ArrayList());
                }
                Object obj2 = map2.get(next);
                Preconditions.checkNotNull(obj2);
                zze((List) obj, (List) obj2);
            } else if (obj instanceof Map) {
                if (!(map2.get(next) instanceof Map)) {
                    map2.put(next, new HashMap());
                }
                Object obj3 = map2.get(next);
                Preconditions.checkNotNull(obj3);
                zzf((Map) obj, (Map) obj3);
            } else {
                map2.put(next, obj);
            }
        }
    }

    public final void zzg(zzav zzav) {
        this.zzc.put(zzav, 0);
    }

    public DataLayer(zzax zzax) {
        this.zzg = zzax;
        this.zzc = new ConcurrentHashMap<>();
        this.zzd = new HashMap();
        this.zze = new ReentrantLock();
        this.zzf = new LinkedList<>();
        this.zzh = new CountDownLatch(1);
        zzax.zzb(new zzat(this));
    }

    public void push(Map<String, Object> map) {
        try {
            this.zzh.await();
        } catch (InterruptedException unused) {
            zzdh.zzc("DataLayer.push: unexpected InterruptedException");
        }
        zzi(map);
    }
}
