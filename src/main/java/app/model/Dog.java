package app.model;

import org.springframework.stereotype.Component;

//Наличие исключения проверил:
//Caused by: org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type 'app.model.Animal' available: expected single matching bean but found 2: cat,dog

@Component
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}