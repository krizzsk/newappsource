package com.masabi.ticket.schema;

import p776rp.C19308a;

public enum OperatingModeConstants implements C19308a {
    UNIT_WITH_SCANNER((byte) 0),
    HEADLESS_SCAN_SERVER((byte) 1);
    
    private final byte uniqueId;

    private OperatingModeConstants(byte b) {
        this.uniqueId = b;
    }

    public byte getUniqueId() {
        return this.uniqueId;
    }
}
