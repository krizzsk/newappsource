package rj0;

import org.tukaani.p981xz.UnsupportedOptionsException;

/* renamed from: rj0.i */
public final class C24842i {
    /* renamed from: a */
    public static void m62383a(C24838e[] eVarArr) throws UnsupportedOptionsException {
        int i = 0;
        while (i < eVarArr.length - 1) {
            if (eVarArr[i].mo19840m()) {
                i++;
            } else {
                throw new UnsupportedOptionsException("Unsupported XZ filter chain");
            }
        }
        if (eVarArr[eVarArr.length - 1].mo19841o()) {
            int i2 = 0;
            for (C24838e r : eVarArr) {
                if (r.mo19842r()) {
                    i2++;
                }
            }
            if (i2 > 3) {
                throw new UnsupportedOptionsException("Unsupported XZ filter chain");
            }
            return;
        }
        throw new UnsupportedOptionsException("Unsupported XZ filter chain");
    }
}
