package com.amazonaws.services.cognitoidentity.model;

import com.appboy.configuration.AppboyConfigurationProvider;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class GetIdentityPoolRolesResult implements Serializable {
    private String identityPoolId;
    private Map<String, RoleMapping> roleMappings;
    private Map<String, String> roles;

    public GetIdentityPoolRolesResult addRoleMappingsEntry(String str, RoleMapping roleMapping) {
        if (this.roleMappings == null) {
            this.roleMappings = new HashMap();
        }
        if (!this.roleMappings.containsKey(str)) {
            this.roleMappings.put(str, roleMapping);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public GetIdentityPoolRolesResult addRolesEntry(String str, String str2) {
        if (this.roles == null) {
            this.roles = new HashMap();
        }
        if (!this.roles.containsKey(str)) {
            this.roles.put(str, str2);
            return this;
        }
        throw new IllegalArgumentException(C25541a.m63883n(str, C13555b.m33972k("Duplicated keys ("), ") are provided."));
    }

    public GetIdentityPoolRolesResult clearRoleMappingsEntries() {
        this.roleMappings = null;
        return this;
    }

    public GetIdentityPoolRolesResult clearRolesEntries() {
        this.roles = null;
        return this;
    }

    public boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof GetIdentityPoolRolesResult)) {
            return false;
        }
        GetIdentityPoolRolesResult getIdentityPoolRolesResult = (GetIdentityPoolRolesResult) obj;
        if (getIdentityPoolRolesResult.getIdentityPoolId() == null) {
            z = true;
        } else {
            z = false;
        }
        if (getIdentityPoolId() == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z ^ z2) {
            return false;
        }
        if (getIdentityPoolRolesResult.getIdentityPoolId() != null && !getIdentityPoolRolesResult.getIdentityPoolId().equals(getIdentityPoolId())) {
            return false;
        }
        if (getIdentityPoolRolesResult.getRoles() == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (getRoles() == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 ^ z4) {
            return false;
        }
        if (getIdentityPoolRolesResult.getRoles() != null && !getIdentityPoolRolesResult.getRoles().equals(getRoles())) {
            return false;
        }
        if (getIdentityPoolRolesResult.getRoleMappings() == null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (getRoleMappings() == null) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (z5 ^ z6) {
            return false;
        }
        if (getIdentityPoolRolesResult.getRoleMappings() == null || getIdentityPoolRolesResult.getRoleMappings().equals(getRoleMappings())) {
            return true;
        }
        return false;
    }

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    public Map<String, RoleMapping> getRoleMappings() {
        return this.roleMappings;
    }

    public Map<String, String> getRoles() {
        return this.roles;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3 = 0;
        if (getIdentityPoolId() == null) {
            i = 0;
        } else {
            i = getIdentityPoolId().hashCode();
        }
        int i4 = (i + 31) * 31;
        if (getRoles() == null) {
            i2 = 0;
        } else {
            i2 = getRoles().hashCode();
        }
        int i5 = (i4 + i2) * 31;
        if (getRoleMappings() != null) {
            i3 = getRoleMappings().hashCode();
        }
        return i5 + i3;
    }

    public void setIdentityPoolId(String str) {
        this.identityPoolId = str;
    }

    public void setRoleMappings(Map<String, RoleMapping> map) {
        this.roleMappings = map;
    }

    public void setRoles(Map<String, String> map) {
        this.roles = map;
    }

    public String toString() {
        StringBuilder k = C13555b.m33972k("{");
        if (getIdentityPoolId() != null) {
            StringBuilder k2 = C13555b.m33972k("IdentityPoolId: ");
            k2.append(getIdentityPoolId());
            k2.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k2.toString());
        }
        if (getRoles() != null) {
            StringBuilder k3 = C13555b.m33972k("Roles: ");
            k3.append(getRoles());
            k3.append(AppboyConfigurationProvider.LOCALE_TO_API_KEY_MAPPING_SEPARATOR);
            k.append(k3.toString());
        }
        if (getRoleMappings() != null) {
            StringBuilder k4 = C13555b.m33972k("RoleMappings: ");
            k4.append(getRoleMappings());
            k.append(k4.toString());
        }
        k.append("}");
        return k.toString();
    }

    public GetIdentityPoolRolesResult withIdentityPoolId(String str) {
        this.identityPoolId = str;
        return this;
    }

    public GetIdentityPoolRolesResult withRoleMappings(Map<String, RoleMapping> map) {
        this.roleMappings = map;
        return this;
    }

    public GetIdentityPoolRolesResult withRoles(Map<String, String> map) {
        this.roles = map;
        return this;
    }
}
