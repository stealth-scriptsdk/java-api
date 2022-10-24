package de.scriptsdk.api.model.event;

import de.scriptsdk.api.interfaces.event.EventReadable;
import de.scriptsdk.api.model.mobile.io.EventReader;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public final class DrawObjectEvent implements EventReadable {
    private Long id;

    @Override
    public void deserialize(EventReader reader) {
        this.id = reader.readCardinal();
    }
}
