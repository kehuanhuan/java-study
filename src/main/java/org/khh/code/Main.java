package org.khh.code;

import lombok.extern.slf4j.Slf4j;
import org.khh.code.demo.observer.ObjectFor3D;
import org.khh.code.demo.observer.Observer1;
import org.khh.code.demo.observer.Observer2;
import org.khh.code.demo.strategy.Role;
import org.khh.code.demo.strategy.RoleA;
import org.khh.code.demo.strategy.RunJCTQ;

@Slf4j
public class Main {


    public static void main(String[] args)  {

        Thread t = new Thread(() -> {
            Role roleA = new RoleA("A");

            roleA.setIRunBehavior(new RunJCTQ());

            roleA.run();

        });

        Thread t2 = new Thread(() -> {
            ObjectFor3D objectFor3D = new ObjectFor3D();

            objectFor3D.registerObserver(new Observer1());
            objectFor3D.registerObserver(new Observer2());

            objectFor3D.setMsg("xxx2");
        });

        t.start();
        t2.start();

//        log.info("xx");
    }


}