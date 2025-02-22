package easy.wizards_and_warriors;

class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}


class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (fighter.isVulnerable()) {
            return 6;
        }
        else {
            return 10;
        }
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}


class Wizard extends Fighter {

    private boolean isSpellPrepared = false;

    @Override
    boolean isVulnerable() {
        if (isSpellPrepared) {
            return false;
        }
        return true;
    }

    @Override
    int getDamagePoints(Fighter fighter) {
        if (isSpellPrepared) {
            return 12;
        }
        else {
            return 3;
        }
    }

    void prepareSpell() {
        this.isSpellPrepared = true;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
