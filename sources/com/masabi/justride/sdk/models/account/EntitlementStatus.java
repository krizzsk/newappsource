package com.masabi.justride.sdk.models.account;

public enum EntitlementStatus {
    ACTIVE,
    UNBOUND,
    EXPIRED,
    CANCELLED,
    UNKNOWN;

    public static EntitlementStatus parse(String str) {
        try {
            return (EntitlementStatus) Enum.valueOf(EntitlementStatus.class, str);
        } catch (IllegalArgumentException | NullPointerException unused) {
            return UNKNOWN;
        }
    }
}
