package jp.ac.uryukyu.ie.e175759;

public class Enemy extends LivingThing {

    public Enemy (String name, int maximumHP, int attack) {
        super(name, maximumHP,attack);

    }
    @Override
    public void wounded(int damage){
        setHitPoint(getHitPoint() - damage);
        if(getHitPoint() < 1 ){
            setDead(true);
            System.out.printf("モンスター%sは倒れた。\n",getName());
        }
    }
}

