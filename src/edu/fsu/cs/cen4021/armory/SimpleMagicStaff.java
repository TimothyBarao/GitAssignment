package edu.fsu.cs.cen4021.armory;

/**
 * Created by barao on 2/7/17.
 */
class SimpleMagicStaff extends BasicWeapon implements Weapon{
    SimpleMagicStaff() {
        super(80);
    }

    @Override
    public int hit() {
        return DAMAGE;
    }

    @Override
    public int hit(int armor){
        armor = (int)(armor - (armor * .20));
        int damage = DAMAGE - armor;
        if (damage < 0) {
            return 0;
        }
        return damage;
    }
}
