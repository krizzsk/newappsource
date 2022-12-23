package com.tranzmate.moovit.protocol.tripplanner;

public enum MVRelativeDirection {
    Depart(1),
    HardLeft(2),
    Left(3),
    SlightlyLeft(4),
    Continue(5),
    SlightlyRight(6),
    Right(7),
    HardRight(8),
    CircleClockwise(9),
    CircleCounterclockwise(10),
    Elevator(11),
    UturnLeft(12),
    UturnRight(13);
    
    private final int value;

    private MVRelativeDirection(int i) {
        this.value = i;
    }

    public static MVRelativeDirection findByValue(int i) {
        switch (i) {
            case 1:
                return Depart;
            case 2:
                return HardLeft;
            case 3:
                return Left;
            case 4:
                return SlightlyLeft;
            case 5:
                return Continue;
            case 6:
                return SlightlyRight;
            case 7:
                return Right;
            case 8:
                return HardRight;
            case 9:
                return CircleClockwise;
            case 10:
                return CircleCounterclockwise;
            case 11:
                return Elevator;
            case 12:
                return UturnLeft;
            case 13:
                return UturnRight;
            default:
                return null;
        }
    }

    public int getValue() {
        return this.value;
    }
}
