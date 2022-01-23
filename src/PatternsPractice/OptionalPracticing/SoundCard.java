package PatternsPractice.OptionalPracticing;

import java.util.Optional;

public class SoundCard {

    private final Optional <USB> usb = Optional.ofNullable(new USB());

    public Optional <USB> getUsb() {
        return this.usb;
    }

    @Override
    public String toString() {
        return "I'm an instance of SoundCard object and I'm implemented by programmer and realized by JVM.";
    }
}
