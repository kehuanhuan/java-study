package org.khh.code.demo.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RunJCTQ implements IRunBehavior {
    @Override
    public void run() {
        log.info("this is run jcto");
    }
}
