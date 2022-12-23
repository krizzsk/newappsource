package com.cubic.umo.pass.model;

import com.squareup.moshi.C8011k;
import com.squareup.moshi.C8017o;
import com.squareup.moshi.JsonReader;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import mf0.C24362h;
import nb0.C12947k;
import nb0.C12949m;
import ob0.C12977b;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/FullUserDTOJsonAdapter;", "Lcom/squareup/moshi/k;", "Lcom/cubic/umo/pass/model/FullUserDTO;", "Lcom/squareup/moshi/o;", "moshi", "<init>", "(Lcom/squareup/moshi/o;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
public final class FullUserDTOJsonAdapter extends C8011k<FullUserDTO> {

    /* renamed from: a */
    public final JsonReader.C7986a f8097a = JsonReader.C7986a.m18216a("userDTO", "accountDTO", "agencyDTO", "transactions", "tokenDTO");

    /* renamed from: b */
    public final C8011k<UserDTO> f8098b;

    /* renamed from: c */
    public final C8011k<AccountDTO> f8099c;

    /* renamed from: d */
    public final C8011k<AgencyInformation> f8100d;

    /* renamed from: e */
    public final C8011k<List<TxDTO>> f8101e;

    /* renamed from: f */
    public final C8011k<FundingSourceDTO> f8102f;

    public FullUserDTOJsonAdapter(C8017o oVar) {
        C24362h.m61211f(oVar, "moshi");
        EmptySet emptySet = EmptySet.f60175b;
        this.f8098b = oVar.mo25082c(UserDTO.class, emptySet, "user");
        this.f8099c = oVar.mo25082c(AccountDTO.class, emptySet, "account");
        this.f8100d = oVar.mo25082c(AgencyInformation.class, emptySet, "agency");
        this.f8101e = oVar.mo25082c(C12949m.m32790d(List.class, TxDTO.class), emptySet, "transactions");
        this.f8102f = oVar.mo25082c(FundingSourceDTO.class, emptySet, "fundingSource");
    }

    /* renamed from: a */
    public final Object mo11093a(JsonReader jsonReader) {
        C24362h.m61211f(jsonReader, "reader");
        jsonReader.mo24995i();
        UserDTO userDTO = null;
        AccountDTO accountDTO = null;
        AgencyInformation agencyInformation = null;
        List list = null;
        FundingSourceDTO fundingSourceDTO = null;
        while (jsonReader.mo24999v()) {
            int O = jsonReader.mo24989O(this.f8097a);
            if (O == -1) {
                jsonReader.mo24991S();
                jsonReader.mo24992T();
            } else if (O == 0) {
                userDTO = this.f8098b.mo11093a(jsonReader);
                if (userDTO == null) {
                    throw C12977b.m32860m("user", "userDTO", jsonReader);
                }
            } else if (O == 1) {
                accountDTO = this.f8099c.mo11093a(jsonReader);
                if (accountDTO == null) {
                    throw C12977b.m32860m("account", "accountDTO", jsonReader);
                }
            } else if (O == 2) {
                agencyInformation = this.f8100d.mo11093a(jsonReader);
            } else if (O == 3) {
                list = this.f8101e.mo11093a(jsonReader);
                if (list == null) {
                    throw C12977b.m32860m("transactions", "transactions", jsonReader);
                }
            } else if (O == 4) {
                fundingSourceDTO = this.f8102f.mo11093a(jsonReader);
            }
        }
        jsonReader.mo24997r();
        if (userDTO == null) {
            throw C12977b.m32854g("user", "userDTO", jsonReader);
        } else if (accountDTO == null) {
            throw C12977b.m32854g("account", "accountDTO", jsonReader);
        } else if (list != null) {
            return new FullUserDTO(userDTO, accountDTO, agencyInformation, list, fundingSourceDTO);
        } else {
            throw C12977b.m32854g("transactions", "transactions", jsonReader);
        }
    }

    /* renamed from: e */
    public final void mo11094e(C12947k kVar, Object obj) {
        FullUserDTO fullUserDTO = (FullUserDTO) obj;
        C24362h.m61211f(kVar, "writer");
        if (fullUserDTO != null) {
            kVar.mo25074i();
            kVar.mo25077w("userDTO");
            this.f8098b.mo11094e(kVar, fullUserDTO.f8092a);
            kVar.mo25077w("accountDTO");
            this.f8099c.mo11094e(kVar, fullUserDTO.f8093b);
            kVar.mo25077w("agencyDTO");
            this.f8100d.mo11094e(kVar, fullUserDTO.f8094c);
            kVar.mo25077w("transactions");
            this.f8101e.mo11094e(kVar, fullUserDTO.f8095d);
            kVar.mo25077w("tokenDTO");
            this.f8102f.mo11094e(kVar, fullUserDTO.f8096e);
            kVar.mo25076t();
            return;
        }
        throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
    }

    public final String toString() {
        return "GeneratedJsonAdapter(FullUserDTO)";
    }
}
