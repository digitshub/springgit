package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;

public class Emp {

    private Bag bag;
    public Emp (Bag bag)
    {
        super();
        this.bag=bag;
    }

    public Bag getbag() {
        return bag;
    }

    public void setbag(Bag bag) {
        this.bag = bag;
    }

    public void work()
    {
        this.bag.display();
        System.out.println("Working");
    }


}
