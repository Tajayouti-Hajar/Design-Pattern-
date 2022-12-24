package tajayouti.example.aspects;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) //traiter au moment d ex
@Target(ElementType.METHOD) // app uni au metho
public @interface Log {

}
