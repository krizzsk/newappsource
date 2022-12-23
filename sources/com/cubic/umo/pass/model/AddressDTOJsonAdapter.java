package com.cubic.umo.pass.model;

import com.appsflyer.ServerParameters;
import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/AddressDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/AddressDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class AddressDTOJsonAdapter extends C8011k<AddressDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f7917a = JsonReader.C7986a.m18216a("id", "addr1", "addr2", "city", "state", "zip", "phone", ServerParameters.COUNTRY);

    /* renamed from: b */
    public final C8011k<Integer> f7918b;

    /* renamed from: c */
    public final C8011k<String> f7919c;

    public AddressDTOJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f7918b = oVar.mo25082c(Integer.class, emptySet, "id");
        this.f7919c = oVar.mo25082c(String.class, emptySet, "addr1");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        Integer num = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        while (jsonReader.mo24999v()) {
            switch (jsonReader.mo24989O(this.f7917a)) {
                case -1:
                    jsonReader.mo24991S();
                    jsonReader.mo24992T();
                    break;
                case 0:
                    num = this.f7918b.mo11093a(jsonReader);
                    break;
                case 1:
                    str = this.f7919c.mo11093a(jsonReader);
                    break;
                case 2:
                    str2 = this.f7919c.mo11093a(jsonReader);
                    break;
                case 3:
                    str3 = this.f7919c.mo11093a(jsonReader);
                    break;
                case 4:
                    str4 = this.f7919c.mo11093a(jsonReader);
                    break;
                case 5:
                    str5 = this.f7919c.mo11093a(jsonReader);
                    break;
                case 6:
                    str6 = this.f7919c.mo11093a(jsonReader);
                    break;
                case 7:
                    str7 = this.f7919c.mo11093a(jsonReader);
                    break;
            }
        }
        jsonReader.mo24997r();
        return new AddressDTO(num, str, str2, str3, str4, str5, str6, str7);
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        AddressDTO addressDTO = (AddressDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (addressDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("id");
            this.f7918b.mo11094e(kVar, addressDTO.f7909a);
            kVar.mo25077w("addr1");
            this.f7919c.mo11094e(kVar, addressDTO.f7910b);
            kVar.mo25077w("addr2");
            this.f7919c.mo11094e(kVar, addressDTO.f7911c);
            kVar.mo25077w("city");
            this.f7919c.mo11094e(kVar, addressDTO.f7912d);
            kVar.mo25077w("state");
            this.f7919c.mo11094e(kVar, addressDTO.f7913e);
            kVar.mo25077w("zip");
            this.f7919c.mo11094e(kVar, addressDTO.f7914f);
            kVar.mo25077w("phone");
            this.f7919c.mo11094e(kVar, addressDTO.f7915g);
            kVar.mo25077w(ServerParameters.COUNTRY);
            this.f7919c.mo11094e(kVar, addressDTO.f7916h);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(AddressDTO)";
    }
}
