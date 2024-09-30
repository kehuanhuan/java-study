package org.khh.code.demo.strategy;

public class Role {

    public String name;

    protected IDefendBehavior defendBehavior;
    protected IDisplayBehavior displayBehavior;
    protected IRunBehavior runBehavior;
    protected IAttackBehavior attackBehavior;

    public Role setDisplayBehavior(IDisplayBehavior iDisplayBehavior) {
        this.displayBehavior = iDisplayBehavior;
        return this;
    }

    public Role setIRunBehavior(IRunBehavior iRunBehavior) {
        this.runBehavior = iRunBehavior;
        return this;
    }

    public Role setAttackBehavior(IAttackBehavior iAttackBehavior) {
        this.attackBehavior = iAttackBehavior;
        return this;
    }

    public Role setIDefendBehavior(IDefendBehavior iDefendBehavior) {
        this.defendBehavior = iDefendBehavior;
        return this;
    }

    public void display() {
        displayBehavior.display();
    }

    public void run() {
        runBehavior.run();
    }

    public void attack() {
        attackBehavior.attack();
    }

    public void defend() {
        defendBehavior.defend();
    }

}
