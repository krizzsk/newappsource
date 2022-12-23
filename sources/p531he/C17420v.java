package p531he;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import p577je.C17746a0;
import p577je.C17782b0;
import p577je.C17803n;
import p577je.C17805o;
import p577je.C17809q;
import p577je.C17811r;
import p720pe.C18917a;
import p720pe.C18919c;
import p720pe.C18920d;

/* renamed from: he.v */
public final class C17420v {

    /* renamed from: e */
    public static final HashMap f44865e;

    /* renamed from: f */
    public static final String f44866f = String.format(Locale.US, "Crashlytics Android SDK/%s", new Object[]{"18.2.13"});

    /* renamed from: a */
    public final Context f44867a;

    /* renamed from: b */
    public final C17390b0 f44868b;

    /* renamed from: c */
    public final C17387a f44869c;

    /* renamed from: d */
    public final C18919c f44870d;

    static {
        HashMap hashMap = new HashMap();
        f44865e = hashMap;
        C13715c.m34248n(5, hashMap, "armeabi", 6, "armeabi-v7a", 9, "arm64-v8a", 0, "x86");
        hashMap.put("x86_64", 1);
    }

    public C17420v(Context context, C17390b0 b0Var, C17387a aVar, C18917a aVar2) {
        this.f44867a = context;
        this.f44868b = b0Var;
        this.f44869c = aVar;
        this.f44870d = aVar2;
    }

