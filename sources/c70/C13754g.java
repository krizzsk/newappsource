package c70;

import b00.C13556a;
import c70.C13756i;
import com.moovit.request.RequestOptions;
import java.util.LinkedList;
import p906wz.C20431c;

/* renamed from: c70.g */
public final /* synthetic */ class C13754g implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C13756i f33858b;

    /* renamed from: c */
    public final /* synthetic */ LinkedList f33859c;

    /* renamed from: d */
    public final /* synthetic */ C13556a[] f33860d;

    /* renamed from: e */
    public final /* synthetic */ String f33861e;

    /* renamed from: f */
    public final /* synthetic */ C20431c f33862f;

    /* renamed from: g */
    public final /* synthetic */ RequestOptions f33863g;

    /* renamed from: h */
    public final /* synthetic */ C13756i.C13768l f33864h;

    /* renamed from: i */
    public final /* synthetic */ RuntimeException[] f33865i;

    public /* synthetic */ C13754g(C13756i iVar, LinkedList linkedList, C13556a[] aVarArr, String str, C13778r rVar, RequestOptions requestOptions, C13769j jVar, RuntimeException[] runtimeExceptionArr) {
        this.f33858b = iVar;
        this.f33859c = linkedList;
        this.f33860d = aVarArr;
        this.f33861e = str;
        this.f33862f = rVar;
        this.f33863g = requestOptions;
        this.f33864h = jVar;
        this.f33865i = runtimeExceptionArr;
    }

    public final void run() {
        C13756i iVar = this.f33858b;
        LinkedList linkedList = this.f33859c;
        C13556a[] aVarArr = this.f33860d;
        String str = this.f33861e;
        C20431c cVar = this.f33862f;
        RequestOptions requestOptions = this.f33863g;
        C13756i.C13768l lVar = this.f33864h;
        RuntimeException[] runtimeExceptionArr = this.f33865i;
        iVar.getClass();
        synchronized (linkedList) {
            try {
                aVarArr[0] = iVar.mo40682e(str, cVar, requestOptions, lVar);
            } catch (RuntimeException e) {
                runtimeExceptionArr[0] = e;
                linkedList.notify();
            }
        }
    }
}
