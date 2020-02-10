package com.example;

import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

public class Randomize {

    public static <T> T randomize(Class<T> tClass) {

        PodamFactory factory = new PodamFactoryImpl();
        return factory.manufacturePojo(tClass);
    }
}