    /* renamed from: c */
    public static C17805o m43456c(C18920d dVar, int i) {
        String str = (String) dVar.f48160b;
        String str2 = (String) dVar.f48159a;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) dVar.f48161c;
        int i2 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        C18920d dVar2 = (C18920d) dVar.f48162d;
        if (i >= 8) {
            C18920d dVar3 = dVar2;
            while (dVar3 != null) {
                dVar3 = (C18920d) dVar3.f48162d;
                i2++;
            }
        }
        C17805o.C17806a aVar = new C17805o.C17806a();
        if (str != null) {
            aVar.f45718a = str;
            aVar.f45719b = str2;
            aVar.f45720c = new C17782b0<>(m43457d(stackTraceElementArr, 4));
            aVar.f45722e = Integer.valueOf(i2);
            if (dVar2 != null && i2 == 0) {
                aVar.f45721d = m43456c(dVar2, i + 1);
            }
            return aVar.mo50365a();
        }
        throw new NullPointerException("Null type");
    }

    /* renamed from: d */
    public static C17782b0 m43457d(StackTraceElement[] stackTraceElementArr, int i) {
        long j;
        ArrayList arrayList = new ArrayList();
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (i2 < length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            C17811r.C17812a aVar = new C17811r.C17812a();
            aVar.f45744e = Integer.valueOf(i);
            long j2 = 0;
            if (stackTraceElement.isNativeMethod()) {
                j = Math.max((long) stackTraceElement.getLineNumber(), 0);
            } else {
                j = 0;
            }
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                j2 = (long) stackTraceElement.getLineNumber();
            }
            aVar.f45740a = Long.valueOf(j);
            if (str != null) {
                aVar.f45741b = str;
                aVar.f45742c = fileName;
                aVar.f45743d = Long.valueOf(j2);
                arrayList.add(aVar.mo50377a());
                i2++;
            } else {
                throw new NullPointerException("Null symbol");
            }
        }
        return new C17782b0(arrayList);
    }

    /* renamed from: e */
    public static C17809q m43458e(Thread thread, StackTraceElement[] stackTraceElementArr, int i) {
        C17809q.C17810a aVar = new C17809q.C17810a();
        String name = thread.getName();
        if (name != null) {
            aVar.f45732a = name;
            aVar.f45733b = Integer.valueOf(i);
            aVar.f45734c = new C17782b0<>(m43457d(stackTraceElementArr, i));
            return aVar.mo50373a();
        }
        throw new NullPointerException("Null name");
    }

    /* renamed from: a */
    public final C17782b0<C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a> mo49888a() {
        C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a[] aVarArr = new C17746a0.C17753e.C17759d.C17760a.C17762b.C17763a[1];
        C17803n.C17804a aVar = new C17803n.C17804a();
        aVar.f45709a = 0L;
        aVar.f45710b = 0L;
        C17387a aVar2 = this.f44869c;
        String str = aVar2.f44787d;
        if (str != null) {
            aVar.f45711c = str;
            aVar.f45712d = aVar2.f44785b;
            aVarArr[0] = aVar.mo50361a();
            return new C17782b0<>(Arrays.asList(aVarArr));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0051 A[ADDED_TO_REGION] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p577je.C17813s mo49889b(int r14) {
        /*
            r13 = this;
            android.content.Context r0 = r13.f44867a
            r1 = 1
            r2 = 0
            r3 = 2
            r4 = 0
            android.content.IntentFilter r5 = new android.content.IntentFilter     // Catch:{ IllegalStateException -> 0x0042 }
            java.lang.String r6 = "android.intent.action.BATTERY_CHANGED"
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0042 }
            android.content.Intent r0 = r0.registerReceiver(r4, r5)     // Catch:{ IllegalStateException -> 0x0042 }
            if (r0 == 0) goto L_0x0043
            java.lang.String r5 = "status"
            r6 = -1
            int r5 = r0.getIntExtra(r5, r6)     // Catch:{ IllegalStateException -> 0x0042 }
            if (r5 != r6) goto L_0x001d
            goto L_0x0023
        L_0x001d:
            if (r5 == r3) goto L_0x0025
            r7 = 5
            if (r5 != r7) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r5 = 0
            goto L_0x0026
        L_0x0025:
            r5 = 1
        L_0x0026:
            java.lang.String r7 = "level"
            int r7 = r0.getIntExtra(r7, r6)     // Catch:{ IllegalStateException -> 0x003f }
            java.lang.String r8 = "scale"
            int r0 = r0.getIntExtra(r8, r6)     // Catch:{ IllegalStateException -> 0x003f }
            if (r7 == r6) goto L_0x0040
            if (r0 != r6) goto L_0x0037
            goto L_0x0040
        L_0x0037:
            float r6 = (float) r7     // Catch:{ IllegalStateException -> 0x003f }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x003f }
            float r6 = r6 / r0
            java.lang.Float r0 = java.lang.Float.valueOf(r6)     // Catch:{ IllegalStateException -> 0x003f }
            goto L_0x0045
        L_0x003f:
        L_0x0040:
            r0 = r4
            goto L_0x0045
        L_0x0042:
        L_0x0043:
            r0 = r4
            r5 = 0
        L_0x0045:
            if (r0 == 0) goto L_0x004f
            double r6 = r0.doubleValue()
            java.lang.Double r4 = java.lang.Double.valueOf(r6)
        L_0x004f:
            if (r5 == 0) goto L_0x0065
            if (r0 != 0) goto L_0x0054
            goto L_0x0065
        L_0x0054:
            float r0 = r0.floatValue()
            double r5 = (double) r0
            r7 = 4607092346807469998(0x3fefae147ae147ae, double:0.99)
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0063
            goto L_0x0066
        L_0x0063:
            r3 = 3
            goto L_0x0066
        L_0x0065:
            r3 = 1
        L_0x0066:
            android.content.Context r0 = r13.f44867a
            boolean r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35971i()
            if (r5 == 0) goto L_0x006f
            goto L_0x0080
        L_0x006f:
            java.lang.String r5 = "sensor"
            java.lang.Object r0 = r0.getSystemService(r5)
            android.hardware.SensorManager r0 = (android.hardware.SensorManager) r0
            r5 = 8
            android.hardware.Sensor r0 = r0.getDefaultSensor(r5)
            if (r0 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r1 = 0
        L_0x0081:
            long r5 = com.google.firebase.crashlytics.internal.common.CommonUtils.m35969g()
            android.content.Context r0 = r13.f44867a
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo
            r2.<init>()
            java.lang.String r7 = "activity"
            java.lang.Object r0 = r0.getSystemService(r7)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r0.getMemoryInfo(r2)
            long r7 = r2.availMem
            long r5 = r5 - r7
            java.io.File r0 = android.os.Environment.getDataDirectory()
            java.lang.String r0 = r0.getPath()
            android.os.StatFs r2 = new android.os.StatFs
            r2.<init>(r0)
            int r0 = r2.getBlockSize()
            long r7 = (long) r0
            int r0 = r2.getBlockCount()
            long r9 = (long) r0
            long r9 = r9 * r7
            int r0 = r2.getAvailableBlocks()
            long r11 = (long) r0
            long r7 = r7 * r11
            long r9 = r9 - r7
            je.s$a r0 = new je.s$a
            r0.<init>()
            r0.f45751a = r4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.f45752b = r2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.f45753c = r1
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r0.f45754d = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r5)
            r0.f45755e = r14
            java.lang.Long r14 = java.lang.Long.valueOf(r9)
            r0.f45756f = r14
            je.s r14 = r0.mo50381a()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p531he.C17420v.mo49889b(int):je.s");
    }
}
