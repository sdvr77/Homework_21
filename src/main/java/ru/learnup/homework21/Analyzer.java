package ru.learnup.homework21;

import org.springframework.stereotype.Component;
import ru.learnup.homework21.annotation.LogMethod;
import ru.learnup.homework21.annotation.WorkTime;

import java.util.ResourceBundle;

@Component
public class Analyzer {

    @LogMethod
    @WorkTime
    public void doAnalyze(int var, int randomVar, ResourceBundle resource) {

        if (randomVar > var) {
            System.out.println(resource.getString("more"));
        }
        if (randomVar < var) {
            System.out.println(resource.getString("small"));
        }
        if (randomVar == var) {
            System.out.println(resource.getString("true") + randomVar);
        }
    }
}
