package p232r4;

import java.util.List;
import p070e4.C4549d;
import p271u4.C6692c;
import p271u4.C6693d;
import p271u4.C6695f;

/* renamed from: r4.c */
public abstract class C6243c<E> extends C6242b implements C6695f, C6692c {

    /* renamed from: d */
    public C6244d f19695d;

    /* renamed from: e */
    public C6693d f19696e = new C6693d(this);

    /* renamed from: f */
    public List<String> f19697f;

    /* renamed from: g */
    public boolean f19698g = false;

    public C6243c() {
        super(0);
    }

    /* renamed from: a */
    public final void mo21722a(String str) {
        this.f19696e.mo21722a(str);
    }

    /* renamed from: b */
    public final void mo20064b(C4549d dVar) {
        this.f19696e.mo20064b(dVar);
    }

    /* renamed from: c */
    public final String mo22242c() {
        List<String> list = this.f19697f;
        if (list == null || list.size() == 0) {
            return null;
        }
        return this.f19697f.get(0);
    }

    /* renamed from: f */
    public final void mo21727f(String str, Throwable th) {
        this.f19696e.mo21727f(str, th);
    }

    public final boolean isStarted() {
        return this.f19698g;
    }

    public void start() {
        this.f19698g = true;
    }

    public void stop() {
        this.f19698g = false;
    }
}
