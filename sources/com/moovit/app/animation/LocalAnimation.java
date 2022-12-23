package com.moovit.app.animation;

public enum LocalAnimation {
    CAR_DRIVES_CAR(new Animation(r2, "car_drives_car.json")),
    CAR_DRIVES_BG(new Animation(r2, "car_drives_bg.json")),
    CAR_ARRIVES_CAR(new Animation(r2, "car_arrives_car.json")),
    CAR_ARRIVES_BG(new Animation(r2, "car_arrives_bg.json")),
    CAR_BEEP(new Animation(r2, "car_beep_car.json")),
    CAR_FLASH(new Animation(r2, "car_flash_car.json")),
    CAR_UNLOCK(new Animation(r2, "car_unlock_all.json")),
    START_RIDE_CAR(new Animation(r2, "start_ride_car.json")),
    START_RIDE_BG(new Animation(r2, "start_ride_bg.json")),
    CAR_DESTINATION(new Animation(r2, "car_destination_all.json")),
    CAR_AC_FREEZE(new Animation(r2, "car_ac_freeze.json")),
    CAR_AC_HEAT(new Animation(r2, "car_ac_heat.json"));
    
    private final Animation animation;

    private LocalAnimation(Animation animation2) {
        this.animation = animation2;
    }

    public Animation getAnimation() {
        return this.animation;
    }
}
