package com.home.designpattern.Strategy;

import com.home.designpattern.designpatterns.Strategy.Adventurer;
import com.home.designpattern.designpatterns.Strategy.NormalAttack;
import com.home.designpattern.designpatterns.Strategy.UseItem;
import com.home.designpattern.designpatterns.Strategy.UseSkill;

import org.junit.Test;

public class FightTest {
    @Test
    public void test() {
        System.out.println("==========策略模式測試==========");

        Adventurer ad = new Adventurer();

        // 史萊姆使用一般攻擊
        System.out.println("出現史萊姆 HP 10/10>>>");
        ad.choiceStrategy(new NormalAttack());
        ad.attack();
        System.out.println("史萊姆受到攻擊，HP-10，史萊姆被消滅了\n");

        // 妖魔使用技能攻擊
        System.out.println("出現妖魔 HP 20/20>>>");
        ad.choiceStrategy(new UseSkill());
        ad.attack();
        System.out.println("妖魔受到攻擊，HP-20，妖魔被消滅了\n");

        // 人形殭屍怕火，使用道具，火把攻擊
        System.out.println("出現人形殭屍，HP 25/25，物理抗性 LV3，怕火屬性攻擊>>>");
        ad.choiceStrategy(new UseItem());
        ad.attack();
        System.out.println("人形殭屍受到火把攻擊，HP-25，人形殭屍被消滅了\n");

        // 遇到藍色特殊史萊姆，使用技能攻擊
        System.out.println("出現藍色史萊姆，HP ?/?>>>");
        ad.choiceStrategy(new UseSkill());
        ad.attack();
        System.out.println("藍色史萊姆毫無損傷，原來是利姆路！！");
        System.out.println("冒險者被利姆路捕食，請重新開始\n");
    }
}
