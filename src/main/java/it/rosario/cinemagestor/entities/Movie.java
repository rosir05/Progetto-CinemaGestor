package it.rosario.cinemagestor.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "movies")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    @Column(nullable = false)
    private String title;
    @Column(length = 1000)
    private String description;
    @Column(name = "duration_minutes", nullable = false)
    private Integer durationMinutes;
    @Column(nullable = false)
    private String genre;
    @Column(nullable = false)
    private String director;
    @Column(name = "release_date", nullable = false)
    private LocalDate releaseDate;
}//Movie
