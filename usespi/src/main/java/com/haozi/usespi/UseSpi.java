package com.haozi.usespi;

import com.haozi.spi.Developer;

import java.util.ServiceLoader;

/**
 * 使用SPI
 */
public class UseSpi {
    public ServiceLoader<Developer> serviceLoader = ServiceLoader.load(Developer.class);

    public static void main(String[] args) {
        UseSpi spiClient = new UseSpi();
        Developer dev = spiClient.getDeveloper();
        System.out.println(dev.getPrograme());
    }

    private Developer getDeveloper() {
        Developer lastdev = null;
        for (Developer dev : serviceLoader) {
            System.out.println("out." + dev.getPrograme());
            lastdev = dev;
        }
        if (lastdev == null) {
            System.out.println("why...");
        }
        return lastdev;
    }
}
