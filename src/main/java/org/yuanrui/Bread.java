package org.yuanrui;

/**
 * @author yuanrui
 * @email xdyrfree@gmail.com
 * @date 2023/4/16-20:32
 */
public enum Bread {
    WHEAT("我是小麦面包，比较粗纤维"){
        @Override
        public void show() {
            System.out.println(description());
        }
    },
    CARAMEL("我是焦糖面包，甜度适中啊"){
        @Override
        public void show() {
            System.out.println(description());
        }
    },
    CHOCOLATE("我是巧克力面包，很甜！"){
        @Override
        public void show() {
            System.out.println(description());
        }
    };

    private String description;
    private Bread(String description){
        this.description = description;
    }

    public String description(){
        return description;
    }

    //定义一个抽象方法，让每个枚举常量实现
    public abstract void show();
}
