package com.moovit.barcode.scan.engines;

import androidx.camera.core.C0556i;
import androidx.camera.core.C0608j;
import bf0.C21050d;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C23825c;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.C24177b;
import lf0.C24236l;
import mf0.C24362h;
import p664mu.C18441d;
import p722pg.C18922a;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052*\u0010\u0004\u001a&\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001 \u0002*\u0012\u0012\f\u0012\n \u0002*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u00030\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, mo59060d2 = {"", "Lpg/a;", "kotlin.jvm.PlatformType", "", "barcodes", "Lbf0/d;", "invoke", "(Ljava/util/List;)V", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
final class MLKitBarcodeScannerFragment$analyze$1 extends Lambda implements C24236l<List<C18922a>, C21050d> {
    public final /* synthetic */ C0556i $imageAnalyzer;
    public final /* synthetic */ MLKitBarcodeScannerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLKitBarcodeScannerFragment$analyze$1(C0556i iVar, MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment) {
        super(1);
        this.$imageAnalyzer = iVar;
        this.this$0 = mLKitBarcodeScannerFragment;
    }

    public final Object invoke(Object obj) {
        List list = (List) obj;
        C24362h.m61210e(list, "barcodes");
        String str = (String) C24177b.m60546g0(C24177b.m60543d0(C24177b.m60549j0(C23825c.m58506c0(list), MLKitBarcodeScannerFragment$analyze$1$barcode$1.f40816f), MLKitBarcodeScannerFragment$analyze$1$barcode$2.f40817f));
        if (str != null) {
            C0556i iVar = this.$imageAnalyzer;
            synchronized (iVar.f1913m) {
                C0608j jVar = iVar.f1912l;
                synchronized (jVar.f2100s) {
                    jVar.mo2539d();
                    jVar.f2083b = null;
                    jVar.f2089h = null;
                }
                if (iVar.f1914n != null) {
                    iVar.mo2377l();
                }
                iVar.f1914n = null;
            }
            MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment = this.this$0;
            int i = MLKitBarcodeScannerFragment.f40812q;
            mLKitBarcodeScannerFragment.getClass();
            mLKitBarcodeScannerFragment.mo46786U1(BarcodeScannerFragment.class, new C18441d(str));
        }
        return C21050d.f52856a;
    }
}
