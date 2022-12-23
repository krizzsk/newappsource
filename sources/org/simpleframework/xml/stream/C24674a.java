package org.simpleframework.xml.stream;

import androidx.appcompat.app.C0262r;
import lj0.C24324a;
import lj0.C24331h;
import lj0.C24334k;

/* renamed from: org.simpleframework.xml.stream.a */
public final class C24674a implements C24331h {

    /* renamed from: a */
    public C24331h f62465a;

    /* renamed from: b */
    public String f62466b;

    /* renamed from: c */
    public String f62467c;

    /* renamed from: d */
    public Object f62468d;

    public C24674a(C24331h hVar, C24324a aVar) {
        aVar.mo60468a();
        aVar.getPrefix();
        this.f62468d = aVar.mo60470e();
        this.f62467c = aVar.getValue();
        this.f62466b = aVar.getName();
        this.f62465a = hVar;
    }

    /* renamed from: a */
    public final boolean mo60484a() {
        return false;
    }

    /* renamed from: b */
    public final C24331h mo60485b() {
        return null;
    }

    /* renamed from: c */
    public final void mo60486c() {
    }

    public final C24331h getAttribute(String str) {
        return null;
    }

    public final C24334k<C24331h> getAttributes() {
        return new InputNodeMap(this);
    }

    public final String getName() {
        return this.f62466b;
    }

    public final C0262r getPosition() {
        return this.f62465a.getPosition();
    }

    public final String getValue() {
        return this.f62467c;
    }

    public final String toString() {
        return String.format("attribute %s='%s'", new Object[]{this.f62466b, this.f62467c});
    }
}
