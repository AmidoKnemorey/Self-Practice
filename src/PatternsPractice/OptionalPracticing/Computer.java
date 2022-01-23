package PatternsPractice.OptionalPracticing;

import java.util.Optional;

public class Computer {

    SoundCard soundCard = new SoundCard();
    private final Optional <SoundCard> soundCard1 = Optional.ofNullable(soundCard);

    public void setSoundCard(SoundCard soundCard) {
        this.soundCard = soundCard;
    }

    public Optional<SoundCard> getSoundCard() {
        return this.soundCard1;
    }

    @Override
    public String toString() {
        return "I'm an instance of computer and I'm implemented by programmer and realized by JVM.";
    }
}
