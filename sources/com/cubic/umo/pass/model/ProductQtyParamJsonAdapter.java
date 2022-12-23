package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/ProductQtyParamJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/ProductQtyParam;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class ProductQtyParamJsonAdapter extends C8011k<ProductQtyParam> {

    /* renamed from: a */
    public final JsonReader.C7986a f8213a = JsonReader.C7986a.m18216a("fareProductId", "qty", "autoload");

    /* renamed from: b */
    public final C8011k<Integer> f8214b;

    /* renamed from: c */
    public final C8011k<Boolean> f8215c;

    public ProductQtyParamJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        Class cls = Integer.TYPE;
        EmptySet emptySet = EmptySet.f60175b;
        this.f8214b = oVar.mo25082c(cls, emptySet, "fareProductId");
        this.f8215c = oVar.mo25082c(Boolean.class, emptySet, "autoLoad");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        Integer num = null;
        Integer num2 = null;
        Boolean bool = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f8213a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                num = this.f8214b.mo11093a(jsonReader);
                if (num == null) {
                    throw C12977b.m32860m("fareProductId", "fareProductId", jsonReader);
                }
            } else if (O == 1) {
                num2 = this.f8214b.mo11093a(jsonReader);
                if (num2 == null) {
                    throw C12977b.m32860m("qty", "qty", jsonReader);
                }
            } else if (O == 2) {
                bool = this.f8215c.mo11093a(jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (num != null) {
            int intValue = num.intValue();
            if (num2 != null) {
                return new ProductQtyParam(intValue, num2.intValue(), bool);
            }
            throw C12977b.m32854g("qty", "qty", jsonReader);
        }
        throw C12977b.m32854g("fareProductId", "fareProductId", jsonReader);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        ProductQtyParam productQtyParam = (ProductQtyParam) obj;
        C24362h.m61211f(kVar, "writer");
        if (productQtyParam != null) {
            kVar.mo25074i();
            kVar.mo25077w("fareProductId");
            this.f8214b.mo11094e(kVar, Integer.valueOf(productQtyParam.f8210a));
            kVar.mo25077w("qty");
            this.f8214b.mo11094e(kVar, Integer.valueOf(productQtyParam.f8211b));
            kVar.mo25077w("autoload");
            this.f8215c.mo11094e(kVar, productQtyParam.f8212c);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(ProductQtyParam)";
    }
}
