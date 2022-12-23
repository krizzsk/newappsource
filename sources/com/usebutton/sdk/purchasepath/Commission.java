package com.usebutton.sdk.purchasepath;

import org.json.JSONObject;

public class Commission {
    private static final String KEY_COMISSION_TYPE = "commission_type";
    private CommissionType commissionType;

    public enum CommissionType {
        COMMISSIONABLE("commissionable"),
        NON_COMMISSIONABLE("non-commissionable"),
        UNKNOWN("unknown");
        
        public final String commissionType;

        private CommissionType(String str) {
            this.commissionType = str;
        }

        public static CommissionType getType(String str) {
            for (CommissionType commissionType2 : values()) {
                if (commissionType2.commissionType.equalsIgnoreCase(str)) {
                    return commissionType2;
                }
            }
            return UNKNOWN;
        }
    }

    private Commission(String str) {
        this.commissionType = CommissionType.getType(str);
    }

    public static Commission fromJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        String optString = jSONObject.optString(KEY_COMISSION_TYPE);
        if (optString.isEmpty()) {
            return null;
        }
        return new Commission(optString);
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Commission)) {
            return false;
        }
        return this.commissionType.equals(((Commission) obj).commissionType);
    }

    public CommissionType getCommissionType() {
        return this.commissionType;
    }

    public int hashCode() {
        return this.commissionType.hashCode() + 203;
    }
}
