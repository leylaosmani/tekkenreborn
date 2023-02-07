package com.cpan252.tekkenreborn.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Fighter {
    private Long id;
    private String name;
    private final int damagePerHit;
    private final int health;
    private final double resistance;
    private final Anime animeFrom;



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
    // public static Object builder() {
    //     return null;
    //   }

}
