package com.moovit.barcode.scan.engines;

import ce0.C21100e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.mlkit.vision.barcode.internal.BarcodeScannerImpl;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import lf0.C24225a;
import mf0.C24362h;
import p627lg.C18208g;
import p674ng.C18548a;
import p674ng.C18549b;
import p767rg.C19263c;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo59060d2 = {"Lng/a;", "invoke", "()Lng/a;", "<anonymous>"}, mo59061k = 3, mo59062mv = {1, 7, 1})
public final class MLKitBarcodeScannerFragment$scanner$2 extends Lambda implements C24225a<C18548a> {
    public final /* synthetic */ MLKitBarcodeScannerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MLKitBarcodeScannerFragment$scanner$2(MLKitBarcodeScannerFragment mLKitBarcodeScannerFragment) {
        super(0);
        this.this$0 = mLKitBarcodeScannerFragment;
    }

    public final Object invoke() {
        boolean z;
        Class cls = C19263c.class;
        int[] intArray = this.this$0.requireArguments().getIntArray("formats");
        if (intArray != null) {
            if (intArray.length == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                int length = intArray.length;
                C21100e.m49308G(length, intArray.length);
                int[] copyOfRange = Arrays.copyOfRange(intArray, 1, length);
                C24362h.m61210e(copyOfRange, "copyOfRange(this, fromIndex, toIndex)");
                int i = intArray[0];
                int[] copyOf = Arrays.copyOf(copyOfRange, copyOfRange.length);
                if (copyOf != null) {
                    for (int i2 : copyOf) {
                        i |= i2;
                    }
                }
                C18549b bVar = new C18549b(i);
                Preconditions.checkNotNull(bVar, "You must provide a valid BarcodeScannerOptions.");
                return ((C19263c) C18208g.m44941c().mo50622a(cls)).mo51682a(bVar);
            }
        }
        C19263c cVar = (C19263c) C18208g.m44941c().mo50622a(cls);
        cVar.getClass();
        return cVar.mo51682a(BarcodeScannerImpl.f36786g);
    }
}
