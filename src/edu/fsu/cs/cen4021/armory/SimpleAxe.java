package edu.fsu.cs.cen4021.armory;

/**
 * Created by barao on 2/7/17.
 */
class SimpleAxe extends BasicWeapon implements Weapon{
    SimpleAxe() {
        super(60);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor) {
        if (armor < 20 && armor > 0){
            return DAMAGE;
        }
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
