package p531he;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.datatransport.Priority;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.settings.C14454a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p054d0.C4291k0;
import p236r8.C6266c;
import p237r9.C6268a;
import p237r9.C6269b;
import p247s6.C6478c;
import p250s9.C6488a;
import p275u9.C6756w;
import p555ie.C17579b;
import p555ie.C17580c;
import p555ie.C17590i;
import p577je.C17746a0;
import p577je.C17782b0;
import p577je.C17783c;
import p577je.C17789d;
import p577je.C17798k;
import p577je.C17800l;
import p577je.C17802m;
import p577je.C17805o;
import p577je.C17807p;
import p577je.C17815t;
import p601ke.C18028a;
import p648me.C18364b;
import p648me.C18365c;
import p672ne.C18539a;
import p672ne.C18540b;
import p672ne.C18541c;
import p720pe.C18917a;
import p720pe.C18920d;

/* renamed from: he.e0 */
public final class C17397e0 {

    /* renamed from: a */
    public final C17420v f44810a;

    /* renamed from: b */
    public final C18364b f44811b;

    /* renamed from: c */
    public final C18539a f44812c;

    /* renamed from: d */
    public final C17580c f44813d;

    /* renamed from: e */
    public final C17590i f44814e;

    public C17397e0(C17420v vVar, C18364b bVar, C18539a aVar, C17580c cVar, C17590i iVar) {
        this.f44810a = vVar;
        this.f44811b = bVar;
        this.f44812c = aVar;
        this.f44813d = cVar;
        this.f44814e = iVar;
    }

    /* renamed from: a */
    public static C17798k m43445a(C17798k kVar, C17580c cVar, C17590i iVar) {
        Map unmodifiableMap;
        Map unmodifiableMap2;
        C17798k.C17799a aVar = new C17798k.C17799a(kVar);
        String b = cVar.f45209b.mo50031b();
        if (b != null) {
            aVar.f45689e = new C17815t(b);
        }
        C17579b reference = iVar.f45236d.f45239a.getReference();
        synchronized (reference) {
            unmodifiableMap = Collections.unmodifiableMap(new HashMap(reference.f45204a));
        }
        ArrayList c = m43447c(unmodifiableMap);
        C17579b reference2 = iVar.f45237e.f45239a.getReference();
        synchronized (reference2) {
            unmodifiableMap2 = Collections.unmodifiableMap(new HashMap(reference2.f45204a));
        }
        ArrayList c2 = m43447c(unmodifiableMap2);
        if (!c.isEmpty() || !c2.isEmpty()) {
            C17800l.C17801a f = kVar.f45682c.mo50232f();
            f.f45696b = new C17782b0<>(c);
            f.f45697c = new C17782b0<>(c2);
            aVar.f45687c = f.mo50354a();
        }
        return aVar.mo50350a();
    }

    /* renamed from: b */
    public static C17397e0 m43446b(Context context, C17390b0 b0Var, C18365c cVar, C17387a aVar, C17580c cVar2, C17590i iVar, C18917a aVar2, C14454a aVar3, C6478c cVar3) {
        C17420v vVar = new C17420v(context, b0Var, aVar, aVar2);
        C18364b bVar = new C18364b(cVar, aVar3);
        C18028a aVar4 = C18539a.f47201b;
        C6756w.m15897b(context);
        return new C17397e0(vVar, bVar, new C18539a(new C18541c(C6756w.m15896a().mo22929c(new C6488a(C18539a.f47202c, C18539a.f47203d)).mo22261a("FIREBASE_CRASHLYTICS_REPORT", new C6269b("json"), C18539a.f47204e), aVar3.f36510h.get(), cVar3)), cVar2, iVar);
    }

