package ma.enset.comptecqrses.common_api.events;

import lombok.AllArgsConstructor;
import lombok.Getter;

public abstract class BaseEvent<T> {
    @Getter
    private T id;

    public BaseEvent(T id) {
        this.id = id;
    }
}
