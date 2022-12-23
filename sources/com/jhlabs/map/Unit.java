package com.jhlabs.map;

import java.io.Serializable;
import java.text.NumberFormat;
import java.text.ParseException;

public class Unit implements Serializable {
    public static final int ANGLE_UNIT = 0;
    public static final int AREA_UNIT = 2;
    public static final int LENGTH_UNIT = 1;
    public static final int VOLUME_UNIT = 3;
    public static NumberFormat format = null;
    public static final long serialVersionUID = -6704954923429734628L;
    public String abbreviation;
    public String name;
    public String plural;
    public double value;

    static {
        NumberFormat numberInstance = NumberFormat.getNumberInstance();
        format = numberInstance;
        numberInstance.setMaximumFractionDigits(2);
        format.setGroupingUsed(false);
    }

    public Unit(String str, String str2, String str3, double d) {
        this.name = str;
        this.plural = str2;
        this.abbreviation = str3;
        this.value = d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Unit) || ((Unit) obj).value != this.value) {
            return false;
        }
        return true;
    }

    public String format(double d) {
        return String.valueOf(format.format(d)) + " " + this.abbreviation;
    }

    public double fromBase(double d) {
        return d / this.value;
    }

    public double parse(String str) throws NumberFormatException {
        try {
            return format.parse(str).doubleValue();
        } catch (ParseException e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    public double toBase(double d) {
        return d * this.value;
    }

    public String toString() {
        return this.plural;
    }

    public String format(double d, boolean z) {
        if (!z) {
            return format.format(d);
        }
        return String.valueOf(format.format(d)) + " " + this.abbreviation;
    }

    public String format(double d, double d2, boolean z) {
        if (z) {
            return String.valueOf(format.format(d)) + "/" + format.format(d2) + " " + this.abbreviation;
        }
        return String.valueOf(format.format(d)) + "/" + format.format(d2);
    }

    public String format(double d, double d2) {
        return format(d, d2, true);
    }
}
