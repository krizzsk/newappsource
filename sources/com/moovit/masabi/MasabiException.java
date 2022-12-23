package com.moovit.masabi;

import p001a0.C0016g;
import p725pj.C18926a;

public class MasabiException extends RuntimeException {
    private final C18926a error;

    public MasabiException(String str) {
        super(str);
        this.error = null;
    }

    /* renamed from: a */
    public static String m11077a(C18926a aVar, String str) {
        if (str != null && aVar != null) {
            StringBuilder t = C0016g.m36t(str, " ");
            t.append(aVar.mo51439b());
            return t.toString();
        } else if (str != null) {
            return str;
        } else {
            if (aVar != null) {
                return aVar.mo51439b();
            }
            return null;
        }
    }

    /* renamed from: b */
    public final C18926a mo19356b() {
        return this.error;
    }

    public MasabiException(C18926a aVar, String str) {
        super(m11077a(aVar, str));
        this.error = aVar;
    }

    public MasabiException(String str, Exception exc) {
        super(m11077a((C18926a) null, str), exc);
        this.error = null;
    }
}
