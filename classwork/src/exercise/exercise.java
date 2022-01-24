package exercise;

import java.text.BreakIterator;

class SuperMan extends suit{
    public void skill(){
        System.out.println("我是爸爸，我力量超大");
    }
}
class SuperWoman extends suit{
    public void skill(){
        System.out.println("我是媽媽，我會伸縮自如的橡膠拳");
    }
}
class Sister extends suit{
    public void skill(){
        System.out.println("我是姊姊，我會隱身加上防護罩");
    }
}
class Brother extends suit{
    public void skill(){
        System.out.println("我是弟弟，我跑超快");
    }
}
class Baby extends suit{
    public void skill(){
        System.out.println("一一ㄝㄝ喔喔哇哇");
    }
}

public class exercise {
    public static void main(String[] args) {
        SuperMan man = new SuperMan();
        SuperWoman woman = new SuperWoman();
        Sister sister = new Sister();
        Brother brother = new Brother();
        Baby baby = new Baby();
        man.skill();
        man.clothes();
        System.out.println("\n");
        woman.skill();
        woman.clothes();
        System.out.println("\n");
        sister.skill();
        sister.clothes();
        System.out.println("\n");
        brother.skill();
        brother.clothes();
        System.out.println("\n");
        baby.skill();
    }
}