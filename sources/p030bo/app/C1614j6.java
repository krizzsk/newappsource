package p030bo.app;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import com.appboy.support.AppboyFileUtils;
import com.appboy.support.AppboyLogger;
import com.appboy.support.IntentUtils;
import com.appboy.support.StringUtils;
import com.braze.support.WebContentUtils;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p001a0.C0017h;
import p988j$.util.concurrent.ConcurrentHashMap;

/* renamed from: bo.app.j6 */
public class C1614j6 implements C1580f6 {

    /* renamed from: e */
    public static final String f5762e = AppboyLogger.getBrazeLogTag(C1614j6.class);

    /* renamed from: a */
    public final Context f5763a;

    /* renamed from: b */
    public final SharedPreferences f5764b;

    /* renamed from: c */
    public final Map<String, String> f5765c;

    /* renamed from: d */
    public final Map<String, String> f5766d = new HashMap();

    /* renamed from: bo.app.j6$a */
    public static /* synthetic */ class C1615a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f5767a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                bo.app.u5[] r0 = p030bo.app.C1704u5.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5767a = r0
                bo.app.u5 r1 = p030bo.app.C1704u5.ZIP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5767a     // Catch:{ NoSuchFieldError -> 0x001d }
                bo.app.u5 r1 = p030bo.app.C1704u5.IMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5767a     // Catch:{ NoSuchFieldError -> 0x0028 }
                bo.app.u5 r1 = p030bo.app.C1704u5.FILE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p030bo.app.C1614j6.C1615a.<clinit>():void");
        }
    }

    public C1614j6(Context context, String str) {
        this.f5763a = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.appboy.storage.triggers.local_assets." + str, 0);
        this.f5764b = sharedPreferences;
        this.f5765c = m4338a(sharedPreferences);
    }

    /* renamed from: a */
    public void mo6151a(List<C1710v4> list) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        m4342a(list, (Set<C1639m6>) hashSet, (Set<String>) hashSet2);
        SharedPreferences.Editor edit = this.f5764b.edit();
        m4340a(edit, this.f5765c, hashSet2, this.f5766d);
        m4341a(mo6162a(), this.f5765c, this.f5766d);
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            C1639m6 m6Var = (C1639m6) it.next();
            String b = m6Var.mo6225b();
            if (this.f5765c.containsKey(b)) {
                String str = f5762e;
                AppboyLogger.m5448d(str, "Local assets already contains remote path string: " + b);
            } else {
                try {
                    String a = mo6163a(m6Var);
                    if (!StringUtils.isNullOrBlank(a)) {
                        String str2 = f5762e;
                        AppboyLogger.m5448d(str2, "Adding new local path " + a + " for remote path " + b + " to cache.");
                        this.f5765c.put(b, a);
                        edit.putString(b, a);
                        edit.apply();
                    }
                } catch (Exception e) {
                    String str3 = f5762e;
                    AppboyLogger.m5452e(str3, "Failed to add new local path for remote path " + b, e);
                }
            }
        }
    }

    /* renamed from: b */
    public Map<String, String> mo6063b(C1710v4 v4Var) {
        HashMap hashMap = new HashMap();
        if (!v4Var.mo6420m()) {
            String str = f5762e;
            StringBuilder k = C13555b.m33972k("Prefetch is turned off for this triggered action. Not retrieving local asset paths. Action id: ");
            k.append(v4Var.getId());
            AppboyLogger.m5448d(str, k.toString());
            return hashMap;
        }
        for (C1639m6 b : v4Var.mo6415b()) {
            String b2 = b.mo6225b();
            String str2 = this.f5765c.get(b2);
            if (m4343a(str2)) {
                String str3 = f5762e;
                AppboyLogger.m5448d(str3, "Found local asset at path " + str2 + " for remote asset at path: " + b2);
                this.f5766d.put(b2, str2);
                hashMap.put(b2, str2);
            } else {
                String str4 = f5762e;
                AppboyLogger.m5459w(str4, "Could not find local asset for remote path " + b2);
            }
        }
        if (hashMap.isEmpty()) {
            String str5 = f5762e;
            StringBuilder k2 = C13555b.m33972k("No local assets found for action id: ");
            k2.append(v4Var.getId());
            AppboyLogger.m5459w(str5, k2.toString());
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m4339a(Context context) {
        File file = new File(context.getCacheDir(), "ab_triggers");
        String str = f5762e;
        StringBuilder k = C13555b.m33972k("Deleting triggers directory at: ");
        k.append(file.getAbsolutePath());
        AppboyLogger.m5457v(str, k.toString());
        AppboyFileUtils.deleteFileOrDirectory(file);
    }

    /* renamed from: b */
    public static String m4344b(String str) {
        String str2;
        int lastIndexOf;
        Uri parse = Uri.parse(str);
        if (parse != null) {
            String lastPathSegment = parse.getLastPathSegment();
            if (!StringUtils.isNullOrEmpty(lastPathSegment) && (lastIndexOf = lastPathSegment.lastIndexOf(46)) > -1) {
                str2 = lastPathSegment.substring(lastIndexOf);
                String str3 = f5762e;
                AppboyLogger.m5457v(str3, "Using file extension " + str2 + " for remote asset url: " + str);
                return IntentUtils.getRequestCode() + str2;
            }
        }
        str2 = "";
        return IntentUtils.getRequestCode() + str2;
    }

    /* renamed from: a */
    public String mo6163a(C1639m6 m6Var) {
        File a = mo6162a();
        String b = m6Var.mo6225b();
        int i = C1615a.f5767a[m6Var.mo6224a().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                File downloadFileToPath = AppboyFileUtils.downloadFileToPath(a.toString(), b, m4344b(b), (String) null);
                if (downloadFileToPath != null) {
                    Uri fromFile = Uri.fromFile(downloadFileToPath);
                    if (fromFile != null) {
                        String str = f5762e;
                        StringBuilder k = C13555b.m33972k("Storing local triggered action asset at local path ");
                        k.append(fromFile.getPath());
                        k.append(" for remote path ");
                        k.append(b);
                        AppboyLogger.m5453i(str, k.toString());
                        return fromFile.getPath();
                    }
                    String str2 = f5762e;
                    AppboyLogger.m5448d(str2, "Failed to store asset for remote path " + b + ". Not storing local asset");
                }
            } else {
                String str3 = f5762e;
                StringBuilder k2 = C13555b.m33972k("Failed to download local asset for remote path: ");
                k2.append(m6Var.mo6224a());
                AppboyLogger.m5448d(str3, k2.toString());
            }
            return null;
        }
        String localHtmlUrlFromRemoteUrl = WebContentUtils.getLocalHtmlUrlFromRemoteUrl(a, b);
        if (!StringUtils.isNullOrBlank(localHtmlUrlFromRemoteUrl)) {
            String str4 = f5762e;
            AppboyLogger.m5453i(str4, "Storing local triggered action html zip asset at local path " + localHtmlUrlFromRemoteUrl + " for remote path " + b);
            return localHtmlUrlFromRemoteUrl;
        }
        String str5 = f5762e;
        AppboyLogger.m5448d(str5, "Failed to store html zip asset for remote path " + b + ". Not storing local asset");
        return null;
    }

    /* renamed from: a */
    public static void m4341a(File file, Map<String, String> map, Map<String, String> map2) {
        try {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    String path = file2.getPath();
                    if (map.containsValue(path)) {
                        AppboyLogger.m5448d(f5762e, "Asset " + path + " is not obsolete. Not deleting.");
                    } else if (!map2.containsValue(path)) {
                        AppboyLogger.m5448d(f5762e, "Deleting obsolete asset " + path + " from filesystem.");
                        AppboyFileUtils.deleteFileOrDirectory(file2);
                    } else {
                        AppboyLogger.m5448d(f5762e, "Asset " + path + " is being preserved. Not deleting.");
                    }
                }
            }
        } catch (Exception e) {
            AppboyLogger.m5449d(f5762e, "Exception while deleting obsolete assets from filesystem.", (Throwable) e);
        }
    }

    /* renamed from: a */
    public static Map<String, String> m4338a(SharedPreferences sharedPreferences) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Map<String, ?> all = sharedPreferences.getAll();
        if (all != null && !all.isEmpty()) {
            Set<String> keySet = all.keySet();
            if (keySet.isEmpty()) {
                return concurrentHashMap;
            }
            try {
                for (String next : keySet) {
                    String string = sharedPreferences.getString(next, (String) null);
                    if (!StringUtils.isNullOrBlank(string)) {
                        String str = f5762e;
                        AppboyLogger.m5448d(str, "Retrieving trigger local asset path " + string + " from local storage for remote path " + next + ".");
                        concurrentHashMap.put(next, string);
                    }
                }
            } catch (Exception e) {
                AppboyLogger.m5452e(f5762e, "Encountered unexpected exception while parsing stored triggered action local assets.", e);
            }
        }
        return concurrentHashMap;
    }

    /* renamed from: a */
    public static void m4340a(SharedPreferences.Editor editor, Map<String, String> map, Set<String> set, Map<String, String> map2) {
        Iterator it = new HashSet(map.keySet()).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map2.containsKey(str)) {
                String str2 = f5762e;
                AppboyLogger.m5448d(str2, "Not removing local path for remote path " + str + " from cache because it is being preserved until the end of the app run.");
            } else if (!set.contains(str)) {
                String str3 = map.get(str);
                map.remove(str);
                editor.remove(str);
                if (!StringUtils.isNullOrBlank(str3)) {
                    AppboyLogger.m5448d(f5762e, C0017h.m56M("Removing obsolete local path ", str3, " for obsolete remote path ", str, " from cache."));
                    AppboyFileUtils.deleteFileOrDirectory(new File(str3));
                }
            }
        }
        editor.apply();
    }

    /* renamed from: a */
    public static boolean m4343a(String str) {
        return !StringUtils.isNullOrBlank(str) && new File(str).exists();
    }

    /* renamed from: a */
    public static void m4342a(List<C1710v4> list, Set<C1639m6> set, Set<String> set2) {
        for (C1710v4 next : list) {
            if (!next.mo6420m()) {
                String str = f5762e;
                StringBuilder k = C13555b.m33972k("Pre-fetch off for triggered action ");
                k.append(next.getId());
                k.append(". Not pre-fetching assets.");
                AppboyLogger.m5448d(str, k.toString());
            } else {
                for (C1639m6 next2 : next.mo6415b()) {
                    String b = next2.mo6225b();
                    if (!StringUtils.isNullOrBlank(b)) {
                        String str2 = f5762e;
                        StringBuilder k2 = C13555b.m33972k("Received new remote path for triggered action ");
                        k2.append(next.getId());
                        k2.append(" at ");
                        k2.append(b);
                        k2.append(".");
                        AppboyLogger.m5448d(str2, k2.toString());
                        set.add(next2);
                        set2.add(b);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public File mo6162a() {
        return new File(this.f5763a.getCacheDir().getPath() + "/" + "ab_triggers");
    }
}
