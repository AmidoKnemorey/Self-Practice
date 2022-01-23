package PatternsPractice.OptionalPracticing;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {

        Optional<Computer> optionalComputer = Optional.of(new Computer());  //OptionalObject.ifPresent(do something/lambda);

        String name = optionalComputer.flatMap(Computer::getSoundCard)
                .flatMap(SoundCard::getUsb)
                .map(USB::getVersion)
                .orElse("UNKNOWN");
        System.out.println(name);


        optionalComputer.flatMap(Computer::getSoundCard)
                .flatMap(SoundCard::getUsb)
                .filter(b -> "7.0".equals(b.getVersion()))
                .ifPresent(System.out::println);

        Optional<USB> usb = optionalComputer.flatMap(Computer::getSoundCard).flatMap(SoundCard::getUsb);

    }
}
