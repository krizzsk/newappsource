package com.moovit.servicealerts;

import java.util.EnumSet;
import java.util.Set;
import p810sz.C19577c;
import p810sz.C19584i;
import p824tp.C19735m;
import p824tp.C19739q;
import p824tp.C19746x;

public enum ServiceStatusCategory {
    CRITICAL(C19739q.ic_service_critical_24_critical, C19739q.ic_service_critical_16_critical, C19735m.colorCritical, C19746x.service_alerts_status_canceled),
    MODIFIED(C19739q.ic_service_modified_24_problem, C19739q.ic_service_modified_16_problem, C19735m.colorProblem, C19746x.service_alerts_status_changed),
    INFO(C19739q.ic_service_info_24_info, C19739q.ic_service_info_16_info, C19735m.colorInfo, C19746x.service_alerts_status_additional),
    REGULAR(C19739q.ic_service_regular_24_good, C19739q.ic_service_regular_16_good, C19735m.colorGood, C19746x.service_alerts_status_regular),
    UNKNOWN(0, 0, 0, C19746x.service_alerts_status_unknown);
    
    public static final C19584i<ServiceStatusCategory> CODER = null;
    public static final Set<ServiceStatusCategory> CRITICAL_LEVEL = null;
    public static final Set<ServiceStatusCategory> IMPORTANT_LEVEL = null;
    public static final Set<ServiceStatusCategory> REGULAR_LEVEL = null;
    private final int accessibilityResId;
    private final int colorAttrId;
    private final int iconResId;
    private final int smallIconResId;

    /* access modifiers changed from: public */
    static {
        ServiceStatusCategory serviceStatusCategory;
        ServiceStatusCategory serviceStatusCategory2;
        ServiceStatusCategory serviceStatusCategory3;
        ServiceStatusCategory serviceStatusCategory4;
        ServiceStatusCategory serviceStatusCategory5;
        CODER = new C19577c(ServiceStatusCategory.class, serviceStatusCategory4, serviceStatusCategory2, serviceStatusCategory, serviceStatusCategory5, serviceStatusCategory3);
        CRITICAL_LEVEL = EnumSet.of(serviceStatusCategory);
        IMPORTANT_LEVEL = EnumSet.of(serviceStatusCategory, serviceStatusCategory2);
        REGULAR_LEVEL = EnumSet.of(serviceStatusCategory, serviceStatusCategory2, serviceStatusCategory3, serviceStatusCategory4);
    }

    private ServiceStatusCategory(int i, int i2, int i3, int i4) {
        this.iconResId = i;
        this.smallIconResId = i2;
        this.colorAttrId = i3;
        this.accessibilityResId = i4;
    }

    public int getAccessibilityResId() {
        return this.accessibilityResId;
    }

    public int getColorAttrId() {
        return this.colorAttrId;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public int getSmallIconResId() {
        return this.smallIconResId;
    }
}
