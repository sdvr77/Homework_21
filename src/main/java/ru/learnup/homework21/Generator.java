package ru.learnup.homework21;

import org.springframework.stereotype.Component;
import ru.learnup.homework21.annotation.LogMethod;
import ru.learnup.homework21.annotation.WorkTime;

@Component
public class Generator {

    @LogMethod
    @WorkTime
    public int doGenerateVar () {
        int i = (int) (Math.random() * 1001);
        System.out.println("(" + i + ")");
        return i;
    }
}
