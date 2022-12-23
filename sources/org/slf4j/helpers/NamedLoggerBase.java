package org.slf4j.helpers;

import java.io.ObjectStreamException;
import java.io.Serializable;
import nj0.C24541b;
import nj0.C24542c;

abstract class NamedLoggerBase implements C24541b, Serializable {
    private static final long serialVersionUID = 7535258609338176893L;
    public String name;

    /* renamed from: a */
    public String mo61122a() {
        return this.name;
    }

    public Object readResolve() throws ObjectStreamException {
        return C24542c.m61718b(mo61122a());
    }
}
