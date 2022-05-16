package peaksoft.model;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    @Override
    public String toString() {
        return "I'm a dog ";
    }
}
