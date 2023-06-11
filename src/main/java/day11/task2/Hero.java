package day11.task2;

import static java.lang.String.valueOf;

public class Hero implements Healer,  PhysAttack, MagicAttack{                 // поля Героев матьимагии
    private String heroName;        // поле Имя (тип) героя
    private double health;          // поле здоровья
    private double physDef;         // поле физическая защита
    private double magicDef;        // поле защита магии
    private double physAtt;         // поле физической атаки
    private double magicAtt;        // поле магической атаки
    private double healHimself;     // поле самолечения
    private double healTeammate;    // поле лечения другого персонажа
    public Hero (String nameHero, double health, double physAtt, double magicAtt, double physDef, double magicDef, double healHimself, double healTeammate){
        this.heroName = nameHero;
        this.health = health;
        this.physDef = physDef;
        this.magicDef = magicDef;
        this.physAtt = physAtt;
        this.magicAtt = magicAtt;
        this.healHimself = healHimself;
        this.healTeammate = healTeammate;
    }

    public void setHeroName(String heroName) { this.heroName = heroName; }

    public void setHealth(double health) { this.health = health; }

    public void setPhysDef(double physDef) { this.physDef = physDef; }

    public void setMagicDef(double magicDef) { this.magicDef = magicDef; }

    public void setPhysAtt(double physAtt) { this.physAtt = physAtt; }

    public void setMagicAtt(double magicAtt) { this.magicAtt = magicAtt; }

    public String getHeroName() { return heroName; }

    public double getHealth() { return health; }

    public double getPhysDef() { return physDef; }

    public double getPhysAtt() { return physAtt; }

    public double getMagicAtt() { return magicAtt; }

    public double getMagicDef() { return magicDef; }

    @Override
    public void healHimself() {
        setHealth(getHealth()+healHimself);
        if (getHealth()>100){ setHealth(100);}
    }
    @Override
    public void healTeammate(Hero hero) {
        hero.setHealth(hero.getHealth()+healTeammate);
        if (hero.getHealth()>100){ hero.setHealth(100);}
    }

    @Override
    public void magicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth()-(magicAtt-magicAtt* hero.magicDef/100));
        if (hero.getHealth()<0){ hero.setHealth(0);}
    }

    @Override
    public void physicalAttack(Hero hero) {
        hero.setHealth(hero.getHealth()-(physAtt-physAtt* hero.physDef/100));
        if (hero.getHealth()<0){ hero.setHealth(0);}
    }

    @Override
    public String toString() {
        System.out.println(heroName + "{haelth="+ getHealth()+"}");
        StringBuffer returnString = new StringBuffer(heroName + " "+ getHealth());
        return valueOf(returnString);
    }
}
