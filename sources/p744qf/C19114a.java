package p744qf;

import android.os.Process;
import android.system.Os;
import android.system.OsConstants;
import com.google.firebase.perf.p414v1.C14514d;
import com.google.firebase.perf.util.Timer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import p304x.C7078n;
import p626lf.C18200a;

/* renamed from: qf.a */
public final class C19114a {

    /* renamed from: g */
    public static final C18200a f48588g = C18200a.m44901d();

    /* renamed from: h */
    public static final long f48589h = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a */
    public final ConcurrentLinkedQueue<C14514d> f48590a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    public final ScheduledExecutorService f48591b = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: c */
    public final String f48592c;

    /* renamed from: d */
    public final long f48593d;

    /* renamed from: e */
    public ScheduledFuture f48594e = null;

    /* renamed from: f */
    public long f48595f = -1;

    public C19114a() {
        int myPid = Process.myPid();
        StringBuilder k = C13555b.m33972k("/proc/");
        k.append(Integer.toString(myPid));
        k.append("/stat");
        this.f48592c = k.toString();
        this.f48593d = Os.sysconf(OsConstants._SC_CLK_TCK);
    }

    /* renamed from: a */
    public final synchronized void mo51549a(long j, Timer timer) {
        this.f48595f = j;
        try {
            this.f48594e = this.f48591b.scheduleAtFixedRate(new C7078n(9, this, timer), 0, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            C18200a aVar = f48588g;
            e.getMessage();
            aVar.mo50614f();
        }
        return;
    }

    /* renamed from: b */
    public final C14514d mo51550b(Timer timer) {
        BufferedReader bufferedReader;
        if (timer == null) {
            return null;
        }
        try {
            bufferedReader = new BufferedReader(new FileReader(this.f48592c));
            long b = timer.mo43519b() + timer.f36654b;
            String[] split = bufferedReader.readLine().split(" ");
            long parseLong = Long.parseLong(split[13]);
            long parseLong2 = Long.parseLong(split[15]);
            long parseLong3 = Long.parseLong(split[14]);
            long parseLong4 = Long.parseLong(split[16]);
            C14514d.C14516b w = C14514d.m36162w();
            w.mo43956p();
            C14514d.m36159t((C14514d) w.f36809c, b);
            double d = ((double) (parseLong3 + parseLong4)) / ((double) this.f48593d);
            long j = f48589h;
            long round = Math.round(d * ((double) j));
            w.mo43956p();
            C14514d.m36161v((C14514d) w.f36809c, round);
            long round2 = Math.round((((double) (parseLong + parseLong2)) / ((double) this.f48593d)) * ((double) j));
            w.mo43956p();
            C14514d.m36160u((C14514d) w.f36809c, round2);
            C14514d dVar = (C14514d) w.mo43954m();
            bufferedReader.close();
            return dVar;
        } catch (IOException e) {
            C18200a aVar = f48588g;
            e.getMessage();
            aVar.mo50614f();
            return null;
        } catch (ArrayIndexOutOfBoundsException | NullPointerException | NumberFormatException e2) {
            C18200a aVar2 = f48588g;
            e2.getMessage();
            aVar2.mo50614f();
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
