package com.masabi.ticket.schema;

import p776rp.C19308a;

public enum MediaChannelConstants implements C19308a {
    PDF((byte) 0),
    MOBILE_APP((byte) 1),
    APPLE_WALLET((byte) 2),
    GOOGLE_WALLET((byte) 3),
    EMAIL((byte) 4),
    SMS((byte) 5),
    PAPER_ROLL((byte) 6),
    PRE_PRINTED((byte) 7);
    
    private final byte uniqueId;

    private MediaChannelConstants(byte b) {
        this.uniqueId = b;
    }

    public byte getUniqueId() {
        return this.uniqueId;
    }
}
