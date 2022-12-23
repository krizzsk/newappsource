package p664mu;

import c00.C13717b;
import c00.C13723g;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.moovit.barcode.Barcode;
import com.moovit.barcode.scan.BarcodeScannerFragment;
import com.moovit.barcode.scan.engines.MLKitBarcodeScannerFragment;
import java.util.Collections;
import java.util.List;
import mf0.C24362h;
import p304x.C7070l;
import p899ws.C20401a;
import p977zz.C20949l;

/* renamed from: mu.d */
public final /* synthetic */ class C18441d implements SuccessContinuation, C20949l {

    /* renamed from: b */
    public final /* synthetic */ String f47011b;

    public /* synthetic */ C18441d(String str) {
        this.f47011b = str;
    }

    public final boolean invoke(Object obj) {
        String str = this.f47011b;
        BarcodeScannerFragment barcodeScannerFragment = (BarcodeScannerFragment) obj;
        int i = MLKitBarcodeScannerFragment.f40812q;
        C24362h.m61211f(str, "$barcode");
        Barcode barcode = new Barcode(str);
        barcodeScannerFragment.getClass();
        barcodeScannerFragment.mo46786U1(BarcodeScannerFragment.C15681a.class, new C7070l(barcode, 13));
        return true;
    }

    public final Task then(Object obj) {
        Object obj2;
        String str = this.f47011b;
        List list = (List) obj;
        if (!C13717b.m34258e(list)) {
            obj2 = C13723g.m34282c(list, new C20401a(str, 1));
        } else {
            obj2 = Collections.emptyList();
        }
        return Tasks.forResult(obj2);
    }
}
