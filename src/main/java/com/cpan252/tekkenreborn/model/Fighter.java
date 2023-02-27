package com.cpan252.tekkenreborn.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Fighter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    @Max(100)
    private int damagePerHit;
    @Min(1000)
    private int health;
    @DecimalMin(value = "0.1", inclusive = true)
    @DecimalMax(value = "10.0", inclusive = true)
    private BigDecimal resistance;
    private Anime animeFrom;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    public enum Anime {
        ATTACK_ON_TITAN("Attack on Titan"), DEATH_NOTE("Death Note"), BLEACH("Bleach"),
        TOKYO_REVENGERS("Tokyo Revengers"), ONE_PIECE("One Piece"), TEKKEN("Tekken");

        private String title;

        private Anime(String title) {
            this.title = title;
        }

        public String getTitle() {
            return title;
        }
    }
    

}
