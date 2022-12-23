package p692ny;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.appboy.configuration.AppboyConfigurationProvider;
import com.appboy.models.outgoing.FacebookUser;
import com.moovit.app.general.settings.notifications.UserDeliverySchedule;
import com.moovit.app.general.settings.notifications.UserNotificationSetting;
import com.moovit.app.useraccount.manager.UserAccountManager;
import com.moovit.app.useraccount.providers.ConnectProvider;
import com.moovit.itinerary.C16080a;
import com.moovit.location.C16202a;
import com.moovit.transit.TransitType;
import com.moovit.tripplanner.TripPlannerTransportType;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.common.MVRouteType;
import com.tranzmate.moovit.protocol.tripplanner.MVTripPlanTransportOptionPref;
import f10.C16935f;
import java.io.BufferedInputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.TreeMap;
import p172m9.C5720b;
import p377ay.C13547a;
import p377ay.C13550c;
import p435de.C16596f;
import p527gy.C17259d;
import p527gy.C17264g;
import p734ps.C18977e;
import p786rz.C19387a;
import p824tp.C19722a0;
import p824tp.C19728f;
import p977zz.C20927a0;
import p977zz.C20930c;
import p977zz.C20934d0;
import p977zz.C20943i;
import p977zz.C20964s0;
import v90.C13187a;

/* renamed from: ny.a */
public final class C18646a {

    /* renamed from: ny.a$a */
    public static /* synthetic */ class C18647a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f47513a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f47514b;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                com.moovit.tripplanner.TripPlannerRouteType[] r0 = com.moovit.tripplanner.TripPlannerRouteType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47514b = r0
                r1 = 1
                com.moovit.tripplanner.TripPlannerRouteType r2 = com.moovit.tripplanner.TripPlannerRouteType.FASTEST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f47514b     // Catch:{ NoSuchFieldError -> 0x001d }
                com.moovit.tripplanner.TripPlannerRouteType r3 = com.moovit.tripplanner.TripPlannerRouteType.LEAST_TRANSFERS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f47514b     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.moovit.tripplanner.TripPlannerRouteType r4 = com.moovit.tripplanner.TripPlannerRouteType.LEAST_WALKING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                com.moovit.app.useraccount.providers.ConnectProvider[] r3 = com.moovit.app.useraccount.providers.ConnectProvider.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f47513a = r3
                com.moovit.app.useraccount.providers.ConnectProvider r4 = com.moovit.app.useraccount.providers.ConnectProvider.FACEBOOK     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f47513a     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.moovit.app.useraccount.providers.ConnectProvider r3 = com.moovit.app.useraccount.providers.ConnectProvider.GOOGLE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f47513a     // Catch:{ NoSuchFieldError -> 0x004d }
                com.moovit.app.useraccount.providers.ConnectProvider r1 = com.moovit.app.useraccount.providers.ConnectProvider.MOOVIT     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p692ny.C18646a.C18647a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static Intent m45603a(Context context, C19722a0 a0Var, UserAccountManager userAccountManager, C13187a aVar) {
        if (!C5720b.m14071v(userAccountManager)) {
            return null;
        }
        String str = userAccountManager.mo46575f().mo49805e().f44606e;
        return Intent.createChooser(C20927a0.m49009d(context.getString(R.string.support_email_subject), m45608f(context, a0Var, userAccountManager, aVar, (String) null), new String[]{str}), context.getText(R.string.send_email_chooser_hint));
    }

    /* renamed from: b */
    public static String m45604b(boolean z) {
        return z ? "True" : "False";
    }

    /* renamed from: c */
    public static String m45605c(long j) {
        if (j < 0) {
            return "None";
        }
        return String.format(Locale.ENGLISH, "%.2f MB", new Object[]{Double.valueOf(((double) j) / 1048576.0d)});
    }

