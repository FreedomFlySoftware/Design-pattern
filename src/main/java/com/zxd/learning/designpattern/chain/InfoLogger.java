package com.zxd.learning.designpattern.chain;

/**
 * @Project Design-pattern
 * @Package com.zxd.learning.designpattern.chain
 * @Author：zouxiaodong
 * @Description:
 * @Date:Created in 9:40 2018/2/13.
 */
public class InfoLogger extends AbstractLogger{

    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Info Console::Logger: " + message);
    }
}
