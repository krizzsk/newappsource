package p720pe;

import p389bl.C13638d;
import p389bl.C13639e;
import p490fl.C17036d;
import p868vl.C20154a;

/* renamed from: pe.d */
public final class C18920d {

    /* renamed from: a */
    public final Object f48159a;

    /* renamed from: b */
    public final Object f48160b;

    /* renamed from: c */
    public final Object f48161c;

    /* renamed from: d */
    public final Object f48162d;

    public /* synthetic */ C18920d(C13639e eVar, C13638d dVar, C20154a aVar, C17036d dVar2) {
        this.f48159a = eVar;
        this.f48160b = dVar;
        this.f48161c = aVar;
        this.f48162d = dVar2;
    }

    public /* synthetic */ C18920d(Throwable th, C18919c cVar) {
        this.f48159a = th.getLocalizedMessage();
        this.f48160b = th.getClass().getName();
        this.f48161c = cVar.mo50438c(th.getStackTrace());
        Throwable cause = th.getCause();
        this.f48162d = cause != null ? new C18920d(cause, cVar) : null;
    }
}
