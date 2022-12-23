package p178n2;

import androidx.paging.C1106b;
import androidx.paging.PagingSource;
import java.util.AbstractList;
import java.util.ArrayList;
import kotlin.collections.C23825c;
import lf0.C24236l;
import mf0.C24362h;

/* renamed from: n2.m */
public final class C5831m<T> extends AbstractList<T> implements C1106b.C1107a<Object>, C5828j<T> {

    /* renamed from: b */
    public final ArrayList f18806b;

    /* renamed from: c */
    public int f18807c;

    /* renamed from: d */
    public int f18808d;

    /* renamed from: e */
    public int f18809e;

    /* renamed from: f */
    public boolean f18810f;

    /* renamed from: g */
    public int f18811g;

    /* renamed from: h */
    public int f18812h;

    /* renamed from: n2.m$a */
    public interface C5832a {
        /* renamed from: d */
        void mo4395d(int i);
    }

    public C5831m() {
        this.f18806b = new ArrayList();
        this.f18810f = true;
    }

    /* renamed from: a */
    public final void mo21707a(int i, PagingSource.C1100b.C1102b<?, T> bVar, int i2, int i3, C5832a aVar, boolean z) {
        C24362h.m61211f(bVar, "page");
        C24362h.m61211f(aVar, WidgetMessageParser.KEY_CALLBACK);
        this.f18807c = i;
        this.f18806b.clear();
        this.f18806b.add(bVar);
        this.f18808d = i2;
        this.f18809e = i3;
        this.f18811g = bVar.f4155a.size();
        this.f18810f = z;
        this.f18812h = bVar.f4155a.size() / 2;
        aVar.mo4395d(mo21703e());
    }

    /* renamed from: b */
    public final boolean mo21708b(int i, int i2, int i3) {
        PagingSource.C1100b.C1102b bVar = (PagingSource.C1100b.C1102b) this.f18806b.get(i3);
        if (this.f18811g <= i || this.f18806b.size() <= 2 || this.f18811g - bVar.f4155a.size() < i2) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final int mo21703e() {
        return this.f18807c + this.f18811g + this.f18808d;
    }

    public final T get(int i) {
        int i2 = i - this.f18807c;
        if (i < 0 || i >= mo21703e()) {
            StringBuilder r = C25541a.m63887r("Index: ", i, ", Size: ");
            r.append(mo21703e());
            throw new IndexOutOfBoundsException(r.toString());
        } else if (i2 < 0 || i2 >= this.f18811g) {
            return null;
        } else {
            return mo21706s(i2);
        }
    }

    /* renamed from: i */
    public final Object mo4433i() {
        if (!this.f18810f || this.f18808d > 0) {
            return ((PagingSource.C1100b.C1102b) C23825c.m58522s0(this.f18806b)).f4157c;
        }
        return null;
    }

    /* renamed from: m */
    public final int mo21704m() {
        return this.f18807c;
    }

    /* renamed from: n */
    public final Object mo4434n() {
        if (!this.f18810f || this.f18807c + this.f18809e > 0) {
            return ((PagingSource.C1100b.C1102b) C23825c.m58513j0(this.f18806b)).f4156b;
        }
        return null;
    }

    /* renamed from: p */
    public final int mo21705p() {
        return this.f18808d;
    }

    public final /* bridge */ T remove(int i) {
        return super.remove(i);
    }

    /* renamed from: s */
    public final T mo21706s(int i) {
        int size = this.f18806b.size();
        int i2 = 0;
        while (i2 < size) {
            int size2 = ((PagingSource.C1100b.C1102b) this.f18806b.get(i2)).f4155a.size();
            if (size2 > i) {
                break;
            }
            i -= size2;
            i2++;
        }
        return ((PagingSource.C1100b.C1102b) this.f18806b.get(i2)).f4155a.get(i);
    }

    public final /* bridge */ int size() {
        return mo21703e();
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("leading ");
        k.append(this.f18807c);
        k.append(", storage ");
        k.append(this.f18811g);
        k.append(", trailing ");
        k.append(this.f18808d);
        k.append(' ');
        k.append(C23825c.m58520q0(this.f18806b, " ", (String) null, (String) null, (C24236l) null, 62));
        return k.toString();
    }

    public C5831m(C5831m<T> mVar) {
        ArrayList arrayList = new ArrayList();
        this.f18806b = arrayList;
        this.f18810f = true;
        arrayList.addAll(mVar.f18806b);
        this.f18807c = mVar.f18807c;
        this.f18808d = mVar.f18808d;
        this.f18809e = mVar.f18809e;
        this.f18810f = mVar.f18810f;
        this.f18811g = mVar.f18811g;
        this.f18812h = mVar.f18812h;
    }
}
