package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;

public class MappingRule implements Serializable {
    private String claim;
    private String matchType;
    private String roleARN;
    private String value;

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof MappingRule)) {
            return false;
        }
        MappingRule mappingRule = (MappingRule) obj;
        if (mappingRule.getClaim() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getClaim() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (mappingRule.getClaim() != null && !mappingRule.getClaim().equals(getClaim())) {
            return false;
        }
        if (mappingRule.getMatchType() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getMatchType() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (mappingRule.getMatchType() != null && !mappingRule.getMatchType().equals(getMatchType())) {
            return false;
        }
        if (mappingRule.getValue() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getValue() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (mappingRule.getValue() != null && !mappingRule.getValue().equals(getValue())) {
            return false;
        }
        if (mappingRule.getRoleARN() == null) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (getRoleARN() == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z7 ^ z8) {
            return false;
        }
        if (mappingRule.getRoleARN() == null || mappingRule.getRoleARN().equals(getRoleARN())) {
            return true;
        }
        return false;
    }

    public String getClaim() {
        return this.claim;
    }

    public String getMatchType() {
        return this.matchType;
    }

    public String getRoleARN() {
        return this.roleARN;
    }

    public String getValue() {
        return this.value;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        if (getClaim() == null) {
            i = 0;
        } else {
            i = getClaim().hashCode();
        }
        int i5 = (i + 31) * 31;
        if (getMatchType() == null) {
            i2 = 0;
        } else {
            i2 = getMatchType().hashCode();
        }
        int i6 = (i5 + i2) * 31;
        if (getValue() == null) {
            i3 = 0;
        } else {
            i3 = getValue().hashCode();
        }
        int i7 = (i6 + i3) * 31;
        if (getRoleARN() != null) {
            i4 = getRoleARN().hashCode();
        }
        return i7 + i4;
    }

    public void setClaim(String str) {
        this.claim = str;
    }

    public void setMatchType(String str) {
        this.matchType = str;
    }

    public void setRoleARN(String str) {
        this.roleARN = str;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getClaim() != null) {
            StringBuilder k2 = C13555b.m33972k("Claim: ");
            k2.append(getClaim());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getMatchType() != null) {
            StringBuilder k3 = C13555b.m33972k("MatchType: ");
            k3.append(getMatchType());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getValue() != null) {
            StringBuilder k4 = C13555b.m33972k("Value: ");
            k4.append(getValue());
            k4.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k4.toString());
        }
        if (getRoleARN() != null) {
            StringBuilder k5 = C13555b.m33972k("RoleARN: ");
            k5.append(getRoleARN());
            k.append(k5.toString());
        }
        k.append("}");
        return k.toString();
    }

    public MappingRule withClaim(String str) {
        this.claim = str;
        return this;
    }

    public MappingRule withMatchType(String str) {
        this.matchType = str;
        return this;
    }

    public MappingRule withRoleARN(String str) {
        this.roleARN = str;
        return this;
    }

    public MappingRule withValue(String str) {
        this.value = str;
        return this;
    }

    public void setMatchType(MappingRuleMatchType mappingRuleMatchType) {
        this.matchType = mappingRuleMatchType.toString();
    }

    public MappingRule withMatchType(MappingRuleMatchType mappingRuleMatchType) {
        this.matchType = mappingRuleMatchType.toString();
        return this;
    }
}
