package me.sinu.api.payload;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class IdPayload {

    @XmlElement(name = "id")
    private String id;

}
