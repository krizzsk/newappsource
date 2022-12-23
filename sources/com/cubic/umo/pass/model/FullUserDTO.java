package com.cubic.umo.pass.model;

import java.util.List;
import kotlin.Metadata;
import mf0.C24362h;
import nb0.C12943g;
import nb0.C12944h;

@Metadata(mo59058bv = {}, mo59059d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJE\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¨\u0006\u0010"}, mo59060d2 = {"Lcom/cubic/umo/pass/model/FullUserDTO;", "", "Lcom/cubic/umo/pass/model/UserDTO;", "user", "Lcom/cubic/umo/pass/model/AccountDTO;", "account", "Lcom/cubic/umo/pass/model/AgencyInformation;", "agency", "", "Lcom/cubic/umo/pass/model/TxDTO;", "transactions", "Lcom/cubic/umo/pass/model/FundingSourceDTO;", "fundingSource", "copy", "<init>", "(Lcom/cubic/umo/pass/model/UserDTO;Lcom/cubic/umo/pass/model/AccountDTO;Lcom/cubic/umo/pass/model/AgencyInformation;Ljava/util/List;Lcom/cubic/umo/pass/model/FundingSourceDTO;)V", "pass_release"}, mo59061k = 1, mo59062mv = {1, 6, 0})
@C12944h(generateAdapter = true)
public final class FullUserDTO {

    /* renamed from: a */
    public final UserDTO f8092a;

    /* renamed from: b */
    public final AccountDTO f8093b;

    /* renamed from: c */
    public final AgencyInformation f8094c;

    /* renamed from: d */
    public final List<TxDTO> f8095d;

    /* renamed from: e */
    public final FundingSourceDTO f8096e;

    public FullUserDTO(@C12943g(name = "userDTO") UserDTO userDTO, @C12943g(name = "accountDTO") AccountDTO accountDTO, @C12943g(name = "agencyDTO") AgencyInformation agencyInformation, List<TxDTO> list, @C12943g(name = "tokenDTO") FundingSourceDTO fundingSourceDTO) {
        C24362h.m61211f(userDTO, "user");
        C24362h.m61211f(accountDTO, "account");
        C24362h.m61211f(list, "transactions");
        this.f8092a = userDTO;
        this.f8093b = accountDTO;
        this.f8094c = agencyInformation;
        this.f8095d = list;
        this.f8096e = fundingSourceDTO;
    }

    public final FullUserDTO copy(@C12943g(name = "userDTO") UserDTO userDTO, @C12943g(name = "accountDTO") AccountDTO accountDTO, @C12943g(name = "agencyDTO") AgencyInformation agencyInformation, List<TxDTO> list, @C12943g(name = "tokenDTO") FundingSourceDTO fundingSourceDTO) {
        C24362h.m61211f(userDTO, "user");
        C24362h.m61211f(accountDTO, "account");
        C24362h.m61211f(list, "transactions");
        return new FullUserDTO(userDTO, accountDTO, agencyInformation, list, fundingSourceDTO);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FullUserDTO)) {
            return false;
        }
        FullUserDTO fullUserDTO = (FullUserDTO) obj;
        return C24362h.m61206a(this.f8092a, fullUserDTO.f8092a) && C24362h.m61206a(this.f8093b, fullUserDTO.f8093b) && C24362h.m61206a(this.f8094c, fullUserDTO.f8094c) && C24362h.m61206a(this.f8095d, fullUserDTO.f8095d) && C24362h.m61206a(this.f8096e, fullUserDTO.f8096e);
    }

    public final int hashCode() {
        int hashCode = (this.f8093b.hashCode() + (this.f8092a.hashCode() * 31)) * 31;
        AgencyInformation agencyInformation = this.f8094c;
        int i = 0;
        int hashCode2 = (this.f8095d.hashCode() + ((hashCode + (agencyInformation == null ? 0 : agencyInformation.hashCode())) * 31)) * 31;
        FundingSourceDTO fundingSourceDTO = this.f8096e;
        if (fundingSourceDTO != null) {
            i = fundingSourceDTO.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("FullUserDTO(user=");
        k.append(this.f8092a);
        k.append(", account=");
        k.append(this.f8093b);
        k.append(", agency=");
        k.append(this.f8094c);
        k.append(", transactions=");
        k.append(this.f8095d);
        k.append(", fundingSource=");
        k.append(this.f8096e);
        k.append(')');
        return k.toString();
    }
}