    /* renamed from: d */
    public static String m45606d(Set<TripPlannerTransportType> set) {
        ArrayList arrayList = new ArrayList(set.size());
        for (TripPlannerTransportType next : set) {
            MVRouteType y = C16080a.m40969y(next);
            if (y != null) {
                arrayList.add(y.name());
            }
            MVTripPlanTransportOptionPref z = C16080a.m40970z(next);
            if (z != null) {
                arrayList.add(z.name());
            }
        }
        return C20964s0.m49100r(", ", arrayList);
    }

    @SuppressLint({"NewApi"})
    /* renamed from: e */
    public static long[] m45607e(String str) {
        long[] jArr = {-1, -1};
        try {
            StatFs statFs = new StatFs(str);
            if (C20943i.m49051d(18)) {
                jArr[0] = statFs.getTotalBytes();
            } else {
                jArr[0] = (long) (statFs.getBlockCount() * statFs.getBlockSize());
            }
            if (C20943i.m49051d(18)) {
                jArr[1] = statFs.getAvailableBytes();
            } else {
                jArr[1] = (long) (statFs.getAvailableBlocks() * statFs.getBlockSize());
            }
        } catch (Exception unused) {
        }
        return jArr;
    }

    @SuppressLint({"NewApi", "MissingPermission"})
    /* renamed from: f */
    public static String m45608f(Context context, C19722a0 a0Var, UserAccountManager userAccountManager, C13187a aVar, String str) {
        C17259d dVar;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        Locale locale;
        String str14;
        String str15;
        boolean z;
        String typeName;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        int i;
        String str24;
        C13547a aVar2;
        Context context2 = context;
        UserAccountManager userAccountManager2 = userAccountManager;
        try {
            String str25 = a0Var.f50160a.f32925a;
            C17264g a = C17264g.m43277a(context);
            synchronized (a) {
                dVar = a.f44629b;
            }
            String format = String.format("%s %s", new Object[]{dVar.f44602a, dVar.f44603b});
            if (userAccountManager2 == null) {
                str2 = "Unknown";
            } else if (!userAccountManager.mo46576g()) {
                str2 = "None";
            } else {
                C13550c cVar = userAccountManager2.f40567b;
                synchronized (cVar) {
                    aVar2 = cVar.f33494b;
                }
                ConnectProvider connectProvider = aVar2.f33491b;
                int i2 = C18647a.f47513a[connectProvider.ordinal()];
                if (i2 == 1) {
                    str2 = "Facebook";
                } else if (i2 == 2) {
                    str2 = "Google";
                } else if (i2 != 3) {
                    str2 = connectProvider.toString();
                } else {
                    str2 = "Email";
                }
            }
            if (C20964s0.m49090h(str)) {
                str3 = "None";
            } else {
                str3 = str;
            }
            C19728f a2 = C19728f.m47195a(context.getApplicationContext());
            if (a2 == null) {
                str4 = "None";
            } else {
                str4 = a2.f50165a.f16126a.mo19751c();
            }
            if (a2 == null) {
                str5 = "None";
            } else {
                str5 = a2.f50165a.f16129d;
            }
            if (a2 == null) {
                str6 = "None";
            } else {
                List<TransitType> a3 = a2.f50165a.mo20299a();
                ArrayList arrayList = new ArrayList(a3.size());
                for (TransitType transitType : a3) {
                    MVRouteType findByValue = MVRouteType.findByValue(transitType.f23757b.f15142b);
                    if (findByValue != null) {
                        arrayList.add(findByValue.name());
                    }
                }
                str6 = C20964s0.m49100r(", ", arrayList);
            }
            if (a2 == null) {
                str7 = "None";
            } else {
                str7 = a2.f50165a.f16140o.mo19751c();
            }
            if (a2 == null) {
                str8 = "None";
            } else {
                str8 = a2.f50165a.f16141p;
            }
            if (a2 == null) {
                str9 = "None";
            } else {
                str9 = a2.f50165a.f16128c;
                if (str9 == null) {
                    str9 = "Default";
                }
            }
            Locale b = C20930c.m49020b(context);
            Object obj = "com.tranzmate";
            String string = context2.getString(R.string.lang_name);
            String language = b.getLanguage();
            String country = b.getCountry();
            String variant = b.getVariant();
            String str26 = Build.MODEL;
            String str27 = Build.MANUFACTURER;
            Object obj2 = "moovit_2751703405";
            StringBuilder sb = new StringBuilder();
            String str28 = str9;
            sb.append(Build.VERSION.RELEASE);
            sb.append("/");
            sb.append(Build.VERSION.SDK_INT);
            String sb2 = sb.toString();
            String str29 = Build.DISPLAY;
            String str30 = Build.DEVICE;
            String str31 = str3;
            Date date = new Date();
            String str32 = str2;
            TimeZone timeZone = TimeZone.getDefault();
            String id = timeZone.getID();
            String displayName = timeZone.getDisplayName();
            String str33 = str8;
            String str34 = str7;
            String str35 = sb2;
            String str36 = string;
            String format2 = new DecimalFormat("#0.0#####").format((double) (((float) timeZone.getRawOffset()) / 3600000.0f));
            String b2 = m45604b(timeZone.inDaylightTime(date));
            Locale locale2 = Locale.ENGLISH;
            String format3 = new SimpleDateFormat("EEE, MMM d, HH:mm", locale2).format(date);
            if (aVar != null) {
                int i3 = C18647a.f47514b[aVar.mo40061b().ordinal()];
                if (i3 == 1) {
                    str11 = "Fastest";
                } else if (i3 == 2) {
                    str11 = "Least transfers";
                } else if (i3 != 3) {
                    str11 = "None";
                } else {
                    str11 = "Least walking";
                }
                str10 = m45606d(aVar.mo40063d());
            } else {
                str11 = "None";
                str10 = str11;
            }
            Location i4 = C16202a.get(context).getPermissionAwareHighAccuracyFrequentUpdates().mo50014i();
            if (i4 != null) {
                locale = locale2;
                StringBuilder sb3 = new StringBuilder();
                str13 = "None";
                sb3.append(String.valueOf(i4.getLatitude()));
                sb3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
                sb3.append(String.valueOf(i4.getLongitude()));
                str14 = sb3.toString();
                str12 = String.valueOf(i4.getAccuracy());
            } else {
                str13 = "None";
                locale = locale2;
                str12 = str13;
                str14 = str12;
            }
            LocationManager locationManager = (LocationManager) context2.getSystemService(FacebookUser.LOCATION_OUTER_OBJECT_KEY);
            String str37 = str14;
            String r = C20964s0.m49100r(", ", locationManager.getAllProviders());
            String r2 = C20964s0.m49100r(", ", locationManager.getProviders(true));
            boolean a4 = C20934d0.m49030a(context);
            boolean b3 = C20934d0.m49031b(context);
            if (a4 && b3) {
                str15 = "ACCESS_COARSE_LOCATION, ACCESS_FINE_LOCATION";
            } else if (a4) {
                str15 = "ACCESS_COARSE_LOCATION";
            } else if (b3) {
                str15 = "ACCESS_FINE_LOCATION";
            } else {
                str15 = str13;
            }
            TreeMap b4 = C18977e.m46090a(context).mo51488b();
            String str38 = str15;
            UserDeliverySchedule c = C18977e.m46090a(context).mo51489c();
            if (C16935f.m42759b(context) != null) {
                z = true;
            } else {
                z = false;
            }
            String valueOf = String.valueOf(z);
            String string2 = context2.getString(c.name);
            String valueOf2 = String.valueOf(b4.get(UserNotificationSetting.PushNotificationNewsAndUpdate));
            String valueOf3 = String.valueOf(b4.get(UserNotificationSetting.PushNotificationMyFavorite));
            String valueOf4 = String.valueOf(b4.get(UserNotificationSetting.PushNotificationServiceAlert));
            String networkOperatorName = ((TelephonyManager) context2.getSystemService("phone")).getNetworkOperatorName();
            String str39 = valueOf4;
            ConnectivityManager connectivityManager = (ConnectivityManager) context2.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                str16 = networkOperatorName;
                typeName = str13;
            } else {
                typeName = activeNetworkInfo.getTypeName();
                str16 = networkOperatorName;
            }
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(0);
            String b5 = m45604b(false);
            if (networkInfo != null) {
                b5 = m45604b(true);
                String b6 = m45604b(networkInfo.isAvailable());
                str18 = m45604b(networkInfo.isConnected());
                str19 = m45604b(networkInfo.isRoaming());
                str17 = b6;
            } else {
                str19 = b5;
                str18 = str19;
                str17 = str18;
            }
            NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(1);
            String b7 = m45604b(false);
            if (networkInfo2 != null) {
                String b8 = m45604b(true);
                str20 = m45604b(networkInfo2.isAvailable());
                String str40 = b8;
                b7 = m45604b(networkInfo2.isConnected());
                str21 = str40;
            } else {
                str21 = b7;
                str20 = str21;
            }
            String str41 = str20;
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            String str42 = str21;
            StringBuilder sb4 = new StringBuilder();
            String str43 = r2;
            sb4.append(displayMetrics.widthPixels);
            sb4.append("x");
            sb4.append(displayMetrics.heightPixels);
            String sb5 = sb4.toString();
            String valueOf5 = String.valueOf(displayMetrics.densityDpi);
            String valueOf6 = String.valueOf(displayMetrics.density);
            String valueOf7 = String.valueOf(displayMetrics.xdpi);
            String valueOf8 = String.valueOf(displayMetrics.ydpi);
            String str44 = valueOf7;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(memoryInfo);
            if (C20943i.m49051d(16)) {
                str23 = str29;
                str22 = m45605c(memoryInfo.totalMem);
            } else {
                str23 = str29;
                str22 = str13;
            }
            String c2 = m45605c(memoryInfo.availMem);
            String b9 = m45604b(memoryInfo.lowMemory);
            Runtime runtime = Runtime.getRuntime();
            String c3 = m45605c(runtime.maxMemory());
            String c4 = m45605c(runtime.totalMemory());
            String c5 = m45605c(runtime.freeMemory());
            String c6 = m45605c(runtime.totalMemory() - runtime.freeMemory());
            String valueOf9 = String.valueOf(runtime.availableProcessors());
            long[] e = m45607e(Environment.getDataDirectory().getAbsolutePath());
            String c7 = m45605c(e[0]);
            String c8 = m45605c(e[1]);
            long[] e2 = m45607e(Environment.getExternalStorageDirectory().getAbsolutePath());
            String c9 = m45605c(e2[0]);
            String c11 = m45605c(e2[1]);
            String str45 = valueOf9;
            String str46 = b9;
            Intent registerReceiver = context2.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int i5 = -1;
            if (registerReceiver == null) {
                i = -1;
            } else {
                i = registerReceiver.getIntExtra("level", -1);
            }
            if (registerReceiver == null) {
                str24 = c2;
            } else {
                str24 = c2;
                i5 = registerReceiver.getIntExtra("scale", -1);
            }
            return String.format(locale, new String(C19387a.m46672d(new BufferedInputStream(context.getResources().openRawResource(R.raw.system_info))), C20964s0.f52719b), new Object[]{str25, format, "5.108.1.564", str4, str5, str6, str36, language, country, variant, str26, str27, "Android", str35, str23, str30, id, displayName, format2, b2, format3, str11, str10, str37, r, str43, str13, str16, typeName, b5, str17, str18, str19, str42, str41, b7, sb5, valueOf5, valueOf6, str44, valueOf8, str22, str24, str46, c3, c4, c5, c6, str45, c7, c8, c9, c11, i + "/" + i5, str38, str13, str13, str13, str12, valueOf, str34, str33, string2, valueOf2, valueOf3, str39, str32, str31, str28, obj2, obj});
        } catch (Exception e3) {
            C16596f.m42113a().mo49364c(new Exception("Failed to generate system info template", e3));
            return "";
        } catch (Throwable th) {
            throw th;
        }
    }
}
