package org.furkan.marriageuxproject.model;


import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Getter
@Builder
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class WeddingGuest {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Gift gift;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Guest guest;

    private BigDecimal amount;

}
