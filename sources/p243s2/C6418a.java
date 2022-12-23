package p243s2;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: s2.a */
public final class C6418a {

    /* renamed from: e */
    public static final HashMap f20081e = new HashMap();

    /* renamed from: a */
    public final File f20082a;

    /* renamed from: b */
    public final Lock f20083b;

    /* renamed from: c */
    public final boolean f20084c;

    /* renamed from: d */
    public FileChannel f20085d;

    public C6418a(File file, String str, boolean z) {
        Lock lock;
        File file2 = new File(file, C25541a.m63881k(str, ".lck"));
        this.f20082a = file2;
        String absolutePath = file2.getAbsolutePath();
        HashMap hashMap = f20081e;
        synchronized (hashMap) {
            lock = (Lock) hashMap.get(absolutePath);
            if (lock == null) {
                lock = new ReentrantLock();
                hashMap.put(absolutePath, lock);
            }
        }
        this.f20083b = lock;
        this.f20084c = z;
    }

    /* renamed from: a */
    public final void mo22542a() {
        FileChannel fileChannel = this.f20085d;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException unused) {
            }
        }
        this.f20083b.unlock();
    }
}
