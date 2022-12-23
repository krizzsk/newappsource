package com.masabi.ticket.schema;

import p776rp.C19308a;

public enum ScreenRotation implements C19308a {
    OFFSET_0_DEGREE((byte) 0, 0),
    OFFSET_90_DEGREE((byte) 1, 90),
    OFFSET_180_DEGREE((byte) 2, 180),
    OFFSET_270_DEGREE((byte) 3, 270);
    
    private final int offset;
    private final byte uniqueId;

    private ScreenRotation(byte b, int i) {
        this.uniqueId = b;
        this.offset = i;
    }

    public static ScreenRotation fromOffset(Integer num) {
        int intValue = num.intValue();
        if (intValue == 0) {
            return OFFSET_0_DEGREE;
        }
        if (intValue == 90) {
            return OFFSET_90_DEGREE;
        }
        if (intValue == 180) {
            return OFFSET_180_DEGREE;
        }
        if (intValue != 270) {
            return null;
        }
        return OFFSET_270_DEGREE;
    }

    public Integer getOffset() {
        return Integer.valueOf(this.offset);
    }

    public byte getUniqueId() {
        return this.uniqueId;
    }
}
