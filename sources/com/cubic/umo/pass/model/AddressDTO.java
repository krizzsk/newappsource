package com.cubic.umo.pass.model;

import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12944h;
import p001a0.C0016g;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/AddressDTO;", "", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class AddressDTO {

    /* renamed from: a */
    public final Integer f7909a;

    /* renamed from: b */
    public final String f7910b;

    /* renamed from: c */
    public final String f7911c;

    /* renamed from: d */
    public final String f7912d;

    /* renamed from: e */
    public final String f7913e;

    /* renamed from: f */
    public final String f7914f;

    /* renamed from: g */
    public final String f7915g;

    /* renamed from: h */
    public final String f7916h;

    public AddressDTO(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f7909a = num;
        this.f7910b = str;
        this.f7911c = str2;
        this.f7912d = str3;
        this.f7913e = str4;
        this.f7914f = str5;
        this.f7915g = str6;
        this.f7916h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AddressDTO)) {
            return false;
        }
        AddressDTO addressDTO = (AddressDTO) obj;
        return C24362h.m61206a(this.f7909a, addressDTO.f7909a) && C24362h.m61206a(this.f7910b, addressDTO.f7910b) && C24362h.m61206a(this.f7911c, addressDTO.f7911c) && C24362h.m61206a(this.f7912d, addressDTO.f7912d) && C24362h.m61206a(this.f7913e, addressDTO.f7913e) && C24362h.m61206a(this.f7914f, addressDTO.f7914f) && C24362h.m61206a(this.f7915g, addressDTO.f7915g) && C24362h.m61206a(this.f7916h, addressDTO.f7916h);
    }

    public final int hashCode() {
        Integer num = this.f7909a;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f7910b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f7911c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f7912d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f7913e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7914f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f7915g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f7916h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("AddressDTO(id=");
        k.append(this.f7909a);
        k.append(", addr1=");
        k.append(this.f7910b);
        k.append(", addr2=");
        k.append(this.f7911c);
        k.append(", city=");
        k.append(this.f7912d);
        k.append(", state=");
        k.append(this.f7913e);
        k.append(", zip=");
        k.append(this.f7914f);
        k.append(", phone=");
        k.append(this.f7915g);
        k.append(", country=");
        return C0016g.m30n(k, this.f7916h, ')');
    }
}
