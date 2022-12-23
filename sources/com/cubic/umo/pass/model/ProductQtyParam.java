package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ0\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/ProductQtyParam;", "", "", "fareProductId", "qty", "", "autoLoad", "copy", "(IILjava/lang/Boolean;)Lcom/cubic/umo/pass/model/ProductQtyParam;", "<init>", "(IILjava/lang/Boolean;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class ProductQtyParam {

    /* renamed from: a */
    public final int f8210a;

    /* renamed from: b */
    public final int f8211b;

    /* renamed from: c */
    public final Boolean f8212c;

    public ProductQtyParam(int i, int i2, @C12943g(name = "autoload") Boolean bool) {
        this.f8210a = i;
        this.f8211b = i2;
        this.f8212c = bool;
    }

    public final ProductQtyParam copy(int i, int i2, @C12943g(name = "autoload") Boolean bool) {
        return new ProductQtyParam(i, i2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductQtyParam)) {
            return false;
        }
        ProductQtyParam productQtyParam = (ProductQtyParam) obj;
        return this.f8210a == productQtyParam.f8210a && this.f8211b == productQtyParam.f8211b && C24362h.m61206a(this.f8212c, productQtyParam.f8212c);
    }

    public final int hashCode() {
        int i = ((this.f8210a * 31) + this.f8211b) * 31;
        Boolean bool = this.f8212c;
        return i + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ProductQtyParam(fareProductId=");
        k.append(this.f8210a);
        k.append(", qty=");
        k.append(this.f8211b);
        k.append(", autoLoad=");
        k.append(this.f8212c);
        k.append(')');
        return k.toString();
    }
}