    /* renamed from: c */
    public static ArrayList m43447c(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            if (str != null) {
                String str2 = (String) entry.getValue();
                if (str2 != null) {
                    arrayList.add(new C17789d(str, str2));
                } else {
                    throw new NullPointerException("Null value");
                }
            } else {
                throw new NullPointerException("Null key");
            }
        }
        Collections.sort(arrayList, new C6266c(1));
        return arrayList;
    }

    /* renamed from: d */
    public final void mo49871d(Throwable th, Thread thread, String str, String str2, long j, boolean z) {
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        boolean z2;
        Thread thread2 = thread;
        String str3 = str2;
        boolean equals = str3.equals(AppMeasurement.CRASH_ORIGIN);
        C17420v vVar = this.f44810a;
        int i = vVar.f44867a.getResources().getConfiguration().orientation;
        C18920d dVar = new C18920d(th, vVar.f44870d);
        C17798k.C17799a aVar = new C17798k.C17799a();
        aVar.f45686b = str3;
        aVar.f45685a = Long.valueOf(j);
        String str4 = vVar.f44869c.f44787d;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) vVar.f44867a.getSystemService("activity")).getRunningAppProcesses();
        Boolean bool = null;
        if (runningAppProcesses != null) {
            Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                runningAppProcessInfo = it.next();
                if (runningAppProcessInfo.processName.equals(str4)) {
                    break;
                }
            }
        }
        runningAppProcessInfo = null;
        if (runningAppProcessInfo != null) {
            if (runningAppProcessInfo.importance != 100) {
                z2 = true;
            } else {
                z2 = false;
            }
            bool = Boolean.valueOf(z2);
        }
        Boolean bool2 = bool;
        Integer valueOf = Integer.valueOf(i);
        ArrayList arrayList = new ArrayList();
        arrayList.add(C17420v.m43458e(thread2, (StackTraceElement[]) dVar.f48161c, 4));
        if (z) {
            for (Map.Entry next : Thread.getAllStackTraces().entrySet()) {
                Thread thread3 = (Thread) next.getKey();
                if (!thread3.equals(thread2)) {
                    arrayList.add(C17420v.m43458e(thread3, vVar.f44870d.mo50438c((StackTraceElement[]) next.getValue()), 0));
                }
            }
        }
        C17782b0 b0Var = new C17782b0(arrayList);
        C17805o c = C17420v.m43456c(dVar, 0);
        C17807p.C17808a aVar2 = new C17807p.C17808a();
        aVar2.f45726a = "0";
        aVar2.f45727b = "0";
        aVar2.f45728c = 0L;
        String str5 = "";
        C17802m mVar = new C17802m(b0Var, c, (C17746a0.C17747a) null, aVar2.mo50369a(), vVar.mo49888a());
        if (valueOf == null) {
            str5 = C25541a.m63881k(str5, " uiOrientation");
        }
        if (str5.isEmpty()) {
            aVar.f45687c = new C17800l(mVar, (C17782b0) null, (C17782b0) null, bool2, valueOf.intValue());
            aVar.f45688d = vVar.mo49889b(i);
            this.f44811b.mo50829c(m43445a(aVar.mo50350a(), this.f44813d, this.f44814e), str, equals);
            return;
        }
        throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str5));
    }

    /* renamed from: e */
    public final void mo49872e(String str, List<ApplicationExitInfo> list, C17580c cVar, C17590i iVar) {
        String str2;
        ApplicationExitInfo applicationExitInfo;
        String str3 = str;
        long lastModified = this.f44811b.f46818b.mo50830a(str3, "start-time").lastModified();
        Iterator<ApplicationExitInfo> it = list.iterator();
        while (true) {
            str2 = null;
            if (!it.hasNext()) {
                break;
            }
            applicationExitInfo = it.next();
            if (applicationExitInfo.getTimestamp() >= lastModified) {
                if (applicationExitInfo.getReason() == 6) {
                    break;
                }
            } else {
                break;
            }
        }
        applicationExitInfo = null;
        if (applicationExitInfo != null) {
            C17420v vVar = this.f44810a;
            boolean z = false;
            try {
                InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int read = traceInputStream.read(bArr);
                        if (read == -1) {
                            break;
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                    str2 = byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
                }
            } catch (IOException e) {
                applicationExitInfo.toString();
                e.toString();
            }
            C17783c.C17784a aVar = new C17783c.C17784a();
            aVar.f45622d = Integer.valueOf(applicationExitInfo.getImportance());
            String processName = applicationExitInfo.getProcessName();
            if (processName != null) {
                aVar.f45620b = processName;
                aVar.f45621c = Integer.valueOf(applicationExitInfo.getReason());
                aVar.f45625g = Long.valueOf(applicationExitInfo.getTimestamp());
                aVar.f45619a = Integer.valueOf(applicationExitInfo.getPid());
                aVar.f45623e = Long.valueOf(applicationExitInfo.getPss());
                aVar.f45624f = Long.valueOf(applicationExitInfo.getRss());
                aVar.f45626h = str2;
                C17783c a = aVar.mo50302a();
                int i = vVar.f44867a.getResources().getConfiguration().orientation;
                C17798k.C17799a aVar2 = new C17798k.C17799a();
                aVar2.f45686b = "anr";
                aVar2.f45685a = Long.valueOf(a.f45617g);
                if (a.f45614d != 100) {
                    z = true;
                }
                Boolean valueOf = Boolean.valueOf(z);
                Integer valueOf2 = Integer.valueOf(i);
                C17807p.C17808a aVar3 = new C17807p.C17808a();
                aVar3.f45726a = "0";
                aVar3.f45727b = "0";
                aVar3.f45728c = 0L;
                String str4 = "";
                C17802m mVar = new C17802m((C17782b0) null, (C17746a0.C17753e.C17759d.C17760a.C17762b.C17765b) null, a, aVar3.mo50369a(), vVar.mo49888a());
                if (valueOf2 == null) {
                    str4 = C25541a.m63881k(str4, " uiOrientation");
                }
                if (str4.isEmpty()) {
                    aVar2.f45687c = new C17800l(mVar, (C17782b0) null, (C17782b0) null, valueOf, valueOf2.intValue());
                    aVar2.f45688d = vVar.mo49889b(i);
                    this.f44811b.mo50829c(m43445a(aVar2.mo50350a(), cVar, iVar), str3, true);
                    return;
                }
                throw new IllegalStateException(C25541a.m63881k("Missing required properties:", str4));
            }
            throw new NullPointerException("Null processName");
        }
    }

    /* renamed from: f */
    public final Task mo49873f(String str, Executor executor) {
        boolean z;
        TaskCompletionSource taskCompletionSource;
        ArrayList b = this.f44811b.mo50828b();
        ArrayList arrayList = new ArrayList();
        Iterator it = b.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            try {
                C18028a aVar = C18364b.f46814f;
                String d = C18364b.m45213d(file);
                aVar.getClass();
                arrayList.add(new C17389b(C18028a.m44707g(d), file.getName(), file));
            } catch (IOException unused) {
                Objects.toString(file);
                file.delete();
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C17421w wVar = (C17421w) it2.next();
            if (str == null || str.equals(wVar.mo49859c())) {
                C18539a aVar2 = this.f44812c;
                boolean z2 = true;
                if (str != null) {
                    z = true;
                } else {
                    z = false;
                }
                C18541c cVar = aVar2.f47205a;
                synchronized (cVar.f47213e) {
                    taskCompletionSource = new TaskCompletionSource();
                    if (z) {
                        ((AtomicInteger) cVar.f47216h.f20214a).getAndIncrement();
                        if (cVar.f47213e.size() >= cVar.f47212d) {
                            z2 = false;
                        }
                        if (z2) {
                            wVar.mo49859c();
                            cVar.f47213e.size();
                            cVar.f47214f.execute(new C18541c.C18542a(wVar, taskCompletionSource));
                            wVar.mo49859c();
                            taskCompletionSource.trySetResult(wVar);
                        } else {
                            cVar.mo50950a();
                            wVar.mo49859c();
                            ((AtomicInteger) cVar.f47216h.f20215b).getAndIncrement();
                            taskCompletionSource.trySetResult(wVar);
                        }
                    } else {
                        wVar.mo49859c();
                        cVar.f47215g.mo22260b(new C6268a(wVar.mo49857a(), Priority.HIGHEST), new C18540b(0, taskCompletionSource, wVar));
                    }
                }
                arrayList2.add(taskCompletionSource.getTask().continueWith(executor, new C4291k0(this, 0)));
            }
        }
        return Tasks.whenAll((Collection<? extends Task<?>>) arrayList2);
    }
}
